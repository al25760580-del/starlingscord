package sd;

import a5.b0;
import android.net.Uri;
import android.os.SystemClock;
import bh.t;
import java.util.HashMap;
import java.util.List;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f19842d;

    public a(c cVar) {
        this.f19842d = cVar;
    }

    @Override // sd.q
    public final void b() {
        this.f19842d.f19854w.remove(this);
    }

    @Override // sd.q
    public final boolean c(Uri uri, b0 b0Var, boolean z5) {
        b bVar;
        c cVar = this.f19842d;
        HashMap map = cVar.f19853v;
        if (cVar.I == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            l lVar = cVar.G;
            int i7 = e0.f13788a;
            List list = lVar.f19900e;
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                b bVar2 = (b) map.get(((k) list.get(i11)).f19892a);
                if (bVar2 != null && jElapsedRealtime < bVar2.E) {
                    i10++;
                }
            }
            t tVar = new t(1, 0, cVar.G.f19900e.size(), i10);
            cVar.f19852i.getClass();
            ad.f fVarJ = o9.d.j(tVar, b0Var);
            if (fVarJ != null && fVarJ.f347a == 2 && (bVar = (b) map.get(uri)) != null) {
                b.a(bVar, fVarJ.f348b);
            }
        }
        return false;
    }
}
