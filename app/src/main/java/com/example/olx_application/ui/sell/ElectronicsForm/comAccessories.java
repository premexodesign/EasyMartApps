package com.example.olx_application.ui.sell.ElectronicsForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class comAccessories extends AppCompatActivity {


    EditText ca_adtitleetx,ca_desetx;
    Button ca_btnnext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com_accessories);

        ca_adtitleetx=findViewById(R.id.ADTITLEETX_CA);
        ca_desetx=findViewById(R.id.DESCRIPTIONETX_CA);
        ca_btnnext=findViewById(R.id.BUTTONNEXT_CA);
    }
}
