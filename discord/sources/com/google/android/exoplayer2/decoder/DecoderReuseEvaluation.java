package com.google.android.exoplayer2.decoder;

import a3.e;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import je.b;

/* JADX INFO: loaded from: classes3.dex */
public final class DecoderReuseEvaluation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Format f5681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Format f5682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5684e;

    public DecoderReuseEvaluation(String str, Format format, Format format2, int i7, int i10) {
        b.g(i7 == 0 || i10 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f5680a = str;
        format.getClass();
        this.f5681b = format;
        format2.getClass();
        this.f5682c = format2;
        this.f5683d = i7;
        this.f5684e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DecoderReuseEvaluation.class == obj.getClass()) {
            DecoderReuseEvaluation decoderReuseEvaluation = (DecoderReuseEvaluation) obj;
            if (this.f5683d == decoderReuseEvaluation.f5683d && this.f5684e == decoderReuseEvaluation.f5684e && this.f5680a.equals(decoderReuseEvaluation.f5680a) && this.f5681b.equals(decoderReuseEvaluation.f5681b) && this.f5682c.equals(decoderReuseEvaluation.f5682c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5682c.hashCode() + ((this.f5681b.hashCode() + e.d((((527 + this.f5683d) * 31) + this.f5684e) * 31, 31, this.f5680a)) * 31);
    }
}
