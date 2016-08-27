package br.com.marcioaleson.androiduicheckbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity {
    private CheckBox chk1, chk2, chk3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 3 methods
        addListenerOnCheck1();
        addListenerOnCheck2();
        addListenerOnCheck3();
    }

    // method for CheckBox1 - Java
    private void addListenerOnCheck1() {
        chk1 = (CheckBox) findViewById(R.id.checkBox1);
        chk2 = (CheckBox) findViewById(R.id.checkBox2);
        chk3 = (CheckBox) findViewById(R.id.checkBox3);
        chk2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("Java Selection : ").append(chk1.isChecked());
                result.append("\nPerl Selection : ").append(chk2.isChecked());
                result.append("\nPython Selection :").append(chk3.isChecked());
                Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

    // method for CheckBox2 - Perl
    private void addListenerOnCheck2() {
        chk1 = (CheckBox) findViewById(R.id.checkBox1);
        chk2 = (CheckBox) findViewById(R.id.checkBox2);
        chk3 = (CheckBox) findViewById(R.id.checkBox3);
        chk3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("Java Selection : ").append(chk1.isChecked());
                result.append("\nPerl Selection : ").append(chk2.isChecked());
                result.append("\nPython Selection :").append(chk3.isChecked());
                Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

    /* method for CheckBox3 - Python */
    private void addListenerOnCheck3() {
        // TODO Auto-generated method stub
        chk1 = (CheckBox) findViewById(R.id.checkBox1);
        chk2 = (CheckBox) findViewById(R.id.checkBox2);
        chk3 = (CheckBox) findViewById(R.id.checkBox3);
        chk1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("Java Selection : ").append(chk1.isChecked());
                result.append("\nPerl Selection : ").append(chk2.isChecked());
                result.append("\nPython Selection :").append(chk3.isChecked());
                Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}

