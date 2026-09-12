package vp;

import com.google.android.gms.internal.play_billing.v1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f21906d;

    public k() {
        this.f21906d = new h();
    }

    public final boolean i() {
        y yVar = this.f21906d.f21887a;
        for (int i7 = 0; i7 < yVar.f21932e.size(); i7++) {
            if (!h.e((Map.Entry) yVar.f21932e.get(i7))) {
                return false;
            }
        }
        Iterator it = yVar.c().iterator();
        while (it.hasNext()) {
            if (!h.e((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int j() {
        y yVar = this.f21906d.f21887a;
        int iD = 0;
        for (int i7 = 0; i7 < yVar.f21932e.size(); i7++) {
            Map.Entry entry = (Map.Entry) yVar.f21932e.get(i7);
            iD += h.d((l) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : yVar.c()) {
            iD += h.d((l) entry2.getKey(), entry2.getValue());
        }
        return iD;
    }

    public final Object k(m mVar) {
        o(mVar);
        l lVar = mVar.f21913d;
        Object obj = this.f21906d.f21887a.get(lVar);
        if (obj == null) {
            return mVar.f21911b;
        }
        if (!lVar.f21909i) {
            return mVar.a(obj);
        }
        if (lVar.f21908e.f21895d != j0.F) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(mVar.a(it.next()));
        }
        return arrayList;
    }

    public final boolean l(m mVar) {
        o(mVar);
        l lVar = mVar.f21913d;
        h hVar = this.f21906d;
        hVar.getClass();
        if (lVar.f21909i) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return hVar.f21887a.get(lVar) != null;
    }

    public final void m() {
        this.f21906d.f();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0019  */
    public final boolean n(e eVar, v1 v1Var, g gVar, int i7) throws q {
        boolean z5;
        boolean z6;
        Object objC;
        a aVar;
        int i10 = i7 & 7;
        m mVar = (m) gVar.f21885a.get(new f(i7 >>> 3, a()));
        if (mVar == null) {
            z6 = true;
            z5 = false;
        } else {
            l lVar = mVar.f21913d;
            i0 i0Var = lVar.f21908e;
            h hVar = h.f21886c;
            if (i10 == i0Var.f21896e) {
                z6 = false;
                z5 = false;
            } else if (lVar.f21909i && i0Var.a() && i10 == 2) {
                z5 = true;
                z6 = false;
            } else {
                z6 = true;
                z5 = false;
            }
        }
        if (z6) {
            return eVar.q(i7, v1Var);
        }
        i iVarD = null;
        h hVar2 = this.f21906d;
        if (z5) {
            int iD = eVar.d(eVar.k());
            l lVar2 = mVar.f21913d;
            if (lVar2.f21908e != i0.f21894y) {
                while (eVar.b() > 0) {
                    hVar2.a(lVar2, h.h(eVar, lVar2.f21908e));
                }
            } else if (eVar.b() > 0) {
                eVar.k();
                throw null;
            }
            eVar.c(iD);
            return true;
        }
        l lVar3 = mVar.f21913d;
        i0 i0Var2 = lVar3.f21908e;
        boolean z7 = lVar3.f21909i;
        int iOrdinal = i0Var2.f21895d.ordinal();
        if (iOrdinal == 7) {
            eVar.k();
            throw null;
        }
        if (iOrdinal != 8) {
            objC = h.h(eVar, i0Var2);
        } else {
            if (!z7 && (aVar = (a) hVar2.f21887a.get(lVar3)) != null) {
                iVarD = aVar.e();
            }
            if (iVarD == null) {
                iVarD = mVar.f21912c.d();
            }
            if (i0Var2 == i0.f21892w) {
                int i11 = lVar3.f21907d;
                int i12 = eVar.f21881i;
                if (i12 >= 64) {
                    throw new q("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                }
                eVar.f21881i = i12 + 1;
                iVarD.d(eVar, gVar);
                eVar.a((i11 << 3) | 4);
                eVar.f21881i--;
            } else {
                int iK = eVar.k();
                if (eVar.f21881i >= 64) {
                    throw new q("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                }
                int iD2 = eVar.d(iK);
                eVar.f21881i++;
                iVarD.d(eVar, gVar);
                eVar.a(0);
                eVar.f21881i--;
                eVar.c(iD2);
            }
            objC = iVarD.c();
        }
        if (z7) {
            hVar2.a(lVar3, mVar.b(objC));
            return true;
        }
        hVar2.i(lVar3, mVar.b(objC));
        return true;
    }

    public final void o(m mVar) {
        if (mVar.f21910a != a()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public k(j jVar) {
        jVar.f21897e.f();
        jVar.f21898i = false;
        this.f21906d = jVar.f21897e;
    }
}
