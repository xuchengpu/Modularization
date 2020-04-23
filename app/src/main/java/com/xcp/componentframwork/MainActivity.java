package com.xcp.componentframwork;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.xcp.componentbaselibrary.ILoginService;
import com.xcp.componentbaselibrary.IMineService;
import com.xcp.componentbaselibrary.ServiceFactory;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnLogin;
    private Button btnMine;
    private Button btnFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = findViewById(R.id.btn_login);
        btnMine = findViewById(R.id.btn_mine);
        btnFragment = findViewById(R.id.btn_getFragment);
        btnLogin.setOnClickListener(this);
        btnMine.setOnClickListener(this);
        btnFragment.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btnLogin) {
            ILoginService loginService = ServiceFactory.getInstance().getLoginService();
            if (loginService != null) {
                loginService.launch(this, null);
            }
        } else if (v == btnMine) {
            IMineService mineService = ServiceFactory.getInstance().getMineService();
            if (mineService != null) {
                mineService.launch(this, null);
            }
        } else if (v == btnFragment) {
            ServiceFactory.getInstance().getMineService().getFragment(getSupportFragmentManager(), R.id.fl_container, null);
        }
    }
}
