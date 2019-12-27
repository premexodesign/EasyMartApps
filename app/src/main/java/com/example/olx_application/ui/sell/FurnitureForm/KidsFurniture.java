package com.example.olx_application.ui.sell.FurnitureForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class KidsFurniture extends AppCompatActivity {

    EditText kids_adtitleetx,kids_desetx;
    Button kids_btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids_furniture);

        kids_adtitleetx=findViewById(R.id.ADTITLEETX_KIDS);
        kids_desetx=findViewById(R.id.DESCRIPTIONETX_KIDS);
        kids_btnnext=findViewById(R.id.BUTTONNEXT_KIDS);
    }
}
