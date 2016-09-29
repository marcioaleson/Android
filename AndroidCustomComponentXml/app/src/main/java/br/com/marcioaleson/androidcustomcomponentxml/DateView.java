package br.com.marcioaleson.androidcustomcomponentxml;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by marci_000 on 28/09/2016.
 */
public class DateView extends TextView {

    public DateView(Context context) {
        super(context);
        setDate();
    }

    public DateView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setDate();
    }

    public DateView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setDate();
    }

    private void setDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String today = dateFormat.format(Calendar.getInstance().getTime());
        setText(today); // self = DateView is a subclass of TextView }
    }
}