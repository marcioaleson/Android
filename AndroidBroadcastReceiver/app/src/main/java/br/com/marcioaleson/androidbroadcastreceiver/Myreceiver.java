package br.com.marcioaleson.androidbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by marci_000 on 28/06/2015.
 */
public class Myreceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Intent detected.",Toast.LENGTH_LONG).show();
    }
}
