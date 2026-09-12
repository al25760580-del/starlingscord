package ag;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class r0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p0 f570d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Character f572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile r0 f573c;

    static {
        new q0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new q0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new r0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new r0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f570d = new p0(new o0("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public r0(o0 o0Var, Character ch) {
        this.f571a = o0Var;
        if (ch != null) {
            byte[] bArr = o0Var.f559g;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw new IllegalArgumentException(c.d("Padding character %s was already in alphabet", ch));
            }
        }
        this.f572b = ch;
    }

    public void a(StringBuilder sb2, byte[] bArr, int i7) {
        int i10 = 0;
        c.m(0, i7, bArr.length);
        while (i10 < i7) {
            o0 o0Var = this.f571a;
            b(sb2, bArr, i10, Math.min(o0Var.f558f, i7 - i10));
            i10 += o0Var.f558f;
        }
    }

    public final void b(StringBuilder sb2, byte[] bArr, int i7, int i10) {
        c.m(i7, i7 + i10, bArr.length);
        o0 o0Var = this.f571a;
        int i11 = o0Var.f558f;
        int i12 = o0Var.f556d;
        if (i10 > i11) {
            throw new IllegalArgumentException();
        }
        int i13 = 0;
        long j = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            j = (j | ((long) (bArr[i7 + i14] & 255))) << 8;
        }
        int i15 = (i10 + 1) * 8;
        while (i13 < i10 * 8) {
            sb2.append(o0Var.f554b[((int) (j >>> ((i15 - i12) - i13))) & o0Var.f555c]);
            i13 += i12;
        }
        if (this.f572b != null) {
            while (i13 < o0Var.f558f * 8) {
                sb2.append('=');
                i13 += i12;
            }
        }
    }

    public final String c(byte[] bArr, int i7) {
        c.m(0, i7, bArr.length);
        o0 o0Var = this.f571a;
        int i10 = o0Var.f558f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(o0Var.f557e * c.a(i7, i10));
        try {
            a(sb2, bArr, i7);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r0) {
            r0 r0Var = (r0) obj;
            if (this.f571a.equals(r0Var.f571a) && Objects.equals(this.f572b, r0Var.f572b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f571a.hashCode() ^ Objects.hashCode(this.f572b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        o0 o0Var = this.f571a;
        sb2.append(o0Var);
        if (8 % o0Var.f556d != 0) {
            Character ch = this.f572b;
            if (ch == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    public r0(String str, String str2) {
        this(new o0(str, str2.toCharArray()), (Character) '=');
    }
}
