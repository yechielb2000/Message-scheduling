package com.example.wakeup;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.RequiresApi;
@TargetApi(Build.VERSION_CODES.O)
@RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)

public class Notification {

    public Notification(Context context) {
        Intent intent = new Intent(context, NotificationActivity.class);
        String CHANNEL_ID = "MY_CHANNEL";
        PendingIntent pendingIntent = PendingIntent.getActivity(context,1,intent,0);
        android.app.Notification notification=new android.app.Notification.Builder(context,CHANNEL_ID)
                .setContentText("Heading")
                .setContentTitle("subheading")
                .setContentIntent(pendingIntent)
                .addAction(android.R.drawable.sym_action_chat,"Title",pendingIntent)
                .setChannelId(CHANNEL_ID)
                .setSmallIcon(android.R.drawable.sym_action_chat)
                .build();

        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.createNotificationChannel(new NotificationChannel(CHANNEL_ID,"name", NotificationManager.IMPORTANCE_HIGH));
        notificationManager.notify(1,notification);
    }
}
