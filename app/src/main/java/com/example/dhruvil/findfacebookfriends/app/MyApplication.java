package com.example.dhruvil.findfacebookfriends.app;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.login.widget.LoginButton;


public class MyApplication extends Application{



    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
    }

}
