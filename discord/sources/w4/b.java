package w4;

import ag.a1;
import androidx.datastore.preferences.protobuf.d1;
import io.sentry.hints.j;
import io.sentry.internal.debugmeta.c;
import java.io.EOFException;
import kotlin.text.Charsets;
import okio.Buffer;
import okio.ByteString;
import rs.m;
import rs.p;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    public static final ByteString I;
    public static final ByteString J;
    public static final ByteString K;
    public int E;
    public long F;
    public int G;
    public String H;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p f22068x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Buffer f22069y;

    static {
        ByteString byteString = ByteString.f17414v;
        I = j.z("'\\");
        J = j.z("\"\\");
        K = j.z("{}[]:, \n\t\r\f/\\;#=");
        j.z("\n\r");
        j.z("*/");
    }

    public b(p pVar) {
        this.f22065e = new int[32];
        this.f22066i = new String[32];
        this.f22067v = new int[32];
        this.E = 0;
        this.f22068x = pVar;
        this.f22069y = pVar.f19594e;
        O(6);
    }

    @Override // w4.a
    public final int B() throws EOFException, a1 {
        int iA0 = this.E;
        if (iA0 == 0) {
            iA0 = a0();
        }
        switch (iA0) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    @Override // w4.a
    public final int P(c cVar) throws EOFException, a1 {
        int iA0 = this.E;
        if (iA0 == 0) {
            iA0 = a0();
        }
        if (iA0 < 12 || iA0 > 15) {
            return -1;
        }
        if (iA0 == 15) {
            return c0(this.H, cVar);
        }
        int iB0 = this.f22068x.b0((m) cVar.f12760i);
        if (iB0 != -1) {
            this.E = 0;
            this.f22066i[this.f22064d - 1] = ((String[]) cVar.f12759e)[iB0];
            return iB0;
        }
        String str = this.f22066i[this.f22064d - 1];
        String strJ0 = j0();
        int iC0 = c0(strJ0, cVar);
        if (iC0 == -1) {
            this.E = 15;
            this.H = strJ0;
            this.f22066i[this.f22064d - 1] = str;
        }
        return iC0;
    }

    @Override // w4.a
    public final void Q() throws EOFException, a1 {
        int iA0 = this.E;
        if (iA0 == 0) {
            iA0 = a0();
        }
        if (iA0 == 14) {
            long jG = this.f22068x.g(K);
            Buffer buffer = this.f22069y;
            if (jG == -1) {
                jG = buffer.f17413e;
            }
            buffer.skip(jG);
        } else if (iA0 == 13) {
            p0(J);
        } else if (iA0 == 12) {
            p0(I);
        } else if (iA0 != 15) {
            throw new d1("Expected a name but was " + g.l(B()) + " at path " + l());
        }
        this.E = 0;
        this.f22066i[this.f22064d - 1] = "null";
    }

    @Override // w4.a
    public final void T() throws EOFException, a1 {
        int i7 = 0;
        do {
            int iA0 = this.E;
            if (iA0 == 0) {
                iA0 = a0();
            }
            if (iA0 == 3) {
                O(1);
            } else {
                if (iA0 == 1) {
                    O(3);
                } else if (iA0 == 4) {
                    i7--;
                    if (i7 < 0) {
                        throw new d1("Expected a value but was " + g.l(B()) + " at path " + l());
                    }
                    this.f22064d--;
                } else if (iA0 == 2) {
                    i7--;
                    if (i7 < 0) {
                        throw new d1("Expected a value but was " + g.l(B()) + " at path " + l());
                    }
                    this.f22064d--;
                } else {
                    Buffer buffer = this.f22069y;
                    if (iA0 == 14 || iA0 == 10) {
                        long jG = this.f22068x.g(K);
                        if (jG == -1) {
                            jG = buffer.f17413e;
                        }
                        buffer.skip(jG);
                    } else if (iA0 == 9 || iA0 == 13) {
                        p0(J);
                    } else if (iA0 == 8 || iA0 == 12) {
                        p0(I);
                    } else if (iA0 == 17) {
                        buffer.skip(this.G);
                    } else if (iA0 == 18) {
                        throw new d1("Expected a value but was " + g.l(B()) + " at path " + l());
                    }
                }
                this.E = 0;
            }
            i7++;
            this.E = 0;
        } while (i7 != 0);
        int[] iArr = this.f22067v;
        int i10 = this.f22064d - 1;
        iArr[i10] = iArr[i10] + 1;
        this.f22066i[i10] = "null";
    }

    public final void Y() throws a1 {
        U("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x01b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:162:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:164:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:167:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:172:0x01ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:173:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:175:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:177:0x0201  */
    /* JADX WARN: Code duplicated, block: B:230:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0116 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x0117  */
    /* JADX WARN: Code duplicated, block: B:92:0x0128  */
    /* JADX WARN: Code duplicated, block: B:94:0x0131  */
    public final int a0() throws EOFException, a1 {
        int i7;
        String str;
        String str2;
        long j;
        char cN;
        char c8;
        int i10;
        int i11;
        int i12;
        byte bN;
        char c10;
        int[] iArr = this.f22065e;
        int i13 = this.f22064d - 1;
        int i14 = iArr[i13];
        Buffer buffer = this.f22069y;
        if (i14 == 1) {
            iArr[i13] = 2;
        } else if (i14 == 2) {
            int iL0 = l0(true);
            buffer.readByte();
            if (iL0 != 44) {
                if (iL0 == 59) {
                    Y();
                    throw null;
                }
                if (iL0 == 93) {
                    this.E = 4;
                    return 4;
                }
                U("Unterminated array");
                throw null;
            }
        } else {
            if (i14 == 3 || i14 == 5) {
                iArr[i13] = 4;
                if (i14 == 5) {
                    int iL1 = l0(true);
                    buffer.readByte();
                    if (iL1 != 44) {
                        if (iL1 == 59) {
                            Y();
                            throw null;
                        }
                        if (iL1 == 125) {
                            this.E = 2;
                            return 2;
                        }
                        U("Unterminated object");
                        throw null;
                    }
                }
                int iL2 = l0(true);
                if (iL2 == 34) {
                    buffer.readByte();
                    this.E = 13;
                    return 13;
                }
                if (iL2 == 39) {
                    buffer.readByte();
                    Y();
                    throw null;
                }
                if (iL2 != 125) {
                    Y();
                    throw null;
                }
                if (i14 == 5) {
                    U("Expected name");
                    throw null;
                }
                buffer.readByte();
                this.E = 2;
                return 2;
            }
            if (i14 == 4) {
                iArr[i13] = 5;
                int iL3 = l0(true);
                buffer.readByte();
                if (iL3 != 58) {
                    if (iL3 != 61) {
                        U("Expected ':'");
                        throw null;
                    }
                    Y();
                    throw null;
                }
            } else if (i14 == 6) {
                iArr[i13] = 7;
            } else {
                if (i14 == 7) {
                    if (l0(false) == -1) {
                        this.E = 18;
                        return 18;
                    }
                    Y();
                    throw null;
                }
                if (i14 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iL4 = l0(true);
        if (iL4 == 34) {
            buffer.readByte();
            this.E = 9;
            return 9;
        }
        if (iL4 == 39) {
            Y();
            throw null;
        }
        if (iL4 != 44 && iL4 != 59) {
            if (iL4 == 91) {
                buffer.readByte();
                this.E = 3;
                return 3;
            }
            if (iL4 != 93) {
                if (iL4 == 123) {
                    buffer.readByte();
                    this.E = 1;
                    return 1;
                }
                byte bN2 = buffer.n(0L);
                p pVar = this.f22068x;
                if (bN2 == 116 || bN2 == 84) {
                    i7 = 5;
                    str2 = "true";
                    str = "TRUE";
                } else {
                    if (bN2 != 102 && bN2 != 70) {
                        if (bN2 == 110 || bN2 == 78) {
                            i7 = 7;
                            str2 = "null";
                            str = "NULL";
                        } else {
                            j = 0;
                            i7 = 0;
                        }
                        if (i7 != 0) {
                            return i7;
                        }
                        boolean z5 = true;
                        long j5 = j;
                        c8 = 0;
                        i10 = 0;
                        boolean z6 = false;
                        while (true) {
                            i11 = i10 + 1;
                            if (pVar.N(i11)) {
                                bN = buffer.n(i10);
                                if (bN != 43) {
                                    if (bN != 69 || bN == 101) {
                                        c10 = 6;
                                        if (c8 != 2 || c8 == 4) {
                                            c8 = 5;
                                            i10 = i11;
                                        } else {
                                            i12 = 0;
                                        }
                                    } else if (bN == 45) {
                                        c10 = 6;
                                        if (c8 == 0) {
                                            c8 = 1;
                                            z6 = true;
                                        } else {
                                            if (c8 != 5) {
                                                i12 = 0;
                                            }
                                            c8 = c10;
                                        }
                                        i10 = i11;
                                    } else if (bN != 46) {
                                        if (bN >= 48 && bN <= 57) {
                                            if (c8 == 1 || c8 == 0) {
                                                c10 = 6;
                                                j5 = -(bN - 48);
                                                c8 = 2;
                                            } else {
                                                if (c8 == 2) {
                                                    if (j5 != j) {
                                                        long j7 = (10 * j5) - ((long) (bN - 48));
                                                        z5 &= j5 > -922337203685477580L || (j5 == -922337203685477580L && j7 < j5);
                                                        j5 = j7;
                                                    }
                                                } else if (c8 == 3) {
                                                    c8 = 4;
                                                } else {
                                                    c10 = 6;
                                                    if (c8 == 5 || c8 == 6) {
                                                        c8 = 7;
                                                    }
                                                }
                                                c10 = 6;
                                                i10 = i11;
                                            }
                                            i10 = i11;
                                        } else if (!e0(bN)) {
                                        }
                                        i12 = 0;
                                    } else {
                                        c10 = 6;
                                        if (c8 == 2) {
                                            c8 = 3;
                                            i10 = i11;
                                        } else {
                                            i12 = 0;
                                        }
                                    }
                                    if (i12 != 0) {
                                        return i12;
                                    }
                                    if (e0(buffer.n(j))) {
                                        Y();
                                        throw null;
                                    }
                                    U("Expected value");
                                    throw null;
                                }
                                c10 = 6;
                                if (c8 != 5) {
                                    i12 = 0;
                                    if (i12 != 0) {
                                        return i12;
                                    }
                                    if (e0(buffer.n(j))) {
                                        U("Expected value");
                                        throw null;
                                    }
                                    Y();
                                    throw null;
                                }
                                c8 = c10;
                                i10 = i11;
                            }
                            if (c8 != 2 && z5 && ((j5 != Long.MIN_VALUE || z6) && (j5 != j || !z6))) {
                                if (!z6) {
                                    j5 = -j5;
                                }
                                this.F = j5;
                                buffer.skip(i10);
                                i12 = 16;
                                this.E = 16;
                            } else if (c8 != 2 || c8 == 4 || c8 == 7) {
                                this.G = i10;
                                i12 = 17;
                                this.E = 17;
                            } else {
                                i12 = 0;
                            }
                            if (i12 != 0) {
                                return i12;
                            }
                            if (e0(buffer.n(j))) {
                                U("Expected value");
                                throw null;
                            }
                            Y();
                            throw null;
                        }
                    }
                    i7 = 6;
                    str2 = "false";
                    str = "FALSE";
                }
                int length = str2.length();
                j = 0;
                int i15 = 1;
                while (true) {
                    if (i15 >= length) {
                        if (!pVar.N(length + 1) || !e0(buffer.n(length))) {
                            buffer.skip(length);
                            this.E = i7;
                            break;
                        }
                    } else {
                        int i16 = i15 + 1;
                        if (pVar.N(i16) && ((cN = buffer.n(i15)) == str2.charAt(i15) || cN == str.charAt(i15))) {
                            i15 = i16;
                        }
                    }
                    i7 = 0;
                    break;
                }
                if (i7 != 0) {
                    return i7;
                }
                boolean z7 = true;
                long j10 = j;
                c8 = 0;
                i10 = 0;
                boolean z10 = false;
                while (true) {
                    i11 = i10 + 1;
                    if (pVar.N(i11)) {
                        bN = buffer.n(i10);
                        if (bN != 43) {
                            if (bN != 69) {
                                c10 = 6;
                                if (c8 != 2) {
                                }
                                c8 = 5;
                                i10 = i11;
                            } else {
                                c10 = 6;
                                if (c8 != 2) {
                                }
                                c8 = 5;
                                i10 = i11;
                            }
                            if (i12 != 0) {
                                return i12;
                            }
                            if (e0(buffer.n(j))) {
                                U("Expected value");
                                throw null;
                            }
                            Y();
                            throw null;
                        }
                        c10 = 6;
                        if (c8 != 5) {
                            i12 = 0;
                            if (i12 != 0) {
                                return i12;
                            }
                            if (e0(buffer.n(j))) {
                                U("Expected value");
                                throw null;
                            }
                            Y();
                            throw null;
                        }
                        c8 = c10;
                        i10 = i11;
                    }
                    if (c8 != 2) {
                        if (c8 != 2) {
                        }
                        this.G = i10;
                        i12 = 17;
                        this.E = 17;
                    } else {
                        if (c8 != 2) {
                        }
                        this.G = i10;
                        i12 = 17;
                        this.E = 17;
                    }
                    if (i12 != 0) {
                        return i12;
                    }
                    if (e0(buffer.n(j))) {
                        U("Expected value");
                        throw null;
                    }
                    Y();
                    throw null;
                }
            }
            if (i14 == 1) {
                buffer.readByte();
                this.E = 4;
                return 4;
            }
        }
        if (i14 == 1 || i14 == 2) {
            Y();
            throw null;
        }
        U("Unexpected value");
        throw null;
    }

    @Override // w4.a
    public final void c() throws EOFException, a1 {
        int iA0 = this.E;
        if (iA0 == 0) {
            iA0 = a0();
        }
        if (iA0 == 3) {
            O(1);
            this.f22067v[this.f22064d - 1] = 0;
            this.E = 0;
        } else {
            throw new d1("Expected BEGIN_ARRAY but was " + g.l(B()) + " at path " + l());
        }
    }

    public final int c0(String str, c cVar) {
        int length = ((String[]) cVar.f12759e).length;
        for (int i7 = 0; i7 < length; i7++) {
            if (str.equals(((String[]) cVar.f12759e)[i7])) {
                this.E = 0;
                this.f22066i[this.f22064d - 1] = str;
                return i7;
            }
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        this.E = 0;
        this.f22065e[0] = 8;
        this.f22064d = 1;
        this.f22069y.c();
        this.f22068x.close();
    }

    public final boolean e0(int i7) throws a1 {
        if (i7 == 9 || i7 == 10 || i7 == 12 || i7 == 13 || i7 == 32) {
            return false;
        }
        if (i7 != 35) {
            if (i7 == 44) {
                return false;
            }
            if (i7 != 47 && i7 != 61) {
                if (i7 == 123 || i7 == 125 || i7 == 58) {
                    return false;
                }
                if (i7 != 59) {
                    switch (i7) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        Y();
        throw null;
    }

    @Override // w4.a
    public final void f() throws EOFException, a1 {
        int iA0 = this.E;
        if (iA0 == 0) {
            iA0 = a0();
        }
        if (iA0 == 1) {
            O(3);
            this.E = 0;
        } else {
            throw new d1("Expected BEGIN_OBJECT but was " + g.l(B()) + " at path " + l());
        }
    }

    @Override // w4.a
    public final void g() throws EOFException, a1 {
        int iA0 = this.E;
        if (iA0 == 0) {
            iA0 = a0();
        }
        if (iA0 != 4) {
            throw new d1("Expected END_ARRAY but was " + g.l(B()) + " at path " + l());
        }
        int i7 = this.f22064d;
        this.f22064d = i7 - 1;
        int[] iArr = this.f22067v;
        int i10 = i7 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.E = 0;
    }

    @Override // w4.a
    public final void i() throws EOFException, a1 {
        int iA0 = this.E;
        if (iA0 == 0) {
            iA0 = a0();
        }
        if (iA0 != 2) {
            throw new d1("Expected END_OBJECT but was " + g.l(B()) + " at path " + l());
        }
        int i7 = this.f22064d;
        int i10 = i7 - 1;
        this.f22064d = i10;
        this.f22066i[i10] = null;
        int[] iArr = this.f22067v;
        int i11 = i7 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.E = 0;
    }

    public final String j0() throws EOFException, a1 {
        String strM0;
        int iA0 = this.E;
        if (iA0 == 0) {
            iA0 = a0();
        }
        if (iA0 == 14) {
            strM0 = n0();
        } else if (iA0 == 13) {
            strM0 = m0(J);
        } else if (iA0 == 12) {
            strM0 = m0(I);
        } else {
            if (iA0 != 15) {
                throw new d1("Expected a name but was " + g.l(B()) + " at path " + l());
            }
            strM0 = this.H;
        }
        this.E = 0;
        this.f22066i[this.f22064d - 1] = strM0;
        return strM0;
    }

    public final int l0(boolean z5) throws EOFException, a1 {
        int i7 = 0;
        while (true) {
            int i10 = i7 + 1;
            p pVar = this.f22068x;
            if (!pVar.N(i10)) {
                if (z5) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i7;
            Buffer buffer = this.f22069y;
            byte bN = buffer.n(j);
            if (bN != 10 && bN != 32 && bN != 13 && bN != 9) {
                buffer.skip(j);
                if (bN == 47) {
                    if (pVar.N(2L)) {
                        Y();
                        throw null;
                    }
                } else if (bN == 35) {
                    Y();
                    throw null;
                }
                return bN;
            }
            i7 = i10;
        }
    }

    public final String m0(ByteString byteString) throws EOFException, a1 {
        StringBuilder sb2 = null;
        while (true) {
            long jG = this.f22068x.g(byteString);
            if (jG == -1) {
                U("Unterminated string");
                throw null;
            }
            Buffer buffer = this.f22069y;
            if (buffer.n(jG) != 92) {
                if (sb2 == null) {
                    String strO = buffer.O(jG, Charsets.UTF_8);
                    buffer.readByte();
                    return strO;
                }
                sb2.append(buffer.O(jG, Charsets.UTF_8));
                buffer.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(buffer.O(jG, Charsets.UTF_8));
            buffer.readByte();
            sb2.append(o0());
        }
    }

    @Override // w4.a
    public final boolean n() throws EOFException, a1 {
        int iA0 = this.E;
        if (iA0 == 0) {
            iA0 = a0();
        }
        return (iA0 == 2 || iA0 == 4 || iA0 == 18) ? false : true;
    }

    public final String n0() {
        long jG = this.f22068x.g(K);
        Buffer buffer = this.f22069y;
        if (jG == -1) {
            return buffer.V();
        }
        buffer.getClass();
        return buffer.O(jG, Charsets.UTF_8);
    }

    public final char o0() throws EOFException, a1 {
        int i7;
        p pVar = this.f22068x;
        if (!pVar.N(1L)) {
            U("Unterminated escape sequence");
            throw null;
        }
        Buffer buffer = this.f22069y;
        byte b10 = buffer.readByte();
        if (b10 == 10 || b10 == 34 || b10 == 39 || b10 == 47 || b10 == 92) {
            return (char) b10;
        }
        if (b10 == 98) {
            return '\b';
        }
        if (b10 == 102) {
            return '\f';
        }
        if (b10 == 110) {
            return '\n';
        }
        if (b10 == 114) {
            return '\r';
        }
        if (b10 == 116) {
            return '\t';
        }
        if (b10 != 117) {
            U("Invalid escape sequence: \\" + ((char) b10));
            throw null;
        }
        if (!pVar.N(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + l());
        }
        char c8 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            byte bN = buffer.n(i10);
            char c10 = (char) (c8 << 4);
            if (bN >= 48 && bN <= 57) {
                i7 = bN - 48;
            } else if (bN >= 97 && bN <= 102) {
                i7 = bN - 87;
            } else {
                if (bN < 65 || bN > 70) {
                    U("\\u".concat(buffer.O(4L, Charsets.UTF_8)));
                    throw null;
                }
                i7 = bN - 55;
            }
            c8 = (char) (i7 + c10);
        }
        buffer.skip(4L);
        return c8;
    }

    public final void p0(ByteString byteString) throws EOFException, a1 {
        while (true) {
            long jG = this.f22068x.g(byteString);
            if (jG == -1) {
                U("Unterminated string");
                throw null;
            }
            Buffer buffer = this.f22069y;
            if (buffer.n(jG) != 92) {
                buffer.skip(jG + 1);
                return;
            } else {
                buffer.skip(jG + 1);
                o0();
            }
        }
    }

    @Override // w4.a
    public final boolean q() throws EOFException, a1 {
        int iA0 = this.E;
        if (iA0 == 0) {
            iA0 = a0();
        }
        if (iA0 == 5) {
            this.E = 0;
            int[] iArr = this.f22067v;
            int i7 = this.f22064d - 1;
            iArr[i7] = iArr[i7] + 1;
            return true;
        }
        if (iA0 == 6) {
            this.E = 0;
            int[] iArr2 = this.f22067v;
            int i10 = this.f22064d - 1;
            iArr2[i10] = iArr2[i10] + 1;
            return false;
        }
        throw new d1("Expected a boolean but was " + g.l(B()) + " at path " + l());
    }

    public final String toString() {
        return "JsonReader(" + this.f22068x + ")";
    }

    @Override // w4.a
    public final double u() throws EOFException, a1 {
        int iA0 = this.E;
        if (iA0 == 0) {
            iA0 = a0();
        }
        if (iA0 == 16) {
            this.E = 0;
            int[] iArr = this.f22067v;
            int i7 = this.f22064d - 1;
            iArr[i7] = iArr[i7] + 1;
            return this.F;
        }
        if (iA0 == 17) {
            long j = this.G;
            Buffer buffer = this.f22069y;
            buffer.getClass();
            this.H = buffer.O(j, Charsets.UTF_8);
        } else if (iA0 == 9) {
            this.H = m0(J);
        } else if (iA0 == 8) {
            this.H = m0(I);
        } else if (iA0 == 10) {
            this.H = n0();
        } else if (iA0 != 11) {
            throw new d1("Expected a double but was " + g.l(B()) + " at path " + l());
        }
        this.E = 11;
        try {
            double d6 = Double.parseDouble(this.H);
            if (Double.isNaN(d6) || Double.isInfinite(d6)) {
                throw new a1("JSON forbids NaN and infinities: " + d6 + " at path " + l());
            }
            this.H = null;
            this.E = 0;
            int[] iArr2 = this.f22067v;
            int i10 = this.f22064d - 1;
            iArr2[i10] = iArr2[i10] + 1;
            return d6;
        } catch (NumberFormatException unused) {
            throw new d1("Expected a double but was " + this.H + " at path " + l());
        }
    }

    @Override // w4.a
    public final int y() throws EOFException, a1 {
        int iA0 = this.E;
        if (iA0 == 0) {
            iA0 = a0();
        }
        if (iA0 == 16) {
            long j = this.F;
            int i7 = (int) j;
            if (j == i7) {
                this.E = 0;
                int[] iArr = this.f22067v;
                int i10 = this.f22064d - 1;
                iArr[i10] = iArr[i10] + 1;
                return i7;
            }
            throw new d1("Expected an int but was " + this.F + " at path " + l());
        }
        if (iA0 == 17) {
            long j5 = this.G;
            Buffer buffer = this.f22069y;
            buffer.getClass();
            this.H = buffer.O(j5, Charsets.UTF_8);
        } else if (iA0 == 9 || iA0 == 8) {
            String strM0 = iA0 == 9 ? m0(J) : m0(I);
            this.H = strM0;
            try {
                int i11 = Integer.parseInt(strM0);
                this.E = 0;
                int[] iArr2 = this.f22067v;
                int i12 = this.f22064d - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return i11;
            } catch (NumberFormatException unused) {
            }
        } else if (iA0 != 11) {
            throw new d1("Expected an int but was " + g.l(B()) + " at path " + l());
        }
        this.E = 11;
        try {
            double d6 = Double.parseDouble(this.H);
            int i13 = (int) d6;
            if (i13 != d6) {
                throw new d1("Expected an int but was " + this.H + " at path " + l());
            }
            this.H = null;
            this.E = 0;
            int[] iArr3 = this.f22067v;
            int i14 = this.f22064d - 1;
            iArr3[i14] = iArr3[i14] + 1;
            return i13;
        } catch (NumberFormatException unused2) {
            throw new d1("Expected an int but was " + this.H + " at path " + l());
        }
    }

    @Override // w4.a
    public final String z() throws EOFException, a1 {
        String strO;
        int iA0 = this.E;
        if (iA0 == 0) {
            iA0 = a0();
        }
        if (iA0 == 10) {
            strO = n0();
        } else if (iA0 == 9) {
            strO = m0(J);
        } else if (iA0 == 8) {
            strO = m0(I);
        } else if (iA0 == 11) {
            strO = this.H;
            this.H = null;
        } else if (iA0 == 16) {
            strO = Long.toString(this.F);
        } else {
            if (iA0 != 17) {
                throw new d1("Expected a string but was " + g.l(B()) + " at path " + l());
            }
            long j = this.G;
            Buffer buffer = this.f22069y;
            buffer.getClass();
            strO = buffer.O(j, Charsets.UTF_8);
        }
        this.E = 0;
        int[] iArr = this.f22067v;
        int i7 = this.f22064d - 1;
        iArr[i7] = iArr[i7] + 1;
        return strO;
    }
}
