package yo;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lq.e1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends m implements vo.r0 {
    public final int E;
    public final kq.i F;
    public final kq.i G;
    public final kq.l H;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e1 f23433x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f23434y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kq.o oVar, vo.l lVar, wo.h hVar, up.e eVar, e1 e1Var, boolean z5, int i7, vo.o0 o0Var) {
        super(lVar, hVar, eVar, vo.n0.C);
        if (oVar == null) {
            v0(0);
            throw null;
        }
        if (lVar == null) {
            v0(1);
            throw null;
        }
        if (hVar == null) {
            v0(2);
            throw null;
        }
        if (eVar == null) {
            v0(3);
            throw null;
        }
        if (e1Var == null) {
            v0(4);
            throw null;
        }
        if (o0Var == null) {
            v0(6);
            throw null;
        }
        this.f23433x = e1Var;
        this.f23434y = z5;
        this.E = i7;
        jq.p pVar = new jq.p(this, oVar, o0Var);
        kq.l lVar2 = (kq.l) oVar;
        this.F = new kq.i(lVar2, pVar);
        this.G = new kq.i(lVar2, new fp.b(this, eVar, 18));
        this.H = lVar2;
    }

    public static /* synthetic */ void v0(int i7) {
        String str;
        int i10;
        switch (i7) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i10 = 2;
                break;
            case 12:
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = StackTraceHelper.NAME_KEY;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i7) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i7) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public List B0(List list) {
        if (list == null) {
            v0(12);
            throw null;
        }
        if (list != null) {
            return list;
        }
        v0(13);
        throw null;
    }

    public abstract void C0(lq.z zVar);

    public abstract List D0();

    @Override // vo.r0
    public final kq.o T() {
        kq.l lVar = this.H;
        if (lVar != null) {
            return lVar;
        }
        v0(14);
        throw null;
    }

    @Override // vo.r0
    public final boolean X() {
        return false;
    }

    @Override // yo.m, yo.l, vo.l
    public final vo.i a() {
        return this;
    }

    @Override // vo.r0
    public final int getIndex() {
        return this.E;
    }

    @Override // vo.r0
    public final List getUpperBounds() {
        List listH = ((f) n()).h();
        if (listH != null) {
            return listH;
        }
        v0(8);
        throw null;
    }

    @Override // vo.r0
    public final e1 getVariance() {
        e1 e1Var = this.f23433x;
        if (e1Var != null) {
            return e1Var;
        }
        v0(7);
        throw null;
    }

    @Override // vo.l
    public final Object i0(vo.n nVar, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        Intrinsics.checkNotNullParameter(this, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        ((wp.h) ((ph.c) nVar).f18031d).a0(this, builder, true);
        return Unit.f14616a;
    }

    @Override // vo.i
    public final lq.d0 j() {
        lq.d0 d0Var = (lq.d0) this.G.invoke();
        if (d0Var != null) {
            return d0Var;
        }
        v0(10);
        throw null;
    }

    @Override // vo.i
    public final lq.q0 n() {
        lq.q0 q0Var = (lq.q0) this.F.invoke();
        if (q0Var != null) {
            return q0Var;
        }
        v0(9);
        throw null;
    }

    @Override // vo.r0
    public final boolean u() {
        return this.f23434y;
    }

    @Override // yo.m, yo.l, vo.l
    public final vo.l a() {
        return this;
    }

    @Override // yo.m, yo.l, vo.l
    public final vo.r0 a() {
        return this;
    }

    @Override // yo.m
    /* JADX INFO: renamed from: A0 */
    public final vo.m a() {
        return this;
    }
}
