package lq;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kq.d f15213b;

    public i(kq.o storageManager) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        ep.x xVar = new ep.x(11, this);
        g gVar = new g(this, 0);
        kq.l lVar = (kq.l) storageManager;
        lVar.getClass();
        this.f15213b = new kq.d(lVar, xVar, gVar);
    }

    public abstract Collection b();

    public abstract z c();

    public Collection d(boolean z5) {
        return kotlin.collections.n0.f14659d;
    }

    public abstract vo.o0 e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof q0) && obj.hashCode() == hashCode()) {
            q0 q0Var = (q0) obj;
            if (q0Var.getParameters().size() == getParameters().size()) {
                vo.i iVarG = g();
                vo.i iVarG2 = q0Var.g();
                if (iVarG2 == null || nq.l.f(iVarG) || xp.e.o(iVarG) || nq.l.f(iVarG2) || xp.e.o(iVarG2)) {
                    return false;
                }
                return k(iVarG2);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f15212a;
        if (i7 != 0) {
            return i7;
        }
        vo.i iVarG = g();
        int iIdentityHashCode = (nq.l.f(iVarG) || xp.e.o(iVarG)) ? System.identityHashCode(this) : xp.e.g(iVarG).f21265a.hashCode();
        this.f15212a = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // lq.q0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final List h() {
        return ((h) this.f15213b.invoke()).f15210b;
    }

    public abstract boolean k(vo.i iVar);

    public List l(List supertypes) {
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
        return supertypes;
    }

    public void m(z type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }
}
