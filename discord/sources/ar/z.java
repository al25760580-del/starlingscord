package ar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f2985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z f2986e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final z f2987i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final z f2988v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ z[] f2989w;

    static {
        z zVar = new z("DEFAULT", 0);
        f2985d = zVar;
        z zVar2 = new z("LAZY", 1);
        f2986e = zVar2;
        z zVar3 = new z("ATOMIC", 2);
        f2987i = zVar3;
        z zVar4 = new z("UNDISPATCHED", 3);
        f2988v = zVar4;
        z[] zVarArr = {zVar, zVar2, zVar3, zVar4};
        f2989w = zVarArr;
        com.facebook.imagepipeline.nativecode.b.l(zVarArr);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f2989w.clone();
    }
}
