package cr;

import ar.a2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends h {
    public final a H;

    public r(int i7, a aVar) {
        super(i7);
        this.H = aVar;
        if (aVar != a.f7342d) {
            if (i7 < 1) {
                throw new IllegalArgumentException(s0.g.d(i7, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.getOrCreateKotlinClass(h.class).getSimpleName() + " instead").toString());
        }
    }

    @Override // cr.h
    public final boolean A() {
        return this.H == a.f7343e;
    }

    public final Object M(Object obj, boolean z5) {
        o oVar;
        if (this.H == a.f7344i) {
            Object objO = super.o(obj);
            return (!(objO instanceof m) || (objO instanceof l)) ? objO : Unit.f14616a;
        }
        Object obj2 = j.f7368d;
        o oVar2 = (o) h.f7361x.get(this);
        while (true) {
            long andIncrement = h.f7357e.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zY = y(andIncrement, false);
            int i7 = j.f7366b;
            long j5 = i7;
            long j7 = j / j5;
            int i10 = (int) (j % j5);
            if (oVar2.f9398i != j7) {
                o oVarC = h.c(this, j7, oVar2);
                if (oVarC != null) {
                    oVar = oVarC;
                } else if (zY) {
                    return new l(v());
                }
            } else {
                oVar = oVar2;
            }
            int i11 = h.i(this, oVar, i10, obj, j, obj2, zY);
            oVar2 = oVar;
            if (i11 == 0) {
                oVar2.b();
                return Unit.f14616a;
            }
            if (i11 == 1) {
                return Unit.f14616a;
            }
            if (i11 == 2) {
                if (zY) {
                    oVar2.i();
                    return new l(v());
                }
                a2 a2Var = obj2 instanceof a2 ? (a2) obj2 : null;
                if (a2Var != null) {
                    a2Var.b(oVar2, i10 + i7);
                }
                n((oVar2.f9398i * j5) + ((long) i10));
                return Unit.f14616a;
            }
            if (i11 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (i11 == 4) {
                if (j < h.f7358i.get(this)) {
                    oVar2.b();
                }
                return new l(v());
            }
            if (i11 == 5) {
                oVar2.b();
            }
            obj = obj;
        }
    }

    @Override // cr.h, cr.w
    public final Object o(Object obj) {
        return M(obj, false);
    }

    @Override // cr.h, cr.w
    public final Object p(Object obj, Continuation continuation) throws Throwable {
        if (M(obj, true) instanceof l) {
            throw v();
        }
        return Unit.f14616a;
    }
}
