package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.discord.R;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean E;
    public final int F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f797e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f798i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f799v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f800w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Drawable f801x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f802y;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new a(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f10253a);
        boolean z5 = false;
        this.f799v = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f800w = typedArrayObtainStyledAttributes.getDrawable(2);
        this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f802y = true;
            this.f801x = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f802y ? !(this.f799v != null || this.f800w != null) : this.f801x == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f799v;
        if (drawable != null && drawable.isStateful()) {
            this.f799v.setState(getDrawableState());
        }
        Drawable drawable2 = this.f800w;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f800w.setState(getDrawableState());
        }
        Drawable drawable3 = this.f801x;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f801x.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f799v;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f800w;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f801x;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f797e = findViewById(R.id.action_bar);
        this.f798i = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f796d || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        super.onLayout(z5, i7, i10, i11, i12);
        boolean z6 = true;
        if (this.f802y) {
            Drawable drawable = this.f801x;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z6 = false;
            }
        } else {
            if (this.f799v == null) {
                z6 = false;
            } else if (this.f797e.getVisibility() == 0) {
                this.f799v.setBounds(this.f797e.getLeft(), this.f797e.getTop(), this.f797e.getRight(), this.f797e.getBottom());
            } else {
                View view = this.f798i;
                if (view == null || view.getVisibility() != 0) {
                    this.f799v.setBounds(0, 0, 0, 0);
                } else {
                    this.f799v.setBounds(this.f798i.getLeft(), this.f798i.getTop(), this.f798i.getRight(), this.f798i.getBottom());
                }
            }
            this.E = false;
        }
        if (z6) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        if (this.f797e == null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && (i11 = this.F) >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i10)), Integer.MIN_VALUE);
        }
        super.onMeasure(i7, i10);
        if (this.f797e == null) {
            return;
        }
        View.MeasureSpec.getMode(i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f799v;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f799v);
        }
        this.f799v = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f797e;
            if (view != null) {
                this.f799v.setBounds(view.getLeft(), this.f797e.getTop(), this.f797e.getRight(), this.f797e.getBottom());
            }
        }
        boolean z5 = false;
        if (!this.f802y ? !(this.f799v != null || this.f800w != null) : this.f801x == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f801x;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f801x);
        }
        this.f801x = drawable;
        boolean z5 = this.f802y;
        boolean z6 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z5 && (drawable2 = this.f801x) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z5 ? !(this.f799v != null || this.f800w != null) : this.f801x == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f800w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f800w);
        }
        this.f800w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.E && this.f800w != null) {
                throw null;
            }
        }
        boolean z5 = false;
        if (!this.f802y ? !(this.f799v != null || this.f800w != null) : this.f801x == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(q2 q2Var) {
    }

    public void setTransitioning(boolean z5) {
        this.f796d = z5;
        setDescendantFocusability(z5 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z5 = i7 == 0;
        Drawable drawable = this.f799v;
        if (drawable != null) {
            drawable.setVisible(z5, false);
        }
        Drawable drawable2 = this.f800w;
        if (drawable2 != null) {
            drawable2.setVisible(z5, false);
        }
        Drawable drawable3 = this.f801x;
        if (drawable3 != null) {
            drawable3.setVisible(z5, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f799v;
        boolean z5 = this.f802y;
        if (drawable == drawable2 && !z5) {
            return true;
        }
        if (drawable == this.f800w && this.E) {
            return true;
        }
        return (drawable == this.f801x && z5) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i7) {
        if (i7 != 0) {
            return super.startActionModeForChild(view, callback, i7);
        }
        return null;
    }
}
