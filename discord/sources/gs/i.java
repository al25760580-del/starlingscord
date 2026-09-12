package gs;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Call {
    public e E;
    public l F;
    public boolean G;
    public gc.k H;
    public boolean I;
    public boolean J;
    public boolean K;
    public volatile boolean L;
    public volatile gc.k M;
    public volatile l N;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OkHttpClient f10212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Request f10213e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f10214i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final m f10215v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h f10216w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f10217x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f10218y;

    public i(OkHttpClient client, Request originalRequest, boolean z5) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f10212d = client;
        this.f10213e = originalRequest;
        this.f10214i = z5;
        this.f10215v = (m) client.f17338e.f21117d;
        client.f17341w.getClass();
        cs.o this_asFactory = cs.o.f7458d;
        Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        Intrinsics.checkNotNullParameter(this, "it");
        h hVar = new h(this);
        hVar.g(client.T, TimeUnit.MILLISECONDS);
        this.f10216w = hVar;
        this.f10217x = new AtomicBoolean();
        this.K = true;
    }

    public static final String a(i iVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(iVar.L ? "canceled " : "");
        sb2.append(iVar.f10214i ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(iVar.f10213e.f17368a.f());
        return sb2.toString();
    }

    public final void b(l connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        byte[] bArr = ds.b.f7815a;
        if (this.F != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.F = connection;
        connection.f10237p.add(new g(this, this.f10218y));
    }

    public final IOException c(IOException iOException) {
        IOException ioe;
        Socket socketK;
        byte[] bArr = ds.b.f7815a;
        l connection = this.F;
        if (connection != null) {
            synchronized (connection) {
                socketK = k();
            }
            if (this.F == null) {
                if (socketK != null) {
                    ds.b.d(socketK);
                }
                Intrinsics.checkNotNullParameter(this, "call");
                Intrinsics.checkNotNullParameter(connection, "connection");
            } else if (socketK != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.G && this.f10216w.j()) {
            ioe = new InterruptedIOException("timeout");
            if (iOException != null) {
                ioe.initCause(iOException);
            }
        } else {
            ioe = iOException;
        }
        if (iOException == null) {
            Intrinsics.checkNotNullParameter(this, "call");
            return ioe;
        }
        Intrinsics.checkNotNull(ioe);
        Intrinsics.checkNotNullParameter(this, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        return ioe;
    }

    @Override // okhttp3.Call
    public final void cancel() {
        Socket socket;
        if (this.L) {
            return;
        }
        this.L = true;
        gc.k kVar = this.M;
        if (kVar != null) {
            ((hs.e) kVar.f9735w).cancel();
        }
        l lVar = this.N;
        if (lVar != null && (socket = lVar.f10226c) != null) {
            ds.b.d(socket);
        }
        Intrinsics.checkNotNullParameter(this, "call");
    }

    public final Object clone() {
        return new i(this.f10212d, this.f10213e, this.f10214i);
    }

    public final void d(cs.h responseCallback) {
        f other;
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.f10217x.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        ls.n nVar = ls.n.f15297a;
        this.f10218y = ls.n.f15297a.g();
        Intrinsics.checkNotNullParameter(this, "call");
        Dispatcher dispatcher = this.f10212d.f17337d;
        f call = new f(this, responseCallback);
        dispatcher.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (dispatcher) {
            dispatcher.f17316d.add(call);
            if (!this.f10214i) {
                String str = this.f10213e.f17368a.f17323d;
                Iterator it = dispatcher.f17317e.iterator();
                do {
                    if (!it.hasNext()) {
                        Iterator it2 = dispatcher.f17316d.iterator();
                        do {
                            if (!it2.hasNext()) {
                                other = null;
                                break;
                            }
                            other = (f) it2.next();
                        } while (!Intrinsics.areEqual(other.f10209i.f10213e.f17368a.f17323d, str));
                    } else {
                        other = (f) it.next();
                    }
                } while (!Intrinsics.areEqual(other.f10209i.f10213e.f17368a.f17323d, str));
                if (other != null) {
                    Intrinsics.checkNotNullParameter(other, "other");
                    call.f10208e = other.f10208e;
                }
            }
            Unit unit = Unit.f14616a;
        }
        dispatcher.e();
    }

    public final Response e() {
        if (!this.f10217x.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f10216w.i();
        ls.n nVar = ls.n.f15297a;
        this.f10218y = ls.n.f15297a.g();
        Intrinsics.checkNotNullParameter(this, "call");
        try {
            Dispatcher dispatcher = this.f10212d.f17337d;
            synchronized (dispatcher) {
                Intrinsics.checkNotNullParameter(this, "call");
                dispatcher.f17318f.add(this);
            }
            Response responseG = g();
            Dispatcher dispatcher2 = this.f10212d.f17337d;
            dispatcher2.getClass();
            Intrinsics.checkNotNullParameter(this, "call");
            dispatcher2.c(dispatcher2.f17318f, this);
            return responseG;
        } catch (Throwable th2) {
            Dispatcher dispatcher3 = this.f10212d.f17337d;
            dispatcher3.getClass();
            Intrinsics.checkNotNullParameter(this, "call");
            dispatcher3.c(dispatcher3.f17318f, this);
            throw th2;
        }
    }

    public final void f(boolean z5) {
        gc.k kVar;
        synchronized (this) {
            if (!this.K) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.f14616a;
        }
        if (z5 && (kVar = this.M) != null) {
            ((hs.e) kVar.f9735w).cancel();
            ((i) kVar.f9733i).h(kVar, true, true, null);
        }
        this.H = null;
    }

    public final Response g() {
        ArrayList arrayList = new ArrayList();
        i0.o(arrayList, this.f10212d.f17339i);
        arrayList.add(new hs.a(this.f10212d));
        arrayList.add(new hs.a(this.f10212d.G));
        arrayList.add(new es.b(this.f10212d.H));
        arrayList.add(a.f10182a);
        if (!this.f10214i) {
            i0.o(arrayList, this.f10212d.f17340v);
        }
        arrayList.add(new hs.b(this.f10214i));
        Request request = this.f10213e;
        OkHttpClient okHttpClient = this.f10212d;
        try {
            try {
                Response responseA = new hs.g(this, arrayList, 0, null, request, okHttpClient.U, okHttpClient.V, okHttpClient.W).a(this.f10213e);
                if (this.L) {
                    ds.b.c(responseA);
                    throw new IOException("Canceled");
                }
                j(null);
                return responseA;
            } catch (IOException e10) {
                IOException iOExceptionJ = j(e10);
                if (iOExceptionJ == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw iOExceptionJ;
            }
        } catch (Throwable th2) {
            if (0 == 0) {
                j(null);
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:8:0x0013, B:17:0x0022, B:19:0x0026, B:20:0x0028, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001c), top: B:55:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:8:0x0013, B:17:0x0022, B:19:0x0026, B:20:0x0028, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001c), top: B:55:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final IOException h(gc.k exchange, boolean z5, boolean z6, IOException iOException) {
        boolean z7;
        boolean z10;
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (Intrinsics.areEqual(exchange, this.M)) {
            synchronized (this) {
                z7 = false;
                if (z5) {
                    try {
                        if (this.I) {
                            if (z5) {
                                this.I = false;
                            }
                            if (z6) {
                                this.J = false;
                            }
                            z11 = this.I;
                            if (z11) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            if (!z11) {
                                z7 = true;
                            }
                            z10 = z7;
                            z7 = z12;
                        } else if (z6 || !this.J) {
                            z10 = false;
                        } else {
                            if (z5) {
                                this.I = false;
                            }
                            if (z6) {
                                this.J = false;
                            }
                            z11 = this.I;
                            if (z11 || this.J) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            if (!z11 && !this.J && !this.K) {
                                z7 = true;
                            }
                            z10 = z7;
                            z7 = z12;
                        }
                        Unit unit = Unit.f14616a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    if (z6) {
                    }
                    z10 = false;
                    Unit unit2 = Unit.f14616a;
                }
            }
            if (z7) {
                this.M = null;
                l lVar = this.F;
                if (lVar != null) {
                    synchronized (lVar) {
                        lVar.f10234m++;
                    }
                }
            }
            if (z10) {
                return c(iOException);
            }
        }
        return iOException;
    }

    @Override // okhttp3.Call
    public final Request i() {
        return this.f10213e;
    }

    public final IOException j(IOException iOException) {
        boolean z5;
        synchronized (this) {
            try {
                z5 = false;
                if (this.K) {
                    this.K = false;
                    if (!this.I && !this.J) {
                        z5 = true;
                    }
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z5 ? c(iOException) : iOException;
    }

    public final Socket k() {
        l connection = this.F;
        Intrinsics.checkNotNull(connection);
        byte[] bArr = ds.b.f7815a;
        ArrayList arrayList = connection.f10237p;
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (Intrinsics.areEqual(((Reference) it.next()).get(), this)) {
                break;
            }
            i7++;
        }
        if (i7 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i7);
        this.F = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        connection.f10238q = System.nanoTime();
        m mVar = this.f10215v;
        ConcurrentLinkedQueue concurrentLinkedQueue = mVar.f10242d;
        fs.b bVar = mVar.f10240b;
        Intrinsics.checkNotNullParameter(connection, "connection");
        byte[] bArr2 = ds.b.f7815a;
        if (!connection.j) {
            bVar.c(mVar.f10241c, 0L);
            return null;
        }
        connection.j = true;
        concurrentLinkedQueue.remove(connection);
        if (concurrentLinkedQueue.isEmpty()) {
            bVar.a();
        }
        Socket socket = connection.f10227d;
        Intrinsics.checkNotNull(socket);
        return socket;
    }

    @Override // okhttp3.Call
    public final boolean y() {
        return this.L;
    }
}
