package jq;

import ar.a0;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Type;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lq.z;
import po.a2;
import po.b0;
import vo.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f14042e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f14043i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f14044v;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, int i7) {
        this.f14041d = i7;
        this.f14042e = obj;
        this.f14043i = obj2;
        this.f14044v = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f14041d) {
            case 0:
                return ((vp.b) ((vp.v) this.f14042e)).b((ByteArrayInputStream) this.f14043i, ((hq.j) ((r) this.f14044v).f14055b.f3122e).f11032p);
            case 1:
                z zVar = (z) this.f14042e;
                po.x xVar = (po.x) this.f14043i;
                b0 b0Var = (b0) this.f14044v;
                vo.i iVarG = zVar.r0().g();
                if (!(iVarG instanceof vo.f)) {
                    throw new a0("Supertype not a class: " + iVarG);
                }
                Class clsK = a2.k((vo.f) iVarG);
                if (clsK == null) {
                    throw new a0("Unsupported superclass of " + xVar + ": " + iVarG);
                }
                Class cls = b0Var.f18067e;
                if (Intrinsics.areEqual(cls.getSuperclass(), clsK)) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    Intrinsics.checkNotNull(genericSuperclass);
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
                int iW = y.w(clsK, interfaces);
                if (iW >= 0) {
                    Type type = cls.getGenericInterfaces()[iW];
                    Intrinsics.checkNotNull(type);
                    return type;
                }
                throw new a0("No superclass of " + xVar + " in Java reflection for " + iVarG);
            default:
                return new yo.f((yo.g) this.f14044v, (kq.o) this.f14042e, (o0) this.f14043i);
        }
    }

    public p(yo.g gVar, kq.o oVar, o0 o0Var) {
        this.f14041d = 2;
        this.f14044v = gVar;
        this.f14042e = oVar;
        this.f14043i = o0Var;
    }
}
