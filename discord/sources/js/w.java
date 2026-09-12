package js;

import java.io.IOException;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f14186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f14187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f14190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f14191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v f14193i;
    public final u j;
    public final gs.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gs.h f14194l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f14195m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IOException f14196n;

    public w(int i7, p connection, boolean z5, boolean z6, Headers headers) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f14185a = i7;
        this.f14186b = connection;
        this.f14190f = connection.N.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f14191g = arrayDeque;
        this.f14193i = new v(this, connection.M.a(), z6);
        this.j = new u(this, z5);
        this.k = new gs.h(this);
        this.f14194l = new gs.h(this);
        if (headers == null) {
            if (!h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (h()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(headers);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    public final void a() {
        boolean z5;
        boolean zI;
        byte[] bArr = ds.b.f7815a;
        synchronized (this) {
            try {
                v vVar = this.f14193i;
                if (vVar.f14180e || !vVar.f14183w) {
                    z5 = false;
                } else {
                    u uVar = this.j;
                    if (uVar.f14175d || uVar.f14177i) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                }
                zI = i();
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z5) {
            c(b.CANCEL, null);
        } else {
            if (zI) {
                return;
            }
            this.f14186b.i(this.f14185a);
        }
    }

    public final void b() throws IOException {
        u uVar = this.j;
        if (uVar.f14177i) {
            throw new IOException("stream closed");
        }
        if (uVar.f14175d) {
            throw new IOException("stream finished");
        }
        if (this.f14195m != null) {
            IOException iOException = this.f14196n;
            if (iOException != null) {
                throw iOException;
            }
            b bVar = this.f14195m;
            Intrinsics.checkNotNull(bVar);
            throw new b0(bVar);
        }
    }

    public final void c(b statusCode, IOException iOException) {
        Intrinsics.checkNotNullParameter(statusCode, "rstStatusCode");
        if (d(statusCode, iOException)) {
            p pVar = this.f14186b;
            pVar.getClass();
            Intrinsics.checkNotNullParameter(statusCode, "statusCode");
            pVar.T.q(this.f14185a, statusCode);
        }
    }

    public final boolean d(b bVar, IOException iOException) {
        byte[] bArr = ds.b.f7815a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            if (this.f14193i.f14180e && this.j.f14175d) {
                return false;
            }
            this.f14195m = bVar;
            this.f14196n = iOException;
            notifyAll();
            Unit unit = Unit.f14616a;
            this.f14186b.i(this.f14185a);
            return true;
        }
    }

    public final void e(b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (d(errorCode, null)) {
            this.f14186b.u(this.f14185a, errorCode);
        }
    }

    public final synchronized b f() {
        return this.f14195m;
    }

    public final u g() {
        synchronized (this) {
            try {
                if (!this.f14192h && !h()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.j;
    }

    public final boolean h() {
        boolean z5 = (this.f14185a & 1) == 1;
        this.f14186b.getClass();
        return true == z5;
    }

    public final synchronized boolean i() {
        try {
            if (this.f14195m != null) {
                return false;
            }
            v vVar = this.f14193i;
            if (vVar.f14180e || vVar.f14183w) {
                u uVar = this.j;
                if ((uVar.f14175d || uVar.f14177i) && this.f14192h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void j(Headers headers, boolean z5) {
        boolean zI;
        Intrinsics.checkNotNullParameter(headers, "headers");
        byte[] bArr = ds.b.f7815a;
        synchronized (this) {
            try {
                if (this.f14192h && z5) {
                    this.f14193i.getClass();
                } else {
                    this.f14192h = true;
                    this.f14191g.add(headers);
                }
                if (z5) {
                    this.f14193i.f14180e = true;
                }
                zI = i();
                notifyAll();
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zI) {
            return;
        }
        this.f14186b.i(this.f14185a);
    }

    public final synchronized void k(b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f14195m == null) {
            this.f14195m = errorCode;
            notifyAll();
        }
    }
}
