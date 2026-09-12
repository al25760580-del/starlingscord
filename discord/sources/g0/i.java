package g0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f9444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f9445e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ i[] f9446i;

    static {
        i iVar = new i("Width", 0);
        f9444d = iVar;
        i iVar2 = new i("Height", 1);
        f9445e = iVar2;
        f9446i = new i[]{iVar, iVar2};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f9446i.clone();
    }
}
