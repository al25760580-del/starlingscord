package gp;

import com.facebook.react.devsupport.StackTraceHelper;
import ep.a0;
import ep.p;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lq.b1;
import lq.z;
import mp.u;
import mq.m;
import so.i;
import so.t;
import vo.l;
import vo.l0;
import vo.n0;
import vo.y;
import wo.h;
import yo.h0;
import yo.i0;
import yo.j0;
import yo.q0;

/* JADX INFO: loaded from: classes3.dex */
public class f extends h0 implements a {
    public final boolean Y;
    public final Pair Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l lVar, h hVar, y yVar, p pVar, boolean z5, up.e eVar, n0 n0Var, l0 l0Var, vo.c cVar, boolean z6, Pair pair) {
        super(lVar, l0Var, hVar, yVar, pVar, z5, eVar, cVar, n0Var, false, false, false, false, false);
        if (lVar == null) {
            v0(0);
            throw null;
        }
        if (hVar == null) {
            v0(1);
            throw null;
        }
        if (yVar == null) {
            v0(2);
            throw null;
        }
        if (pVar == null) {
            v0(3);
            throw null;
        }
        if (eVar == null) {
            v0(4);
            throw null;
        }
        if (n0Var == null) {
            v0(5);
            throw null;
        }
        if (cVar == null) {
            v0(6);
            throw null;
        }
        this.Y = z6;
        this.Z = pair;
    }

    public static f J0(l lVar, hp.c cVar, p pVar, boolean z5, up.e eVar, ap.f fVar, boolean z6) {
        y yVar = y.f21852e;
        if (lVar == null) {
            v0(7);
            throw null;
        }
        if (eVar != null) {
            return new f(lVar, cVar, yVar, pVar, z5, eVar, fVar, null, vo.c.f21792d, z6, null);
        }
        v0(11);
        throw null;
    }

    public static /* synthetic */ void v0(int i7) {
        String str = i7 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i7 != 21 ? 3 : 2];
        switch (i7) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = StackTraceHelper.NAME_KEY;
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i7 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i7) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // gp.a
    public final a D(z zVar, ArrayList arrayList, z zVar2, Pair pair) {
        i0 i0Var;
        j0 j0Var;
        if (zVar2 == null) {
            v0(20);
            throw null;
        }
        l0 l0VarA = a() == this ? null : a();
        f fVar = new f(g(), getAnnotations(), e(), getVisibility(), this.f23445y, getName(), d(), l0VarA, c(), this.Y, pair);
        i0 i0Var2 = this.U;
        if (i0Var2 != null) {
            i0 i0Var3 = new i0(fVar, i0Var2.getAnnotations(), i0Var2.e(), i0Var2.getVisibility(), i0Var2.f23431x, i0Var2.f23432y, i0Var2.G, c(), l0VarA == null ? null : l0VarA.getGetter(), i0Var2.d());
            i0Var3.J = i0Var2.J;
            i0Var3.K = zVar2;
            i0Var = i0Var3;
        } else {
            i0Var = null;
        }
        j0 j0Var2 = this.V;
        if (j0Var2 != null) {
            j0 j0Var3 = j0Var2;
            j0Var = new j0(fVar, j0Var2.getAnnotations(), j0Var3.e(), j0Var3.getVisibility(), j0Var3.f23431x, j0Var3.f23432y, j0Var3.G, c(), l0VarA == null ? null : l0VarA.getSetter(), j0Var2.d());
            j0Var.J = j0Var.J;
            q0 q0Var = (q0) j0Var2.L().get(0);
            if (q0Var == null) {
                j0.v0(6);
                throw null;
            }
            j0Var.K = q0Var;
        } else {
            j0Var = null;
        }
        fVar.F0(i0Var, j0Var, this.W, this.X);
        Function0 function0 = this.F;
        if (function0 != null) {
            fVar.G0(this.E, function0);
        }
        fVar.g0(h());
        fVar.I0(zVar2, getTypeParameters(), this.R, zVar != null ? mf.f.n(this, zVar, wo.g.f22379a) : null, kotlin.collections.n0.f14659d);
        return fVar;
    }

    @Override // yo.h0
    public final h0 D0(l lVar, y yVar, p pVar, l0 l0Var, vo.c cVar, up.e eVar) {
        if (lVar == null) {
            v0(13);
            throw null;
        }
        if (yVar == null) {
            v0(14);
            throw null;
        }
        if (pVar == null) {
            v0(15);
            throw null;
        }
        if (cVar == null) {
            v0(16);
            throw null;
        }
        if (eVar == null) {
            v0(17);
            throw null;
        }
        return new f(lVar, getAnnotations(), yVar, pVar, this.f23445y, eVar, n0.C, l0Var, cVar, this.Y, this.Z);
    }

    @Override // yo.h0, vo.b
    public final Object R(vo.a aVar) {
        Pair pair = this.Z;
        if (pair == null || !((vo.a) pair.f14612d).equals(aVar)) {
            return null;
        }
        return pair.f14613e;
    }

    @Override // yo.h0, vo.u0
    public final boolean isConst() {
        z type = getType();
        if (!this.Y) {
            return false;
        }
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (((!i.G(type) && !t.a(type)) || b1.e(type)) && !i.H(type)) {
            return false;
        }
        wo.i iVar = u.f16012a;
        Intrinsics.checkNotNullParameter(type, "<this>");
        Intrinsics.checkNotNullParameter(m.f16035d, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        up.c ENHANCED_NULLABILITY_ANNOTATION = a0.f8501p;
        Intrinsics.checkNotNullExpressionValue(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return !e4.f.J(type, ENHANCED_NULLABILITY_ANNOTATION) || i.H(type);
    }

    @Override // yo.r0, vo.b
    public final boolean v() {
        return false;
    }

    @Override // yo.h0
    public final void H0(z zVar) {
    }
}
