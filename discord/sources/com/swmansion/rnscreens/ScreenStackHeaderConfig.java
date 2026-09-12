package com.swmansion.rnscreens;

import android.R;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.s3;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.text.ReactTypefaceUtils;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ScreenStackHeaderConfig extends f implements ReactPointerEventsView {
    public final e E;
    public boolean F;
    public boolean G;
    public String H;
    public int I;
    public String J;
    public String K;
    public float L;
    public int M;
    public Integer N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public boolean T;
    public final f0 U;
    public final f0 V;
    public final f0 W;
    public final int a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final int f7162b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final com.discord.chat.presentation.list.delegate.b f7163c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f7164d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final i0 f7165e0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o f7166x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f7167y;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f7161g0 = {com.discord.chat.presentation.list.a.p(ScreenStackHeaderConfig.class, "consumeLeftInset", "getConsumeLeftInset()Z", 0), com.discord.chat.presentation.list.a.p(ScreenStackHeaderConfig.class, "consumeRightInset", "getConsumeRightInset()Z", 0), com.discord.chat.presentation.list.a.p(ScreenStackHeaderConfig.class, "consumeBottomInset", "getConsumeBottomInset()Z", 0)};

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final q8.c f7160f0 = new q8.c();

    public ScreenStackHeaderConfig(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        o pointerEventsImpl = new o(0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pointerEventsImpl, "pointerEventsImpl");
        super(context);
        this.f7166x = pointerEventsImpl;
        this.f7167y = new ArrayList(3);
        this.U = new f0(this, 0);
        this.V = new f0(this, 1);
        this.W = new f0(this, 2);
        this.f7163c0 = new com.discord.chat.presentation.list.delegate.b(7, this);
        this.f7165e0 = new i0();
        setVisibility(8);
        e eVar = new e(context, this);
        this.E = eVar;
        this.a0 = eVar.getContentInsetStart();
        this.f7162b0 = eVar.getContentInsetStartWithNavigation();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            eVar.setBackgroundColor(typedValue.data);
        }
        eVar.setClipChildren(false);
    }

    public static void a(ScreenStackHeaderConfig screenStackHeaderConfig) {
        e0 screenFragment = screenStackHeaderConfig.getScreenFragment();
        if (screenFragment != null) {
            ScreenStack screenStack = screenStackHeaderConfig.getScreenStack();
            if (screenStack == null || !Intrinsics.areEqual(screenStack.getRootScreen(), screenFragment.a())) {
                if (!screenFragment.a().getNativeBackButtonDismissalEnabled()) {
                    screenFragment.t();
                    return;
                }
                ScreenContainer container = screenFragment.a().getContainer();
                if (!(container instanceof ScreenStack)) {
                    throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
                }
                ((ScreenStack) container).dismiss(screenFragment);
                return;
            }
            Fragment parentFragment = screenFragment.getParentFragment();
            if (parentFragment instanceof e0) {
                e0 e0Var = (e0) parentFragment;
                if (!e0Var.a().getNativeBackButtonDismissalEnabled()) {
                    e0Var.t();
                    return;
                }
                ScreenContainer container2 = e0Var.a().getContainer();
                if (!(container2 instanceof ScreenStack)) {
                    throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
                }
                ((ScreenStack) container2).dismiss(e0Var);
            }
        }
    }

    private final Screen getScreen() {
        ViewParent parent = getParent();
        if (parent instanceof Screen) {
            return (Screen) parent;
        }
        return null;
    }

    private final ScreenStack getScreenStack() {
        Screen screen = getScreen();
        ScreenContainer container = screen != null ? screen.getContainer() : null;
        if (container instanceof ScreenStack) {
            return (ScreenStack) container;
        }
        return null;
    }

    public final void b() {
        Screen screen;
        if (getParent() == null || this.Q || (screen = getScreen()) == null || screen.isBeingRemoved()) {
            return;
        }
        d();
    }

    public final void c(e toolbar, boolean z5) {
        int iMax;
        Object next;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        if (z5) {
            if (toolbar.getNavigationIcon() != null) {
                iMax = toolbar.getPaddingStart() + toolbar.getCurrentContentInsetStart();
            } else {
                iMax = Math.max(toolbar.getCurrentContentInsetStart(), toolbar.getPaddingStart());
            }
            Iterator it = this.f7167y.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((k0) next).getType() != j0.f7205d);
            k0 k0Var = (k0) next;
            if (k0Var != null) {
                iMax = k0Var.getLeft();
            }
            int paddingEnd = toolbar.getPaddingEnd() + toolbar.getCurrentContentInsetEnd();
            this.f7165e0.a(this, getScreen());
            int width = toolbar.getWidth();
            int height = toolbar.getHeight();
            float dIPFromPixel = PixelUtil.toDIPFromPixel(width);
            float dIPFromPixel2 = PixelUtil.toDIPFromPixel(height);
            float dIPFromPixel3 = PixelUtil.toDIPFromPixel(iMax);
            float dIPFromPixel4 = PixelUtil.toDIPFromPixel(paddingEnd);
            if (Math.abs(this.f7186e - dIPFromPixel) >= 0.9f || Math.abs(this.f7187i - dIPFromPixel2) >= 0.9f || Math.abs(this.f7188v - dIPFromPixel3) >= 0.9f || Math.abs(this.f7189w - dIPFromPixel4) >= 0.9f) {
                this.f7186e = dIPFromPixel;
                this.f7187i = dIPFromPixel2;
                this.f7188v = dIPFromPixel3;
                this.f7189w = dIPFromPixel4;
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("frameWidth", dIPFromPixel);
                writableNativeMap.putDouble("frameHeight", dIPFromPixel2);
                writableNativeMap.putDouble(ViewProps.PADDING_START, dIPFromPixel3);
                writableNativeMap.putDouble(ViewProps.PADDING_END, dIPFromPixel4);
                StateWrapper stateWrapper = this.f7185d;
                if (stateWrapper != null) {
                    stateWrapper.updateState(writableNativeMap);
                }
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d() {
        Drawable navigationIcon;
        boolean z5;
        boolean z6;
        e0 screenFragment;
        e0 screenFragment2;
        Toolbar toolbar;
        ReactContext reactContextI;
        ScreenStack screenStack = getScreenStack();
        boolean z7 = screenStack == null || Intrinsics.areEqual(screenStack.getTopScreen(), getParent());
        if (this.T && z7 && !this.Q) {
            e0 screenFragment3 = getScreenFragment();
            i.h hVar = (i.h) (screenFragment3 != null ? screenFragment3.getActivity() : null);
            if (hVar == null) {
                return;
            }
            String str = this.K;
            e toolbar2 = this.E;
            if (str != null) {
                if (Intrinsics.areEqual(str, "rtl")) {
                    toolbar2.setLayoutDirection(1);
                } else if (Intrinsics.areEqual(this.K, "ltr")) {
                    toolbar2.setLayoutDirection(0);
                }
            }
            Screen screen = getScreen();
            if (screen != null) {
                if (getContext() instanceof ReactContext) {
                    Context context = getContext();
                    Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    reactContextI = (ReactContext) context;
                } else {
                    ScreenFragmentWrapper fragmentWrapper = screen.getFragmentWrapper();
                    reactContextI = fragmentWrapper != null ? fragmentWrapper.i() : null;
                }
                io.sentry.config.a.Z(screen, hVar, reactContextI);
            }
            boolean z10 = this.F;
            i0 i0Var = this.f7165e0;
            if (z10) {
                if (toolbar2.getParent() != null && (screenFragment2 = getScreenFragment()) != null) {
                    a aVar = screenFragment2.E;
                    if (aVar != null && (toolbar = screenFragment2.F) != null && toolbar.getParent() == aVar) {
                        aVar.removeView(toolbar);
                    }
                    screenFragment2.F = null;
                }
                i0Var.a(this, getScreen());
                return;
            }
            if (toolbar2.getParent() == null && (screenFragment = getScreenFragment()) != null) {
                Intrinsics.checkNotNullParameter(toolbar2, "toolbar");
                a aVar2 = screenFragment.E;
                if (aVar2 != null) {
                    aVar2.addView(toolbar2);
                }
                mg.e eVar = new mg.e();
                eVar.f15774a = 0;
                toolbar2.setLayoutParams(eVar);
                screenFragment.F = toolbar2;
            }
            hVar.setSupportActionBar(toolbar2);
            ActionBar supportActionBar = hVar.getSupportActionBar();
            if (supportActionBar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            e0 screenFragment4 = getScreenFragment();
            supportActionBar.m((screenFragment4 == null || !screenFragment4.x() || this.O) ? false : true);
            supportActionBar.q(this.H);
            if (TextUtils.isEmpty(this.H)) {
                this.f7164d0 = true;
            }
            ScreenStackHeaderConfig screenStackHeaderConfig = toolbar2.f7179u0;
            toolbar2.setContentInsetStartWithNavigation(screenStackHeaderConfig.getPreferredContentInsetStartWithNavigation());
            int preferredContentInsetStart = screenStackHeaderConfig.getPreferredContentInsetStart();
            int preferredContentInsetEnd = screenStackHeaderConfig.getPreferredContentInsetEnd();
            toolbar2.d();
            toolbar2.Q.a(preferredContentInsetStart, preferredContentInsetEnd);
            toolbar2.setNavigationOnClickListener(this.f7163c0);
            e0 screenFragment5 = getScreenFragment();
            if (screenFragment5 != null && screenFragment5.G != (z6 = this.P)) {
                a aVar3 = screenFragment5.E;
                if (aVar3 != null) {
                    aVar3.setElevation(z6 ? 0.0f : PixelUtil.toPixelFromDIP(4.0f));
                }
                a aVar4 = screenFragment5.E;
                if (aVar4 != null) {
                    aVar4.setStateListAnimator(null);
                }
                screenFragment5.G = z6;
            }
            e0 screenFragment6 = getScreenFragment();
            if (screenFragment6 != null && screenFragment6.H != (z5 = this.G)) {
                ViewGroup.LayoutParams layoutParams = screenFragment6.a().getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                ((v0.d) layoutParams).b(z5 ? null : new AppBarLayout$ScrollingViewBehavior());
                screenFragment6.H = z5;
            }
            f7160f0.getClass();
            TextView textViewH = q8.c.h(toolbar2);
            int i7 = this.I;
            if (i7 != 0) {
                toolbar2.setTitleTextColor(i7);
            }
            if (textViewH != null) {
                String str2 = this.J;
                if (str2 != null || this.M > 0) {
                    int i10 = this.M;
                    AssetManager assets = getContext().getAssets();
                    Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
                    textViewH.setTypeface(ReactTypefaceUtils.applyStyles(null, 0, i10, str2, assets));
                }
                float f2 = this.L;
                if (f2 > 0.0f) {
                    textViewH.setTextSize(f2);
                }
            }
            Integer num = this.N;
            if (num != null) {
                toolbar2.setBackgroundColor(num.intValue());
            }
            if (this.S != 0 && (navigationIcon = toolbar2.getNavigationIcon()) != null) {
                navigationIcon.setColorFilter(new PorterDuffColorFilter(this.S, PorterDuff.Mode.SRC_ATOP));
            }
            for (int childCount = toolbar2.getChildCount() - 1; -1 < childCount; childCount--) {
                if (toolbar2.getChildAt(childCount) instanceof k0) {
                    toolbar2.removeViewAt(childCount);
                }
            }
            ArrayList arrayList = this.f7167y;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = arrayList.get(i11);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                k0 k0Var = (k0) obj;
                j0 type = k0Var.getType();
                if (type == j0.f7208v) {
                    View childAt = k0Var.getChildAt(0);
                    ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
                    if (imageView == null) {
                        throw new JSApplicationIllegalArgumentException("Back button header config view should have Image as first child");
                    }
                    supportActionBar.o(imageView.getDrawable());
                } else {
                    s3 s3Var = new s3(-1);
                    int iOrdinal = type.ordinal();
                    if (iOrdinal == 0) {
                        if (!this.R) {
                            toolbar2.setNavigationIcon((Drawable) null);
                        }
                        toolbar2.setTitle((CharSequence) null);
                        s3Var.f1105a = 8388611;
                    } else if (iOrdinal == 1) {
                        ((ViewGroup.MarginLayoutParams) s3Var).width = -1;
                        s3Var.f1105a = 1;
                        toolbar2.setTitle((CharSequence) null);
                    } else if (iOrdinal == 2) {
                        s3Var.f1105a = 8388613;
                    }
                    k0Var.setLayoutParams(s3Var);
                    ViewParent parent = k0Var.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        Animation animation = k0Var.getAnimation();
                        if (animation != null) {
                            animation.cancel();
                        }
                        k0Var.clearAnimation();
                        viewGroup.removeView(k0Var);
                        viewGroup.endViewTransition(k0Var);
                    }
                    toolbar2.addView(k0Var);
                }
            }
            i0Var.a(this, getScreen());
        }
    }

    public final int getConfigSubviewsCount() {
        return this.f7167y.size();
    }

    public final boolean getConsumeBottomInset() {
        return ((Boolean) this.W.getValue(this, f7161g0[2])).booleanValue();
    }

    public final boolean getConsumeLeftInset() {
        return ((Boolean) this.U.getValue(this, f7161g0[0])).booleanValue();
    }

    public final boolean getConsumeRightInset() {
        return ((Boolean) this.V.getValue(this, f7161g0[1])).booleanValue();
    }

    @NotNull
    public final i0 getHeaderHeightUpdateProxy() {
        return this.f7165e0;
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    @NotNull
    public PointerEvents getPointerEvents() {
        return (PointerEvents) this.f7166x.f7219e;
    }

    public final int getPreferredContentInsetEnd() {
        return this.a0;
    }

    public final int getPreferredContentInsetStart() {
        return this.a0;
    }

    public final int getPreferredContentInsetStartWithNavigation() {
        if (this.f7164d0) {
            return 0;
        }
        return this.f7162b0;
    }

    public final e0 getScreenFragment() {
        ViewParent parent = getParent();
        if (!(parent instanceof Screen)) {
            return null;
        }
        Fragment fragment = ((Screen) parent).getFragment();
        if (fragment instanceof e0) {
            return (e0) fragment;
        }
        return null;
    }

    @NotNull
    public final e getToolbar() {
        return this.E;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
        int surfaceId = UIManagerHelper.getSurfaceId(this);
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new k4.k(surfaceId, getId(), 1));
        }
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.T = false;
        int surfaceId = UIManagerHelper.getSurfaceId(this);
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new k4.k(surfaceId, getId(), 3));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
    }

    public final void setBackButtonInCustomView(boolean z5) {
        this.R = z5;
    }

    public final void setBackgroundColor(Integer num) {
        this.N = num;
    }

    public final void setConsumeBottomInset(boolean z5) {
        this.W.setValue(this, f7161g0[2], Boolean.valueOf(z5));
    }

    public final void setConsumeLeftInset(boolean z5) {
        this.U.setValue(this, f7161g0[0], Boolean.valueOf(z5));
    }

    public final void setConsumeRightInset(boolean z5) {
        this.V.setValue(this, f7161g0[1], Boolean.valueOf(z5));
    }

    public final void setDirection(String str) {
        this.K = str;
    }

    public final void setHeaderHidden(boolean z5) {
        this.F = z5;
    }

    public final void setHeaderTranslucent(boolean z5) {
        this.G = z5;
    }

    public final void setHidden(boolean z5) {
        this.F = z5;
    }

    public final void setHideBackButton(boolean z5) {
        this.O = z5;
    }

    public final void setHideShadow(boolean z5) {
        this.P = z5;
    }

    public final void setTintColor(int i7) {
        this.S = i7;
    }

    public final void setTitle(String str) {
        this.H = str;
    }

    public final void setTitleColor(int i7) {
        this.I = i7;
    }

    public final void setTitleEmpty(boolean z5) {
        this.f7164d0 = z5;
    }

    public final void setTitleFontFamily(String str) {
        this.J = str;
    }

    public final void setTitleFontSize(float f2) {
        this.L = f2;
    }

    public final void setTitleFontWeight(String str) {
        this.M = ReactTypefaceUtils.parseFontWeight(str);
    }

    public final void setTranslucent(boolean z5) {
        this.G = z5;
    }
}
