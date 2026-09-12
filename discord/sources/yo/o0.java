package yo;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.ArrayList;
import java.util.List;
import lq.e1;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends g {
    public final ArrayList I;
    public boolean J;

    /* JADX WARN: Illegal instructions before constructor call */
    public o0(vo.l lVar, wo.h hVar, boolean z5, e1 e1Var, up.e eVar, int i7, kq.o oVar) {
        vo.o0 o0Var = vo.o0.f21822i;
        if (lVar == null) {
            v0(19);
            throw null;
        }
        if (hVar == null) {
            v0(20);
            throw null;
        }
        if (e1Var == null) {
            v0(21);
            throw null;
        }
        if (eVar == null) {
            v0(22);
            throw null;
        }
        if (oVar == null) {
            v0(25);
            throw null;
        }
        super(oVar, lVar, hVar, eVar, e1Var, z5, i7, o0Var);
        this.I = new ArrayList(1);
        this.J = false;
    }

    public static o0 E0(vo.l lVar, wo.h hVar, boolean z5, e1 e1Var, up.e eVar, int i7, kq.o oVar) {
        if (lVar == null) {
            v0(6);
            throw null;
        }
        if (hVar == null) {
            v0(7);
            throw null;
        }
        if (e1Var == null) {
            v0(8);
            throw null;
        }
        if (eVar == null) {
            v0(9);
            throw null;
        }
        if (oVar != null) {
            return new o0(lVar, hVar, z5, e1Var, eVar, i7, oVar);
        }
        v0(11);
        throw null;
    }

    public static o0 F0(b bVar, e1 e1Var, up.e eVar, int i7, kq.o oVar) {
        if (oVar == null) {
            v0(4);
            throw null;
        }
        o0 o0VarE0 = E0(bVar, wo.g.f22379a, false, e1Var, eVar, i7, oVar);
        lq.d0 d0VarN = bq.e.e(bVar).n();
        if (o0VarE0.J) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + o0VarE0.G0());
        }
        if (!lq.c.j(d0VarN)) {
            o0VarE0.I.add(d0VarN);
        }
        if (!o0VarE0.J) {
            o0VarE0.J = true;
            return o0VarE0;
        }
        throw new IllegalStateException("Type parameter descriptor is already initialized: " + o0VarE0.G0());
    }

    public static /* synthetic */ void v0(int i7) {
        String str = (i7 == 5 || i7 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 5 || i7 == 28) ? 2 : 3];
        switch (i7) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = StackTraceHelper.NAME_KEY;
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i7 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i7 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i7) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 5 && i7 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // yo.g
    public final void C0(lq.z zVar) {
        if (zVar != null) {
            return;
        }
        v0(27);
        throw null;
    }

    @Override // yo.g
    public final List D0() {
        if (!this.J) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + G0());
        }
        ArrayList arrayList = this.I;
        if (arrayList != null) {
            return arrayList;
        }
        v0(28);
        throw null;
    }

    public final String G0() {
        return getName() + " declared in " + xp.e.g(g());
    }
}
