package com.swmansion.reanimated.nativeProxy;

import com.facebook.jni.HybridData;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
public class SensorSetter {

    @xa.a
    private final HybridData mHybridData;

    @xa.a
    private SensorSetter(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void sensorSetter(float[] fArr, int i7);
}
