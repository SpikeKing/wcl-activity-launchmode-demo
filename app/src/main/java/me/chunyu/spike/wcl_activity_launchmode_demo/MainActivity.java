package me.chunyu.spike.wcl_activity_launchmode_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "DEBUG-WCL: " + MainActivity.class.getSimpleName();

    private static int sCount;

    @Bind(R.id.main_b_myself) Button mBMyself; // 跳转自己
    @Bind(R.id.main_b_test_a) Button mBTestA; // 跳转测试A

    @Bind(R.id.main_tv_count) TextView mTvCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        sCount++;

        mTvCount.setText(String.valueOf("当前示例: " + sCount));

        // 不断创建自己的实例
        mBMyself.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, MainActivity.class));
        });

        // 测试类A
        mBTestA.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, TestAActivity.class));
        });

        Log.e(TAG, "onCreate");
    }

    @Override protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        Log.e(TAG, "onNewIntent");
    }

    @Override protected void onStart() {
        super.onStart();

        Log.e(TAG, "onStart");
    }

    @Override protected void onResume() {
        super.onResume();

        Log.e(TAG, "onResume");
    }

    @Override protected void onPause() {
        super.onPause();

        Log.e(TAG, "onPause");
    }

    @Override protected void onStop() {
        super.onStop();

        Log.e(TAG, "onStop");
    }

    @Override protected void onDestroy() {
        super.onDestroy();
        sCount--;

        Log.e(TAG, "onDestroy");
    }
}
