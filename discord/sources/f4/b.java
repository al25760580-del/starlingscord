package f4;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import v3.x;
import v3.z;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e4.e f8817d = new e4.e(23, (byte) 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8818e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w3.o f8819i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f8820v;

    public b(w3.o oVar, Object obj, int i7) {
        this.f8818e = i7;
        this.f8819i = oVar;
        this.f8820v = obj;
    }

    public static void a(w3.o oVar, String str) {
        w3.r rVarB;
        WorkDatabase workDatabase = oVar.f22048c;
        e4.p pVarT = workDatabase.t();
        e4.c cVarF = workDatabase.f();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            z zVarK = pVarT.k(str2);
            if (zVarK != z.f21437i && zVarK != z.f21438v) {
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) pVarT.f8019a;
                workDatabase_Impl.b();
                e4.h hVar = (e4.h) pVarT.f8023e;
                h3.j jVarA = hVar.a();
                if (str2 == null) {
                    jVarA.R(1);
                } else {
                    jVarA.o(1, str2);
                }
                workDatabase_Impl.c();
                try {
                    jVarA.c();
                    workDatabase_Impl.o();
                    workDatabase_Impl.k();
                    hVar.e(jVarA);
                } catch (Throwable th2) {
                    workDatabase_Impl.k();
                    hVar.e(jVarA);
                    throw th2;
                }
            }
            linkedList.addAll(cVarF.H(str2));
        }
        w3.e eVar = oVar.f22051f;
        synchronized (eVar.k) {
            v3.q.d().a(w3.e.f22015l, "Processor cancelling " + str);
            eVar.f22024i.add(str);
            rVarB = eVar.b(str);
        }
        w3.e.d(str, rVarB, 1);
        Iterator it = oVar.f22050e.iterator();
        while (it.hasNext()) {
            ((w3.g) it.next()).c(str);
        }
    }

    public final void b() {
        switch (this.f8818e) {
            case 0:
                w3.o oVar = this.f8819i;
                WorkDatabase workDatabase = oVar.f22048c;
                workDatabase.c();
                try {
                    a(oVar, ((UUID) this.f8820v).toString());
                    workDatabase.o();
                    workDatabase.k();
                    w3.i.b(oVar.f22047b, oVar.f22048c, oVar.f22050e);
                    return;
                } catch (Throwable th2) {
                    workDatabase.k();
                    throw th2;
                }
            default:
                w3.o oVar2 = this.f8819i;
                WorkDatabase workDatabase2 = oVar2.f22048c;
                workDatabase2.c();
                try {
                    Iterator it = workDatabase2.t().m((String) this.f8820v).iterator();
                    while (it.hasNext()) {
                        a(oVar2, (String) it.next());
                    }
                    workDatabase2.o();
                    return;
                } finally {
                    workDatabase2.k();
                }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        e4.e eVar = this.f8817d;
        try {
            b();
            eVar.I(x.A);
        } catch (Throwable th2) {
            eVar.I(new v3.u(th2));
        }
    }
}
