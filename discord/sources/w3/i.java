package w3;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v3.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f22031a = v3.q.f("Schedulers");

    public static void a(e4.p pVar, s sVar, ArrayList arrayList) {
        if (arrayList.size() > 0) {
            sVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                pVar.p(jCurrentTimeMillis, ((e4.o) it.next()).f7998a);
            }
        }
    }

    public static void b(v3.b bVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        e4.p pVarT = workDatabase.t();
        workDatabase.c();
        try {
            ArrayList arrayListE = pVarT.e();
            a(pVarT, bVar.f21381c, arrayListE);
            ArrayList arrayListD = pVarT.d(bVar.j);
            a(pVarT, bVar.f21381c, arrayListD);
            arrayListD.addAll(arrayListE);
            ArrayList arrayListC = pVarT.c();
            workDatabase.o();
            workDatabase.k();
            if (arrayListD.size() > 0) {
                e4.o[] oVarArr = (e4.o[]) arrayListD.toArray(new e4.o[arrayListD.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    if (gVar.a()) {
                        gVar.d(oVarArr);
                    }
                }
            }
            if (arrayListC.size() > 0) {
                e4.o[] oVarArr2 = (e4.o[]) arrayListC.toArray(new e4.o[arrayListC.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    g gVar2 = (g) it2.next();
                    if (!gVar2.a()) {
                        gVar2.d(oVarArr2);
                    }
                }
            }
        } catch (Throwable th2) {
            workDatabase.k();
            throw th2;
        }
    }
}
