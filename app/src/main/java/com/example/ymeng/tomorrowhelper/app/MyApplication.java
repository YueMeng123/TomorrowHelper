package com.example.ymeng.tomorrowhelper.app;

import android.app.Application;

public class MyApplication extends Application {
    private static MyApplication instance;
    public static MyApplication getInstance() {
        return instance;
    }

}
