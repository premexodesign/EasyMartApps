package com.example.olx_application.ui.sell.FurnitureForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class HomeDecore extends AppCompatActivity {

    EditText homedecore_adtitleetx,homedecore_desetx;
    Button homedecore_btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_decore);


        homedecore_adtitleetx=findViewById(R.id.ADTITLEETX_HOMEDECORE);
        homedecore_desetx=findViewById(R.id.DESCRIPTIONETX_HOMEDECORE);
        homedecore_btnnext=findViewById(R.id.BUTTONNEXT_HOMEDECORE);
    }
}
