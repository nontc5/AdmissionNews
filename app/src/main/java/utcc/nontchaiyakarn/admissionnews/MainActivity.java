package utcc.nontchaiyakarn.admissionnews;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private DataTABLE objDataTABLE;
    private UsageTABLE objUsageTABLE;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectedSQLite();

        testAddValue();

    }   // on Create

    private void testAddValue() {

        objUsageTABLE.addNewUsage("1", "00000000012");

    }   //  Test Add Value


    private void connectedSQLite() {

        objDataTABLE = new DataTABLE(this);
        objUsageTABLE = new UsageTABLE(this);

    }   // connectedSQLite

}   // Main Class
