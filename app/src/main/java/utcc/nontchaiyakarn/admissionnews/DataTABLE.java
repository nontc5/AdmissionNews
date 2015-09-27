package utcc.nontchaiyakarn.admissionnews;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by nontchaiyakarn on 9/26/15 AD.
 */
public class DataTABLE {

    private MySQLiteOpenHelper objMySQLiteOpenHelper;
    private SQLiteDatabase readSqLiteDatabase, writeSqLiteDatabase;

    public static final String DATA_TABLE = "dataTABLE";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_SUBJECT = "DataSubject";
    public static final String COLUMN_IMG = "DataIMG";
    public static final String COLUMN_DATE_START = "DataDateStart";
    public static final String COLUMN_DATE_END = "DataDateEnd";
    public static final String COLUMN_EVENTTYPE = "EventsType";
    public static final String COLUMN_DESCRIPTION = "DataDescription";
    public static final String COLUMN_LINK = "DataLink";
    public static final String COLUMN_INSTITUTE = "DataInstitute";


    public DataTABLE(Context context) {

        objMySQLiteOpenHelper = new MySQLiteOpenHelper(context);
        readSqLiteDatabase = objMySQLiteOpenHelper.getReadableDatabase();
        writeSqLiteDatabase = objMySQLiteOpenHelper.getWritableDatabase();

    }   // Constructor

    public String[] readAllData(int intColumn) {

        String[] strReadALL = null;
        Cursor objCursor = readSqLiteDatabase.query(DATA_TABLE,
                new String[]{COLUMN_ID, COLUMN_SUBJECT, COLUMN_IMG, COLUMN_DATE_START, COLUMN_DATE_END, COLUMN_EVENTTYPE, COLUMN_DESCRIPTION, COLUMN_LINK, COLUMN_INSTITUTE},
                null, null, null, null, null);

        if (objCursor != null) {
            objCursor.moveToFirst();
            strReadALL = new String[objCursor.getCount()];
            for (int i = 0; i <= objCursor.getCount(); i++) {
                switch (intColumn) {

                    case 1:
                        strReadALL[i] = objCursor.getString(objCursor.getColumnIndex(COLUMN_SUBJECT));
                        break;

                    case 2:
                        strReadALL[i] = objCursor.getString(objCursor.getColumnIndex(COLUMN_DATE_START));
                        break;

                    case 3:
                        strReadALL[i] = objCursor.getString(objCursor.getColumnIndex(COLUMN_EVENTTYPE));
                        break;


                    default:
                        break;
                }   // Switch Case

                objCursor.moveToNext();

            }   // Loop For

        }

        return strReadALL;
    }


    public long addNewData(String strSubject, String strIMG, String strDateStart, String strDateEnd, String strEvent, String strDescription, String strLink, String strInstitute) {

        ContentValues objContentValues = new ContentValues();
        objContentValues.put(COLUMN_SUBJECT, strSubject);
        objContentValues.put(COLUMN_IMG, strIMG);
        objContentValues.put(COLUMN_DATE_START, strDateStart);
        objContentValues.put(COLUMN_DATE_END, strDateEnd);
        objContentValues.put(COLUMN_EVENTTYPE, strEvent);
        objContentValues.put(COLUMN_DESCRIPTION, strDescription);
        objContentValues.put(COLUMN_LINK, strLink);
        objContentValues.put(COLUMN_INSTITUTE, strInstitute);

        return writeSqLiteDatabase.insert(DATA_TABLE, null, objContentValues);
    }


}   // Main Class
