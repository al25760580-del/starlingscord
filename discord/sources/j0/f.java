package j0;

import android.view.Choreographer;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import u.j;

/* JADX INFO: loaded from: classes.dex */
public final class f implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Choreographer f13592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f13593e;

    public f(Choreographer choreographer, d dVar) {
        Intrinsics.checkNotNullParameter(choreographer, "choreographer");
        this.f13592d = choreographer;
        this.f13593e = dVar;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext B(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object Y(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element l(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext n(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }
}
