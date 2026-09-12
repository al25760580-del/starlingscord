package jq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f14033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f14034e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ k[] f14035i;

    static {
        k kVar = new k("STABLE", 0);
        f14033d = kVar;
        k kVar2 = new k("UNSTABLE", 1);
        f14034e = kVar2;
        k[] kVarArr = {kVar, kVar2};
        f14035i = kVarArr;
        com.facebook.imagepipeline.nativecode.b.l(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f14035i.clone();
    }
}
