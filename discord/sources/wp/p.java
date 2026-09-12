package wp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f22470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p f22471e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ p[] f22472i;

    /* JADX INFO: Fake field, exist only in values array */
    p EF0;

    static {
        p pVar = new p("PRETTY", 0);
        p pVar2 = new p("DEBUG", 1);
        f22470d = pVar2;
        p pVar3 = new p("NONE", 2);
        f22471e = pVar3;
        p[] pVarArr = {pVar, pVar2, pVar3};
        f22472i = pVarArr;
        com.facebook.imagepipeline.nativecode.b.l(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f22472i.clone();
    }
}
