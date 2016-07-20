package com.example.zxcvbn.resume_anita;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/**
 * Created by zxcvbn on 19/07/2016.
 */
public class DBHelper extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION=1;
    public static final String DATABASE_NAME="resumeanita.db";
    public DBHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        //TODO Auto-generated method stub
        db.execSQL(ControllerResume.CREATE_HASILRESUME);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        //TODO Auto-generated method stub
    }
}
