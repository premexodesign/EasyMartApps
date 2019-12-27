package com.example.olx_application.ui.sell.BooksForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class Gym_Fitness extends AppCompatActivity {

    EditText gym_adtitleetx, gym_desetx;
    Button gym_btnnext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym__fitness);

        gym_adtitleetx=findViewById(R.id.ADTITLEETX_GYM);
        gym_desetx=findViewById(R.id.DESCRIPTIONETX_GYM);
        gym_btnnext=findViewById(R.id.BUTTONNEXT_GYM);
    }
}
