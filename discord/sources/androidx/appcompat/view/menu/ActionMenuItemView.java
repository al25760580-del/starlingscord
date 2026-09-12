package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.k;
import androidx.appcompat.widget.o;
import h.a;
import n.b;
import n.i;
import n.j;
import n.l;
import n.w;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements w, View.OnClickListener, o {
    public boolean E;
    public final int F;
    public int G;
    public final int H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f781e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f782i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i f783v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public k f784w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f785x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f786y;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f786y = d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f10255c, 0, 0);
        this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.H = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.G = -1;
        setSaveEnabled(false);
    }

    @Override // n.w
    public final void a(l lVar) {
        this.f780d = lVar;
        setIcon(lVar.getIcon());
        setTitle(lVar.getTitleCondensed());
        setId(lVar.f16167a);
        setVisibility(lVar.isVisible() ? 0 : 8);
        setEnabled(lVar.isEnabled());
        if (lVar.hasSubMenu() && this.f784w == null) {
            this.f784w = new k(this);
        }
    }

    @Override // androidx.appcompat.widget.o
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.widget.o
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f780d.getIcon() == null;
    }

    public final boolean d() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i7 < 480) {
            return (i7 >= 640 && i10 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void e() {
        boolean z5 = true;
        boolean z6 = !TextUtils.isEmpty(this.f781e);
        if (this.f782i != null && ((this.f780d.f16189y & 4) != 4 || (!this.f786y && !this.E))) {
            z5 = false;
        }
        boolean z7 = z6 & z5;
        setText(z7 ? this.f781e : null);
        CharSequence charSequence = this.f780d.f16181q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z7 ? null : this.f780d.f16171e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f780d.f16182r;
        if (TextUtils.isEmpty(charSequence2)) {
            ib.a.I(this, z7 ? null : this.f780d.f16171e);
        } else {
            ib.a.I(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // n.w
    public l getItemData() {
        return this.f780d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar = this.f783v;
        if (iVar != null) {
            iVar.c(this.f780d);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f786y = d();
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i11 = this.G) >= 0) {
            super.setPadding(i11, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i7, i10);
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.F;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i12) : i12;
        if (mode != 1073741824 && i12 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i10);
        }
        if (!zIsEmpty || this.f782i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f782i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k kVar;
        if (this.f780d.hasSubMenu() && (kVar = this.f784w) != null && kVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z5) {
    }

    public void setChecked(boolean z5) {
    }

    public void setExpandedFormat(boolean z5) {
        if (this.E != z5) {
            this.E = z5;
            l lVar = this.f780d;
            if (lVar != null) {
                j jVar = lVar.f16178n;
                jVar.k = true;
                jVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f782i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i7 = this.H;
            if (intrinsicWidth > i7) {
                intrinsicHeight = (int) (intrinsicHeight * (i7 / intrinsicWidth));
                intrinsicWidth = i7;
            }
            if (intrinsicHeight > i7) {
                intrinsicWidth = (int) (intrinsicWidth * (i7 / intrinsicHeight));
            } else {
                i7 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i7);
        }
        setCompoundDrawables(drawable, null, null, null);
        e();
    }

    public void setItemInvoker(i iVar) {
        this.f783v = iVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.G = i7;
        super.setPadding(i7, i10, i11, i12);
    }

    public void setPopupCallback(b bVar) {
        this.f785x = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f781e = charSequence;
        e();
    }
}
