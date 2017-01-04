package com.example.marci.androidphonecall;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    private String phoneNumber = "Your phone number.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startBtn = (Button) findViewById(R.id.makeCall);
        startBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                makeCall();
            }
        });
    }

    protected void makeCall() {
        Log.i("Make call", "");
        Intent phoneIntent = new Intent(Intent.ACTION_CALL);
        phoneIntent.setData(Uri.parse(phoneNumber));
        try {
            startActivity(phoneIntent);
            finish();
            Log.i("Finished making a call", "");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(MainActivity.this, "Call faild, please try again later.", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
