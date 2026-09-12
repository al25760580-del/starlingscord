package pc;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17881a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f17883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f17884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f17885e;

    public f(c cVar, e eVar, long j, long j5, long j7, long j10, long j11, int i7) {
        this.f17884d = eVar;
        this.f17882b = i7;
        this.f17883c = new a(cVar, j, j5, j7, j10, j11);
    }

    public static int B(l lVar, long j, n nVar) {
        if (j == lVar.getPosition()) {
            return 0;
        }
        nVar.f17905a = j;
        return 1;
    }

    public static /* synthetic */ void q(f fVar, String str, int i7, String str2, int i10) {
        if ((i10 & 2) != 0) {
            i7 = fVar.f17882b;
        }
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        fVar.p(i7, str, str2);
        throw null;
    }

    public static /* synthetic */ void s(f fVar, byte b10) {
        fVar.r(b10, true);
        throw null;
    }

    public static boolean w(char c8) {
        return (c8 == ',' || c8 == ':' || c8 == ']' || c8 == '}') ? false : true;
    }

    public abstract int A(int i7);

    public void C(long j) {
        b bVar = (b) this.f17885e;
        if (bVar == null || bVar.f17869a != j) {
            a aVar = (a) this.f17883c;
            this.f17885e = new b(j, aVar.f17863a.d(j), aVar.f17865c, aVar.f17866d, aVar.f17867e, aVar.f17868f);
        }
    }

    public abstract int D();

    public String E(int i7, int i10) {
        return u().subSequence(i7, i10).toString();
    }

    public boolean F() {
        int iD = D();
        CharSequence charSequenceU = u();
        if (iD >= charSequenceU.length() || iD == -1 || charSequenceU.charAt(iD) != ',') {
            return false;
        }
        this.f17882b++;
        return true;
    }

    public void G(char c8) {
        int i7 = this.f17882b;
        if (i7 > 0 && c8 == '\"') {
            try {
                this.f17882b = i7 - 1;
                String strL = l();
                this.f17882b = i7;
                if (Intrinsics.areEqual(strL, "null")) {
                    p(this.f17882b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th2) {
                this.f17882b = i7;
                throw th2;
            }
        }
        s(this, qr.p.h(c8));
        throw null;
    }

    public int a(int i7, CharSequence charSequence) {
        int i10 = i7 + 4;
        if (i10 < charSequence.length()) {
            ((StringBuilder) this.f17885e).append((char) (t(i7 + 3, charSequence) + (t(i7, charSequence) << 12) + (t(i7 + 1, charSequence) << 8) + (t(i7 + 2, charSequence) << 4)));
            return i10;
        }
        this.f17882b = i7;
        n();
        if (this.f17882b + 4 < charSequence.length()) {
            return a(this.f17882b, charSequence);
        }
        q(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void b(int i7, int i10) {
        ((StringBuilder) this.f17885e).append(u(), i7, i10);
    }

    public abstract boolean c();

    public void d(int i7, String str) {
        if (u().length() - i7 < str.length()) {
            q(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) != (u().charAt(i7 + i10) | ' ')) {
                q(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f17882b = str.length() + i7;
    }

    public abstract String e();

    public abstract byte f();

    public byte g(byte b10) {
        byte bF = f();
        if (bF == b10) {
            return bF;
        }
        s(this, b10);
        throw null;
    }

    public abstract void h(char c8);

    public long i() {
        boolean z5;
        boolean z6;
        double dPow;
        int iA = A(D());
        int i7 = 0;
        if (iA >= u().length() || iA == -1) {
            q(this, "EOF", 0, null, 6);
            throw null;
        }
        if (u().charAt(iA) == '\"') {
            iA++;
            if (iA == u().length()) {
                q(this, "EOF", 0, null, 6);
                throw null;
            }
            z5 = true;
        } else {
            z5 = false;
        }
        int i10 = iA;
        int i11 = 0;
        boolean z7 = false;
        boolean z10 = false;
        long j = 0;
        long j5 = 0;
        while (true) {
            if (i10 == u().length()) {
                z5 = z5;
                z6 = z7;
                break;
            }
            char cCharAt = u().charAt(i10);
            if ((cCharAt != 'e' && cCharAt != 'E') || z7) {
                z5 = z5;
                if (cCharAt == '-' && z7) {
                    if (i10 == iA) {
                        q(this, "Unexpected symbol '-' in numeric literal", i7, null, 6);
                        throw null;
                    }
                    i10++;
                    i11 = i7;
                } else if (cCharAt != '+' || !z7) {
                    z6 = z7;
                    if (cCharAt != '-') {
                        if (qr.p.h(cCharAt) != 0) {
                            break;
                        }
                        i10++;
                        int i12 = cCharAt - '0';
                        if (i12 < 0 || i12 >= 10) {
                            q(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i7, null, 6);
                            throw null;
                        }
                        if (z6) {
                            j = (j * ((long) 10)) + ((long) i12);
                            z7 = z6;
                        } else {
                            j5 = (j5 * ((long) 10)) - ((long) i12);
                            if (j5 > 0) {
                                q(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                            z5 = z5;
                            z7 = z6;
                            i7 = 0;
                        }
                    } else {
                        if (i10 != iA) {
                            q(this, "Unexpected symbol '-' in numeric literal", i7, null, 6);
                            throw null;
                        }
                        i10++;
                        z5 = z5;
                        z7 = z6;
                        z10 = true;
                    }
                } else {
                    if (i10 == iA) {
                        q(this, "Unexpected symbol '+' in numeric literal", i7, null, 6);
                        throw null;
                    }
                    i10++;
                    z5 = z5;
                    i11 = 1;
                }
            } else {
                if (i10 == iA) {
                    q(this, "Unexpected symbol " + cCharAt + " in numeric literal", i7, null, 6);
                    throw null;
                }
                i10++;
                i11 = 1;
                z7 = true;
            }
        }
        boolean z11 = i10 != iA;
        if (iA == i10 || (z10 && iA == i10 - 1)) {
            q(this, "Expected numeric literal", 0, null, 6);
            throw null;
        }
        if (z5) {
            if (!z11) {
                q(this, "EOF", 0, null, 6);
                throw null;
            }
            if (u().charAt(i10) != '\"') {
                q(this, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            i10++;
        }
        this.f17882b = i10;
        if (z6) {
            double d6 = j5;
            if (i11 == 0) {
                dPow = Math.pow(10.0d, -j);
            } else {
                if (i11 != 1) {
                    throw new rn.n();
                }
                dPow = Math.pow(10.0d, j);
            }
            double d7 = d6 * dPow;
            if (d7 > 9.223372036854776E18d || d7 < -9.223372036854776E18d) {
                q(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d7) != d7) {
                q(this, "Can't convert " + d7 + " to Long", 0, null, 6);
                throw null;
            }
            j5 = (long) d7;
        }
        if (z10) {
            return j5;
        }
        if (j5 != Long.MIN_VALUE) {
            return -j5;
        }
        q(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public String j() {
        String str = (String) this.f17884d;
        if (str == null) {
            return e();
        }
        Intrinsics.checkNotNull(str);
        this.f17884d = null;
        return str;
    }

    public String k(CharSequence source, int i7, int i10) {
        Intrinsics.checkNotNullParameter(source, "source");
        char cCharAt = source.charAt(i10);
        boolean z5 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                b(i7, i10);
                int iA = A(i10 + 1);
                if (iA == -1) {
                    q(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
                int iA2 = iA + 1;
                char cCharAt2 = u().charAt(iA);
                if (cCharAt2 == 'u') {
                    iA2 = a(iA2, u());
                } else {
                    char c8 = cCharAt2 < 'u' ? qr.h.f19014a[cCharAt2] : (char) 0;
                    if (c8 == 0) {
                        q(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                        throw null;
                    }
                    ((StringBuilder) this.f17885e).append(c8);
                }
                i7 = A(iA2);
                if (i7 == -1) {
                    q(this, "Unexpected EOF", i7, null, 4);
                    throw null;
                }
            } else {
                i10++;
                if (i10 >= source.length()) {
                    b(i7, i10);
                    i7 = A(i10);
                    if (i7 == -1) {
                        q(this, "Unexpected EOF", i7, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                }
                cCharAt = source.charAt(i10);
            }
            i10 = i7;
            z5 = true;
            cCharAt = source.charAt(i10);
        }
        String strE = !z5 ? E(i7, i10) : m(i7, i10);
        this.f17882b = i10 + 1;
        return strE;
    }

    public String l() {
        String str = (String) this.f17884d;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            this.f17884d = null;
            return str;
        }
        int iD = D();
        if (iD >= u().length() || iD == -1) {
            q(this, "EOF", iD, null, 4);
            throw null;
        }
        byte bH = qr.p.h(u().charAt(iD));
        if (bH == 1) {
            return j();
        }
        if (bH != 0) {
            q(this, "Expected beginning of the string, but got " + u().charAt(iD), 0, null, 6);
            throw null;
        }
        boolean z5 = false;
        while (qr.p.h(u().charAt(iD)) == 0) {
            iD++;
            if (iD >= u().length()) {
                b(this.f17882b, iD);
                int iA = A(iD);
                if (iA == -1) {
                    this.f17882b = iD;
                    return m(0, 0);
                }
                iD = iA;
                z5 = true;
            }
        }
        String strE = !z5 ? E(this.f17882b, iD) : m(this.f17882b, iD);
        this.f17882b = iD;
        return strE;
    }

    public String m(int i7, int i10) {
        b(i7, i10);
        StringBuilder sb2 = (StringBuilder) this.f17885e;
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb2.setLength(0);
        return string;
    }

    public void o() {
        if (f() == 10) {
            return;
        }
        q(this, "Expected EOF after parsing, but had " + u().charAt(this.f17882b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public void p(int i7, String message, String hint) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        String strConcat = hint.length() == 0 ? "" : ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE.concat(hint);
        StringBuilder sbO = kk.b.o(message, " at path: ");
        sbO.append(((a1.d) this.f17883c).i());
        sbO.append(strConcat);
        throw qr.p.d(i7, u(), sbO.toString());
    }

    public void r(byte b10, boolean z5) {
        String strT = qr.p.t(b10);
        int i7 = z5 ? this.f17882b - 1 : this.f17882b;
        q(this, s0.g.f("Expected ", strT, ", but had '", (this.f17882b == u().length() || i7 < 0) ? "EOF" : String.valueOf(u().charAt(i7)), "' instead"), i7, null, 4);
        throw null;
    }

    public int t(int i7, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i7);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        q(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public String toString() {
        switch (this.f17881a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("JsonReader(source='");
                sb2.append((Object) u());
                sb2.append("', currentPosition=");
                return com.discord.chat.presentation.list.a.j(sb2, this.f17882b, ')');
            default:
                return super.toString();
        }
    }

    public abstract CharSequence u();

    public int v(l lVar, n nVar) {
        e eVar = (e) this.f17884d;
        while (true) {
            b bVar = (b) this.f17885e;
            je.b.l(bVar);
            long j = bVar.f17874f;
            long j5 = bVar.f17875g;
            long j7 = bVar.f17876h;
            if (j5 - j <= this.f17882b) {
                this.f17885e = null;
                eVar.y();
                return B(lVar, j, nVar);
            }
            long position = j7 - lVar.getPosition();
            if (position < 0 || position > 262144) {
                return B(lVar, j7, nVar);
            }
            lVar.u((int) position);
            lVar.t();
            d dVarC = eVar.c(lVar, bVar.f17870b);
            int i7 = dVarC.f17878a;
            long j10 = dVarC.f17879b;
            long j11 = dVarC.f17880c;
            if (i7 == -3) {
                this.f17885e = null;
                eVar.y();
                return B(lVar, j7, nVar);
            }
            if (i7 == -2) {
                bVar.f17872d = j10;
                bVar.f17874f = j11;
                bVar.f17876h = b.a(bVar.f17870b, j10, bVar.f17873e, j11, bVar.f17875g, bVar.f17871c);
            } else {
                if (i7 != -1) {
                    if (i7 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long position2 = j11 - lVar.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        lVar.u((int) position2);
                    }
                    this.f17885e = null;
                    eVar.y();
                    return B(lVar, j11, nVar);
                }
                bVar.f17873e = j10;
                bVar.f17875g = j11;
                bVar.f17876h = b.a(bVar.f17870b, bVar.f17872d, j10, bVar.f17874f, j11, bVar.f17871c);
            }
        }
    }

    public abstract String x(String str);

    public byte y() {
        CharSequence charSequenceU = u();
        int i7 = this.f17882b;
        while (true) {
            int iA = A(i7);
            if (iA == -1) {
                this.f17882b = iA;
                return (byte) 10;
            }
            char cCharAt = charSequenceU.charAt(iA);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f17882b = iA;
                return qr.p.h(cCharAt);
            }
            i7 = iA + 1;
        }
    }

    public String z() {
        if (y() != 1) {
            return null;
        }
        String strJ = j();
        this.f17884d = strJ;
        return strJ;
    }

    public f() {
        a1.d dVar = new a1.d(12, (byte) 0);
        dVar.f18i = new Object[8];
        int[] iArr = new int[8];
        for (int i7 = 0; i7 < 8; i7++) {
            iArr[i7] = -1;
        }
        dVar.f19v = iArr;
        dVar.f17e = -1;
        this.f17883c = dVar;
        this.f17885e = new StringBuilder();
    }

    public void n() {
    }
}
