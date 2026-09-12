package yo;

import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import lq.w0;
import lq.y0;

/* JADX INFO: loaded from: classes3.dex */
public class h0 extends r0 implements vo.l0 {
    public kq.h E;
    public Function0 F;
    public final vo.y G;
    public ep.p H;
    public Collection I;
    public final vo.l0 J;
    public final vo.c K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public List Q;
    public t R;
    public t S;
    public ArrayList T;
    public i0 U;
    public j0 V;
    public q W;
    public q X;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f23445y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(vo.l lVar, vo.l0 l0Var, wo.h hVar, vo.y yVar, ep.p pVar, boolean z5, up.e eVar, vo.c cVar, vo.n0 n0Var, boolean z6, boolean z7, boolean z10, boolean z11, boolean z12) {
        super(lVar, hVar, eVar, null, n0Var);
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
        if (cVar == null) {
            v0(5);
            throw null;
        }
        if (n0Var == null) {
            v0(6);
            throw null;
        }
        this.f23445y = z5;
        this.I = null;
        this.Q = Collections.EMPTY_LIST;
        this.G = yVar;
        this.H = pVar;
        this.J = l0Var == null ? this : l0Var;
        this.K = cVar;
        this.L = z6;
        this.M = z7;
        this.N = z10;
        this.O = z11;
        this.P = z12;
    }

    public static h0 C0(vo.l lVar, vo.y yVar, ep.p pVar, boolean z5, up.e eVar, vo.c cVar, vo.n0 n0Var) {
        if (lVar == null) {
            v0(7);
            throw null;
        }
        if (pVar == null) {
            v0(10);
            throw null;
        }
        if (eVar == null) {
            v0(11);
            throw null;
        }
        if (n0Var != null) {
            return new h0(lVar, null, wo.g.f22379a, yVar, pVar, z5, eVar, cVar, n0Var, false, false, false, false, false);
        }
        v0(13);
        throw null;
    }

