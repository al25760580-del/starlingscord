package vo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ep.p f21824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ep.p f21825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ep.p f21826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ep.p f21827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ep.p f21828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ep.p f21829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ep.p f21830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ep.p f21831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ep.p f21832i;
    public static final ep.p j;
    public static final o0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final o0 f21833l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final o0 f21834m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final sq.n f21835n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final HashMap f21836o;

    static {
        z0 z0Var = z0.f21858d;
        ep.p pVar = new ep.p(z0Var, 3);
        f21824a = pVar;
        a1 a1Var = a1.f21788d;
        ep.p pVar2 = new ep.p(a1Var, 4);
        f21825b = pVar2;
        b1 b1Var = b1.f21791d;
        ep.p pVar3 = new ep.p(b1Var, 5);
        f21826c = pVar3;
        w0 w0Var = w0.f21849d;
        ep.p pVar4 = new ep.p(w0Var, 6);
        f21827d = pVar4;
        c1 c1Var = c1.f21799d;
        ep.p pVar5 = new ep.p(c1Var, 7);
        f21828e = pVar5;
        y0 y0Var = y0.f21857d;
        ep.p pVar6 = new ep.p(y0Var, 8);
        f21829f = pVar6;
        v0 v0Var = v0.f21847d;
        ep.p pVar7 = new ep.p(v0Var, 9);
        f21830g = pVar7;
        x0 x0Var = x0.f21850d;
        ep.p pVar8 = new ep.p(x0Var, 10);
        f21831h = pVar8;
        d1 d1Var = d1.f21801d;
        ep.p pVar9 = new ep.p(d1Var, 11);
        f21832i = pVar9;
        ep.p[] elements = {pVar, pVar2, pVar4, pVar6};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collections.unmodifiableSet(kotlin.collections.y.J(elements));
        HashMap map = new HashMap(6);
        map.put(pVar2, 0);
        map.put(pVar, 0);
        map.put(pVar4, 1);
        map.put(pVar3, 1);
        map.put(pVar5, 2);
        Collections.unmodifiableMap(map);
        j = pVar5;
        k = new o0(2);
        f21833l = new o0(3);
        f21834m = new o0(4);
        try {
            Iterator it = Arrays.asList(new sq.n[0]).iterator();
            f21835n = it.hasNext() ? (sq.n) it.next() : sq.n.f20523a;
            HashMap map2 = new HashMap();
            f21836o = map2;
            map2.put(z0Var, pVar);
            map2.put(a1Var, pVar2);
            map2.put(b1Var, pVar3);
            map2.put(w0Var, pVar4);
            map2.put(c1Var, pVar5);
            map2.put(y0Var, pVar6);
            map2.put(v0Var, pVar7);
            map2.put(x0Var, pVar8);
            map2.put(d1Var, pVar9);
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    public static /* synthetic */ void a(int i7) {
        String str = i7 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i7 != 16 ? 3 : 2];
        if (i7 != 1 && i7 != 3 && i7 != 5 && i7 != 7) {
            switch (i7) {
                case 9:
                    objArr[0] = "from";
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i7 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i7) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 == 16) {
            throw new IllegalStateException(str2);
        }
    }

    public static Integer b(ep.p visibility, ep.p visibility2) {
        if (visibility == null) {
            a(12);
            throw null;
        }
        or.y0 y0Var = visibility.f8580a;
        if (visibility2 == null) {
            a(13);
            throw null;
        }
        or.y0 y0Var2 = visibility2.f8580a;
        Intrinsics.checkNotNullParameter(visibility2, "visibility");
        Integer numC = y0Var.c(y0Var2);
        if (numC != null) {
            return numC;
        }
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Integer numC2 = y0Var2.c(y0Var);
        if (numC2 != null) {
            return Integer.valueOf(-numC2.intValue());
        }
        return null;
    }

    public static o c(fq.e eVar, o oVar, l lVar) {
        o oVarC;
        if (oVar == null) {
            a(8);
            throw null;
        }
        if (lVar == null) {
            a(9);
            throw null;
        }
        for (o oVar2 = (o) oVar.a(); oVar2 != null && oVar2.getVisibility() != f21829f; oVar2 = (o) xp.e.i(oVar2, o.class, true)) {
            if (!oVar2.getVisibility().a(eVar, oVar2, lVar)) {
                return oVar2;
            }
        }
        if (!(oVar instanceof yo.m0) || (oVarC = c(eVar, ((yo.n0) ((yo.m0) oVar)).f23462d0, lVar)) == null) {
            return null;
        }
        return oVarC;
    }

    public static boolean d(o oVar, l lVar) {
        if (lVar == null) {
            a(7);
            throw null;
        }
        o0 o0VarF = xp.e.f(lVar);
        if (o0VarF != o0.f21821e) {
            return o0VarF.equals(xp.e.f(oVar));
        }
        return false;
    }

    public static boolean e(ep.p pVar) {
        if (pVar != null) {
            return pVar == f21824a || pVar == f21825b;
        }
        a(14);
        throw null;
    }

    public static ep.p f(or.y0 y0Var) {
        if (y0Var == null) {
            a(15);
            throw null;
        }
        ep.p pVar = (ep.p) f21836o.get(y0Var);
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + y0Var);
    }
}
