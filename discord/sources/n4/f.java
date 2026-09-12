package n4;

import android.graphics.Path;
import android.graphics.PointF;
import io.sentry.f6;
import java.util.ArrayList;
import java.util.List;
import l4.v;
import l4.z;

/* JADX INFO: loaded from: classes.dex */
public final class f implements m, o4.a, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f16388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o4.j f16389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o4.e f16390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s4.a f16391f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16393h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f16386a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f6 f16392g = new f6();

    public f(v vVar, t4.b bVar, s4.a aVar) {
        this.f16387b = aVar.f19716a;
        this.f16388c = vVar;
        o4.e eVarL0 = aVar.f19718c.l0();
        this.f16389d = (o4.j) eVarL0;
        o4.e eVarL1 = aVar.f19717b.l0();
        this.f16390e = eVarL1;
        this.f16391f = aVar;
        bVar.e(eVarL0);
        bVar.e(eVarL1);
        eVarL0.a(this);
        eVarL1.a(this);
    }

    @Override // o4.a
    public final void a() {
        this.f16393h = false;
        this.f16388c.invalidateSelf();
    }

    @Override // n4.c
    public final void b(List list, List list2) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i7 >= arrayList.size()) {
                return;
            }
            c cVar = (c) arrayList.get(i7);
            if (cVar instanceof t) {
                t tVar = (t) cVar;
                if (tVar.f16489c == 1) {
                    this.f16392g.f12677a.add(tVar);
                    tVar.c(this);
                }
            }
            i7++;
        }
    }

    @Override // q4.f
    public final void c(q4.e eVar, int i7, ArrayList arrayList, q4.e eVar2) {
        x4.g.f(eVar, i7, arrayList, eVar2, this);
    }

    @Override // n4.m
    public final Path g() {
        boolean z5 = this.f16393h;
        Path path = this.f16386a;
        if (z5) {
            return path;
        }
        path.reset();
        s4.a aVar = this.f16391f;
        if (aVar.f19720e) {
            this.f16393h = true;
            return path;
        }
        PointF pointF = (PointF) this.f16389d.e();
        float f2 = pointF.x / 2.0f;
        float f7 = pointF.y / 2.0f;
        float f10 = f2 * 0.55228f;
        float f11 = f7 * 0.55228f;
        path.reset();
        if (aVar.f19719d) {
            float f12 = -f7;
            path.moveTo(0.0f, f12);
            float f13 = 0.0f - f10;
            float f14 = -f2;
            float f15 = 0.0f - f11;
            path.cubicTo(f13, f12, f14, f15, f14, 0.0f);
            float f16 = f11 + 0.0f;
            path.cubicTo(f14, f16, f13, f7, 0.0f, f7);
            float f17 = f10 + 0.0f;
            path.cubicTo(f17, f7, f2, f16, f2, 0.0f);
            path.cubicTo(f2, f15, f17, f12, 0.0f, f12);
        } else {
            float f18 = -f7;
            path.moveTo(0.0f, f18);
            float f19 = f10 + 0.0f;
            float f20 = 0.0f - f11;
            path.cubicTo(f19, f18, f2, f20, f2, 0.0f);
            float f21 = f11 + 0.0f;
            path.cubicTo(f2, f21, f19, f7, 0.0f, f7);
            float f22 = 0.0f - f10;
            float f23 = -f2;
            path.cubicTo(f22, f7, f23, f21, f23, 0.0f);
            path.cubicTo(f23, f20, f22, f18, 0.0f, f18);
        }
        PointF pointF2 = (PointF) this.f16390e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f16392g.a(path);
        this.f16393h = true;
        return path;
    }

    @Override // n4.c
    public final String getName() {
        return this.f16387b;
    }

    @Override // q4.f
    public final void h(e4.c cVar, Object obj) {
        if (obj == z.f14948f) {
            this.f16389d.j(cVar);
        } else if (obj == z.f14951i) {
            this.f16390e.j(cVar);
        }
    }
}
