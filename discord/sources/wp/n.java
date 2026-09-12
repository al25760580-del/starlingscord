package wp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f22463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f22464e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ n[] f22465i;

    static {
        n nVar = new n("RENDER_OVERRIDE", 0);
        f22463d = nVar;
        n nVar2 = new n("RENDER_OPEN", 1);
        f22464e = nVar2;
        n[] nVarArr = {nVar, nVar2, new n("RENDER_OPEN_OVERRIDE", 2)};
        f22465i = nVarArr;
        com.facebook.imagepipeline.nativecode.b.l(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f22465i.clone();
    }
}
