package pd;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import e4.r;
import gc.h1;
import he.q;
import je.e0;
import md.k0;
import md.n0;
import pc.w;
import pc.x;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f18006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f18007b = new r(7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cd.d f18008c = new cd.d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18009d = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f18010e;

    public o(p pVar, q qVar) {
        this.f18010e = pVar;
        this.f18006a = new n0(qVar, null, null);
    }

    @Override // pc.x
    public final int a(he.k kVar, int i7, boolean z5) {
        return this.f18006a.b(kVar, i7, z5);
    }

    @Override // pc.x
    public final void c(long j, int i7, int i10, int i11, w wVar) {
        long jF;
        long jL;
        this.f18006a.c(j, i7, i10, i11, wVar);
        while (this.f18006a.r(false)) {
            cd.d dVar = this.f18008c;
            dVar.e();
            if (this.f18006a.w(this.f18007b, dVar, 0, false) == -4) {
                dVar.j();
            } else {
                dVar = null;
            }
            if (dVar != null) {
                long j5 = dVar.f15012x;
                Metadata metadataI = this.f18010e.f18013i.i(dVar);
                if (metadataI != null) {
                    ed.a aVar = (ed.a) metadataI.f5693d[0];
                    String str = aVar.f8131d;
                    String str2 = aVar.f8132e;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jL = e0.L(e0.n(aVar.f8135w));
                        } catch (h1 unused) {
                            jL = -9223372036854775807L;
                        }
                        if (jL != -9223372036854775807L) {
                            n nVar = new n(j5, jL);
                            Handler handler = this.f18010e.f18014v;
                            handler.sendMessage(handler.obtainMessage(1, nVar));
                        }
                    }
                }
            }
        }
        n0 n0Var = this.f18006a;
        k0 k0Var = n0Var.f15665a;
        synchronized (n0Var) {
            int i12 = n0Var.f15681s;
            jF = i12 == 0 ? -1L : n0Var.f(i12);
        }
        k0Var.b(jF);
    }

    @Override // pc.x
    public final void d(int i7, je.w wVar) {
        this.f18006a.d(i7, wVar);
    }

    @Override // pc.x
    public final void e(Format format) {
        this.f18006a.e(format);
    }
}
