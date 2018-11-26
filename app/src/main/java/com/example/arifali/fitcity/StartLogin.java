package com.example.arifali.fitcity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartLogin extends AppCompatActivity {

    Button mb1,mb2,mb3,mb4,mb5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_login);

        mb1=findViewById(R.id.button);
        mb2=findViewById(R.id.button2);
        mb3=findViewById(R.id.button3);
        mb4=findViewById(R.id.button4);
        mb5=findViewById(R.id.button8);
        mb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(StartLogin.this,AddData.class);
                startActivity(i);

            }
        });
        mb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(StartLogin.this,ViewData.class);
                startActivity(i1);
            }
        });

        mb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(StartLogin.this,DeleteData.class);
                startActivity(i2);
            }
        });
        mb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(StartLogin.this,UpdateData.class);
                startActivity(i3);
            }
        });
        mb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent is=new Intent(StartLogin.this,shared.class);
                startActivity(is);
            }
        });
    }
}
