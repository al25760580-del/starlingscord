package jr;

import ar.a2;
import ar.g0;
import ar.j;
import ar.k;
import co.s;
import fr.u;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements CancellableContinuation, a2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f14069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f14070e;

    public a(b bVar, k kVar) {
        this.f14070e = bVar;
        this.f14069d = kVar;
    }

    @Override // ar.a2
    public final void b(u uVar, int i7) {
        this.f14069d.b(uVar, i7);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final boolean c() {
        return this.f14069d.c();
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final a5.h e(Object obj, Function3 function3) {
        b bVar = this.f14070e;
        j jVar = new j(bVar, this);
        a5.h hVarE = this.f14069d.E((Unit) obj, jVar);
        if (hVarE != null) {
            b.f14071g.set(bVar, null);
        }
        return hVarE;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f14069d.f2937w;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void k(Object obj, Function3 function3) throws g0 {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f14071g;
        b bVar = this.f14070e;
        atomicReferenceFieldUpdater.set(bVar, null);
        s sVar = new s(bVar, this);
        k kVar = this.f14069d;
        kVar.B((Unit) obj, kVar.f2927i, new j(0, sVar));
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final boolean m(Throwable th2) {
        return this.f14069d.m(th2);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.f14069d.resumeWith(obj);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void s(Object obj) throws g0 {
        this.f14069d.s(obj);
    }
}
