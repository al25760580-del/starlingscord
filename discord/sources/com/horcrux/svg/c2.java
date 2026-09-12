package com.horcrux.svg;

import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public enum c2 {
    baseline("baseline"),
    /* JADX INFO: Fake field, exist only in values array */
    textBottom("text-bottom"),
    /* JADX INFO: Fake field, exist only in values array */
    alphabetic("alphabetic"),
    /* JADX INFO: Fake field, exist only in values array */
    ideographic("ideographic"),
    /* JADX INFO: Fake field, exist only in values array */
    middle("middle"),
    /* JADX INFO: Fake field, exist only in values array */
    central("central"),
    /* JADX INFO: Fake field, exist only in values array */
    mathematical("mathematical"),
    /* JADX INFO: Fake field, exist only in values array */
    textTop("text-top"),
    /* JADX INFO: Fake field, exist only in values array */
    bottom(ViewProps.BOTTOM),
    /* JADX INFO: Fake field, exist only in values array */
    center("center"),
    /* JADX INFO: Fake field, exist only in values array */
    top(ViewProps.TOP),
    /* JADX INFO: Fake field, exist only in values array */
    textBeforeEdge("text-before-edge"),
    /* JADX INFO: Fake field, exist only in values array */
    textAfterEdge("text-after-edge"),
    /* JADX INFO: Fake field, exist only in values array */
    beforeEdge("before-edge"),
    /* JADX INFO: Fake field, exist only in values array */
    afterEdge("after-edge"),
    /* JADX INFO: Fake field, exist only in values array */
    hanging("hanging");


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap f6680i = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6682d;

    static {
        for (c2 c2Var : values()) {
            f6680i.put(c2Var.f6682d, c2Var);
        }
    }

    c2(String str) {
        this.f6682d = str;
    }

    public static c2 a(String str) {
        HashMap map = f6680i;
        if (map.containsKey(str)) {
            return (c2) map.get(str);
        }
        throw new IllegalArgumentException(a3.e.l("Unknown String Value: ", str));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f6682d;
    }
}
