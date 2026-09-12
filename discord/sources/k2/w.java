package k2;

import android.text.PrecomputedText;
import androidx.core.text.PrecomputedTextCompat;

/* JADX INFO: loaded from: classes.dex */
public final class w extends pa.s {
    @Override // pa.s
    public final boolean n(CharSequence charSequence) {
        return (charSequence instanceof PrecomputedText) || (charSequence instanceof PrecomputedTextCompat);
    }
}
