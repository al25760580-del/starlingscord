package md;

import android.net.Uri;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements he.h0 {
    public long F;
    public he.p G;
    public n0 H;
    public boolean I;
    public final /* synthetic */ g0 J;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f15603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final he.s0 f15604e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e4.m f15605i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final g0 f15606v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a5.i0 f15607w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile boolean f15609y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final pc.n f15608x = new pc.n();
    public boolean E = true;

    public d0(g0 g0Var, Uri uri, DataSource dataSource, e4.m mVar, g0 g0Var2, a5.i0 i0Var) {
        this.J = g0Var;
        this.f15603d = uri;
        this.f15604e = new he.s0(dataSource);
        this.f15605i = mVar;
        this.f15606v = g0Var2;
        this.f15607w = i0Var;
        LoadEventInfo.f5695c.getAndIncrement();
        this.G = a(0L);
    }

    public final he.p a(long j) {
        Map map = Collections.EMPTY_MAP;
        String str = this.J.F;
        Map map2 = g0.f15619j0;
        Uri uri = this.f15603d;
        je.b.m(uri, "The uri must be set.");
        return new he.p(uri, 0L, 1, null, map2, j, -1L, str, 6);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x002f */
    @Override // he.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: md.d0.l():void");
    }

    @Override // he.h0
    public final void t() {
        this.f15609y = true;
    }
}
