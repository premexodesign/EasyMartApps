package com.example.olx_application.ui.sell.BooksForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class Musical_Instruments extends AppCompatActivity {

    EditText musical_adtitleetx,musical_destx;
    Button musical_btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musical__instruments);

        musical_adtitleetx=findViewById(R.id.ADTITLEETX_MUSICAL);
        musical_destx=findViewById(R.id.DESCRIPTIONETX_GYM);
        musical_btnnext=findViewById(R.id.BUTTONNEXT_GYM);

    }
}
