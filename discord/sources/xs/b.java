package xs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f23081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f23082e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f23083i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f23084v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f23085w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ b[] f23086x;

    static {
        b bVar = new b("CRONET_SOURCE_UNSPECIFIED", 0);
        f23081d = bVar;
        b bVar2 = new b("CRONET_SOURCE_STATICALLY_LINKED", 1);
        f23082e = bVar2;
        b bVar3 = new b("CRONET_SOURCE_PLAY_SERVICES", 2);
        f23083i = bVar3;
        b bVar4 = new b("CRONET_SOURCE_FALLBACK", 3);
        f23084v = bVar4;
        b bVar5 = new b("CRONET_SOURCE_PLATFORM", 4);
        f23085w = bVar5;
        f23086x = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, new b("CRONET_SOURCE_FAKE", 5)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f23086x.clone();
    }
}
