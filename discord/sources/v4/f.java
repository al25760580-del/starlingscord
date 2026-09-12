package v4;

import android.graphics.Color;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class f implements d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f21455e = new f(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f21456i = new f(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final f f21457v = new f(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final f f21458w = new f(3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final f f21459x = new f(4);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final f f21460y = new f(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21461d;

    public /* synthetic */ f(int i7) {
        this.f21461d = i7;
    }

    @Override // v4.d0
    public final Object f(w4.a aVar, float f2) {
        switch (this.f21461d) {
            case 0:
                boolean z5 = aVar.B() == 1;
                if (z5) {
                    aVar.c();
                }
                double dU = aVar.u();
                double dU2 = aVar.u();
                double dU3 = aVar.u();
                double dU4 = aVar.B() == 7 ? aVar.u() : 1.0d;
                if (z5) {
                    aVar.g();
                }
                if (dU <= 1.0d && dU2 <= 1.0d && dU3 <= 1.0d) {
                    dU *= 255.0d;
                    dU2 *= 255.0d;
                    dU3 *= 255.0d;
                    if (dU4 <= 1.0d) {
                        dU4 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) dU4, (int) dU, (int) dU2, (int) dU3));
            case 1:
                return Float.valueOf(n.d(aVar) * f2);
            case 2:
                return Integer.valueOf(Math.round(n.d(aVar) * f2));
            case 3:
                return n.b(aVar, f2);
            case 4:
                int iB = aVar.B();
                if (iB == 1) {
                    return n.b(aVar, f2);
                }
                if (iB == 3) {
                    return n.b(aVar, f2);
                }
                if (iB != 7) {
                    throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(s0.g.l(iB)));
                }
                PointF pointF = new PointF(((float) aVar.u()) * f2, ((float) aVar.u()) * f2);
                while (aVar.n()) {
                    aVar.T();
                }
                return pointF;
            default:
                boolean z6 = aVar.B() == 1;
                if (z6) {
                    aVar.c();
                }
                float fU = (float) aVar.u();
                float fU2 = (float) aVar.u();
                while (aVar.n()) {
                    aVar.T();
                }
                if (z6) {
                    aVar.g();
                }
                return new y4.b((fU / 100.0f) * f2, (fU2 / 100.0f) * f2);
        }
    }
}
