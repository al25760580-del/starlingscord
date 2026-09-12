package uo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f21219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ h[] f21220e;

    static {
        h hVar = new h("FROM_DEPENDENCIES", 0);
        f21219d = hVar;
        h[] hVarArr = {hVar, new h("FROM_CLASS_LOADER", 1), new h("FALLBACK", 2)};
        f21220e = hVarArr;
        com.facebook.imagepipeline.nativecode.b.l(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f21220e.clone();
    }
}
