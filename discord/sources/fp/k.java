package fp;

import ep.x;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import so.o;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f9352g = {kk.b.p(k.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0)};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kq.i f9353f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(bp.d annotation, e4.i c8) {
        super(c8, annotation, o.f20386t);
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(c8, "c");
        kq.o oVar = ((hp.a) c8.f7980e).f10957a;
        x xVar = new x(5, this);
        kq.l lVar = (kq.l) oVar;
        lVar.getClass();
        this.f9353f = new kq.i(lVar, xVar);
    }

    @Override // fp.c, wo.b
    public final Map b() {
        return (Map) io.sentry.config.a.H(this.f9353f, f9352g[0]);
    }
}
