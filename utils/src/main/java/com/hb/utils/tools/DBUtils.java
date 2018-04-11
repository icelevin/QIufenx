package com.hb.utils.tools;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.hb.utils.BaseApplication;
import com.hb.utils.common.ConstUtils;
import com.hb.utils.dao.CacheModleDao;
import com.hb.utils.dao.DaoMaster;
import com.hb.utils.dao.DaoSession;
import com.hb.utils.dao.SearchItemModelDao;
import com.hb.utils.dao.UserDao;
import com.hb.utils.dao.UserInfoDao;
import com.hb.utils.modle.CacheModle;
import com.hb.utils.modle.SearchItemModel;
import com.hb.utils.modle.User;
import com.hb.utils.modle.UserInfo;
import com.hb.utils.modle.login.Passport;
import com.hb.utils.modle.login.Token;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

/**
 * Created by txl on 2017/2/17 0017.
 */
public class DBUtils {

    /**
     * 获取数据库操作类
     * @return
     */
    public static DaoSession getDaoSession(){
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(BaseApplication.getAppContext(), "hbjkt.db", null);
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDb());

        if(ConstUtils.getInstance().isDebug()){
            //数据库查询日志
            QueryBuilder.LOG_SQL = true;
            QueryBuilder.LOG_VALUES = true;
        }

