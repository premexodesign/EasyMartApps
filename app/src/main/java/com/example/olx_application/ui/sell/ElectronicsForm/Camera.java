package com.example.olx_application.ui.sell.ElectronicsForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class Camera extends AppCompatActivity {

    EditText camera_adtitleetx,camera_desetx;
    Button camera_btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        camera_adtitleetx=findViewById(R.id.ADTITLEETX_CAMERA);
        camera_desetx=findViewById(R.id.DESCRIPTIONETX_CAMERA);
        camera_btnnext=findViewById(R.id.BUTTONNEXT_CAMERA);

    }
}
