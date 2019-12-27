package com.example.olx_application;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button btnlogin;
    EditText loginemail,loginpass;
    TextView txtregister,txtforgotpass,txtskip;
    String validationemail,validationpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnlogin=findViewById(R.id.BTNLOGIN);
        loginemail=findViewById(R.id.LOGINEMAILETX);
        loginpass=findViewById(R.id.LOGINPASSETX);
        txtregister=findViewById(R.id.TEXTREGISTER);
        txtforgotpass=findViewById(R.id.TEXTFORGETPASS);
        txtskip=findViewById(R.id.tskip);
        Intent intent=getIntent();
        validationemail=intent.getStringExtra("email");
        validationpassword=intent.getStringExtra("password");

        txtregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regisintent=new Intent(Login.this,signup.class);
                startActivity(regisintent);
            }
        });

        txtforgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forgotpassintent=new Intent(Login.this,forgotpassword.class);
                startActivity(forgotpassintent);
            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(loginemail.getText().toString().equals(validationemail) && loginpass.getText().toString().equals(validationpassword)){
                    Intent intent1=new Intent(Login.this,MainActivity.class);
                    startActivity(intent1);
                }else{
                    Toast.makeText(Login.this, "Wrong Email or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        txtskip.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this, MainActivity.class);
                startActivity(i);
                finishAffinity();
            }
        });




    }
    }
