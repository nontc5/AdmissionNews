package utcc.nontchaiyakarn.admissionnews;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by nontchaiyakarn on 9/26/15 AD.
 */
public class MySQLiteOpenHelper extends SQLiteOpenHelper {

    //  ประกาศตัวแปร
    private static final String DATABASE_NAME = "AdmissionNews.db";
    private static final int DATABASE_VERSION = 1;
    private static final String CREATE_DATA_TABLE = "create table dataTABLE " +
            "_id integer primary key, " +
            "DataSubject text, " +
            "DataIMG text, " +
            "DataDateStart text, " +
            "DataDateEnd text, " +
            "EventsType text, " +
            "DataDescription text, " +
            "DataLink text, " +
            "DataInstitute text);";




    public MySQLiteOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }   // Constructor

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_DATA_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}   // Main Class
