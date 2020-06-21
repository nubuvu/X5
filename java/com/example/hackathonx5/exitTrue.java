package com.example.hackathonx5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class exitTrue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit_true);
    }

    public void openCase(View v){
        Intent go = new Intent(".openCaseMagic");
        startActivity(go);
    }

    public void exitCase(View v){
        Intent go = new Intent(".opencase");
        startActivity(go);
    }

}
