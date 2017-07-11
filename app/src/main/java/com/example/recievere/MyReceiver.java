package com.example.recievere;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "Received", Toast.LENGTH_SHORT).show();
        if (intent.getAction().equals("android.intent.action.AIRPLANE_MODE")){
            Toast.makeText(context, "Airplane Mode is Changed", Toast.LENGTH_SHORT).show();
        }
        else if(intent.getAction().equals("android.intent.action.WALLPAPER_CHANGED")){
            Toast.makeText(context,"Wallpaper Changed",Toast.LENGTH_LONG).show();
        }

        if (intent.getAction().equals("android.intent.action.ACTION_POWER_CONNECTED")){

            Toast.makeText(context, "AC Power Connected", Toast.LENGTH_SHORT).show();
            //MediaPlayer mp = MediaPlayer.create(context,R.raw.established);
           // mp.start();
        }
        else if (intent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED"))
        {
            Toast.makeText(context, "AC Power Disconnected", Toast.LENGTH_SHORT).show();
            //MediaPlayer mp = MediaPlayer.create(context,R.raw.established);
            //mp.start();
        }
    }


}
