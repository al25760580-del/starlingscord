package com.reactnativecommunity.webview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f7061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f7062e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ m[] f7063i;

    /* JADX INFO: Fake field, exist only in values array */
    m EF0;

    static {
        m mVar = new m("DEFAULT", 0);
        m mVar2 = new m("IMAGE", 1);
        f7061d = mVar2;
        m mVar3 = new m("VIDEO", 2);
        f7062e = mVar3;
        f7063i = new m[]{mVar, mVar2, mVar3};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f7063i.clone();
    }
}
