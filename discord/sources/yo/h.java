package yo;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import lq.y0;

/* JADX INFO: loaded from: classes3.dex */
public class h extends s implements vo.k {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final boolean f23444b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(vo.f fVar, vo.k kVar, wo.h hVar, boolean z5, vo.c cVar, vo.n0 n0Var) {
        super(up.g.f21277e, cVar, fVar, kVar, n0Var, hVar);
        if (fVar == null) {
            v0(0);
            throw null;
        }
        if (hVar == null) {
            v0(1);
            throw null;
        }
        if (cVar == null) {
            v0(2);
            throw null;
        }
        if (n0Var == null) {
            v0(3);
            throw null;
        }
        this.f23444b0 = z5;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    public static /* synthetic */ void v0(int i7) {
        String str;
        int i10;
        if (i7 != 21 && i7 != 27) {
            switch (i7) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i7 != 21 && i7 != 27) {
            switch (i7) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    i10 = 2;
                    break;
                default:
                    i10 = 3;
                    break;
            }
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i7 == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i7 != 27) {
            switch (i7) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i7) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 21 && i7 != 27) {
            switch (i7) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // yo.s
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public h D0(up.e eVar, vo.c cVar, vo.l lVar, vo.u uVar, vo.n0 n0Var, wo.h hVar) {
        if (lVar == null) {
            v0(23);
            throw null;
        }
        if (cVar == null) {
            v0(24);
            throw null;
        }
        if (hVar == null) {
            v0(25);
            throw null;
        }
        vo.c cVar2 = vo.c.f21792d;
        if (cVar == cVar2 || cVar == vo.c.f21795v) {
            return new h((vo.f) lVar, this, hVar, this.f23444b0, cVar2, n0Var);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + lVar + "\nkind: " + cVar);
    }

    @Override // yo.m, vo.l
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public final vo.f g() {
        vo.f fVar = (vo.f) super.g();
        if (fVar != null) {
            return fVar;
        }
        v0(17);
        throw null;
    }

    @Override // yo.s, yo.m, yo.l, vo.l
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final h a() {
        h hVar = (h) super.a();
        if (hVar != null) {
            return hVar;
        }
        v0(19);
        throw null;
    }

    public final void P0(List list, ep.p pVar) {
        if (list == null) {
            v0(13);
            throw null;
        }
        if (pVar != null) {
            Q0(list, pVar, g().l());
        } else {
            v0(14);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    public final void Q0(List list, ep.p pVar, List list2) {
        t tVarU0;
        List listP0;
        if (list == null) {
            v0(10);
            throw null;
        }
        if (pVar == null) {
            v0(11);
            throw null;
        }
        if (list2 == null) {
            v0(12);
            throw null;
        }
        vo.f fVarG = g();
        if (fVarG.z()) {
            vo.l lVarG = fVarG.g();
            if (lVarG instanceof vo.f) {
                tVarU0 = ((vo.f) lVarG).u0();
            } else {
                tVarU0 = null;
            }
        } else {
            tVarU0 = null;
        }
        vo.f fVarG2 = g();
        if (fVarG2.p0().isEmpty()) {
            listP0 = Collections.EMPTY_LIST;
            if (listP0 == null) {
                v0(16);
                throw null;
            }
        } else {
            listP0 = fVarG2.p0();
            if (listP0 == null) {
                v0(15);
                throw null;
            }
        }
        G0(null, tVarU0, listP0, list2, list, null, vo.y.f21852e, pVar);
    }

    @Override // yo.s, vo.u, vo.p0
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public final h b(y0 y0Var) {
        if (y0Var != null) {
            return (h) super.b(y0Var);
        }
        v0(20);
        throw null;
    }

    @Override // yo.s, vo.d
    public final vo.d d0(vo.f fVar, vo.y yVar, ep.p pVar) {
        return (h) B0(fVar, yVar, pVar);
    }

    @Override // yo.s, vo.d
    public final void g0(Collection collection) {
        if (collection != null) {
            return;
        }
        v0(22);
        throw null;
    }

    @Override // yo.s, vo.d, vo.b
    public final Collection h() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        v0(21);
        throw null;
    }

    @Override // yo.s, vo.l
    public final Object i0(vo.n nVar, Object obj) {
        return nVar.j(this, obj);
    }

    @Override // vo.k
    public final boolean q() {
        return this.f23444b0;
    }

    @Override // vo.k
    public final vo.f r() {
        vo.f fVarG = g();
        if (fVarG != null) {
            return fVarG;
        }
        v0(18);
        throw null;
    }
}
