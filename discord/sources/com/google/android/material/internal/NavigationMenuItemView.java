package com.google.android.material.internal;

import a1.n;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.x1;
import androidx.core.view.u0;
import androidx.recyclerview.widget.RecyclerView;
import bh.a;
import bh.e;
import n.l;
import n.w;

/* JADX INFO: loaded from: classes3.dex */
public class NavigationMenuItemView extends e implements w {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int[] f6408g0 = {R.attr.state_checked};
    public int S;
    public boolean T;
    public boolean U;
    public final boolean V;
    public final CheckedTextView W;
    public FrameLayout a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public l f6409b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ColorStateList f6410c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f6411d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Drawable f6412e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final a f6413f0;

    public NavigationMenuItemView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V = true;
        a aVar = new a(1, this);
        this.f6413f0 = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.discord.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.discord.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.discord.R.id.design_menu_item_text);
        this.W = checkedTextView;
        u0.p(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.a0 == null) {
                this.a0 = (FrameLayout) ((ViewStub) findViewById(com.discord.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.a0.removeAllViews();
            this.a0.addView(view);
        }
    }

    @Override // n.w
    public final void a(l lVar) {
        StateListDrawable stateListDrawable;
        this.f6409b0 = lVar;
        int i7 = lVar.f16167a;
        if (i7 > 0) {
            setId(i7);
        }
        setVisibility(lVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.discord.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f6408g0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(lVar.isCheckable());
        setChecked(lVar.isChecked());
        setEnabled(lVar.isEnabled());
        setTitle(lVar.f16171e);
        setIcon(lVar.getIcon());
        setActionView(lVar.getActionView());
        setContentDescription(lVar.f16181q);
        ib.a.I(this, lVar.f16182r);
        l lVar2 = this.f6409b0;
        CharSequence charSequence = lVar2.f16171e;
        CheckedTextView checkedTextView = this.W;
        if (charSequence == null && lVar2.getIcon() == null && this.f6409b0.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.a0;
            if (frameLayout != null) {
                x1 x1Var = (x1) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) x1Var).width = -1;
                this.a0.setLayoutParams(x1Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.a0;
        if (frameLayout2 != null) {
            x1 x1Var2 = (x1) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) x1Var2).width = -2;
            this.a0.setLayoutParams(x1Var2);
        }
    }

    @Override // n.w
    public l getItemData() {
        return this.f6409b0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        l lVar = this.f6409b0;
        if (lVar != null && lVar.isCheckable() && this.f6409b0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f6408g0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z5) {
        refreshDrawableState();
        if (this.U != z5) {
            this.U = z5;
            this.f6413f0.sendAccessibilityEvent(this.W, RecyclerView.ItemAnimator.FLAG_MOVED);
        }
    }

    public void setChecked(boolean z5) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.W;
        checkedTextView.setChecked(z5);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z5 && this.V) ? 1 : 0);
    }

    public void setHorizontalPadding(int i7) {
        setPadding(i7, getPaddingTop(), i7, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f6411d0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f6410c0);
            }
            int i7 = this.S;
            drawable.setBounds(0, 0, i7, i7);
        } else if (this.T) {
            if (this.f6412e0 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = n.f42a;
                Drawable drawable2 = resources.getDrawable(com.discord.R.drawable.navigation_empty_icon, theme);
                this.f6412e0 = drawable2;
                if (drawable2 != null) {
                    int i10 = this.S;
                    drawable2.setBounds(0, 0, i10, i10);
                }
            }
            drawable = this.f6412e0;
        }
        this.W.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i7) {
        this.W.setCompoundDrawablePadding(i7);
    }

    public void setIconSize(int i7) {
        this.S = i7;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f6410c0 = colorStateList;
        this.f6411d0 = colorStateList != null;
        l lVar = this.f6409b0;
        if (lVar != null) {
            setIcon(lVar.getIcon());
        }
    }

    public void setMaxLines(int i7) {
        this.W.setMaxLines(i7);
    }

    public void setNeedsEmptyIcon(boolean z5) {
        this.T = z5;
    }

    public void setTextAppearance(int i7) {
        this.W.setTextAppearance(i7);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.W.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.W.setText(charSequence);
    }
}
