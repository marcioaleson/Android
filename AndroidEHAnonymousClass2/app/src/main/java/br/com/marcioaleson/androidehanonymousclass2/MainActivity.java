package br.com.marcioaleson.androidehanonymousclass2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } //--- Implement the event handler for the first button.

    public void doSmall(View v) {
        // --- find the text view --
        TextView txtView = (TextView) findViewById(R.id.text_id);
        // -- change text size --
        txtView.setTextSize(14);
        return;
    }

    //--- Implement the event handler for the second button.
    public void doLarge(View v) {
        // --- find the text view --
        TextView txtView = (TextView) findViewById(R.id.text_id);
        // -- change text size --
        txtView.setTextSize(24);
        return;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}
