package com.example.elyervesson.aulaandroid_onesignal;

import android.util.Log;

import com.onesignal.OSNotificationOpenResult;
import com.onesignal.OneSignal;

import org.json.JSONObject;

/**
 * Created by elyervesson on 25/04/17.
 */

// https://documentation.onesignal.com/docs/android-sdk-setup
// This will be called when a notification is tapped on
public class CustomNotificationOpenedHandler implements OneSignal.NotificationOpenedHandler {
    @Override
    public void notificationOpened(OSNotificationOpenResult result) {
        JSONObject data = result.notification.payload.additionalData;

        if (data != null) {
            Log.i("Log", "NotificationOpenedHandler: " + data);
        }
    }
}
