package com.hb.utils.view.recycler.view;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 支持上拉加载更多的RecyclerView
 * 
 * @author qian
 * 
 */
public class LoadMoreRecyclerView extends RecyclerView {
	/**
	 * item 类型
	 */
	public final static int TYPE_NORMAL = 0x10001;
	public final static int TYPE_HEADER = 0x10002;// 头部--支持头部增加一个headerView
	public final static int TYPE_FOOTER = 0x10003;// 底部--往往是loading_more
	public final static int TYPE_LIST = 0x10004;// 代表item展示的模式是list模式
	public final static int TYPE_STAGGER = 0x10005;// 代码item展示模式是网格模式

	private boolean mIsFooterEnable = true;// 是否允许加载更多

	private Adapter recycleAdapter;

	/**
	 * 自定义实现了头部和底部加载更多的adapter
	 */
	private AutoLoadAdapter mAutoLoadAdapter;
	/**
	 * 标记是否正在加载更多，防止再次调用加载更多接口
	 */
	private boolean mIsLoadingMore;
	/**
	 * 标记加载更多的position
	 */
	private int mLoadMorePosition;
	/**
	 * 加载更多的监听-业务需要实现加载数据
	 */
	private LoadMoreListener mListener;

	private RecyclerFootView footView = new RecyclerFootView(getContext());

	public LoadMoreRecyclerView(Context context) {
		super(context);
		init();
	}

