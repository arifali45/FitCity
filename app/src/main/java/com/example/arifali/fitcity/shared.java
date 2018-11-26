package com.example.arifali.fitcity;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class shared extends AppCompatActivity {
    EditText etname,etusn;
    Button bsave,bview;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared);
        etname=(findViewById(R.id.editText11));
        etusn=(findViewById(R.id.editText12));
        bsave=(findViewById(R.id.button9));
        bview=(findViewById(R.id.button10));
        tv=(findViewById(R.id.textView3));
        bsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences=getSharedPreferences("userinfo", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString("name",etname.getText().toString());
                editor.putString("usn",etusn.getText().toString());
                editor.apply();
                Toast.makeText(shared.this, "saved", Toast.LENGTH_SHORT).show();
            }
        });

        bview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences=getSharedPreferences("userinfo",Context.MODE_PRIVATE);
                String name=sharedPreferences.getString("name","");
                String usn=sharedPreferences.getString("usn","");
                tv.setText(name+"\n"+usn);
            }
        });


    }
}
