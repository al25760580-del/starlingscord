package xn;

import ar.k;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends a {
    private final CoroutineContext _context;
    private transient Continuation intercepted;

    public c(Continuation continuation, CoroutineContext coroutineContext) {
        super(continuation);
        this._context = coroutineContext;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.checkNotNull(coroutineContext);
        return coroutineContext;
    }

    @NotNull
    public final Continuation intercepted() {
        Continuation continuation = this.intercepted;
        if (continuation != null) {
            return continuation;
        }
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) getContext().l(kotlin.coroutines.d.k);
        Continuation gVar = dVar != null ? new fr.g((CoroutineDispatcher) dVar, this) : this;
        this.intercepted = gVar;
        return gVar;
    }

    @Override // xn.a
    public void releaseIntercepted() {
        Continuation continuation = this.intercepted;
        if (continuation != null && continuation != this) {
            CoroutineContext.Element elementL = getContext().l(kotlin.coroutines.d.k);
            Intrinsics.checkNotNull(elementL);
            ((CoroutineDispatcher) ((kotlin.coroutines.d) elementL)).getClass();
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            fr.g gVar = (fr.g) continuation;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fr.g.E;
            while (atomicReferenceFieldUpdater.get(gVar) == fr.h.f9375b) {
            }
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            k kVar = obj instanceof k ? (k) obj : null;
            if (kVar != null) {
                kVar.o();
            }
        }
        this.intercepted = b.f22985d;
    }

    public c(Continuation continuation) {
        this(continuation, continuation != null ? continuation.getContext() : null);
    }
}
