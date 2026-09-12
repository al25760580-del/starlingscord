package js;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import okio.Buffer;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Closeable {
    public static final a0 W;
    public final fs.b E;
    public final fs.b F;
    public final fs.b G;
    public final z H;
    public long I;
    public long J;
    public long K;
    public long L;
    public final a0 M;
    public a0 N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public final Socket S;
    public final x T;
    public final fp.b U;
    public final LinkedHashSet V;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f14150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f14151e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f14152i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14153v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14154w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14155x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final fs.c f14156y;

    static {
        a0 a0Var = new a0();
        a0Var.c(7, 65535);
        a0Var.c(5, 16384);
        W = a0Var;
    }

    public p(af.c builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f14150d = (i) builder.f398x;
        this.f14151e = new LinkedHashMap();
        String str = (String) builder.f395i;
        rs.p pVar = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            str = null;
        }
        this.f14152i = str;
        this.f14154w = 3;
        fs.c cVar = (fs.c) builder.f393d;
        this.f14156y = cVar;
        this.E = cVar.e();
        this.F = cVar.e();
        this.G = cVar.e();
        this.H = z.f14206a;
        a0 a0Var = new a0();
        a0Var.c(7, PointerEventHelper.X_FLAG_SUPPORTS_HOVER);
        this.M = a0Var;
        a0 a0Var2 = W;
        this.N = a0Var2;
        this.R = a0Var2.a();
        Socket socket = (Socket) builder.f394e;
        if (socket == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            socket = null;
        }
        this.S = socket;
        rs.o oVar = (rs.o) builder.f397w;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sink");
            oVar = null;
        }
        this.T = new x(oVar);
        rs.p pVar2 = (rs.p) builder.f396v;
        if (pVar2 != null) {
            pVar = pVar2;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("source");
        }
        this.U = new fp.b(this, new t(pVar));
        this.V = new LinkedHashSet();
    }

    public final void c(b connectionCode, b streamCode, IOException iOException) {
        int i7;
        Object[] array;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        byte[] bArr = ds.b.f7815a;
        try {
            l(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f14151e.isEmpty()) {
                    array = null;
                } else {
                    array = this.f14151e.values().toArray(new w[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    this.f14151e.clear();
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        w[] wVarArr = (w[]) array;
        if (wVarArr != null) {
            for (w wVar : wVarArr) {
                try {
                    wVar.c(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.T.close();
        } catch (IOException unused3) {
        }
        try {
            this.S.close();
        } catch (IOException unused4) {
        }
        this.E.f();
        this.F.f();
        this.G.f();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c(b.NO_ERROR, b.CANCEL, null);
    }

    public final void f(IOException iOException) {
        b bVar = b.PROTOCOL_ERROR;
        c(bVar, bVar, iOException);
    }

    public final void flush() {
        this.T.flush();
    }

    public final synchronized w g(int i7) {
        return (w) this.f14151e.get(Integer.valueOf(i7));
    }

    public final synchronized w i(int i7) {
        w wVar;
        wVar = (w) this.f14151e.remove(Integer.valueOf(i7));
        notifyAll();
        return wVar;
    }

    public final void l(b statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.T) {
            Ref.IntRef intRef = new Ref.IntRef();
            synchronized (this) {
                if (this.f14155x) {
                    return;
                }
                this.f14155x = true;
                int i7 = this.f14153v;
                intRef.element = i7;
                Unit unit = Unit.f14616a;
                this.T.i(i7, statusCode, ds.b.f7815a);
            }
        }
    }

    public final synchronized void n(long j) {
        long j5 = this.O + j;
        this.O = j5;
        long j7 = j5 - this.P;
        if (j7 >= this.M.a() / 2) {
            y(0, j7);
            this.P += j7;
        }
    }

    public final void q(int i7, boolean z5, Buffer buffer, long j) {
        long j5;
        long j7;
        int iMin;
        long j10;
        if (j == 0) {
            this.T.f(z5, i7, buffer, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j5 = this.Q;
                            j7 = this.R;
                            if (j5 >= j7) {
                                if (!this.f14151e.containsKey(Integer.valueOf(i7))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    throw th2;
                }
                iMin = Math.min((int) Math.min(j, j7 - j5), this.T.f14200i);
                j10 = iMin;
                this.Q += j10;
                Unit unit = Unit.f14616a;
            }
            j -= j10;
            this.T.f(z5 && j == 0, i7, buffer, iMin);
        }
    }

    public final void u(int i7, b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.E.c(new n(this.f14152i + '[' + i7 + "] writeSynReset", this, i7, errorCode, 1), 0L);
    }

    public final void y(int i7, long j) {
        this.E.c(new o(this.f14152i + '[' + i7 + "] windowUpdate", this, i7, j), 0L);
    }
}
