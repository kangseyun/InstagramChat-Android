package com.trust.instagramclient.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.trust.instagramclient.Instagram.InstagramApp;
import com.trust.instagramclient.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private InstagramApp app;
    private Button login;

    final String CLIEND_ID = "58ccf8ce4398408193a1155591f2b77c";
    final String SECRET_ID = "ff48eb3f1d9f48d39db30564f3634397";
    final String REDIRT_URL = "http://52.198.121.54:8000/login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    private void init() {
        app = new InstagramApp(this, CLIEND_ID, SECRET_ID, REDIRT_URL);
        layoutBind();
    }

    private void layoutBind() {
        login = (Button) findViewById(R.id.login_btn);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.login_btn:
                //app.authorize();
                Intent i = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);
                break;
        }

    }
}
