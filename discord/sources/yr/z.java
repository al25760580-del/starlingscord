package yr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f23567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z f23568e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ z[] f23569i;

    /* JADX INFO: Fake field, exist only in values array */
    z EF0;

    static {
        z zVar = new z("ZERO", 0);
        z zVar2 = new z("ONE", 1);
        f23567d = zVar2;
        z zVar3 = new z("TWO", 2);
        z zVar4 = new z("FEW", 3);
        z zVar5 = new z("MANY", 4);
        z zVar6 = new z("OTHER", 5);
        f23568e = zVar6;
        f23569i = new z[]{zVar, zVar2, zVar3, zVar4, zVar5, zVar6};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f23569i.clone();
    }
}
