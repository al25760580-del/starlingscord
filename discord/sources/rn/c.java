package rn;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends b implements Continuation {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public qr.v f19463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Unit f19464e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Continuation f19465i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f19466v;

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.f14681d;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.f19465i = null;
        this.f19466v = obj;
    }
}
