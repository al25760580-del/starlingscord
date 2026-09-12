package sh;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f20251a = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20252b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20255e = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f20253c = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20258h = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20256f = 30;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f20254d = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20257g = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f20259i = null;

    public final int a(byte[] bArr, int i7, int i10) {
        int iC = c(30, i7, i10, bArr);
        if (iC != -1) {
            if (this.f20253c == -1) {
                byte[] bArr2 = this.f20251a;
                long jA = ((long) ((m0.a(bArr2, 2) << 16) | m0.a(bArr2, 0))) & 4294967295L;
                this.f20253c = jA;
                if (jA == 67324752) {
                    this.f20258h = false;
                    byte[] bArr3 = this.f20251a;
                    this.f20254d = ((long) ((m0.a(bArr3, 20) << 16) | m0.a(bArr3, 18))) & 4294967295L;
                    this.f20257g = m0.a(this.f20251a, 8);
                    this.f20255e = m0.a(this.f20251a, 26);
                    int iA = this.f20255e + 30 + m0.a(this.f20251a, 28);
                    this.f20256f = iA;
                    int length = this.f20251a.length;
                    if (length < iA) {
                        do {
                            length += length;
                        } while (length < iA);
                        this.f20251a = Arrays.copyOf(this.f20251a, length);
                    }
                } else {
                    this.f20258h = true;
                }
            }
            int iC2 = c(this.f20256f, i7 + iC, i10 - iC, bArr);
            if (iC2 != -1) {
                int i11 = iC + iC2;
                if (!this.f20258h && this.f20259i == null) {
                    this.f20259i = new String(this.f20251a, 30, this.f20255e);
                }
                return i11;
            }
        }
        return -1;
    }

    public final z b() {
        int i7 = this.f20252b;
        int i10 = this.f20256f;
        if (i7 < i10) {
            return new z(this.f20259i, this.f20254d, this.f20257g, true, this.f20258h, Arrays.copyOf(this.f20251a, i7));
        }
        z zVar = new z(this.f20259i, this.f20254d, this.f20257g, false, this.f20258h, Arrays.copyOf(this.f20251a, i10));
        this.f20252b = 0;
        this.f20255e = -1;
        this.f20253c = -1L;
        this.f20258h = false;
        this.f20256f = 30;
        this.f20254d = -1L;
        this.f20257g = -1;
        this.f20259i = null;
        return zVar;
    }

    public final int c(int i7, int i10, int i11, byte[] bArr) {
        int i12 = this.f20252b;
        if (i12 >= i7) {
            return 0;
        }
        int iMin = Math.min(i11, i7 - i12);
        System.arraycopy(bArr, i10, this.f20251a, this.f20252b, iMin);
        int i13 = this.f20252b + iMin;
        this.f20252b = i13;
        if (i13 < i7) {
            return -1;
        }
        return iMin;
    }
}
