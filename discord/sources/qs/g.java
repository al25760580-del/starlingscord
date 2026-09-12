package qs;

import com.discord.misc.utilities.logThrottle.LogThrottleSingleton;
import com.facebook.react.devsupport.CxxInspectorPackagerConnection;
import com.reactnativecommunity.webview.RNCWebViewManager;
import cs.t;
import cs.y;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okio.Buffer;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class g implements WebSocket, i {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final List f19082w = c0.c(t.HTTP_1_1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f19083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Random f19084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f19086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f19087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f19088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public gs.i f19089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f19090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j f19091i;
    public k j;
    public final fs.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f19092l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public gs.k f19093m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayDeque f19094n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayDeque f19095o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f19096p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f19097q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f19098r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f19099s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f19100t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f19101u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f19102v;

    public g(fs.c taskRunner, Request originalRequest, y listener, Random random, long j, long j5) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f19083a = listener;
        this.f19084b = random;
        this.f19085c = j;
        this.f19086d = null;
        this.f19087e = j5;
        this.k = taskRunner.e();
        this.f19094n = new ArrayDeque();
        this.f19095o = new ArrayDeque();
        this.f19098r = -1;
        String str = originalRequest.f17369b;
        if (!Intrinsics.areEqual("GET", str)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("Request must be GET: ", str).toString());
        }
        ByteString byteString = ByteString.f17414v;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        Unit unit = Unit.f14616a;
        this.f19088f = io.sentry.hints.j.E(bArr).a();
    }

    @Override // okhttp3.WebSocket
    public final boolean a(ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return j(bytes, 2);
    }

    @Override // okhttp3.WebSocket
    public final boolean b(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ByteString byteString = ByteString.f17414v;
        return j(io.sentry.hints.j.z(text), 1);
    }

    @Override // okhttp3.WebSocket
    public final boolean c(int i7, String str) {
        String strStringPlus;
        synchronized (this) {
            ByteString byteStringZ = null;
            try {
                if (i7 < 1000 || i7 >= 5000) {
                    strStringPlus = Intrinsics.stringPlus("Code must be in range [1000,5000): ", Integer.valueOf(i7));
                } else if ((1004 > i7 || i7 >= 1007) && (1015 > i7 || i7 >= 3000)) {
                    strStringPlus = null;
                } else {
                    strStringPlus = "Code " + i7 + " is reserved and may not be used.";
                }
                if (strStringPlus != null) {
                    Intrinsics.checkNotNull(strStringPlus);
                    throw new IllegalArgumentException(strStringPlus.toString());
                }
                if (str != null) {
                    ByteString byteString = ByteString.f17414v;
                    byteStringZ = io.sentry.hints.j.z(str);
                    if (byteStringZ.f17415d.length > 123) {
                        throw new IllegalArgumentException(Intrinsics.stringPlus("reason.size() > 123: ", str).toString());
                    }
                }
                if (!this.f19100t && !this.f19097q) {
                    this.f19097q = true;
                    this.f19095o.add(new c(byteStringZ, i7));
                    i();
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // okhttp3.WebSocket
    public final synchronized long d() {
        return this.f19096p;
    }

    public final void e(Response response, gc.k kVar) {
        Intrinsics.checkNotNullParameter(response, "response");
        int i7 = response.f17382v;
        if (i7 != 101) {
            StringBuilder sb2 = new StringBuilder("Expected HTTP 101 response but was '");
            sb2.append(i7);
            sb2.append(' ');
            throw new ProtocolException(s0.g.g(sb2, response.f17381i, '\''));
        }
        String strF = response.f("Connection", null);
        if (!"Upgrade".equalsIgnoreCase(strF)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + ((Object) strF) + '\'');
        }
        String strF2 = response.f("Upgrade", null);
        if (!"websocket".equalsIgnoreCase(strF2)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + ((Object) strF2) + '\'');
        }
        String strF3 = response.f("Sec-WebSocket-Accept", null);
        ByteString byteString = ByteString.f17414v;
        String strA = io.sentry.hints.j.z(Intrinsics.stringPlus(this.f19088f, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")).b("SHA-1").a();
        if (Intrinsics.areEqual(strA, strF3)) {
            if (kVar == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA + "' but was '" + ((Object) strF3) + '\'');
    }

    public final void f(Exception e10, Response response) {
        Intrinsics.checkNotNullParameter(e10, "e");
        synchronized (this) {
            if (this.f19100t) {
                return;
            }
            this.f19100t = true;
            gs.k kVar = this.f19093m;
            this.f19093m = null;
            j jVar = this.f19091i;
            this.f19091i = null;
            k kVar2 = this.j;
            this.j = null;
            this.k.f();
            Unit unit = Unit.f14616a;
            try {
                this.f19083a.onFailure(this, e10, response);
            } finally {
                if (kVar != null) {
                    ds.b.c(kVar);
                }
                if (jVar != null) {
                    ds.b.c(jVar);
                }
                if (kVar2 != null) {
                    ds.b.c(kVar2);
                }
            }
        }
    }

    public final void g(String name, gs.k streams) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(streams, "streams");
        h hVar = this.f19086d;
        Intrinsics.checkNotNull(hVar);
        synchronized (this) {
            try {
                this.f19092l = name;
                this.f19093m = streams;
                this.j = new k(streams.f10221e, this.f19084b, hVar.f19103a, hVar.f19105c, this.f19087e);
                this.f19090h = new e(this);
                long j = this.f19085c;
                if (j != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                    this.k.c(new f(Intrinsics.stringPlus(name, " ping"), this, nanos), nanos);
                }
                if (!this.f19095o.isEmpty()) {
                    i();
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f19091i = new j(streams.f10220d, this, hVar.f19103a, hVar.f19107e);
    }

    public final void h() {
        while (this.f19098r == -1) {
            j jVar = this.f19091i;
            Intrinsics.checkNotNull(jVar);
            jVar.f();
            if (jVar.F) {
                jVar.c();
            } else {
                i iVar = jVar.f19110e;
                Buffer buffer = jVar.I;
                int i7 = jVar.f19114x;
                if (i7 != 1 && i7 != 2) {
                    byte[] bArr = ds.b.f7815a;
                    String hexString = Integer.toHexString(i7);
                    Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
                    throw new ProtocolException(Intrinsics.stringPlus("Unknown opcode: ", hexString));
                }
                while (true) {
                    if (jVar.f19113w) {
                        throw new IOException("closed");
                    }
                    long j = jVar.f19115y;
                    if (j > 0) {
                        jVar.f19109d.v(buffer, j);
                    }
                    if (jVar.E) {
                        if (jVar.G) {
                            a aVar = jVar.J;
                            if (aVar == null) {
                                aVar = new a(jVar.f19112v, 1);
                                jVar.J = aVar;
                            }
                            Inflater inflater = (Inflater) aVar.f19071v;
                            Intrinsics.checkNotNullParameter(buffer, "buffer");
                            Buffer buffer2 = aVar.f19070i;
                            if (buffer2.f17413e != 0) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            if (aVar.f19069e) {
                                inflater.reset();
                            }
                            buffer2.J(buffer);
                            buffer2.c0(65535);
                            long bytesRead = inflater.getBytesRead() + buffer2.f17413e;
                            do {
                                ((rs.k) aVar.f19072w).c(buffer, LongCompanionObject.MAX_VALUE);
                            } while (inflater.getBytesRead() < bytesRead);
                        }
                        if (i7 != 1) {
                            ByteString bytes = buffer.m(buffer.f17413e);
                            g gVar = (g) iVar;
                            gVar.getClass();
                            Intrinsics.checkNotNullParameter(bytes, "bytes");
                            gVar.f19083a.onMessage(gVar, bytes);
                            break;
                        }
                        String text = buffer.V();
                        g gVar2 = (g) iVar;
                        gVar2.getClass();
                        Intrinsics.checkNotNullParameter(text, "text");
                        gVar2.f19083a.onMessage(gVar2, text);
                        break;
                    }
                    while (!jVar.f19113w) {
                        jVar.f();
                        if (!jVar.F) {
                            break;
                        } else {
                            jVar.c();
                        }
                    }
                    if (jVar.f19114x != 0) {
                        int i10 = jVar.f19114x;
                        byte[] bArr2 = ds.b.f7815a;
                        String hexString2 = Integer.toHexString(i10);
                        Intrinsics.checkNotNullExpressionValue(hexString2, "toHexString(this)");
                        throw new ProtocolException(Intrinsics.stringPlus("Expected continuation opcode. Got: ", hexString2));
                    }
                }
            }
        }
    }

    public final void i() {
        byte[] bArr = ds.b.f7815a;
        e eVar = this.f19090h;
        if (eVar != null) {
            this.k.c(eVar, 0L);
        }
    }

    public final synchronized boolean j(ByteString byteString, int i7) {
        if (!this.f19100t && !this.f19097q) {
            if (this.f19096p + ((long) byteString.c()) > CxxInspectorPackagerConnection.MAX_QUEUE_SIZE) {
                c(RNCWebViewManager.COMMAND_CLEAR_CACHE, null);
                return false;
            }
            this.f19096p += (long) byteString.c();
            this.f19095o.add(new d(byteString, i7));
            i();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x006b A[Catch: all -> 0x007f, TRY_ENTER, TryCatch #3 {all -> 0x007f, blocks: (B:29:0x006b, B:32:0x0082, B:34:0x0086, B:35:0x0092, B:37:0x009f, B:40:0x00a3, B:41:0x00a4, B:42:0x00a5, B:44:0x00a9, B:74:0x011d, B:76:0x0121, B:88:0x013d, B:89:0x013f, B:62:0x00d7, B:66:0x00f8, B:67:0x0104, B:63:0x00eb, B:68:0x0105, B:70:0x010f, B:71:0x0112, B:90:0x0140, B:91:0x0145, B:36:0x0093, B:73:0x011a), top: B:110:0x0069, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0082 A[Catch: all -> 0x007f, TryCatch #3 {all -> 0x007f, blocks: (B:29:0x006b, B:32:0x0082, B:34:0x0086, B:35:0x0092, B:37:0x009f, B:40:0x00a3, B:41:0x00a4, B:42:0x00a5, B:44:0x00a9, B:74:0x011d, B:76:0x0121, B:88:0x013d, B:89:0x013f, B:62:0x00d7, B:66:0x00f8, B:67:0x0104, B:63:0x00eb, B:68:0x0105, B:70:0x010f, B:71:0x0112, B:90:0x0140, B:91:0x0145, B:36:0x0093, B:73:0x011a), top: B:110:0x0069, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[Catch: all -> 0x007f, TryCatch #3 {all -> 0x007f, blocks: (B:29:0x006b, B:32:0x0082, B:34:0x0086, B:35:0x0092, B:37:0x009f, B:40:0x00a3, B:41:0x00a4, B:42:0x00a5, B:44:0x00a9, B:74:0x011d, B:76:0x0121, B:88:0x013d, B:89:0x013f, B:62:0x00d7, B:66:0x00f8, B:67:0x0104, B:63:0x00eb, B:68:0x0105, B:70:0x010f, B:71:0x0112, B:90:0x0140, B:91:0x0145, B:36:0x0093, B:73:0x011a), top: B:110:0x0069, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a5 A[Catch: all -> 0x007f, TryCatch #3 {all -> 0x007f, blocks: (B:29:0x006b, B:32:0x0082, B:34:0x0086, B:35:0x0092, B:37:0x009f, B:40:0x00a3, B:41:0x00a4, B:42:0x00a5, B:44:0x00a9, B:74:0x011d, B:76:0x0121, B:88:0x013d, B:89:0x013f, B:62:0x00d7, B:66:0x00f8, B:67:0x0104, B:63:0x00eb, B:68:0x0105, B:70:0x010f, B:71:0x0112, B:90:0x0140, B:91:0x0145, B:36:0x0093, B:73:0x011a), top: B:110:0x0069, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9 A[Catch: all -> 0x007f, TryCatch #3 {all -> 0x007f, blocks: (B:29:0x006b, B:32:0x0082, B:34:0x0086, B:35:0x0092, B:37:0x009f, B:40:0x00a3, B:41:0x00a4, B:42:0x00a5, B:44:0x00a9, B:74:0x011d, B:76:0x0121, B:88:0x013d, B:89:0x013f, B:62:0x00d7, B:66:0x00f8, B:67:0x0104, B:63:0x00eb, B:68:0x0105, B:70:0x010f, B:71:0x0112, B:90:0x0140, B:91:0x0145, B:36:0x0093, B:73:0x011a), top: B:110:0x0069, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00eb A[Catch: all -> 0x007f, TryCatch #3 {all -> 0x007f, blocks: (B:29:0x006b, B:32:0x0082, B:34:0x0086, B:35:0x0092, B:37:0x009f, B:40:0x00a3, B:41:0x00a4, B:42:0x00a5, B:44:0x00a9, B:74:0x011d, B:76:0x0121, B:88:0x013d, B:89:0x013f, B:62:0x00d7, B:66:0x00f8, B:67:0x0104, B:63:0x00eb, B:68:0x0105, B:70:0x010f, B:71:0x0112, B:90:0x0140, B:91:0x0145, B:36:0x0093, B:73:0x011a), top: B:110:0x0069, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f8 A[Catch: all -> 0x007f, TryCatch #3 {all -> 0x007f, blocks: (B:29:0x006b, B:32:0x0082, B:34:0x0086, B:35:0x0092, B:37:0x009f, B:40:0x00a3, B:41:0x00a4, B:42:0x00a5, B:44:0x00a9, B:74:0x011d, B:76:0x0121, B:88:0x013d, B:89:0x013f, B:62:0x00d7, B:66:0x00f8, B:67:0x0104, B:63:0x00eb, B:68:0x0105, B:70:0x010f, B:71:0x0112, B:90:0x0140, B:91:0x0145, B:36:0x0093, B:73:0x011a), top: B:110:0x0069, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x010f A[Catch: all -> 0x007f, TryCatch #3 {all -> 0x007f, blocks: (B:29:0x006b, B:32:0x0082, B:34:0x0086, B:35:0x0092, B:37:0x009f, B:40:0x00a3, B:41:0x00a4, B:42:0x00a5, B:44:0x00a9, B:74:0x011d, B:76:0x0121, B:88:0x013d, B:89:0x013f, B:62:0x00d7, B:66:0x00f8, B:67:0x0104, B:63:0x00eb, B:68:0x0105, B:70:0x010f, B:71:0x0112, B:90:0x0140, B:91:0x0145, B:36:0x0093, B:73:0x011a), top: B:110:0x0069, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0121 A[Catch: all -> 0x007f, TRY_LEAVE, TryCatch #3 {all -> 0x007f, blocks: (B:29:0x006b, B:32:0x0082, B:34:0x0086, B:35:0x0092, B:37:0x009f, B:40:0x00a3, B:41:0x00a4, B:42:0x00a5, B:44:0x00a9, B:74:0x011d, B:76:0x0121, B:88:0x013d, B:89:0x013f, B:62:0x00d7, B:66:0x00f8, B:67:0x0104, B:63:0x00eb, B:68:0x0105, B:70:0x010f, B:71:0x0112, B:90:0x0140, B:91:0x0145, B:36:0x0093, B:73:0x011a), top: B:110:0x0069, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x012c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0132  */
    /* JADX WARN: Code duplicated, block: B:84:0x0137 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x0138  */
    /* JADX WARN: Code duplicated, block: B:90:0x0140 A[Catch: all -> 0x007f, TryCatch #3 {all -> 0x007f, blocks: (B:29:0x006b, B:32:0x0082, B:34:0x0086, B:35:0x0092, B:37:0x009f, B:40:0x00a3, B:41:0x00a4, B:42:0x00a5, B:44:0x00a9, B:74:0x011d, B:76:0x0121, B:88:0x013d, B:89:0x013f, B:62:0x00d7, B:66:0x00f8, B:67:0x0104, B:63:0x00eb, B:68:0x0105, B:70:0x010f, B:71:0x0112, B:90:0x0140, B:91:0x0145, B:36:0x0093, B:73:0x011a), top: B:110:0x0069, inners: #0, #2 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public final boolean k() {
        Object objPoll;
        String str;
        int i7;
        ?? r5;
        ?? r10;
        ?? r7;
        int i10;
        ByteString byteString;
        ByteString byteStringM;
        Buffer buffer;
        d dVar;
        synchronized (this) {
            try {
                if (this.f19100t) {
                    return false;
                }
                k kVar = this.j;
                Object objPoll2 = this.f19094n.poll();
                String strStringPlus = null;
                try {
                    if (objPoll2 == null) {
                        objPoll = this.f19095o.poll();
                        if (objPoll instanceof c) {
                            i7 = this.f19098r;
                            str = this.f19099s;
                            if (i7 != -1) {
                                gs.k kVar2 = this.f19093m;
                                this.f19093m = null;
                                j jVar = this.f19091i;
                                this.f19091i = null;
                                k kVar3 = this.j;
                                this.j = null;
                                this.k.f();
                                r5 = kVar2;
                                r7 = jVar;
                                r10 = kVar3;
                            } else {
                                this.k.c(new e(Intrinsics.stringPlus(this.f19092l, " cancel"), this), TimeUnit.MILLISECONDS.toNanos(LogThrottleSingleton.RATE_LIMIT_ONE_MINUTE));
                                r5 = 0;
                                r7 = 0;
                                r10 = 0;
                            }
                        } else {
                            if (objPoll == null) {
                                return false;
                            }
                            str = null;
                        }
                        Unit unit = Unit.f14616a;
                        if (objPoll2 != null) {
                            Intrinsics.checkNotNull(kVar);
                            ByteString payload = (ByteString) objPoll2;
                            kVar.getClass();
                            Intrinsics.checkNotNullParameter(payload, "payload");
                            kVar.c(payload, 10);
                        } else if (objPoll instanceof d) {
                            dVar = (d) objPoll;
                            Intrinsics.checkNotNull(kVar);
                            kVar.f(dVar.f19077b, dVar.f19076a);
                            synchronized (this) {
                                this.f19096p -= (long) dVar.f19077b.c();
                            }
                        } else {
                            if (objPoll instanceof c) {
                                throw new AssertionError();
                            }
                            c cVar = (c) objPoll;
                            Intrinsics.checkNotNull(kVar);
                            i10 = cVar.f19074a;
                            byteString = cVar.f19075b;
                            kVar.getClass();
                            byteStringM = ByteString.f17414v;
                            if (i10 == 0 || byteString != null) {
                                if (i10 != 0) {
                                    if (i10 >= 1000 || i10 >= 5000) {
                                        strStringPlus = Intrinsics.stringPlus("Code must be in range [1000,5000): ", Integer.valueOf(i10));
                                    } else if ((1004 <= i10 && i10 < 1007) || (1015 <= i10 && i10 < 3000)) {
                                        strStringPlus = "Code " + i10 + " is reserved and may not be used.";
                                    }
                                    if (strStringPlus != null) {
                                        Intrinsics.checkNotNull(strStringPlus);
                                        throw new IllegalArgumentException(strStringPlus.toString());
                                    }
                                }
                                buffer = new Buffer();
                                buffer.e0(i10);
                                if (byteString != null) {
                                    buffer.T(byteString);
                                }
                                byteStringM = buffer.m(buffer.f17413e);
                            }
                            try {
                                kVar.c(byteStringM, 8);
                                kVar.E = true;
                                if (r5 != 0) {
                                    y yVar = this.f19083a;
                                    Intrinsics.checkNotNull(str);
                                    yVar.onClosed(this, i7, str);
                                }
                            } catch (Throwable th2) {
                                kVar.E = true;
                                throw th2;
                            }
                        }
                        if (r5 != 0) {
                            ds.b.c(r5);
                        }
                        if (r7 != 0) {
                            ds.b.c(r7);
                        }
                        if (r10 == 0) {
                            return true;
                        }
                        ds.b.c(r10);
                        return true;
                    }
                    objPoll = null;
                    str = null;
                    if (objPoll2 != null) {
                        Intrinsics.checkNotNull(kVar);
                        ByteString payload2 = (ByteString) objPoll2;
                        kVar.getClass();
                        Intrinsics.checkNotNullParameter(payload2, "payload");
                        kVar.c(payload2, 10);
                    } else if (objPoll instanceof d) {
                        dVar = (d) objPoll;
                        Intrinsics.checkNotNull(kVar);
                        kVar.f(dVar.f19077b, dVar.f19076a);
                        synchronized (this) {
                            this.f19096p -= (long) dVar.f19077b.c();
                        }
                    } else {
                        if (objPoll instanceof c) {
                            throw new AssertionError();
                        }
                        c cVar2 = (c) objPoll;
                        Intrinsics.checkNotNull(kVar);
                        i10 = cVar2.f19074a;
                        byteString = cVar2.f19075b;
                        kVar.getClass();
                        byteStringM = ByteString.f17414v;
                        if (i10 == 0) {
                            if (i10 != 0) {
                                if (i10 >= 1000) {
                                    strStringPlus = Intrinsics.stringPlus("Code must be in range [1000,5000): ", Integer.valueOf(i10));
                                } else {
                                    strStringPlus = Intrinsics.stringPlus("Code must be in range [1000,5000): ", Integer.valueOf(i10));
                                }
                                if (strStringPlus != null) {
                                    Intrinsics.checkNotNull(strStringPlus);
                                    throw new IllegalArgumentException(strStringPlus.toString());
                                }
                            }
                            buffer = new Buffer();
                            buffer.e0(i10);
                            if (byteString != null) {
                                buffer.T(byteString);
                            }
                            byteStringM = buffer.m(buffer.f17413e);
                        } else {
                            if (i10 != 0) {
                                if (i10 >= 1000) {
                                    strStringPlus = Intrinsics.stringPlus("Code must be in range [1000,5000): ", Integer.valueOf(i10));
                                } else {
                                    strStringPlus = Intrinsics.stringPlus("Code must be in range [1000,5000): ", Integer.valueOf(i10));
                                }
                                if (strStringPlus != null) {
                                    Intrinsics.checkNotNull(strStringPlus);
                                    throw new IllegalArgumentException(strStringPlus.toString());
                                }
                            }
                            buffer = new Buffer();
                            buffer.e0(i10);
                            if (byteString != null) {
                                buffer.T(byteString);
                            }
                            byteStringM = buffer.m(buffer.f17413e);
                        }
                        kVar.c(byteStringM, 8);
                        kVar.E = true;
                        if (r5 != 0) {
                            y yVar2 = this.f19083a;
                            Intrinsics.checkNotNull(str);
                            yVar2.onClosed(this, i7, str);
                        }
                    }
                    if (r5 != 0) {
                        ds.b.c(r5);
                    }
                    if (r7 != 0) {
                        ds.b.c(r7);
                    }
                    if (r10 == 0) {
                        return true;
                    }
                    ds.b.c(r10);
                    return true;
                } catch (Throwable th3) {
                    if (r5 != 0) {
                        ds.b.c(r5);
                    }
                    if (r7 != 0) {
                        ds.b.c(r7);
                    }
                    if (r10 != 0) {
                        ds.b.c(r10);
                    }
                    throw th3;
                }
                String str2 = str;
                String str3 = str2;
                i7 = -1;
                r5 = str3;
                r7 = str2;
                r10 = str3;
                Unit unit2 = Unit.f14616a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
