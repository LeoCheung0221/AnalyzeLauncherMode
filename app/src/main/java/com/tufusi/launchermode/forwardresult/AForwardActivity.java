package com.tufusi.launchermode.forwardresult;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.tufusi.launchermode.R;

/**
 * Created by 鼠夏目 on 2020/8/28.
 *
 * @author 鼠夏目
 * @description
 */
public class AForwardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, BForwardActivity.class);
        startActivityForResult(intent, 100);
    }

    @Override
    protected void onActivityResult(int arg0, int arg1, Intent arg2) {
        super.onActivityResult(arg0, arg1, arg2);
        if (arg2 != null) {
            Log.e("yanru", "requestCode=" + arg0 + ",resultCode=" + arg1 + ",data=" + arg2.getIntExtra("a", 8));
        }
    }
} 