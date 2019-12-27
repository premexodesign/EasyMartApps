package com.example.olx_application.ui.sell.FurnitureForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class other_HouseHold extends AppCompatActivity {

    EditText household_adtitleetx,household_desetx;
    Button household_btnnext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other__house_hold);

        household_adtitleetx=findViewById(R.id.ADTITLEETX_HOUSEHOLD);
        household_desetx=findViewById(R.id.DESCRIPTIONETX_HOUSEHOLD);
        household_btnnext=findViewById(R.id.BUTTONNEXT_HOUSEHOLD);
    }
}
