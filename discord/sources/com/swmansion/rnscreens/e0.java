package com.swmansion.rnscreens;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Animation;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/swmansion/rnscreens/e0;", "Lcom/swmansion/rnscreens/y;", "Lcom/swmansion/rnscreens/ScreenStackFragmentWrapper;", "<init>", "()V", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScreenStackFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenStackFragment.kt\ncom/swmansion/rnscreens/ScreenStackFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,564:1\n1#2:565\n*E\n"})
public final class e0 extends y implements ScreenStackFragmentWrapper {
    public a E;
    public Toolbar F;
    public boolean G;
    public boolean H;
    public mm.a I;
    public View J;
    public c K;
    public co.s L;
    public bn.e M;
    public mm.d N;
    public mm.i O;
    public i.m P;
    public WindowInsetsCompat Q;

    public e0() {
        throw new IllegalStateException("ScreenStack fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    public final mm.d A(boolean z5) {
        mm.d dVar = this.N;
        if (dVar == null || z5) {
            if (dVar != null) {
                BottomSheetBehavior<Screen> sheetBehavior = a().getSheetBehavior();
                mm.c cVar = dVar.f15896c;
                if (cVar != null && sheetBehavior != null) {
                    sheetBehavior.Y.remove(cVar);
                }
            }
            this.N = new mm.d(a().getReactContext(), a());
        }
        mm.d dVar2 = this.N;
        Intrinsics.checkNotNull(dVar2);
        return dVar2;
    }

    public final mm.i B() {
        if (this.O == null) {
            this.O = new mm.i(a());
        }
        mm.i iVar = this.O;
        Intrinsics.checkNotNull(iVar);
        return iVar;
    }

    public final void C(Menu menu) {
        menu.clear();
        ScreenStackHeaderConfig headerConfig = a().getHeaderConfig();
        int configSubviewsCount = headerConfig != null ? headerConfig.getConfigSubviewsCount() : 0;
        if (headerConfig == null || configSubviewsCount <= 0) {
            return;
        }
        for (int i7 = 0; i7 < configSubviewsCount; i7++) {
            Object obj = headerConfig.f7167y.get(i7);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            if (((k0) obj).getType() == j0.f7209w) {
                Context context = getContext();
                if (this.K == null && context != null) {
                    c cVar = new c(context, this);
                    this.K = cVar;
                    co.s sVar = this.L;
                    if (sVar != null) {
                        sVar.invoke(cVar);
                    }
                }
                MenuItem menuItemAdd = menu.add("");
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setActionView(this.K);
                return;
            }
        }
    }

    @Override // com.swmansion.rnscreens.y, com.swmansion.rnscreens.ScreenFragmentWrapper
    public final boolean b() {
        return a().isTranslucent();
    }

    @Override // com.swmansion.rnscreens.y, com.swmansion.rnscreens.ScreenFragmentWrapper
    public final void n() {
        super.n();
        ScreenStackHeaderConfig headerConfig = a().getHeaderConfig();
        if (headerConfig != null) {
            headerConfig.d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i7, boolean z5, int i10) {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final Animator onCreateAnimator(int i7, boolean z5, int i10) {
        bn.e eVar = null;
        if (!mm.j.b(a())) {
            return null;
        }
        int i11 = 7;
        final int i12 = 1;
        final int i13 = 0;
        if (!z5) {
            final mm.i iVarB = B();
            mm.d dVarA = A(false);
            Screen screenA = a();
            bn.e eVar2 = this.M;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
            } else {
                eVar = eVar2;
            }
            mm.g sheetAnimationContext = new mm.g(this, screenA, eVar, dVarA);
            iVarB.getClass();
            Intrinsics.checkNotNullParameter(sheetAnimationContext, "sheetAnimationContext");
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(dVarA.f15894a.getAlpha(), 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new com.discord.chat.presentation.list.c(i11, dVarA));
            Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "apply(...)");
            int bottom = eVar.getBottom();
            Screen screen = iVarB.f15906d;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, (bottom - screen.getTop()) - screen.getTranslationY());
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: mm.e
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator it) {
                    switch (i12) {
                        case 0:
                            Intrinsics.checkNotNullParameter(it, "it");
                            Object animatedValue = it.getAnimatedValue();
                            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                            iVarB.h(((Float) animatedValue).floatValue());
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(it, "it");
                            Object animatedValue2 = it.getAnimatedValue();
                            Intrinsics.checkNotNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                            iVarB.h(((Float) animatedValue2).floatValue());
                            break;
                    }
                }
            });
            Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat2, "apply(...)");
            animatorSet.play(valueAnimatorOfFloat).with(valueAnimatorOfFloat2);
            iVarB.b(animatorSet, false, this);
            return animatorSet;
        }
        final mm.i iVarB2 = B();
        mm.d dVarA2 = A(false);
        Screen screenA2 = a();
        bn.e eVar3 = this.M;
        if (eVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
            eVar3 = null;
        }
        mm.g sheetAnimationContext2 = new mm.g(this, screenA2, eVar3, dVarA2);
        iVarB2.getClass();
        Intrinsics.checkNotNullParameter(sheetAnimationContext2, "sheetAnimationContext");
        AnimatorSet animatorSet2 = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, dVarA2.f15895b);
        valueAnimatorOfFloat3.addUpdateListener(new com.discord.chat.presentation.list.c(i11, dVarA2));
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat3, "apply(...)");
        cn.a aVar = new cn.a(new kotlin.collections.a(5, iVarB2), new f6.a(16));
        Screen screen2 = iVarB2.f15906d;
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(aVar, Float.valueOf(screen2.getHeight()), Float.valueOf(0.0f));
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: mm.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        Object animatedValue = it.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        iVarB2.h(((Float) animatedValue).floatValue());
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        Object animatedValue2 = it.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                        iVarB2.h(((Float) animatedValue2).floatValue());
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfObject, "apply(...)");
        AnimatorSet.Builder builderPlay = animatorSet2.play(valueAnimatorOfObject);
        int sheetInitialDetentIndex = screen2.getSheetInitialDetentIndex();
        Intrinsics.checkNotNullParameter(screen2, "screen");
        AnimatorSet.Builder builder = sheetInitialDetentIndex > screen2.getSheetLargestUndimmedDetentIndex() ? builderPlay : null;
        if (builder != null) {
            builder.with(valueAnimatorOfFloat3);
        }
        iVarB2.b(animatorSet2, true, this);
        return animatorSet2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C(menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // com.swmansion.rnscreens.y, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        v0.b appBarLayout$ScrollingViewBehavior;
        Integer numValueOf;
        ColorStateList colorStateList;
        a aVar;
        a aVar2;
        a aVar3;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.M = new bn.e(contextRequireContext, this);
        Screen screenA = a();
        v0.d dVar = new v0.d(-1, -1);
        if (mm.j.b(a())) {
            appBarLayout$ScrollingViewBehavior = new BottomSheetBehavior();
        } else {
            appBarLayout$ScrollingViewBehavior = this.H ? null : new AppBarLayout$ScrollingViewBehavior();
        }
        dVar.b(appBarLayout$ScrollingViewBehavior);
        screenA.setLayoutParams(dVar);
        bn.e eVar = this.M;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
            eVar = null;
        }
        Screen screenA2 = a();
        ls.d.z(screenA2);
        eVar.addView(screenA2);
        if (mm.j.b(a())) {
            a().setClipToOutline(true);
            Screen screenA3 = a();
            float fMax = Math.max(PixelUtil.toPixelFromDIP(screenA3.getSheetCornerRadius()), 0.0f);
            kh.k kVar = new kh.k();
            kh.k kVar2 = new kh.k();
            kh.a aVar4 = new kh.a(0.0f);
            kh.a aVar5 = new kh.a(0.0f);
            kh.f fVar = new kh.f(0);
            kh.f fVar2 = new kh.f(0);
            kh.f fVar3 = new kh.f(0);
            kh.f fVar4 = new kh.f(0);
            com.facebook.imagepipeline.nativecode.b bVarO = com.facebook.imagepipeline.nativecode.c.o(0);
            kh.a aVar6 = new kh.a(fMax);
            com.facebook.imagepipeline.nativecode.b bVarO2 = com.facebook.imagepipeline.nativecode.c.o(0);
            kh.a aVar7 = new kh.a(fMax);
            kh.m mVar = new kh.m();
            mVar.f14500a = bVarO;
            mVar.f14501b = bVarO2;
            mVar.f14502c = kVar;
            mVar.f14503d = kVar2;
            mVar.f14504e = aVar6;
            mVar.f14505f = aVar7;
            mVar.f14506g = aVar4;
            mVar.f14507h = aVar5;
            mVar.f14508i = fVar;
            mVar.j = fVar2;
            mVar.k = fVar3;
            mVar.f14509l = fVar4;
            Intrinsics.checkNotNullExpressionValue(mVar, "build(...)");
            kh.i iVar = new kh.i(mVar);
            Drawable background = screenA3.getBackground();
            ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
            if (colorDrawable != null) {
                numValueOf = Integer.valueOf(colorDrawable.getColor());
            } else {
                Drawable background2 = screenA3.getBackground();
                kh.i iVar2 = background2 instanceof kh.i ? (kh.i) background2 : null;
                numValueOf = (iVar2 == null || (colorStateList = iVar2.f14483e.f14468f) == null) ? null : Integer.valueOf(colorStateList.getDefaultColor());
            }
            if (numValueOf == null) {
                ScreenContentWrapper contentWrapper = screenA3.getContentWrapper();
                if (contentWrapper == null) {
                    numValueOf = null;
                } else {
                    Intrinsics.checkNotNullParameter(contentWrapper, "<this>");
                    numValueOf = BackgroundStyleApplicator.getBackgroundColor(contentWrapper);
                }
            }
            iVar.setTint(numValueOf != null ? numValueOf.intValue() : 0);
            screenA3.setBackground(iVar);
            a().setElevation(a().getSheetElevation());
            mm.i iVarB = B();
            BottomSheetBehavior<Screen> sheetBehavior = a().getSheetBehavior();
            Intrinsics.checkNotNull(sheetBehavior);
            mm.i.d(iVarB, sheetBehavior, null, 6);
            mm.d dVarA = A(true);
            Screen screen = a();
            bn.e root = this.M;
            if (root == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                root = null;
            }
            dVarA.getClass();
            float f2 = dVarA.f15895b;
            mm.b bVar = dVarA.f15894a;
            Intrinsics.checkNotNullParameter(screen, "screen");
            Intrinsics.checkNotNullParameter(root, "root");
            root.addView(bVar, 0);
            int sheetInitialDetentIndex = screen.getSheetInitialDetentIndex();
            Intrinsics.checkNotNullParameter(screen, "screen");
            if (sheetInitialDetentIndex > screen.getSheetLargestUndimmedDetentIndex()) {
                bVar.setAlpha(f2);
            } else {
                bVar.setAlpha(0.0f);
            }
            Screen screen2 = a();
            BottomSheetBehavior<Screen> behavior = a().getSheetBehavior();
            Intrinsics.checkNotNull(behavior);
            Intrinsics.checkNotNullParameter(screen2, "screen");
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            mm.c cVar = new mm.c(screen2, bVar, f2);
            dVarA.f15896c = cVar;
            Intrinsics.checkNotNull(cVar);
            behavior.s(cVar);
            if (!a().getSheetShouldOverflowTopInset()) {
                mm.a aVar8 = new mm.a();
                this.I = aVar8;
                final ScreenContainer container = a().getContainer();
                int i7 = 3;
                if (container != null) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        container.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.swmansion.rnscreens.c0
                            @Override // android.view.View.OnApplyWindowInsetsListener
                            public final WindowInsets onApplyWindowInsets(View view, WindowInsets insets) {
                                Intrinsics.checkNotNullParameter(view, "<unused var>");
                                Intrinsics.checkNotNullParameter(insets, "insets");
                                WindowInsetsCompat windowInsetsCompatG = WindowInsetsCompat.g(container, insets);
                                Intrinsics.checkNotNullExpressionValue(windowInsetsCompatG, "toWindowInsetsCompat(...)");
                                this.z(windowInsetsCompatG);
                                return insets;
                            }
                        });
                    } else {
                        if (this.P == null) {
                            this.P = new i.m();
                        }
                        i.m mVar2 = this.P;
                        Intrinsics.checkNotNull(mVar2);
                        am.b listener = new am.b(i7, this);
                        mVar2.getClass();
                        Intrinsics.checkNotNullParameter(listener, "listener");
                        ((ArrayList) mVar2.f11250e).add(listener);
                    }
                }
                ScreenContainer container2 = a().getContainer();
                if (container2 != null) {
                    container2.addOnLayoutChangeListener(new com.discord.chat.presentation.root.a(i7, aVar8, this));
                }
            }
            ScreenContainer container3 = a().getContainer();
            Intrinsics.checkNotNull(container3);
            bn.e eVar2 = this.M;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                eVar2 = null;
            }
            eVar2.measure(View.MeasureSpec.makeMeasureSpec(container3.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(container3.getHeight(), 1073741824));
            bn.e eVar3 = this.M;
            if (eVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                eVar3 = null;
            }
            eVar3.layout(0, 0, container3.getWidth(), container3.getHeight());
            if (Build.VERSION.SDK_INT < 30) {
                if (this.P == null) {
                    this.P = new i.m();
                }
                i.m mVar3 = this.P;
                Intrinsics.checkNotNull(mVar3);
                am.b listener2 = new am.b(2, iVarB);
                mVar3.getClass();
                Intrinsics.checkNotNullParameter(listener2, "listener");
                ((ArrayList) mVar3.f11250e).add(listener2);
                Screen screenA4 = a();
                WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
                androidx.core.view.l0.m(screenA4, mVar3);
            }
            androidx.core.view.u0.r(a(), new d0(iVarB, this));
        } else {
            Context context = getContext();
            if (context != null) {
                Intrinsics.checkNotNullParameter(context, "context");
                aVar = new a(context);
                aVar.setBackgroundColor(0);
                aVar.setLayoutParams(new mg.e());
            } else {
                aVar = null;
            }
            this.E = aVar;
            bn.e eVar4 = this.M;
            if (eVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                eVar4 = null;
            }
            eVar4.addView(this.E);
            if (this.G && (aVar3 = this.E) != null) {
                aVar3.setTargetElevation(0.0f);
            }
            Toolbar toolbar = this.F;
            if (toolbar != null && (aVar2 = this.E) != null) {
                ls.d.z(toolbar);
                aVar2.addView(toolbar);
            }
            setHasOptionsMenu(true);
        }
        bn.e eVar5 = this.M;
        if (eVar5 != null) {
            return eVar5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPrepareOptionsMenu(Menu menu) {
        ScreenStackHeaderConfig headerConfig;
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (!a().isTranslucent() || ((headerConfig = a().getHeaderConfig()) != null && !headerConfig.F)) {
            C(menu);
        }
        super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        View view = this.J;
        if (view != null) {
            view.requestFocus();
        }
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        PackageManager packageManager;
        Context context = getContext();
        if (context != null && (packageManager = context.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback")) {
            View viewA = a();
            while (true) {
                if (viewA == null) {
                    viewA = null;
                    break;
                } else if (viewA.isFocused()) {
                    break;
                } else {
                    viewA = viewA instanceof ViewGroup ? ((ViewGroup) viewA).getFocusedChild() : null;
                }
            }
            this.J = viewA;
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
    }

    public final boolean x() {
        ScreenContainer container = a().getContainer();
        if (!(container instanceof ScreenStack)) {
            throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
        }
        if (!Intrinsics.areEqual(((ScreenStack) container).getRootScreen(), a())) {
            return true;
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof e0) {
            return ((e0) parentFragment).x();
        }
        return false;
    }

    public final void y() {
        if (isRemoving() && isDetached()) {
            return;
        }
        ThemedReactContext reactContext = a().getReactContext();
        int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, a().getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new k4.k(surfaceId, a().getId(), 6));
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    public final void z(WindowInsetsCompat windowInsetsCompat) {
        Integer numValueOf;
        if (Intrinsics.areEqual(this.Q, windowInsetsCompat)) {
            return;
        }
        this.Q = windowInsetsCompat;
        mm.i iVarB = B();
        BottomSheetBehavior<Screen> behavior = a().getSheetBehavior();
        Intrinsics.checkNotNull(behavior);
        Screen screen = iVarB.f15906d;
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Integer numG = iVarB.g();
        if (numG == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration");
        }
        boolean zA = mm.j.a(screen);
        mm.a aVar = null;
        if (zA) {
            ScreenContentWrapper contentWrapper = screen.getContentWrapper();
            if (contentWrapper != null) {
                numValueOf = Integer.valueOf(contentWrapper.getHeight());
                Intrinsics.checkNotNullParameter(contentWrapper, "<this>");
                if (!contentWrapper.isLaidOut() && contentWrapper.getHeight() <= 0 && contentWrapper.getWidth() <= 0) {
                    numValueOf = null;
                }
            } else {
                numValueOf = null;
            }
        } else {
            if (zA) {
                throw new rn.n();
            }
            numValueOf = Integer.valueOf((int) (((Number) CollectionsKt.Q(screen.getSheetDetents().f7172a)).doubleValue() * ((double) numG.intValue())));
        }
        Integer numValueOf2 = screen.getSheetDetents().f7172a.size() == 3 ? Integer.valueOf(screen.getSheetDetents().a(numG.intValue(), iVarB.f15910w, screen.getSheetShouldOverflowTopInset())) : null;
        Intrinsics.checkNotNullParameter(behavior, "<this>");
        if (numValueOf != null) {
            behavior.f6285l = numValueOf.intValue();
        }
        if (numValueOf2 != null) {
            behavior.C(numValueOf2.intValue());
        }
        ScreenContainer container = a().getContainer();
        if (container != null) {
            bn.e eVar = this.M;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                eVar = null;
            }
            eVar.forceLayout();
            bn.e eVar2 = this.M;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                eVar2 = null;
            }
            eVar2.measure(View.MeasureSpec.makeMeasureSpec(container.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(container.getHeight(), 1073741824));
            bn.e eVar3 = this.M;
            if (eVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                eVar3 = null;
            }
            eVar3.layout(0, 0, container.getWidth(), container.getHeight());
        }
        a().onBottomSheetBehaviorDidLayout$react_native_screens_release(true);
        mm.a aVar2 = this.I;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sheetTransitionCoordinator");
        } else {
            aVar = aVar2;
        }
        Screen screen2 = a();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(screen2, "screen");
        aVar.f15886b = true;
        if (aVar.f15885a) {
            screen2.requestTriggeringPostponedEnterTransition$react_native_screens_release();
            screen2.triggerPostponedEnterTransitionIfNeeded$react_native_screens_release();
        }
    }
}
