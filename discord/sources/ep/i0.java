package ep;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public class i0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i0 f8551e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i0 f8552i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final i0 f8553v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final h0 f8554w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ i0[] f8555x;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8556d;

    static {
        i0 i0Var = new i0(null, 0, "NULL");
        f8551e = i0Var;
        i0 i0Var2 = new i0(-1, 1, "INDEX");
        f8552i = i0Var2;
        i0 i0Var3 = new i0(Boolean.FALSE, 2, "FALSE");
        f8553v = i0Var3;
        h0 h0Var = new h0(null, 3, "MAP_GET_OR_DEFAULT");
        f8554w = h0Var;
        i0[] i0VarArr = {i0Var, i0Var2, i0Var3, h0Var};
        f8555x = i0VarArr;
        com.facebook.imagepipeline.nativecode.b.l(i0VarArr);
    }

    public i0(Object obj, int i7, String str) {
        super(str, i7);
        this.f8556d = obj;
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) f8555x.clone();
    }
}
