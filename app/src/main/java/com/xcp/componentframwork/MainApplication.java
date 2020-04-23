package com.xcp.componentframwork;

import android.app.Application;

import com.xcp.componentbaselibrary.AppConfig;
import com.xcp.componentbaselibrary.IApplication;

/**
 * Created by 许成谱 on 2019/5/24 19:52.
 * qq:1550540124
 * 热爱生活每一天！
 */
public class MainApplication extends Application implements IApplication {
    private static Application mApplication;

    public static Application getApplication() {
        return mApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
        init(this);
    }

    @Override
    public void init(Application application) {
        for (String applicationName : AppConfig.applications) {
            try {
                Class<?> appication = Class.forName(applicationName);
                IApplication instance = (IApplication) appication.newInstance();
                instance.init(application);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
