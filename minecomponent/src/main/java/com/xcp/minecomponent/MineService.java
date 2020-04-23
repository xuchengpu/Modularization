package com.xcp.minecomponent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.xcp.componentbaselibrary.IMineService;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/**
 * Created by 许成谱 on 2019/5/24 19:49.
 * qq:1550540124
 * 热爱生活每一天！
 */
public class MineService implements IMineService {
    @Override
    public void launch(Context context, Class target) {
        Intent intent = new Intent(context, MineActivity.class);
        context.startActivity(intent);
    }

    @Override
    public Fragment getFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        Fragment fragment = new MineFragment();
        fragment.setArguments(bundle);
        fragmentManager.beginTransaction().add(viewId, fragment).commit();
        return fragment;
    }
}
