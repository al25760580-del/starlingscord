package gn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f10159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f10160e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ n[] f10161i;

    static {
        n nVar = new n("PADDING", 0);
        f10159d = nVar;
        n nVar2 = new n("MARGIN", 1);
        f10160e = nVar2;
        n[] nVarArr = {nVar, nVar2};
        f10161i = nVarArr;
        com.facebook.imagepipeline.nativecode.b.l(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f10161i.clone();
    }
}
