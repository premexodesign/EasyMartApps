package com.example.olx_application.ui.sell.BikeForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class Bike_Sparepart_form extends AppCompatActivity {

    EditText bikesp_adtitleetx,bikesp_desetx;
    Button bikesp_btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bike__sparepart_form);

        bikesp_adtitleetx=findViewById(R.id.ADTITLEETX_BIKESP);
        bikesp_desetx=findViewById(R.id.DESCRIPTIONETX_BIKESP);
        bikesp_btnnext=findViewById(R.id.BUTTONNEXT_BIKESP);

    }
}
