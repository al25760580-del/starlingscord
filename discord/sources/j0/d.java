package j0;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import rn.l;
import rn.u;

/* JADX INFO: loaded from: classes.dex */
public final class d extends CoroutineDispatcher {
    public static final u J = l.b(a.E);
    public boolean F;
    public boolean G;
    public final f I;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Choreographer f13585i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Handler f13586v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f13587w = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayDeque f13588x = new ArrayDeque();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f13589y = new ArrayList();
    public ArrayList E = new ArrayList();
    public final c H = new c(this);

    static {
        new hs.c(3);
    }

    public d(Choreographer choreographer, Handler handler) {
        this.f13585i = choreographer;
        this.f13586v = handler;
        this.I = new f(choreographer, this);
    }

    public static final void p0(d dVar) {
        Runnable runnable;
        boolean z5;
        do {
            synchronized (dVar.f13587w) {
                ArrayDeque arrayDeque = dVar.f13588x;
                runnable = (Runnable) (arrayDeque.isEmpty() ? null : arrayDeque.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (dVar.f13587w) {
                    ArrayDeque arrayDeque2 = dVar.f13588x;
                    runnable = (Runnable) (arrayDeque2.isEmpty() ? null : arrayDeque2.removeFirst());
                }
            }
            synchronized (dVar.f13587w) {
                if (dVar.f13588x.isEmpty()) {
                    z5 = false;
                    dVar.F = false;
                } else {
                    z5 = true;
                }
            }
        } while (z5);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void l0(CoroutineContext context, Runnable block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this.f13587w) {
            try {
                this.f13588x.addLast(block);
                if (!this.F) {
                    this.F = true;
                    this.f13586v.post(this.H);
                    if (!this.G) {
                        this.G = true;
                        this.f13585i.postFrameCallback(this.H);
                    }
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
