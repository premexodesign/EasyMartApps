package com.example.olx_application.ui.sell.FurnitureForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class Sofa extends AppCompatActivity {

    EditText sofa_adtitleetx,sofa_desetx;
    Button sofa_btnnext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sofa);

        sofa_adtitleetx=findViewById(R.id.ADTITLEETX_SOFA);
        sofa_desetx=findViewById(R.id.DESCRIPTIONETX_SOFA);
        sofa_btnnext=findViewById(R.id.BUTTONNEXT_SOFA);
    }
}
