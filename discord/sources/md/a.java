package md;

import android.os.Looper;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f15579d = new ArrayList(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f15580e = new HashSet(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a1.d f15581i = new a1.d(new CopyOnWriteArrayList(), 0, (s) null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final mc.n f15582v = new mc.n(new CopyOnWriteArrayList(), 0, null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Looper f15583w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Timeline f15584x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public hc.c0 f15585y;

    public final a1.d a(s sVar) {
        return new a1.d((CopyOnWriteArrayList) this.f15581i.f19v, 0, sVar);
    }

    public abstract q b(s sVar, he.q qVar, long j);

    public final void c(t tVar) {
        HashSet hashSet = this.f15580e;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(tVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        d();
    }

    public final void f(t tVar) {
        this.f15583w.getClass();
        HashSet hashSet = this.f15580e;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(tVar);
        if (zIsEmpty) {
            g();
        }
    }

    public Timeline h() {
        return null;
    }

    public abstract MediaItem i();

    public boolean j() {
        return true;
    }

    public abstract void k();

    public final void l(t tVar, he.u0 u0Var, hc.c0 c0Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f15583w;
        je.b.g(looper == null || looper == looperMyLooper);
        this.f15585y = c0Var;
        Timeline timeline = this.f15584x;
        this.f15579d.add(tVar);
        if (this.f15583w == null) {
            this.f15583w = looperMyLooper;
            this.f15580e.add(tVar);
            m(u0Var);
        } else if (timeline != null) {
            f(tVar);
            tVar.a(this, timeline);
        }
    }

    public abstract void m(he.u0 u0Var);

    public final void o(Timeline timeline) {
        this.f15584x = timeline;
        Iterator it = this.f15579d.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(this, timeline);
        }
    }

    public abstract void q(q qVar);

    public final void r(t tVar) {
        ArrayList arrayList = this.f15579d;
        arrayList.remove(tVar);
        if (!arrayList.isEmpty()) {
            c(tVar);
            return;
        }
        this.f15583w = null;
        this.f15584x = null;
        this.f15585y = null;
        this.f15580e.clear();
        s();
    }

    public abstract void s();

    public final void t(mc.o oVar) {
        CopyOnWriteArrayList<mc.m> copyOnWriteArrayList = this.f15582v.f15570c;
        for (mc.m mVar : copyOnWriteArrayList) {
            if (mVar.f15567b == oVar) {
                copyOnWriteArrayList.remove(mVar);
            }
        }
    }

    public final void u(w wVar) {
        CopyOnWriteArrayList<v> copyOnWriteArrayList = (CopyOnWriteArrayList) this.f15581i.f19v;
        for (v vVar : copyOnWriteArrayList) {
            if (vVar.f15715b == wVar) {
                copyOnWriteArrayList.remove(vVar);
            }
        }
    }

    public void d() {
    }

    public void g() {
    }
}
