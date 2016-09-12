package br.com.marcioaleson.androiduitogglebutton;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
    private ToggleButton toggleBtn1, toggleBtn2;
    private Button btResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnToggleButton();
    }

    private void addListenerOnToggleButton() {
        toggleBtn1 = (ToggleButton) findViewById(R.id.toggleButton1);
        toggleBtn2 = (ToggleButton) findViewById(R.id.toggleButton2);
        btResult = (Button) findViewById(R.id.button1);
        btResult.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("START Condition - ").append(toggleBtn1.getText());
                result.append("\nSTOP Condition - ").append(toggleBtn2.getText());
                Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /* Inflate the menu; this adds items to the action bar if it is present */
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}