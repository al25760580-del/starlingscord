package v4;

import ag.a1;
import android.graphics.Rect;
import androidx.collection.SparseArrayCompat;
import com.facebook.react.devsupport.StackTraceHelper;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f21488a = io.sentry.internal.debugmeta.c.D0("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f21489b = io.sentry.internal.debugmeta.c.D0(StackTraceHelper.ID_KEY, "layers", "w", "h", "p", "u");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f21490c = io.sentry.internal.debugmeta.c.D0("list");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f21491d = io.sentry.internal.debugmeta.c.D0("cm", "tm", "dr");

    public static l4.i a(w4.b bVar) throws EOFException, a1 {
        float f2;
        float f7;
        float f10;
        float f11;
        float f12;
        float fC = x4.h.c();
        s.k kVar = new s.k();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArrayCompat sparseArrayCompat = new SparseArrayCompat(0);
        l4.i iVar = new l4.i();
        bVar.f();
        int iY = 0;
        int iY2 = 0;
        float fU = 0.0f;
        float fU2 = 0.0f;
        float fU3 = 0.0f;
        while (bVar.n()) {
            fC = fC;
            switch (bVar.P(f21488a)) {
                case 0:
                    iY = bVar.y();
                    fC = fC;
                    break;
                case 1:
                    iY2 = bVar.y();
                    fC = fC;
                    break;
                case 2:
                    fU2 = (float) bVar.u();
                    fU3 = fU3;
                    break;
                case 3:
                    fU3 = ((float) bVar.u()) - 0.01f;
                    fC = fC;
                    fU2 = fU2;
                    break;
                case 4:
                    fU = (float) bVar.u();
                    fU2 = fU2;
                    fU3 = fU3;
                    break;
                case 5:
                    f2 = fU;
                    f7 = fU2;
                    f10 = fU3;
                    String[] strArrSplit = bVar.z().split("\\.");
                    int i7 = Integer.parseInt(strArrSplit[0]);
                    int i10 = Integer.parseInt(strArrSplit[1]);
                    int i11 = Integer.parseInt(strArrSplit[2]);
                    if (i7 < 4 || (i7 <= 4 && (i10 < 4 || (i10 <= 4 && i11 < 0)))) {
                        iVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fC = fC;
                    fU2 = f7;
                    fU3 = f10;
                    fU = f2;
                    break;
                case 6:
                    f2 = fU;
                    f7 = fU2;
                    f10 = fU3;
                    bVar.c();
                    int i12 = 0;
                    while (bVar.n()) {
                        t4.e eVarA = q.a(bVar, iVar);
                        if (eVarA.f20621e == 3) {
                            i12++;
                        }
                        arrayList.add(eVarA);
                        kVar.e(eVarA.f20620d, eVarA);
                        if (i12 > 4) {
                            x4.c.b("You have " + i12 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    bVar.g();
                    fC = fC;
                    fU2 = f7;
                    fU3 = f10;
                    fU = f2;
                    break;
                case 7:
                    f2 = fU;
                    f7 = fU2;
                    f10 = fU3;
                    bVar.c();
                    while (bVar.n()) {
                        ArrayList arrayList3 = new ArrayList();
                        s.k kVar2 = new s.k();
                        bVar.f();
                        String strZ = null;
                        String strZ2 = null;
                        String strZ3 = null;
                        int iY3 = 0;
                        int iY4 = 0;
                        while (bVar.n()) {
                            int iP = bVar.P(f21489b);
                            if (iP == 0) {
                                strZ = bVar.z();
                            } else if (iP == 1) {
                                bVar.c();
                                while (bVar.n()) {
                                    t4.e eVarA2 = q.a(bVar, iVar);
                                    kVar2.e(eVarA2.f20620d, eVarA2);
                                    arrayList3.add(eVarA2);
                                }
                                bVar.g();
                            } else if (iP == 2) {
                                iY3 = bVar.y();
                            } else if (iP == 3) {
                                iY4 = bVar.y();
                            } else if (iP == 4) {
                                strZ2 = bVar.z();
                            } else if (iP != 5) {
                                bVar.Q();
                                bVar.T();
                            } else {
                                strZ3 = bVar.z();
                            }
                        }
                        bVar.i();
                        if (strZ2 != null) {
                            map2.put(strZ, new l4.x(iY3, strZ, iY4, strZ2, strZ3));
                        } else {
                            map.put(strZ, arrayList3);
                        }
                    }
                    bVar.g();
                    fC = fC;
                    fU2 = f7;
                    fU3 = f10;
                    fU = f2;
                    break;
                case 8:
                    f2 = fU;
                    f7 = fU2;
                    float f13 = fU3;
                    bVar.f();
                    while (bVar.n()) {
                        if (bVar.P(f21490c) != 0) {
                            bVar.Q();
                            bVar.T();
                        } else {
                            bVar.c();
                            while (bVar.n()) {
                                io.sentry.internal.debugmeta.c cVar = k.f21474a;
                                bVar.f();
                                String strZ4 = null;
                                String strZ5 = null;
                                String strZ6 = null;
                                while (bVar.n()) {
                                    int iP2 = bVar.P(k.f21474a);
                                    if (iP2 != 0) {
                                        float f14 = f13;
                                        if (iP2 == 1) {
                                            strZ5 = bVar.z();
                                        } else if (iP2 == 2) {
                                            strZ6 = bVar.z();
                                        } else if (iP2 != 3) {
                                            bVar.Q();
                                            bVar.T();
                                        } else {
                                            bVar.u();
                                        }
                                        f13 = f14;
                                    } else {
                                        strZ4 = bVar.z();
                                    }
                                }
                                bVar.i();
                                map3.put(strZ5, new q4.c(strZ4, strZ5, strZ6));
                                f13 = f13;
                            }
                            bVar.g();
                        }
                    }
                    f10 = f13;
                    bVar.i();
                    fC = fC;
                    fU2 = f7;
                    fU3 = f10;
                    fU = f2;
                    break;
                case 9:
                    f2 = fU;
                    f7 = fU2;
                    f11 = fU3;
                    bVar.c();
                    while (bVar.n()) {
                        io.sentry.internal.debugmeta.c cVar2 = j.f21472a;
                        ArrayList arrayList4 = new ArrayList();
                        bVar.f();
                        double dU = 0.0d;
                        String strZ7 = null;
                        String strZ8 = null;
                        char cCharAt = 0;
                        while (bVar.n()) {
                            int iP3 = bVar.P(j.f21472a);
                            if (iP3 == 0) {
                                cCharAt = bVar.z().charAt(0);
                            } else if (iP3 == 1) {
                                bVar.u();
                            } else if (iP3 == 2) {
                                dU = bVar.u();
                            } else if (iP3 == 3) {
                                strZ7 = bVar.z();
                            } else if (iP3 == 4) {
                                strZ8 = bVar.z();
                            } else if (iP3 != 5) {
                                bVar.Q();
                                bVar.T();
                            } else {
                                bVar.f();
                                while (bVar.n()) {
                                    if (bVar.P(j.f21473b) != 0) {
                                        bVar.Q();
                                        bVar.T();
                                    } else {
                                        bVar.c();
                                        while (bVar.n()) {
                                            arrayList4.add((s4.m) g.a(bVar, iVar));
                                        }
                                        bVar.g();
                                    }
                                }
                                bVar.i();
                            }
                        }
                        bVar.i();
                        q4.d dVar = new q4.d(arrayList4, cCharAt, dU, strZ7, strZ8);
                        sparseArrayCompat.e(dVar.hashCode(), dVar);
                    }
                    bVar.g();
                    f10 = f11;
                    fC = fC;
                    fU2 = f7;
                    fU3 = f10;
                    fU = f2;
                    break;
                case 10:
                    bVar.c();
                    while (bVar.n()) {
                        bVar.f();
                        String strZ9 = null;
                        float fU4 = 0.0f;
                        float fU5 = 0.0f;
                        while (bVar.n()) {
                            int iP4 = bVar.P(f21491d);
                            if (iP4 != 0) {
                                f12 = fU;
                                if (iP4 == 1) {
                                    fU3 = fU3;
                                    fU4 = (float) bVar.u();
                                } else if (iP4 != 2) {
                                    bVar.Q();
                                    bVar.T();
                                } else {
                                    fU3 = fU3;
                                    fU5 = (float) bVar.u();
                                }
                                fU = f12;
                                fU2 = fU2;
                            } else {
                                f12 = fU;
                                strZ9 = bVar.z();
                            }
                            fU = f12;
                        }
                        bVar.i();
                        arrayList2.add(new q4.h(strZ9, fU4, fU5));
                        fU3 = fU3;
                        fU2 = fU2;
                        fU = fU;
                    }
                    f2 = fU;
                    f7 = fU2;
                    f11 = fU3;
                    bVar.g();
                    f10 = f11;
                    fC = fC;
                    fU2 = f7;
                    fU3 = f10;
                    fU = f2;
                    break;
                default:
                    bVar.Q();
                    bVar.T();
                    f2 = fU;
                    f7 = fU2;
                    f10 = fU3;
                    fC = fC;
                    fU2 = f7;
                    fU3 = f10;
                    fU = f2;
                    break;
            }
        }
        float f15 = fC;
        Rect rect = new Rect(0, 0, (int) (iY * f15), (int) (iY2 * f15));
        float fC2 = x4.h.c();
        iVar.k = rect;
        iVar.f14872l = fU2;
        iVar.f14873m = fU3;
        iVar.f14874n = fU;
        iVar.j = arrayList;
        iVar.f14871i = kVar;
        iVar.f14865c = map;
        iVar.f14866d = map2;
        iVar.f14867e = fC2;
        iVar.f14870h = sparseArrayCompat;
        iVar.f14868f = map3;
        iVar.f14869g = arrayList2;
        return iVar;
    }
}
