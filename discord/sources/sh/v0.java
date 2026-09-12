package sh;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a5.o f20207g = new a5.o("ExtractorSessionStoreView", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f20208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f20209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f20210c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReentrantLock f20211d = new ReentrantLock();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final th.f f20212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final th.f f20213f;

    public v0(s sVar, th.f fVar, p0 p0Var, th.f fVar2) {
        this.f20208a = sVar;
        this.f20212e = fVar;
        this.f20209b = p0Var;
        this.f20213f = fVar2;
    }

    public final s0 a(int i7) {
        Integer numValueOf = Integer.valueOf(i7);
        s0 s0Var = (s0) this.f20210c.get(numValueOf);
        if (s0Var != null) {
            return s0Var;
        }
        throw new l0(String.format("Could not find session %d while trying to get it", numValueOf), i7);
    }

    public final Object b(u0 u0Var) {
        ReentrantLock reentrantLock = this.f20211d;
        try {
            reentrantLock.lock();
            return u0Var.a();
        } finally {
            reentrantLock.unlock();
        }
    }
}
