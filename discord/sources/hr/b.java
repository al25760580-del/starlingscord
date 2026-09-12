package hr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f11090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f11091e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f11092i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f11093v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f11094w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ b[] f11095x;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f11090d = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f11091e = bVar2;
        b bVar3 = new b("PARKING", 2);
        f11092i = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f11093v = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f11094w = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f11095x = bVarArr;
        com.facebook.imagepipeline.nativecode.b.l(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f11095x.clone();
    }
}
