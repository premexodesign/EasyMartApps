package com.example.olx_application.ui.sell.BikeForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class Bicycle_Form extends AppCompatActivity {

    EditText bicycle_brandetx,bicycle_adtitleetx,bicycle_desetx;
    Button bicycle_btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicycle__form);

        bicycle_brandetx=findViewById(R.id.BRANDETX_BICYCLE);
        bicycle_adtitleetx=findViewById(R.id.ADTITLEETX_BICYCLE);
        bicycle_desetx=findViewById(R.id.DESCRIPTIONETX_BICYCLE);
        bicycle_btnnext=findViewById(R.id.BUTTONNEXT_BICYCLE);
    }
}
