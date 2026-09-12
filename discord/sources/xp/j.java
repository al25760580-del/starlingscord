package xp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f23004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f23005e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j f23006i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ j[] f23007v;

    static {
        j jVar = new j("OVERRIDABLE", 0);
        f23004d = jVar;
        j jVar2 = new j("INCOMPATIBLE", 1);
        f23005e = jVar2;
        j jVar3 = new j("CONFLICT", 2);
        f23006i = jVar3;
        f23007v = new j[]{jVar, jVar2, jVar3};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f23007v.clone();
    }
}
