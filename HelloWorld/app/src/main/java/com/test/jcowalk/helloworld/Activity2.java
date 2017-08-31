package com.test.jcowalk.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {


    TextView text1;
    public static final String extraKey = "screen1_value";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    @Override
    protected void onResume() {
        super.onResume();
        text1 = (TextView) findViewById(R.id.textbox);
        String text = getIntent().getStringExtra(MainActivity.extraKey);
        if (TextUtils.isEmpty(text)){
            text = "No text entered";
        }
        text1.setText(text);
    }
}
