package m2;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f15360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f15361b;

    public d(TextView textView) {
        this.f15360a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        TextView textView = this.f15360a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = k2.i.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i12 == 0 && i11 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i7 != 0 || i10 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i7, i10);
                }
                return k2.i.a().e(charSequence, 0, charSequence.length());
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        k2.i iVarA = k2.i.a();
        if (this.f15361b == null) {
            this.f15361b = new c(textView, this);
        }
        iVarA.f(this.f15361b);
        return charSequence;
    }
}
