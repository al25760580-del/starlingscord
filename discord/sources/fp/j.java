package fp;

import ep.x;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import so.o;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f9350g = {kk.b.p(j.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0)};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kq.i f9351f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(bp.d annotation, e4.i c8) {
        super(c8, annotation, o.f20389w);
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(c8, "c");
        kq.o oVar = ((hp.a) c8.f7980e).f10957a;
        x xVar = new x(4, this);
        kq.l lVar = (kq.l) oVar;
        lVar.getClass();
        this.f9351f = new kq.i(lVar, xVar);
    }

    @Override // fp.c, wo.b
    public final Map b() {
        return (Map) io.sentry.config.a.H(this.f9351f, f9350g[0]);
    }
}
