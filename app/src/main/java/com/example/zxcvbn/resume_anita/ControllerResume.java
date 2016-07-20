package com.example.zxcvbn.resume_anita;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
/**
 * Created by zxcvbn on 19/07/2016.
 */
public class ControllerResume {

    private DBHelper dbHelper;
    private SQLiteDatabase database;

    public static final String TABLE_NAME="hasilresume";
    public static final String NAME="name";
    public static final String COLLEGE="college";
    public static final String PHONE="phone";
    public static final String EMAIL="email";
    public static final String PROFILE="profile";
    public static final String EDUCATION="education";
    public static final String TECHNICALSKILL="technicalskill";
    public static final String ACHIVEMENT="achivement";
    public static final String RELATEDCOURSE="relatedcourse";
    public static final String INTERNSHIP="internship";

    public static final String CREATE_HASILRESUME="" +
            "CREATE TABLE "+TABLE_NAME+" "+"("+
            NAME+" TEXT, "+
            COLLEGE+" TEXT, "+
            PHONE+" TEXT, "+
            EMAIL+" TEXT, "+
            PROFILE+" TEXT, "+
            EDUCATION+" TEXT, "+
            TECHNICALSKILL+" TEXT, "+
            ACHIVEMENT+" TEXT, "+
            RELATEDCOURSE+" TEXT, "+
            INTERNSHIP+" TEXT)";

    private String[] TABLE_COLUMNS={NAME, COLLEGE, PHONE, EMAIL, PROFILE,
            EDUCATION,TECHNICALSKILL,ACHIVEMENT, RELATEDCOURSE,INTERNSHIP};

    public ControllerResume(Context context){
        dbHelper=new DBHelper(context);
    }

    public void open() throws SQLException{
        database=dbHelper.getWritableDatabase();
    }

    public void close(){
        dbHelper.close();
    }

    public void deleteData(){
        database.delete(TABLE_NAME, null, null);
    }

    public void insertData(String name, String college, String phone, String email, String profile, String education,
                           String technicalskill, String achivement, String relatedcourse, String internship){
        ContentValues contentValues=new ContentValues();
        contentValues.put(NAME, name);
        contentValues.put(COLLEGE, college);
        contentValues.put(PHONE, phone);
        contentValues.put(EMAIL, email);
        contentValues.put(PROFILE, profile);
        contentValues.put(EDUCATION, education);
        contentValues.put(TECHNICALSKILL, technicalskill);
        contentValues.put(ACHIVEMENT, achivement);
        contentValues.put(RELATEDCOURSE, relatedcourse);
        contentValues.put(INTERNSHIP, internship);

        database.insert(TABLE_NAME, null, contentValues);
    }

    public ArrayList<ModelResume> getData(){
        ArrayList<ModelResume> allData=new ArrayList<ModelResume>();
        Cursor cursor=null;
        cursor=database.query(TABLE_NAME, TABLE_COLUMNS, null, null, null, null, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            allData.add(parseData(cursor));
            cursor.moveToNext();
        }
        cursor.close();
        return allData;
    }

    private ModelResume parseData(Cursor cursor){
        ModelResume curData=new ModelResume();
        curData.setName(cursor.getString(0));
        curData.setCollege(cursor.getString(1));
        curData.setPhone(cursor.getString(2));
        curData.setEmail(cursor.getString(3));
        curData.setProfile(cursor.getString(4));
        curData.setEducation(cursor.getString(5));
        curData.setTechnicalskill(cursor.getString(6));
        curData.setAchivement(cursor.getString(7));
        curData.setRelatedcourse(cursor.getString(8));
        curData.setInternship(cursor.getString(9));
        return curData;
    }
}
