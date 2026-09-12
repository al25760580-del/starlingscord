package vb;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sb.c f21539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f21540b;

    public l(sb.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f21539a = cVar;
        this.f21540b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f21539a.equals(lVar.f21539a)) {
            return Arrays.equals(this.f21540b, lVar.f21540b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f21539a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21540b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f21539a + ", bytes=[...]}";
    }
}
