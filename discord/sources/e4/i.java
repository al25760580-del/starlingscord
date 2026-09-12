package e4;

import a5.l0;
import android.content.Context;
import android.database.Cursor;
import android.os.SystemClock;
import android.util.Pair;
import android.view.ViewGroup;
import androidx.appcompat.widget.b4;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools$SimplePool;
import androidx.work.impl.WorkDatabase_Impl;
import ar.b0;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.play.agesignals.AgeSignalsAccessResult;
import com.google.android.play.agesignals.AgeSignalsManager;
import com.google.android.play.agesignals.AgeSignalsResult;
import ep.x;
import ic.k0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;
import je.e0;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import lq.z;
import md.w;
import mo.c0;
import pp.v;
import sh.p0;
import sh.s;
import sh.v0;
import vo.n0;
import vo.o0;
import yo.q0;
import zp.t;
import zp.y;

/* JADX INFO: loaded from: classes.dex */
public final class i implements xb.b, c5.l, w, mc.o, np.n, np.m, AgeSignalsManager, th.g {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static int f7978x = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f7980e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f7981i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f7982v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f7983w;

    public /* synthetic */ i(int i7, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f7979d = i7;
        this.f7980e = obj;
        this.f7981i = obj2;
        this.f7982v = obj3;
        this.f7983w = obj4;
    }

