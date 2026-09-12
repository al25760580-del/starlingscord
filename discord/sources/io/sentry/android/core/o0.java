package io.sentry.android.core;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12355a;

    static {
        int[] iArr = new int[io.sentry.k0.values().length];
        f12355a = iArr;
        try {
            iArr[io.sentry.k0.DISCONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f12355a[io.sentry.k0.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
