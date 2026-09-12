package com.swmansion.rnscreens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f7253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w f7254e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final w f7255i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final w f7256v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ w[] f7257w;

    static {
        w wVar = new w("DID_APPEAR", 0);
        f7253d = wVar;
        w wVar2 = new w("WILL_APPEAR", 1);
        f7254e = wVar2;
        w wVar3 = new w("DID_DISAPPEAR", 2);
        f7255i = wVar3;
        w wVar4 = new w("WILL_DISAPPEAR", 3);
        f7256v = wVar4;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4};
        f7257w = wVarArr;
        com.facebook.imagepipeline.nativecode.b.l(wVarArr);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f7257w.clone();
    }
}
