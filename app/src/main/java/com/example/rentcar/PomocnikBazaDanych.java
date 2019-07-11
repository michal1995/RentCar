package com.example.rentcar;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;


public class PomocnikBazaDanych extends SQLiteOpenHelper {

    //private static final String TAG = "pomicnikbazadanych";
    private static final String DATABASE_NAME = "cars.db";
    private static final String TABLE_NAME = "carrent";
    private static final String COL1 = "ID";
    private static final String COL2 = "model";
    private static final String COL3 = "typ";
    private static final String COL4 = "rocznik";
    private static final String COL5 = "cena";

    public PomocnikBazaDanych(@Nullable Context context) {
        super(context, TABLE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + "(" + COL1 + " INTEGER PRIMARY KEY AUTOINCREMENT," + COL2 + " TEXT," + COL3 + " TEXT,"+ COL4 +" TEXT,"+ COL5+" TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean addData(String model,String typ,String rocznik,String cena) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2, model);
        contentValues.put(COL3, typ);
        contentValues.put(COL4, rocznik);
        contentValues.put(COL5, cena);



        //Log.d(TAG, "addData: Adding " + item + " to " + TABLE_NAME);

        long result = db.insert(TABLE_NAME, null, contentValues);

        //if date as inserted incorrectly it will return -1
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }

}
