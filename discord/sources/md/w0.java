package md;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends a {
    public final he.p E;
    public final DataSource.Factory F;
    public final Format G;
    public final o9.d I;
    public final s0 K;
    public final MediaItem L;
    public he.u0 M;
    public final long H = -9223372036854775807L;
    public final boolean J = true;

    public w0(gc.t0 t0Var, DataSource.Factory factory, o9.d dVar) {
        gc.p0 p0Var;
        this.F = factory;
        this.I = dVar;
        boolean z5 = true;
        gc.j0 j0Var = new gc.j0();
        gc.m0 m0Var = new gc.m0();
        m0Var.f9775c = ei.w0.f8376y;
        ei.c0 c0Var = ei.e0.f8303e;
        m0Var.f9779g = ei.r0.f8352w;
        List list = Collections.EMPTY_LIST;
        gc.q0 q0Var = gc.q0.f9821i;
        Uri uri = Uri.EMPTY;
        Uri uri2 = t0Var.f9853d;
        String string = uri2.toString();
        string.getClass();
        ei.e0 e0VarK = ei.e0.k(ei.e0.r(t0Var));
        if (m0Var.f9774b != null && m0Var.f9773a == null) {
            z5 = false;
        }
        je.b.k(z5);
        if (uri != null) {
            p0Var = new gc.p0(uri, null, m0Var.f9773a != null ? new gc.n0(m0Var) : null, null, list, null, e0VarK);
        } else {
            p0Var = null;
        }
        MediaItem mediaItem = new MediaItem(string, new gc.l0(j0Var), p0Var, new gc.o0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), MediaMetadata.f5540f0, q0Var);
        this.L = mediaItem;
        gc.g0 g0Var = new gc.g0();
        String str = t0Var.f9854e;
        g0Var.k = str == null ? "text/x-unknown" : str;
        g0Var.f9637c = t0Var.f9855i;
        g0Var.f9638d = t0Var.f9856v;
        g0Var.f9639e = t0Var.f9857w;
        g0Var.f9636b = t0Var.f9858x;
        String str2 = t0Var.f9859y;
        g0Var.f9635a = str2 != null ? str2 : null;
        this.G = new Format(g0Var);
        Map map = Collections.EMPTY_MAP;
        je.b.m(uri2, "The uri must be set.");
        this.E = new he.p(uri2, 0L, 1, null, map, 0L, -1L, null, 1);
        this.K = new s0(-9223372036854775807L, true, false, mediaItem);
    }

    @Override // md.a
    public final q b(s sVar, he.q qVar, long j) {
        return new v0(this.E, this.F, this.M, this.G, this.H, this.I, a(sVar), this.J);
    }

    @Override // md.a
    public final MediaItem i() {
        return this.L;
    }

    @Override // md.a
    public final void m(he.u0 u0Var) {
        this.M = u0Var;
        o(this.K);
    }

    @Override // md.a
    public final void q(q qVar) {
        ((v0) qVar).F.e(null);
    }

    @Override // md.a
    public final void k() {
    }

    @Override // md.a
    public final void s() {
    }
}
