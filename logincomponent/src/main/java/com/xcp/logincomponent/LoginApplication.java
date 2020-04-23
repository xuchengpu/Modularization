package com.xcp.logincomponent;

import android.app.Application;

import com.xcp.componentbaselibrary.IApplication;
import com.xcp.componentbaselibrary.ServiceFactory;

/**
 * Created by 许成谱 on 2019/5/24 19:58.
 * qq:1550540124
 * 热爱生活每一天！
 */
public class LoginApplication extends Application implements IApplication {
    private static Application application;

    public static Application getApplication() {
        return application;
    }

    @Override
    public void init(Application application) {
        this.application = this;
        ServiceFactory.getInstance().setLoginService(new LoginService());
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.application = this;
    }
}
