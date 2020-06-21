package com.example.hackathonx5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class opencase extends AppCompatActivity {

    int whoCase = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opencase);
    }

    public void backWINDopen(View v){
        Intent go = new Intent(".secondActivity");
        startActivity(go);
    }

    public void Change(View view){
        Fragment fragment = null;

        switch (view.getId()){
            case R.id.nextcase:
                if(whoCase==0){
                    fragment = new choosecase1();
                    whoCase = 1;
                }else if(whoCase==1){
                    fragment = new choosecase2();
                    whoCase = 2;
                }else{
                    fragment = new casechoose();
                    whoCase = 0;
                }
                break;
            case R.id.backcase:
                if(whoCase==0){
                    fragment = new choosecase2();
                    whoCase = 1;
                }else if(whoCase==1){
                    fragment = new choosecase1();
                    whoCase = 2;
                }else{
                    fragment = new casechoose();
                    whoCase = 0;
                }
                break;
        }

        FragmentTransaction fm = getSupportFragmentManager().beginTransaction();
        fm.replace(R.id.frag, fragment);
        fm.commit();
    }

    public void openCase(View v){
        Intent go = new Intent(".openNowCase");
        startActivity(go);
    }
}
