package net.time4j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m implements g0 {
    public static final k E;
    public static final /* synthetic */ m[] F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f16664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f16665e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f16666i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final g f16667v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final h f16668w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final i f16669x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final j f16670y;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private final g0 f16671co;
    private final g0 eof;
    private final g0 joda;
    private final g0 kld;
    private final g0 nvd;

    /* JADX INFO: renamed from: ui, reason: collision with root package name */
    private final g0 f16672ui;

    static {
        d dVar = new d("MILLENNIA", 0);
        f16664d = dVar;
        e eVar = new e("CENTURIES", 1);
        f16665e = eVar;
        f fVar = new f("DECADES", 2);
        f16666i = fVar;
        g gVar = new g("YEARS", 3);
        f16667v = gVar;
        h hVar = new h("QUARTERS", 4);
        f16668w = hVar;
        i iVar = new i("MONTHS", 5);
        f16669x = iVar;
        j jVar = new j("WEEKS", 6);
        f16670y = jVar;
        k kVar = new k("DAYS", 7);
        E = kVar;
        F = new m[]{dVar, eVar, fVar, gVar, hVar, iVar, jVar, kVar};
    }

    public m(String str, int i7) {
        super(str, i7);
        this.eof = new t0(this, 2);
        this.kld = new t0(this, 5);
        this.f16672ui = new t0(this, 4);
        this.nvd = new t0(this, 1);
        this.f16671co = new t0(this, 3);
        this.joda = new t0(this, 6);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) F.clone();
    }

    @Override // xr.h
    public final boolean b() {
        return true;
    }
}