    public static vo.u E0(y0 y0Var, vo.k0 k0Var) {
        if (k0Var == null) {
            v0(31);
            throw null;
        }
        vo.u uVar = ((f0) k0Var).J;
        if (uVar != null) {
            return uVar.b(y0Var);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    public static /* synthetic */ void v0(int i7) {
        String str;
        int i10;
        if (i7 != 28 && i7 != 38 && i7 != 39 && i7 != 41 && i7 != 42) {
            switch (i7) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i7 != 28 && i7 != 38 && i7 != 39 && i7 != 41 && i7 != 42) {
            switch (i7) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
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
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = StackTraceHelper.NAME_KEY;
                break;
            case 5:
            case 12:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                objArr[0] = "source";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i7 == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i7 == 38) {
            objArr[1] = "getOriginal";
        } else if (i7 == 39) {
            objArr[1] = "getKind";
        } else if (i7 == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i7 != 42) {
            switch (i7) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i7) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 28 && i7 != 38 && i7 != 39 && i7 != 41 && i7 != 42) {
            switch (i7) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // vo.l0
    public final boolean A() {
        return this.P;
    }

    @Override // vo.d
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public final h0 d0(vo.l lVar, vo.y yVar, ep.p pVar) {
        g0 g0Var = new g0(this);
        if (lVar == null) {
            g0.a(0);
            throw null;
        }
        g0Var.f23435a = lVar;
        g0Var.f23438d = null;
        g0Var.f23436b = yVar;
        if (pVar == null) {
            g0.a(8);
            throw null;
        }
        g0Var.f23437c = pVar;
        g0Var.f23439e = vo.c.f21793e;
        g0Var.f23441g = false;
        h0 h0VarB = g0Var.b();
        if (h0VarB != null) {
            return h0VarB;
        }
        v0(42);
        throw null;
    }

    public h0 D0(vo.l lVar, vo.y yVar, ep.p pVar, vo.l0 l0Var, vo.c cVar, up.e eVar) {
        if (lVar == null) {
            v0(32);
            throw null;
        }
        if (yVar == null) {
            v0(33);
            throw null;
        }
        if (pVar == null) {
            v0(34);
            throw null;
        }
        if (cVar == null) {
            v0(35);
            throw null;
        }
        if (eVar == null) {
            v0(36);
            throw null;
        }
        return new h0(lVar, l0Var, getAnnotations(), yVar, pVar, this.f23445y, eVar, cVar, vo.n0.C, this.L, isConst(), this.N, isExternal(), this.P);
    }

    public final void F0(i0 i0Var, j0 j0Var, q qVar, q qVar2) {
        this.U = i0Var;
        this.V = j0Var;
        this.W = qVar;
        this.X = qVar2;
    }

    public final void G0(kq.h hVar, Function0 function0) {
        if (function0 == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"));
        }
        this.F = function0;
        if (hVar == null) {
            hVar = (kq.h) function0.invoke();
        }
        this.E = hVar;
    }

    @Override // vo.u0
    public final zp.g I() {
        kq.h hVar = this.E;
        if (hVar != null) {
            return (zp.g) hVar.invoke();
        }
        return null;
    }

    public final void I0(lq.z zVar, List list, t tVar, t tVar2, List list2) {
        if (zVar == null) {
            v0(17);
            throw null;
        }
        if (list == null) {
            v0(18);
            throw null;
        }
        if (list2 == null) {
            v0(19);
            throw null;
        }
        this.f23476x = zVar;
        this.T = new ArrayList(list);
        this.S = tVar2;
        this.R = tVar;
        this.Q = list2;
    }

    public Object R(vo.a aVar) {
        throw null;
    }

    @Override // yo.r0, vo.b
    public final t S() {
        return this.R;
    }

    @Override // vo.u0
    public final boolean U() {
        return this.f23445y;
    }

    @Override // yo.r0, vo.b
    public final t V() {
        return this.S;
    }

    @Override // vo.l0
    public final q W() {
        return this.X;
    }

    @Override // vo.l0
    public final q Y() {
        return this.W;
    }

    @Override // vo.b
    public final List Z() {
        List list = this.Q;
        if (list != null) {
            return list;
        }
        v0(22);
        throw null;
    }

    @Override // vo.u0
    public final boolean a0() {
        return this.L;
    }

    @Override // vo.d
    public final vo.c c() {
        vo.c cVar = this.K;
        if (cVar != null) {
            return cVar;
        }
        v0(39);
        throw null;
    }

    @Override // vo.x
    public final vo.y e() {
        vo.y yVar = this.G;
        if (yVar != null) {
            return yVar;
        }
        v0(24);
        throw null;
    }

    @Override // vo.d
    public final void g0(Collection collection) {
        if (collection != null) {
            this.I = collection;
        } else {
            v0(40);
            throw null;
        }
    }

    @Override // vo.l0
    public final i0 getGetter() {
        return this.U;
    }

    @Override // yo.r0, vo.b
    public final lq.z getReturnType() {
        lq.z type = getType();
        if (type != null) {
            return type;
        }
        v0(23);
        throw null;
    }

    @Override // vo.l0
    public final j0 getSetter() {
        return this.V;
    }

    @Override // yo.r0, vo.b
    public final List getTypeParameters() {
        ArrayList arrayList = this.T;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // vo.o
    public final ep.p getVisibility() {
        ep.p pVar = this.H;
        if (pVar != null) {
            return pVar;
        }
        v0(25);
        throw null;
    }

    @Override // vo.b
    public final Collection h() {
        Collection collection = this.I;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        v0(41);
        throw null;
    }

    @Override // vo.l
    public final Object i0(vo.n nVar, Object obj) {
        return nVar.f(this, obj);
    }

    public boolean isConst() {
        return this.M;
    }

    public boolean isExternal() {
        return this.O;
    }

    @Override // vo.l0
    public final ArrayList m() {
        ArrayList arrayList = new ArrayList(2);
        i0 i0Var = this.U;
        if (i0Var != null) {
            arrayList.add(i0Var);
        }
        j0 j0Var = this.V;
        if (j0Var != null) {
            arrayList.add(j0Var);
        }
        return arrayList;
    }

    @Override // vo.x
    public final boolean o0() {
        return false;
    }

    @Override // vo.x
    public final boolean y() {
        return this.N;
    }

    @Override // vo.p0
    public final vo.l0 b(y0 y0Var) {
        if (y0Var == null) {
            v0(27);
            throw null;
        }
        if (y0Var.f15268a.f()) {
            return this;
        }
        g0 g0Var = new g0(this);
        w0 w0VarG = y0Var.g();
        if (w0VarG == null) {
            g0.a(15);
            throw null;
        }
        g0Var.f23440f = w0VarG;
        g0Var.f23438d = a();
        return g0Var.b();
    }

    @Override // yo.m, yo.l, vo.l
    public final vo.l0 a() {
        vo.l0 l0Var = this.J;
        vo.l0 l0VarA = l0Var == this ? this : l0Var.a();
        if (l0VarA != null) {
            return l0VarA;
        }
        v0(38);
        throw null;
    }

    public void H0(lq.z zVar) {
    }
}
