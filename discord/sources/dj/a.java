package dj;

import ar.b0;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import li.b;
import li.c;
import li.d;
import mi.e;
import mi.q;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f7645e = new a(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f7646i = new a(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f7647v = new a(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f7648w = new a(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7649d;

    public /* synthetic */ a(int i7) {
        this.f7649d = i7;
    }

    @Override // mi.e
    public final Object a(zl.e eVar) {
        switch (this.f7649d) {
            case 0:
                Object objD = eVar.d(new q(li.a.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(objD, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return b0.m((Executor) objD);
            case 1:
                Object objD2 = eVar.d(new q(c.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(objD2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return b0.m((Executor) objD2);
            case 2:
                Object objD3 = eVar.d(new q(b.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(objD3, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return b0.m((Executor) objD3);
            default:
                Object objD4 = eVar.d(new q(d.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(objD4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return b0.m((Executor) objD4);
        }
    }
}
