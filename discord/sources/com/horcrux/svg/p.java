package com.horcrux.svg;

import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public enum p {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN("unknown"),
    /* JADX INFO: Fake field, exist only in values array */
    DUPLICATE("duplicate"),
    /* JADX INFO: Fake field, exist only in values array */
    WRAP("wrap"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE(ViewProps.NONE);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f6777e = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6779d;

    static {
        for (p pVar : values()) {
            f6777e.put(pVar.f6779d, pVar);
        }
    }

    p(String str) {
        this.f6779d = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f6779d;
    }
}
