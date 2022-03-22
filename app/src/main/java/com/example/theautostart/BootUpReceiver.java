package com.example.theautostart;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * 3. Implement BroadcastReceiver class to run action after boot
 */

public class BootUpReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Intent mainIntent = new Intent(context, MainActivity.class);
            context.startActivity(mainIntent);
        }
    }
}