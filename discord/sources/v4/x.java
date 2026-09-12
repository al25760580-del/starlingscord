package v4;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class x implements d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f21497d = new x();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f21498e = io.sentry.internal.debugmeta.c.D0("c", "v", "i", "o");

    @Override // v4.d0
    public final Object f(w4.a aVar, float f2) {
        if (aVar.B() == 1) {
            aVar.c();
        }
        aVar.f();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zQ = false;
        while (aVar.n()) {
            int iP = aVar.P(f21498e);
            if (iP == 0) {
                zQ = aVar.q();
            } else if (iP == 1) {
                arrayListC = n.c(aVar, f2);
            } else if (iP == 2) {
                arrayListC2 = n.c(aVar, f2);
            } else if (iP != 3) {
                aVar.Q();
                aVar.T();
            } else {
                arrayListC3 = n.c(aVar, f2);
            }
        }
        aVar.i();
        if (aVar.B() == 2) {
            aVar.g();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListC.isEmpty()) {
            return new s4.k(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i7 = 1; i7 < size; i7++) {
            PointF pointF2 = (PointF) arrayListC.get(i7);
            int i10 = i7 - 1;
            arrayList.add(new q4.a(x4.g.a((PointF) arrayListC.get(i10), (PointF) arrayListC3.get(i10)), x4.g.a(pointF2, (PointF) arrayListC2.get(i7)), pointF2));
        }
        if (zQ) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i11 = size - 1;
            arrayList.add(new q4.a(x4.g.a((PointF) arrayListC.get(i11), (PointF) arrayListC3.get(i11)), x4.g.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new s4.k(pointF, zQ, arrayList);
    }
}
