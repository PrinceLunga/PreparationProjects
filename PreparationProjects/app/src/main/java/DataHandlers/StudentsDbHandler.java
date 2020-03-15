package DataHandlers;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class StudentsDbHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "productDB.db";
    private static final String TABLE_STUDENTS = "students";

    public static final String COLUMN_ID = "student_id";
    public static final String COLUMN_FULLNAMES = "fullnames";
    public static final String COLUMN_EMAIL = "email";
    public static final String COLUMN_USERNAME = "username";
    public static final String COLUMN_HOMEADDRESS = "homeAddress";
    public static final String COLUMN_CELLNUMBER = "cellNumbers";
    public static final String COLUMN_DATEOFBIRTH = "dateofBirth";
    public static final String COLUMN_DATECREATED = "dateCreate";
    public static final String COLUMN_DATEMODIFIED = "dateModified";
    public static final String COLUMN_ENDDATE = "endDate";

    public StudentsDbHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_STUDENTS_TABLE = "CREATE TABLE " + TABLE_STUDENTS +
                "(" + COLUMN_ID + " INTEGER PRIMARY KEY," +
                COLUMN_FULLNAMES + " TEXT," +
                COLUMN_EMAIL + " TEXT," +
                COLUMN_USERNAME + " TEXT," +
                COLUMN_HOMEADDRESS + " TEXT," +
                COLUMN_CELLNUMBER + " TEXT," +
                COLUMN_DATEOFBIRTH + " TEXT," +
                COLUMN_DATECREATED + " TEXT," +
                COLUMN_DATEMODIFIED + " TEXT," +
                COLUMN_ENDDATE  + " TEXT " + ")";
        db.execSQL(CREATE_STUDENTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_STUDENTS);
        onCreate(db);
    }

    public void addStudent(Models.Student student) {

        ContentValues values = new ContentValues();
        values.put(COLUMN_FULLNAMES, student.getFullname());
        values.put(COLUMN_CELLNUMBER, student.getCellNumber());
        values.put(COLUMN_HOMEADDRESS, student.getHomeAddress());
        values.put(COLUMN_EMAIL, student.getEmail());
        values.put(COLUMN_USERNAME, student.getUserName());
        values.put(COLUMN_DATEOFBIRTH, student.getDateOfBirth());
        values.put(COLUMN_DATECREATED, student.getDateCreated());
        values.put(COLUMN_DATEMODIFIED, student.getDateModified());
        values.put(COLUMN_ENDDATE, student.getEndDate());
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(TABLE_STUDENTS, null, values);
        db.close();
    }

    public Models.Student findStudent(String fullnames)
    {
        String query = "Select * FROM " + TABLE_STUDENTS + " WHERE " + COLUMN_FULLNAMES +
                " = \"" + fullnames + "\"";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        Models.Student student = new Models.Student();
        if (cursor.moveToFirst())
        {
            cursor.moveToFirst();
            student.setStudentId(Integer.parseInt(cursor.getString(0)));
            student.setFullname(cursor.getString(1));
            student.setEmail(cursor.getString(2));
            student.setUserName(cursor.getString(3));
            student.setHomeAddress(cursor.getString(4));
            student.setCellNumber(cursor.getString(5));
            student.setDateOfBirth(cursor.getString(6));
            student.setDateCreated(cursor.getString(7));
            student.setDateModified(cursor.getString(8));
            student.setEndDate(cursor.getString(9));
            cursor.close();
        }
        else
        {
            student = null;
        }
        db.close();
        return student;
    }

    public boolean deleteStudent(String username)
    {
        boolean result = false;
        String query = "Select * FROM " + TABLE_STUDENTS+ " WHERE " + COLUMN_USERNAME + " = \"" + username + "\"";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        Models.Student student = new Models.Student();
        if (cursor.moveToFirst())
        {
            student.setUserName(cursor.getString(0));
            db.delete(TABLE_STUDENTS, COLUMN_ID + " = ?", new String[] { String.valueOf(student.getUserName())});
            cursor.close();
            result = true;
        }
        db.close();
        return result;
    }

}
