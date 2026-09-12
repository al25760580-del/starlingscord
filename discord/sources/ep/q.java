package ep;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f8582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f8583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f8584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f8585d;

    static {
        zo.a aVar = zo.a.f24059d;
        p pVar = new p(aVar, 0);
        f8582a = pVar;
        zo.c cVar = zo.c.f24061d;
        p pVar2 = new p(cVar, 1);
        f8583b = pVar2;
        zo.b bVar = zo.b.f24060d;
        p pVar3 = new p(bVar, 2);
        f8584c = pVar3;
        HashMap map = new HashMap();
        f8585d = map;
        map.put(aVar, pVar);
        map.put(cVar, pVar2);
        map.put(bVar, pVar3);
    }

    public static /* synthetic */ void a(int i7) {
        String str = (i7 == 5 || i7 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 5 || i7 == 6) ? 2 : 3];
        switch (i7) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i7 == 5 || i7 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i7 == 2 || i7 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i7 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i7 != 5 && i7 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 5 && i7 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(fq.e eVar, vo.o oVar, vo.l lVar) {
        vo.o oVarT;
        if (lVar == null) {
            a(1);
            throw null;
        }
        if (oVar instanceof vo.d) {
            oVarT = xp.e.t((vo.d) oVar);
        } else {
            int i7 = xp.e.f22999a;
            oVarT = oVar;
        }
        if (c(oVarT, lVar)) {
            return true;
        }
        return vo.p.f21826c.a(eVar, oVar, lVar);
    }

    public static boolean c(vo.o oVar, vo.l lVar) {
        if (oVar == null) {
            a(2);
            throw null;
        }
        if (lVar == null) {
            a(3);
            throw null;
        }
        vo.e0 e0Var = (vo.e0) xp.e.i(oVar, vo.e0.class, false);
        vo.e0 e0Var2 = (vo.e0) xp.e.i(lVar, vo.e0.class, false);
        return (e0Var2 == null || e0Var == null || !((yo.b0) e0Var).f23420x.equals(((yo.b0) e0Var2).f23420x)) ? false : true;
    }
}
