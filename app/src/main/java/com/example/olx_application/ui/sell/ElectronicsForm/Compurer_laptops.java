package com.example.olx_application.ui.sell.ElectronicsForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class Compurer_laptops extends AppCompatActivity {

    EditText com_adtitleetx,com_desetx;
    Button com_btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compurer_laptops);

        com_adtitleetx=findViewById(R.id.ADTITLEETX_COM);
        com_desetx=findViewById(R.id.DESCRIPTIONETX_COM);
        com_btnnext=findViewById(R.id.BUTTONNEXT_COM);

    }
}
