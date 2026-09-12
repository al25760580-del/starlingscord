package c4;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.internal.Intrinsics;
import v3.q;

/* JADX INFO: loaded from: classes.dex */
public final class i extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f3461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f3462g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, h4.b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = this.f3454b.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f3461f = (ConnectivityManager) systemService;
        this.f3462g = new h(0, this);
    }

    @Override // c4.f
    public final Object a() {
        return j.a(this.f3461f);
    }

    @Override // c4.f
    public final void c() {
        try {
            q.d().a(j.f3463a, "Registering network callback");
            f4.i.a(this.f3461f, this.f3462g);
        } catch (IllegalArgumentException e10) {
            q.d().c(j.f3463a, "Received exception while registering network callback", e10);
        } catch (SecurityException e11) {
            q.d().c(j.f3463a, "Received exception while registering network callback", e11);
        }
    }

    @Override // c4.f
    public final void d() {
        try {
            q.d().a(j.f3463a, "Unregistering network callback");
            f4.g.c(this.f3461f, this.f3462g);
        } catch (IllegalArgumentException e10) {
            q.d().c(j.f3463a, "Received exception while unregistering network callback", e10);
        } catch (SecurityException e11) {
            q.d().c(j.f3463a, "Received exception while unregistering network callback", e11);
        }
    }
}
