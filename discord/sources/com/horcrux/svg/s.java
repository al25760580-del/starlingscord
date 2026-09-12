package com.horcrux.svg;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public enum s {
    /* JADX INFO: Fake field, exist only in values array */
    MATRIX("matrix"),
    /* JADX INFO: Fake field, exist only in values array */
    SATURATE("saturate"),
    /* JADX INFO: Fake field, exist only in values array */
    HUE_ROTATE("hueRotate"),
    /* JADX INFO: Fake field, exist only in values array */
    LUMINANCE_TO_ALPHA("luminanceToAlpha");


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f6788e = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6790d;

    static {
        for (s sVar : values()) {
            f6788e.put(sVar.f6790d, sVar);
        }
    }

    s(String str) {
        this.f6790d = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f6790d;
    }
}
