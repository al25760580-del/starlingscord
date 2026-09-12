package mo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f15954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w f15955e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final w f15956i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ w[] f15957v;

    static {
        w wVar = new w("INVARIANT", 0);
        f15954d = wVar;
        w wVar2 = new w("IN", 1);
        f15955e = wVar2;
        w wVar3 = new w("OUT", 2);
        f15956i = wVar3;
        w[] wVarArr = {wVar, wVar2, wVar3};
        f15957v = wVarArr;
        com.facebook.imagepipeline.nativecode.b.l(wVarArr);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f15957v.clone();
    }
}
