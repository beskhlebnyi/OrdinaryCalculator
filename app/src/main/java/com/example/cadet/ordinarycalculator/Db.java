package com.example.cadet.ordinarycalculator;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class Db extends SQLiteOpenHelper {

    SQLiteDatabase db;
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "calculations.db";
    private static final String TABLE_NAME = "calculations";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_RESULT = "result";
    private static final String CREATE_TABLE = "CREATE TABLE calculations (id integer PRIMARY KEY AUTOINCREMENT, calculation text);";

    public Db(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
        this.db = db;
    }

    public void insertCalculation(String calculation){
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_RESULT, calculation);
        db.insert(TABLE_NAME, null, values);
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS " + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }
}
