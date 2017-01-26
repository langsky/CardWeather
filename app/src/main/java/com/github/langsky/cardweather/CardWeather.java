package com.github.langsky.cardweather;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.github.langsky.cardweather.bean.DaoMaster;
import com.github.langsky.cardweather.bean.DaoSession;
import com.github.langsky.cardweather.dao.UpgradeHelper;

/**
 * Created by swd1 on 17-1-26.
 */

public class CardWeather extends Application {

    public static CardWeather instance;
    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    /*
     * GreenDao相关
     */
    public synchronized DaoSession getDaoSession() {
        if (daoSession == null) {
            initDaoSession();
        }
        return daoSession;
    }


    private void initDaoSession() {
        // 相当于得到数据库帮助对象，用于便捷获取db
        // 这里会自动执行upgrade的逻辑.backup all table→del all table→create all new table→restore data
        UpgradeHelper helper = new UpgradeHelper(this, "greendao.db", null);
        // 得到可写的数据库操作对象
        SQLiteDatabase db = helper.getWritableDatabase();
        // 获得Master实例,相当于给database包装工具
        DaoMaster daoMaster = new DaoMaster(db);
        // 获取类似于缓存管理器,提供各表的DAO类
        daoSession = daoMaster.newSession();
    }
}
