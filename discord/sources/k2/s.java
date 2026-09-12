package k2;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class s implements TextWatcher, SpanWatcher {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f14261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f14262e = new AtomicInteger(0);

    public s(Object obj) {
        this.f14261d = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f14261d).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        ((TextWatcher) this.f14261d).beforeTextChanged(charSequence, i7, i10, i11);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i7, int i10) {
        if (this.f14262e.get() <= 0 || !(obj instanceof v)) {
            ((SpanWatcher) this.f14261d).onSpanAdded(spannable, obj, i7, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001c A[PHI: r11
      0x001c: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0011, B:12:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        if (this.f14262e.get() <= 0 || !(obj instanceof v)) {
            if (Build.VERSION.SDK_INT >= 28) {
                i13 = i7;
                i14 = i11;
            } else {
                if (i7 > i10) {
                    i7 = 0;
                }
                if (i11 > i12) {
                    i13 = i7;
                    i14 = 0;
                } else {
                    i13 = i7;
                    i14 = i11;
                }
            }
            ((SpanWatcher) this.f14261d).onSpanChanged(spannable, obj, i13, i10, i14, i12);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i7, int i10) {
        if (this.f14262e.get() <= 0 || !(obj instanceof v)) {
            ((SpanWatcher) this.f14261d).onSpanRemoved(spannable, obj, i7, i10);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        ((TextWatcher) this.f14261d).onTextChanged(charSequence, i7, i10, i11);
    }
}
