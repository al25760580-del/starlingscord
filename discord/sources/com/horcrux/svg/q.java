package com.horcrux.svg;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public enum q {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN("unknown"),
    /* JADX INFO: Fake field, exist only in values array */
    NORMAL("normal"),
    MULTIPLY("multiply"),
    /* JADX INFO: Fake field, exist only in values array */
    SCREEN("screen"),
    /* JADX INFO: Fake field, exist only in values array */
    DARKEN("darken"),
    /* JADX INFO: Fake field, exist only in values array */
    LIGHTEN("lighten");


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap f6782i = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6784d;

    static {
        for (q qVar : values()) {
            f6782i.put(qVar.f6784d, qVar);
        }
    }

    q(String str) {
        this.f6784d = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f6784d;
    }
}
