package io.sentry.android.core.internal.tombstone;

import hj.o0;
import hj.p0;
import hj.q;
import hj.r;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f12268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile q f12269h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0 f12270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o0 f12271f;

    static {
        l lVar = new l();
        f12268g = lVar;
        r.h(l.class, lVar);
    }

    public l() {
        o0 o0Var = o0.f10891v;
        this.f12270e = o0Var;
        this.f12271f = o0Var;
    }

    @Override // hj.r
    public final Object a(int i7) {
        q qVar;
        switch (f0.e.b(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new p0(f12268g, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0005\u0000\u0001\u0004\u0002Ȉ\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u0002\u0007Ț\b\u0002\tȚ", new Object[]{"id_", "name_", "registers_", i.class, "currentBacktrace_", b.class, "memoryDump_", g.class, "taggedAddrCtrl_", "backtraceNote_", "pacEnabledKeys_", "unreadableElfFiles_"});
            case 3:
                return new l();
            case 4:
                return new j(f12268g);
            case 5:
                return f12268g;
            case 6:
                q qVar2 = f12269h;
                if (qVar2 != null) {
                    return qVar2;
                }
                synchronized (l.class) {
                    try {
                        qVar = f12269h;
                        if (qVar == null) {
                            qVar = new q();
                            f12269h = qVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return qVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
