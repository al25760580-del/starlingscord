package vo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f21792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f21793e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f21794i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c f21795v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ c[] f21796w;

    static {
        c cVar = new c("DECLARATION", 0);
        f21792d = cVar;
        c cVar2 = new c("FAKE_OVERRIDE", 1);
        f21793e = cVar2;
        c cVar3 = new c("DELEGATION", 2);
        f21794i = cVar3;
        c cVar4 = new c("SYNTHESIZED", 3);
        f21795v = cVar4;
        f21796w = new c[]{cVar, cVar2, cVar3, cVar4};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f21796w.clone();
    }
}
