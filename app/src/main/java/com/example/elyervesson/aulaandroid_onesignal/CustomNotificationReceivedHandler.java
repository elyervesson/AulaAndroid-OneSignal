package com.example.elyervesson.aulaandroid_onesignal;

import android.util.Log;

import com.onesignal.OSNotification;
import com.onesignal.OneSignal;

import org.json.JSONObject;

/**
 * Created by elyervesson on 25/04/17.
 */
// This will be called when a notification is received.
public class CustomNotificationReceivedHandler implements OneSignal.NotificationReceivedHandler {
    @Override
    public void notificationReceived(OSNotification notification) {
        JSONObject data = notification.payload.additionalData;

        if (data != null) {
            Log.i("Log", "NotificationReceivedHandler: " + data);
        }
    }
}
