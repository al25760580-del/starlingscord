package gs;

import a5.b0;
import cs.w;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f10198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cs.a f10199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f10200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0 f10201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f10202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public w f10206i;

    public e(m connectionPool, cs.a address, i call) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        cs.o eventListener = cs.o.f7458d;
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f10198a = connectionPool;
        this.f10199b = address;
        this.f10200c = call;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0281  */
    /* JADX WARN: Code duplicated, block: B:115:0x029c  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:118:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:120:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:129:0x030c  */
    /* JADX WARN: Code duplicated, block: B:130:0x032b  */
    /* JADX WARN: Code duplicated, block: B:171:0x02f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x032c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x03a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x03a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x039a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:34:0x007f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:38:0x008b  */
    /* JADX WARN: Code duplicated, block: B:40:0x008f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0098  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:71:0x016d  */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, java.util.List] */
    public final l a(int i7, int i10, int i11, boolean z5, boolean z6) throws IOException {
        w route;
        b0 b0Var;
        o oVar;
        ArrayList arrayList;
        b0 b0Var2;
        cs.a aVar;
        Proxy proxy;
        String domainName;
        int port;
        List listC;
        boolean zContains;
        b0 b0Var3;
        l connection;
        ue.i iVar;
        Socket socketK;
        while (!this.f10200c.L) {
            l connection2 = this.f10200c.F;
            if (connection2 != null) {
                synchronized (connection2) {
                    try {
                        socketK = (connection2.j || !b(connection2.f10225b.f7498a.f7404h)) ? this.f10200c.k() : null;
                        Unit unit = Unit.f14616a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (this.f10200c.F == null) {
                    if (socketK != null) {
                        ds.b.d(socketK);
                    }
                    Intrinsics.checkNotNullParameter(this.f10200c, "call");
                    Intrinsics.checkNotNullParameter(connection2, "connection");
                    this.f10203f = 0;
                    this.f10204g = 0;
                    this.f10205h = 0;
                    if (this.f10198a.a(this.f10199b, this.f10200c, null, false)) {
                        connection2 = this.f10200c.F;
                        Intrinsics.checkNotNull(connection2);
                        Intrinsics.checkNotNullParameter(this.f10200c, "call");
                        Intrinsics.checkNotNullParameter(connection2, "connection");
                    } else {
                        route = this.f10206i;
                        try {
                            if (route != null) {
                                Intrinsics.checkNotNull(route);
                                this.f10206i = null;
                            } else {
                                b0Var = this.f10201d;
                                if (b0Var != null) {
                                    Intrinsics.checkNotNull(b0Var);
                                    if (b0Var.s()) {
                                        b0Var3 = this.f10201d;
                                        Intrinsics.checkNotNull(b0Var3);
                                        if (b0Var3.s()) {
                                            throw new NoSuchElementException();
                                        }
                                        ArrayList arrayList2 = (ArrayList) b0Var3.f174i;
                                        int i12 = b0Var3.f173e;
                                        b0Var3.f173e = i12 + 1;
                                        route = (w) arrayList2.get(i12);
                                    }
                                }
                                oVar = this.f10202e;
                                if (oVar == null) {
                                    cs.a aVar2 = this.f10199b;
                                    i iVar2 = this.f10200c;
                                    oVar = new o(aVar2, iVar2.f10212d.Y, iVar2);
                                    this.f10202e = oVar;
                                }
                                if (oVar.k()) {
                                    throw new NoSuchElementException();
                                }
                                arrayList = new ArrayList();
                                while (oVar.f10246b < ((List) oVar.f10250f).size()) {
                                    aVar = (cs.a) oVar.f10247c;
                                    if (oVar.f10246b < ((List) oVar.f10250f).size()) {
                                        throw new SocketException("No route to " + aVar.f7404h.f17323d + "; exhausted proxy configurations: " + ((List) oVar.f10250f));
                                    }
                                    List list = (List) oVar.f10250f;
                                    int i13 = oVar.f10246b;
                                    oVar.f10246b = i13 + 1;
                                    proxy = (Proxy) list.get(i13);
                                    Call call = (Call) oVar.f10249e;
                                    ArrayList arrayList3 = new ArrayList();
                                    oVar.f10251g = arrayList3;
                                    if (proxy.type() != Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                        HttpUrl httpUrl = aVar.f7404h;
                                        domainName = httpUrl.f17323d;
                                        port = httpUrl.f17324e;
                                    } else {
                                        SocketAddress proxyAddress = proxy.address();
                                        if (!(proxyAddress instanceof InetSocketAddress)) {
                                            throw new IllegalArgumentException(Intrinsics.stringPlus("Proxy.address() is not an InetSocketAddress: ", proxyAddress.getClass()).toString());
                                        }
                                        Intrinsics.checkNotNullExpressionValue(proxyAddress, "proxyAddress");
                                        InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
                                        Intrinsics.checkNotNullParameter(inetSocketAddress, "<this>");
                                        InetAddress address = inetSocketAddress.getAddress();
                                        if (address == null) {
                                            domainName = inetSocketAddress.getHostName();
                                            Intrinsics.checkNotNullExpressionValue(domainName, "hostName");
                                        } else {
                                            domainName = address.getHostAddress();
                                            Intrinsics.checkNotNullExpressionValue(domainName, "address.hostAddress");
                                        }
                                        port = inetSocketAddress.getPort();
                                    }
                                    if (1 <= port || port >= 65536) {
                                        throw new SocketException("No route to " + domainName + ':' + port + "; port is out of range");
                                    }
                                    if (proxy.type() == Proxy.Type.SOCKS) {
                                        arrayList3.add(InetSocketAddress.createUnresolved(domainName, port));
                                    } else {
                                        byte[] bArr = ds.b.f7815a;
                                        Intrinsics.checkNotNullParameter(domainName, "<this>");
                                        if (ds.b.f7820f.d(domainName)) {
                                            listC = c0.c(InetAddress.getByName(domainName));
                                        } else {
                                            Intrinsics.checkNotNullParameter(call, "call");
                                            Intrinsics.checkNotNullParameter(domainName, "domainName");
                                            List inetAddressList = aVar.f7397a.lookup(domainName);
                                            if (inetAddressList.isEmpty()) {
                                                throw new UnknownHostException(aVar.f7397a + " returned no addresses for " + domainName);
                                            }
                                            Intrinsics.checkNotNullParameter(call, "call");
                                            Intrinsics.checkNotNullParameter(domainName, "domainName");
                                            Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
                                            listC = inetAddressList;
                                        }
                                        Iterator it = listC.iterator();
                                        while (it.hasNext()) {
                                            arrayList3.add(new InetSocketAddress((InetAddress) it.next(), port));
                                        }
                                    }
                                    Iterator it2 = oVar.f10251g.iterator();
                                    while (it2.hasNext()) {
                                        w route2 = new w((cs.a) oVar.f10247c, proxy, (InetSocketAddress) it2.next());
                                        ue.i iVar3 = (ue.i) oVar.f10248d;
                                        synchronized (iVar3) {
                                            Intrinsics.checkNotNullParameter(route2, "route");
                                            zContains = ((LinkedHashSet) iVar3.f21117d).contains(route2);
                                        }
                                        if (zContains) {
                                            ((ArrayList) oVar.f10252h).add(route2);
                                        } else {
                                            arrayList.add(route2);
                                        }
                                    }
                                    if (!arrayList.isEmpty()) {
                                        break;
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    i0.o(arrayList, (ArrayList) oVar.f10252h);
                                    ((ArrayList) oVar.f10252h).clear();
                                }
                                b0Var2 = new b0(arrayList);
                                this.f10201d = b0Var2;
                                if (!this.f10200c.L) {
                                    throw new IOException("Canceled");
                                }
                                if (this.f10198a.a(this.f10199b, this.f10200c, arrayList, false)) {
                                    connection2 = this.f10200c.F;
                                    Intrinsics.checkNotNull(connection2);
                                    Intrinsics.checkNotNullParameter(this.f10200c, "call");
                                    Intrinsics.checkNotNullParameter(connection2, "connection");
                                } else {
                                    if (b0Var2.s()) {
                                        throw new NoSuchElementException();
                                    }
                                    int i14 = b0Var2.f173e;
                                    b0Var2.f173e = i14 + 1;
                                    route = (w) arrayList.get(i14);
                                    connection = new l(this.f10198a, route);
                                    this.f10200c.N = connection;
                                    connection.c(i7, i10, i11, z5, this.f10200c);
                                    this.f10200c.N = null;
                                    iVar = this.f10200c.f10212d.Y;
                                    synchronized (iVar) {
                                        Intrinsics.checkNotNullParameter(route, "route");
                                        ((LinkedHashSet) iVar.f21117d).remove(route);
                                    }
                                    if (this.f10198a.a(this.f10199b, this.f10200c, arrayList, true)) {
                                        connection2 = this.f10200c.F;
                                        Intrinsics.checkNotNull(connection2);
                                        this.f10206i = route;
                                        Socket socket = connection.f10227d;
                                        Intrinsics.checkNotNull(socket);
                                        ds.b.d(socket);
                                        Intrinsics.checkNotNullParameter(this.f10200c, "call");
                                        Intrinsics.checkNotNullParameter(connection2, "connection");
                                    } else {
                                        synchronized (connection) {
                                            m mVar = this.f10198a;
                                            mVar.getClass();
                                            Intrinsics.checkNotNullParameter(connection, "connection");
                                            byte[] bArr2 = ds.b.f7815a;
                                            mVar.f10242d.add(connection);
                                            mVar.f10240b.c(mVar.f10241c, 0L);
                                            this.f10200c.b(connection);
                                            Unit unit2 = Unit.f14616a;
                                        }
                                        Intrinsics.checkNotNullParameter(this.f10200c, "call");
                                        Intrinsics.checkNotNullParameter(connection, "connection");
                                        connection2 = connection;
                                    }
                                }
                            }
                            connection.c(i7, i10, i11, z5, this.f10200c);
                            this.f10200c.N = null;
                            iVar = this.f10200c.f10212d.Y;
                            synchronized (iVar) {
                                Intrinsics.checkNotNullParameter(route, "route");
                                ((LinkedHashSet) iVar.f21117d).remove(route);
                                if (this.f10198a.a(this.f10199b, this.f10200c, arrayList, true)) {
                                    connection2 = this.f10200c.F;
                                    Intrinsics.checkNotNull(connection2);
                                    this.f10206i = route;
                                    Socket socket2 = connection.f10227d;
                                    Intrinsics.checkNotNull(socket2);
                                    ds.b.d(socket2);
                                    Intrinsics.checkNotNullParameter(this.f10200c, "call");
                                    Intrinsics.checkNotNullParameter(connection2, "connection");
                                } else {
                                    synchronized (connection) {
                                        m mVar2 = this.f10198a;
                                        mVar2.getClass();
                                        Intrinsics.checkNotNullParameter(connection, "connection");
                                        byte[] bArr3 = ds.b.f7815a;
                                        mVar2.f10242d.add(connection);
                                        mVar2.f10240b.c(mVar2.f10241c, 0L);
                                        this.f10200c.b(connection);
                                        Unit unit3 = Unit.f14616a;
                                        Intrinsics.checkNotNullParameter(this.f10200c, "call");
                                        Intrinsics.checkNotNullParameter(connection, "connection");
                                        connection2 = connection;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            this.f10200c.N = null;
                            throw th3;
                        }
                        arrayList = null;
                        connection = new l(this.f10198a, route);
                        this.f10200c.N = connection;
                    }
                } else if (socketK != null) {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                this.f10203f = 0;
                this.f10204g = 0;
                this.f10205h = 0;
                if (this.f10198a.a(this.f10199b, this.f10200c, null, false)) {
                    connection2 = this.f10200c.F;
                    Intrinsics.checkNotNull(connection2);
                    Intrinsics.checkNotNullParameter(this.f10200c, "call");
                    Intrinsics.checkNotNullParameter(connection2, "connection");
                } else {
                    route = this.f10206i;
                    if (route != null) {
                        Intrinsics.checkNotNull(route);
                        this.f10206i = null;
                    } else {
                        b0Var = this.f10201d;
                        if (b0Var != null) {
                            Intrinsics.checkNotNull(b0Var);
                            if (b0Var.s()) {
                                b0Var3 = this.f10201d;
                                Intrinsics.checkNotNull(b0Var3);
                                if (b0Var3.s()) {
                                    throw new NoSuchElementException();
                                }
                                ArrayList arrayList4 = (ArrayList) b0Var3.f174i;
                                int i15 = b0Var3.f173e;
                                b0Var3.f173e = i15 + 1;
                                route = (w) arrayList4.get(i15);
                            }
                        }
                        oVar = this.f10202e;
                        if (oVar == null) {
                            cs.a aVar3 = this.f10199b;
                            i iVar4 = this.f10200c;
                            oVar = new o(aVar3, iVar4.f10212d.Y, iVar4);
                            this.f10202e = oVar;
                        }
                        if (oVar.k()) {
                            throw new NoSuchElementException();
                        }
                        arrayList = new ArrayList();
                        while (oVar.f10246b < ((List) oVar.f10250f).size()) {
                            aVar = (cs.a) oVar.f10247c;
                            if (oVar.f10246b < ((List) oVar.f10250f).size()) {
                                throw new SocketException("No route to " + aVar.f7404h.f17323d + "; exhausted proxy configurations: " + ((List) oVar.f10250f));
                            }
                            List list2 = (List) oVar.f10250f;
                            int i16 = oVar.f10246b;
                            oVar.f10246b = i16 + 1;
                            proxy = (Proxy) list2.get(i16);
                            Call call2 = (Call) oVar.f10249e;
                            ArrayList arrayList5 = new ArrayList();
                            oVar.f10251g = arrayList5;
                            if (proxy.type() != Proxy.Type.DIRECT) {
                                HttpUrl httpUrl2 = aVar.f7404h;
                                domainName = httpUrl2.f17323d;
                                port = httpUrl2.f17324e;
                            } else {
                                HttpUrl httpUrl3 = aVar.f7404h;
                                domainName = httpUrl3.f17323d;
                                port = httpUrl3.f17324e;
                            }
                            if (1 <= port) {
                            }
                            throw new SocketException("No route to " + domainName + ':' + port + "; port is out of range");
                        }
                        if (arrayList.isEmpty()) {
                            i0.o(arrayList, (ArrayList) oVar.f10252h);
                            ((ArrayList) oVar.f10252h).clear();
                        }
                        b0Var2 = new b0(arrayList);
                        this.f10201d = b0Var2;
                        if (!this.f10200c.L) {
                            throw new IOException("Canceled");
                        }
                        if (this.f10198a.a(this.f10199b, this.f10200c, arrayList, false)) {
                            connection2 = this.f10200c.F;
                            Intrinsics.checkNotNull(connection2);
                            Intrinsics.checkNotNullParameter(this.f10200c, "call");
                            Intrinsics.checkNotNullParameter(connection2, "connection");
                        } else {
                            if (b0Var2.s()) {
                                throw new NoSuchElementException();
                            }
                            int i17 = b0Var2.f173e;
                            b0Var2.f173e = i17 + 1;
                            route = (w) arrayList.get(i17);
                            connection = new l(this.f10198a, route);
                            this.f10200c.N = connection;
                            connection.c(i7, i10, i11, z5, this.f10200c);
                            this.f10200c.N = null;
                            iVar = this.f10200c.f10212d.Y;
                            synchronized (iVar) {
                                Intrinsics.checkNotNullParameter(route, "route");
                                ((LinkedHashSet) iVar.f21117d).remove(route);
                                if (this.f10198a.a(this.f10199b, this.f10200c, arrayList, true)) {
                                    connection2 = this.f10200c.F;
                                    Intrinsics.checkNotNull(connection2);
                                    this.f10206i = route;
                                    Socket socket3 = connection.f10227d;
                                    Intrinsics.checkNotNull(socket3);
                                    ds.b.d(socket3);
                                    Intrinsics.checkNotNullParameter(this.f10200c, "call");
                                    Intrinsics.checkNotNullParameter(connection2, "connection");
                                } else {
                                    synchronized (connection) {
                                        m mVar3 = this.f10198a;
                                        mVar3.getClass();
                                        Intrinsics.checkNotNullParameter(connection, "connection");
                                        byte[] bArr4 = ds.b.f7815a;
                                        mVar3.f10242d.add(connection);
                                        mVar3.f10240b.c(mVar3.f10241c, 0L);
                                        this.f10200c.b(connection);
                                        Unit unit4 = Unit.f14616a;
                                        Intrinsics.checkNotNullParameter(this.f10200c, "call");
                                        Intrinsics.checkNotNullParameter(connection, "connection");
                                        connection2 = connection;
                                    }
                                }
                            }
                        }
                    }
                    arrayList = null;
                    connection = new l(this.f10198a, route);
                    this.f10200c.N = connection;
                    connection.c(i7, i10, i11, z5, this.f10200c);
                    this.f10200c.N = null;
                    iVar = this.f10200c.f10212d.Y;
                    synchronized (iVar) {
                        Intrinsics.checkNotNullParameter(route, "route");
                        ((LinkedHashSet) iVar.f21117d).remove(route);
                        if (this.f10198a.a(this.f10199b, this.f10200c, arrayList, true)) {
                            connection2 = this.f10200c.F;
                            Intrinsics.checkNotNull(connection2);
                            this.f10206i = route;
                            Socket socket4 = connection.f10227d;
                            Intrinsics.checkNotNull(socket4);
                            ds.b.d(socket4);
                            Intrinsics.checkNotNullParameter(this.f10200c, "call");
                            Intrinsics.checkNotNullParameter(connection2, "connection");
                        } else {
                            synchronized (connection) {
                                m mVar4 = this.f10198a;
                                mVar4.getClass();
                                Intrinsics.checkNotNullParameter(connection, "connection");
                                byte[] bArr5 = ds.b.f7815a;
                                mVar4.f10242d.add(connection);
                                mVar4.f10240b.c(mVar4.f10241c, 0L);
                                this.f10200c.b(connection);
                                Unit unit5 = Unit.f14616a;
                                Intrinsics.checkNotNullParameter(this.f10200c, "call");
                                Intrinsics.checkNotNullParameter(connection, "connection");
                                connection2 = connection;
                            }
                        }
                    }
                }
            }
            if (connection2.i(z6)) {
                return connection2;
            }
            connection2.k();
            if (this.f10206i == null) {
                b0 b0Var4 = this.f10201d;
                if (b0Var4 == null ? true : b0Var4.s()) {
                    continue;
                } else {
                    o oVar2 = this.f10202e;
                    if (!(oVar2 != null ? oVar2.k() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        HttpUrl httpUrl = this.f10199b.f7404h;
        return url.f17324e == httpUrl.f17324e && Intrinsics.areEqual(url.f17323d, httpUrl.f17323d);
    }

    public final void c(IOException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        this.f10206i = null;
        if ((e10 instanceof js.b0) && ((js.b0) e10).f14097d == js.b.REFUSED_STREAM) {
            this.f10203f++;
        } else if (e10 instanceof js.a) {
            this.f10204g++;
        } else {
            this.f10205h++;
        }
    }
}
