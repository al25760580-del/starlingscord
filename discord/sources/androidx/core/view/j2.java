package androidx.core.view;

import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class j2 extends i2 {
    @Override // mo.c0
    public final void H(boolean z5) {
        if (!z5) {
            T(16);
            return;
        }
        Window window = this.f1680h;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        S(16);
    }
}
