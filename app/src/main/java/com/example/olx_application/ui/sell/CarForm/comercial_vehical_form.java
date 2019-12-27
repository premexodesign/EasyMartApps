package com.example.olx_application.ui.sell.CarForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class comercial_vehical_form extends AppCompatActivity {

    EditText cv_etxyear,cv_kmetx,cv_adetx,cv_desetx;
    Button cv_btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comercial_vehical_form);


        cv_etxyear=findViewById(R.id.YEARETX_CV);
        cv_kmetx=findViewById(R.id.KMDRIVENETX_CV);
        cv_adetx=findViewById(R.id.ADDTITLEETX_CV);
        cv_desetx=findViewById(R.id.DESCRIPTIONETX_CV);

        cv_btnnext=findViewById(R.id.BUTTONNEXT_CV);
    }
}
