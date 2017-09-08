package jp.wasabeef.sample;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import com.tencent.smtt.sdk.QbSdk;

/**
 * Created by Administrator on 2017/6/5.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        QbSdk.initX5Environment(this, new QbSdk.PreInitCallback() {
            @Override
            public void onCoreInitFinished() {
                Log.d("MainApplication", "x5 core load success");
                Toast.makeText(MyApplication.this, "x5 core load success", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onViewInitFinished(boolean b) {

            }
        });
    }
}
