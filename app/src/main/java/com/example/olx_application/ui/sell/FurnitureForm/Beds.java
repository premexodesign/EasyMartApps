package com.example.olx_application.ui.sell.FurnitureForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class Beds extends AppCompatActivity {

    EditText beds_adtitleetx,beds_desetx;
    Button beds_btnnext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beds);

       beds_adtitleetx=findViewById(R.id.ADTITLEETX_BEDS);
       beds_desetx=findViewById(R.id.DESCRIPTIONETX_BEDS);
       beds_btnnext=findViewById(R.id.BUTTONNEXT_BEDS);


    }
}