        return daoMaster.newSession();
    }

    /**
     * 根据url与指定的javabean类型获取缓存在数据库中的缓存对象
     * @param url
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> T getCache(String url,Class<T> tClass){
        T jsonBean = null;

        LogUtils.print(DBUtils.class.getName(), "获取缓存 url="+url);

        try{
            CacheModleDao dao = getDaoSession().getCacheModleDao();
            CacheModle unique = dao.queryBuilder().where(CacheModleDao.Properties.Url.eq(url)).build().unique();
            if(unique == null || TextUtils.isEmpty(unique.getResponse())){
                return jsonBean;
            }

            Gson gson = new Gson();
            jsonBean = gson.fromJson(unique.getResponse(), tClass);
        }catch (Exception e){
            e.printStackTrace();
        }

        LogUtils.print(DBUtils.class.getName(),"获取缓存结果 jsonBean="+jsonBean);
        return jsonBean;
    }

    /**
     * 保存缓存数据
     */
    public static void saveCache(CacheModle modle){
        if(modle == null || TextUtils.isEmpty(modle.getUrl()) || TextUtils.isEmpty(modle.getResponse())){
            return;
        }

        LogUtils.print(DBUtils.class.getName(),"保存缓存 CacheModle="+modle);

        try{
            CacheModleDao dao = getDaoSession().getCacheModleDao();
            dao.insertOrReplace(modle);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void saveToken(Token token){
        getDaoSession().getTokenDao().deleteAll();
        getDaoSession().getTokenDao().insert(token);
    }

    public static Token getToken(){
        return getDaoSession().getTokenDao().queryBuilder().build().unique();
    }

    public static void savePassport(Passport passport){
        getDaoSession().getPassportDao().deleteAll();
        getDaoSession().getPassportDao().insert(passport);
    }

    public static Passport getPassport(){
        return getDaoSession().getPassportDao().queryBuilder().build().unique();
    }

    public static void exit(){
        getDaoSession().getPassportDao().deleteAll();
    }

//    public static User getLoginUser(){
//        return getDaoSession().getUserDao().queryBuilder().where(UserDao.Properties.IsLogin.eq(true)).build().unique();
//    }
    /**
     * 获取已登录用户
     * @return
     */
//    public static User getLoginUser(UserDao userDao){
//        return userDao.queryBuilder().where(UserDao.Properties.IsLogin.eq(true)).build().unique();
//    }

//    public static void saveLoginUser(User user){
//        UserDao userDao = getDaoSession().getUserDao();
//
//
//        //首先去掉可能旧登录的用户状态
//        User loginUser = getLoginUser(userDao);
//        if(loginUser != null){
//            loginUser.setLogin(false);
//            userDao.update(loginUser);
//        }
//        //然后为新登录的用户保存数据
//        //成功，设置状态为已登录
//        user.setLogin(true);
//        //判断是不是登录过
//        User unique = userDao.queryBuilder().where(UserDao.Properties.PassportId.eq(user.getPassportId())).build().unique();
//        if(unique == null){
//            //插入数据到数据库
//            userDao.insert(user);
//        }else{
//            //修改数据
//            userDao.update(user);
//        }
//    }

    /**
     * 获取详细信息
     * @return
     */
    public static UserInfo getUserInfo(){
        DaoSession daoSession = getDaoSession();
        UserInfoDao userInfoDao = daoSession.getUserInfoDao();

        Passport passport = getPassport();
        if(passport == null){
            return null;
        }

       try{
          UserInfo userInfo = userInfoDao.queryBuilder().where(UserInfoDao.Properties.PassportId.eq(passport.getPassportId())).build().unique();

           //测试api
//           doctorInfo.setId("880c740d-6916-4ae0-86f1-a66001355009");
//           //测试动态发布
//           doctorInfo.setId("0122e83c-a6cb-b20b-4c67-e215172baa5d");
           return userInfo;
       }catch (Exception e){
            e.printStackTrace();
       }
        return null;
    }

    /**
     * 保存用户详细信息
     * @param userInfo
     */
    public static void saveUserInfo(UserInfo userInfo){
        DaoSession daoSession = getDaoSession();
        UserInfoDao userInfoDao = daoSession.getUserInfoDao();

        //判断是否存在
        UserInfo unique = userInfoDao.queryBuilder().where(UserInfoDao.Properties.PassportId.eq(userInfo.getPassportId())).build().unique();
        if(unique == null){
            userInfoDao.insert(userInfo);
        }else{
            userInfoDao.update(userInfo);
        }
    }

    /**
     * 存储搜索词
     * @param text
     * @param type   搜索类型
     */
    public static void saveSearchItem(String text,int type){
        DaoSession daoSession = getDaoSession();
        SearchItemModelDao searchItemModelDao = daoSession.getSearchItemModelDao();

        SearchItemModel model = new SearchItemModel();
        model.setText(text);
        model.setType(type);

        //判断是否存在
        SearchItemModel unique = searchItemModelDao.queryBuilder().where(SearchItemModelDao.Properties.Text.eq(text), SearchItemModelDao.Properties.Type.eq(type)).build().unique();
        if(unique != null){
            searchItemModelDao.delete(unique);
        }
        searchItemModelDao.insert(model);
    }

    /**
     * 获取搜索词
     * @param type
     */
    public static List<SearchItemModel> getSearchItem(int type){
        DaoSession daoSession = getDaoSession();
        SearchItemModelDao searchItemModelDao = daoSession.getSearchItemModelDao();

        List<SearchItemModel> list = searchItemModelDao.queryBuilder().where(SearchItemModelDao.Properties.Type.eq(type)).orderDesc(SearchItemModelDao.Properties.Id).build().list();

        if(list != null && list.size() > 5){
            List<SearchItemModel> remList = list.subList(5,list.size());
            searchItemModelDao.deleteInTx(remList);
            list = list.subList(0,5);
        }
        return list;
    }

    /**
     * 删除指定的一条搜索记录
     * @param model
     */
    public static void delSearchItem(SearchItemModel model){
        DaoSession daoSession = getDaoSession();
        SearchItemModelDao searchItemModelDao = daoSession.getSearchItemModelDao();
        searchItemModelDao.delete(model);
    }

    /**
     * 删除所有的搜索记录
     */
    public static void remAllSearchItem(int type){
        DaoSession daoSession = getDaoSession();
        SearchItemModelDao searchItemModelDao = daoSession.getSearchItemModelDao();
                String sql = "DELETE FROM "+searchItemModelDao.getTablename()+" WHERE type="+type;
        daoSession.getDatabase().execSQL(sql);
    }
}
