package com.horcrux.svg;

import com.facebook.react.bridge.ReadableType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6806a;

    static {
        int[] iArr = new int[ReadableType.values().length];
        f6806a = iArr;
        try {
            iArr[ReadableType.Map.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6806a[ReadableType.Number.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6806a[ReadableType.Null.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
