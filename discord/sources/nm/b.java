package nm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f16964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f16965e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f16966i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ b[] f16967v;

    static {
        b bVar = new b("INITIALIZED", 0);
        f16964d = bVar;
        b bVar2 = new b("START_DISPATCHED", 1);
        f16965e = bVar2;
        b bVar3 = new b("END_DISPATCHED", 2);
        f16966i = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        f16967v = bVarArr;
        com.facebook.imagepipeline.nativecode.b.l(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f16967v.clone();
    }
}
