package up;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f21301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f21302e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i f21303i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ i[] f21304v;

    static {
        i iVar = new i("BEGINNING", 0);
        f21301d = iVar;
        i iVar2 = new i("MIDDLE", 1);
        f21302e = iVar2;
        i iVar3 = new i("AFTER_DOT", 2);
        f21303i = iVar3;
        i[] iVarArr = {iVar, iVar2, iVar3};
        f21304v = iVarArr;
        com.facebook.imagepipeline.nativecode.b.l(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f21304v.clone();
    }
}