    public static void D(long j, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            map.remove(arrayList.get(i7));
        }
    }

    public void A(e2.j jVar) throws Throwable {
        Object objO = ((cr.h) this.f7982v).o(jVar);
        if (objO instanceof cr.l) {
            Throwable th2 = ((cr.l) objO).f7384a;
            if (th2 != null) {
                throw th2;
            }
            throw new cr.q("Channel was closed normally");
        }
        if (objO instanceof cr.m) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) this.f7983w).getAndIncrement() == 0) {
            b0.t((fr.d) this.f7980e, null, new b4.d(this, (Continuation) null, 5), 3);
        }
    }

    @Override // np.m
    public void B(up.b enumClassId, up.e enumEntryName) {
        Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
        Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
        ((ArrayList) this.f7980e).add(new zp.i(enumClassId, enumEntryName));
    }

    public synchronized void C(c5.n nVar) {
        BlockingQueue blockingQueue;
        try {
            String cacheKey = nVar.getCacheKey();
            List list = (List) ((HashMap) this.f7980e).remove(cacheKey);
            if (list != null && !list.isEmpty()) {
                if (c5.w.f3524a) {
                    c5.w.d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), cacheKey);
                }
                c5.n nVar2 = (c5.n) list.remove(0);
                ((HashMap) this.f7980e).put(cacheKey, list);
                nVar2.setNetworkRequestCompleteListener(this);
                if (((c5.c) this.f7982v) != null && (blockingQueue = (BlockingQueue) this.f7983w) != null) {
                    try {
                        blockingQueue.put(nVar2);
                    } catch (InterruptedException e10) {
                        c5.w.c("Couldn't add request to queue. %s", e10.toString());
                        Thread.currentThread().interrupt();
                        c5.c cVar = (c5.c) this.f7982v;
                        cVar.f3482w = true;
                        cVar.interrupt();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public qd.b E(List list) {
        qd.b bVar;
        HashMap map = (HashMap) this.f7982v;
        ArrayList arrayListF = f(list);
        if (arrayListF.size() < 2) {
            return (qd.b) ei.p.h(null, arrayListF);
        }
        Collections.sort(arrayListF, new cl.b(22));
        ArrayList arrayList = new ArrayList();
        int i7 = ((qd.b) arrayListF.get(0)).f18713c;
        for (int i10 = 0; i10 < arrayListF.size(); i10++) {
            qd.b bVar2 = (qd.b) arrayListF.get(i10);
            if (i7 != bVar2.f18713c) {
                if (arrayList.size() != 1) {
                    break;
                }
                return (qd.b) arrayListF.get(0);
            }
            arrayList.add(new Pair(bVar2.f18712b, Integer.valueOf(bVar2.f18714d)));
        }
        qd.b bVar3 = (qd.b) map.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List listSubList = arrayListF.subList(0, arrayList.size());
        int i11 = 0;
        for (int i12 = 0; i12 < listSubList.size(); i12++) {
            i11 += ((qd.b) listSubList.get(i12)).f18714d;
        }
        int iNextInt = ((Random) this.f7983w).nextInt(i11);
        int i13 = 0;
        for (int i14 = 0; i14 < listSubList.size(); i14++) {
            bVar = (qd.b) listSubList.get(i14);
            i13 += bVar.f18714d;
            if (iNextInt < i13) {
                map.put(arrayList, bVar);
                return bVar;
            }
        }
        bVar = (qd.b) ei.p.i(listSubList);
        map.put(arrayList, bVar);
        return bVar;
    }

    public void F(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        double dC = sl.c.c(viewGroup.getWidth());
        double dC2 = sl.c.c(viewGroup.getHeight());
        vl.a aVar = new vl.a(dC, dC2);
        if (Intrinsics.areEqual(aVar, (vl.a) this.f7981i)) {
            return;
        }
        this.f7981i = aVar;
        ThemedReactContext themedReactContext = (ThemedReactContext) this.f7980e;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("height", dC2);
        writableMapCreateMap.putDouble("width", dC);
        Unit unit = Unit.f14616a;
        sl.b.b(themedReactContext, "KeyboardController::windowDidResize", writableMapCreateMap);
    }

    public b4 G(int i7, up.b classId, ap.a source) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(source, "source");
        np.p signature = (np.p) this.f7980e;
        Intrinsics.checkNotNullParameter(signature, "signature");
        np.p pVar = new np.p(signature.f17017a + '@' + i7);
        e eVar = (e) this.f7983w;
        HashMap map = (HashMap) eVar.f7972i;
        List arrayList = (List) map.get(pVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(pVar, arrayList);
        }
        return ((af.c) eVar.f7971e).H(classId, source, arrayList);
    }

    @Override // np.m
    public void K(Object obj) {
        ((ArrayList) this.f7980e).add(af.c.g((af.c) this.f7981i, (up.e) this.f7982v, obj));
    }

    @Override // th.g
    public Object a() {
        Object objA = ((th.f) this.f7980e).a();
        int i7 = 8;
        return new v0((s) objA, new th.f(new pf.b(8, (po.d) this.f7981i)), (p0) ((th.f) this.f7982v).a(), new th.f(new pf.b(i7, (th.f) this.f7983w)));
    }

    @Override // mc.o
    public void b(int i7, md.s sVar) {
        if (y(i7, sVar)) {
            ((mc.n) this.f7982v).a();
        }
    }

    public void c(ArrayList arrayList) {
        ArrayList arrayList2 = (ArrayList) this.f7983w;
        ArrayList arrayList3 = (ArrayList) this.f7982v;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            arrayList.get(size).getClass();
            throw new ClassCastException();
        }
        if (arrayList3.size() > 0) {
            int size2 = arrayList3.size();
            for (int i7 = 0; i7 < size2; i7++) {
                if (!arrayList2.contains(Integer.valueOf(i7))) {
                    if (arrayList3.get(i7) != null) {
                        throw new ClassCastException();
                    }
                    int i10 = i7 + 1;
                    if (i10 < arrayList3.size()) {
                        arrayList3.get(i10).getClass();
                        throw new ClassCastException();
                    }
                }
            }
            for (int size3 = arrayList2.size() - 1; -1 < size3; size3--) {
                arrayList3.remove(((Number) arrayList2.get(size3)).intValue());
            }
            if (arrayList3.size() > 0) {
                arrayList3.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList3.clear();
            arrayList2.clear();
        }
    }

    @Override // md.w
    public void d(int i7, md.s sVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z5) {
        if (y(i7, sVar)) {
            ((a1.d) this.f7981i).r(loadEventInfo, z(mediaLoadData), iOException, z5);
        }
    }

    @Override // np.n
    public np.l e(up.b classId, ap.a source) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(source, "source");
        return ((af.c) ((e) this.f7982v).f7971e).H(classId, source, (ArrayList) this.f7981i);
    }

    @Override // np.m
    public np.l e0(up.b classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        ArrayList arrayList = new ArrayList();
        af.c cVar = (af.c) this.f7981i;
        o0 NO_SOURCE = n0.C;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        b4 b4VarG = cVar.G(classId, NO_SOURCE, arrayList);
        Intrinsics.checkNotNull(b4VarG);
        com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r();
        rVar.f6611e = b4VarG;
        rVar.f6612i = this;
        rVar.f6613v = arrayList;
        rVar.f6610d = b4VarG;
        return rVar;
    }

    public ArrayList f(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = (HashMap) this.f7980e;
        D(jElapsedRealtime, map);
        HashMap map2 = (HashMap) this.f7981i;
        D(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            qd.b bVar = (qd.b) list.get(i7);
            if (!map.containsKey(bVar.f18712b) && !map2.containsKey(Integer.valueOf(bVar.f18713c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.play.agesignals.AgeSignalsManager
    public ig.l g(ph.h hVar) {
        ph.a aVar = (ph.a) this.f7982v;
        if (aVar != null) {
            return l0.u(aVar);
        }
        AgeSignalsAccessResult ageSignalsAccessResult = (AgeSignalsAccessResult) this.f7983w;
        return ageSignalsAccessResult != null ? l0.v(ageSignalsAccessResult) : l0.u(new IllegalStateException("FakeAgeSignalsManager not configured with an age signals access response or exception."));
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new com.google.firebase.messaging.r((Executor) ((Provider) this.f7980e).get(), (cc.d) ((Provider) this.f7981i).get(), (m) ((m) this.f7982v).get(), (dc.c) ((Provider) this.f7983w).get());
    }

    @Override // com.google.android.play.agesignals.AgeSignalsManager
    public ig.l h(kh.f fVar) {
        ph.a aVar = (ph.a) this.f7980e;
        if (aVar != null) {
            return l0.u(aVar);
        }
        AgeSignalsResult ageSignalsResult = (AgeSignalsResult) this.f7981i;
        return ageSignalsResult != null ? l0.v(ageSignalsResult) : l0.u(new IllegalStateException("FakeAgeSignalsManager not configured with a response or exception."));
    }

    @Override // np.m
    public void i() {
        switch (this.f7979d) {
            case 11:
                ArrayList arrayList = (ArrayList) this.f7981i;
                if (!arrayList.isEmpty()) {
                    ((HashMap) ((e) this.f7982v).f7972i).put((np.p) this.f7980e, arrayList);
                }
                break;
            default:
                b4 b4Var = (b4) this.f7983w;
                up.e eVar = (up.e) this.f7982v;
                ArrayList elements = (ArrayList) this.f7980e;
                b4Var.getClass();
                Intrinsics.checkNotNullParameter(elements, "elements");
                if (eVar != null) {
                    q0 q0VarS = ib.a.s(eVar, (vo.f) b4Var.f912v);
                    if (q0VarS != null) {
                        HashMap map = (HashMap) b4Var.f910e;
                        List value = vq.m.e(elements);
                        z type = q0VarS.getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        Intrinsics.checkNotNullParameter(value, "value");
                        Intrinsics.checkNotNullParameter(type, "type");
                        map.put(eVar, new y(value, type));
                        break;
                    } else if (((af.c) b4Var.f911i).E((up.b) b4Var.f913w) && Intrinsics.areEqual(eVar.b(), "value")) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : elements) {
                            if (obj instanceof zp.a) {
                                arrayList2.add(obj);
                            }
                        }
                        List list = (List) b4Var.f914x;
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            list.add((wo.b) ((zp.a) it.next()).f24066a);
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // md.w
    public void j(int i7, md.s sVar, MediaLoadData mediaLoadData) {
        if (y(i7, sVar)) {
            ((a1.d) this.f7981i).g(z(mediaLoadData));
        }
    }

    public void k(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((SimpleArrayMap) this.f7981i).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i7 = 0; i7 < size; i7++) {
                k(arrayList2.get(i7), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public void l(ArrayList frameStates) {
        Intrinsics.checkNotNullParameter(frameStates, "frameStates");
        synchronized (((ArrayList) this.f7981i)) {
            frameStates.clear();
            c((ArrayList) this.f7980e);
            c((ArrayList) this.f7981i);
            Unit unit = Unit.f14616a;
        }
    }

    @Override // md.w
    public void m(int i7, md.s sVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        if (y(i7, sVar)) {
            ((a1.d) this.f7981i).l(loadEventInfo, z(mediaLoadData));
        }
    }

    @Override // md.w
    public void n(int i7, md.s sVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        if (y(i7, sVar)) {
            ((a1.d) this.f7981i).o(loadEventInfo, z(mediaLoadData));
        }
    }

    public g o(j id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(id2, "id");
        String str = id2.f7984a;
        int i7 = id2.f7985b;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f7980e;
        a3.o oVarG = a3.o.g(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        if (str == null) {
            oVarG.R(1);
        } else {
            oVarG.o(1, str);
        }
        oVarG.x(2, i7);
        workDatabase_Impl.b();
        Cursor cursorM = l0.M(workDatabase_Impl, oVarG);
        try {
            int iK = a.a.k(cursorM, "work_spec_id");
            int iK2 = a.a.k(cursorM, "generation");
            int iK3 = a.a.k(cursorM, "system_id");
            g gVar = null;
            String string = null;
            if (cursorM.moveToFirst()) {
                if (!cursorM.isNull(iK)) {
                    string = cursorM.getString(iK);
                }
                gVar = new g(string, cursorM.getInt(iK2), cursorM.getInt(iK3));
            }
            return gVar;
        } finally {
            cursorM.close();
            oVarG.i();
        }
    }

    @Override // mc.o
    public void p(int i7, md.s sVar, Exception exc) {
        if (y(i7, sVar)) {
            ((mc.n) this.f7982v).d(exc);
        }
    }

    public void q(g gVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f7980e;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f7981i).g(gVar);
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
        }
    }

    @Override // mc.o
    public void r(int i7, md.s sVar, int i10) {
        if (y(i7, sVar)) {
            ((mc.n) this.f7982v).c(i10);
        }
    }

    @Override // np.m
    public void r0(zp.f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((ArrayList) this.f7980e).add(new t(value));
    }

    public boolean s(vo.q0 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (Intrinsics.areEqual((vo.q0) this.f7981i, descriptor)) {
            return true;
        }
        i iVar = (i) this.f7980e;
        return iVar != null ? iVar.s(descriptor) : false;
    }

    @Override // mc.o
    public void t(int i7, md.s sVar) {
        if (y(i7, sVar)) {
            ((mc.n) this.f7982v).b();
        }
    }

    @Override // mc.o
    public void u(int i7, md.s sVar) {
        if (y(i7, sVar)) {
            ((mc.n) this.f7982v).e();
        }
    }

    public synchronized boolean v(c5.n nVar) {
        try {
            String cacheKey = nVar.getCacheKey();
            if (!((HashMap) this.f7980e).containsKey(cacheKey)) {
                ((HashMap) this.f7980e).put(cacheKey, null);
                nVar.setNetworkRequestCompleteListener(this);
                if (c5.w.f3524a) {
                    c5.w.b("new request, sending to network %s", cacheKey);
                }
                return false;
            }
            List arrayList = (List) ((HashMap) this.f7980e).get(cacheKey);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            nVar.addMarker("waiting-for-response");
            arrayList.add(nVar);
            ((HashMap) this.f7980e).put(cacheKey, arrayList);
            if (c5.w.f3524a) {
                c5.w.b("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // md.w
    public void w(int i7, md.s sVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        if (y(i7, sVar)) {
            ((a1.d) this.f7981i).t(loadEventInfo, z(mediaLoadData));
        }
    }

    @Override // md.w
    public void x(int i7, md.s sVar, MediaLoadData mediaLoadData) {
        if (y(i7, sVar)) {
            ((a1.d) this.f7981i).B(z(mediaLoadData));
        }
    }

    public boolean y(int i7, md.s sVar) {
        md.s sVarV;
        Object obj = this.f7980e;
        md.g gVar = (md.g) this.f7983w;
        if (sVar != null) {
            sVarV = gVar.v(obj, sVar);
            if (sVarV == null) {
                return false;
            }
        } else {
            sVarV = null;
        }
        int iX = gVar.x(i7, obj);
        a1.d dVar = (a1.d) this.f7981i;
        if (dVar.f17e != iX || !e0.a((md.s) dVar.f18i, sVarV)) {
            this.f7981i = new a1.d((CopyOnWriteArrayList) gVar.f15581i.f19v, iX, sVarV);
        }
        mc.n nVar = (mc.n) this.f7982v;
        if (nVar.f15568a == iX && e0.a(nVar.f15569b, sVarV)) {
            return true;
        }
        this.f7982v = new mc.n(gVar.f15582v.f15570c, iX, sVarV);
        return true;
    }

    public MediaLoadData z(MediaLoadData mediaLoadData) {
        md.g gVar = (md.g) this.f7983w;
        Object obj = this.f7980e;
        long j = mediaLoadData.f5703f;
        long jW = gVar.w(j, obj);
        long j5 = mediaLoadData.f5704g;
        long jW2 = gVar.w(j5, obj);
        return (jW == j && jW2 == j5) ? mediaLoadData : new MediaLoadData(mediaLoadData.f5698a, mediaLoadData.f5699b, mediaLoadData.f5700c, mediaLoadData.f5701d, mediaLoadData.f5702e, jW, jW2);
    }

    public i(ThemedReactContext themedReactContext) {
        this.f7979d = 17;
        this.f7980e = themedReactContext;
        this.f7981i = new vl.a(0.0d, 0.0d);
    }

    public i(aa.b bVar) {
        this.f7979d = 1;
        this.f7980e = bVar;
    }

    public i(fr.d scope, androidx.fragment.app.r onComplete, Function2 onUndeliveredElement, e2.m consumeMessage) {
        this.f7979d = 4;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.f7980e = scope;
        this.f7981i = consumeMessage;
        this.f7982v = ls.l.a(Integer.MAX_VALUE, 6, null);
        this.f7983w = new AtomicInteger(0);
        Job job = (Job) scope.f9367d.l(ar.w.f2975e);
        if (job == null) {
            return;
        }
        job.O(new e2.g(onComplete, this, onUndeliveredElement));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(WorkDatabase_Impl database) {
        this.f7979d = 0;
        this.f7980e = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.f7981i = new b(database, false, 2);
        this.f7982v = new h(database, 0 == true ? 1 : 0);
        this.f7983w = new h(database, 1);
    }

    public i(int i7) {
        this.f7979d = i7;
        switch (i7) {
            case 14:
                break;
            case 15:
            case 17:
            default:
                Random random = new Random();
                this.f7982v = new HashMap();
                this.f7983w = random;
                this.f7980e = new HashMap();
                this.f7981i = new HashMap();
                break;
            case 16:
                this.f7980e = new Pools$SimplePool(10);
                this.f7981i = new SimpleArrayMap(0);
                this.f7982v = new ArrayList();
                this.f7983w = new HashSet();
                break;
            case 18:
                this.f7980e = new ArrayList();
                this.f7981i = new ArrayList();
                this.f7982v = new ArrayList();
                this.f7983w = new ArrayList();
                new ArrayList();
                break;
        }
    }

    public i(c5.c cVar, BlockingQueue blockingQueue, u4.b bVar) {
        this.f7979d = 3;
        this.f7980e = new HashMap();
        this.f7981i = bVar;
        this.f7982v = cVar;
        this.f7983w = blockingQueue;
    }

    public i(e eVar, np.p signature) {
        this.f7979d = 11;
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.f7983w = eVar;
        this.f7979d = 11;
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.f7982v = eVar;
        this.f7980e = signature;
        this.f7981i = new ArrayList();
    }

    public i(hp.a components, hp.f typeParameterResolver, Lazy delegateForDefaultTypeQualifiers) {
        this.f7979d = 5;
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        Intrinsics.checkNotNullParameter(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.f7980e = components;
        this.f7981i = typeParameterResolver;
        this.f7982v = delegateForDefaultTypeQualifiers;
        this.f7983w = new m(this, typeParameterResolver);
    }

    public i(af.c cVar, up.e eVar, b4 b4Var) {
        this.f7979d = 12;
        this.f7981i = cVar;
        this.f7982v = eVar;
        this.f7983w = b4Var;
        this.f7980e = new ArrayList();
    }

    public i(md.g gVar, Object obj) {
        this.f7979d = 10;
        this.f7983w = gVar;
        this.f7981i = gVar.a(null);
        this.f7982v = new mc.n(gVar.f15582v.f15570c, 0, null);
        this.f7980e = obj;
    }

    public i(Context context) {
        this.f7979d = 6;
        this.f7980e = context;
        this.f7981i = ic.f.f11500c;
        this.f7983w = k0.f11560a;
    }

    public i(io.sentry.android.core.b0 b0Var) {
        this.f7979d = 7;
        this.f7980e = b0Var;
        this.f7981i = null;
        this.f7982v = null;
        this.f7983w = null;
    }

    public i(io.sentry.android.core.b0 b0Var, byte[] bArr) {
        this.f7979d = 7;
        this.f7980e = b0Var;
        this.f7981i = bArr;
        this.f7982v = null;
        this.f7983w = null;
    }

    public i(jq.j jVar) {
        this.f7979d = 8;
        this.f7983w = jVar;
        List list = jVar.f14030w.Q;
        Intrinsics.checkNotNullExpressionValue(list, "getEnumEntryList(...)");
        int iA = kotlin.collections.v0.a(kotlin.collections.e0.l(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (Object obj : list) {
            linkedHashMap.put(c0.w((rp.f) jVar.I.f3123i, ((v) obj).f18460v), obj);
        }
        this.f7980e = linkedHashMap;
        jq.j jVar2 = (jq.j) this.f7983w;
        this.f7981i = ((hq.j) jVar2.I.f3122e).f11019a.d(new ip.m(3, this, jVar2));
        kq.l lVar = ((hq.j) ((jq.j) this.f7983w).I.f3122e).f11019a;
        x xVar = new x(8, this);
        lVar.getClass();
        this.f7982v = new kq.i(lVar, xVar);
    }
}
