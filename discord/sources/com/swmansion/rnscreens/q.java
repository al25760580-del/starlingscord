package com.swmansion.rnscreens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f7228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f7229e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q f7230i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final q f7231v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ q[] f7232w;

    static {
        q qVar = new q("ORIENTATION", 0);
        f7228d = qVar;
        q qVar2 = new q("STYLE", 1);
        f7229e = qVar2;
        q qVar3 = new q("HIDDEN", 2);
        f7230i = qVar3;
        q qVar4 = new q("ANIMATED", 3);
        q qVar5 = new q("NAVIGATION_BAR_HIDDEN", 4);
        f7231v = qVar5;
        q[] qVarArr = {qVar, qVar2, qVar3, qVar4, qVar5};
        f7232w = qVarArr;
        com.facebook.imagepipeline.nativecode.b.l(qVarArr);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f7232w.clone();
    }
}
