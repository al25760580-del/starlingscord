package com.horcrux.svg;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public enum t {
    /* JADX INFO: Fake field, exist only in values array */
    OVER("over"),
    /* JADX INFO: Fake field, exist only in values array */
    IN("in"),
    /* JADX INFO: Fake field, exist only in values array */
    OUT("out"),
    /* JADX INFO: Fake field, exist only in values array */
    ATOP("atop"),
    /* JADX INFO: Fake field, exist only in values array */
    XOR("xor"),
    ARITHMETIC("arithmetic");


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap f6792i = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6794d;

    static {
        for (t tVar : values()) {
            f6792i.put(tVar.f6794d, tVar);
        }
    }

    t(String str) {
        this.f6794d = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f6794d;
    }
}
