package es;

import gs.l;
import gs.m;
import java.io.IOException;
import java.net.Socket;
import js.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rs.v;

/* JADX INFO: loaded from: classes.dex */
public final class g extends fs.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8749f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, String str, int i7) {
        super(str, true);
        this.f8748e = i7;
        this.f8749f = obj;
    }

    @Override // fs.a
    public final long a() {
        int i7 = 0;
        switch (this.f8748e) {
            case 0:
                h hVar = (h) this.f8749f;
                synchronized (hVar) {
                    try {
                        if (hVar.I && !hVar.J) {
                            try {
                                hVar.P();
                            } catch (IOException unused) {
                                hVar.K = true;
                            }
                            try {
                                if (hVar.n()) {
                                    hVar.B();
                                    hVar.F = 0;
                                }
                            } catch (IOException unused2) {
                                hVar.L = true;
                                hVar.f8756y = v.c(new rs.c());
                            }
                            break;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return -1L;
            case 1:
                ((Function0) this.f8749f).invoke();
                return -1L;
            case 2:
                m mVar = (m) this.f8749f;
                long jNanoTime = System.nanoTime();
                long j = Long.MIN_VALUE;
                l lVar = null;
                int i10 = 0;
                for (l connection : mVar.f10242d) {
                    Intrinsics.checkNotNullExpressionValue(connection, "connection");
                    synchronized (connection) {
                        if (mVar.b(connection, jNanoTime) > 0) {
                            i10++;
                        } else {
                            i7++;
                            long j5 = jNanoTime - connection.f10238q;
                            if (j5 > j) {
                                lVar = connection;
                                j = j5;
                            }
                            Unit unit = Unit.f14616a;
                        }
                    }
                }
                long j7 = mVar.f10239a;
                if (j < j7 && i7 <= 5) {
                    if (i7 > 0) {
                        return j7 - j;
                    }
                    if (i10 > 0) {
                        return j7;
                    }
                    return -1L;
                }
                Intrinsics.checkNotNull(lVar);
                synchronized (lVar) {
                    if (!lVar.f10237p.isEmpty()) {
                        return 0L;
                    }
                    if (lVar.f10238q + j != jNanoTime) {
                        return 0L;
                    }
                    lVar.j = true;
                    mVar.f10242d.remove(lVar);
                    Socket socket = lVar.f10227d;
                    Intrinsics.checkNotNull(socket);
                    ds.b.d(socket);
                    if (!mVar.f10242d.isEmpty()) {
                        return 0L;
                    }
                    mVar.f10240b.a();
                    return 0L;
                }
            default:
                p pVar = (p) this.f8749f;
                pVar.getClass();
                try {
                    pVar.T.n(2, 0, false);
                    break;
                } catch (IOException e10) {
                    pVar.f(e10);
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(String str, Object obj, int i7) {
        super(str, true);
        this.f8748e = i7;
        this.f8749f = obj;
    }
}
