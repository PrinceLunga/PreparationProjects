package com.prince.ssrinitial;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.*;

import androidx.annotation.Nullable;

public class DriverDataBase extends SQLiteOpenHelper {

    public static final String DataBase_Name = "driver.db";
    public static final String Table_Name = "driver_info.table";
    public static final String Col_1 = "ID";
    public static final String Col_2 = "Driver_Name";
    public static final String Col_3 = "Driver_Surname";
    public static final String Col_4 = "Driver_CellNumber";
    public static final String Col_5 = "Driver_HomeAddress";
    public static final String Col_6 = "Driver_LicensePlate";
    public static final String Col_7 = "Driver_PassengerLimit";

    public DriverDataBase(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + Table_Name + " (ID INTERGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,SURNAME TEXT,CELLNUMBER TEXT,HOMEADDRESS TEXT,LICENSEPLATE TEXT,PASSENGERLIMIT TEXT) " );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Table_Name);
        onCreate(db);
    }
}
