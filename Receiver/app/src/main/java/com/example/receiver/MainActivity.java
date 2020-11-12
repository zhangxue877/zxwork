package com.example.receiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
private NetworkChangeReceiver receiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter filter=new IntentFilter();
        filter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        receiver =new NetworkChangeReceiver();
        registerReceiver(receiver,filter);
//        networkChangReceiver =new NetworkChangReceiver();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(receiver);
    }

    class NetworkChangeReceiver extends BroadcastReceiver{
        @Override
        public void onReceive(Context context, Intent intent) {
//            Log.d(TAG,"network changes");
            Log.d("MainActivity","network changes");
        }
    }
}
