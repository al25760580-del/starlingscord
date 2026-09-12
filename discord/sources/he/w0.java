package he;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends h {
    public Uri E;
    public DatagramSocket F;
    public MulticastSocket G;
    public InetAddress H;
    public boolean I;
    public int J;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f10718w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final byte[] f10719x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final DatagramPacket f10720y;

    public w0() {
        super(true);
        this.f10718w = 8000;
        byte[] bArr = new byte[2000];
        this.f10719x = bArr;
        this.f10720y = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        this.E = null;
        MulticastSocket multicastSocket = this.G;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.H;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.G = null;
        }
        DatagramSocket datagramSocket = this.F;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.F = null;
        }
        this.H = null;
        this.J = 0;
        if (this.I) {
            this.I = false;
            c();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long d(p pVar) throws v0 {
        Uri uri = pVar.f10649a;
        this.E = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.E.getPort();
        e();
        try {
            this.H = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.H, port);
            if (this.H.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.G = multicastSocket;
                multicastSocket.joinGroup(this.H);
                this.F = this.G;
            } else {
                this.F = new DatagramSocket(inetSocketAddress);
            }
            this.F.setSoTimeout(this.f10718w);
            this.I = true;
            f(pVar);
            return -1L;
        } catch (IOException e10) {
            throw new v0(2001, e10);
        } catch (SecurityException e11) {
            throw new v0(2006, e11);
        }
    }

    @Override // he.k
    public final int read(byte[] bArr, int i7, int i10) throws v0 {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.J;
        DatagramPacket datagramPacket = this.f10720y;
        if (i11 == 0) {
            try {
                DatagramSocket datagramSocket = this.F;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.J = length;
                b(length);
            } catch (SocketTimeoutException e10) {
                throw new v0(2002, e10);
            } catch (IOException e11) {
                throw new v0(2001, e11);
            }
        }
        int length2 = datagramPacket.getLength();
        int i12 = this.J;
        int iMin = Math.min(i12, i10);
        System.arraycopy(this.f10719x, length2 - i12, bArr, i7, iMin);
        this.J -= iMin;
        return iMin;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri y() {
        return this.E;
    }
}
