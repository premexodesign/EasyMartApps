package com.example.olx_application.ui.sell.BooksForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class Sports_Equipment extends AppCompatActivity {

    EditText sports_adtitletx,sports_desetx;
    Button sports_btnnext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports__equipment);

        sports_adtitletx=findViewById(R.id.ADTITLEETX_SPORTS);
        sports_desetx=findViewById(R.id.DESCRIPTIONETX_SPORTS);
        sports_btnnext=findViewById(R.id.BUTTONNEXT_SPORTS);
        
    }
}
