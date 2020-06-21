package com.example.hackathonx5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class openNowCase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_now_case);
    }

    public void backWINDopen(View v){
        Intent go = new Intent(".opencase");
        startActivity(go);
    }

    public void openCase(View v){
        Intent go = new Intent(".openCaseMagic");
        startActivity(go);
    }
}
