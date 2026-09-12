package net.time4j;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f16673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f16674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f16675c;

    static {
        int[] iArr = new int[TimeUnit.values().length];
        f16675c = iArr;
        try {
            iArr[TimeUnit.DAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f16675c[TimeUnit.HOURS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f16675c[TimeUnit.MINUTES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f16675c[TimeUnit.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f16675c[TimeUnit.MILLISECONDS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f16675c[TimeUnit.MICROSECONDS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f16675c[TimeUnit.NANOSECONDS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr2 = new int[i1.values().length];
        f16674b = iArr2;
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f16674b[1] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        int[] iArr3 = new int[as.e.values().length];
        f16673a = iArr3;
        try {
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f16673a[1] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f16673a[2] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f16673a[3] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f16673a[4] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            f16673a[5] = 6;
        } catch (NoSuchFieldError unused15) {
        }
    }
}