	public LoadMoreRecyclerView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public LoadMoreRecyclerView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}


	/**
	 * 初始化-添加滚动监听
	 * <p/>
	 * 回调加载更多方法，前提是
	 * 
	 * <pre>
	 *    1、有监听并且支持加载更多：null != mListener && mIsFooterEnable
	 *    2、目前没有在加载，正在上拉（dy>0），当前最后一条可见的view是否是当前数据列表的最好一条--及加载更多
	 * </pre>
	 */
	private void init() {
		footView.setLoadMoreListener(new LoadMoreListener() {
			@Override
			public void onLoadMore() {
				if(mListener != null){
					mListener.onLoadMore();
				}
			}
		});
		
		super.addOnScrollListener(new OnScrollListener() {

			@Override
			public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
				super.onScrollStateChanged(recyclerView, newState);
			}

			@Override
			public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
				super.onScrolled(recyclerView, dx, dy);
				if(dx == 0 && dy == 0){
					//在顶端且显示出来的最后一条等于所有条目的个数，说明数据不够一页，隐藏footView
					if(getLastVisiblePosition()+1 == getAdapter().getItemCount()){
						boolean canScrollVertically = isNestedScrollingEnabled();
						if(canScrollVertically){
							footView.setVisibility(View.GONE);
						}
					}
				}
				else if (null != mListener && dy > 0) {
					int lastVisiblePosition = getLastVisiblePosition();
					if (lastVisiblePosition + 1 == mAutoLoadAdapter.getItemCount()) {
						mLoadMorePosition = lastVisiblePosition;
						if(mIsFooterEnable && !mIsLoadingMore){
							setLoadingMore(true);
							footView.showloading();
							mListener.onLoadMore();
						}
					}
				}
			}
		});
	}

	public Adapter getRecyclerAdapter(){
		return recycleAdapter;
	}

	/**
	 * 设置加载更多的监听
	 * 
	 * @param listener
	 */
	public void setLoadMoreListener(LoadMoreListener listener) {
		mListener = listener;
	}

	/**
	 * 设置正在加载更多
	 * 
	 * @param loadingMore
	 */
	public void setLoadingMore(boolean loadingMore) {
		this.mIsLoadingMore = loadingMore;
	}

	/**
	 * 加载更多监听
	 */
	public interface LoadMoreListener {
		/**
		 * 加载更多
		 */
		void onLoadMore();
	}

	public void setError(String type) {

	}

	/**
	 *
	 */
	public class AutoLoadAdapter extends Adapter<ViewHolder> {

		/**
		 * 数据adapter
		 */
		private Adapter mInternalAdapter;

		private boolean mIsHeaderEnable;
		private int mHeaderResId;

		public AutoLoadAdapter(Adapter adapter) {
			mInternalAdapter = adapter;
			mIsHeaderEnable = false;
		}

		@Override
		public int getItemViewType(int position) {
			int headerPosition = 0;
			int footerPosition = 0;
			// if(mIsFooterEnable){
			footerPosition = getItemCount() - 1;
			// }else{
			// footerPosition = getItemCount();
			// }

			if (headerPosition == position && mIsHeaderEnable && mHeaderResId > 0) {
				return TYPE_HEADER;
			}
			// System.out.println("footerPosition="+footerPosition+",position="+position);
			if (footerPosition == position) {
				return TYPE_FOOTER;
			}
			return  getRecyclerAdapter().getItemViewType(position);

			/**
			 * 这么做保证layoutManager切换之后能及时的刷新上对的布局
			 */
//			if (getLayoutManager() instanceof LinearLayoutManager) {
//				//return TYPE_LIST;
//				return getRecyclerAdapter().getItemViewType(position);
//			} else if (getLayoutManager() instanceof StaggeredGridLayoutManager) {
//				return TYPE_STAGGER;
//			} else {
//				return TYPE_NORMAL;
//			}
		}

		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			if (viewType == TYPE_HEADER) {
				return new HeaderViewHolder(LayoutInflater.from(parent.getContext()).inflate(mHeaderResId, parent, false));
			}
			if (viewType == TYPE_FOOTER) {
				if (mIsFooterEnable) {
					footView.showDef();
				}
				return new HeaderViewHolder(footView);
			} else { // type normal
				return mInternalAdapter.onCreateViewHolder(parent, viewType);
			}
		}

		public class FooterViewHolder extends ViewHolder {

			public FooterViewHolder(View itemView) {
				super(itemView);
			}
		}

		public class HeaderViewHolder extends ViewHolder {
			public HeaderViewHolder(View itemView) {
				super(itemView);
			}
		}

		@Override
		public void onBindViewHolder(ViewHolder holder, int position) {
			int type = getItemViewType(position);
			if (type != TYPE_FOOTER && type != TYPE_HEADER) {
				mInternalAdapter.onBindViewHolder(holder, position);
			}
		}

		/**
		 * 需要计算上加载更多和添加的头部俩个
		 * 
		 * @return
		 */
		@Override
		public int getItemCount() {
			int count = mInternalAdapter.getItemCount();
			// if (mIsFooterEnable)
			// count++;
			// if (mIsHeaderEnable)
			// count++;
			return ++count;
		}

		public void setHeaderEnable(boolean enable) {
			mIsHeaderEnable = enable;
		}

		public void addHeaderView(int resId) {
			mHeaderResId = resId;
		}
	}

	@Override
	public void setAdapter(Adapter adapter) {
		if (adapter != null) {
			recycleAdapter = adapter;
			mAutoLoadAdapter = new AutoLoadAdapter(adapter);
		}
		super.swapAdapter(mAutoLoadAdapter, true);
	}

	/**
	 * 切换layoutManager
	 * 
	 * 为了保证切换之后页面上还是停留在当前展示的位置，记录下切换之前的第一条展示位置，切换完成之后滚动到该位置
	 * 另外切换之后必须要重新刷新下当前已经缓存的itemView，否则会出现布局错乱（俩种模式下的item布局不同），
	 * RecyclerView提供了swapAdapter来进行切换adapter并清理老的itemView cache
	 * 
	 * @param layoutManager
	 */
	public void switchLayoutManager(LayoutManager layoutManager) {
		int firstVisiblePosition = getFirstVisiblePosition();
		// getLayoutManager().removeAllViews();
		setLayoutManager(layoutManager);
		// super.swapAdapter(mAutoLoadAdapter, true);
		getLayoutManager().scrollToPosition(firstVisiblePosition);
	}

	/**
	 * 获取第一条展示的位置
	 * 
	 * @return
	 */
	private int getFirstVisiblePosition() {
		int position;
		if (getLayoutManager() instanceof LinearLayoutManager) {
			position = ((LinearLayoutManager) getLayoutManager()).findFirstVisibleItemPosition();
		} else if (getLayoutManager() instanceof GridLayoutManager) {
			position = ((GridLayoutManager) getLayoutManager()).findFirstVisibleItemPosition();
		} else if (getLayoutManager() instanceof StaggeredGridLayoutManager) {
			StaggeredGridLayoutManager layoutManager = (StaggeredGridLayoutManager) getLayoutManager();
			int[] lastPositions = layoutManager.findFirstVisibleItemPositions(new int[layoutManager.getSpanCount()]);
			position = getMinPositions(lastPositions);
		} else {
			position = 0;
		}
		return position;
	}

	/**
	 * 获得当前展示最小的position
	 * 
	 * @param positions
	 * @return
	 */
	private int getMinPositions(int[] positions) {
		int size = positions.length;
		int minPosition = Integer.MAX_VALUE;
		for (int i = 0; i < size; i++) {
			minPosition = Math.min(minPosition, positions[i]);
		}
		return minPosition;
	}

	/**
	 * 获取最后一条展示的位置
	 * 
	 * @return
	 */
	private int getLastVisiblePosition() {
		int position;
		if (getLayoutManager() instanceof LinearLayoutManager) {
			position = ((LinearLayoutManager) getLayoutManager()).findLastVisibleItemPosition();
		} else if (getLayoutManager() instanceof GridLayoutManager) {
			position = ((GridLayoutManager) getLayoutManager()).findLastVisibleItemPosition();
		} else if (getLayoutManager() instanceof StaggeredGridLayoutManager) {
			StaggeredGridLayoutManager layoutManager = (StaggeredGridLayoutManager) getLayoutManager();
			int[] lastPositions = layoutManager.findLastVisibleItemPositions(new int[layoutManager.getSpanCount()]);
			position = getMaxPosition(lastPositions);
		} else {
			position = getLayoutManager().getItemCount() - 1;
		}
		return position;
	}

	/**
	 * 获得最大的位置
	 * 
	 * @param positions
	 * @return
	 */
	private int getMaxPosition(int[] positions) {
		int size = positions.length;
		int maxPosition = Integer.MIN_VALUE;
		for (int i = 0; i < size; i++) {
			maxPosition = Math.max(maxPosition, positions[i]);
		}
		return maxPosition;
	}

	/**
	 * 添加头部view
	 * 
	 * @param resId
	 */
	public void addHeaderView(int resId) {
		mAutoLoadAdapter.addHeaderView(resId);
	}

	/**
	 * 设置头部view是否展示
	 * 
	 * @param enable
	 */
	public void setHeaderEnable(boolean enable) {
		mAutoLoadAdapter.setHeaderEnable(enable);
	}

	/**
	 * 设置是否支持自动加载更多
	 * 
	 * @param autoLoadMore
	 */
	public void setAutoLoadMoreEnable(boolean autoLoadMore) {
		mIsFooterEnable = autoLoadMore;
	}

	/**
	 * 通知更多的数据已经加载
	 * 
	 * 每次加载完成之后添加了Data数据，用notifyItemRemoved来刷新列表展示，
	 * 而不是用notifyDataSetChanged来刷新列表
	 * 
	 * @param hasMore
	 * @param isError
	 *            加载中是否出现了错误
	 * @param state
	 *            当前状态描述
	 */
	public void notifyMoreFinish(boolean hasMore, boolean isError, String state) {
		setAutoLoadMoreEnable(hasMore);
		if (hasMore) {
			if (isError) {
				// 出现了错误
				footView.showError(state, hasMore);
			} else {
				if (mLoadMorePosition == 0) {

				} else {

				}
				footView.showDef();
			}
		} else {
			// 或者没有更多数据了
			footView.showError(state, hasMore);
		}
		mIsLoadingMore = false;
	}
}