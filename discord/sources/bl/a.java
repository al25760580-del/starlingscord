package bl;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements LineHeightSpan {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3309d;

    public a(float f2) {
        this.f3309d = (int) Math.ceil(f2);
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence text, int i7, int i10, int i11, int i12, Paint.FontMetricsInt fm2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fm2, "fm");
        int i13 = fm2.ascent;
        double d6 = (this.f3309d - ((-i13) + fm2.descent)) / 2.0f;
        fm2.ascent = i13 - ((int) Math.ceil(d6));
        fm2.descent += (int) Math.floor(d6);
        if (i7 == 0) {
            fm2.top = fm2.ascent;
        }
        if (i10 == text.length()) {
            fm2.bottom = fm2.descent;
        }
    }
}
