package com.example.olx_application.ui.sell.MobilePhoneForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class Tablet_Form extends AppCompatActivity {

    EditText tab_typeetx,tab_adtitleetx,tab_desetx;
    Button tab_btnnextetx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablet__form);

        tab_typeetx=findViewById(R.id.TYPEETX_TAB);
        tab_adtitleetx=findViewById(R.id.ADDTITLEETX_TAB);
        tab_desetx=findViewById(R.id.DESCRIPTIONETX_TAB);
        tab_btnnextetx=findViewById(R.id.BTNNEXT_TAB);
    }
}
