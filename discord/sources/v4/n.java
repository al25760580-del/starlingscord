package v4;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f21480a = io.sentry.internal.debugmeta.c.D0("x", "y");

    public static int a(w4.a aVar) {
        aVar.c();
        int iU = (int) (aVar.u() * 255.0d);
        int iU2 = (int) (aVar.u() * 255.0d);
        int iU3 = (int) (aVar.u() * 255.0d);
        while (aVar.n()) {
            aVar.T();
        }
        aVar.g();
        return Color.argb(255, iU, iU2, iU3);
    }

    public static PointF b(w4.a aVar, float f2) {
        int iB = f0.e.b(aVar.B());
        if (iB == 0) {
            aVar.c();
            float fU = (float) aVar.u();
            float fU2 = (float) aVar.u();
            while (aVar.B() != 2) {
                aVar.T();
            }
            aVar.g();
            return new PointF(fU * f2, fU2 * f2);
        }
        if (iB != 2) {
            if (iB != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(s0.g.l(aVar.B())));
            }
            float fU3 = (float) aVar.u();
            float fU4 = (float) aVar.u();
            while (aVar.n()) {
                aVar.T();
            }
            return new PointF(fU3 * f2, fU4 * f2);
        }
        aVar.f();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (aVar.n()) {
            int iP = aVar.P(f21480a);
            if (iP == 0) {
                fD = d(aVar);
            } else if (iP != 1) {
                aVar.Q();
                aVar.T();
            } else {
                fD2 = d(aVar);
            }
        }
        aVar.i();
        return new PointF(fD * f2, fD2 * f2);
    }

    public static ArrayList c(w4.a aVar, float f2) {
        ArrayList arrayList = new ArrayList();
        aVar.c();
        while (aVar.B() == 1) {
            aVar.c();
            arrayList.add(b(aVar, f2));
            aVar.g();
        }
        aVar.g();
        return arrayList;
    }

    public static float d(w4.a aVar) {
        int iB = aVar.B();
        int iB2 = f0.e.b(iB);
        if (iB2 != 0) {
            if (iB2 == 6) {
                return (float) aVar.u();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(s0.g.l(iB)));
        }
        aVar.c();
        float fU = (float) aVar.u();
        while (aVar.n()) {
            aVar.T();
        }
        aVar.g();
        return fU;
    }
}
