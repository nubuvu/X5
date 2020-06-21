package com.example.hackathonx5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class catigories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catigories);
    }

    public void backWINDopen(View v){
        Intent go = new Intent(".secondActivity");
        startActivity(go);
    }

    public void opencoffeandtea(View v){
        Intent go = new Intent(".coffeandtea");
        startActivity(go);
    }
}
