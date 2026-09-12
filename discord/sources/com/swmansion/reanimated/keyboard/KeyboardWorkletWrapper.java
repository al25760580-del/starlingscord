package com.swmansion.reanimated.keyboard;

import com.facebook.jni.HybridData;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
public class KeyboardWorkletWrapper {

    @xa.a
    private final HybridData mHybridData;

    @xa.a
    private KeyboardWorkletWrapper(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void invoke(int i7, int i10);
}
