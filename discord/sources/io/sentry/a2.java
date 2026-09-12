package io.sentry;

import java.io.Closeable;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class a2 implements b0, Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w5 f12038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fj.c f12039e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u4.c f12040i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile i0 f12041v = null;

    public a2(w5 w5Var) {
        this.f12038d = w5Var;
        ue.i iVar = new ue.i(w5Var);
        this.f12040i = new u4.c(iVar);
        this.f12039e = new fj.c(20, iVar);
    }

    @Override // io.sentry.b0
    public final y5 c(y5 y5Var, Hint hint) {
        if (y5Var.E == null) {
            y5Var.E = "java";
        }
        if (l(y5Var, hint)) {
            i(y5Var);
            io.sentry.protocol.t tVar = this.f12038d.getSessionReplay().f12059m;
            if (tVar != null) {
                y5Var.f12672i = tVar;
            }
        }
        return y5Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12041v != null) {
            this.f12041v.f12737f.shutdown();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.sentry.b0
    public final SentryEvent f(SentryEvent sentryEvent, Hint hint) {
        ArrayList arrayList;
        if (sentryEvent.E == null) {
            sentryEvent.E = "java";
        }
        Throwable th2 = sentryEvent.G;
        if (th2 != null) {
            u4.c cVar = this.f12040i;
            cVar.getClass();
            AtomicInteger atomicInteger = new AtomicInteger(-1);
            HashSet hashSet = new HashSet();
            ArrayDeque arrayDeque = new ArrayDeque();
            cVar.c(th2, atomicInteger, hashSet, arrayDeque, null);
            sentryEvent.Q = new f6(new ArrayList(arrayDeque));
        }
        io.sentry.protocol.d dVar = sentryEvent.K;
        w5 w5Var = this.f12038d;
        io.sentry.protocol.d dVarA = io.sentry.protocol.d.a(dVar, w5Var);
        if (dVarA != null) {
            sentryEvent.K = dVarA;
        }
        Map mapA = w5Var.getModulesLoader().a();
        if (mapA != null) {
            AbstractMap abstractMap = sentryEvent.V;
            if (abstractMap == null) {
                sentryEvent.V = new HashMap(mapA);
            } else {
                abstractMap.putAll(mapA);
            }
        }
        if (l(sentryEvent, hint)) {
            i(sentryEvent);
            f6 f6Var = sentryEvent.P;
            if ((f6Var != null ? f6Var.f12677a : null) == null) {
                ArrayList<io.sentry.protocol.u> arrayListD = sentryEvent.d();
                if (arrayListD == null || arrayListD.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = null;
                    for (io.sentry.protocol.u uVar : arrayListD) {
                        if (uVar.f13053x != null && uVar.f13051v != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(uVar.f13051v);
                        }
                    }
                }
                boolean zIsAttachThreads = w5Var.isAttachThreads();
                boolean zB = false;
                fj.c cVar2 = this.f12039e;
                if (zIsAttachThreads || io.sentry.hints.a.class.isInstance(hint.b("sentry:typeCheckHint"))) {
                    Object objB = hint.b("sentry:typeCheckHint");
                    boolean zIsAttachStacktrace = w5Var.isAttachStacktrace();
                    if (objB instanceof io.sentry.hints.a) {
                        zB = ((io.sentry.hints.a) objB).b();
                        zIsAttachStacktrace = true;
                    }
                    cVar2.getClass();
                    sentryEvent.P = new f6(cVar2.u(Thread.getAllStackTraces(), arrayList, zB, zIsAttachStacktrace));
                } else if (w5Var.isAttachStacktrace() && ((arrayListD == null || arrayListD.isEmpty()) && !io.sentry.hints.d.class.isInstance(hint.b("sentry:typeCheckHint")))) {
                    boolean zIsAttachStacktrace2 = w5Var.isAttachStacktrace();
                    cVar2.getClass();
                    HashMap map = new HashMap();
                    Thread threadCurrentThread = Thread.currentThread();
                    map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
                    sentryEvent.P = new f6(cVar2.u(map, null, false, zIsAttachStacktrace2));
                    return sentryEvent;
                }
            }
        }
        return sentryEvent;
    }

    @Override // io.sentry.b0
    public final io.sentry.protocol.d0 g(io.sentry.protocol.d0 d0Var, Hint hint) {
        if (d0Var.E == null) {
            d0Var.E = "java";
        }
        io.sentry.protocol.d dVarA = io.sentry.protocol.d.a(d0Var.K, this.f12038d);
        if (dVarA != null) {
            d0Var.K = dVarA;
        }
        if (l(d0Var, hint)) {
            i(d0Var);
        }
        return d0Var;
    }

    public final void i(f4 f4Var) {
        if (f4Var.f12675x == null) {
            f4Var.f12675x = this.f12038d.getRelease();
        }
        if (f4Var.f12676y == null) {
            f4Var.f12676y = this.f12038d.getEnvironment();
        }
        if (f4Var.H == null) {
            f4Var.H = this.f12038d.getServerName();
        }
        if (this.f12038d.isAttachServerName() && f4Var.H == null) {
            if (this.f12041v == null) {
                if (i0.f12731i == null) {
                    r rVarA = i0.j.a();
                    try {
                        if (i0.f12731i == null) {
                            i0.f12731i = new i0();
                        }
                        rVarA.close();
                    } catch (Throwable th2) {
                        try {
                            rVarA.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                this.f12041v = i0.f12731i;
            }
            if (this.f12041v != null) {
                i0 i0Var = this.f12041v;
                if (i0Var.f12734c < System.currentTimeMillis() && i0Var.f12735d.compareAndSet(false, true)) {
                    i0Var.a();
                }
                f4Var.H = i0Var.f12733b;
            }
        }
        if (f4Var.I == null) {
            f4Var.I = this.f12038d.getDist();
        }
        if (f4Var.f12672i == null) {
            f4Var.f12672i = this.f12038d.getSdkVersion();
        }
        w5 w5Var = this.f12038d;
        if (f4Var.f12674w == null) {
            f4Var.f12674w = new HashMap(new HashMap(w5Var.getTags()));
        } else {
            for (Map.Entry<String, String> entry : w5Var.getTags().entrySet()) {
                if (!f4Var.f12674w.containsKey(entry.getKey())) {
                    f4Var.c(entry.getKey(), entry.getValue());
                }
            }
        }
        io.sentry.protocol.h0 h0Var = f4Var.F;
        if (h0Var == null) {
            h0Var = new io.sentry.protocol.h0();
            f4Var.F = h0Var;
        }
        if (h0Var.f12959v == null && this.f12038d.isSendDefaultPii()) {
            h0Var.f12959v = "{{auto}}";
        }
    }

    public final boolean l(f4 f4Var, Hint hint) {
        if (a5.l0.O(hint)) {
            return true;
        }
        this.f12038d.getLogger().q(SentryLevel.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", f4Var.f12670d);
        return false;
    }
}
