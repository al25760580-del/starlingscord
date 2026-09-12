package ws;

import hj.o0;
import hj.p0;
import hj.q;
import hj.r;
import io.sentry.android.core.internal.tombstone.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f22480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile q f22481g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0 f22482e = o0.f10891v;

    static {
        b bVar = new b();
        f22480f = bVar;
        r.h(b.class, bVar);
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
                return new p0(f22480f, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"constrainedValues_", a.class});
            case 3:
                return new b();
            case 4:
                return new j(f22480f);
            case 5:
                return f22480f;
            case 6:
                q qVar2 = f22481g;
                if (qVar2 != null) {
                    return qVar2;
                }
                synchronized (b.class) {
                    try {
                        qVar = f22481g;
                        if (qVar == null) {
                            qVar = new q();
                            f22481g = qVar;
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
