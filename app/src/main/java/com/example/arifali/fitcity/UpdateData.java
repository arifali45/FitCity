package com.example.arifali.fitcity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateData extends AppCompatActivity {
    EditText et5,et6,et7,et8;
    Button b7;
    DBHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_data);

        et5=findViewById(R.id.editText5);
        et6=findViewById(R.id.editText6);
        et7=findViewById(R.id.editText7);
        et8=findViewById(R.id.editText8);
        b7=findViewById(R.id.button7);
        db=new DBHelper(this);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id=et5.getText().toString();
                String name=et6.getText().toString();
                String phone=et7.getText().toString();
                String age=et8.getText().toString();
                Boolean res=db.updateData(id,name,phone,age);
                if(res==true)
                {
                    Toast.makeText(UpdateData.this, "updated", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(UpdateData.this, "Not affected", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

}
