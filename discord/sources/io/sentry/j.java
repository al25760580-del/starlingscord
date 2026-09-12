package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements IScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IScope f12777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IScope f12778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IScope f12779c;

    public j(IScope iScope, IScope iScope2, IScope iScope3) {
        this.f12777a = iScope;
        this.f12778b = iScope2;
        this.f12779c = iScope3;
    }

    @Override // io.sentry.IScope
    public final h6 A(n3 n3Var) {
        return b(null).A(n3Var);
    }

    @Override // io.sentry.IScope
    public final void B(String str) {
        b(null).B(str);
    }

    @Override // io.sentry.IScope
    public final z0 C() {
        z0 z0VarC = this.f12779c.C();
        if (!(z0VarC instanceof q2)) {
            return z0VarC;
        }
        z0 z0VarC2 = this.f12778b.C();
        return !(z0VarC2 instanceof q2) ? z0VarC2 : this.f12777a.C();
    }

    @Override // io.sentry.IScope
    public final Map D() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(this.f12777a.D());
        concurrentHashMap.putAll(this.f12778b.D());
        concurrentHashMap.putAll(this.f12779c.D());
        return concurrentHashMap;
    }

    @Override // io.sentry.IScope
    public final void E() {
        b(null).E();
    }

    @Override // io.sentry.IScope
    public final List F() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(this.f12777a.F());
        copyOnWriteArrayList.addAll(this.f12778b.F());
        copyOnWriteArrayList.addAll(this.f12779c.F());
        Collections.sort(copyOnWriteArrayList);
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.IScope
    public final void G(Object obj, String str) {
        b(null).G(obj, str);
    }

    @Override // io.sentry.IScope
    public final List H() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(this.f12777a.H());
        copyOnWriteArrayList.addAll(this.f12778b.H());
        copyOnWriteArrayList.addAll(this.f12779c.H());
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.IScope
    public final void I(SentryEvent sentryEvent) {
        this.f12777a.I(sentryEvent);
    }

    @Override // io.sentry.IScope
    public final io.sentry.protocol.c J() {
        IScope iScope = this.f12777a;
        return new h(iScope.J(), this.f12778b.J(), this.f12779c.J(), iScope.l().getDefaultScopeType());
    }

    @Override // io.sentry.IScope
    public final void K() {
        b(null).K();
    }

    @Override // io.sentry.IScope
    public final e4.m L(m3 m3Var) {
        return b(null).L(m3Var);
    }

    @Override // io.sentry.IScope
    public final void M(o3 o3Var) {
        b(null).M(o3Var);
    }

    @Override // io.sentry.IScope
    public final void N(io.sentry.protocol.v vVar) {
        this.f12777a.N(vVar);
        this.f12778b.N(vVar);
        this.f12779c.N(vVar);
    }

    @Override // io.sentry.IScope
    public final void O(f1 f1Var) {
        b(null).O(f1Var);
    }

    @Override // io.sentry.IScope
    public final List P() {
        List listP = this.f12779c.P();
        if (!listP.isEmpty()) {
            return listP;
        }
        List listP2 = this.f12778b.P();
        return !listP2.isEmpty() ? listP2 : this.f12777a.P();
    }

    @Override // io.sentry.IScope
    public final io.sentry.protocol.h0 Q() {
        io.sentry.protocol.h0 h0VarQ = this.f12779c.Q();
        if (h0VarQ != null) {
            return h0VarQ;
        }
        io.sentry.protocol.h0 h0VarQ2 = this.f12778b.Q();
        return h0VarQ2 != null ? h0VarQ2 : this.f12777a.Q();
    }

    @Override // io.sentry.IScope
    public final io.sentry.protocol.p R() {
        io.sentry.protocol.p pVarR = this.f12779c.R();
        if (pVarR != null) {
            return pVarR;
        }
        io.sentry.protocol.p pVarR2 = this.f12778b.R();
        return pVarR2 != null ? pVarR2 : this.f12777a.R();
    }

    @Override // io.sentry.IScope
    public final List S() {
        return yk.a.H((CopyOnWriteArrayList) F());
    }

    @Override // io.sentry.IScope
    public final String T() {
        String strT = this.f12779c.T();
        if (strT != null) {
            return strT;
        }
        String strT2 = this.f12778b.T();
        return strT2 != null ? strT2 : this.f12777a.T();
    }

    @Override // io.sentry.IScope
    public final String a() {
        String strA = this.f12779c.a();
        if (strA != null) {
            return strA;
        }
        String strA2 = this.f12778b.a();
        return strA2 != null ? strA2 : this.f12777a.a();
    }

    public final IScope b(t3 t3Var) {
        IScope iScope = this.f12778b;
        IScope iScope2 = this.f12779c;
        IScope iScope3 = this.f12777a;
        if (t3Var != null) {
            int i7 = i.f12728a[t3Var.ordinal()];
            if (i7 == 1) {
                return iScope2;
            }
            if (i7 == 2) {
                return iScope;
            }
            if (i7 == 3) {
                return iScope3;
            }
            if (i7 == 4) {
                return this;
            }
        }
        int i10 = i.f12728a[iScope3.l().getDefaultScopeType().ordinal()];
        if (i10 == 1) {
            return iScope2;
        }
        if (i10 != 2) {
            return i10 != 3 ? iScope2 : iScope3;
        }
        return iScope;
    }

    @Override // io.sentry.IScope
    public final void c(Breadcrumb breadcrumb) {
        b(null).c(breadcrumb);
    }

    @Override // io.sentry.IScope
    public final void clear() {
        b(null).clear();
    }

    @Override // io.sentry.IScope
    public final void f(String str, String str2) {
        b(null).f(str, str2);
    }

    @Override // io.sentry.IScope
    public final void g(Breadcrumb breadcrumb, Hint hint) {
        b(null).g(breadcrumb, hint);
    }

    @Override // io.sentry.IScope
    public final Map getExtras() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(this.f12777a.getExtras());
        concurrentHashMap.putAll(this.f12778b.getExtras());
        concurrentHashMap.putAll(this.f12779c.getExtras());
        return concurrentHashMap;
    }

    @Override // io.sentry.IScope
    public final io.sentry.protocol.h h() {
        return s().h();
    }

    @Override // io.sentry.IScope
    public final void i(List list) {
        b(null).i(list);
    }

    @Override // io.sentry.IScope
    public final void j(String str, String str2) {
        b(null).j(str, str2);
    }

    @Override // io.sentry.IScope
    public final void k(io.sentry.protocol.v vVar) {
        b(null).k(vVar);
    }

    @Override // io.sentry.IScope
    public final w5 l() {
        return this.f12777a.l();
    }

    @Override // io.sentry.IScope
    public final void m(io.sentry.protocol.h0 h0Var) {
        b(null).m(h0Var);
    }

    @Override // io.sentry.IScope
    public final f1 n() {
        f1 f1VarN = this.f12779c.n();
        if (f1VarN != null) {
            return f1VarN;
        }
        f1 f1VarN2 = this.f12778b.n();
        return f1VarN2 != null ? f1VarN2 : this.f12777a.n();
    }

    @Override // io.sentry.IScope
    public final h6 o() {
        return b(null).o();
    }

    @Override // io.sentry.IScope
    public final io.sentry.internal.debugmeta.c p() {
        return b(null).p();
    }

    @Override // io.sentry.IScope
    public final void q(e4.m mVar) {
        b(null).q(mVar);
    }

    @Override // io.sentry.IScope
    public final void r() {
        b(null).r();
    }

    @Override // io.sentry.IScope
    public final io.sentry.featureflags.b s() {
        w5 w5VarL = this.f12777a.l();
        io.sentry.featureflags.b bVarS = this.f12777a.s();
        io.sentry.featureflags.b bVarS2 = this.f12778b.s();
        io.sentry.featureflags.b bVarS3 = this.f12779c.s();
        io.sentry.featureflags.c cVar = io.sentry.featureflags.c.f12679d;
        int maxFeatureFlags = w5VarL.getMaxFeatureFlags();
        if (maxFeatureFlags > 0) {
            io.sentry.featureflags.a aVar = bVarS instanceof io.sentry.featureflags.a ? (io.sentry.featureflags.a) bVarS : null;
            io.sentry.featureflags.a aVar2 = bVarS2 instanceof io.sentry.featureflags.a ? (io.sentry.featureflags.a) bVarS2 : null;
            io.sentry.featureflags.a aVar3 = bVarS3 instanceof io.sentry.featureflags.a ? (io.sentry.featureflags.a) bVarS3 : null;
            CopyOnWriteArrayList copyOnWriteArrayList = aVar == null ? null : aVar.f12678d;
            CopyOnWriteArrayList copyOnWriteArrayList2 = aVar2 == null ? null : aVar2.f12678d;
            CopyOnWriteArrayList copyOnWriteArrayList3 = aVar3 != null ? aVar3.f12678d : null;
            int size = copyOnWriteArrayList == null ? 0 : copyOnWriteArrayList.size();
            int size2 = copyOnWriteArrayList2 == null ? 0 : copyOnWriteArrayList2.size();
            int size3 = copyOnWriteArrayList3 != null ? copyOnWriteArrayList3.size() : 0;
            if (size != 0 || size2 != 0 || size3 != 0) {
                int i7 = size - 1;
                int i10 = size2 - 1;
                int i11 = size3 - 1;
                if (copyOnWriteArrayList != null && i7 >= 0 && copyOnWriteArrayList.get(i7) != null) {
                    throw new ClassCastException();
                }
                if (copyOnWriteArrayList2 != null && i10 >= 0 && copyOnWriteArrayList2.get(i10) != null) {
                    throw new ClassCastException();
                }
                if (copyOnWriteArrayList3 != null && i11 >= 0 && copyOnWriteArrayList3.get(i11) != null) {
                    throw new ClassCastException();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(maxFeatureFlags);
                linkedHashMap.size();
                ArrayList arrayList = new ArrayList(linkedHashMap.values());
                Collections.reverse(arrayList);
                CopyOnWriteArrayList copyOnWriteArrayList4 = new CopyOnWriteArrayList(arrayList);
                io.sentry.featureflags.a aVar4 = new io.sentry.featureflags.a();
                new io.sentry.util.a();
                aVar4.f12678d = copyOnWriteArrayList4;
                return aVar4;
            }
        }
        return cVar;
    }

    @Override // io.sentry.IScope
    public final ISpan t() {
        ISpan iSpanT = this.f12779c.t();
        if (iSpanT != null) {
            return iSpanT;
        }
        ISpan iSpanT2 = this.f12778b.t();
        return iSpanT2 != null ? iSpanT2 : this.f12777a.t();
    }

    @Override // io.sentry.IScope
    public final void u(String str) {
        b(null).u(str);
    }

    @Override // io.sentry.IScope
    public final h6 v() {
        h6 h6VarV = this.f12779c.v();
        if (h6VarV != null) {
            return h6VarV;
        }
        h6 h6VarV2 = this.f12778b.v();
        return h6VarV2 != null ? h6VarV2 : this.f12777a.v();
    }

    @Override // io.sentry.IScope
    public final Queue w() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f12777a.w());
        arrayList.addAll(this.f12778b.w());
        IScope iScope = this.f12779c;
        arrayList.addAll(iScope.w());
        Collections.sort(arrayList);
        Queue queueB = p3.b(iScope.l().getMaxBreadcrumbs());
        queueB.addAll(arrayList);
        return queueB;
    }

    @Override // io.sentry.IScope
    public final SentryLevel x() {
        SentryLevel sentryLevelX = this.f12779c.x();
        if (sentryLevelX != null) {
            return sentryLevelX;
        }
        SentryLevel sentryLevelX2 = this.f12778b.x();
        return sentryLevelX2 != null ? sentryLevelX2 : this.f12777a.x();
    }

    @Override // io.sentry.IScope
    public final io.sentry.protocol.v y() {
        io.sentry.protocol.v vVarY = this.f12779c.y();
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f13055e;
        if (!vVar.equals(vVarY)) {
            return vVarY;
        }
        io.sentry.protocol.v vVarY2 = this.f12778b.y();
        return !vVar.equals(vVarY2) ? vVarY2 : this.f12777a.y();
    }

    @Override // io.sentry.IScope
    public final e4.m z() {
        return b(null).z();
    }

    @Override // io.sentry.IScope
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final IScope m1261clone() {
        return new j(this.f12777a, this.f12778b.m1261clone(), this.f12779c.m1261clone());
    }
}
