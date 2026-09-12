package fn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f9324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f9325e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b[] f9326i;

    static {
        b bVar = new b("OnErrorDiscard", 0);
        f9324d = bVar;
        b bVar2 = new b("OnErrorRecover", 1);
        f9325e = bVar2;
        f9326i = new b[]{bVar, bVar2};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f9326i.clone();
    }
}
