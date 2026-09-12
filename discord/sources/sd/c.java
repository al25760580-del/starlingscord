package sd;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.discord.jank_stats.JankRecordStore;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.LoadEventInfo;
import gc.g0;
import gc.h1;
import he.a0;
import he.f0;
import he.h0;
import he.j0;
import he.k0;
import he.n0;
import he.s0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements f0 {
    public static final mc.q L = new mc.q(26);
    public Handler E;
    public rd.o F;
    public l G;
    public Uri H;
    public i I;
    public boolean J;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rd.c f19850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f19851e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o9.d f19852i;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a1.d f19855x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public k0 f19856y;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CopyOnWriteArrayList f19854w = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final HashMap f19853v = new HashMap();
    public long K = -9223372036854775807L;

    public c(rd.c cVar, o9.d dVar, p pVar) {
        this.f19850d = cVar;
        this.f19851e = pVar;
        this.f19852i = dVar;
    }

    public final i a(boolean z5, Uri uri) {
        HashMap map = this.f19853v;
        i iVar = ((b) map.get(uri)).f19846v;
        if (iVar != null && z5 && !uri.equals(this.H)) {
            List list = this.G.f19900e;
            for (int i7 = 0; i7 < list.size(); i7++) {
                if (uri.equals(((k) list.get(i7)).f19892a)) {
                    i iVar2 = this.I;
                    if (iVar2 != null && iVar2.f19881o) {
                        break;
                    }
                    this.H = uri;
                    b bVar = (b) map.get(uri);
                    i iVar3 = bVar.f19846v;
                    if (iVar3 == null || !iVar3.f19881o) {
                        bVar.c(b(uri));
                        return iVar;
                    }
                    this.I = iVar3;
                    this.F.w(iVar3);
                    return iVar;
                }
            }
        }
        return iVar;
    }

    public final Uri b(Uri uri) {
        e eVar;
        i iVar = this.I;
        if (iVar == null || !iVar.f19888v.f19871e || (eVar = (e) iVar.f19886t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(eVar.f19858b));
        int i7 = eVar.f19859c;
        if (i7 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i7));
        }
        return builderBuildUpon.build();
    }

    public final boolean c(Uri uri) {
        int i7;
        b bVar = (b) this.f19853v.get(uri);
        if (bVar.f19846v == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(JankRecordStore.FLUSH_INTERVAL_MS, e0.U(bVar.f19846v.f19887u));
        i iVar = bVar.f19846v;
        return iVar.f19881o || (i7 = iVar.f19872d) == 2 || i7 == 1 || bVar.f19847w + jMax > jElapsedRealtime;
    }

    @Override // he.f0
    public final void e(h0 h0Var, long j, long j5) {
        l lVar;
        n0 n0Var = (n0) h0Var;
        m mVar = (m) n0Var.f10639x;
        boolean z5 = mVar instanceof i;
        if (z5) {
            String str = mVar.f19907a;
            l lVar2 = l.f19898n;
            Uri uri = Uri.parse(str);
            g0 g0Var = new g0();
            g0Var.f9635a = "0";
            g0Var.j = "application/x-mpegURL";
            List listSingletonList = Collections.singletonList(new k(uri, new Format(g0Var), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            lVar = new l("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            lVar = (l) mVar;
        }
        this.G = lVar;
        this.H = ((k) lVar.f19900e.get(0)).f19892a;
        this.f19854w.add(new a(this));
        List list2 = lVar.f19899d;
        int size = list2.size();
        for (int i7 = 0; i7 < size; i7++) {
            Uri uri2 = (Uri) list2.get(i7);
            this.f19853v.put(uri2, new b(this, uri2));
        }
        s0 s0Var = n0Var.f10637v;
        Uri uri3 = s0Var.f10700i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(s0Var.f10699e, s0Var.f10701v);
        b bVar = (b) this.f19853v.get(this.H);
        if (z5) {
            bVar.d((i) mVar);
        } else {
            bVar.c(bVar.f19843d);
        }
        this.f19852i.getClass();
        this.f19855x.m(loadEventInfo, 4);
    }

    @Override // he.f0
    public final ad.f n(h0 h0Var, long j, long j5, IOException iOException, int i7) {
        long jMin;
        n0 n0Var = (n0) h0Var;
        long j7 = n0Var.f10634d;
        s0 s0Var = n0Var.f10637v;
        Uri uri = s0Var.f10700i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(s0Var.f10699e, s0Var.f10701v);
        int i10 = n0Var.f10636i;
        this.f19852i.getClass();
        if (!(iOException instanceof h1) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof a0) && !(iOException instanceof j0)) {
            int i11 = he.m.f10627e;
            Throwable cause = iOException;
            while (true) {
                if (cause == null) {
                    jMin = Math.min((i7 - 1) * 1000, 5000);
                    break;
                }
                if ((cause instanceof he.m) && ((he.m) cause).f10628d == 2008) {
                    jMin = -9223372036854775807L;
                    break;
                }
                cause = cause.getCause();
            }
        } else {
            jMin = -9223372036854775807L;
            break;
        }
        boolean z5 = jMin == -9223372036854775807L;
        this.f19855x.q(loadEventInfo, i10, iOException, z5);
        return z5 ? k0.f10620x : new ad.f(0, jMin, false);
    }

    @Override // he.f0
    public final void p(h0 h0Var, long j, long j5, boolean z5) {
        n0 n0Var = (n0) h0Var;
        long j7 = n0Var.f10634d;
        s0 s0Var = n0Var.f10637v;
        Uri uri = s0Var.f10700i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(s0Var.f10699e, s0Var.f10701v);
        this.f19852i.getClass();
        this.f19855x.k(loadEventInfo, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
