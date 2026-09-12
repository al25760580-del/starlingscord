package fp;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import so.o;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f9345g = {kk.b.p(h.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0)};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kq.i f9346f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(bp.d dVar, e4.i c8) {
        super(c8, dVar, o.f20379m);
        Intrinsics.checkNotNullParameter(c8, "c");
        kq.l lVar = (kq.l) ((hp.a) c8.f7980e).f10957a;
        lVar.getClass();
        this.f9346f = new kq.i(lVar, g.f9344d);
    }

    @Override // fp.c, wo.b
    public final Map b() {
        return (Map) io.sentry.config.a.H(this.f9346f, f9345g[0]);
    }
}
