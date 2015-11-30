package com.example.dhruvil.findfacebookfriends;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.login.widget.LoginButton;

/**
 * Created by dhruvil on 30-11-2015.
 */
public class MyApplication extends Application{



    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());



    }

}
