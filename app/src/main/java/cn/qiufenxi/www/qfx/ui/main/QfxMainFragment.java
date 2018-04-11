package cn.qiufenxi.www.qfx.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hb.utils.engine.observable.MessageObservable;
import com.hb.utils.modle.login.Passport;
import com.hb.utils.tools.DBUtils;
import com.hb.utils.view.Buttom_button;
import com.hb.utils.view.activity.FragmentContainerActivity;
import com.hb.utils.view.fragment.BaseFragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.qiufenxi.www.qfx.R;
import cn.qiufenxi.www.qfx.ui.CenterFragment;
import cn.qiufenxi.www.qfx.ui.ExamineDataFragment;

public class QfxMainFragment extends BaseFragment {
    private List<Buttom_button> buttons = new ArrayList<>();
    private Map<Integer, BaseFragment> fragments = new HashMap<>(3);
    private int currentFragmentIndex = -1;
    private static QfxMainFragment hjkMainFragment;
    private TextView badgeVie;

    public static QfxMainFragment getInstance() {
        return hjkMainFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    protected void initView() {
        Buttom_button button_1, button_2, button_3, button_4;
        button_1 = (Buttom_button) getView().findViewById(R.id.button_1);
        button_2 = (Buttom_button) getView().findViewById(R.id.button_2);
        button_3 = (Buttom_button) getView().findViewById(R.id.button_3);
        badgeVie = (TextView) getView().findViewById(R.id.badgeVie);

        buttons.add(button_1);
        buttons.add(button_2);
        buttons.add(button_3);

        BaseFragment fragment = (BaseFragment) getChildFragmentManager().findFragmentById(R.id.fragment_1);
        fragments.put(0, fragment);
    }

    @Override
    protected void initData() {
        hjkMainFragment = this;

        //观察未读消息总数
//        MessageObservable.getInstance().addObserver(this);
//        MessageObservable.getInstance().getMessageCount();
    }

    public Map<Integer, BaseFragment> getFragmentArray() {
        return fragments;
    }

    /**
     * 修改显示页
     *
     * @param i
     */
    public void changePage(int i) {
        if (buttons == null || buttons.size() < 1) {
            return;
        }
        if (i < 0 || i > buttons.size()) {
            return;
        }


        if (i == 1) {

        }

        setCurrentFragment(i);
        buttons.get(i).setChecked();
        for (int a = 0; a < buttons.size(); a++) {
            if (a == i) {
                buttons.get(a).setChecked(true);
            } else {
                buttons.get(a).setChecked(false);
            }
        }
    }

    /**
     * 设置当前显示的fragment
     *
     * @param index
     */
    private void setCurrentFragment(int index) {
//        if (index == 0) {
//            AnalyticsManager.getInstance(MyApplication.getAppContext()).click(EventEnum.homebutton);
//        } else if (index == 1) {
//            AnalyticsManager.getInstance(MyApplication.getAppContext()).click(EventEnum.mydoctorbutton);
//        } else {
//            AnalyticsManager.getInstance(MyApplication.getAppContext()).click(EventEnum.minebutton);
//        }

        // 拒绝重复点击
        if (index != currentFragmentIndex) {
            FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
            for (int i = 0; i < buttons.size(); i++) {
                if (fragments.get(i) != null && i != index) {
                    beginTransaction.hide(fragments.get(i));
                }
            }

            BaseFragment fragment = fragments.get(index);
            if (fragment == null) {
                if (index == 1) {
                    fragment = (BaseFragment) getChildFragmentManager().findFragmentByTag(ExamineDataFragment.class.getName());
                    if (fragment == null) {
                        fragment = new ExamineDataFragment();
                        beginTransaction.add(R.id.fragment_patent, fragment, ExamineDataFragment.class.getName());
                    }
                } else {
                    fragment = (BaseFragment) getChildFragmentManager().findFragmentByTag(CenterFragment.class.getName());
                    if (fragment == null) {
                        fragment = new CenterFragment();
                        beginTransaction.add(R.id.fragment_patent, fragment, CenterFragment.class.getName());
                    }
                }
                fragments.put(index, fragment);
            }

            beginTransaction.show(fragments.get(index)).commitAllowingStateLoss();
            getChildFragmentManager().executePendingTransactions();
            // 当前显示出来的fragment
            currentFragmentIndex = index;
        }
    }
    @Override
    protected void initListener() {
        setButtomListener();
        changePage(0);
    }
    /**
     * 设置底部按钮事件
     */
    private void setButtomListener() {
        for (int i = 0; i < buttons.size(); i++) {
            final Buttom_button buttom_button = buttons.get(i);
            buttom_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    changePage(buttons.indexOf(v));
                }
            });
        }
    }
}
