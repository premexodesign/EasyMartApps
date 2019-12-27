package com.example.olx_application.ui.sell.ElectronicsForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class Harddisk extends AppCompatActivity {

    EditText hd_adtitleetx,hd_desetx;
    Button hd_btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harddisk);

        hd_adtitleetx=findViewById(R.id.ADTITLEETX_HD);
        hd_desetx=findViewById(R.id.DESCRIPTIONETX_HD);
        hd_btnnext=findViewById(R.id.BUTTONNEXT_HD);
    }
}
