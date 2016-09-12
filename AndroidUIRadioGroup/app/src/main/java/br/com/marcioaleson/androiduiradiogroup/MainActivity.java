package br.com.marcioaleson.androiduiradiogroup;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {
    private RadioGroup radioGroupCricket;
    private RadioGroup radioGroupTutorials;
    private RadioButton radioBtn1;
    private RadioButton radioBtn2;
    private Button btnCricketer;
    private Button btnTutorialsPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // group1
        addListenerRadioGroup1();
        // group2
        addListenerRadioGroup2();
    }

    private void addListenerRadioGroup2() {
        radioGroupTutorials = (RadioGroup) findViewById(R.id.radioGroup2);
        btnTutorialsPoint = (Button) findViewById(R.id.button2);
        btnTutorialsPoint.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // get selected radio button from radioGroupTutorials
                int selected = radioGroupTutorials.getCheckedRadioButtonId();
                radioBtn2 = (RadioButton) findViewById(selected);
                Toast.makeText(MainActivity.this, radioBtn2.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void addListenerRadioGroup1() {
        radioGroupCricket = (RadioGroup) findViewById(R.id.radioGroup1);
        btnCricketer = (Button) findViewById(R.id.button1);
        btnCricketer.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) { // get selected radio button from radioGroupCricket
                int selected = radioGroupCricket.getCheckedRadioButtonId();
                radioBtn1 = (RadioButton) findViewById(selected);
                Toast.makeText(MainActivity.this, radioBtn1.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { /* Inflate the menu; this adds items to the action bar if it is present */
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}