package v3;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f21379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f21380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f21381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f21382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f21383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ph.c f21384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f21387i;
    public final int j;

    public b(s builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f21379a = com.facebook.imagepipeline.nativecode.b.d(false);
        this.f21380b = com.facebook.imagepipeline.nativecode.b.d(true);
        this.f21381c = new s();
        b0 b0Var = new b0();
        Intrinsics.checkNotNullExpressionValue(b0Var, "getDefaultWorkerFactory()");
        this.f21382d = b0Var;
        this.f21383e = s.f21427a;
        this.f21384f = new ph.c(9);
        this.f21385g = 4;
        this.f21386h = Integer.MAX_VALUE;
        this.j = 20;
        this.f21387i = 8;
    }
}
