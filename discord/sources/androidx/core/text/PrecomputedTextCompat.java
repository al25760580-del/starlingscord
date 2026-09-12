package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class PrecomputedTextCompat implements Spannable {
    @Override // java.lang.CharSequence
    public final char charAt(int i7) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i7, int i10, Class cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        throw null;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i7, int i10, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        throw null;
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i7, int i10, int i11) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        throw null;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i10) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        throw null;
    }

    public static final class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextPaint f1576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextDirectionHeuristic f1577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f1579d;

        public Params(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i7, int i10) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i7).setHyphenationFrequency(i10).setTextDirection(textDirectionHeuristic).build();
            }
            this.f1576a = textPaint;
            this.f1577b = textDirectionHeuristic;
            this.f1578c = i7;
            this.f1579d = i10;
        }

        public final boolean a(Params params) {
            if (this.f1578c != params.f1578c || this.f1579d != params.f1579d) {
                return false;
            }
            TextPaint textPaint = this.f1576a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = params.f1576a;
            TextPaint textPaint3 = params.f1576a;
            if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint3.getTextScaleX() || textPaint.getTextSkewX() != textPaint3.getTextSkewX() || textPaint.getLetterSpacing() != textPaint3.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint3.getFontFeatureSettings()) || textPaint.getFlags() != textPaint3.getFlags() || !textPaint.getTextLocales().equals(textPaint3.getTextLocales())) {
                return false;
            }
            if (textPaint.getTypeface() == null) {
                return textPaint3.getTypeface() == null;
            }
            return textPaint.getTypeface().equals(textPaint3.getTypeface());
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return a(params) && this.f1577b == params.f1577b;
        }

        public final int hashCode() {
            TextPaint textPaint = this.f1576a;
            return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f1577b, Integer.valueOf(this.f1578c), Integer.valueOf(this.f1579d));
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            StringBuilder sb3 = new StringBuilder("textSize=");
            TextPaint textPaint = this.f1576a;
            sb3.append(textPaint.getTextSize());
            sb2.append(sb3.toString());
            sb2.append(", textScaleX=" + textPaint.getTextScaleX());
            sb2.append(", textSkewX=" + textPaint.getTextSkewX());
            int i7 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
            sb2.append(", textLocale=" + textPaint.getTextLocales());
            sb2.append(", typeface=" + textPaint.getTypeface());
            if (i7 >= 26) {
                sb2.append(", variationSettings=" + textPaint.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f1577b);
            sb2.append(", breakStrategy=" + this.f1578c);
            sb2.append(", hyphenationFrequency=" + this.f1579d);
            sb2.append("}");
            return sb2.toString();
        }

        public Params(PrecomputedText.Params params) {
            this.f1576a = params.getTextPaint();
            this.f1577b = params.getTextDirection();
            this.f1578c = params.getBreakStrategy();
            this.f1579d = params.getHyphenationFrequency();
        }
    }
}
