package kotlin.coroutines;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements CoroutineContext.Element {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f14676d;

    public a(f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f14676d = key;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext B(f fVar) {
        return e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object Y(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final f getKey() {
        return this.f14676d;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element l(f fVar) {
        return e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext n(CoroutineContext coroutineContext) {
        return e.c(this, coroutineContext);
    }
}
