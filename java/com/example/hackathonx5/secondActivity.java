package com.example.hackathonx5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity {
    Button btnReg;
    final int CAMERA_REQUEST = 1;

    private AutoCompleteTextView inpeuCity;
    private String [] city = new String[]{
            "Свердловская обл. г.Екатеринбург",
            "Свердловская обл. г.Алапаевск",
            "Свердловская обл. г.Богданович",
            "Свердловская обл. г.Дегтярск",
            "Свердловская обл. г.Камышлов",
            "Московская обл. г.Москва",
            "Московская обл. г.Лобня",
            "Московская обл. г.Кубинка",
            "Московская обл. г.Ликино-Дулёво",
            "Московская обл. г.Пересвет"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        inpeuCity = (AutoCompleteTextView)findViewById(R.id.inputcity);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.select_dialog_item, city);
        inpeuCity.setThreshold(1);
        inpeuCity.setAdapter(arrayAdapter);
    }

    public void openCateg(View v){
        Intent go = new Intent(".catigories");
        startActivity(go);
    }

    public void openCoffe(View v){
        Intent go = new Intent(".coffeandtea");
        startActivity(go);
    }

    public void openCase(View v){
        btnReg = (Button)findViewById(R.id.truecase);
        btnReg.setVisibility(View.INVISIBLE);
        Intent go = new Intent(".opencase");
        startActivity(go);
    }

    public void backWINDopen(View v){
        Intent go = new Intent(".hellowind");
        startActivity(go);
    }

    public void openCamera(View v) {
        try {
            // Намерение для запуска камеры
            Intent captureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(captureIntent, CAMERA_REQUEST);
        } catch (ActivityNotFoundException e) {
            // Выводим сообщение об ошибке
            String errorMessage = "Ваше устройство не поддерживает съемку";
            Toast toast = Toast
                    .makeText(this, errorMessage, Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
