package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends a1.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1112i;
    public final /* synthetic */ WeakReference j;
    public final /* synthetic */ AppCompatTextHelper k;

    public t0(AppCompatTextHelper appCompatTextHelper, int i7, int i10, WeakReference weakReference) {
        this.k = appCompatTextHelper;
        this.f1111h = i7;
        this.f1112i = i10;
        this.j = weakReference;
    }

    @Override // a1.b
    public final void g(int i7) {
    }

    @Override // a1.b
    public final void h(Typeface typeface) {
        int i7;
        if (Build.VERSION.SDK_INT >= 28 && (i7 = this.f1111h) != -1) {
            typeface = x0.a(typeface, i7, (this.f1112i & 2) != 0);
        }
        AppCompatTextHelper appCompatTextHelper = this.k;
        if (appCompatTextHelper.f848m) {
            appCompatTextHelper.f847l = typeface;
            TextView textView = (TextView) this.j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new u0(textView, typeface, appCompatTextHelper.j, 0));
                } else {
                    textView.setTypeface(typeface, appCompatTextHelper.j);
                }
            }
        }
    }
}
