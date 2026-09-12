package ar;

import kotlin.collections.ArrayDeque;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t0 extends CoroutineDispatcher {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f2964x = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f2965i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2966v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayDeque f2967w;

    public final void p0(boolean z5) {
        long j = this.f2965i - (z5 ? 4294967296L : 1L);
        this.f2965i = j;
        if (j <= 0 && this.f2966v) {
            shutdown();
        }
    }

    public final void q0(i0 i0Var) {
        ArrayDeque arrayDeque = this.f2967w;
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque();
            this.f2967w = arrayDeque;
        }
        arrayDeque.addLast(i0Var);
    }

    public abstract Thread r0();

    public final void s0(boolean z5) {
        this.f2965i = (z5 ? 4294967296L : 1L) + this.f2965i;
        if (z5) {
            return;
        }
        this.f2966v = true;
    }

    public abstract void shutdown();

    public abstract long t0();

    public final boolean u0() {
        ArrayDeque arrayDeque = this.f2967w;
        if (arrayDeque == null) {
            return false;
        }
        i0 i0Var = (i0) (arrayDeque.isEmpty() ? null : arrayDeque.removeFirst());
        if (i0Var == null) {
            return false;
        }
        i0Var.run();
        return true;
    }

    public void v0(long j, r0 r0Var) {
        kotlinx.coroutines.a.G.A0(j, r0Var);
    }
}
