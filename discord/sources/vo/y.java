package vo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o0 f21851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y f21852e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final y f21853i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final y f21854v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final y f21855w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ y[] f21856x;

    static {
        y yVar = new y("FINAL", 0);
        f21852e = yVar;
        y yVar2 = new y("SEALED", 1);
        f21853i = yVar2;
        y yVar3 = new y("OPEN", 2);
        f21854v = yVar3;
        y yVar4 = new y("ABSTRACT", 3);
        f21855w = yVar4;
        y[] yVarArr = {yVar, yVar2, yVar3, yVar4};
        f21856x = yVarArr;
        com.facebook.imagepipeline.nativecode.b.l(yVarArr);
        f21851d = new o0(5);
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f21856x.clone();
    }
}
