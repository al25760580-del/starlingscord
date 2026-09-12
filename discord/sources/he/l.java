package he;

import android.net.Uri;
import android.util.Base64;
import gc.h1;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends h {
    public int E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p f10624w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public byte[] f10625x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10626y;

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        if (this.f10625x != null) {
            this.f10625x = null;
            c();
        }
        this.f10624w = null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long d(p pVar) throws h1, m {
        e();
        this.f10624w = pVar;
        Uri uri = pVar.f10649a;
        long j = pVar.f10655g;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        je.b.f("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i7 = je.e0.f13788a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new h1("Unexpected URI format: " + uriNormalizeScheme, null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f10625x = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw new h1(a3.e.l("Error while parsing Base64 encoded string: ", str), e10, true, 0);
            }
        } else {
            this.f10625x = URLDecoder.decode(str, di.d.f7629a.name()).getBytes(di.d.f7631c);
        }
        long j5 = pVar.f10654f;
        byte[] bArr = this.f10625x;
        if (j5 > bArr.length) {
            this.f10625x = null;
            throw new m(2008);
        }
        int i10 = (int) j5;
        this.f10626y = i10;
        int length = bArr.length - i10;
        this.E = length;
        if (j != -1) {
            this.E = (int) Math.min(length, j);
        }
        f(pVar);
        return j != -1 ? j : this.E;
    }

    @Override // he.k
    public final int read(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.E;
        if (i11 == 0) {
            return -1;
        }
        int iMin = Math.min(i10, i11);
        byte[] bArr2 = this.f10625x;
        int i12 = je.e0.f13788a;
        System.arraycopy(bArr2, this.f10626y, bArr, i7, iMin);
        this.f10626y += iMin;
        this.E -= iMin;
        b(iMin);
        return iMin;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri y() {
        p pVar = this.f10624w;
        if (pVar != null) {
            return pVar.f10649a;
        }
        return null;
    }
}
