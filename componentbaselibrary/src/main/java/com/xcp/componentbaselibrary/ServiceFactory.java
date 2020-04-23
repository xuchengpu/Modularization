package com.xcp.componentbaselibrary;

/**
 * Created by 许成谱 on 2019/5/24 19:38.
 * qq:1550540124
 * 热爱生活每一天！
 */
public class ServiceFactory {
    private static ServiceFactory instance;
    private ILoginService loginService;
    private IMineService mineService;
    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        if (instance == null) {
            synchronized (ServiceFactory.class) {
                if (instance == null) {
                    instance = new ServiceFactory();
                }
            }
        }
        return instance;
    }

    public ILoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(ILoginService loginService) {
        this.loginService = loginService;
    }

    public IMineService getMineService() {
        return mineService;
    }

    public void setMineService(IMineService mineService) {
        this.mineService = mineService;
    }
}
