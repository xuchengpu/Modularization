package com.xcp.minecomponent;

import android.app.Application;

import com.xcp.componentbaselibrary.IApplication;
import com.xcp.componentbaselibrary.ServiceFactory;

/**
 * Created by 许成谱 on 2019/5/24 19:57.
 * qq:1550540124
 * 热爱生活每一天！
 */
public class MineApplication extends Application implements IApplication {
    private static Application application;

    public static Application getApplication() {
        return application;
    }

    @Override
    public void init(Application application) {
        this.application = this;
        ServiceFactory.getInstance().setMineService(new MineService());
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.application = this;
    }
}
