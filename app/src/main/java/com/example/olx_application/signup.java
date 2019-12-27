package com.example.olx_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    EditText etxfname,etxemail,etxpass,etxconfpass,etxnumber;
    Button btnregistration;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        etxfname=findViewById(R.id.SIGNUPFNAMEETX);
        etxemail=findViewById(R.id.SIGNUPEMAILETX);
        etxpass=findViewById(R.id.SIGNUPPASSETX);
        etxconfpass=findViewById(R.id.SIGNUPCONFPASSETX);
        etxnumber=findViewById(R.id.ETXNUMBER);
        btnregistration=findViewById(R.id.SIGNUPREGISTERBTN);

        btnregistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etxfname.getText().toString().isEmpty()  || etxnumber.getText().toString().isEmpty() ||
                        etxemail.getText().toString().isEmpty() || etxpass.getText().toString().isEmpty() ||
                        etxconfpass.getText().toString().isEmpty()){

                    if(etxfname.getText().toString().isEmpty()){
                        etxfname.setError("Input is required");

                    }

                    else if(etxnumber.getText().toString().isEmpty()){
                        etxnumber.setError("Must be enterd number");

                    }
                    else if(etxemail.getText().toString().isEmpty()){
                        etxemail.setError("Input Required");
                    }

                    else{
                        if(etxpass.getText().toString().equals(etxconfpass.getText().toString()))
                        {
                            Toast.makeText(signup.this, "Success", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(signup.this, "Password and conformpassword must be same", Toast.LENGTH_SHORT).show();
                        }
                    }



                }else{
                    Intent intent=new Intent(signup.this,Login.class);
                    intent.putExtra("email",etxemail.getText().toString());
                    intent.putExtra("password",etxpass.getText().toString());
                    startActivity(intent);
                }

            }
        });



    }
}
