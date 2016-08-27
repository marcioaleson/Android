package br.com.marcioaleson.androiduibutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edText1, edText2, edText3;
    private Button btnProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        edText1 = (EditText) findViewById(R.id.edittext);
        edText2 = (EditText) findViewById(R.id.edittext2);
        edText3 = (EditText) findViewById(R.id.edittext3);
        btnProduct = (Button) findViewById(R.id.button1);
        btnProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t1 = edText1.getText().toString();
                String t2 = edText2.getText().toString();
                String t3 = edText3.getText().toString();
                int i1 = Integer.parseInt(t1);
                int i2 = Integer.parseInt(t2);
                int i3 = Integer.parseInt(t3);
                int product = i1 * i2 * i3;
                Toast.makeText(getApplicationContext(), String.valueOf(product), Toast.LENGTH_LONG).show();
            }
        });
    }
}
