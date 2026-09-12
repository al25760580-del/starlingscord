package v4;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class h implements d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f21463d = new h();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f21464e = io.sentry.internal.debugmeta.c.D0("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // v4.d0
    public final Object f(w4.a aVar, float f2) {
        aVar.f();
        String strZ = null;
        float fU = 0.0f;
        float fU2 = 0.0f;
        float fU3 = 0.0f;
        float fU4 = 0.0f;
        int iY = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zQ = true;
        int i7 = 3;
        String strZ2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (aVar.n()) {
            switch (aVar.P(f21464e)) {
                case 0:
                    strZ = aVar.z();
                    break;
                case 1:
                    strZ2 = aVar.z();
                    break;
                case 2:
                    fU = (float) aVar.u();
                    pointF = pointF;
                    break;
                case 3:
                    PointF pointF3 = pointF;
                    int iY2 = aVar.y();
                    i7 = (iY2 > 2 || iY2 < 0) ? 3 : f0.e.c(3)[iY2];
                    pointF = pointF3;
                    pointF2 = pointF2;
                    break;
                case 4:
                    iY = aVar.y();
                    break;
                case 5:
                    fU2 = (float) aVar.u();
                    pointF = pointF;
                    break;
                case 6:
                    fU3 = (float) aVar.u();
                    pointF = pointF;
                    break;
                case 7:
                    iA = n.a(aVar);
                    break;
                case 8:
                    iA2 = n.a(aVar);
                    break;
                case 9:
                    fU4 = (float) aVar.u();
                    pointF = pointF;
                    break;
                case 10:
                    zQ = aVar.q();
                    break;
                case 11:
                    aVar.c();
                    PointF pointF4 = new PointF(((float) aVar.u()) * f2, ((float) aVar.u()) * f2);
                    aVar.g();
                    pointF = pointF4;
                    pointF2 = pointF2;
                    break;
                case 12:
                    aVar.c();
                    pointF2 = new PointF(((float) aVar.u()) * f2, ((float) aVar.u()) * f2);
                    aVar.g();
                    pointF = pointF;
                    break;
                default:
                    aVar.Q();
                    aVar.T();
                    break;
            }
        }
        aVar.i();
        q4.b bVar = new q4.b();
        bVar.f18601a = strZ;
        bVar.f18602b = strZ2;
        bVar.f18603c = fU;
        bVar.f18604d = i7;
        bVar.f18605e = iY;
        bVar.f18606f = fU2;
        bVar.f18607g = fU3;
        bVar.f18608h = iA;
        bVar.f18609i = iA2;
        bVar.j = fU4;
        bVar.k = zQ;
        bVar.f18610l = pointF;
        bVar.f18611m = pointF2;
        return bVar;
    }
}
