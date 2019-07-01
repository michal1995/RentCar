package com.example.rentcar;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class PomocnikBazaDanych extends SQLiteOpenHelper {

    private static final String TAG = "pomicnikbazadanych";

    private static final String TABLE_NAME = "car";
    private static final String COL1 = "ID";
    private static final String COL2 = "model";
    private static final String COL3 = "typ";
    private static final String COL4 = "rocznik";
    private static final String COL5 = "cena";

    public PomocnikBazaDanych(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
