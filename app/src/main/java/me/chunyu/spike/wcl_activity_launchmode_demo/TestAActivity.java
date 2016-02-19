package me.chunyu.spike.wcl_activity_launchmode_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 测试A
 * Created by wangchenlong on 16/2/17.
 */
public class TestAActivity extends AppCompatActivity {

    private static final String TAG = "DEBUG-WCL: " + TestAActivity.class.getSimpleName();

    @Bind(R.id.main_tv_text) TextView mTvText;
    @Bind(R.id.main_b_jump) Button mBJump;
    @Bind(R.id.main_b_jump_2) Button mBJump2;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);

        mTvText.setText(String.valueOf("Activity A"));
        mBJump.setText(String.valueOf("创建[Activity B]"));
        mBJump.setOnClickListener(v -> {
            startActivity(new Intent(TestAActivity.this, TestBActivity.class));
        });

        mBJump2.setVisibility(View.VISIBLE);
        mBJump2.setText(String.valueOf("创建[Activity C]"));
        mBJump2.setOnClickListener(v -> {
            startActivity(new Intent(TestAActivity.this, TestCActivity.class));
        });
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

        Log.e(TAG, "onDestroy");
    }
}
