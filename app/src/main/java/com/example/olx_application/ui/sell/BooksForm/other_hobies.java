package com.example.olx_application.ui.sell.BooksForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class other_hobies extends AppCompatActivity {

    EditText oh_adtitleetx,oh_desetx;
    Button oh_btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_hobies);

        oh_adtitleetx=findViewById(R.id.ADTITLEETX_OH);
        oh_desetx=findViewById(R.id.DESCRIPTIONETX_OH);
        oh_btnnext=findViewById(R.id.BUTTONNEXT_OH);
    }
}
