package com.example.shops_near_by_you;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity {

    Button btnsign,btnlogin,btnforgot;
    TextView edtuser,edtpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnforgot=findViewById(R.id.btnforgot);
        btnlogin =findViewById(R.id.button);
        edtpass=findViewById(R.id.edtpass);
        edtuser=findViewById(R.id.edituser);
        btnforgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(login.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(login.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}