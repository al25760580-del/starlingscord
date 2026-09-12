package yo;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lq.y0;

/* JADX INFO: loaded from: classes3.dex */
public class k0 extends s {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(vo.l lVar, k0 k0Var, wo.h hVar, up.e eVar, vo.c cVar, vo.n0 n0Var) {
        super(eVar, cVar, lVar, k0Var, n0Var, hVar);
        if (lVar == null) {
            v0(0);
            throw null;
        }
        if (hVar == null) {
            v0(1);
            throw null;
        }
        if (eVar == null) {
            v0(2);
            throw null;
        }
        if (cVar == null) {
            v0(3);
            throw null;
        }
        if (n0Var != null) {
        } else {
            v0(4);
            throw null;
        }
    }

    public static k0 M0(b bVar, up.e eVar, vo.c cVar, vo.n0 n0Var) {
        if (bVar == null) {
            v0(5);
            throw null;
        }
        if (eVar == null) {
            v0(7);
            throw null;
        }
        if (n0Var != null) {
            return new k0(bVar, null, wo.g.f22379a, eVar, cVar, n0Var);
        }
        v0(9);
        throw null;
    }

    public static /* synthetic */ void v0(int i7) {
        String str = (i7 == 13 || i7 == 18 || i7 == 23 || i7 == 24 || i7 == 29 || i7 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 13 || i7 == 18 || i7 == 23 || i7 == 24 || i7 == 29 || i7 == 30) ? 2 : 3];
        switch (i7) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = StackTraceHelper.NAME_KEY;
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i7 == 13 || i7 == 18 || i7 == 23) {
            objArr[1] = "initialize";
        } else if (i7 == 24) {
            objArr[1] = "getOriginal";
        } else if (i7 == 29) {
            objArr[1] = "copy";
        } else if (i7 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i7) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 13 && i7 != 18 && i7 != 23 && i7 != 24 && i7 != 29 && i7 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // yo.s
    public s D0(up.e eVar, vo.c cVar, vo.l lVar, vo.u uVar, vo.n0 n0Var, wo.h hVar) {
        if (lVar == null) {
            v0(25);
            throw null;
        }
        if (cVar == null) {
            v0(26);
            throw null;
        }
        if (hVar == null) {
            v0(27);
            throw null;
        }
        k0 k0Var = (k0) uVar;
        if (eVar == null) {
            eVar = getName();
        }
        return new k0(lVar, k0Var, hVar, eVar, cVar, n0Var);
    }

    @Override // yo.s, yo.m, yo.l, vo.l
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public final k0 a() {
        k0 k0Var = (k0) super.a();
        if (k0Var != null) {
            return k0Var;
        }
        v0(24);
        throw null;
    }

    @Override // yo.s
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final k0 G0(t tVar, t tVar2, List list, List list2, List list3, lq.z zVar, vo.y yVar, ep.p pVar) {
        if (list == null) {
            v0(14);
            throw null;
        }
        if (list2 == null) {
            v0(15);
            throw null;
        }
        if (list3 == null) {
            v0(16);
            throw null;
        }
        if (pVar != null) {
            return P0(tVar, tVar2, list, list2, list3, zVar, yVar, pVar, null);
        }
        v0(17);
        throw null;
    }

    public k0 P0(t tVar, t tVar2, List list, List list2, List list3, lq.z zVar, vo.y yVar, ep.p pVar, Map map) {
        if (list == null) {
            v0(19);
            throw null;
        }
        if (list2 == null) {
            v0(20);
            throw null;
        }
        if (list3 == null) {
            v0(21);
            throw null;
        }
        if (pVar == null) {
            v0(22);
            throw null;
        }
        super.G0(tVar, tVar2, list, list2, list3, zVar, yVar, pVar);
        if (map != null && !map.isEmpty()) {
            this.a0 = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // yo.s, vo.u
    public vo.t m0() {
        return H0(y0.f15267b);
    }
}
