package com.example.olx_application.ui.sell.MobilePhoneForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class Accessories_Form extends AppCompatActivity {

    Button acc_btnmob,acc_btntab,acc_btnnext;
    EditText acc_addtitleetx,acc_desetx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories__form);

        acc_addtitleetx=findViewById(R.id.ADDTITLEETX_ACC);
        acc_desetx=findViewById(R.id.DESCRIPTIONETX_ACC);
        acc_btnmob=findViewById(R.id.BTNMOB_ACC);
        acc_btntab=findViewById(R.id.BTNTAB_ACC);
        acc_btnnext=findViewById(R.id.BTNNEXT_ACC);
    }
}
