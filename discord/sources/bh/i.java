package bh;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f3272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f3273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3275d;
    public boolean k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public mi.a f3282m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Layout.Alignment f3276e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3277f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f3278g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3279h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3280i = 1;
    public boolean j = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f3281l = null;

    public i(CharSequence charSequence, TextPaint textPaint, int i7) {
        this.f3272a = charSequence;
        this.f3273b = textPaint;
        this.f3274c = i7;
        this.f3275d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f3272a == null) {
            this.f3272a = "";
        }
        int iMax = Math.max(0, this.f3274c);
        CharSequence charSequenceEllipsize = this.f3272a;
        int i7 = this.f3277f;
        TextPaint textPaint = this.f3273b;
        if (i7 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f3281l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f3275d);
        this.f3275d = iMin;
        if (this.k && this.f3277f == 1) {
            this.f3276e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f3276e);
        builderObtain.setIncludePad(this.j);
        builderObtain.setTextDirection(this.k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f3281l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f3277f);
        float f2 = this.f3278g;
        if (f2 != 0.0f || this.f3279h != 1.0f) {
            builderObtain.setLineSpacing(f2, this.f3279h);
        }
        if (this.f3277f > 1) {
            builderObtain.setHyphenationFrequency(this.f3280i);
        }
        mi.a aVar = this.f3282m;
        if (aVar != null) {
            builderObtain.setBreakStrategy(((TextInputLayout) aVar.f15798e).R.getBreakStrategy());
        }
        return builderObtain.build();
    }
}
