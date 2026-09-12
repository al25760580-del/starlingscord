package fp;

import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kq.o;
import lq.d0;
import lq.z;
import vo.n0;
import vo.o0;

/* JADX INFO: loaded from: classes3.dex */
public class c implements gp.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f9332e = {kk.b.p(c.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up.c f9333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f9334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kq.i f9335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lp.a f9336d;

    public c(e4.i c8, bp.d dVar, up.c fqName) {
        n0 n0VarC;
        Intrinsics.checkNotNullParameter(c8, "c");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f9333a = fqName;
        if (dVar != null) {
            n0VarC = ((hp.a) c8.f7980e).j.c(dVar);
        } else {
            o0 NO_SOURCE = n0.C;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            n0VarC = NO_SOURCE;
        }
        this.f9334b = n0VarC;
        o oVar = ((hp.a) c8.f7980e).f10957a;
        b bVar = new b(0, c8, this);
        kq.l lVar = (kq.l) oVar;
        lVar.getClass();
        this.f9335c = new kq.i(lVar, bVar);
        this.f9336d = dVar != null ? (lp.a) CollectionsKt.L(dVar.b()) : null;
    }

    @Override // wo.b
    public final up.c a() {
        return this.f9333a;
    }

    @Override // wo.b
    public Map b() {
        return w0.d();
    }

    @Override // wo.b
    public final n0 d() {
        return this.f9334b;
    }

    @Override // wo.b
    public final z getType() {
        return (d0) io.sentry.config.a.H(this.f9335c, f9332e[0]);
    }
}
