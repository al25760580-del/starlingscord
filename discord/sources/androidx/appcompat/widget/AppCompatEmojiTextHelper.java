package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class AppCompatEmojiTextHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue.i f832b;

    public AppCompatEmojiTextHelper(TextView textView) {
        this.f831a = textView;
        ue.i iVar = new ue.i();
        iVar.f21117d = new m2.g(textView);
        this.f832b = iVar;
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((io.sentry.config.a) this.f832b.f21117d).C(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = this.f831a.getContext().obtainStyledAttributes(attributeSet, h.a.f10261i, i7, 0);
        try {
            boolean z5 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z5);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void c(boolean z5) {
        ((io.sentry.config.a) this.f832b.f21117d).U(z5);
    }

    public final void d(boolean z5) {
        ((io.sentry.config.a) this.f832b.f21117d).V(z5);
    }
}
