package hp;

import e4.i;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kq.j;
import kq.l;
import so.o;
import wo.h;
import xq.g;
import xq.r;
import xq.s;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f10981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lp.b f10982e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f10983i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j f10984v;

    public c(i c8, lp.b annotationOwner, boolean z5) {
        Intrinsics.checkNotNullParameter(c8, "c");
        Intrinsics.checkNotNullParameter(annotationOwner, "annotationOwner");
        this.f10981d = c8;
        this.f10982e = annotationOwner;
        this.f10983i = z5;
        this.f10984v = ((l) ((a) c8.f7980e).f10957a).d(new bp.i(4, this));
    }

    @Override // wo.h
    public final boolean P(up.c cVar) {
        return android.support.v4.media.session.b.o(this, cVar);
    }

    @Override // wo.h
    public final boolean isEmpty() {
        return this.f10982e.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        lp.b bVar = this.f10982e;
        s sVarN = r.n(CollectionsKt.C(bVar.getAnnotations()), this.f10984v);
        up.e eVar = fp.d.f9337a;
        xq.h hVarP = r.p(sVarN, fp.d.a(o.f20379m, bVar, this.f10981d));
        Intrinsics.checkNotNullParameter(hVarP, "<this>");
        g gVarI = r.i(hVarP, new n6.e(21));
        Intrinsics.checkNotNull(gVarI, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return new xq.d(gVarI);
    }

    @Override // wo.h
    public final wo.b z(up.c fqName) {
        wo.b bVar;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        lp.b bVar2 = this.f10982e;
        bp.d dVarA = bVar2.a(fqName);
        if (dVarA != null && (bVar = (wo.b) this.f10984v.invoke(dVarA)) != null) {
            return bVar;
        }
        up.e eVar = fp.d.f9337a;
        return fp.d.a(fqName, bVar2, this.f10981d);
    }
}
