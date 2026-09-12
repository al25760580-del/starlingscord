package md;

import android.os.Handler;
import com.google.android.exoplayer2.Timeline;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends a {
    public final HashMap E = new HashMap();
    public Handler F;
    public he.u0 G;

    @Override // md.a
    public final void d() {
        for (f fVar : this.E.values()) {
            fVar.f15614a.c(fVar.f15615b);
        }
    }

    @Override // md.a
    public final void g() {
        for (f fVar : this.E.values()) {
            fVar.f15614a.f(fVar.f15615b);
        }
    }

    @Override // md.a
    public void s() {
        HashMap map = this.E;
        for (f fVar : map.values()) {
            a aVar = fVar.f15614a;
            e4.i iVar = fVar.f15616c;
            aVar.r(fVar.f15615b);
            aVar.u(iVar);
            aVar.t(iVar);
        }
        map.clear();
    }

    public abstract s v(Object obj, s sVar);

    public abstract void y(Object obj, a aVar, Timeline timeline);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [md.e, md.t] */
    public final void z(final Integer num, a aVar) {
        HashMap map = this.E;
        je.b.g(!map.containsKey(num));
        ?? r5 = new t() { // from class: md.e
            @Override // md.t
            public final void a(a aVar2, Timeline timeline) {
                this.f15610a.y(num, aVar2, timeline);
            }
        };
        e4.i iVar = new e4.i(this, num);
        map.put(num, new f(aVar, r5, iVar));
        Handler handler = this.F;
        handler.getClass();
        aVar.getClass();
        a1.d dVar = aVar.f15581i;
        dVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) dVar.f19v;
        v vVar = new v();
        vVar.f15714a = handler;
        vVar.f15715b = iVar;
        copyOnWriteArrayList.add(vVar);
        Handler handler2 = this.F;
        handler2.getClass();
        mc.n nVar = aVar.f15582v;
        nVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = nVar.f15570c;
        mc.m mVar = new mc.m();
        mVar.f15566a = handler2;
        mVar.f15567b = iVar;
        copyOnWriteArrayList2.add(mVar);
        he.u0 u0Var = this.G;
        hc.c0 c0Var = this.f15585y;
        je.b.l(c0Var);
        aVar.l(r5, u0Var, c0Var);
        if (this.f15580e.isEmpty()) {
            aVar.c(r5);
        }
    }

    public long w(long j, Object obj) {
        return j;
    }

    public int x(int i7, Object obj) {
        return i7;
    }
}
