package com.example.olx_application.ui.sell.ElectronicsForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class Games extends AppCompatActivity {

    EditText games_adtitleetx,games_desetx;
    Button games_btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

        games_adtitleetx=findViewById(R.id.ADTITLEETX_GAMES);
        games_desetx=findViewById(R.id.DESCRIPTIONETX_GAMES);
        games_btnnext=findViewById(R.id.BUTTONNEXT_GAMES);
    }
}
