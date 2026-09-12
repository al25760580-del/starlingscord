package gn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f10148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f10149e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j f10150i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ j[] f10151v;

    static {
        j jVar = new j("OFF", 0);
        f10148d = jVar;
        j jVar2 = new j("ADDITIVE", 1);
        f10149e = jVar2;
        j jVar3 = new j("MAXIMUM", 2);
        f10150i = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
        f10151v = jVarArr;
        com.facebook.imagepipeline.nativecode.b.l(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f10151v.clone();
    }
}
