package io.sentry.android.core.internal.tombstone;

import hj.e0;
import hj.o0;
import hj.p0;
import hj.q;
import hj.r;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o f12274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile q f12275i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0 f12276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e0 f12277f = e0.f10823e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o0 f12278g;

    static {
        o oVar = new o();
        f12274h = oVar;
        r.h(o.class, oVar);
    }

    public o() {
        o0 o0Var = o0.f10891v;
        this.f12276e = o0Var;
        this.f12278g = o0Var;
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
                return new p0(f12274h, "\u0000\u0017\u0000\u0001\u0001\u001a\u0017\u0002\u0006\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u000b\u0006\u000b\u0007\u000b\bȈ\tȚ\nဉ\u0000\u000eȈ\u000f\u001b\u00102\u0011\u001b\u0012\u001b\u0013\u001b\u0014\u000b\u0015\u001b\u0016\u000b\u0017\u0007\u0018\f\u00192\u001aဉ\u0001", new Object[]{"bitField0_", "arch_", "buildFingerprint_", "revision_", "timestamp_", "pid_", "tid_", "uid_", "selinuxLabel_", "commandLine_", "signalInfo_", "abortMessage_", "causes_", c.class, "threads_", n.f12273a, "memoryMappings_", h.class, "logBuffers_", f.class, "openFds_", e.class, "processUptime_", "crashDetails_", d.class, "pageSize_", "hasBeen16KbMode_", "guestArch_", "guestThreads_", m.f12272a, "stackHistoryBuffer_"});
            case 3:
                return new o();
            case 4:
                return new j(f12274h);
            case 5:
                return f12274h;
            case 6:
                q qVar2 = f12275i;
                if (qVar2 != null) {
                    return qVar2;
                }
                synchronized (o.class) {
                    try {
                        qVar = f12275i;
                        if (qVar == null) {
                            qVar = new q();
                            f12275i = qVar;
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
