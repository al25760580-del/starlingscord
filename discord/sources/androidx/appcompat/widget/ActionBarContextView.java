package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.ActionMode;
import com.discord.R;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public boolean E;
    public CharSequence F;
    public CharSequence G;
    public View H;
    public View I;
    public View J;
    public LinearLayout K;
    public TextView L;
    public TextView M;
    public final int N;
    public final int O;
    public boolean P;
    public final int Q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a5.f f803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f804e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ActionMenuView f805i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n f806v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f807w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public androidx.core.view.c1 f808x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f809y;

    public ActionBarContextView(@NonNull Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        a5.f fVar = new a5.f();
        fVar.f182c = this;
        fVar.f181b = false;
        this.f803d = fVar;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f804e = context;
        } else {
            this.f804e = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f10256d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : mf.f.u(context, resourceId));
        this.N = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.O = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f807w = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.Q = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i7, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), i10);
        return Math.max(0, i7 - view.getMeasuredWidth());
    }

    public static int g(View view, int i7, int i10, boolean z5, int i11) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i12 = ((i11 - measuredHeight) / 2) + i10;
        if (z5) {
            view.layout(i7 - measuredWidth, i12, i7, measuredHeight + i12);
        } else {
            view.layout(i7, i12, i7 + measuredWidth, measuredHeight + i12);
        }
        return z5 ? -measuredWidth : measuredWidth;
    }

    public final void c(ActionMode actionMode) {
        View view = this.H;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.Q, (ViewGroup) this, false);
            this.H = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.H);
        }
        View viewFindViewById = this.H.findViewById(R.id.action_mode_close_button);
        this.I = viewFindViewById;
        viewFindViewById.setOnClickListener(new b(0, actionMode));
        n.j jVarC = actionMode.c();
        n nVar = this.f806v;
        if (nVar != null) {
            nVar.l();
            h hVar = nVar.R;
            if (hVar != null && hVar.b()) {
                hVar.f16210i.dismiss();
            }
        }
        n nVar2 = new n(getContext());
        this.f806v = nVar2;
        nVar2.J = true;
        nVar2.K = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        jVarC.b(this.f806v, this.f804e);
        n nVar3 = this.f806v;
        n.x xVar = nVar3.E;
        if (xVar == null) {
            n.x xVar2 = (n.x) nVar3.f1039v.inflate(nVar3.f1041x, (ViewGroup) this, false);
            nVar3.E = xVar2;
            xVar2.b(nVar3.f1038i);
            nVar3.a(true);
        }
        n.x xVar3 = nVar3.E;
        if (xVar != xVar3) {
            ((ActionMenuView) xVar3).setPresenter(nVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) xVar3;
        this.f805i = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f805i, layoutParams);
    }

    public final void d() {
        if (this.K == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.K = linearLayout;
            this.L = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.M = (TextView) this.K.findViewById(R.id.action_bar_subtitle);
            int i7 = this.N;
            if (i7 != 0) {
                this.L.setTextAppearance(getContext(), i7);
            }
            int i10 = this.O;
            if (i10 != 0) {
                this.M.setTextAppearance(getContext(), i10);
            }
        }
        this.L.setText(this.F);
        this.M.setText(this.G);
        boolean zIsEmpty = TextUtils.isEmpty(this.F);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.G);
        this.M.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.K.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.K.getParent() == null) {
            addView(this.K);
        }
    }

    public final void e() {
        removeAllViews();
        this.J = null;
        this.f805i = null;
        this.f806v = null;
        View view = this.I;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f808x != null ? this.f803d.f180a : getVisibility();
    }

    public int getContentHeight() {
        return this.f807w;
    }

    public CharSequence getSubtitle() {
        return this.G;
    }

    public CharSequence getTitle() {
        return this.F;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i7) {
        if (i7 != getVisibility()) {
            androidx.core.view.c1 c1Var = this.f808x;
            if (c1Var != null) {
                c1Var.b();
            }
            super.setVisibility(i7);
        }
    }

    public final androidx.core.view.c1 i(int i7, long j) {
        androidx.core.view.c1 c1Var = this.f808x;
        if (c1Var != null) {
            c1Var.b();
        }
        a5.f fVar = this.f803d;
        if (i7 != 0) {
            androidx.core.view.c1 c1VarB = androidx.core.view.u0.b(this);
            c1VarB.a(0.0f);
            c1VarB.c(j);
            ((ActionBarContextView) fVar.f182c).f808x = c1VarB;
            fVar.f180a = i7;
            c1VarB.d(fVar);
            return c1VarB;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        androidx.core.view.c1 c1VarB2 = androidx.core.view.u0.b(this);
        c1VarB2.a(1.0f);
        c1VarB2.c(j);
        ((ActionBarContextView) fVar.f182c).f808x = c1VarB2;
        fVar.f180a = i7;
        c1VarB2.d(fVar);
        return c1VarB2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i7;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, h.a.f10253a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        n nVar = this.f806v;
        if (nVar != null) {
            Configuration configuration2 = nVar.f1037e.getResources().getConfiguration();
            int i10 = configuration2.screenWidthDp;
            int i11 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i10 > 600 || ((i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960))) {
                i7 = 5;
            } else if (i10 >= 500 || ((i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640))) {
                i7 = 4;
            } else {
                i7 = i10 >= 360 ? 3 : 2;
            }
            nVar.N = i7;
            n.j jVar = nVar.f1038i;
            if (jVar != null) {
                jVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n nVar = this.f806v;
        if (nVar != null) {
            nVar.l();
            h hVar = this.f806v.R;
            if (hVar == null || !hVar.b()) {
                return;
            }
            hVar.f16210i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.E = false;
        }
        if (!this.E) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.E = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.E = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        boolean z6 = f4.f976a;
        boolean z7 = getLayoutDirection() == 1;
        int paddingRight = z7 ? (i11 - i7) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
        View view = this.H;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.H.getLayoutParams();
            int i13 = z7 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i14 = z7 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i15 = z7 ? paddingRight - i13 : paddingRight + i13;
            int iG = g(this.H, i15, paddingTop, z7, paddingTop2) + i15;
            paddingRight = z7 ? iG - i14 : iG + i14;
        }
        LinearLayout linearLayout = this.K;
        if (linearLayout != null && this.J == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.K, paddingRight, paddingTop, z7, paddingTop2);
        }
        View view2 = this.J;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, z7, paddingTop2);
        }
        int paddingLeft = z7 ? getPaddingLeft() : (i11 - i7) - getPaddingRight();
        ActionMenuView actionMenuView = this.f805i;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, !z7, paddingTop2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        if (View.MeasureSpec.getMode(i7) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i10) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i7);
        int size2 = this.f807w;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i10);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.H;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.H.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f805i;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f805i, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.K;
        if (linearLayout != null && this.J == null) {
            if (this.P) {
                this.K.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.K.getMeasuredWidth();
                boolean z5 = measuredWidth <= paddingLeft;
                if (z5) {
                    paddingLeft -= measuredWidth;
                }
                this.K.setVisibility(z5 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.J;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = i11 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i11 >= 0) {
                paddingLeft = Math.min(i11, paddingLeft);
            }
            int i13 = layoutParams.height;
            int i14 = i13 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i13 >= 0) {
                iMin = Math.min(i13, iMin);
            }
            this.J.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(iMin, i14));
        }
        if (this.f807w > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            int measuredHeight = getChildAt(i16).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i15) {
                i15 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i15);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f809y = false;
        }
        if (!this.f809y) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f809y = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f809y = false;
        return true;
    }

    public void setContentHeight(int i7) {
        this.f807w = i7;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.J;
        if (view2 != null) {
            removeView(view2);
        }
        this.J = view;
        if (view != null && (linearLayout = this.K) != null) {
            removeView(linearLayout);
            this.K = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.G = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.F = charSequence;
        d();
        androidx.core.view.u0.q(this, charSequence);
    }

    public void setTitleOptional(boolean z5) {
        if (z5 != this.P) {
            requestLayout();
        }
        this.P = z5;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
