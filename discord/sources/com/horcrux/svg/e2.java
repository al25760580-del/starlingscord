package com.horcrux.svg;

import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public enum e2 {
    None(ViewProps.NONE),
    /* JADX INFO: Fake field, exist only in values array */
    Underline("underline"),
    /* JADX INFO: Fake field, exist only in values array */
    Overline("overline"),
    /* JADX INFO: Fake field, exist only in values array */
    LineThrough("line-through"),
    /* JADX INFO: Fake field, exist only in values array */
    Blink("blink");


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap f6702i = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6704d;

    static {
        for (e2 e2Var : values()) {
            f6702i.put(e2Var.f6704d, e2Var);
        }
    }

    e2(String str) {
        this.f6704d = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f6704d;
    }
}
