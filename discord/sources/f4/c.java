package f4;

import a5.l0;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import v3.x;
import v3.y;
import v3.z;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f8821i = v3.q.f("EnqueueRunnable");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w3.k f8822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e4.e f8823e;

    public c(w3.k kVar) {
        e4.e eVar = new e4.e(23, (byte) 0);
        this.f8822d = kVar;
        this.f8823e = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:186:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0153  */
    /* JADX WARN: Code duplicated, block: B:74:0x0155  */
    /* JADX WARN: Code duplicated, block: B:77:0x015a  */
    /* JADX WARN: Code duplicated, block: B:78:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x015f  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b5  */
    public static boolean a(w3.k kVar) throws Throwable {
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z10;
        WorkDatabase workDatabase;
        boolean z11;
        String[] strArr;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        z zVar;
        boolean z17;
        w3.k kVar2 = kVar;
        kVar2.getClass();
        HashSet hashSetB0 = w3.k.B0(kVar2);
        w3.o oVar = kVar2.f22033b;
        List list = kVar2.f22036e;
        int i7 = 0;
        String[] strArr2 = (String[]) hashSetB0.toArray(new String[0]);
        String str = kVar2.f22034c;
        int i10 = kVar2.f22035d;
        oVar.f22047b.f21381c.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = oVar.f22048c;
        boolean z18 = strArr2 != null && strArr2.length > 0;
        z zVar2 = z.f21437i;
        z zVar3 = z.f21440x;
        z zVar4 = z.f21438v;
        if (z18) {
            int length = strArr2.length;
            z6 = false;
            z7 = false;
            z5 = true;
            while (true) {
                if (i7 < length) {
                    String str2 = strArr2[i7];
                    List list2 = list;
                    e4.o oVarN = workDatabase2.t().n(str2);
                    if (oVarN == null) {
                        v3.q.d().b(f8821i, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    } else {
                        z zVar5 = oVarN.f7999b;
                        z5 &= zVar5 == zVar2;
                        if (zVar5 == zVar4) {
                            z7 = true;
                        } else if (zVar5 == zVar3) {
                            z6 = true;
                        }
                        i7++;
                        list = list2;
                    }
                }
                z14 = true;
                z13 = false;
                kVar2.f22039h = z14;
                return z13;
            }
        }
        z5 = true;
        z6 = false;
        z7 = false;
        List list3 = list;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        z zVar6 = z.f21435d;
        if (zIsEmpty || z18) {
            z10 = zIsEmpty;
            workDatabase = workDatabase2;
            z11 = false;
            strArr = strArr2;
            z12 = z11;
        } else {
            ArrayList arrayListO = workDatabase2.t().o(str);
            if (arrayListO.isEmpty()) {
                z10 = zIsEmpty;
                workDatabase = workDatabase2;
                z11 = false;
            } else {
                z10 = zIsEmpty;
                int i11 = 4;
                if (i10 == 3 || i10 == 4) {
                    e4.c cVarF = workDatabase2.f();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = arrayListO.iterator();
                    while (it.hasNext()) {
                        e4.n nVar = (e4.n) it.next();
                        WorkDatabase workDatabase3 = workDatabase2;
                        String str3 = nVar.f7996a;
                        Iterator it2 = it;
                        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVarF.f7966e;
                        e4.c cVar = cVarF;
                        a3.o oVarG = a3.o.g(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                        if (str3 == null) {
                            oVarG.R(1);
                        } else {
                            oVarG.o(1, str3);
                        }
                        workDatabase_Impl.b();
                        Cursor cursorM = l0.M(workDatabase_Impl, oVarG);
                        try {
                            if (cursorM.moveToFirst()) {
                                z15 = false;
                                if (cursorM.getInt(0) != 0) {
                                    z16 = true;
                                }
                                cursorM.close();
                                oVarG.i();
                                if (z16) {
                                    zVar = nVar.f7997b;
                                    if (zVar == zVar2) {
                                        z17 = true;
                                    } else {
                                        z17 = z15;
                                    }
                                    boolean z19 = z5 & z17;
                                    if (zVar == zVar4) {
                                        z7 = true;
                                    } else if (zVar == zVar3) {
                                        z6 = true;
                                    }
                                    arrayList.add(nVar.f7996a);
                                    z5 = z19;
                                }
                                i11 = 4;
                                workDatabase2 = workDatabase3;
                                it = it2;
                                cVarF = cVar;
                            } else {
                                z15 = false;
                            }
                            z16 = z15;
                            cursorM.close();
                            oVarG.i();
                            if (z16) {
                                zVar = nVar.f7997b;
                                if (zVar == zVar2) {
                                    z17 = true;
                                } else {
                                    z17 = z15;
                                }
                                boolean z110 = z5 & z17;
                                if (zVar == zVar4) {
                                    z7 = true;
                                } else if (zVar == zVar3) {
                                    z6 = true;
                                }
                                arrayList.add(nVar.f7996a);
                                z5 = z110;
                            }
                            i11 = 4;
                            workDatabase2 = workDatabase3;
                            it = it2;
                            cVarF = cVar;
                        } catch (Throwable th2) {
                            cursorM.close();
                            oVarG.i();
                            throw th2;
                        }
                    }
                    workDatabase = workDatabase2;
                    z11 = false;
                    List list4 = arrayList;
                    list4 = arrayList;
                    if (i10 == i11 && (z6 || z7)) {
                        e4.p pVarT = workDatabase.t();
                        Iterator it3 = pVarT.o(str).iterator();
                        while (it3.hasNext()) {
                            pVarT.b(((e4.n) it3.next()).f7996a);
                        }
                        z6 = false;
                        z7 = false;
                        list4 = Collections.EMPTY_LIST;
                    }
                    strArr2 = (String[]) list4.toArray(strArr2);
                    z18 = strArr2.length > 0;
                } else {
                    if (i10 == 2) {
                        Iterator it4 = arrayListO.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                z zVar7 = ((e4.n) it4.next()).f7997b;
                                if (zVar7 == zVar6 || zVar7 == z.f21436e) {
                                    z14 = true;
                                    z13 = false;
                                    kVar2.f22039h = z14;
                                    return z13;
                                }
                            }
                        }
                    }
                    new b(oVar, str, 1).run();
                    e4.p pVarT2 = workDatabase2.t();
                    Iterator it5 = arrayListO.iterator();
                    while (it5.hasNext()) {
                        pVarT2.b(((e4.n) it5.next()).f7996a);
                    }
                    strArr = strArr2;
                    workDatabase = workDatabase2;
                    z12 = true;
                }
            }
            strArr = strArr2;
            z12 = z11;
        }
        Iterator it6 = list3.iterator();
        while (it6.hasNext()) {
            v3.t tVar = (v3.t) it6.next();
            e4.o workSpec = tVar.f21429b;
            UUID uuid = tVar.f21428a;
            if (!z18 || z5) {
                workSpec.f8009n = jCurrentTimeMillis;
            } else if (z7) {
                workSpec.f7999b = zVar4;
            } else if (z6) {
                workSpec.f7999b = zVar3;
            } else {
                workSpec.f7999b = z.f21439w;
            }
            if (workSpec.f7999b == zVar6) {
                z12 = true;
            }
            e4.p pVarT3 = workDatabase.t();
            List schedulers = oVar.f22050e;
            boolean z20 = z12;
            Intrinsics.checkNotNullParameter(schedulers, "schedulers");
            Intrinsics.checkNotNullParameter(workSpec, "workSpec");
            w3.o oVar2 = oVar;
            z zVar8 = zVar6;
            if (Build.VERSION.SDK_INT < 26) {
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                v3.e eVar = workSpec.j;
                String str4 = workSpec.f8000c;
                if (!Intrinsics.areEqual(str4, ConstraintTrackingWorker.class.getName()) && (eVar.f21397d || eVar.f21398e)) {
                    v3.f fVar = new v3.f();
                    fVar.b(workSpec.f8002e.f21405a);
                    fVar.f21402a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str4);
                    v3.g input = new v3.g(fVar.f21402a);
                    v3.g.b(input);
                    Intrinsics.checkNotNullExpressionValue(input, "Builder().putAll(workSpe…ame)\n            .build()");
                    String workerClassName = ConstraintTrackingWorker.class.getName();
                    Intrinsics.checkNotNullExpressionValue(workerClassName, "name");
                    String id2 = workSpec.f7998a;
                    z state = workSpec.f7999b;
                    String inputMergerClassName = workSpec.f8001d;
                    v3.g output = workSpec.f8003f;
                    long j = workSpec.f8004g;
                    long j5 = workSpec.f8005h;
                    long j7 = workSpec.f8006i;
                    v3.e constraints = workSpec.j;
                    int i12 = workSpec.k;
                    v3.a backoffPolicy = workSpec.f8007l;
                    long j10 = workSpec.f8008m;
                    long j11 = workSpec.f8009n;
                    long j12 = workSpec.f8010o;
                    long j13 = workSpec.f8011p;
                    boolean z21 = workSpec.f8012q;
                    y outOfQuotaPolicy = workSpec.f8013r;
                    int i13 = workSpec.f8014s;
                    int i14 = workSpec.f8015t;
                    long j14 = workSpec.f8016u;
                    int i15 = workSpec.f8017v;
                    int i16 = workSpec.f8018w;
                    Intrinsics.checkNotNullParameter(id2, "id");
                    Intrinsics.checkNotNullParameter(state, "state");
                    Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
                    Intrinsics.checkNotNullParameter(inputMergerClassName, "inputMergerClassName");
                    Intrinsics.checkNotNullParameter(input, "input");
                    Intrinsics.checkNotNullParameter(output, "output");
                    Intrinsics.checkNotNullParameter(constraints, "constraints");
                    Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
                    Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
                    workSpec = new e4.o(id2, state, workerClassName, inputMergerClassName, input, output, j, j5, j7, constraints, i12, backoffPolicy, j10, j11, j12, j13, z21, outOfQuotaPolicy, i13, i14, j14, i15, i16);
                }
            }
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) pVarT3.f8019a;
            workDatabase_Impl2.b();
            workDatabase_Impl2.c();
            try {
                ((e4.b) pVarT3.f8020b).g(workSpec);
                workDatabase_Impl2.o();
                workDatabase_Impl2.k();
                if (z18 != 0) {
                    for (String str5 : strArr) {
                        String string = uuid.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
                        e4.a aVar = new e4.a(string, str5);
                        e4.c cVarF2 = workDatabase.f();
                        WorkDatabase_Impl workDatabase_Impl3 = (WorkDatabase_Impl) cVarF2.f7966e;
                        workDatabase_Impl3.b();
                        workDatabase_Impl3.c();
                        try {
                            ((e4.b) cVarF2.f7967i).g(aVar);
                            workDatabase_Impl3.o();
                            workDatabase_Impl3.k();
                        } catch (Throwable th3) {
                            workDatabase_Impl3.k();
                            throw th3;
                        }
                    }
                }
                e4.r rVarU = workDatabase.u();
                String id3 = uuid.toString();
                Intrinsics.checkNotNullExpressionValue(id3, "id.toString()");
                Set tags = tVar.f21430c;
                rVarU.getClass();
                Intrinsics.checkNotNullParameter(id3, "id");
                Intrinsics.checkNotNullParameter(tags, "tags");
                Intrinsics.checkNotNullParameter(id3, "id");
                Intrinsics.checkNotNullParameter(tags, "tags");
                Iterator it7 = tags.iterator();
                while (it7.hasNext()) {
                    e4.q qVar = new e4.q((String) it7.next(), id3);
                    WorkDatabase_Impl workDatabase_Impl4 = (WorkDatabase_Impl) rVarU.f8034e;
                    workDatabase_Impl4.b();
                    workDatabase_Impl4.c();
                    try {
                        ((e4.b) rVarU.f8035i).g(qVar);
                        workDatabase_Impl4.o();
                        workDatabase_Impl4.k();
                    } catch (Throwable th4) {
                        workDatabase_Impl4.k();
                        throw th4;
                    }
                }
                if (!z10) {
                    e4.l lVarR = workDatabase.r();
                    String string2 = uuid.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "id.toString()");
                    e4.k kVar3 = new e4.k(str, string2);
                    WorkDatabase_Impl workDatabase_Impl5 = (WorkDatabase_Impl) lVarR.f7989e;
                    workDatabase_Impl5.b();
                    workDatabase_Impl5.c();
                    try {
                        ((e4.b) lVarR.f7990i).g(kVar3);
                        workDatabase_Impl5.o();
                        workDatabase_Impl5.k();
                    } catch (Throwable th5) {
                        workDatabase_Impl5.k();
                        throw th5;
                    }
                }
                z12 = z20;
                oVar = oVar2;
                zVar6 = zVar8;
                z18 = z18;
                it6 = it6;
                jCurrentTimeMillis = jCurrentTimeMillis;
                zVar3 = zVar3;
                zVar4 = zVar4;
            } catch (Throwable th6) {
                workDatabase_Impl2.k();
                throw th6;
            }
        }
        kVar2 = kVar;
        z13 = z12;
        z14 = true;
        kVar2.f22039h = z14;
        return z13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z5;
        e4.e eVar = this.f8823e;
        w3.k kVar = this.f8822d;
        try {
            kVar.getClass();
            w3.o oVar = kVar.f22033b;
            HashSet hashSet = new HashSet();
            hashSet.addAll(kVar.f22037f);
            HashSet hashSetB0 = w3.k.B0(kVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(kVar.f22037f);
                    z5 = false;
                    break;
                } else if (hashSetB0.contains((String) it.next())) {
                    z5 = true;
                    break;
                }
            }
            if (z5) {
                throw new IllegalStateException("WorkContinuation has cycles (" + kVar + ")");
            }
            WorkDatabase workDatabase = oVar.f22048c;
            workDatabase.c();
            try {
                android.support.v4.media.session.b.c(workDatabase, oVar.f22047b, kVar);
                boolean zA = a(kVar);
                workDatabase.o();
                workDatabase.k();
                if (zA) {
                    j.a(oVar.f22046a, RescheduleReceiver.class, true);
                    w3.i.b(oVar.f22047b, oVar.f22048c, oVar.f22050e);
                }
                eVar.I(x.A);
            } catch (Throwable th2) {
                workDatabase.k();
                throw th2;
            }
        } catch (Throwable th3) {
            eVar.I(new v3.u(th3));
        }
    }
}
