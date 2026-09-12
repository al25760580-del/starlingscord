package de;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import di.d;
import java.nio.charset.Charset;
import java.util.List;
import je.e0;
import je.w;
import s0.g;
import vd.c;
import vd.e;
import vd.f;
import vd.h;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w f7617m = new w();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f7618n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f7619o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f7620p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f7621q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f7622r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f7623s;

    public a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f7619o = 0;
            this.f7620p = -1;
            this.f7621q = "sans-serif";
            this.f7618n = false;
            this.f7622r = 0.85f;
            this.f7623s = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f7619o = bArr[24];
        this.f7620p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f7621q = "Serif".equals(new String(bArr, 43, bArr.length - 43, d.f7631c)) ? "serif" : "sans-serif";
        int i7 = bArr[25] * 20;
        this.f7623s = i7;
        boolean z5 = (bArr[0] & 32) != 0;
        this.f7618n = z5;
        if (z5) {
            this.f7622r = e0.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i7, 0.0f, 0.95f);
        } else {
            this.f7622r = 0.85f;
        }
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, int i7, int i10, int i11, int i12, int i13) {
        if (i7 != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i7 >>> 8) | ((i7 & 255) << 24)), i11, i12, i13 | 33);
        }
    }

    public static void i(SpannableStringBuilder spannableStringBuilder, int i7, int i10, int i11, int i12, int i13) {
        if (i7 != i10) {
            int i14 = i13 | 33;
            boolean z5 = (i7 & 1) != 0;
            boolean z6 = (i7 & 2) != 0;
            if (z5) {
                if (z6) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i11, i12, i14);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i11, i12, i14);
                }
            } else if (z6) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, i12, i14);
            }
            boolean z7 = (i7 & 4) != 0;
            if (z7) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, i14);
            }
            if (z7 || z5 || z6) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i11, i12, i14);
        }
    }

    @Override // vd.e
    public final f e(byte[] bArr, int i7, boolean z5) throws h {
        String strS;
        w wVar = this.f7617m;
        wVar.D(bArr, i7);
        int i10 = 2;
        if (wVar.a() < 2) {
            throw new h("Unexpected subtitle format.");
        }
        int iZ = wVar.z();
        if (iZ == 0) {
            strS = "";
        } else {
            int i11 = wVar.f13861b;
            Charset charsetB = wVar.B();
            int i12 = iZ - (wVar.f13861b - i11);
            if (charsetB == null) {
                charsetB = d.f7631c;
            }
            strS = wVar.s(i12, charsetB);
        }
        if (strS.isEmpty()) {
            return b.f7624e;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strS);
        i(spannableStringBuilder, this.f7619o, 0, 0, spannableStringBuilder.length(), 16711680);
        h(spannableStringBuilder, this.f7620p, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        int i13 = 0;
        String str = this.f7621q;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fH = this.f7622r;
        while (wVar.a() >= 8) {
            int i14 = wVar.f13861b;
            int iG = wVar.g();
            int iG2 = wVar.g();
            if (iG2 == 1937013100) {
                if (wVar.a() < i10) {
                    throw new h("Unexpected subtitle format.");
                }
                int iZ2 = wVar.z();
                int i15 = i13;
                while (i15 < iZ2) {
                    if (wVar.a() < 12) {
                        throw new h("Unexpected subtitle format.");
                    }
                    int iZ3 = wVar.z();
                    int iZ4 = wVar.z();
                    wVar.G(i10);
                    int iU = wVar.u();
                    wVar.G(1);
                    int iG3 = wVar.g();
                    if (iZ4 > spannableStringBuilder.length()) {
                        StringBuilder sbS = a3.e.s(iZ4, "Truncating styl end (", ") to cueText.length() (");
                        sbS.append(spannableStringBuilder.length());
                        sbS.append(").");
                        je.b.N("Tx3gDecoder", sbS.toString());
                        iZ4 = spannableStringBuilder.length();
                    }
                    int i16 = iZ4;
                    if (iZ3 >= i16) {
                        je.b.N("Tx3gDecoder", g.c(iZ3, "Ignoring styl with start (", i16, ") >= end (", ")."));
                    } else {
                        i(spannableStringBuilder, iU, this.f7619o, iZ3, i16, 0);
                        h(spannableStringBuilder, iG3, this.f7620p, iZ3, i16, 0);
                    }
                    i15++;
                    i10 = 2;
                }
            } else if (iG2 == 1952608120 && this.f7618n) {
                i10 = 2;
                if (wVar.a() < 2) {
                    throw new h("Unexpected subtitle format.");
                }
                fH = e0.h(wVar.z() / this.f7623s, 0.0f, 0.95f);
            } else {
                i10 = 2;
            }
            wVar.F(i14 + iG);
            i13 = 0;
        }
        return new b(new c(spannableStringBuilder, null, null, null, fH, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f));
    }
}
