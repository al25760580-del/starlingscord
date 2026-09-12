package gs;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import js.p;
import js.w;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import rs.v;

/* JADX INFO: loaded from: classes.dex */
public final class h extends okio.a {
    public final /* synthetic */ int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f10211l;

    public h(i iVar) {
        this.f10211l = iVar;
    }

    @Override // okio.a
    public final void k() {
        switch (this.k) {
            case 0:
                ((i) this.f10211l).cancel();
                return;
            case 1:
                ((w) this.f10211l).e(js.b.CANCEL);
                p pVar = ((w) this.f10211l).f14186b;
                synchronized (pVar) {
                    long j = pVar.K;
                    long j5 = pVar.J;
                    if (j < j5) {
                        return;
                    }
                    pVar.J = j5 + 1;
                    pVar.L = System.nanoTime() + ((long) 1000000000);
                    Unit unit = Unit.f14616a;
                    pVar.E.c(new es.g(Intrinsics.stringPlus(pVar.f14152i, " ping"), pVar, 3), 0L);
                    return;
                }
            default:
                Socket socket = (Socket) this.f10211l;
                try {
                    socket.close();
                    return;
                } catch (AssertionError e10) {
                    if (!v.g(e10)) {
                        throw e10;
                    }
                    rs.l.f19580a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
                    return;
                } catch (Exception e11) {
                    rs.l.f19580a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e11);
                    return;
                }
        }
    }

    public void l() throws IOException {
        if (j()) {
            throw m(null);
        }
    }

    public IOException m(IOException iOException) {
        switch (this.k) {
            case 1:
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            default:
                SocketTimeoutException socketTimeoutException2 = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException2.initCause(iOException);
                }
                return socketTimeoutException2;
        }
    }

    public h(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f10211l = socket;
    }

    public h(w this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f10211l = this$0;
    }
}
