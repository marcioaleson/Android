package br.com.marcioaleson.androidcontentprovider;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.net.URI;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAddName(View v){
        ContentValues values = new ContentValues();
        values.put(StudentsProvider.NAME,((EditText)findViewById(R.id.editText1)).getText().toString());
        values.put(StudentsProvider.GRADE, ((EditText) findViewById(R.id.editText2)).getText().toString());
        Uri uri = getContentResolver().insert(StudentsProvider.CONTENT_URI,values);
        Toast.makeText(getBaseContext(),uri.toString(),Toast.LENGTH_LONG).show();
    }

    public void onClickRetrieveStudents(View v){
   // Retrieve student records
     String URL = "content://com.example.provider.College/students";
        Uri students = Uri.parse(URL);
        @SuppressWarnings("deprecation")
        Cursor c = managedQuery(students, null, null, null, "name");
        if (c.moveToFirst()) {
            do{
                Toast.makeText(this,  c.getString(c.getColumnIndex( StudentsProvider.NAME)) + ", "
                        + c.getString(c.getColumnIndex( StudentsProvider.GRADE)), Toast.LENGTH_SHORT).show();
            } while (c.moveToNext());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
