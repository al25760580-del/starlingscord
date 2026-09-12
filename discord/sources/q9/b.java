package q9;

import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import lo.j;
import rn.l;
import rn.u;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f18642a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicInteger f18643b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicInteger f18644c = new AtomicInteger(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f18645d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u f18646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bc.a f18647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final bc.a f18648g;

    static {
        u uVarB = l.b(new o5.a(13));
        f18646e = uVarB;
        bc.a aVar = new bc.a(14);
        f18647f = aVar;
        bc.a aVar2 = new bc.a(15);
        f18648g = aVar2;
        ((Handler) uVarB.getValue()).post(aVar);
        ((Handler) uVarB.getValue()).post(aVar2);
    }

    public static void a(o9.e eVar, int i7) {
        int i10 = eVar.f17186a;
        o9.f fVar = eVar.f17187b;
        float f2 = i10 * 0.5f;
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        int iD = j.d(fVar.G + i7, (int) f2, i10);
        int i11 = fVar.G;
        if (iD == i11 || iD == i11) {
            return;
        }
        fVar.G = j.d(iD, 1, fVar.F);
        d dVarF = fVar.f();
        if (dVarF != null) {
            dVarF.a(fVar.G);
        }
    }
}
