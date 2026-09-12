package o4;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f17122c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e4.c f17124e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17120a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17121b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f17123d = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f17125f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f17126g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f17127h = -1.0f;

    public e(List list) {
        b dVar;
        if (list.isEmpty()) {
            dVar = new io.sentry.hints.j(13);
        } else {
            dVar = list.size() == 1 ? new d(list) : new c(list);
        }
        this.f17122c = dVar;
    }

    public final void a(a aVar) {
        this.f17120a.add(aVar);
    }

    public float b() {
        if (this.f17127h == -1.0f) {
            this.f17127h = this.f17122c.n();
        }
        return this.f17127h;
    }

    public final float c() {
        Interpolator interpolator;
        y4.a aVarF = this.f17122c.f();
        if (aVarF == null || aVarF.c() || (interpolator = aVarF.f23196d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(d());
    }

    public final float d() {
        if (this.f17121b) {
            return 0.0f;
        }
        y4.a aVarF = this.f17122c.f();
        if (aVarF.c()) {
            return 0.0f;
        }
        return (this.f17123d - aVarF.b()) / (aVarF.a() - aVarF.b());
    }

    public Object e() {
        float fD = d();
        e4.c cVar = this.f17124e;
        b bVar = this.f17122c;
        if (cVar == null && bVar.d(fD)) {
            return this.f17125f;
        }
        y4.a aVarF = bVar.f();
        Interpolator interpolator = aVarF.f23197e;
        Interpolator interpolator2 = aVarF.f23198f;
        Object objF = (interpolator == null || interpolator2 == null) ? f(aVarF, c()) : g(aVarF, fD, interpolator.getInterpolation(fD), interpolator2.getInterpolation(fD));
        this.f17125f = objF;
        return objF;
    }

    public abstract Object f(y4.a aVar, float f2);

    public Object g(y4.a aVar, float f2, float f7, float f10) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f17120a;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i7)).a();
            i7++;
        }
    }

    public void i(float f2) {
        b bVar = this.f17122c;
        if (bVar.isEmpty()) {
            return;
        }
        if (this.f17126g == -1.0f) {
            this.f17126g = bVar.p();
        }
        float f7 = this.f17126g;
        if (f2 < f7) {
            if (f7 == -1.0f) {
                this.f17126g = bVar.p();
            }
            f2 = this.f17126g;
        } else if (f2 > b()) {
            f2 = b();
        }
        if (f2 == this.f17123d) {
            return;
        }
        this.f17123d = f2;
        if (bVar.j(f2)) {
            h();
        }
    }

    public final void j(e4.c cVar) {
        e4.c cVar2 = this.f17124e;
        if (cVar2 != null) {
            cVar2.getClass();
        }
        this.f17124e = cVar;
    }
}
