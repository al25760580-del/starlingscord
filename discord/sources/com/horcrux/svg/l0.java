package com.horcrux.svg;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6748a;

    static {
        int[] iArr = new int[SVGLength$UnitType.values().length];
        f6748a = iArr;
        try {
            iArr[SVGLength$UnitType.NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6748a[SVGLength$UnitType.PX.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6748a[SVGLength$UnitType.PERCENTAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6748a[SVGLength$UnitType.EMS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f6748a[SVGLength$UnitType.EXS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f6748a[SVGLength$UnitType.CM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f6748a[SVGLength$UnitType.MM.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f6748a[SVGLength$UnitType.IN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f6748a[SVGLength$UnitType.PT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f6748a[SVGLength$UnitType.PC.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f6748a[SVGLength$UnitType.UNKNOWN.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
