package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class AppCompatImageHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m3 f834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f835c = 0;

    public AppCompatImageHelper(ImageView imageView) {
        this.f833a = imageView;
    }

    public final void a() {
        m3 m3Var;
        ImageView imageView = this.f833a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            n1.a(drawable);
        }
        if (drawable == null || (m3Var = this.f834b) == null) {
            return;
        }
        w.e(drawable, m3Var, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i7) {
        int resourceId;
        ImageView imageView = this.f833a;
        Context context = imageView.getContext();
        int[] iArr = h.a.f10258f;
        e4.m mVarE = e4.m.E(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) mVarE.f7994i;
        androidx.core.view.u0.o(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) mVarE.f7994i, i7, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = mf.f.u(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                n1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(mVarE.w(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(n1.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            mVarE.H();
        }
    }
}
