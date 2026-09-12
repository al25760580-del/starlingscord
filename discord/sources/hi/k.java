package hi;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gn.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Unsafe f10780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f10781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f10782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f10783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f10784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f10785g;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new j());
            }
            try {
                f10782d = unsafe.objectFieldOffset(m.class.getDeclaredField("i"));
                f10781c = unsafe.objectFieldOffset(m.class.getDeclaredField("e"));
                f10783e = unsafe.objectFieldOffset(m.class.getDeclaredField("d"));
                f10784f = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                f10785g = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                f10780b = unsafe;
            } catch (Exception e10) {
                Object obj = di.k.f7644a;
                if (!(e10 instanceof RuntimeException)) {
                    throw new RuntimeException(e10);
                }
                throw ((RuntimeException) e10);
            }
        } catch (PrivilegedActionException e11) {
            throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
        }
    }

    @Override // gn.h
    public final void P(l lVar, l lVar2) {
        f10780b.putObject(lVar, f10785g, lVar2);
    }

    @Override // gn.h
    public final void Q(l lVar, Thread thread) {
        f10780b.putObject(lVar, f10784f, thread);
    }

    @Override // gn.h
    public final boolean k(m mVar, c cVar, c cVar2) {
        return h.a(f10780b, mVar, f10781c, cVar, cVar2);
    }

    @Override // gn.h
    public final boolean l(m mVar, Object obj, Object obj2) {
        return i.a(f10780b, mVar, f10783e, obj, obj2);
    }

    @Override // gn.h
    public final boolean m(m mVar, l lVar, l lVar2) {
        return g.a(f10780b, mVar, f10782d, lVar, lVar2);
    }

    @Override // gn.h
    public final c x(m mVar) {
        c cVar;
        c cVar2 = c.f10771d;
        do {
            cVar = mVar.f10794e;
            if (cVar2 == cVar) {
                break;
            }
        } while (!k(mVar, cVar, cVar2));
        return cVar;
    }

    @Override // gn.h
    public final l y(m mVar) {
        l lVar;
        l lVar2 = l.f10786c;
        do {
            lVar = mVar.f10795i;
            if (lVar2 == lVar) {
                break;
            }
        } while (!m(mVar, lVar, lVar2));
        return lVar;
    }
}
