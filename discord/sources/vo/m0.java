package vo;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yo.b f21818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f21819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kq.i f21820c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f21817e = {kk.b.p(m0.class, "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0)};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o0 f21816d = new o0(6);

    public m0(yo.b bVar, kq.o oVar, Function1 function1) {
        this.f21818a = bVar;
        this.f21819b = function1;
        ep.x xVar = new ep.x(22, this);
        kq.l lVar = (kq.l) oVar;
        lVar.getClass();
        this.f21820c = new kq.i(lVar, xVar);
    }

    public final eq.o a(mq.f kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        z moduleDescriptor = bq.e.j(this.f21818a);
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        return (eq.o) io.sentry.config.a.H(this.f21820c, f21817e[0]);
    }
}
