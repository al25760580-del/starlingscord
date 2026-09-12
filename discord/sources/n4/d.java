package n4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import l4.v;

/* JADX INFO: loaded from: classes.dex */
public final class d implements e, m, o4.a, q4.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m4.a f16377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f16378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f16379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Path f16380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f16381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f16382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f16383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f16384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v f16385i;
    public ArrayList j;
    public final o4.q k;

    public d(v vVar, t4.b bVar, s4.m mVar, l4.i iVar) {
        r4.d dVar;
        String str = mVar.f19773a;
        boolean z5 = mVar.f19775c;
        List list = mVar.f19774b;
        ArrayList arrayList = new ArrayList(list.size());
        int i7 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVarA = ((s4.b) list.get(i10)).a(vVar, iVar, bVar);
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        while (true) {
            if (i7 >= list.size()) {
                dVar = null;
                break;
            }
            s4.b bVar2 = (s4.b) list.get(i7);
            if (bVar2 instanceof r4.d) {
                dVar = (r4.d) bVar2;
                break;
            }
            i7++;
        }
        this(vVar, bVar, str, z5, arrayList, dVar);
    }

    @Override // o4.a
    public final void a() {
        this.f16385i.invalidateSelf();
    }

    @Override // n4.c
    public final void b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.f16384h;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            c cVar = (c) arrayList.get(size2);
            cVar.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(cVar);
        }
    }

    @Override // q4.f
    public final void c(q4.e eVar, int i7, ArrayList arrayList, q4.e eVar2) {
        String str = this.f16382f;
        if (!eVar.c(i7, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            q4.e eVar3 = new q4.e(eVar2);
            eVar3.f18622a.add(str);
            if (eVar.a(i7, str)) {
                q4.e eVar4 = new q4.e(eVar3);
                eVar4.f18623b = this;
                arrayList.add(eVar4);
            }
            eVar2 = eVar3;
        }
        if (!eVar.d(i7, str)) {
            return;
        }
        int iB = eVar.b(i7, str) + i7;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f16384h;
            if (i10 >= arrayList2.size()) {
                return;
            }
            c cVar = (c) arrayList2.get(i10);
            if (cVar instanceof q4.f) {
                ((q4.f) cVar).c(eVar, iB, arrayList, eVar2);
            }
            i10++;
        }
    }

    @Override // n4.e
    public final void d(RectF rectF, Matrix matrix, boolean z5) {
        Matrix matrix2 = this.f16379c;
        matrix2.set(matrix);
        o4.q qVar = this.k;
        if (qVar != null) {
            matrix2.preConcat(qVar.e());
        }
        RectF rectF2 = this.f16381e;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.f16384h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof e) {
                ((e) cVar).d(rectF2, matrix2, z5);
                rectF.union(rectF2);
            }
        }
    }

    public final List e() {
        if (this.j == null) {
            this.j = new ArrayList();
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.f16384h;
                if (i7 >= arrayList.size()) {
                    break;
                }
                c cVar = (c) arrayList.get(i7);
                if (cVar instanceof m) {
                    this.j.add((m) cVar);
                }
                i7++;
            }
        }
        return this.j;
    }

    @Override // n4.e
    public final void f(Canvas canvas, Matrix matrix, int i7) {
        if (this.f16383g) {
            return;
        }
        Matrix matrix2 = this.f16379c;
        matrix2.set(matrix);
        o4.q qVar = this.k;
        if (qVar != null) {
            matrix2.preConcat(qVar.e());
            o4.e eVar = qVar.j;
            i7 = (int) (((((eVar == null ? 100 : ((Integer) eVar.e()).intValue()) / 100.0f) * i7) / 255.0f) * 255.0f);
        }
        boolean z5 = this.f16385i.R;
        boolean z6 = false;
        ArrayList arrayList = this.f16384h;
        if (z5) {
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if ((arrayList.get(i11) instanceof e) && (i10 = i10 + 1) >= 2) {
                    if (i7 == 255) {
                        break;
                    }
                    z6 = true;
                    break;
                }
            }
        }
        if (z6) {
            RectF rectF = this.f16378b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            d(rectF, matrix2, true);
            m4.a aVar = this.f16377a;
            aVar.setAlpha(i7);
            hs.c cVar = x4.h.f22636a;
            canvas.saveLayer(rectF, aVar);
        }
        if (z6) {
            i7 = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof e) {
                ((e) obj).f(canvas, matrix2, i7);
            }
        }
        if (z6) {
            canvas.restore();
        }
    }

    @Override // n4.m
    public final Path g() {
        Matrix matrix = this.f16379c;
        matrix.reset();
        o4.q qVar = this.k;
        if (qVar != null) {
            matrix.set(qVar.e());
        }
        Path path = this.f16380d;
        path.reset();
        if (!this.f16383g) {
            ArrayList arrayList = this.f16384h;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) arrayList.get(size);
                if (cVar instanceof m) {
                    path.addPath(((m) cVar).g(), matrix);
                }
            }
        }
        return path;
    }

    @Override // n4.c
    public final String getName() {
        throw null;
    }

    @Override // q4.f
    public final void h(e4.c cVar, Object obj) {
        o4.q qVar = this.k;
        if (qVar != null) {
            qVar.c(cVar, obj);
        }
    }

    public d(v vVar, t4.b bVar, String str, boolean z5, ArrayList arrayList, r4.d dVar) {
        this.f16377a = new m4.a();
        this.f16378b = new RectF();
        this.f16379c = new Matrix();
        this.f16380d = new Path();
        this.f16381e = new RectF();
        this.f16382f = str;
        this.f16385i = vVar;
        this.f16383g = z5;
        this.f16384h = arrayList;
        if (dVar != null) {
            o4.q qVar = new o4.q(dVar);
            this.k = qVar;
            qVar.a(bVar);
            qVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof j) {
                arrayList2.add((j) cVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList2.get(size2)).e(arrayList.listIterator(arrayList.size()));
        }
    }
}
