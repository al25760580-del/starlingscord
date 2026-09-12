package qs;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Closeable {
    public boolean E;
    public boolean F;
    public boolean G;
    public final Buffer H;
    public final Buffer I;
    public a J;
    public final byte[] K;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BufferedSource f19109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f19110e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f19111i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f19112v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f19113w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f19114x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f19115y;

    public j(BufferedSource source, g frameCallback, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(frameCallback, "frameCallback");
        this.f19109d = source;
        this.f19110e = frameCallback;
        this.f19111i = z5;
        this.f19112v = z6;
        this.H = new Buffer();
        this.I = new Buffer();
        this.K = null;
    }

    public final void c() throws ProtocolException, EOFException {
        String reason;
        short s2;
        j jVar;
        k kVar;
        String strStringPlus;
        long j = this.f19115y;
        if (j > 0) {
            this.f19109d.v(this.H, j);
        }
        switch (this.f19114x) {
            case 8:
                Buffer buffer = this.H;
                long j5 = buffer.f17413e;
                if (j5 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                gs.k kVar2 = null;
                if (j5 != 0) {
                    s2 = buffer.readShort();
                    reason = this.H.V();
                    if (s2 < 1000 || s2 >= 5000) {
                        strStringPlus = Intrinsics.stringPlus("Code must be in range [1000,5000): ", Integer.valueOf(s2));
                    } else {
                        strStringPlus = ((1004 > s2 || s2 >= 1007) && (1015 > s2 || s2 >= 3000)) ? null : s0.g.d(s2, "Code ", " is reserved and may not be used.");
                    }
                    if (strStringPlus != null) {
                        throw new ProtocolException(strStringPlus);
                    }
                } else {
                    reason = "";
                    s2 = 1005;
                }
                g gVar = (g) this.f19110e;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(reason, "reason");
                if (s2 == -1) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                synchronized (gVar) {
                    try {
                        if (gVar.f19098r != -1) {
                            throw new IllegalStateException("already closed");
                        }
                        gVar.f19098r = s2;
                        gVar.f19099s = reason;
                        if (gVar.f19097q && gVar.f19095o.isEmpty()) {
                            gs.k kVar3 = gVar.f19093m;
                            gVar.f19093m = null;
                            jVar = gVar.f19091i;
                            gVar.f19091i = null;
                            kVar = gVar.j;
                            gVar.j = null;
                            gVar.k.f();
                            kVar2 = kVar3;
                        } else {
                            jVar = null;
                            kVar = null;
                        }
                        Unit unit = Unit.f14616a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    gVar.f19083a.onClosing(gVar, s2, reason);
                    if (kVar2 != null) {
                        gVar.f19083a.onClosed(gVar, s2, reason);
                        break;
                    }
                    if (kVar2 != null) {
                        ds.b.c(kVar2);
                    }
                    if (jVar != null) {
                        ds.b.c(jVar);
                    }
                    if (kVar != null) {
                        ds.b.c(kVar);
                    }
                    this.f19113w = true;
                    return;
                } catch (Throwable th3) {
                    if (kVar2 != null) {
                        ds.b.c(kVar2);
                    }
                    if (jVar != null) {
                        ds.b.c(jVar);
                    }
                    if (kVar != null) {
                        ds.b.c(kVar);
                    }
                    throw th3;
                }
            case 9:
                i iVar = this.f19110e;
                Buffer buffer2 = this.H;
                ByteString payload = buffer2.m(buffer2.f17413e);
                g gVar2 = (g) iVar;
                synchronized (gVar2) {
                    try {
                        Intrinsics.checkNotNullParameter(payload, "payload");
                        if (!gVar2.f19100t && (!gVar2.f19097q || !gVar2.f19095o.isEmpty())) {
                            gVar2.f19094n.add(payload);
                            gVar2.i();
                            return;
                        }
                        return;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            case 10:
                i iVar2 = this.f19110e;
                Buffer buffer3 = this.H;
                ByteString payload2 = buffer3.m(buffer3.f17413e);
                g gVar3 = (g) iVar2;
                synchronized (gVar3) {
                    Intrinsics.checkNotNullParameter(payload2, "payload");
                    gVar3.f19102v = false;
                }
                return;
            default:
                int i7 = this.f19114x;
                byte[] bArr = ds.b.f7815a;
                String hexString = Integer.toHexString(i7);
                Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
                throw new ProtocolException(Intrinsics.stringPlus("Unknown control opcode: ", hexString));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        a aVar = this.J;
        if (aVar == null) {
            return;
        }
        aVar.close();
    }

    public final void f() throws IOException {
        boolean z5;
        if (this.f19113w) {
            throw new IOException("closed");
        }
        BufferedSource bufferedSource = this.f19109d;
        long jH = bufferedSource.timeout().h();
        bufferedSource.timeout().b();
        try {
            byte b10 = bufferedSource.readByte();
            byte[] bArr = ds.b.f7815a;
            bufferedSource.timeout().g(jH, TimeUnit.NANOSECONDS);
            int i7 = b10 & 15;
            this.f19114x = i7;
            boolean z6 = (b10 & ByteCompanionObject.MIN_VALUE) != 0;
            this.E = z6;
            boolean z7 = (b10 & 8) != 0;
            this.F = z7;
            if (z7 && !z6) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z10 = (b10 & 64) != 0;
            if (i7 == 1 || i7 == 2) {
                if (!z10) {
                    z5 = false;
                } else {
                    if (!this.f19111i) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z5 = true;
                }
                this.G = z5;
            } else if (z10) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((b10 & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((b10 & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte b11 = bufferedSource.readByte();
            boolean z11 = (b11 & ByteCompanionObject.MIN_VALUE) != 0;
            if (z11) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j = b11 & ByteCompanionObject.MAX_VALUE;
            this.f19115y = j;
            if (j == 126) {
                this.f19115y = bufferedSource.readShort() & 65535;
            } else if (j == 127) {
                long j5 = bufferedSource.readLong();
                this.f19115y = j5;
                if (j5 < 0) {
                    StringBuilder sb2 = new StringBuilder("Frame length 0x");
                    String hexString = Long.toHexString(this.f19115y);
                    Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
                    sb2.append(hexString);
                    sb2.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(sb2.toString());
                }
            }
            if (this.F && this.f19115y > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z11) {
                byte[] bArr2 = this.K;
                Intrinsics.checkNotNull(bArr2);
                bufferedSource.readFully(bArr2);
            }
        } catch (Throwable th2) {
            bufferedSource.timeout().g(jH, TimeUnit.NANOSECONDS);
            throw th2;
        }
    }
}
