package c5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f3503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ m[] f3504e;

    /* JADX INFO: Fake field, exist only in values array */
    m EF0;

    static {
        m mVar = new m("LOW", 0);
        m mVar2 = new m("NORMAL", 1);
        f3503d = mVar2;
        f3504e = new m[]{mVar, mVar2, new m("HIGH", 2), new m("IMMEDIATE", 3)};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f3504e.clone();
    }
}
