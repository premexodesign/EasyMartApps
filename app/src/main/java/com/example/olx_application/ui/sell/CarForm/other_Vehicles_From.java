package com.example.olx_application.ui.sell.CarForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class other_Vehicles_From extends AppCompatActivity {

    EditText ov_addetx,ov_desetx;
    Button ov_btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other__vehicles__from);

        ov_addetx=findViewById(R.id.ADTITLEETX_OV);
        ov_desetx=findViewById(R.id.DESCRIPTIONETX_OV);
        ov_btnnext=findViewById(R.id.BUTTONNEXT_OV);
    }
}
