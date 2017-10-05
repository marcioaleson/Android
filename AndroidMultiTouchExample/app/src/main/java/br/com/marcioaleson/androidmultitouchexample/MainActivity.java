package br.com.marcioaleson.androidmultitouchexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    float xAxis = 0f;
    float yAxis = 0f;
    float lastXAxis = 0f;
    float lastYAxis = 0f;
    private EditText xText, yText, moveX, moveY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xText = (EditText) findViewById(R.id.editText2);
        yText = (EditText) findViewById(R.id.editText3);
        moveX = (EditText) findViewById(R.id.editText1);
        moveY = (EditText) findViewById(R.id.editText4);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        final int actionPeformed = ev.getAction();
        switch (actionPeformed) {
            case MotionEvent.ACTION_DOWN: {
                final float x = ev.getX();
                final float y = ev.getY();
                lastXAxis = x;
                lastYAxis = y;
                xText.setText(Float.toString(lastXAxis));
                yText.setText(Float.toString(lastYAxis));
                break;
            }
            case MotionEvent.ACTION_MOVE: {
                final float x = ev.getX();
                final float y = ev.getY();
                final float dx = x - lastXAxis;
                final float dy = y - lastYAxis;
                xAxis += dx;
                yAxis += dy;
                moveX.setText(Float.toString(xAxis));
                moveY.setText(Float.toString(yAxis));
                break;
            }
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}