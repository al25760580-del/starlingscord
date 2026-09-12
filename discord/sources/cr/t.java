package cr;

import ar.a1;
import ar.b0;
import ar.g1;
import ar.i1;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends ar.a implements ProducerScope, Channel {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h f7394v;

    public t(CoroutineContext coroutineContext, h hVar) {
        super(coroutineContext, true);
        this.f7394v = hVar;
    }

    @Override // ar.i1
    public final void A(CancellationException cancellationException) {
        this.f7394v.l(cancellationException, true);
        x(cancellationException);
    }

    @Override // cr.w
    public final void a(com.margelo.nitro.playagerangedeclaration.c cVar) {
        this.f7394v.a(cVar);
    }

    @Override // cr.w
    public final boolean b(Throwable th2) {
        return this.f7394v.l(th2, false);
    }

    @Override // ar.i1, kotlinx.coroutines.Job
    public final void f(CancellationException cancellationException) {
        Object obj = i1.f2928d.get(this);
        if (obj instanceof ar.r) {
            return;
        }
        if ((obj instanceof g1) && ((g1) obj).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new a1(D(), null, this);
        }
        A(cancellationException);
    }

    @Override // cr.v
    public final Object g(xn.c cVar) {
        h hVar = this.f7394v;
        hVar.getClass();
        Object objE = h.E(hVar, cVar);
        wn.a aVar = wn.a.f22354d;
        return objE;
    }

    @Override // cr.v
    public final com.google.firebase.messaging.r h() {
        return this.f7394v.h();
    }

    @Override // cr.v
    public final Object j() {
        return this.f7394v.j();
    }

    @Override // ar.a
    public final void l0(Throwable th2, boolean z5) {
        if (this.f7394v.l(th2, false) || z5) {
            return;
        }
        b0.q(th2, this.f2883i);
    }

    @Override // ar.a
    public final void m0(Object obj) {
        this.f7394v.b(null);
    }

    @Override // cr.w
    public final Object o(Object obj) {
        return this.f7394v.o(obj);
    }

    @Override // cr.w
    public final Object p(Object obj, Continuation continuation) {
        return this.f7394v.p(obj, continuation);
    }

    @Override // cr.w
    public final boolean r() {
        return this.f7394v.r();
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    public final t d() {
        return this;
    }
}
