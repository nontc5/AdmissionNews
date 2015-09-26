package utcc.nontchaiyakarn.admissionnews;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by nontchaiyakarn on 9/26/15 AD.
 */
public class DataTABLE {

    private MySQLiteOpenHelper objMySQLiteOpenHelper;
    private SQLiteDatabase readSqLiteDatabase;

    public DataTABLE(Context context) {

        objMySQLiteOpenHelper = new MySQLiteOpenHelper(context);
        readSqLiteDatabase = objMySQLiteOpenHelper.getReadableDatabase();

    }   // Constructor

}   // Main Class
