package sd;

import ei.e0;
import ei.w0;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f19873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f19876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f19877i;
    public final int j;
    public final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f19878l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f19879m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f19880n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f19881o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f19882p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mc.i f19883q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e0 f19884r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e0 f19885s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w0 f19886t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f19887u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h f19888v;

    public i(int i7, String str, List list, long j, boolean z5, long j5, boolean z6, int i10, long j7, int i11, long j10, long j11, boolean z7, boolean z10, boolean z11, mc.i iVar, List list2, List list3, h hVar, Map map) {
        super(str, list, z7);
        this.f19872d = i7;
        this.f19876h = j5;
        this.f19875g = z5;
        this.f19877i = z6;
        this.j = i10;
        this.k = j7;
        this.f19878l = i11;
        this.f19879m = j10;
        this.f19880n = j11;
        this.f19881o = z10;
        this.f19882p = z11;
        this.f19883q = iVar;
        this.f19884r = e0.k(list2);
        this.f19885s = e0.k(list3);
        this.f19886t = w0.a(map);
        if (!list3.isEmpty()) {
            d dVar = (d) ei.p.i(list3);
            this.f19887u = dVar.f19864w + dVar.f19862i;
        } else if (list2.isEmpty()) {
            this.f19887u = 0L;
        } else {
            f fVar = (f) ei.p.i(list2);
            this.f19887u = fVar.f19864w + fVar.f19862i;
        }
        this.f19873e = j != -9223372036854775807L ? j >= 0 ? Math.min(this.f19887u, j) : Math.max(0L, this.f19887u + j) : -9223372036854775807L;
        this.f19874f = j >= 0;
        this.f19888v = hVar;
    }

    @Override // ld.a
    public final Object a(List list) {
        return this;
    }
}
