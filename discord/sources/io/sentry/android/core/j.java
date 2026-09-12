package io.sentry.android.core;

import io.sentry.SentryLevel;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12327a;

    static {
        int[] iArr = new int[SentryLevel.values().length];
        f12327a = iArr;
        try {
            iArr[SentryLevel.INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f12327a[SentryLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f12327a[SentryLevel.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f12327a[SentryLevel.FATAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f12327a[SentryLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
