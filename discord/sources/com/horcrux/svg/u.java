package com.horcrux.svg;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public enum u {
    OBJECT_BOUNDING_BOX("objectBoundingBox"),
    USER_SPACE_ON_USE("userSpaceOnUse");


    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final HashMap f6797v = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6799d;

    static {
        for (u uVar : values()) {
            f6797v.put(uVar.f6799d, uVar);
        }
    }

    u(String str) {
        this.f6799d = str;
    }

    public static u a(String str) {
        HashMap map = f6797v;
        if (map.containsKey(str)) {
            return (u) map.get(str);
        }
        throw new IllegalArgumentException(a3.e.l("Unknown 'Unit' Value: ", str));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f6799d;
    }
}
