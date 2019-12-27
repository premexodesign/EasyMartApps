package com.example.olx_application.ui.sell.ElectronicsForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class Kitchen extends AppCompatActivity {

    EditText kitchen_adtitleetx,kitchen_desetx;
    Button kitchen_btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);

        kitchen_adtitleetx=findViewById(R.id.ADTITLEETX_KITCHEN);
        kitchen_desetx=findViewById(R.id.DESCRIPTIONETX_KITCHEN);
        kitchen_btnnext=findViewById(R.id.BUTTONNEXT_KITCHEN);
    }
}
