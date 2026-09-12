package tm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f20834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f20835e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ d[] f20836i;

    static {
        d dVar = new d("DETACHED", 0);
        f20834d = dVar;
        d dVar2 = new d("ATTACHED", 1);
        f20835e = dVar2;
        d[] dVarArr = {dVar, dVar2};
        f20836i = dVarArr;
        com.facebook.imagepipeline.nativecode.b.l(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f20836i.clone();
    }
}
