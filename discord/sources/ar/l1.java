package ar;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends kotlin.coroutines.a implements Job {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l1 f2941e = new l1(w.f2975e);

    @Override // kotlinx.coroutines.Job
    public final m0 O(Function1 function1) {
        return m1.f2944d;
    }

    @Override // kotlinx.coroutines.Job
    public final Object a0(xn.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    public final boolean c() {
        return true;
    }

    @Override // kotlinx.coroutines.Job
    public final m0 c0(boolean z5, boolean z6, c1 c1Var) {
        return m1.f2944d;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public final Sequence q() {
        return xq.f.f23028a;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.Job
    public final CancellationException u() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    public final n y(i1 i1Var) {
        return m1.f2944d;
    }

    @Override // kotlinx.coroutines.Job
    public final void f(CancellationException cancellationException) {
    }
}
