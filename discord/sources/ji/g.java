package ji;

import ar.b0;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import mi.q;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements mi.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f13899e = new g(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f13900i = new g(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final g f13901v = new g(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final g f13902w = new g(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13903d;

    public /* synthetic */ g(int i7) {
        this.f13903d = i7;
    }

    @Override // mi.e
    public final Object a(zl.e eVar) {
        switch (this.f13903d) {
            case 0:
                Object objD = eVar.d(new q(li.a.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(objD, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return b0.m((Executor) objD);
            case 1:
                Object objD2 = eVar.d(new q(li.c.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(objD2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return b0.m((Executor) objD2);
            case 2:
                Object objD3 = eVar.d(new q(li.b.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(objD3, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return b0.m((Executor) objD3);
            default:
                Object objD4 = eVar.d(new q(li.d.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(objD4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return b0.m((Executor) objD4);
        }
    }
}
