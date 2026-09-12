package rd;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSource;
import he.u0;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements DataSource {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DataSource f19254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f19255e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f19256i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CipherInputStream f19257v;

    public a(DataSource dataSource, byte[] bArr, byte[] bArr2) {
        this.f19254d = dataSource;
        this.f19255e = bArr;
        this.f19256i = bArr2;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void B(u0 u0Var) {
        u0Var.getClass();
        this.f19254d.B(u0Var);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        if (this.f19257v != null) {
            this.f19257v = null;
            this.f19254d.close();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long d(he.p pVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f19255e, "AES"), new IvParameterSpec(this.f19256i));
                he.n nVar = new he.n(this.f19254d, pVar);
                this.f19257v = new CipherInputStream(nVar, cipher);
                nVar.c();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // he.k
    public final int read(byte[] bArr, int i7, int i10) throws IOException {
        this.f19257v.getClass();
        int i11 = this.f19257v.read(bArr, i7, i10);
        if (i11 < 0) {
            return -1;
        }
        return i11;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Map s() {
        return this.f19254d.s();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri y() {
        return this.f19254d.y();
    }
}
