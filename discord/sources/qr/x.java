package qr;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.nio.charset.CharacterCodingException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class x extends pc.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pc.r f19049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final char[] f19050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f19052i;

    public x(pc.r reader, char[] buffer) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f19049f = reader;
        this.f19050g = buffer;
        this.f19051h = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        this.f19052i = new b(buffer);
        H(0);
    }

    @Override // pc.f
    public final int A(int i7) throws CharacterCodingException {
        b bVar = this.f19052i;
        if (i7 < bVar.f18997e) {
            return i7;
        }
        this.f17882b = i7;
        n();
        return (this.f17882b != 0 || bVar.length() == 0) ? -1 : 0;
    }

    @Override // pc.f
    public int D() throws CharacterCodingException {
        int iA;
        char c8;
        int i7 = this.f17882b;
        while (true) {
            iA = A(i7);
            if (iA == -1 || !((c8 = this.f19052i.f18996d[iA]) == ' ' || c8 == '\n' || c8 == '\r' || c8 == '\t')) {
                break;
            }
            i7 = iA + 1;
        }
        this.f17882b = iA;
        return iA;
    }

    @Override // pc.f
    public final String E(int i7, int i10) {
        b bVar = this.f19052i;
        return kotlin.text.x.f(bVar.f18996d, i7, Math.min(i10, bVar.f18997e));
    }

    public final void H(int i7) throws CharacterCodingException {
        b bVar = this.f19052i;
        char[] buffer = bVar.f18996d;
        if (i7 != 0) {
            int i10 = this.f17882b;
            Intrinsics.checkNotNullParameter(buffer, "<this>");
            Intrinsics.checkNotNullParameter(buffer, "destination");
            System.arraycopy(buffer, i10, buffer, 0, (i10 + i7) - i10);
        }
        int i11 = bVar.f18997e;
        while (i7 != i11) {
            pc.r rVar = this.f19049f;
            rVar.getClass();
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            int iA = ((i) rVar.f17922d).a(buffer, i7, i11 - i7);
            if (iA == -1) {
                bVar.f18997e = Math.min(bVar.f18996d.length, i7);
                this.f19051h = -1;
                break;
            }
            i7 += iA;
        }
        this.f17882b = 0;
    }

    public final void I() {
        g gVar = g.f19013c;
        gVar.getClass();
        char[] array = this.f19050g;
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length == 16384) {
            gVar.a(array);
        } else {
            throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + array.length).toString());
        }
    }

    @Override // pc.f
    public final void b(int i7, int i10) {
        StringBuilder sb2 = (StringBuilder) this.f17885e;
        sb2.append(this.f19052i.f18996d, i7, i10 - i7);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
    }

    @Override // pc.f
    public boolean c() throws CharacterCodingException {
        n();
        int i7 = this.f17882b;
        while (true) {
            int iA = A(i7);
            if (iA == -1) {
                this.f17882b = iA;
                return false;
            }
            char c8 = this.f19052i.f18996d[iA];
            if (c8 != ' ' && c8 != '\n' && c8 != '\r' && c8 != '\t') {
                this.f17882b = iA;
                return pc.f.w(c8);
            }
            i7 = iA + 1;
        }
    }

    @Override // pc.f
    public final String e() throws CharacterCodingException {
        h('\"');
        int i7 = this.f17882b;
        b bVar = this.f19052i;
        int i10 = bVar.f18997e;
        char[] cArr = bVar.f18996d;
        int i11 = i7;
        while (true) {
            if (i11 >= i10) {
                i11 = -1;
                break;
            }
            if (cArr[i11] == '\"') {
                break;
            }
            i11++;
        }
        if (i11 == -1) {
            int iA = A(i7);
            if (iA != -1) {
                return k(bVar, this.f17882b, iA);
            }
            pc.f.s(this, (byte) 1);
            throw null;
        }
        for (int i12 = i7; i12 < i11; i12++) {
            if (cArr[i12] == '\\') {
                return k(bVar, this.f17882b, i12);
            }
        }
        this.f17882b = i11 + 1;
        return kotlin.text.x.f(cArr, i7, Math.min(i11, bVar.f18997e));
    }

    @Override // pc.f
    public byte f() throws CharacterCodingException {
        n();
        int i7 = this.f17882b;
        while (true) {
            int iA = A(i7);
            if (iA == -1) {
                this.f17882b = iA;
                return (byte) 10;
            }
            int i10 = iA + 1;
            byte bH = p.h(this.f19052i.f18996d[iA]);
            if (bH != 3) {
                this.f17882b = i10;
                return bH;
            }
            i7 = i10;
        }
    }

    @Override // pc.f
    public void h(char c8) throws CharacterCodingException {
        n();
        int i7 = this.f17882b;
        while (true) {
            int iA = A(i7);
            if (iA == -1) {
                this.f17882b = iA;
                G(c8);
                throw null;
            }
            int i10 = iA + 1;
            char c10 = this.f19052i.f18996d[iA];
            if (c10 != ' ' && c10 != '\n' && c10 != '\r' && c10 != '\t') {
                this.f17882b = i10;
                if (c10 == c8) {
                    return;
                }
                G(c8);
                throw null;
            }
            i7 = i10;
        }
    }

    @Override // pc.f
    public final void n() throws CharacterCodingException {
        int i7 = this.f19052i.f18997e - this.f17882b;
        if (i7 > this.f19051h) {
            return;
        }
        H(i7);
    }

    @Override // pc.f
    public final CharSequence u() {
        return this.f19052i;
    }

    @Override // pc.f
    public final String x(String keyToMatch) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        return null;
    }
}
