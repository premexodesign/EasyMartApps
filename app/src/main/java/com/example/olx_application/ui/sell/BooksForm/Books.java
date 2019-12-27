package com.example.olx_application.ui.sell.BooksForm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_application.R;

public class Books extends AppCompatActivity {

    EditText books_adtitleetx,books_desetx;
    Button books_btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        books_adtitleetx=findViewById(R.id.ADTITLEETX_BOOKS);
        books_desetx=findViewById(R.id.DESCRIPTIONETX_BOOKS);
        books_btnnext=findViewById(R.id.BUTTONNEXT_BOOKS);
        
    }
}
