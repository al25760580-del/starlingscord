package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class x extends ImageButton {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AppCompatBackgroundHelper f1161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AppCompatImageHelper f1162e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1163i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        l3.a(context);
        this.f1163i = false;
        k3.a(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f1161d = appCompatBackgroundHelper;
        appCompatBackgroundHelper.d(attributeSet, i7);
        AppCompatImageHelper appCompatImageHelper = new AppCompatImageHelper(this);
        this.f1162e = appCompatImageHelper;
        appCompatImageHelper.b(attributeSet, i7);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1161d;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.a();
        }
        AppCompatImageHelper appCompatImageHelper = this.f1162e;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1161d;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1161d;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        m3 m3Var;
        AppCompatImageHelper appCompatImageHelper = this.f1162e;
        if (appCompatImageHelper == null || (m3Var = appCompatImageHelper.f834b) == null) {
            return null;
        }
        return (ColorStateList) m3Var.f1034c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        m3 m3Var;
        AppCompatImageHelper appCompatImageHelper = this.f1162e;
        if (appCompatImageHelper == null || (m3Var = appCompatImageHelper.f834b) == null) {
            return null;
        }
        return (PorterDuff.Mode) m3Var.f1035d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.f1162e.f833a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1161d;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1161d;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f(i7);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        AppCompatImageHelper appCompatImageHelper = this.f1162e;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        AppCompatImageHelper appCompatImageHelper = this.f1162e;
        if (appCompatImageHelper != null && drawable != null && !this.f1163i) {
            appCompatImageHelper.f835c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (appCompatImageHelper != null) {
            appCompatImageHelper.a();
            if (this.f1163i) {
                return;
            }
            ImageView imageView = appCompatImageHelper.f833a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(appCompatImageHelper.f835c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i7) {
        super.setImageLevel(i7);
        this.f1163i = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i7) {
        AppCompatImageHelper appCompatImageHelper = this.f1162e;
        ImageView imageView = appCompatImageHelper.f833a;
        if (i7 != 0) {
            Drawable drawableU = mf.f.u(imageView.getContext(), i7);
            if (drawableU != null) {
                n1.a(drawableU);
            }
            imageView.setImageDrawable(drawableU);
        } else {
            imageView.setImageDrawable(null);
        }
        appCompatImageHelper.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        AppCompatImageHelper appCompatImageHelper = this.f1162e;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1161d;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1161d;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        AppCompatImageHelper appCompatImageHelper = this.f1162e;
        if (appCompatImageHelper != null) {
            if (appCompatImageHelper.f834b == null) {
                appCompatImageHelper.f834b = new m3();
            }
            m3 m3Var = appCompatImageHelper.f834b;
            m3Var.f1034c = colorStateList;
            m3Var.f1033b = true;
            appCompatImageHelper.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        AppCompatImageHelper appCompatImageHelper = this.f1162e;
        if (appCompatImageHelper != null) {
            if (appCompatImageHelper.f834b == null) {
                appCompatImageHelper.f834b = new m3();
            }
            m3 m3Var = appCompatImageHelper.f834b;
            m3Var.f1035d = mode;
            m3Var.f1032a = true;
            appCompatImageHelper.a();
        }
    }
}
