package rn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f19485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f19486e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m f19487i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ m[] f19488v;

    static {
        m mVar = new m("SYNCHRONIZED", 0);
        f19485d = mVar;
        m mVar2 = new m("PUBLICATION", 1);
        f19486e = mVar2;
        m mVar3 = new m("NONE", 2);
        f19487i = mVar3;
        m[] mVarArr = {mVar, mVar2, mVar3};
        f19488v = mVarArr;
        com.facebook.imagepipeline.nativecode.b.l(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f19488v.clone();
    }
}
