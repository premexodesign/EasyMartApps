package com.example.olx_application.ui.sell.MobilePhoneForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class MobilePhone_Form extends AppCompatActivity {

    EditText mp_brandetx,mp_adtiteletx,mp_desetx;
    Button mp_btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_phone__form);

        mp_brandetx=findViewById(R.id.BRANDETX_MP);
        mp_adtiteletx=findViewById(R.id.ADDTITLEETX_MP);
        mp_desetx=findViewById(R.id.DESCRIPTIONETX_MP);
        mp_btnnext=findViewById(R.id.BTNNEXT_MP);




    }
}
