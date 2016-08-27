package br.com.marcioaleson.androiduiedittextautocomplete;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autocompletetextview;
    String[] arr = {"MS SQL SERVER", "MySQL", "Oracle"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autocompletetextview = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.select_dialog_item, arr);
        autocompletetextview.setThreshold(1);
        autocompletetextview.setAdapter(adapter);
    }
}
