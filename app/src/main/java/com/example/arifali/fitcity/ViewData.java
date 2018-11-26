package com.example.arifali.fitcity;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ViewData extends AppCompatActivity {

        TextView tv;
        DBHelper dbh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_data);

        tv=findViewById(R.id.textView);
        dbh=new DBHelper(this);
        Cursor res = dbh.fetchData();
        StringBuffer stringbuffer = new StringBuffer();
        if(res!=null && res.getCount()>0)
        {
            while(res.moveToNext())
            {
                stringbuffer.append("Id: "+res.getString(0)+"\n");
                stringbuffer.append("Name: "+res.getString(1)+"\n");
                stringbuffer.append("Phone: "+res.getString(2)+"\n");
                stringbuffer.append("Age: "+res.getString(3)+"\n");

            }
            tv.setText(stringbuffer.toString());
            Toast.makeText(ViewData.this, "Data retrieved succesfully", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(ViewData.this, "No data to retrieve", Toast.LENGTH_SHORT).show();
        }
    }
}
