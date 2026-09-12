package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.imagepipeline.common.Priority;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet f5072b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Closeable f5073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f5074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f5076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s0 f5077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u0 f5078h;

    public t0(u0 u0Var, Object obj) {
        this.f5078h = u0Var;
        this.f5071a = obj;
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final boolean a(Consumer consumer, ProducerContext producerContext) {
        t0 t0Var;
        Pair pairCreate = Pair.create(consumer, producerContext);
        synchronized (this) {
            try {
                u0 u0Var = this.f5078h;
                Object obj = this.f5071a;
                synchronized (u0Var) {
                    t0Var = (t0) u0Var.f5082a.get(obj);
                }
                if (t0Var != this) {
                    return false;
                }
                this.f5072b.add(pairCreate);
                ArrayList arrayListK = k();
                ArrayList arrayListL = l();
                ArrayList arrayListJ = j();
                Closeable closeableC = this.f5073c;
                float f2 = this.f5074d;
                int i7 = this.f5075e;
                e.b(arrayListK);
                e.d(arrayListL);
                e.a(arrayListJ);
                synchronized (pairCreate) {
                    try {
                        synchronized (this) {
                            try {
                                if (closeableC != this.f5073c) {
                                    closeableC = null;
                                } else if (closeableC != null) {
                                    closeableC = this.f5078h.c(closeableC);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (closeableC != null) {
                            if (f2 > 0.0f) {
                                consumer.c(f2);
                            }
                            consumer.b(i7, closeableC);
                            b(closeableC);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                producerContext.i(new r0(0, this, pairCreate));
                return true;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final synchronized boolean c() {
        Iterator it = this.f5072b.iterator();
        while (it.hasNext()) {
            if (((ProducerContext) ((Pair) it.next()).second).P()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean d() {
        Iterator it = this.f5072b.iterator();
        while (it.hasNext()) {
            if (!((ProducerContext) ((Pair) it.next()).second).u()) {
                return false;
            }
        }
        return true;
    }

    public final synchronized Priority e() {
        Priority priority1;
        priority1 = Priority.f4813e;
        Iterator it = this.f5072b.iterator();
        while (it.hasNext()) {
            Priority priority2 = ((ProducerContext) ((Pair) it.next()).second).f();
            Priority.f4812d.getClass();
            Intrinsics.checkNotNullParameter(priority1, "priority1");
            Intrinsics.checkNotNullParameter(priority2, "priority2");
            if (priority1.ordinal() <= priority2.ordinal()) {
                priority1 = priority2;
            }
        }
        return priority1;
    }

    public final void f(s0 s0Var, Throwable th2) {
        synchronized (this) {
            try {
                if (this.f5077g != s0Var) {
                    return;
                }
                this.f5072b.clear();
                this.f5078h.e(this.f5071a, this);
                b(this.f5073c);
                this.f5073c = null;
                for (Pair pair : this.f5072b) {
                    synchronized (pair) {
                        try {
                            ((ProducerContext) pair.second).O().k((ProducerContext) pair.second, this.f5078h.f5084c, th2, null);
                            e eVar = this.f5076f;
                            if (eVar != null) {
                                ((ProducerContext) pair.second).q(eVar.f4970x);
                            }
                            ((Consumer) pair.first).onFailure(th2);
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void g(s0 s0Var, Closeable closeable, int i7) {
        synchronized (this) {
            try {
                if (this.f5077g != s0Var) {
                    return;
                }
                b(this.f5073c);
                this.f5073c = null;
                int size = this.f5072b.size();
                if (c.e(i7)) {
                    this.f5073c = this.f5078h.c(closeable);
                    this.f5075e = i7;
                } else {
                    this.f5072b.clear();
                    this.f5078h.e(this.f5071a, this);
                }
                for (Pair pair : this.f5072b) {
                    synchronized (pair) {
                        try {
                            if (c.d(i7)) {
                                ((ProducerContext) pair.second).O().i((ProducerContext) pair.second, this.f5078h.f5084c, null);
                                e eVar = this.f5076f;
                                if (eVar != null) {
                                    ((ProducerContext) pair.second).q(eVar.f4970x);
                                }
                                ((ProducerContext) pair.second).B(Integer.valueOf(size), this.f5078h.f5085d);
                            }
                            ((Consumer) pair.first).b(i7, closeable);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void h(s0 s0Var, float f2) {
        synchronized (this) {
            try {
                if (this.f5077g != s0Var) {
                    return;
                }
                this.f5074d = f2;
                for (Pair pair : this.f5072b) {
                    synchronized (pair) {
                        ((Consumer) pair.first).c(f2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(int i7) {
        String str;
        synchronized (this) {
            try {
                boolean z5 = false;
                if (!(this.f5076f == null)) {
                    throw new IllegalArgumentException();
                }
                if (!(this.f5077g == null)) {
                    throw new IllegalArgumentException();
                }
                if (this.f5072b.isEmpty()) {
                    this.f5078h.e(this.f5071a, this);
                    return;
                }
                ProducerContext producerContext = (ProducerContext) ((Pair) this.f5072b.iterator().next()).second;
                e eVar = new e(producerContext.g(), producerContext.getId(), null, producerContext.O(), producerContext.c(), producerContext.Q(), d(), c(), e(), producerContext.l());
                this.f5076f = eVar;
                eVar.q(producerContext.getExtras());
                if (i7 == 0) {
                    throw null;
                }
                if (i7 != 3) {
                    e eVar2 = this.f5076f;
                    int iB = f0.e.b(i7);
                    if (iB == 0) {
                        z5 = true;
                    } else if (iB != 1) {
                        if (iB == 2) {
                            throw new IllegalStateException("No boolean equivalent for UNSET");
                        }
                        if (i7 == 1) {
                            str = "YES";
                        } else if (i7 != 2) {
                            str = i7 != 3 ? "null" : "UNSET";
                        } else {
                            str = "NO";
                        }
                        throw new IllegalStateException("Unrecognized TriState value: ".concat(str));
                    }
                    eVar2.B(Boolean.valueOf(z5), "started_as_prefetch");
                }
                s0 s0Var = new s0(0, this);
                this.f5077g = s0Var;
                this.f5078h.f5083b.b(s0Var, this.f5076f);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized ArrayList j() {
        e eVar = this.f5076f;
        ArrayList arrayList = null;
        if (eVar == null) {
            return null;
        }
        boolean zC = c();
        synchronized (eVar) {
            if (zC != eVar.F) {
                eVar.F = zC;
                arrayList = new ArrayList(eVar.H);
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList k() {
        e eVar = this.f5076f;
        ArrayList arrayList = null;
        if (eVar == null) {
            return null;
        }
        boolean zD = d();
        synchronized (eVar) {
            if (zD != eVar.f4971y) {
                eVar.f4971y = zD;
                arrayList = new ArrayList(eVar.H);
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList l() {
        ArrayList arrayList;
        e eVar = this.f5076f;
        if (eVar == null) {
            return null;
        }
        Priority priorityE = e();
        synchronized (eVar) {
            if (priorityE == eVar.E) {
                arrayList = null;
            } else {
                eVar.E = priorityE;
                arrayList = new ArrayList(eVar.H);
            }
        }
        return arrayList;
    }
}
