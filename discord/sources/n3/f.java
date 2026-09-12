package n3;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g implements Animatable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f16303i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public androidx.appcompat.widget.c f16304v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f16305w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j9.b f16306x = new j9.b(1, this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f16302e = new c();

    public f(Context context, int i7) {
        this.f16303i = context;
    }

    @Override // n3.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        c cVar = this.f16302e;
        cVar.f16297a.draw(canvas);
        if (cVar.f16298b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f16307d;
        return drawable != null ? drawable.getAlpha() : this.f16302e.f16297a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f16302e.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f16307d;
        return drawable != null ? drawable.getColorFilter() : this.f16302e.f16297a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f16307d != null) {
            return new d(this.f16307d.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f16307d;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f16302e.f16297a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f16307d;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f16302e.f16297a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f16307d;
        return drawable != null ? drawable.getOpacity() : this.f16302e.f16297a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        c cVar;
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            cVar = this.f16302e;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayF = a1.b.f(resources, theme, attributeSet, a.f16294e);
                    int resourceId = typedArrayF.getResourceId(0, 0);
                    if (resourceId != 0) {
                        p pVar = new p();
                        ThreadLocal threadLocal = a1.n.f42a;
                        pVar.f16307d = resources.getDrawable(resourceId, theme);
                        pVar.f16358x = false;
                        pVar.setCallback(this.f16306x);
                        p pVar2 = cVar.f16297a;
                        if (pVar2 != null) {
                            pVar2.setCallback(null);
                        }
                        cVar.f16297a = pVar;
                    }
                    typedArrayF.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, a.f16295f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f16303i;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(cVar.f16297a.f16354e.f16344b.f16342o.get(string));
                        if (cVar.f16299c == null) {
                            cVar.f16299c = new ArrayList();
                            cVar.f16300d = new s.e(0);
                        }
                        cVar.f16299c.add(animatorLoadAnimator);
                        cVar.f16300d.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (cVar.f16298b == null) {
            cVar.f16298b = new AnimatorSet();
        }
        cVar.f16298b.playTogether(cVar.f16299c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f16307d;
        return drawable != null ? drawable.isAutoMirrored() : this.f16302e.f16297a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f16307d;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f16302e.f16298b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f16307d;
        return drawable != null ? drawable.isStateful() : this.f16302e.f16297a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f16302e.f16297a.setBounds(rect);
        }
    }

    @Override // n3.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        Drawable drawable = this.f16307d;
        return drawable != null ? drawable.setLevel(i7) : this.f16302e.f16297a.setLevel(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f16307d;
        return drawable != null ? drawable.setState(iArr) : this.f16302e.f16297a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else {
            this.f16302e.f16297a.setAlpha(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z5) {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            drawable.setAutoMirrored(z5);
        } else {
            this.f16302e.f16297a.setAutoMirrored(z5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f16302e.f16297a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            xr.m.Q(drawable, i7);
        } else {
            this.f16302e.f16297a.setTint(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f16302e.f16297a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f16302e.f16297a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z6) {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            return drawable.setVisible(z5, z6);
        }
        this.f16302e.f16297a.setVisible(z5, z6);
        return super.setVisible(z5, z6);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        c cVar = this.f16302e;
        if (cVar.f16298b.isStarted()) {
            return;
        }
        cVar.f16298b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f16307d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f16302e.f16298b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
