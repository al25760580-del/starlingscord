package com.horcrux.svg;

import com.facebook.react.bridge.ReadableType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6785a;

    static {
        int[] iArr = new int[ReadableType.values().length];
        f6785a = iArr;
        try {
            iArr[ReadableType.Number.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6785a[ReadableType.String.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6785a[ReadableType.Array.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
