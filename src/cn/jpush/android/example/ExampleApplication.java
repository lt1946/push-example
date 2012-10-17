package cn.jpush.android.example;

import android.app.Application;
import android.util.Log;
import cn.jpush.android.api.JPushInterface;

/**
 * For developer startup JPush SDK
 * 
 */
public class ExampleApplication extends Application {
    private static final String TAG = "ExampleApplication";

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate");
        super.onCreate();

        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);

     
    }
}
