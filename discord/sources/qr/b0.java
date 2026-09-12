package qr;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public class b0 extends pc.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18998f;

    public b0(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f18998f = source;
    }

    @Override // pc.f
    public final int A(int i7) {
        if (i7 < this.f18998f.length()) {
            return i7;
        }
        return -1;
    }

    @Override // pc.f
    public int D() {
        char cCharAt;
        int i7 = this.f17882b;
        if (i7 == -1) {
            return i7;
        }
        while (true) {
            String str = this.f18998f;
            if (i7 >= str.length() || !((cCharAt = str.charAt(i7)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i7++;
        }
        this.f17882b = i7;
        return i7;
    }

    @Override // pc.f
    public boolean c() {
        int i7 = this.f17882b;
        if (i7 == -1) {
            return false;
        }
        while (true) {
            String str = this.f18998f;
            if (i7 >= str.length()) {
                this.f17882b = i7;
                return false;
            }
            char cCharAt = str.charAt(i7);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f17882b = i7;
                return pc.f.w(cCharAt);
            }
            i7++;
        }
    }

    @Override // pc.f
    public final String e() {
        h('\"');
        int i7 = this.f17882b;
        String str = this.f18998f;
        int I = StringsKt.I(str, '\"', i7, 4);
        if (I == -1) {
            l();
            r((byte) 1, false);
            throw null;
        }
        for (int i10 = i7; i10 < I; i10++) {
            if (str.charAt(i10) == '\\') {
                return k(str, this.f17882b, i10);
            }
        }
        this.f17882b = I + 1;
        String strSubstring = str.substring(i7, I);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // pc.f
    public byte f() {
        String str;
        int i7 = this.f17882b;
        while (true) {
            str = this.f18998f;
            if (i7 == -1 || i7 >= str.length()) {
                break;
            }
            int i10 = i7 + 1;
            char cCharAt = str.charAt(i7);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f17882b = i10;
                return p.h(cCharAt);
            }
            i7 = i10;
        }
        this.f17882b = str.length();
        return (byte) 10;
    }

    @Override // pc.f
    public void h(char c8) {
        int i7 = this.f17882b;
        if (i7 == -1) {
            G(c8);
            throw null;
        }
        while (true) {
            String str = this.f18998f;
            if (i7 >= str.length()) {
                this.f17882b = -1;
                G(c8);
                throw null;
            }
            int i10 = i7 + 1;
            char cCharAt = str.charAt(i7);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f17882b = i10;
                if (cCharAt == c8) {
                    return;
                }
                G(c8);
                throw null;
            }
            i7 = i10;
        }
    }

    @Override // pc.f
    public final CharSequence u() {
        return this.f18998f;
    }

    @Override // pc.f
    public final String x(String keyToMatch) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        int i7 = this.f17882b;
        try {
            if (f() == 6 && Intrinsics.areEqual(z(), keyToMatch)) {
                this.f17884d = null;
                if (f() == 5) {
                    return z();
                }
            }
            return null;
        } finally {
            this.f17882b = i7;
            this.f17884d = null;
        }
    }
}
