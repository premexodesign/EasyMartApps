package com.example.olx_application.ui.sell.BikeForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class Scooter_Form extends AppCompatActivity {

    EditText sc_brandetx,sc_yearetx,sc_kmetx,sc_adtitle,sc_desetx;
    Button sc_btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scooter__form);


        sc_brandetx=findViewById(R.id.BRANDETX_SC);
        sc_yearetx=findViewById(R.id.YEARETX_SC);
        sc_kmetx=findViewById(R.id.KMDRIVENETX_SC);
        sc_adtitle=findViewById(R.id.ADDTITLEETX_SC);
        sc_desetx=findViewById(R.id.DESCRIPTIONETX_SC);
        sc_btnnext=findViewById(R.id.BTNNEXT_SC);
    }
}
