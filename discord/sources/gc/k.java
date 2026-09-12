package gc;

import com.google.android.exoplayer2.PlaybackParameters;
import java.io.IOException;
import java.net.Socket;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements je.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9732e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f9733i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f9734v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f9735w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f9736x;

    public k(gs.i call, gs.e finder, hs.e codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        cs.o eventListener = cs.o.f7458d;
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f9733i = call;
        this.f9734v = finder;
        this.f9735w = codec;
        this.f9736x = codec.e();
    }

    @Override // je.n
    public long a() {
        if (this.f9731d) {
            return ((io.sentry.android.core.r) this.f9733i).a();
        }
        je.n nVar = (je.n) this.f9736x;
        nVar.getClass();
        return nVar.a();
    }

    @Override // je.n
    public PlaybackParameters b() {
        je.n nVar = (je.n) this.f9736x;
        return nVar != null ? nVar.b() : (PlaybackParameters) ((io.sentry.android.core.r) this.f9733i).f12395w;
    }

    public IOException c(boolean z5, boolean z6, IOException ioe) {
        gs.i call = (gs.i) this.f9733i;
        if (ioe != null) {
            i(ioe);
        }
        if (z6) {
            if (ioe != null) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(ioe, "ioe");
            } else {
                Intrinsics.checkNotNullParameter(call, "call");
            }
        }
        if (z5) {
            if (ioe != null) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(ioe, "ioe");
            } else {
                Intrinsics.checkNotNullParameter(call, "call");
            }
        }
        return call.h(this, z6, z5, ioe);
    }

    @Override // je.n
    public void d(PlaybackParameters playbackParameters) {
        je.n nVar = (je.n) this.f9736x;
        if (nVar != null) {
            nVar.d(playbackParameters);
            playbackParameters = ((je.n) this.f9736x).b();
        }
        ((io.sentry.android.core.r) this.f9733i).d(playbackParameters);
    }

    public gs.c e(Request request, boolean z5) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f9731d = z5;
        RequestBody requestBody = request.f17371d;
        Intrinsics.checkNotNull(requestBody);
        long jContentLength = requestBody.contentLength();
        gs.i call = (gs.i) this.f9733i;
        Intrinsics.checkNotNullParameter(call, "call");
        return new gs.c(this, ((hs.e) this.f9735w).h(request, jContentLength), jContentLength);
    }

    public gs.k f() {
        gs.i iVar = (gs.i) this.f9733i;
        if (iVar.G) {
            throw new IllegalStateException("Check failed.");
        }
        iVar.G = true;
        iVar.f10216w.j();
        gs.l lVarE = ((hs.e) this.f9735w).e();
        lVarE.getClass();
        Intrinsics.checkNotNullParameter(this, "exchange");
        Socket socket = lVarE.f10227d;
        Intrinsics.checkNotNull(socket);
        rs.p pVar = lVarE.f10231h;
        Intrinsics.checkNotNull(pVar);
        rs.o oVar = lVarE.f10232i;
        Intrinsics.checkNotNull(oVar);
        socket.setSoTimeout(0);
        lVarE.k();
        return new gs.k(pVar, oVar, this);
    }

    public hs.h g(Response response) throws IOException {
        hs.e eVar = (hs.e) this.f9735w;
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String strF = response.f("Content-Type", null);
            long jG = eVar.g(response);
            return new hs.h(strF, jG, rs.v.d(new gs.d(this, eVar.c(response), jG)));
        } catch (IOException ioe) {
            gs.i call = (gs.i) this.f9733i;
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(ioe, "ioe");
            i(ioe);
            throw ioe;
        }
    }

    public cs.u h(boolean z5) throws IOException {
        try {
            cs.u uVarD = ((hs.e) this.f9735w).d(z5);
            if (uVarD == null) {
                return uVarD;
            }
            Intrinsics.checkNotNullParameter(this, "deferredTrailers");
            uVarD.f7493m = this;
            return uVarD;
        } catch (IOException ioe) {
            gs.i call = (gs.i) this.f9733i;
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(ioe, "ioe");
            i(ioe);
            throw ioe;
        }
    }

    public void i(IOException iOException) {
        this.f9732e = true;
        ((gs.e) this.f9734v).c(iOException);
        gs.l lVarE = ((hs.e) this.f9735w).e();
        gs.i call = (gs.i) this.f9733i;
        synchronized (lVarE) {
            try {
                Intrinsics.checkNotNullParameter(call, "call");
                if (!(iOException instanceof js.b0)) {
                    if (!(lVarE.f10230g != null) || (iOException instanceof js.a)) {
                        lVarE.j = true;
                        if (lVarE.f10234m == 0) {
                            gs.l.d(call.f10212d, lVarE.f10225b, iOException);
                            lVarE.f10233l++;
                        }
                    }
                } else if (((js.b0) iOException).f14097d == js.b.REFUSED_STREAM) {
                    int i7 = lVarE.f10235n + 1;
                    lVarE.f10235n = i7;
                    if (i7 > 1) {
                        lVarE.j = true;
                        lVarE.f10233l++;
                    }
                } else if (((js.b0) iOException).f14097d != js.b.CANCEL || !call.L) {
                    lVarE.j = true;
                    lVarE.f10233l++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k(e0 e0Var, je.y yVar) {
        this.f9734v = e0Var;
        this.f9733i = new io.sentry.android.core.r(yVar);
        this.f9731d = true;
    }
}
