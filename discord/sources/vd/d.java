package vd;

import java.util.ArrayDeque;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends lc.g implements f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f f21646v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f21647w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f21648x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f21649y;

    public /* synthetic */ d() {
        this.f21648x = 2;
    }

    @Override // lc.g
    public final void e() {
        switch (this.f21648x) {
            case 0:
                ArrayDeque arrayDeque = (ArrayDeque) ((lh.d) this.f21649y).f15092e;
                je.b.k(arrayDeque.size() < 2);
                je.b.g(!arrayDeque.contains(this));
                this.f14999e = 0;
                this.f21646v = null;
                arrayDeque.addFirst(this);
                return;
            case 1:
                e eVar = (e) this.f21649y;
                synchronized (eVar.f21651b) {
                    this.f14999e = 0;
                    this.f21646v = null;
                    lc.g[] gVarArr = eVar.f21655f;
                    int i7 = eVar.f21657h;
                    eVar.f21657h = i7 + 1;
                    gVarArr[i7] = this;
                    if (!eVar.f21652c.isEmpty() && eVar.f21657h > 0) {
                        eVar.f21651b.notify();
                    }
                    break;
                }
                return;
            default:
                wd.h hVar = (wd.h) ((mi.a) this.f21649y).f15798e;
                this.f14999e = 0;
                this.f21646v = null;
                hVar.f22188b.add(this);
                return;
        }
    }

    @Override // vd.f
    public final int f(long j) {
        f fVar = this.f21646v;
        fVar.getClass();
        return fVar.f(j - this.f21647w);
    }

    public final void g(long j, f fVar, long j5) {
        this.f15014i = j;
        this.f21646v = fVar;
        if (j5 != LongCompanionObject.MAX_VALUE) {
            j = j5;
        }
        this.f21647w = j;
    }

    @Override // vd.f
    public final long h(int i7) {
        f fVar = this.f21646v;
        fVar.getClass();
        return fVar.h(i7) + this.f21647w;
    }

    @Override // vd.f
    public final List l(long j) {
        f fVar = this.f21646v;
        fVar.getClass();
        return fVar.l(j - this.f21647w);
    }

    @Override // vd.f
    public final int o() {
        f fVar = this.f21646v;
        fVar.getClass();
        return fVar.o();
    }

    public /* synthetic */ d(g gVar, int i7) {
        this.f21648x = i7;
        this.f21649y = gVar;
    }
}
