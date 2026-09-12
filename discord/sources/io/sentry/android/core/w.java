package io.sentry.android.core;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12439a;

    static {
        int[] iArr = new int[io.sentry.k0.values().length];
        f12439a = iArr;
        try {
            iArr[io.sentry.k0.CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f12439a[io.sentry.k0.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f12439a[io.sentry.k0.NO_PERMISSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
