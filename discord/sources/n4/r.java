package n4;

import android.graphics.Path;
import io.sentry.f6;
import java.util.ArrayList;
import java.util.List;
import l4.v;
import l4.z;

/* JADX INFO: loaded from: classes.dex */
public final class r implements m, o4.a, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f16478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o4.n f16479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16480f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f16475a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f6 f16481g = new f6();

    public r(v vVar, t4.b bVar, s4.n nVar) {
        this.f16476b = nVar.f19776a;
        this.f16477c = nVar.f19779d;
        this.f16478d = vVar;
        o4.n nVar2 = new o4.n((List) nVar.f19778c.f9357e);
        this.f16479e = nVar2;
        bVar.e(nVar2);
        nVar2.a(this);
    }

    @Override // o4.a
    public final void a() {
        this.f16480f = false;
        this.f16478d.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x002c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038 A[SYNTHETIC] */
    @Override // n4.c
    public final void b(List list, List list2) {
        ArrayList arrayList = null;
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i7 >= arrayList2.size()) {
                this.f16479e.f17148m = arrayList;
                return;
            }
            c cVar = (c) arrayList2.get(i7);
            if (cVar instanceof t) {
                t tVar = (t) cVar;
                if (tVar.f16489c == 1) {
                    this.f16481g.f12677a.add(tVar);
                    tVar.c(this);
                } else if (!(cVar instanceof q)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((q) cVar);
                }
            } else if (!(cVar instanceof q)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((q) cVar);
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
        boolean z5 = this.f16480f;
        o4.n nVar = this.f16479e;
        Path path = this.f16475a;
        if (z5 && nVar.f17124e == null) {
            return path;
        }
        path.reset();
        if (this.f16477c) {
            this.f16480f = true;
            return path;
        }
        Path path2 = (Path) nVar.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f16481g.a(path);
        this.f16480f = true;
        return path;
    }

    @Override // n4.c
    public final String getName() {
        return this.f16476b;
    }

    @Override // q4.f
    public final void h(e4.c cVar, Object obj) {
        if (obj == z.K) {
            this.f16479e.j(cVar);
        }
    }
}
