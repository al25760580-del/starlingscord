package dr;

import ar.m0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements m0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f7796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7797e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f7798i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ar.k f7799v;

    public w(y yVar, long j, Object obj, ar.k kVar) {
        this.f7796d = yVar;
        this.f7797e = j;
        this.f7798i = obj;
        this.f7799v = kVar;
    }

    @Override // ar.m0
    public final void dispose() {
        y yVar = this.f7796d;
        synchronized (yVar) {
            if (this.f7797e < yVar.o()) {
                return;
            }
            Object[] objArr = yVar.E;
            Intrinsics.checkNotNull(objArr);
            if (z.c(objArr, this.f7797e) != this) {
                return;
            }
            z.d(objArr, this.f7797e, z.f7810a);
            yVar.j();
            Unit unit = Unit.f14616a;
        }
    }
}
