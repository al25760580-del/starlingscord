package wp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f22473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f22474e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ s[] f22475i;

    static {
        r rVar = new r();
        f22473d = rVar;
        q qVar = new q();
        f22474e = qVar;
        s[] sVarArr = {rVar, qVar};
        f22475i = sVarArr;
        com.facebook.imagepipeline.nativecode.b.l(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f22475i.clone();
    }

    public abstract String a(String str);
}
