package com.android.mqtttest.mqttservice2;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return myBinder;
    }

    private MyBinder myBinder = new MyBinder();
    class MyBinder extends Binder {
        public MyService getService() {
            return MyService.this;
        };
    }
}
