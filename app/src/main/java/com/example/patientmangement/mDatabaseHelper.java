package com.example.patientmangement;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.jar.Attributes;

import static android.os.Build.VERSION_CODES.M;

public class mDatabaseHelper extends SQLiteOpenHelper {

    public static final String DBNAME = "PatientDatabase";
    public static final int version = 1;

    mDatabaseHelper(Context context){
        super(context,DBNAME,null,version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE PATIENT_DETAILS (id INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, AGE INT, GENDER INT, PHONE TEXT)";
        db.execSQL(sql);

        // Insert
//        insertData("Gaurav Sharma", 19, 'M', "7999339524", db );
    }

    public int delete(String name){
        SQLiteDatabase db = this.getWritableDatabase();
        int i=db.delete("PATIENT_DETAILS", "NAME = ?", new String[]{name});
        return i;
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { }

    public boolean addData(String Name, int Age, char Gender, String Phone) {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("NAME",Name);
        values.put("AGE",Age);
        values.put("GENDER",(int) Gender);
        values.put("PHONE",Phone);
        long result = database.insert("PATIENT_DETAILS", null, values);
        if(result==-1)
            return false;
        else
            return true;
    }


}
