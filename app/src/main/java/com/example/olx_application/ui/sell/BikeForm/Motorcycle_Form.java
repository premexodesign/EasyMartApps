package com.example.olx_application.ui.sell.BikeForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class Motorcycle_Form extends AppCompatActivity {

    EditText mc_brandetx,mc_yearetx,mc_kmetx,mc_adtitle,mc_desetx;
    Button mc_btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motorcycle__form);

        mc_brandetx=findViewById(R.id.BRANDETX_MC);
        mc_yearetx=findViewById(R.id.YEARETX_MC);
        mc_kmetx=findViewById(R.id.KMDRIVENETX_MC);
        mc_adtitle=findViewById(R.id.ADDTITLEETX_MC);
        mc_desetx=findViewById(R.id.DESCRIPTIONETX_MC);
        mc_btnnext=findViewById(R.id.BTNNEXT_MC);
    }
}
