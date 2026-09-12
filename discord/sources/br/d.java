package br;

import android.os.Handler;
import android.os.Looper;
import ar.e0;
import ar.k;
import ar.k0;
import ar.m0;
import ar.m1;
import ar.w;
import fr.q;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends CoroutineDispatcher implements e0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f3386i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f3387v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f3388w;

    public d(Handler handler, boolean z5) {
        this.f3386i = handler;
        this.f3387v = z5;
        this.f3388w = z5 ? this : new d(handler, true);
    }

    @Override // ar.e0
    public final m0 P(long j, final Runnable runnable, CoroutineContext coroutineContext) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f3386i.postDelayed(runnable, j)) {
            return new m0() { // from class: br.c
                @Override // ar.m0
                public final void dispose() {
                    this.f3384d.f3386i.removeCallbacks(runnable);
                }
            };
        }
        p0(coroutineContext, runnable);
        return m1.f2944d;
    }

    @Override // ar.e0
    public final void e0(long j, k kVar) {
        a1.k kVar2 = new a1.k(4, kVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f3386i.postDelayed(kVar2, j)) {
            kVar.v(new b7.a(1, this, kVar2));
        } else {
            p0(kVar.f2937w, kVar2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f3386i == this.f3386i && dVar.f3387v == this.f3387v;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3386i) ^ (this.f3387v ? 1231 : 1237);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void l0(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f3386i.post(runnable)) {
            return;
        }
        p0(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean n0(CoroutineContext coroutineContext) {
        return (this.f3387v && Intrinsics.areEqual(Looper.myLooper(), this.f3386i.getLooper())) ? false : true;
    }

    public final void p0(CoroutineContext coroutineContext, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        Job job = (Job) coroutineContext.l(w.f2975e);
        if (job != null) {
            job.f(cancellationException);
        }
        hr.e eVar = k0.f2938a;
        hr.d.f11103i.l0(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        d dVar;
        String str;
        hr.e eVar = k0.f2938a;
        d dVar2 = q.f9394a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.f3388w;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f3386i.toString();
        return this.f3387v ? kk.b.j(string, ".immediate") : string;
    }
}
