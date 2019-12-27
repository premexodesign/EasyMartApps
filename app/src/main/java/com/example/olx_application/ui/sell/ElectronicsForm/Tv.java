package com.example.olx_application.ui.sell.ElectronicsForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class Tv extends AppCompatActivity {

    EditText tv_adtitleetx,tv_desetx;
    Button tv_btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv);

        tv_adtitleetx=findViewById(R.id.ADTITLEETX_TV);
        tv_desetx=findViewById(R.id.DESCRIPTIONETX_TV);
        tv_btnnext=findViewById(R.id.BUTTONNEXT_TV);
    }
}
