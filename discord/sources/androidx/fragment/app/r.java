package androidx.fragment.app;

import android.view.View;
import androidx.core.performance.play.services.PlayServicesDevicePerformance;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class r extends Lambda implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2242e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i7, Object obj) {
        super(1);
        this.f2241d = i7;
        this.f2242e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2241d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry, "entry");
                Collection collection = (Collection) this.f2242e;
                View view = (View) entry.getValue();
                WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
                return Boolean.valueOf(CollectionsKt.E(collection, androidx.core.view.l0.f(view)));
            case 1:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    dr.d0 d0Var = ((e2.z) this.f2242e).f7951f;
                    e2.e eVar = new e2.e(th2);
                    d0Var.getClass();
                    d0Var.i(null, eVar);
                }
                Object obj2 = e2.z.j;
                e2.z zVar = (e2.z) this.f2242e;
                synchronized (obj2) {
                    e2.z.f7945i.remove(zVar.b().getAbsolutePath());
                }
                return Unit.f14616a;
            case 2:
                Intrinsics.checkNotNullParameter((IOException) obj, "it");
                es.h hVar = (es.h) this.f2242e;
                byte[] bArr = ds.b.f7815a;
                hVar.G = true;
                return Unit.f14616a;
            case 3:
                ar.b0.w(kotlin.coroutines.g.f14681d, new h1.c((PlayServicesDevicePerformance) this.f2242e, (Integer) obj, null));
                return Unit.f14616a;
            case 4:
                z.d it = (z.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((v.d) this.f2242e).a(it);
                return Boolean.TRUE;
            case 5:
                return obj == ((s.r) this.f2242e) ? "(this)" : String.valueOf(obj);
            default:
                Throwable th3 = (Throwable) obj;
                v3.k kVar = (v3.k) this.f2242e;
                if (th3 == null) {
                    if (!kVar.f21410d.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th3 instanceof CancellationException) {
                    kVar.f21410d.cancel(true);
                } else {
                    g4.j jVar = kVar.f21410d;
                    Throwable cause = th3.getCause();
                    if (cause != null) {
                        th3 = cause;
                    }
                    jVar.k(th3);
                }
                return Unit.f14616a;
        }
    }
}
