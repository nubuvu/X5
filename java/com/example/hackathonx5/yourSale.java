package com.example.hackathonx5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class yourSale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_sale);
    }

    public void getSale(View v){
        Intent go = new Intent(".opencase");
        startActivity(go);
    }
}
