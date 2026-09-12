package yo;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Collections;
import java.util.List;
import lq.w0;
import lq.y0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final up.e f23416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kq.i f23417e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kq.i f23418i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final kq.i f23419v;

    public b(kq.o oVar, up.e eVar) {
        if (oVar == null) {
            K(0);
            throw null;
        }
        if (eVar == null) {
            K(1);
            throw null;
        }
        this.f23416d = eVar;
        kq.l lVar = (kq.l) oVar;
        this.f23417e = new kq.i(lVar, new a(this, 0));
        this.f23418i = new kq.i(lVar, new a(this, 1));
        this.f23419v = new kq.i(lVar, new a(this, 2));
    }

    public static /* synthetic */ void K(int i7) {
        String str = (i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5 || i7 == 6 || i7 == 9 || i7 == 12 || i7 == 14 || i7 == 16 || i7 == 17 || i7 == 19 || i7 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5 || i7 == 6 || i7 == 9 || i7 == 12 || i7 == 14 || i7 == 16 || i7 == 17 || i7 == 19 || i7 == 20) ? 2 : 3];
        switch (i7) {
            case 1:
                objArr[0] = StackTraceHelper.NAME_KEY;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i7 == 2) {
            objArr[1] = "getName";
        } else if (i7 == 3) {
            objArr[1] = "getOriginal";
        } else if (i7 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i7 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i7 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i7 == 9 || i7 == 12 || i7 == 14 || i7 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i7 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i7 == 19) {
            objArr[1] = "substitute";
        } else if (i7 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i7) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 2 && i7 != 3 && i7 != 4 && i7 != 5 && i7 != 6 && i7 != 9 && i7 != 12 && i7 != 14 && i7 != 16 && i7 != 17 && i7 != 19 && i7 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // yo.y, vo.f, vo.l
    public final vo.i a() {
        return this;
    }

    @Override // vo.p0
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public vo.f b(y0 y0Var) {
        if (y0Var != null) {
            return y0Var.f15268a.f() ? this : new x(this, y0Var);
        }
        K(18);
        throw null;
    }

    @Override // vo.l
    public final up.e getName() {
        up.e eVar = this.f23416d;
        if (eVar != null) {
            return eVar;
        }
        K(2);
        throw null;
    }

    @Override // vo.f
    public eq.o h0() {
        eq.o oVar = (eq.o) this.f23418i.invoke();
        if (oVar != null) {
            return oVar;
        }
        K(4);
        throw null;
    }

    @Override // yo.y
    public eq.o i(w0 w0Var, mq.f fVar) {
        if (!w0Var.f()) {
            return new eq.t(B(fVar), y0.e(w0Var));
        }
        eq.o oVarB = B(fVar);
        if (oVarB != null) {
            return oVarB;
        }
        K(12);
        throw null;
    }

    @Override // vo.l
    public final Object i0(vo.n nVar, Object obj) {
        return ((ph.c) nVar).n(this, (StringBuilder) obj);
    }

    @Override // vo.f, vo.i
    public final lq.d0 j() {
        lq.d0 d0Var = (lq.d0) this.f23417e.invoke();
        if (d0Var != null) {
            return d0Var;
        }
        K(20);
        throw null;
    }

    @Override // vo.f
    public eq.o n0() {
        bq.e.i(xp.e.d(this));
        eq.o oVarB = B(mq.f.f16018a);
        if (oVarB != null) {
            return oVarB;
        }
        K(17);
        throw null;
    }

    @Override // vo.f
    public List p0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        K(6);
        throw null;
    }

    @Override // vo.f
    public final t u0() {
        t tVar = (t) this.f23419v.invoke();
        if (tVar != null) {
            return tVar;
        }
        K(5);
        throw null;
    }

    @Override // vo.f
    public final eq.o x(w0 w0Var) {
        bq.e.i(xp.e.d(this));
        eq.o oVarI = i(w0Var, mq.f.f16018a);
        if (oVarI != null) {
            return oVarI;
        }
        K(16);
        throw null;
    }

    @Override // yo.y, vo.l
    public final vo.l a() {
        return this;
    }

    @Override // yo.y, vo.f, vo.l
    public final vo.f a() {
        return this;
    }
}
