package n4;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class l implements m, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f16433a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f16434b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f16435c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f16436d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s4.g f16437e;

    public l(s4.g gVar) {
        this.f16437e = gVar;
    }

    public final void a(Path.Op op2) {
        Path path = this.f16434b;
        path.reset();
        Path path2 = this.f16433a;
        path2.reset();
        ArrayList arrayList = this.f16436d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            m mVar = (m) arrayList.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                ArrayList arrayList2 = (ArrayList) dVar.e();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path pathG = ((m) arrayList2.get(size2)).g();
                    Matrix matrixE = dVar.f16379c;
                    o4.q qVar = dVar.k;
                    if (qVar != null) {
                        matrixE = qVar.e();
                    } else {
                        matrixE.reset();
                    }
                    pathG.transform(matrixE);
                    path.addPath(pathG);
                }
            } else {
                path.addPath(mVar.g());
            }
        }
        int i7 = 0;
        m mVar2 = (m) arrayList.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List listE = dVar2.e();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listE;
                if (i7 >= arrayList3.size()) {
                    break;
                }
                Path pathG2 = ((m) arrayList3.get(i7)).g();
                Matrix matrixE2 = dVar2.f16379c;
                o4.q qVar2 = dVar2.k;
                if (qVar2 != null) {
                    matrixE2 = qVar2.e();
                } else {
                    matrixE2.reset();
                }
                pathG2.transform(matrixE2);
                path2.addPath(pathG2);
                i7++;
            }
        } else {
            path2.set(mVar2.g());
        }
        this.f16435c.op(path2, path, op2);
    }

    @Override // n4.c
    public final void b(List list, List list2) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f16436d;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((m) arrayList.get(i7)).b(list, list2);
            i7++;
        }
    }

    @Override // n4.j
    public final void e(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVar = (c) listIterator.previous();
            if (cVar instanceof m) {
                this.f16436d.add((m) cVar);
                listIterator.remove();
            }
        }
    }

    @Override // n4.m
    public final Path g() {
        Path path = this.f16435c;
        path.reset();
        s4.g gVar = this.f16437e;
        if (!gVar.f19747b) {
            int iB = f0.e.b(gVar.f19746a);
            if (iB == 0) {
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f16436d;
                    if (i7 >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((m) arrayList.get(i7)).g());
                    i7++;
                }
            } else {
                if (iB == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (iB == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (iB == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (iB == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
