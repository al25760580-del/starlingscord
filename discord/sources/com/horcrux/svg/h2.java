package com.horcrux.svg;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6727a;

    static {
        int[] iArr = new int[SVGLength$UnitType.values().length];
        f6727a = iArr;
        try {
            iArr[SVGLength$UnitType.EMS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6727a[SVGLength$UnitType.EXS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6727a[SVGLength$UnitType.CM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6727a[SVGLength$UnitType.MM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f6727a[SVGLength$UnitType.IN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f6727a[SVGLength$UnitType.PT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f6727a[SVGLength$UnitType.PC.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
