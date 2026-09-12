package com.swmansion.reanimated.sensor;

/* JADX INFO: loaded from: classes3.dex */
public enum ReanimatedSensorType {
    ACCELEROMETER(10),
    GYROSCOPE(4),
    GRAVITY(9),
    MAGNETIC_FIELD(2),
    ROTATION_VECTOR(11);

    private final int type;

    ReanimatedSensorType(int i7) {
        this.type = i7;
    }

    public static ReanimatedSensorType getInstanceById(int i7) {
        if (i7 == 1) {
            return ACCELEROMETER;
        }
        if (i7 == 2) {
            return GYROSCOPE;
        }
        if (i7 == 3) {
            return GRAVITY;
        }
        if (i7 == 4) {
            return MAGNETIC_FIELD;
        }
        if (i7 == 5) {
            return ROTATION_VECTOR;
        }
        throw new IllegalArgumentException("[Reanimated] Unknown sensor type.");
    }

    public int getType() {
        return this.type;
    }
}
