package com.example.olx_application.ui.sell.CarForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class form_car extends AppCompatActivity {

    EditText brandetx,yearetx,fueletx,kmetx,addetx,descriptionetx;
    Button btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_car);

        brandetx=findViewById(R.id.BRANDETX);
        yearetx=findViewById(R.id.YEARETX);
        fueletx=findViewById(R.id.FUELETX);
        kmetx=findViewById(R.id.KMDRIVENETX);
        addetx=findViewById(R.id.ADDTITLEETX);
        descriptionetx=findViewById(R.id.DESCRIPTIONETX);

        btnnext=findViewById(R.id.BTNNEXT);



    }
}
