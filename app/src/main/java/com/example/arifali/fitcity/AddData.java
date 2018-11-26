package com.example.arifali.fitcity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddData extends AppCompatActivity {
    EditText et1,et2,et3;
    Button b1;
    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data);
        et1=findViewById(R.id.editText);
        et2=findViewById(R.id.editText2);
        et3=findViewById(R.id.editText3);
        b1=findViewById(R.id.button5);
        db=new DBHelper(this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=et1.getText().toString();
                String phone=et2.getText().toString();
                String age=et3.getText().toString();
                if(db.insertData(name,phone,age))
                {
                    Toast.makeText(AddData.this, "Inserted Succesfully", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(AddData.this, "Unsuccesfull", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
