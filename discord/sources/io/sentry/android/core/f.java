package io.sentry.android.core;

import io.sentry.f3;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12180a;

    static {
        int[] iArr = new int[f3.values().length];
        f12180a = iArr;
        try {
            iArr[f3.TRACE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f12180a[f3.MANUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
