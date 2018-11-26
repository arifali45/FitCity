package com.example.arifali.fitcity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Gym.db";
    public static final String TABLE_NAME = "Gym_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "NAME";
    public static final String COL_3 = "PHONE";
    public static final String COL_4 = "AGE";

    public DBHelper(Context context) {
        super(context, "DATABASE_NAME", null, 1);
    }

    //Creation of table
    @Override
    public void onCreate(SQLiteDatabase db) {
        //String qry = "create table student(name text,)";
        db.execSQL(" CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,PHONE TEXT,AGE INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
    }

    public boolean insertData(String name, String phone, String age) {
        SQLiteDatabase dbh = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL_2, name);
        cv.put(COL_3, phone);
        cv.put(COL_4, age);
        long res = dbh.insert(TABLE_NAME, null, cv);
        if (res == -1)
            return false;
        else
            return true;
    }

    public Cursor fetchData() {
        SQLiteDatabase dbh = this.getReadableDatabase();
        Cursor data = dbh.rawQuery("Select *from " + TABLE_NAME, null);
        return data;
    }

    public Integer deleteData(String id) {
        SQLiteDatabase dbh = this.getWritableDatabase();
        int i = dbh.delete(TABLE_NAME, "ID=?", new String[]{id});
        return i;
    }
    public boolean updateData(String id,String name,String phone,String age)
    {
       SQLiteDatabase db=this.getWritableDatabase();
       ContentValues contentValues=new ContentValues();
       contentValues.put(COL_2,name);
       contentValues.put(COL_3,phone);
       contentValues.put(COL_4,age);
       int reslut=db.update(TABLE_NAME,contentValues,"ID=?",new String[]{id});
       if(reslut>0)
       {
           return  true;


       }
       else
       {
           return false;
       }
    }
}
