package com.example.olx_application.ui.sell.ElectronicsForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class Fridge extends AppCompatActivity {

    EditText fridge_adtitleetx,fridge_desetx;
    Button fridge_btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fridge);

        fridge_adtitleetx=findViewById(R.id.ADTITLEETX_FRIDGE);
        fridge_desetx=findViewById(R.id.DESCRIPTIONETX_FRIDGE);
        fridge_btnnext=findViewById(R.id.BUTTONNEXT_FRIDGE);
    }
}
