package io.sentry.vendor.gson.stream;

import a3.e;
import ag.a1;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Closeable {
    public long F;
    public int G;
    public String H;
    public int[] I;
    public String[] K;
    public int[] L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Reader f13255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13256e = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final char[] f13257i = new char[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13258v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13259w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13260x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13261y = 0;
    public int E = 0;
    public int J = 1;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.I = iArr;
        iArr[0] = 6;
        this.K = new String[32];
        this.L = new int[32];
        this.f13255d = reader;
    }

    public final boolean B() throws IOException {
        int i7 = this.E;
        if (i7 == 0) {
            i7 = i();
        }
        if (i7 == 5) {
            this.E = 0;
            int[] iArr = this.L;
            int i10 = this.J - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (i7 != 6) {
            throw new IllegalStateException("Expected a boolean but was " + j0() + z());
        }
        this.E = 0;
        int[] iArr2 = this.L;
        int i11 = this.J - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public final double O() throws IOException {
        int i7 = this.E;
        if (i7 == 0) {
            i7 = i();
        }
        if (i7 == 15) {
            this.E = 0;
            int[] iArr = this.L;
            int i10 = this.J - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.F;
        }
        if (i7 == 16) {
            this.H = new String(this.f13257i, this.f13258v, this.G);
            this.f13258v += this.G;
        } else if (i7 == 8 || i7 == 9) {
            this.H = a0(i7 == 8 ? '\'' : '\"');
        } else if (i7 == 10) {
            this.H = e0();
        } else if (i7 != 11) {
            throw new IllegalStateException("Expected a double but was " + j0() + z());
        }
        this.E = 11;
        double d6 = Double.parseDouble(this.H);
        if (!this.f13256e && (Double.isNaN(d6) || Double.isInfinite(d6))) {
            throw new a1("JSON forbids NaN and infinities: " + d6 + z());
        }
        this.H = null;
        this.E = 0;
        int[] iArr2 = this.L;
        int i11 = this.J - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d6;
    }

    public final int P() throws IOException {
        int i7 = this.E;
        if (i7 == 0) {
            i7 = i();
        }
        if (i7 == 15) {
            long j = this.F;
            int i10 = (int) j;
            if (j != i10) {
                throw new NumberFormatException("Expected an int but was " + this.F + z());
            }
            this.E = 0;
            int[] iArr = this.L;
            int i11 = this.J - 1;
            iArr[i11] = iArr[i11] + 1;
            return i10;
        }
        if (i7 == 16) {
            this.H = new String(this.f13257i, this.f13258v, this.G);
            this.f13258v += this.G;
        } else {
            if (i7 != 8 && i7 != 9 && i7 != 10) {
                throw new IllegalStateException("Expected an int but was " + j0() + z());
            }
            if (i7 == 10) {
                this.H = e0();
            } else {
                this.H = a0(i7 == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.H);
                this.E = 0;
                int[] iArr2 = this.L;
                int i13 = this.J - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.E = 11;
        double d6 = Double.parseDouble(this.H);
        int i14 = (int) d6;
        if (i14 != d6) {
            throw new NumberFormatException("Expected an int but was " + this.H + z());
        }
        this.H = null;
        this.E = 0;
        int[] iArr3 = this.L;
        int i15 = this.J - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public final long Q() throws IOException {
        int i7 = this.E;
        if (i7 == 0) {
            i7 = i();
        }
        if (i7 == 15) {
            this.E = 0;
            int[] iArr = this.L;
            int i10 = this.J - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.F;
        }
        if (i7 == 16) {
            this.H = new String(this.f13257i, this.f13258v, this.G);
            this.f13258v += this.G;
        } else {
            if (i7 != 8 && i7 != 9 && i7 != 10) {
                throw new IllegalStateException("Expected a long but was " + j0() + z());
            }
            if (i7 == 10) {
                this.H = e0();
            } else {
                this.H = a0(i7 == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.H);
                this.E = 0;
                int[] iArr2 = this.L;
                int i11 = this.J - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.E = 11;
        double d6 = Double.parseDouble(this.H);
        long j5 = (long) d6;
        if (j5 != d6) {
            throw new NumberFormatException("Expected a long but was " + this.H + z());
        }
        this.H = null;
        this.E = 0;
        int[] iArr3 = this.L;
        int i12 = this.J - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j5;
    }

    public final String T() throws IOException {
        String strA0;
        int i7 = this.E;
        if (i7 == 0) {
            i7 = i();
        }
        if (i7 == 14) {
            strA0 = e0();
        } else if (i7 == 12) {
            strA0 = a0('\'');
        } else {
            if (i7 != 13) {
                throw new IllegalStateException("Expected a name but was " + j0() + z());
            }
            strA0 = a0('\"');
        }
        this.E = 0;
        this.K[this.J - 1] = strA0;
        return strA0;
    }

    public final int U(boolean z5) throws IOException {
        int i7 = this.f13258v;
        int i10 = this.f13259w;
        while (true) {
            if (i7 == i10) {
                this.f13258v = i7;
                if (!q(1)) {
                    if (!z5) {
                        return -1;
                    }
                    throw new EOFException("End of input" + z());
                }
                i7 = this.f13258v;
                i10 = this.f13259w;
            }
            int i11 = i7 + 1;
            char[] cArr = this.f13257i;
            char c8 = cArr[i7];
            if (c8 == '\n') {
                this.f13260x++;
                this.f13261y = i11;
            } else if (c8 != ' ' && c8 != '\r' && c8 != '\t') {
                if (c8 == '/') {
                    this.f13258v = i11;
                    if (i11 == i10) {
                        this.f13258v = i7;
                        boolean zQ = q(2);
                        this.f13258v++;
                        if (!zQ) {
                        }
                        return c8;
                    }
                    g();
                    int i12 = this.f13258v;
                    char c10 = cArr[i12];
                    if (c10 == '*') {
                        this.f13258v = i12 + 1;
                        while (true) {
                            if (this.f13258v + 2 > this.f13259w && !q(2)) {
                                p0("Unterminated comment");
                                throw null;
                            }
                            int i13 = this.f13258v;
                            if (cArr[i13] != '\n') {
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= 2) {
                                        i7 = this.f13258v + 2;
                                        i10 = this.f13259w;
                                        break;
                                    }
                                    if (cArr[this.f13258v + i14] != "*/".charAt(i14)) {
                                        break;
                                    }
                                    i14++;
                                }
                            } else {
                                this.f13260x++;
                                this.f13261y = i13 + 1;
                            }
                            this.f13258v++;
                        }
                    } else {
                        if (c10 != '/') {
                            return c8;
                        }
                        this.f13258v = i12 + 1;
                        o0();
                        i7 = this.f13258v;
                        i10 = this.f13259w;
                    }
                } else {
                    if (c8 != '#') {
                        this.f13258v = i11;
                        return c8;
                    }
                    this.f13258v = i11;
                    g();
                    o0();
                    i7 = this.f13258v;
                    i10 = this.f13259w;
                }
            }
            i7 = i11;
        }
    }

    public final void Y() {
        int i7 = this.E;
        if (i7 == 0) {
            i7 = i();
        }
        if (i7 != 7) {
            throw new IllegalStateException("Expected null but was " + j0() + z());
        }
        this.E = 0;
        int[] iArr = this.L;
        int i10 = this.J - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public final String a0(char c8) throws a1 {
        int i7;
        char[] cArr;
        StringBuilder sb2 = null;
        do {
            int i10 = this.f13258v;
            int i11 = this.f13259w;
            while (true) {
                int i12 = i11;
                i7 = i10;
                while (true) {
                    cArr = this.f13257i;
                    if (i10 < i12) {
                        int i13 = i10 + 1;
                        char c10 = cArr[i10];
                        if (c10 == c8) {
                            this.f13258v = i13;
                            int i14 = (i13 - i7) - 1;
                            if (sb2 == null) {
                                return new String(cArr, i7, i14);
                            }
                            sb2.append(cArr, i7, i14);
                            return sb2.toString();
                        }
                        if (c10 == '\\') {
                            this.f13258v = i13;
                            int i15 = i13 - i7;
                            int i16 = i15 - 1;
                            if (sb2 == null) {
                                sb2 = new StringBuilder(Math.max(i15 * 2, 16));
                            }
                            sb2.append(cArr, i7, i16);
                            sb2.append(m0());
                            i10 = this.f13258v;
                            i11 = this.f13259w;
                        } else {
                            if (c10 == '\n') {
                                this.f13260x++;
                                this.f13261y = i13;
                            }
                            i10 = i13;
                        }
                    }
                }
            }
            if (sb2 == null) {
                sb2 = new StringBuilder(Math.max((i10 - i7) * 2, 16));
            }
            sb2.append(cArr, i7, i10 - i7);
            this.f13258v = i10;
        } while (q(1));
        p0("Unterminated string");
        throw null;
    }

    public final void c() {
        int i7 = this.E;
        if (i7 == 0) {
            i7 = i();
        }
        if (i7 == 3) {
            l0(1);
            this.L[this.J - 1] = 0;
            this.E = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + j0() + z());
        }
    }

    public final String c0() {
        String str;
        int i7 = this.E;
        if (i7 == 0) {
            i7 = i();
        }
        if (i7 == 10) {
            str = e0();
        } else if (i7 == 8) {
            str = a0('\'');
        } else if (i7 == 9) {
            str = a0('\"');
        } else if (i7 == 11) {
            str = this.H;
            this.H = null;
        } else if (i7 == 15) {
            str = Long.toString(this.F);
        } else {
            if (i7 != 16) {
                throw new IllegalStateException("Expected a string but was " + j0() + z());
            }
            str = new String(this.f13257i, this.f13258v, this.G);
            this.f13258v += this.G;
        }
        this.E = 0;
        int[] iArr = this.L;
        int i10 = this.J - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.E = 0;
        this.I[0] = 8;
        this.J = 1;
        this.f13255d.close();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    public final String e0() throws a1 {
        String string;
        StringBuilder sb2 = null;
        int i7 = 0;
        while (true) {
            int i10 = 0;
            while (true) {
                int i11 = this.f13258v;
                int i12 = i11 + i10;
                int i13 = this.f13259w;
                char[] cArr = this.f13257i;
                if (i12 < i13) {
                    char c8 = cArr[i11 + i10];
                    if (c8 != '\t' && c8 != '\n' && c8 != '\f' && c8 != '\r' && c8 != ' ') {
                        if (c8 != '#') {
                            if (c8 != ',') {
                                if (c8 != '/' && c8 != '=') {
                                    if (c8 != '{' && c8 != '}' && c8 != ':') {
                                        if (c8 != ';') {
                                            switch (c8) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i10++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        g();
                    }
                    i7 = i10;
                } else if (i10 >= cArr.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i10, 16));
                    }
                    sb2.append(cArr, this.f13258v, i10);
                    this.f13258v += i10;
                    if (!q(1)) {
                    }
                } else if (!q(i10 + 1)) {
                    i7 = i10;
                }
                if (sb2 == null) {
                    string = new String(cArr, this.f13258v, i7);
                } else {
                    sb2.append(cArr, this.f13258v, i7);
                    string = sb2.toString();
                }
                this.f13258v += i7;
                return string;
            }
        }
    }

    public final void f() {
        int i7 = this.E;
        if (i7 == 0) {
            i7 = i();
        }
        if (i7 == 1) {
            l0(3);
            this.E = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + j0() + z());
        }
    }

    public final void g() throws a1 {
        if (this.f13256e) {
            return;
        }
        p0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x017d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:116:0x017e  */
    /* JADX WARN: Code duplicated, block: B:119:0x018d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0193  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a6 A[PHI: r2 r4
      0x01a6: PHI (r2v44 int) = (r2v43 int), (r2v46 int) binds: [B:118:0x018b, B:126:0x01a0] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r4v10 int) = (r4v9 int), (r4v12 int) binds: [B:118:0x018b, B:126:0x01a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:129:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:171:0x021a  */
    /* JADX WARN: Code duplicated, block: B:172:0x021c  */
    /* JADX WARN: Code duplicated, block: B:184:0x023d A[DONT_INVERT, PHI: r9
      0x023d: PHI (r9v25 int) = (r9v24 int), (r9v27 int) binds: [B:170:0x0218, B:176:0x0225] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:185:0x023f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0262  */
    /* JADX WARN: Code duplicated, block: B:200:0x0268  */
    /* JADX WARN: Code duplicated, block: B:203:0x026d  */
    /* JADX WARN: Code duplicated, block: B:208:0x027c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:209:0x027d  */
    /* JADX WARN: Code duplicated, block: B:211:0x0287  */
    /* JADX WARN: Code duplicated, block: B:213:0x028d  */
    /* JADX WARN: Code duplicated, block: B:223:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:232:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:234:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:275:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ea  */
    public final int i() throws IOException {
        int iU;
        int i7;
        int iU2;
        int i10;
        String str;
        String str2;
        int i11;
        char c8;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z5;
        char c10;
        long j;
        int i16;
        int i17;
        int i18;
        int i19;
        int[] iArr = this.I;
        int i20 = 1;
        int i21 = this.J - 1;
        int i22 = iArr[i21];
        char[] cArr = this.f13257i;
        if (i22 == 1) {
            iArr[i21] = 2;
        } else if (i22 == 2) {
            int iU3 = U(true);
            if (iU3 != 44) {
                if (iU3 != 59) {
                    if (iU3 == 93) {
                        this.E = 4;
                        return 4;
                    }
                    p0("Unterminated array");
                    throw null;
                }
                g();
            }
        } else {
            if (i22 == 3 || i22 == 5) {
                iArr[i21] = 4;
                if (i22 == 5 && (iU = U(true)) != 44) {
                    if (iU != 59) {
                        if (iU == 125) {
                            this.E = 2;
                            return 2;
                        }
                        p0("Unterminated object");
                        throw null;
                    }
                    g();
                }
                int iU4 = U(true);
                if (iU4 == 34) {
                    this.E = 13;
                    return 13;
                }
                if (iU4 == 39) {
                    g();
                    this.E = 12;
                    return 12;
                }
                if (iU4 == 125) {
                    if (i22 != 5) {
                        this.E = 2;
                        return 2;
                    }
                    p0("Expected name");
                    throw null;
                }
                g();
                this.f13258v--;
                if (y((char) iU4)) {
                    this.E = 14;
                    return 14;
                }
                p0("Expected name");
                throw null;
            }
            if (i22 != 4) {
                if (i22 == 6) {
                    if (this.f13256e) {
                        U(true);
                        int i23 = this.f13258v;
                        int i24 = i23 - 1;
                        this.f13258v = i24;
                        if ((i23 + 4 <= this.f13259w || q(5)) && cArr[i24] == ')' && cArr[i23] == ']' && cArr[i23 + 1] == '}' && cArr[i23 + 2] == '\'' && cArr[i23 + 3] == '\n') {
                            this.f13258v += 5;
                        }
                    }
                    this.I[this.J - 1] = 7;
                } else if (i22 == 7) {
                    i7 = 0;
                    if (U(false) == -1) {
                        this.E = 17;
                        return 17;
                    }
                    g();
                    this.f13258v--;
                } else {
                    i7 = 0;
                    if (i22 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iU2 = U(true);
                if (iU2 != 34) {
                    this.E = 9;
                    return 9;
                }
                if (iU2 != 39) {
                    g();
                    this.E = 8;
                    return 8;
                }
                if (iU2 != 44 || iU2 == 59) {
                    i10 = 1;
                } else {
                    if (iU2 == 91) {
                        this.E = 3;
                        return 3;
                    }
                    if (iU2 != 93) {
                        if (iU2 == 123) {
                            this.E = 1;
                            return 1;
                        }
                        int i25 = this.f13258v - 1;
                        this.f13258v = i25;
                        char c11 = cArr[i25];
                        if (c11 == 't' || c11 == 'T') {
                            str = "true";
                            str2 = "TRUE";
                            i11 = 5;
                        } else {
                            if (c11 != 'f' && c11 != 'F') {
                                if (c11 != 'n' && c11 != 'N') {
                                    i11 = i7;
                                    break;
                                }
                                str = "null";
                                str2 = "NULL";
                                i11 = 7;
                                if (i11 != 0) {
                                    return i11;
                                }
                                i12 = this.f13258v;
                                i13 = this.f13259w;
                                i14 = i7;
                                i15 = i14;
                                int i26 = i15;
                                z5 = true;
                                long j5 = 0;
                                while (true) {
                                    if (i12 + i15 != i13) {
                                        c10 = cArr[i12 + i15];
                                        j = 0;
                                        if (c10 != '+') {
                                            if (c10 != 'E' || c10 == 'e') {
                                                i16 = i13;
                                                if (i14 != 2 || i14 == 4) {
                                                    i14 = 5;
                                                    i15++;
                                                    i13 = i16;
                                                    i20 = 1;
                                                }
                                            } else if (c10 == '-') {
                                                i16 = i13;
                                                i17 = 6;
                                                if (i14 == 0) {
                                                    i14 = 1;
                                                    i26 = 1;
                                                } else {
                                                    if (i14 != 5) {
                                                    }
                                                    i14 = i17;
                                                }
                                                i15++;
                                                i13 = i16;
                                                i20 = 1;
                                            } else if (c10 == '.') {
                                                i16 = i13;
                                                if (i14 == 2) {
                                                    i14 = 3;
                                                    i15++;
                                                    i13 = i16;
                                                    i20 = 1;
                                                }
                                            } else if (c10 >= '0' && c10 <= '9') {
                                                if (i14 == i20 || i14 == 0) {
                                                    i16 = i13;
                                                    j5 = -(c10 - '0');
                                                    i14 = 2;
                                                } else if (i14 != 2) {
                                                    i16 = i13;
                                                    if (i14 == 3) {
                                                        i14 = 4;
                                                    } else if (i14 == 5 || i14 == 6) {
                                                        i14 = 7;
                                                    }
                                                } else if (j5 != 0) {
                                                    i16 = i13;
                                                    long j7 = (10 * j5) - ((long) (c10 - '0'));
                                                    z5 &= j5 > -922337203685477580L || (j5 == -922337203685477580L && j7 < j5);
                                                    j5 = j7;
                                                }
                                                i15++;
                                                i13 = i16;
                                                i20 = 1;
                                            } else if (!y(c10)) {
                                                i19 = 2;
                                                if (i14 != 2) {
                                                    if (i14 != i19 || i14 == 4 || i14 == 7) {
                                                        this.G = i15;
                                                        i18 = 16;
                                                        this.E = 16;
                                                    }
                                                } else if (z5 || ((j5 == Long.MIN_VALUE && i26 == 0) || (j5 == j && i26 != 0))) {
                                                    i19 = 2;
                                                    if (i14 != i19) {
                                                    }
                                                    this.G = i15;
                                                    i18 = 16;
                                                    this.E = 16;
                                                } else {
                                                    if (i26 == 0) {
                                                        j5 = -j5;
                                                    }
                                                    this.F = j5;
                                                    this.f13258v += i15;
                                                    i18 = 15;
                                                    this.E = 15;
                                                }
                                            }
                                            if (i18 != 0) {
                                                return i18;
                                            }
                                            if (y(cArr[this.f13258v])) {
                                                p0("Expected value");
                                                throw null;
                                            }
                                            g();
                                            this.E = 10;
                                            return 10;
                                        }
                                        i16 = i13;
                                        i17 = 6;
                                        if (i14 != 5) {
                                        }
                                        i14 = i17;
                                        i15++;
                                        i13 = i16;
                                        i20 = 1;
                                    } else if (i15 != cArr.length) {
                                        if (q(i15 + 1)) {
                                            int i27 = this.f13258v;
                                            i13 = this.f13259w;
                                            i12 = i27;
                                            c10 = cArr[i12 + i15];
                                            j = 0;
                                            if (c10 != '+') {
                                                if (c10 != 'E') {
                                                    i16 = i13;
                                                    if (i14 != 2) {
                                                    }
                                                    i14 = 5;
                                                    i15++;
                                                    i13 = i16;
                                                    i20 = 1;
                                                } else {
                                                    i16 = i13;
                                                    if (i14 != 2) {
                                                    }
                                                    i14 = 5;
                                                    i15++;
                                                    i13 = i16;
                                                    i20 = 1;
                                                }
                                                if (i18 != 0) {
                                                    return i18;
                                                }
                                                if (y(cArr[this.f13258v])) {
                                                    p0("Expected value");
                                                    throw null;
                                                }
                                                g();
                                                this.E = 10;
                                                return 10;
                                            }
                                            i16 = i13;
                                            i17 = 6;
                                            if (i14 != 5) {
                                            }
                                            i14 = i17;
                                            i15++;
                                            i13 = i16;
                                            i20 = 1;
                                        } else {
                                            j = 0;
                                        }
                                        i19 = 2;
                                        if (i14 != 2) {
                                            if (i14 != i19) {
                                            }
                                            this.G = i15;
                                            i18 = 16;
                                            this.E = 16;
                                        } else {
                                            if (z5) {
                                            }
                                            i19 = 2;
                                            if (i14 != i19) {
                                            }
                                            this.G = i15;
                                            i18 = 16;
                                            this.E = 16;
                                        }
                                        if (i18 != 0) {
                                            return i18;
                                        }
                                        if (y(cArr[this.f13258v])) {
                                            p0("Expected value");
                                            throw null;
                                        }
                                        g();
                                        this.E = 10;
                                        return 10;
                                    }
                                    i18 = 0;
                                    if (i18 != 0) {
                                        return i18;
                                    }
                                    if (y(cArr[this.f13258v])) {
                                        p0("Expected value");
                                        throw null;
                                    }
                                    g();
                                    this.E = 10;
                                    return 10;
                                }
                            }
                            str = "false";
                            str2 = "FALSE";
                            i11 = 6;
                        }
                        int length = str.length();
                        int i28 = 1;
                        while (true) {
                            if (i28 >= length) {
                                if ((this.f13258v + length >= this.f13259w && !q(length + 1)) || !y(cArr[this.f13258v + length])) {
                                    this.f13258v += length;
                                    this.E = i11;
                                    break;
                                }
                                break;
                            }
                            if ((this.f13258v + i28 < this.f13259w || q(i28 + 1)) && ((c8 = cArr[this.f13258v + i28]) == str.charAt(i28) || c8 == str2.charAt(i28))) {
                                i28++;
                            }
                            i11 = i7;
                            break;
                        }
                        if (i11 != 0) {
                            return i11;
                        }
                        i12 = this.f13258v;
                        i13 = this.f13259w;
                        i14 = i7;
                        i15 = i14;
                        int i29 = i15;
                        z5 = true;
                        long j10 = 0;
                        while (true) {
                            if (i12 + i15 != i13) {
                                c10 = cArr[i12 + i15];
                                j = 0;
                                if (c10 != '+') {
                                    if (c10 != 'E') {
                                        i16 = i13;
                                        if (i14 != 2) {
                                        }
                                        i14 = 5;
                                        i15++;
                                        i13 = i16;
                                        i20 = 1;
                                    } else {
                                        i16 = i13;
                                        if (i14 != 2) {
                                        }
                                        i14 = 5;
                                        i15++;
                                        i13 = i16;
                                        i20 = 1;
                                    }
                                    if (i18 != 0) {
                                        return i18;
                                    }
                                    if (y(cArr[this.f13258v])) {
                                        p0("Expected value");
                                        throw null;
                                    }
                                    g();
                                    this.E = 10;
                                    return 10;
                                }
                                i16 = i13;
                                i17 = 6;
                                if (i14 != 5) {
                                }
                                i14 = i17;
                                i15++;
                                i13 = i16;
                                i20 = 1;
                            } else if (i15 != cArr.length) {
                                if (q(i15 + 1)) {
                                    j = 0;
                                } else {
                                    int i210 = this.f13258v;
                                    i13 = this.f13259w;
                                    i12 = i210;
                                    c10 = cArr[i12 + i15];
                                    j = 0;
                                    if (c10 != '+') {
                                        if (c10 != 'E') {
                                            i16 = i13;
                                            if (i14 != 2) {
                                            }
                                            i14 = 5;
                                            i15++;
                                            i13 = i16;
                                            i20 = 1;
                                        } else {
                                            i16 = i13;
                                            if (i14 != 2) {
                                            }
                                            i14 = 5;
                                            i15++;
                                            i13 = i16;
                                            i20 = 1;
                                        }
                                        if (i18 != 0) {
                                            return i18;
                                        }
                                        if (y(cArr[this.f13258v])) {
                                            p0("Expected value");
                                            throw null;
                                        }
                                        g();
                                        this.E = 10;
                                        return 10;
                                    }
                                    i16 = i13;
                                    i17 = 6;
                                    if (i14 != 5) {
                                    }
                                    i14 = i17;
                                    i15++;
                                    i13 = i16;
                                    i20 = 1;
                                }
                                i19 = 2;
                                if (i14 != 2) {
                                    if (i14 != i19) {
                                    }
                                    this.G = i15;
                                    i18 = 16;
                                    this.E = 16;
                                } else {
                                    if (z5) {
                                    }
                                    i19 = 2;
                                    if (i14 != i19) {
                                    }
                                    this.G = i15;
                                    i18 = 16;
                                    this.E = 16;
                                }
                                if (i18 != 0) {
                                    return i18;
                                }
                                if (y(cArr[this.f13258v])) {
                                    p0("Expected value");
                                    throw null;
                                }
                                g();
                                this.E = 10;
                                return 10;
                            }
                            i18 = 0;
                            if (i18 != 0) {
                                return i18;
                            }
                            if (y(cArr[this.f13258v])) {
                                p0("Expected value");
                                throw null;
                            }
                            g();
                            this.E = 10;
                            return 10;
                        }
                    }
                    i10 = 1;
                    if (i22 == 1) {
                        this.E = 4;
                        return 4;
                    }
                }
                if (i22 == i10 && i22 != 2) {
                    p0("Unexpected value");
                    throw null;
                }
                g();
                this.f13258v -= i10;
                this.E = 7;
                return 7;
            }
            iArr[i21] = 5;
            int iU5 = U(true);
            if (iU5 != 58) {
                if (iU5 != 61) {
                    p0("Expected ':'");
                    throw null;
                }
                g();
                if (this.f13258v < this.f13259w || q(1)) {
                    int i30 = this.f13258v;
                    if (cArr[i30] == '>') {
                        this.f13258v = i30 + 1;
                    }
                }
            }
        }
        i7 = 0;
        iU2 = U(true);
        if (iU2 != 34) {
            this.E = 9;
            return 9;
        }
        if (iU2 != 39) {
            g();
            this.E = 8;
            return 8;
        }
        if (iU2 != 44) {
            i10 = 1;
        } else {
            i10 = 1;
        }
        if (i22 == i10) {
        }
        g();
        this.f13258v -= i10;
        this.E = 7;
        return 7;
    }

    public final b j0() throws IOException {
        int i7 = this.E;
        if (i7 == 0) {
            i7 = i();
        }
        switch (i7) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void l() {
        int i7 = this.E;
        if (i7 == 0) {
            i7 = i();
        }
        if (i7 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + j0() + z());
        }
        int i10 = this.J;
        this.J = i10 - 1;
        int[] iArr = this.L;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.E = 0;
    }

    public final void l0(int i7) {
        int i10 = this.J;
        int[] iArr = this.I;
        if (i10 == iArr.length) {
            int i11 = i10 * 2;
            this.I = Arrays.copyOf(iArr, i11);
            this.L = Arrays.copyOf(this.L, i11);
            this.K = (String[]) Arrays.copyOf(this.K, i11);
        }
        int[] iArr2 = this.I;
        int i12 = this.J;
        this.J = i12 + 1;
        iArr2[i12] = i7;
    }

    public final char m0() throws a1 {
        int i7;
        if (this.f13258v == this.f13259w && !q(1)) {
            p0("Unterminated escape sequence");
            throw null;
        }
        int i10 = this.f13258v;
        int i11 = i10 + 1;
        this.f13258v = i11;
        char[] cArr = this.f13257i;
        char c8 = cArr[i10];
        if (c8 == '\n') {
            this.f13260x++;
            this.f13261y = i11;
            return c8;
        }
        if (c8 == '\"' || c8 == '\'' || c8 == '/' || c8 == '\\') {
            return c8;
        }
        if (c8 == 'b') {
            return '\b';
        }
        if (c8 == 'f') {
            return '\f';
        }
        if (c8 == 'n') {
            return '\n';
        }
        if (c8 == 'r') {
            return '\r';
        }
        if (c8 == 't') {
            return '\t';
        }
        if (c8 != 'u') {
            p0("Invalid escape sequence");
            throw null;
        }
        if (i10 + 5 > this.f13259w && !q(4)) {
            p0("Unterminated escape sequence");
            throw null;
        }
        int i12 = this.f13258v;
        int i13 = i12 + 4;
        char c10 = 0;
        while (i12 < i13) {
            char c11 = cArr[i12];
            char c12 = (char) (c10 << 4);
            if (c11 >= '0' && c11 <= '9') {
                i7 = c11 - '0';
            } else if (c11 >= 'a' && c11 <= 'f') {
                i7 = c11 - 'W';
            } else {
                if (c11 < 'A' || c11 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.f13258v, 4)));
                }
                i7 = c11 - '7';
            }
            c10 = (char) (i7 + c12);
            i12++;
        }
        this.f13258v += 4;
        return c10;
    }

    public final void n() {
        int i7 = this.E;
        if (i7 == 0) {
            i7 = i();
        }
        if (i7 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + j0() + z());
        }
        int i10 = this.J;
        int i11 = i10 - 1;
        this.J = i11;
        this.K[i11] = null;
        int[] iArr = this.L;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.E = 0;
    }

    public final void n0(char c8) throws a1 {
        do {
            int i7 = this.f13258v;
            int i10 = this.f13259w;
            while (i7 < i10) {
                int i11 = i7 + 1;
                char c10 = this.f13257i[i7];
                if (c10 == c8) {
                    this.f13258v = i11;
                    return;
                }
                if (c10 == '\\') {
                    this.f13258v = i11;
                    m0();
                    i7 = this.f13258v;
                    i10 = this.f13259w;
                } else {
                    if (c10 == '\n') {
                        this.f13260x++;
                        this.f13261y = i11;
                    }
                    i7 = i11;
                }
            }
            this.f13258v = i7;
        } while (q(1));
        p0("Unterminated string");
        throw null;
    }

    public final void o0() {
        char c8;
        do {
            if (this.f13258v >= this.f13259w && !q(1)) {
                return;
            }
            int i7 = this.f13258v;
            int i10 = i7 + 1;
            this.f13258v = i10;
            c8 = this.f13257i[i7];
            if (c8 == '\n') {
                this.f13260x++;
                this.f13261y = i10;
                return;
            }
        } while (c8 != '\r');
    }

    public final void p0(String str) throws a1 {
        StringBuilder sbN = kk.b.n(str);
        sbN.append(z());
        throw new a1(sbN.toString());
    }

    public final boolean q(int i7) throws IOException {
        int i10;
        int i11;
        int i12 = this.f13261y;
        int i13 = this.f13258v;
        this.f13261y = i12 - i13;
        int i14 = this.f13259w;
        char[] cArr = this.f13257i;
        if (i14 != i13) {
            int i15 = i14 - i13;
            this.f13259w = i15;
            System.arraycopy(cArr, i13, cArr, 0, i15);
        } else {
            this.f13259w = 0;
        }
        this.f13258v = 0;
        do {
            int i16 = this.f13259w;
            int i17 = this.f13255d.read(cArr, i16, cArr.length - i16);
            if (i17 == -1) {
                return false;
            }
            i10 = this.f13259w + i17;
            this.f13259w = i10;
            if (this.f13260x == 0 && (i11 = this.f13261y) == 0 && i10 > 0 && cArr[0] == 65279) {
                this.f13258v++;
                this.f13261y = i11 + 1;
                i7++;
            }
        } while (i10 < i7);
        return true;
    }

    public final String toString() {
        return a.class.getSimpleName() + z();
    }

    public final boolean u() throws IOException {
        int i7 = this.E;
        if (i7 == 0) {
            i7 = i();
        }
        return (i7 == 2 || i7 == 4) ? false : true;
    }

    public final boolean y(char c8) throws a1 {
        if (c8 == '\t' || c8 == '\n' || c8 == '\f' || c8 == '\r' || c8 == ' ') {
            return false;
        }
        if (c8 != '#') {
            if (c8 == ',') {
                return false;
            }
            if (c8 != '/' && c8 != '=') {
                if (c8 == '{' || c8 == '}' || c8 == ':') {
                    return false;
                }
                if (c8 != ';') {
                    switch (c8) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        g();
        return false;
    }

    public final String z() {
        StringBuilder sbR = e.r(this.f13260x + 1, " at line ", (this.f13258v - this.f13261y) + 1, " column ", " path ");
        StringBuilder sb2 = new StringBuilder("$");
        int i7 = this.J;
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = this.I[i10];
            if (i11 == 1 || i11 == 2) {
                sb2.append('[');
                sb2.append(this.L[i10]);
                sb2.append(']');
            } else if (i11 == 3 || i11 == 4 || i11 == 5) {
                sb2.append('.');
                String str = this.K[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        sbR.append(sb2.toString());
        return sbR.toString();
    }
}
