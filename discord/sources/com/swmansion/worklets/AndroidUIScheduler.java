package com.swmansion.worklets;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.google.firebase.messaging.s;
import java.util.concurrent.atomic.AtomicBoolean;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
public class AndroidUIScheduler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReactApplicationContext f7267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f7268b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f7269c = new s(10, this);

    @a
    private final HybridData mHybridData = initHybrid();

    public AndroidUIScheduler(ReactApplicationContext reactApplicationContext) {
        this.f7267a = reactApplicationContext;
    }

    private native HybridData initHybrid();

    @a
    private void scheduleTriggerOnUI() {
        UiThreadUtil.runOnUiThread(new en.a(this, this.f7267a.getExceptionHandler()));
    }

    public native void invalidate();

    public native void triggerUI();
}
