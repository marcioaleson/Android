package br.com.marcioaleson.androidservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by marci_000 on 28/06/2015.
 */
public class Myservice extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Service destroy.",Toast.LENGTH_LONG).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this,"Service started.",Toast.LENGTH_LONG).show();
        return super.onStartCommand(intent, flags, startId);
    }
}
