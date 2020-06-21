package com.example.hackathonx5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hellowind extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hellowind);
    }

    public void nextWINDopen(View v){
        Intent go = new Intent(".secondActivity");
        startActivity(go);
    }

    public void backWINDopen(View v){
        Intent i=new Intent(this, MainActivityX5.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}
