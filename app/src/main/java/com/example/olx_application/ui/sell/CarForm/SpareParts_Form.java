package com.example.olx_application.ui.sell.CarForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class SpareParts_Form extends AppCompatActivity {

    EditText sp_adetx,sp_desetx;
    Button sp_btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spare_parts__form);

        sp_adetx=findViewById(R.id.ADTITLEETX_SP);
        sp_desetx=findViewById(R.id.DESCRIPTIONETX_SP);
        sp_btnnext=findViewById(R.id.BUTTONNEXT_SP);
    }
}
