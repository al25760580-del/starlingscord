package k2;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Spannable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14274d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Spannable f14275e;

    public x(Spannable spannable) {
        this.f14275e = spannable;
    }

    public final void a() {
        Spannable spannable = this.f14275e;
        if (!this.f14274d) {
            if ((Build.VERSION.SDK_INT < 28 ? new pa.s() : new w()).n(spannable)) {
                this.f14275e = new SpannableString(spannable);
            }
        }
        this.f14274d = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i7) {
        return this.f14275e.charAt(i7);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f14275e.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f14275e.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f14275e.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f14275e.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f14275e.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i7, int i10, Class cls) {
        return this.f14275e.getSpans(i7, i10, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f14275e.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i7, int i10, Class cls) {
        return this.f14275e.nextSpanTransition(i7, i10, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f14275e.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i7, int i10, int i11) {
        a();
        this.f14275e.setSpan(obj, i7, i10, i11);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i10) {
        return this.f14275e.subSequence(i7, i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f14275e.toString();
    }
}
