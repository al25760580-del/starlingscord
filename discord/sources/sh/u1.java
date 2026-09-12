package sh;

import android.content.Context;
import androidx.appcompat.widget.b4;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f20202a;

    public vb.j a() {
        Context context = this.f20202a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        vb.j jVar = new vb.j();
        jVar.f21532d = xb.a.a(vb.m.f21541a);
        ph.c cVar = new ph.c(context);
        jVar.f21533e = cVar;
        jVar.f21534i = xb.a.a(new e4.e(24, cVar, new pf.b(12, cVar)));
        ph.c cVar2 = jVar.f21533e;
        jVar.f21535v = new ga.l(4, cVar2);
        Provider providerA = xb.a.a(new fj.c(6, cVar2));
        jVar.f21536w = providerA;
        Provider providerA2 = xb.a.a(new e4.e(4, jVar.f21535v, providerA));
        jVar.f21537x = providerA2;
        k8.a aVar = new k8.a();
        ph.c cVar3 = jVar.f21533e;
        e4.m mVar = new e4.m(cVar3, providerA2, aVar, 2);
        Provider provider = jVar.f21532d;
        Provider provider2 = jVar.f21534i;
        jVar.f21538y = xb.a.a(new n8.f(new e9.b(provider, provider2, mVar, providerA2, providerA2), new b4(cVar3, provider2, providerA2, mVar, provider, providerA2, providerA2), new e4.i(2, provider, providerA2, mVar, providerA2), 18));
        return jVar;
    }
}
