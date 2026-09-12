package com.margelo.nitro.rive;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f6983b;

    static {
        int[] iArr = new int[Alignment.values().length];
        try {
            iArr[Alignment.TOPLEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Alignment.TOPCENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Alignment.TOPRIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Alignment.CENTERLEFT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Alignment.CENTER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Alignment.CENTERRIGHT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[Alignment.BOTTOMLEFT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[Alignment.BOTTOMCENTER.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[Alignment.BOTTOMRIGHT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f6982a = iArr;
        int[] iArr2 = new int[Fit.values().length];
        try {
            iArr2[Fit.FILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[Fit.CONTAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[Fit.COVER.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[Fit.FITWIDTH.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[Fit.FITHEIGHT.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[Fit.NONE.ordinal()] = 6;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[Fit.SCALEDOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[Fit.LAYOUT.ordinal()] = 8;
        } catch (NoSuchFieldError unused17) {
        }
        f6983b = iArr2;
    }
}
