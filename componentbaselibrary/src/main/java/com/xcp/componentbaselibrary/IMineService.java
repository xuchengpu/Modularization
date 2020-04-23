package com.xcp.componentbaselibrary;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/**
 * Created by 许成谱 on 2019/5/24 19:36.
 * qq:1550540124
 * 热爱生活每一天！
 */
public interface IMineService {
    //启动一个activity
    void launch(Context context, Class target);
    //拿到数据 fragment为例
    Fragment getFragment(FragmentManager fragmentManager, int viewId, Bundle bundle);
}
