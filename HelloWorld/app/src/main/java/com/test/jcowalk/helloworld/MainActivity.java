package com.test.jcowalk.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText text1;
    public static final String extraKey = "screen1_value";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  openScreen2(View view){
        text1 = (EditText) findViewById(R.id.edit_text);
        String text = text1.getText().toString();
        Intent intent = new Intent("com.test.jcowalk.ACTIVITY2");
        intent.putExtra(extraKey, text);
        startActivity(intent);
    }
}
