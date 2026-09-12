package he;

import android.net.Uri;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f10635e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f10636i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s0 f10637v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m0 f10638w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile Object f10639x;

    public n0(DataSource dataSource, Uri uri, int i7, m0 m0Var) {
        Map map = Collections.EMPTY_MAP;
        je.b.m(uri, "The uri must be set.");
        p pVar = new p(uri, 0L, 1, null, map, 0L, -1L, null, 1);
        this.f10637v = new s0(dataSource);
        this.f10635e = pVar;
        this.f10636i = i7;
        this.f10638w = m0Var;
        this.f10634d = LoadEventInfo.f5695c.getAndIncrement();
    }

    @Override // he.h0
    public final void l() {
        this.f10637v.f10699e = 0L;
        n nVar = new n(this.f10637v, this.f10635e);
        try {
            nVar.c();
            Uri uriY = this.f10637v.f10698d.y();
            uriY.getClass();
            this.f10639x = this.f10638w.j(uriY, nVar);
        } finally {
            je.e0.g(nVar);
        }
    }

    @Override // he.h0
    public final void t() {
    }
}
