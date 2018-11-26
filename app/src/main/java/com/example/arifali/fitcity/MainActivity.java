package com.example.arifali.fitcity;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fb;
    EditText uet,pet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fb=findViewById(R.id.fab);
        uet=findViewById(R.id.editText9);
        pet=findViewById(R.id.editText10);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((uet.getText().toString().equals("FIT")) &&( pet.getText().toString().equals("123")))
                {
                    Toast.makeText(getApplicationContext(), "LOGGED IN", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(MainActivity.this,StartLogin.class);
                    startActivity(i);

                }
                else
                {
                    Toast.makeText(MainActivity.this, "invalid , try again", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}



