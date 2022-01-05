package com.example.wakeup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private AlarmManager alarmManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alarmManager = (AlarmManager)   this.getSystemService(Context.ALARM_SERVICE);

    findViewById(R.id.wake_up_button).setOnClickListener(view -> {
        Intent intent = new  Intent(this, Receiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0);

        alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis() + 5000, pendingIntent);
        //System.currentTimeMillis() + 5000 זה אומר שההודעה תיהיה מהזמן הנוכחי ועוד 5 שניות
    });
    }
}