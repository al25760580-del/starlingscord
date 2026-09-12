package bq;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.e0;
import kotlin.collections.n0;
import yo.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements vq.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f3376e = new a(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3377d;

    public /* synthetic */ a(int i7) {
        this.f3377d = i7;
    }

    @Override // vq.b
    public final Iterable b(Object obj) {
        Collection collectionH;
        switch (this.f3377d) {
            case 0:
                int i7 = e.f3383a;
                Collection collectionH2 = ((q0) obj).h();
                ArrayList arrayList = new ArrayList(e0.l(collectionH2, 10));
                Iterator it = ((ArrayList) collectionH2).iterator();
                while (it.hasNext()) {
                    arrayList.add(((q0) it.next()).a());
                }
                return arrayList;
            default:
                vo.d dVar = (vo.d) obj;
                return (dVar == null || (collectionH = dVar.h()) == null) ? n0.f14659d : collectionH;
        }
    }
}
