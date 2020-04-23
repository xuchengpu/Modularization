package com.xcp.logincomponent;

import android.content.Context;
import android.content.Intent;

import com.xcp.componentbaselibrary.ILoginService;

/**
 * Created by 许成谱 on 2019/5/24 19:46.
 * qq:1550540124
 * 热爱生活每一天！
 */
public class LoginService implements ILoginService {
    @Override
    public void launch(Context context, Class target) {
        Intent intent = new Intent(context,LoginActivity.class);
        context.startActivity(intent);
    }
}
