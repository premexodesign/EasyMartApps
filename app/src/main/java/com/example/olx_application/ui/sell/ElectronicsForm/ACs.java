package com.example.olx_application.ui.sell.ElectronicsForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class ACs extends AppCompatActivity {


    EditText ac_adtitleetx,ac_desetx;
    Button ac_btnnext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acs);

        ac_adtitleetx=findViewById(R.id.ADTITLEETX_AC);
        ac_desetx=findViewById(R.id.DESCRIPTIONETX_AC);
        ac_btnnext=findViewById(R.id.BUTTONNEXT_AC);


    }
}
