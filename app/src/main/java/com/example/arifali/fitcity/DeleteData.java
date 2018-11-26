package com.example.arifali.fitcity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteData extends AppCompatActivity {
    EditText et4;
    Button b6;
    DBHelper dbh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_data);

        et4=findViewById(R.id.editText4);
        b6=findViewById(R.id.button6);
        dbh=new DBHelper(this);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id=et4.getText().toString();
                int result=dbh.deleteData(id);
                Toast.makeText(DeleteData.this, result+" :Rows affected", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
