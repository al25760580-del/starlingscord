package js;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Closeable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Logger f14171v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BufferedSource f14172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f14173e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f14174i;

    static {
        Logger logger = Logger.getLogger(g.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(Http2::class.java.name)");
        f14171v = logger;
    }

    public t(BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f14172d = source;
        s sVar = new s(source);
        this.f14173e = sVar;
        this.f14174i = new d(sVar);
    }

    public final boolean c(boolean z5, fp.b handler) throws Throwable {
        b errorCode;
        int i7;
        b errorCode2;
        Object[] array;
        Intrinsics.checkNotNullParameter(handler, "handler");
        int i10 = 0;
        try {
            this.f14172d.d0(9L);
            int iS = ds.b.s(this.f14172d);
            if (iS > 16384) {
                throw new IOException(Intrinsics.stringPlus("FRAME_SIZE_ERROR: ", Integer.valueOf(iS)));
            }
            int i11 = this.f14172d.readByte() & 255;
            byte b10 = this.f14172d.readByte();
            int i12 = b10 & 255;
            int i13 = this.f14172d.readInt();
            int i14 = i13 & Integer.MAX_VALUE;
            Logger logger = f14171v;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(g.a(i14, iS, i11, i12, true));
            }
            if (z5 && i11 != 4) {
                String[] strArr = g.f14125b;
                throw new IOException(Intrinsics.stringPlus("Expected a SETTINGS frame but was ", i11 < strArr.length ? strArr[i11] : ds.b.h("0x%02x", Integer.valueOf(i11))));
            }
            int i15 = 2;
            switch (i11) {
                case 0:
                    f(handler, iS, i12, i14);
                    return true;
                case 1:
                    i(handler, iS, i12, i14);
                    return true;
                case 2:
                    if (iS != 5) {
                        throw new IOException(s0.g.d(iS, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i14 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    BufferedSource bufferedSource = this.f14172d;
                    bufferedSource.readInt();
                    bufferedSource.readByte();
                    return true;
                case 3:
                    if (iS != 4) {
                        throw new IOException(s0.g.d(iS, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i14 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i16 = this.f14172d.readInt();
                    b[] bVarArrValues = b.values();
                    int length = bVarArrValues.length;
                    while (true) {
                        if (i10 < length) {
                            b bVar = bVarArrValues[i10];
                            if (bVar.f14096d == i16) {
                                errorCode = bVar;
                            } else {
                                i10++;
                            }
                        } else {
                            errorCode = null;
                        }
                    }
                    if (errorCode == null) {
                        throw new IOException(Intrinsics.stringPlus("TYPE_RST_STREAM unexpected error code: ", Integer.valueOf(i16)));
                    }
                    Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                    p pVar = (p) handler.f9331i;
                    if (i14 == 0 || (i13 & 1) != 0) {
                        w wVarI = pVar.i(i14);
                        if (wVarI == null) {
                            return true;
                        }
                        wVarI.k(errorCode);
                        return true;
                    }
                    Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                    pVar.F.c(new n(pVar.f14152i + '[' + i14 + "] onReset", pVar, i14, errorCode, 0), 0L);
                    return true;
                case 4:
                    BufferedSource bufferedSource2 = this.f14172d;
                    if (i14 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((b10 & 1) == 0) {
                        if (iS % 6 != 0) {
                            throw new IOException(Intrinsics.stringPlus("TYPE_SETTINGS length % 6 != 0: ", Integer.valueOf(iS)));
                        }
                        a0 settings = new a0();
                        kotlin.ranges.a aVarG = lo.j.g(6, lo.j.i(0, iS));
                        int i17 = aVarG.f14688d;
                        int i18 = aVarG.f14689e;
                        int i19 = aVarG.f14690i;
                        if ((i19 > 0 && i17 <= i18) || (i19 < 0 && i18 <= i17)) {
                            while (true) {
                                int i20 = i17 + i19;
                                short s2 = bufferedSource2.readShort();
                                byte[] bArr = ds.b.f7815a;
                                int i21 = s2 & 65535;
                                i7 = bufferedSource2.readInt();
                                if (i21 != 2) {
                                    if (i21 == 3) {
                                        i21 = 4;
                                    } else if (i21 != 4) {
                                        if (i21 == 5 && (i7 < 16384 || i7 > 16777215)) {
                                        }
                                    } else {
                                        if (i7 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i21 = 7;
                                    }
                                } else if (i7 != 0 && i7 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                settings.c(i21, i7);
                                if (i17 != i18) {
                                    i17 = i20;
                                }
                            }
                            throw new IOException(Intrinsics.stringPlus("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", Integer.valueOf(i7)));
                        }
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        p pVar2 = (p) handler.f9331i;
                        pVar2.E.c(new j(i15, handler, settings, Intrinsics.stringPlus(pVar2.f14152i, " applyAndAckSettings")), 0L);
                        return true;
                    }
                    if (iS != 0) {
                        throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                    }
                    break;
                case 5:
                    l(handler, iS, i12, i14);
                    return true;
                case 6:
                    if (iS != 8) {
                        throw new IOException(Intrinsics.stringPlus("TYPE_PING length != 8: ", Integer.valueOf(iS)));
                    }
                    if (i14 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int i22 = this.f14172d.readInt();
                    int i23 = this.f14172d.readInt();
                    if (((b10 & 1) != 0 ? 1 : 0) == 0) {
                        p pVar3 = (p) handler.f9331i;
                        pVar3.E.c(new k(Intrinsics.stringPlus(pVar3.f14152i, " ping"), (p) handler.f9331i, i22, i23), 0L);
                        return true;
                    }
                    p pVar4 = (p) handler.f9331i;
                    synchronized (pVar4) {
                        try {
                            if (i22 == 1) {
                                pVar4.I++;
                            } else if (i22 != 2) {
                                if (i22 == 3) {
                                    pVar4.notifyAll();
                                }
                                Unit unit = Unit.f14616a;
                            } else {
                                pVar4.K++;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return true;
                case 7:
                    if (iS < 8) {
                        throw new IOException(Intrinsics.stringPlus("TYPE_GOAWAY length < 8: ", Integer.valueOf(iS)));
                    }
                    if (i14 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int i24 = this.f14172d.readInt();
                    int i25 = this.f14172d.readInt();
                    int i26 = iS - 8;
                    b[] bVarArrValues2 = b.values();
                    int length2 = bVarArrValues2.length;
                    int i27 = 0;
                    while (true) {
                        if (i27 < length2) {
                            b bVar2 = bVarArrValues2[i27];
                            if (bVar2.f14096d == i25) {
                                errorCode2 = bVar2;
                            } else {
                                i27++;
                            }
                        } else {
                            errorCode2 = null;
                        }
                    }
                    if (errorCode2 == null) {
                        throw new IOException(Intrinsics.stringPlus("TYPE_GOAWAY unexpected error code: ", Integer.valueOf(i25)));
                    }
                    ByteString debugData = ByteString.f17414v;
                    if (i26 > 0) {
                        debugData = this.f14172d.m(i26);
                    }
                    Intrinsics.checkNotNullParameter(errorCode2, "errorCode");
                    Intrinsics.checkNotNullParameter(debugData, "debugData");
                    debugData.c();
                    p pVar5 = (p) handler.f9331i;
                    synchronized (pVar5) {
                        array = pVar5.f14151e.values().toArray(new w[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        pVar5.f14155x = true;
                        Unit unit2 = Unit.f14616a;
                    }
                    w[] wVarArr = (w[]) array;
                    int length3 = wVarArr.length;
                    while (i10 < length3) {
                        w wVar = wVarArr[i10];
                        i10++;
                        if (wVar.f14185a > i24 && wVar.h()) {
                            wVar.k(b.REFUSED_STREAM);
                            ((p) handler.f9331i).i(wVar.f14185a);
                        }
                    }
                    break;
                    break;
                case 8:
                    if (iS != 4) {
                        throw new IOException(Intrinsics.stringPlus("TYPE_WINDOW_UPDATE length !=4: ", Integer.valueOf(iS)));
                    }
                    long j = ((long) this.f14172d.readInt()) & 2147483647L;
                    if (j == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i14 == 0) {
                        p pVar6 = (p) handler.f9331i;
                        synchronized (pVar6) {
                            pVar6.R += j;
                            pVar6.notifyAll();
                            Unit unit3 = Unit.f14616a;
                        }
                        return true;
                    }
                    w wVarG = ((p) handler.f9331i).g(i14);
                    if (wVarG != null) {
                        synchronized (wVarG) {
                            wVarG.f14190f += j;
                            if (j > 0) {
                                wVarG.notifyAll();
                            }
                            Unit unit4 = Unit.f14616a;
                        }
                        return true;
                    }
                    break;
                default:
                    this.f14172d.skip(iS);
                    return true;
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f14172d.close();
    }

    public final void f(fp.b bVar, int i7, int i10, int i11) throws Throwable {
        int i12;
        w wVar;
        long j;
        if (i11 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z5 = (i10 & 1) != 0;
        if ((i10 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i10 & 8) != 0) {
            byte b10 = this.f14172d.readByte();
            byte[] bArr = ds.b.f7815a;
            i12 = b10 & 255;
        } else {
            i12 = 0;
        }
        int iA = r.a(i7, i10, i12);
        BufferedSource source = this.f14172d;
        Intrinsics.checkNotNullParameter(source, "source");
        p pVar = (p) bVar.f9331i;
        if (i11 == 0 || (i11 & 1) != 0) {
            w wVarG = pVar.g(i11);
            if (wVarG == null) {
                ((p) bVar.f9331i).u(i11, b.PROTOCOL_ERROR);
                long j5 = iA;
                ((p) bVar.f9331i).n(j5);
                source.skip(j5);
            } else {
                Intrinsics.checkNotNullParameter(source, "source");
                byte[] bArr2 = ds.b.f7815a;
                v vVar = wVarG.f14193i;
                long j7 = iA;
                vVar.getClass();
                Intrinsics.checkNotNullParameter(source, "source");
                while (j7 > 0) {
                    w wVar2 = vVar.f14184x;
                    synchronized (wVar2) {
                        try {
                            boolean z6 = vVar.f14180e;
                            wVar = wVar2;
                            try {
                                boolean z7 = vVar.f14182v.f17413e + j7 > vVar.f14179d;
                                Unit unit = Unit.f14616a;
                                if (z7) {
                                    source.skip(j7);
                                    vVar.f14184x.e(b.FLOW_CONTROL_ERROR);
                                    break;
                                }
                                if (z6) {
                                    source.skip(j7);
                                    break;
                                }
                                long j10 = source.read(vVar.f14181i, j7);
                                if (j10 == -1) {
                                    throw new EOFException();
                                }
                                j7 -= j10;
                                w wVar3 = vVar.f14184x;
                                synchronized (wVar3) {
                                    try {
                                        if (vVar.f14183w) {
                                            Buffer buffer = vVar.f14181i;
                                            j = buffer.f17413e;
                                            buffer.c();
                                        } else {
                                            Buffer buffer2 = vVar.f14182v;
                                            boolean z10 = buffer2.f17413e == 0;
                                            buffer2.J(vVar.f14181i);
                                            if (z10) {
                                                wVar3.notifyAll();
                                            }
                                            j = 0;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                if (j > 0) {
                                    vVar.c(j);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            wVar = wVar2;
                        }
                    }
                }
                if (z5) {
                    wVarG.j(ds.b.f7816b, true);
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(source, "source");
            Buffer buffer3 = new Buffer();
            long j11 = iA;
            source.d0(j11);
            source.read(buffer3, j11);
            pVar.F.c(new l(pVar.f14152i + '[' + i11 + "] onData", pVar, i11, buffer3, iA, z5), 0L);
        }
        this.f14172d.skip(i12);
    }

    public final List g(int i7, int i10, int i11, int i12) throws IOException {
        s sVar = this.f14173e;
        sVar.f14169w = i7;
        sVar.f14166e = i7;
        sVar.f14170x = i10;
        sVar.f14167i = i11;
        sVar.f14168v = i12;
        d dVar = this.f14174i;
        rs.p pVar = dVar.f14109c;
        ArrayList arrayList = dVar.f14108b;
        while (!pVar.c()) {
            byte b10 = pVar.readByte();
            byte[] bArr = ds.b.f7815a;
            int i13 = b10 & 255;
            if (i13 == 128) {
                throw new IOException("index == 0");
            }
            if ((b10 & ByteCompanionObject.MIN_VALUE) == 128) {
                int iE = dVar.e(i13, 127);
                int i14 = iE - 1;
                if (i14 >= 0) {
                    c[] cVarArr = f.f14122a;
                    if (i14 <= cVarArr.length - 1) {
                        arrayList.add(cVarArr[i14]);
                    }
                }
                int length = dVar.f14111e + 1 + (i14 - f.f14122a.length);
                if (length >= 0) {
                    c[] cVarArr2 = dVar.f14110d;
                    if (length < cVarArr2.length) {
                        c cVar = cVarArr2[length];
                        Intrinsics.checkNotNull(cVar);
                        arrayList.add(cVar);
                    }
                }
                throw new IOException(Intrinsics.stringPlus("Header index too large ", Integer.valueOf(iE)));
            }
            if (i13 == 64) {
                c[] cVarArr3 = f.f14122a;
                ByteString byteStringD = dVar.d();
                f.a(byteStringD);
                dVar.c(new c(byteStringD, dVar.d()));
            } else if ((b10 & 64) == 64) {
                dVar.c(new c(dVar.b(dVar.e(i13, 63) - 1), dVar.d()));
            } else if ((b10 & 32) == 32) {
                int iE2 = dVar.e(i13, 31);
                dVar.f14107a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException(Intrinsics.stringPlus("Invalid dynamic table size update ", Integer.valueOf(dVar.f14107a)));
                }
                int i15 = dVar.f14113g;
                if (iE2 < i15) {
                    if (iE2 == 0) {
                        c[] cVarArr4 = dVar.f14110d;
                        kotlin.collections.w.k(cVarArr4, null, 0, cVarArr4.length);
                        dVar.f14111e = dVar.f14110d.length - 1;
                        dVar.f14112f = 0;
                        dVar.f14113g = 0;
                    } else {
                        dVar.a(i15 - iE2);
                    }
                }
            } else if (i13 == 16 || i13 == 0) {
                c[] cVarArr5 = f.f14122a;
                ByteString byteStringD2 = dVar.d();
                f.a(byteStringD2);
                arrayList.add(new c(byteStringD2, dVar.d()));
            } else {
                arrayList.add(new c(dVar.b(dVar.e(i13, 15) - 1), dVar.d()));
            }
        }
        List listI0 = CollectionsKt.i0(arrayList);
        arrayList.clear();
        return listI0;
    }

    public final void i(fp.b bVar, int i7, int i10, int i11) throws IOException {
        if (i11 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i12 = 0;
        int i13 = 1;
        boolean z5 = (i10 & 1) != 0;
        if ((i10 & 8) != 0) {
            byte b10 = this.f14172d.readByte();
            byte[] bArr = ds.b.f7815a;
            i12 = b10 & 255;
        }
        if ((i10 & 32) != 0) {
            BufferedSource bufferedSource = this.f14172d;
            bufferedSource.readInt();
            bufferedSource.readByte();
            byte[] bArr2 = ds.b.f7815a;
            i7 -= 5;
        }
        List requestHeaders = g(r.a(i7, i10, i12), i12, i10, i11);
        Intrinsics.checkNotNullParameter(requestHeaders, "headerBlock");
        p pVar = (p) bVar.f9331i;
        if (i11 != 0 && (i11 & 1) == 0) {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            pVar.F.c(new m(pVar.f14152i + '[' + i11 + "] onHeaders", pVar, i11, requestHeaders, z5), 0L);
            return;
        }
        synchronized (pVar) {
            w wVarG = pVar.g(i11);
            if (wVarG != null) {
                Unit unit = Unit.f14616a;
                wVarG.j(ds.b.u(requestHeaders), z5);
                return;
            }
            if (pVar.f14155x) {
                return;
            }
            if (i11 <= pVar.f14153v) {
                return;
            }
            if (i11 % 2 == pVar.f14154w % 2) {
                return;
            }
            w wVar = new w(i11, pVar, false, z5, ds.b.u(requestHeaders));
            pVar.f14153v = i11;
            pVar.f14151e.put(Integer.valueOf(i11), wVar);
            pVar.f14156y.e().c(new j(i13, pVar, wVar, pVar.f14152i + '[' + i11 + "] onStream"), 0L);
        }
    }

    public final void l(fp.b bVar, int i7, int i10, int i11) throws IOException {
        int i12;
        if (i11 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i10 & 8) != 0) {
            byte b10 = this.f14172d.readByte();
            byte[] bArr = ds.b.f7815a;
            i12 = b10 & 255;
        } else {
            i12 = 0;
        }
        int i13 = this.f14172d.readInt() & Integer.MAX_VALUE;
        List requestHeaders = g(r.a(i7 - 4, i10, i12), i12, i10, i11);
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        p pVar = (p) bVar.f9331i;
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (pVar) {
            if (pVar.V.contains(Integer.valueOf(i13))) {
                pVar.u(i13, b.PROTOCOL_ERROR);
                return;
            }
            pVar.V.add(Integer.valueOf(i13));
            pVar.F.c(new m(pVar.f14152i + '[' + i13 + "] onRequest", pVar, i13, requestHeaders), 0L);
        }
    }
}
