package com.example.os.myapplication5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class IntentDemo2 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_demo2);
    }
    public void upper(View v){
        Intent intent = getIntent();
        intentresult.puExtra("result",value);
        setResult(RESULT_OK,intentresult);
        finish();
    }
}
