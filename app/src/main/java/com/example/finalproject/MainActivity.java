package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button p;
    Button m;
    ImageView Battery;
    int lvl = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Battery = findViewById(R.id.bat);
        p = findViewById(R.id.pBtn);
        m = findViewById(R.id.mBtn);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void PlusBtn(View view)
    {
        lvl++;
        Battery.setImageLevel(lvl);
    }

    public void MinusBtn(View view)
    {
        lvl--;
        Battery.setImageLevel(lvl);
    }


}

