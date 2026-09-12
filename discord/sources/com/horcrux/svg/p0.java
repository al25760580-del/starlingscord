package com.horcrux.svg;

import com.facebook.react.bridge.ReadableType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6780a;

    static {
        int[] iArr = new int[ReadableType.values().length];
        f6780a = iArr;
        try {
            iArr[ReadableType.Number.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6780a[ReadableType.String.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
