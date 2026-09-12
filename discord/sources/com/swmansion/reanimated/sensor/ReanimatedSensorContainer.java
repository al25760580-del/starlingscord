package com.swmansion.reanimated.sensor;

import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.swmansion.reanimated.nativeProxy.SensorSetter;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ReanimatedSensorContainer {
    private final WeakReference<ReactApplicationContext> reactContext;
    private int nextSensorId = 0;
    private final HashMap<Integer, ReanimatedSensor> sensors = new HashMap<>();

    public ReanimatedSensorContainer(WeakReference<ReactApplicationContext> weakReference) {
        this.reactContext = weakReference;
    }

    public int registerSensor(ReanimatedSensorType reanimatedSensorType, int i7, SensorSetter sensorSetter) {
        ReanimatedSensor reanimatedSensor = new ReanimatedSensor(this.reactContext, reanimatedSensorType, i7, sensorSetter);
        if (!reanimatedSensor.initialize()) {
            return -1;
        }
        int i10 = this.nextSensorId;
        this.nextSensorId = i10 + 1;
        this.sensors.put(Integer.valueOf(i10), reanimatedSensor);
        return i10;
    }

    public void unregisterSensor(int i7) {
        ReanimatedSensor reanimatedSensor = this.sensors.get(Integer.valueOf(i7));
        if (reanimatedSensor == null) {
            Log.e("Reanimated", "Tried to unregister nonexistent sensor");
        } else {
            reanimatedSensor.cancel();
            this.sensors.remove(Integer.valueOf(i7));
        }
    }
}
