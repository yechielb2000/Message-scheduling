package com.example.wakeup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class Receiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent i) {

        new Notification(context);
//        Intent alarmIntent = new Intent(context, NotificationActivity.class);
//        alarmIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        context.startActivity(alarmIntent);
    }
}




