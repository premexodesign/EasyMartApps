package com.example.olx_application.ui.sell.ElectronicsForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class washingMatchine extends AppCompatActivity {

    EditText wm_adtitleetx,wm_desetx;
    Button wm_btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_washing_matchine);

        wm_adtitleetx=findViewById(R.id.ADTITLEETX_WM);
        wm_desetx=findViewById(R.id.DESCRIPTIONETX_WM);
        wm_btnnext=findViewById(R.id.BUTTONNEXT_WM);
    }
}
