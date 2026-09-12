package rs;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.InflaterOutputStream;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class s extends ByteString {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient byte[][] f19606w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient int[] f19607x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(byte[][] segments, int[] directory) {
        super(ByteString.f17414v.f17415d);
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f19606w = segments;
        this.f19607x = directory;
    }

    @Override // okio.ByteString
    public final String a() {
        return new ByteString(j()).a();
    }

    @Override // okio.ByteString
    public final ByteString b(String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        byte[][] bArr = this.f19606w;
        int length = bArr.length;
        int i7 = 0;
        int i10 = 0;
        while (i7 < length) {
            int[] iArr = this.f19607x;
            int i11 = iArr[length + i7];
            int i12 = iArr[i7];
            messageDigest.update(bArr[i7], i11, i12 - i10);
            i7++;
            i10 = i12;
        }
        byte[] digestBytes = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digestBytes, "digestBytes");
        return new ByteString(digestBytes);
    }

    @Override // okio.ByteString
    public final int c() {
        return this.f19607x[this.f19606w.length - 1];
    }

    @Override // okio.ByteString
    public final String d() {
        return new ByteString(j()).d();
    }

    @Override // okio.ByteString
    public final byte[] e() {
        return j();
    }

    @Override // okio.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        return byteString.c() == c() && h(byteString, c());
    }

    @Override // okio.ByteString
    public final byte f(int i7) {
        byte[][] bArr = this.f19606w;
        int length = bArr.length - 1;
        int[] iArr = this.f19607x;
        v.f(iArr[length], i7, 1L);
        int iC = ss.b.c(this, i7);
        return bArr[iC][(i7 - (iC == 0 ? 0 : iArr[iC - 1])) + iArr[bArr.length + iC]];
    }

    @Override // okio.ByteString
    public final boolean g(int i7, int i10, int i11, byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i7 < 0 || i7 > c() - i11 || i10 < 0 || i10 > other.length - i11) {
            return false;
        }
        int i12 = i11 + i7;
        int iC = ss.b.c(this, i7);
        while (i7 < i12) {
            int[] iArr = this.f19607x;
            int i13 = iC == 0 ? 0 : iArr[iC - 1];
            int i14 = iArr[iC] - i13;
            byte[][] bArr = this.f19606w;
            int i15 = iArr[bArr.length + iC];
            int iMin = Math.min(i12, i14 + i13) - i7;
            if (!v.a((i7 - i13) + i15, i10, iMin, bArr[iC], other)) {
                return false;
            }
            i10 += iMin;
            i7 += iMin;
            iC++;
        }
        return true;
    }

    @Override // okio.ByteString
    public final boolean h(ByteString other, int i7) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (c() - i7 >= 0) {
            int iC = ss.b.c(this, 0);
            int i10 = 0;
            int i11 = 0;
            while (i10 < i7) {
                int[] iArr = this.f19607x;
                int i12 = iC == 0 ? 0 : iArr[iC - 1];
                int i13 = iArr[iC] - i12;
                byte[][] bArr = this.f19606w;
                int i14 = iArr[bArr.length + iC];
                int iMin = Math.min(i7, i13 + i12) - i10;
                if (other.g(i11, (i10 - i12) + i14, iMin, bArr[iC])) {
                    i11 += iMin;
                    i10 += iMin;
                    iC++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // okio.ByteString
    public final int hashCode() {
        int i7 = this.f17416e;
        if (i7 != 0) {
            return i7;
        }
        byte[][] bArr = this.f19606w;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f19607x;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            byte[] bArr2 = bArr[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr2[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        this.f17416e = i11;
        return i11;
    }

    @Override // okio.ByteString
    public final ByteString i() {
        return new ByteString(j()).i();
    }

    @Override // okio.ByteString
    public final byte[] j() {
        byte[] bArr = new byte[c()];
        byte[][] bArr2 = this.f19606w;
        int length = bArr2.length;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i7 < length) {
            int[] iArr = this.f19607x;
            int i12 = iArr[length + i7];
            int i13 = iArr[i7];
            int i14 = i13 - i10;
            w.c(i11, i12, i12 + i14, bArr2[i7], bArr);
            i11 += i14;
            i7++;
            i10 = i13;
        }
        return bArr;
    }

    @Override // okio.ByteString
    public final void l(InflaterOutputStream out) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        byte[][] bArr = this.f19606w;
        int length = bArr.length;
        int i7 = 0;
        int i10 = 0;
        while (i7 < length) {
            int[] iArr = this.f19607x;
            int i11 = iArr[length + i7];
            int i12 = iArr[i7];
            out.write(bArr[i7], i11, i12 - i10);
            i7++;
            i10 = i12;
        }
    }

    @Override // okio.ByteString
    public final void m(Buffer buffer, int i7) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int iC = ss.b.c(this, 0);
        int i10 = 0;
        while (i10 < i7) {
            int[] iArr = this.f19607x;
            int i11 = iC == 0 ? 0 : iArr[iC - 1];
            int i12 = iArr[iC] - i11;
            byte[][] bArr = this.f19606w;
            int i13 = iArr[bArr.length + iC];
            int iMin = Math.min(i7, i12 + i11) - i10;
            int i14 = (i10 - i11) + i13;
            q qVar = new q(bArr[iC], i14, i14 + iMin, true, false);
            q qVar2 = buffer.f17412d;
            if (qVar2 == null) {
                qVar.f19602g = qVar;
                qVar.f19601f = qVar;
                buffer.f17412d = qVar;
            } else {
                Intrinsics.checkNotNull(qVar2);
                q qVar3 = qVar2.f19602g;
                Intrinsics.checkNotNull(qVar3);
                qVar3.b(qVar);
            }
            i10 += iMin;
            iC++;
        }
        buffer.f17413e += (long) i7;
    }

    @Override // okio.ByteString
    public final String toString() {
        return new ByteString(j()).toString();
    }
}
