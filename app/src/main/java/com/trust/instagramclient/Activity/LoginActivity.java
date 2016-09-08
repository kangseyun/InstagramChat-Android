package com.trust.instagramclient.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.trust.instagramclient.Instagram.InstagramApp;
import com.trust.instagramclient.R;

public class LoginActivity extends AppCompatActivity {
    private InstagramApp app;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        app = new InstagramApp(this, "" ,"" ,"");

        app.authorize();
    }
}
