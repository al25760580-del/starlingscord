package com.swmansion.rnscreens;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.widget.f3;
import com.discord.R;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends ReactViewGroup {
    public boolean E;
    public boolean F;
    public boolean G;
    public e4.m H;
    public boolean I;
    public final int J;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u0 f7246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p0 f7247e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f7248i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Integer f7249v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Integer f7250w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Integer f7251x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f7252y;

    public v0(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        this.f7246d = u0.f7234d;
        this.f7247e = p0.f7223d;
        this.f7252y = "";
        this.E = true;
        this.G = true;
        this.J = UIManagerHelper.getSurfaceId(this);
    }

    public static Unit c(v0 v0Var, c searchView) {
        e0 screenStackFragment;
        c cVar;
        Intrinsics.checkNotNullParameter(searchView, "newSearchView");
        if (v0Var.H == null) {
            Intrinsics.checkNotNullParameter(searchView, "searchView");
            e4.m mVar = new e4.m(16);
            mVar.f7993e = searchView;
            v0Var.H = mVar;
        }
        v0Var.l();
        if (v0Var.F && (screenStackFragment = v0Var.getScreenStackFragment()) != null && (cVar = screenStackFragment.K) != null) {
            cVar.setIconified(false);
            cVar.requestFocusFromTouch();
        }
        return Unit.f14616a;
    }

    public static void d(v0 v0Var) {
        v0Var.k(new k4.k(v0Var.J, v0Var.getId(), 10));
        v0Var.setToolbarElementsVisibility(0);
    }

    public static void e(v0 v0Var) {
        v0Var.k(new k4.k(v0Var.J, v0Var.getId(), 12));
        v0Var.setToolbarElementsVisibility(8);
    }

    private final ScreenStackHeaderConfig getHeaderConfig() {
        ViewParent parent = getParent();
        if (parent instanceof k0) {
            return ((k0) parent).getConfig();
        }
        return null;
    }

    private final e0 getScreenStackFragment() {
        ScreenStackHeaderConfig headerConfig = getHeaderConfig();
        if (headerConfig != null) {
            return headerConfig.getScreenFragment();
        }
        return null;
    }

    private final void setSearchViewListeners(f3 f3Var) {
        f3Var.setOnQueryTextListener(new u4.b(7, this));
        f3Var.setOnQueryTextFocusChangeListener(new com.discord.chat.input.views.b(1, this));
        f3Var.setOnCloseListener(new app.rive.runtime.kotlin.core.a(25, this));
        f3Var.setOnSearchClickListener(new com.discord.chat.presentation.list.delegate.b(8, this));
    }

    private final void setToolbarElementsVisibility(int i7) {
        k0 k0Var;
        ScreenStackHeaderConfig headerConfig = getHeaderConfig();
        int i10 = 0;
        int configSubviewsCount = headerConfig != null ? headerConfig.getConfigSubviewsCount() - 1 : 0;
        if (configSubviewsCount < 0) {
            return;
        }
        while (true) {
            ScreenStackHeaderConfig headerConfig2 = getHeaderConfig();
            if (headerConfig2 != null) {
                Object obj = headerConfig2.f7167y.get(i10);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                k0Var = (k0) obj;
            } else {
                k0Var = null;
            }
            if ((k0Var != null ? k0Var.getType() : null) != j0.f7209w && k0Var != null) {
                k0Var.setVisibility(i7);
            }
            if (i10 == configSubviewsCount) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void f() {
        c cVar;
        e0 screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (cVar = screenStackFragment.K) == null) {
            return;
        }
        cVar.clearFocus();
    }

    public final void g() {
        c cVar;
        e0 screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (cVar = screenStackFragment.K) == null) {
            return;
        }
        cVar.r("");
        cVar.setIconified(true);
    }

    @NotNull
    public final p0 getAutoCapitalize() {
        return this.f7247e;
    }

    public final boolean getAutoFocus() {
        return this.F;
    }

    public final Integer getHeaderIconColor() {
        return this.f7250w;
    }

    public final Integer getHintTextColor() {
        return this.f7251x;
    }

    @NotNull
    public final u0 getInputType() {
        return this.f7246d;
    }

    @NotNull
    public final String getPlaceholder() {
        return this.f7252y;
    }

    public final boolean getShouldOverrideBackButton() {
        return this.E;
    }

    public final boolean getShouldShowHintSearchIcon() {
        return this.G;
    }

    public final Integer getTextColor() {
        return this.f7248i;
    }

    public final Integer getTintColor() {
        return this.f7249v;
    }

    public final void h() {
        c cVar;
        e0 screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (cVar = screenStackFragment.K) == null) {
            return;
        }
        cVar.r("");
    }

    public final void i() {
        c cVar;
        e0 screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (cVar = screenStackFragment.K) == null) {
            return;
        }
        cVar.setIconified(false);
        cVar.requestFocusFromTouch();
    }

    public final void j(String str) {
        e0 screenStackFragment;
        c cVar;
        if (str == null || (screenStackFragment = getScreenStackFragment()) == null || (cVar = screenStackFragment.K) == null) {
            return;
        }
        cVar.setText(str);
    }

    public final void k(Event event) {
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(event);
        }
    }

    public final void l() {
        Integer num;
        EditText editTextA;
        ColorStateList textColors;
        e0 screenStackFragment = getScreenStackFragment();
        Integer numValueOf = null;
        c cVar = screenStackFragment != null ? screenStackFragment.K : null;
        if (cVar != null) {
            if (!this.I) {
                setSearchViewListeners(cVar);
                this.I = true;
            }
            cVar.setInputType(this.f7246d.a(this.f7247e));
            e4.m mVar = this.H;
            if (mVar != null) {
                Integer num2 = this.f7248i;
                Integer num3 = (Integer) mVar.f7994i;
                if (num2 != null) {
                    if (num3 == null) {
                        EditText editTextA2 = mVar.A();
                        if (editTextA2 != null && (textColors = editTextA2.getTextColors()) != null) {
                            numValueOf = Integer.valueOf(textColors.getDefaultColor());
                        }
                        mVar.f7994i = numValueOf;
                    }
                    EditText editTextA3 = mVar.A();
                    if (editTextA3 != null) {
                        editTextA3.setTextColor(num2.intValue());
                    }
                } else if (num3 != null && (editTextA = mVar.A()) != null) {
                    editTextA.setTextColor(num3.intValue());
                }
            }
            e4.m mVar2 = this.H;
            if (mVar2 != null) {
                c cVar2 = (c) mVar2.f7993e;
                Integer num4 = this.f7249v;
                Drawable drawable = (Drawable) mVar2.f7995v;
                if (num4 != null) {
                    if (drawable == null) {
                        mVar2.f7995v = cVar2.findViewById(R.id.search_plate).getBackground();
                    }
                    cVar2.findViewById(R.id.search_plate).setBackgroundColor(num4.intValue());
                } else if (drawable != null) {
                    cVar2.findViewById(R.id.search_plate).setBackground(drawable);
                }
            }
            e4.m mVar3 = this.H;
            if (mVar3 != null) {
                Integer num5 = this.f7250w;
                c cVar3 = (c) mVar3.f7993e;
                if (num5 != null) {
                    int iIntValue = num5.intValue();
                    ((ImageView) cVar3.findViewById(R.id.search_button)).setColorFilter(iIntValue);
                    ((ImageView) cVar3.findViewById(R.id.search_close_btn)).setColorFilter(iIntValue);
                }
            }
            e4.m mVar4 = this.H;
            if (mVar4 != null && (num = this.f7251x) != null) {
                int iIntValue2 = num.intValue();
                EditText editTextA4 = mVar4.A();
                if (editTextA4 != null) {
                    editTextA4.setHintTextColor(iIntValue2);
                }
            }
            e4.m mVar5 = this.H;
            if (mVar5 != null) {
                String placeholder = this.f7252y;
                boolean z5 = this.G;
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                if (z5) {
                    ((c) mVar5.f7993e).setQueryHint(placeholder);
                } else {
                    EditText editTextA5 = mVar5.A();
                    if (editTextA5 != null) {
                        editTextA5.setHint(placeholder);
                    }
                }
            }
            cVar.setOverrideBackAction(this.E);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e0 screenStackFragment = getScreenStackFragment();
        if (screenStackFragment != null) {
            screenStackFragment.L = new co.s(26, this);
        }
    }

    public final void setAutoCapitalize(@NotNull p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<set-?>");
        this.f7247e = p0Var;
    }

    public final void setAutoFocus(boolean z5) {
        this.F = z5;
    }

    public final void setHeaderIconColor(Integer num) {
        this.f7250w = num;
    }

    public final void setHintTextColor(Integer num) {
        this.f7251x = num;
    }

    public final void setInputType(@NotNull u0 u0Var) {
        Intrinsics.checkNotNullParameter(u0Var, "<set-?>");
        this.f7246d = u0Var;
    }

    public final void setPlaceholder(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f7252y = str;
    }

    public final void setShouldOverrideBackButton(boolean z5) {
        this.E = z5;
    }

    public final void setShouldShowHintSearchIcon(boolean z5) {
        this.G = z5;
    }

    public final void setTextColor(Integer num) {
        this.f7248i = num;
    }

    public final void setTintColor(Integer num) {
        this.f7249v = num;
    }
}
