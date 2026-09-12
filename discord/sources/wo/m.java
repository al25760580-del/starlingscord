package wo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f22389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f22390e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m f22391i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ m[] f22392v;

    static {
        m mVar = new m("RUNTIME", 0);
        f22389d = mVar;
        m mVar2 = new m("BINARY", 1);
        f22390e = mVar2;
        m mVar3 = new m("SOURCE", 2);
        f22391i = mVar3;
        m[] mVarArr = {mVar, mVar2, mVar3};
        f22392v = mVarArr;
        com.facebook.imagepipeline.nativecode.b.l(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f22392v.clone();
    }
}
