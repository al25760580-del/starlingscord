package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.x0;
import androidx.core.view.y0;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.bottomsheet.SheetDetents;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class Screen extends h implements s, pm.a {

    @NotNull
    public static final Companion Companion = new Companion();

    @NotNull
    public static final String TAG = "Screen";
    private ActivityState activityState;
    private ScreenContainer container;
    private ScreenFooter footer;
    private ScreenFragmentWrapper fragmentWrapper;
    private boolean insetsApplied;
    private boolean isBeingRemoved;
    private boolean isGestureEnabled;
    private Boolean isNavigationBarHidden;
    private boolean isSheetGrabberVisible;
    private Boolean isStatusBarAnimated;
    private Boolean isStatusBarHidden;
    private boolean isTransitioning;
    private boolean nativeBackButtonDismissalEnabled;

    @NotNull
    private final ThemedReactContext reactContext;

    @NotNull
    private ReplaceAnimation replaceAnimation;
    private String screenId;
    private Integer screenOrientation;
    private boolean sheetClosesOnTouchOutside;
    private float sheetCornerRadius;
    private boolean sheetDefaultResizeAnimationEnabled;

    @NotNull
    private SheetDetents sheetDetents;
    private float sheetElevation;
    private boolean sheetExpandsWhenScrolledToEdge;
    private int sheetInitialDetentIndex;
    private int sheetLargestUndimmedDetentIndex;
    private boolean sheetShouldOverflowTopInset;
    private boolean shouldTriggerPostponedTransitionAfterLayout;
    private boolean shouldUpdateSheetCornerRadius;

    @NotNull
    private StackAnimation stackAnimation;

    @NotNull
    private StackPresentation stackPresentation;
    private String statusBarStyle;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ActivityState {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ActivityState f7128d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final ActivityState f7129e;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final ActivityState f7130i;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final /* synthetic */ ActivityState[] f7131v;

        static {
            ActivityState activityState = new ActivityState("INACTIVE", 0);
            f7128d = activityState;
            ActivityState activityState2 = new ActivityState("TRANSITIONING_OR_BELOW_TOP", 1);
            f7129e = activityState2;
            ActivityState activityState3 = new ActivityState("ON_TOP", 2);
            f7130i = activityState3;
            ActivityState[] activityStateArr = {activityState, activityState2, activityState3};
            f7131v = activityStateArr;
            com.facebook.imagepipeline.nativecode.b.l(activityStateArr);
        }

        public static ActivityState valueOf(String str) {
            return (ActivityState) Enum.valueOf(ActivityState.class, str);
        }

        public static ActivityState[] values() {
            return (ActivityState[]) f7131v.clone();
        }
    }

    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ReplaceAnimation {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ReplaceAnimation f7132d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final ReplaceAnimation f7133e;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ ReplaceAnimation[] f7134i;

        static {
            ReplaceAnimation replaceAnimation = new ReplaceAnimation("PUSH", 0);
            f7132d = replaceAnimation;
            ReplaceAnimation replaceAnimation2 = new ReplaceAnimation("POP", 1);
            f7133e = replaceAnimation2;
            ReplaceAnimation[] replaceAnimationArr = {replaceAnimation, replaceAnimation2};
            f7134i = replaceAnimationArr;
            com.facebook.imagepipeline.nativecode.b.l(replaceAnimationArr);
        }

        public static ReplaceAnimation valueOf(String str) {
            return (ReplaceAnimation) Enum.valueOf(ReplaceAnimation.class, str);
        }

        public static ReplaceAnimation[] values() {
            return (ReplaceAnimation[]) f7134i.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class StackAnimation {
        public static final StackAnimation E;
        public static final StackAnimation F;
        public static final /* synthetic */ StackAnimation[] G;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final StackAnimation f7135d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final StackAnimation f7136e;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final StackAnimation f7137i;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final StackAnimation f7138v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final StackAnimation f7139w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final StackAnimation f7140x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final StackAnimation f7141y;

        static {
            StackAnimation stackAnimation = new StackAnimation("DEFAULT", 0);
            f7135d = stackAnimation;
            StackAnimation stackAnimation2 = new StackAnimation("NONE", 1);
            f7136e = stackAnimation2;
            StackAnimation stackAnimation3 = new StackAnimation("FADE", 2);
            f7137i = stackAnimation3;
            StackAnimation stackAnimation4 = new StackAnimation("SLIDE_FROM_BOTTOM", 3);
            f7138v = stackAnimation4;
            StackAnimation stackAnimation5 = new StackAnimation("SLIDE_FROM_RIGHT", 4);
            f7139w = stackAnimation5;
            StackAnimation stackAnimation6 = new StackAnimation("SLIDE_FROM_LEFT", 5);
            f7140x = stackAnimation6;
            StackAnimation stackAnimation7 = new StackAnimation("FADE_FROM_BOTTOM", 6);
            f7141y = stackAnimation7;
            StackAnimation stackAnimation8 = new StackAnimation("IOS_FROM_RIGHT", 7);
            E = stackAnimation8;
            StackAnimation stackAnimation9 = new StackAnimation("IOS_FROM_LEFT", 8);
            F = stackAnimation9;
            StackAnimation[] stackAnimationArr = {stackAnimation, stackAnimation2, stackAnimation3, stackAnimation4, stackAnimation5, stackAnimation6, stackAnimation7, stackAnimation8, stackAnimation9};
            G = stackAnimationArr;
            com.facebook.imagepipeline.nativecode.b.l(stackAnimationArr);
        }

        public static StackAnimation valueOf(String str) {
            return (StackAnimation) Enum.valueOf(StackAnimation.class, str);
        }

        public static StackAnimation[] values() {
            return (StackAnimation[]) G.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class StackPresentation {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final StackPresentation f7142d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final StackPresentation f7143e;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final StackPresentation f7144i;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final StackPresentation f7145v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final /* synthetic */ StackPresentation[] f7146w;

        static {
            StackPresentation stackPresentation = new StackPresentation("PUSH", 0);
            f7142d = stackPresentation;
            StackPresentation stackPresentation2 = new StackPresentation("MODAL", 1);
            f7143e = stackPresentation2;
            StackPresentation stackPresentation3 = new StackPresentation("TRANSPARENT_MODAL", 2);
            f7144i = stackPresentation3;
            StackPresentation stackPresentation4 = new StackPresentation("FORM_SHEET", 3);
            f7145v = stackPresentation4;
            StackPresentation[] stackPresentationArr = {stackPresentation, stackPresentation2, stackPresentation3, stackPresentation4};
            f7146w = stackPresentationArr;
            com.facebook.imagepipeline.nativecode.b.l(stackPresentationArr);
        }

        public static StackPresentation valueOf(String str) {
            return (StackPresentation) Enum.valueOf(StackPresentation.class, str);
        }

        public static StackPresentation[] values() {
            return (StackPresentation[]) f7146w.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Screen(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.stackPresentation = StackPresentation.f7142d;
        this.replaceAnimation = ReplaceAnimation.f7133e;
        this.stackAnimation = StackAnimation.f7135d;
        this.isGestureEnabled = true;
        this.sheetExpandsWhenScrolledToEdge = true;
        this.sheetDetents = new SheetDetents(kotlin.collections.c0.c(Double.valueOf(1.0d)));
        this.sheetLargestUndimmedDetentIndex = -1;
        this.sheetClosesOnTouchOutside = true;
        this.sheetElevation = 24.0f;
        this.sheetDefaultResizeAnimationEnabled = true;
        setLayoutParams(new WindowManager.LayoutParams(2));
        this.nativeBackButtonDismissalEnabled = true;
    }

    public static void a(ViewGroup viewGroup) {
        Iterator it = new x0(viewGroup).iterator();
        while (true) {
            y0 y0Var = (y0) it;
            if (!y0Var.hasNext()) {
                return;
            }
            View view = (View) y0Var.next();
            viewGroup.endViewTransition(view);
            if (view instanceof ScreenStackHeaderConfig) {
                a(((ScreenStackHeaderConfig) view).getToolbar());
            }
            if (view instanceof ViewGroup) {
                a((ViewGroup) view);
            }
        }
    }

    public static boolean b(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt instanceof WebView) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && b((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    public final int c(float f2, int i7) {
        Integer numG;
        int iIntValue;
        Fragment fragment = getFragment();
        if (fragment != null) {
            Intrinsics.checkNotNullParameter(fragment, "<this>");
            mm.i iVar = ((e0) fragment).O;
            if (iVar != null && (numG = iVar.g()) != null && i7 > (iIntValue = (int) (numG.intValue() + f2))) {
                return iIntValue;
            }
        }
        return i7;
    }

    public final void changeAccessibilityMode(int i7) {
        e toolbar;
        setImportantForAccessibility(i7);
        ScreenStackHeaderConfig headerConfig = getHeaderConfig();
        if (headerConfig == null || (toolbar = headerConfig.getToolbar()) == null) {
            return;
        }
        toolbar.setImportantForAccessibility(i7);
    }

    public final void changeFocusability$react_native_screens_release(int i7, int i10) {
        e toolbar;
        e toolbar2;
        setFocusable(i7);
        ScreenStackHeaderConfig headerConfig = getHeaderConfig();
        if (headerConfig != null && (toolbar2 = headerConfig.getToolbar()) != null) {
            toolbar2.setFocusable(i7);
        }
        setDescendantFocusability(i10);
        ScreenStackHeaderConfig headerConfig2 = getHeaderConfig();
        if (headerConfig2 == null || (toolbar = headerConfig2.getToolbar()) == null) {
            return;
        }
        toolbar.setDescendantFocusability(i10);
    }

    public final void changeFocusabilityCompat$react_native_screens_release(boolean z5, int i7) {
        e toolbar;
        e toolbar2;
        setFocusable(z5);
        ScreenStackHeaderConfig headerConfig = getHeaderConfig();
        if (headerConfig != null && (toolbar2 = headerConfig.getToolbar()) != null) {
            toolbar2.setFocusable(z5);
        }
        setDescendantFocusability(i7);
        ScreenStackHeaderConfig headerConfig2 = getHeaderConfig();
        if (headerConfig2 == null || (toolbar = headerConfig2.getToolbar()) == null) {
            return;
        }
        toolbar.setDescendantFocusability(i7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(@NotNull SparseArray<Parcelable> container) {
        Intrinsics.checkNotNullParameter(container, "container");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(@NotNull SparseArray<Parcelable> container) {
        Intrinsics.checkNotNullParameter(container, "container");
    }

    public void endRemovalTransition() {
        if (this.isBeingRemoved) {
            this.isBeingRemoved = false;
            a(this);
        }
    }

    public final ActivityState getActivityState() {
        return this.activityState;
    }

    @Override // pm.a
    public Fragment getAssociatedFragment() {
        return getFragment();
    }

    public final ScreenContainer getContainer() {
        return this.container;
    }

    public final ScreenContentWrapper getContentWrapper() {
        Object next;
        Iterator it = new x0(this).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((View) next) instanceof ScreenContentWrapper));
        if (next instanceof ScreenContentWrapper) {
            return (ScreenContentWrapper) next;
        }
        return null;
    }

    public final ScreenFooter getFooter() {
        return this.footer;
    }

    public final Fragment getFragment() {
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            return screenFragmentWrapper.g();
        }
        return null;
    }

    public final ScreenFragmentWrapper getFragmentWrapper() {
        return this.fragmentWrapper;
    }

    public final ScreenStackHeaderConfig getHeaderConfig() {
        Object next;
        Iterator it = new x0(this).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((View) next) instanceof ScreenStackHeaderConfig));
        if (next instanceof ScreenStackHeaderConfig) {
            return (ScreenStackHeaderConfig) next;
        }
        return null;
    }

    public final boolean getInsetsApplied() {
        return this.insetsApplied;
    }

    public final boolean getNativeBackButtonDismissalEnabled() {
        return this.nativeBackButtonDismissalEnabled;
    }

    @NotNull
    public final ThemedReactContext getReactContext() {
        return this.reactContext;
    }

    public final EventDispatcher getReactEventDispatcher() {
        return UIManagerHelper.getEventDispatcherForReactTag(this.reactContext, getId());
    }

    @NotNull
    public final ReplaceAnimation getReplaceAnimation() {
        return this.replaceAnimation;
    }

    public final String getScreenId() {
        return this.screenId;
    }

    public final Integer getScreenOrientation() {
        return this.screenOrientation;
    }

    public final BottomSheetBehavior<Screen> getSheetBehavior() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        v0.d dVar = layoutParams instanceof v0.d ? (v0.d) layoutParams : null;
        v0.b bVar = dVar != null ? dVar.f21325a : null;
        if (bVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) bVar;
        }
        return null;
    }

    public final boolean getSheetClosesOnTouchOutside() {
        return this.sheetClosesOnTouchOutside;
    }

    public final float getSheetCornerRadius() {
        return this.sheetCornerRadius;
    }

    public final boolean getSheetDefaultResizeAnimationEnabled() {
        return this.sheetDefaultResizeAnimationEnabled;
    }

    @NotNull
    public final SheetDetents getSheetDetents() {
        return this.sheetDetents;
    }

    public final float getSheetElevation() {
        return this.sheetElevation;
    }

    public final boolean getSheetExpandsWhenScrolledToEdge() {
        return this.sheetExpandsWhenScrolledToEdge;
    }

    public final int getSheetInitialDetentIndex() {
        return this.sheetInitialDetentIndex;
    }

    public final int getSheetLargestUndimmedDetentIndex() {
        return this.sheetLargestUndimmedDetentIndex;
    }

    public final boolean getSheetShouldOverflowTopInset() {
        return this.sheetShouldOverflowTopInset;
    }

    public final boolean getShouldTriggerPostponedTransitionAfterLayout() {
        return this.shouldTriggerPostponedTransitionAfterLayout;
    }

    @NotNull
    public final StackAnimation getStackAnimation() {
        return this.stackAnimation;
    }

    @NotNull
    public final StackPresentation getStackPresentation() {
        return this.stackPresentation;
    }

    public final String getStatusBarStyle() {
        return this.statusBarStyle;
    }

    public final boolean isBeingRemoved() {
        return this.isBeingRemoved;
    }

    public final boolean isGestureEnabled() {
        return this.isGestureEnabled;
    }

    public final Boolean isNavigationBarHidden() {
        return this.isNavigationBarHidden;
    }

    public final boolean isSheetGrabberVisible() {
        return this.isSheetGrabberVisible;
    }

    public final Boolean isStatusBarAnimated() {
        return this.isStatusBarAnimated;
    }

    public final Boolean isStatusBarHidden() {
        return this.isStatusBarHidden;
    }

    public final boolean isTranslucent() {
        int iOrdinal = this.stackPresentation.ordinal();
        return iOrdinal == 2 || iOrdinal == 3;
    }

    public final void notifyHeaderHeightChange$react_native_screens_release(int i7) {
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new ml.d(surfaceId, getId(), PixelUtil.toDIPFromPixel(i7)));
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.insetsApplied = true;
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Fragment fragment;
        super.onAttachedToWindow();
        if (!mm.j.b(this) || (fragment = getFragment()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        mm.i listener = ((e0) fragment).O;
        if (listener != null) {
            i iVar = i.f7197d;
            Intrinsics.checkNotNullParameter(listener, "listener");
            i.f7198e.add(listener);
        }
    }

    public final void onBottomSheetBehaviorDidLayout$react_native_screens_release(boolean z5) {
        if (mm.j.b(this) && (this.container instanceof ScreenStack)) {
            if (mm.j.a(this)) {
                requestLayout();
            }
            if (z5) {
                updateScreenSizeFabric(getWidth(), getHeight(), getTop());
            }
            ScreenFooter screenFooter = this.footer;
            if (screenFooter != null) {
                getLeft();
                getTop();
                getRight();
                getBottom();
                ScreenContainer screenContainer = this.container;
                Intrinsics.checkNotNull(screenContainer);
                screenFooter.f(screenContainer.getHeight());
            }
        }
    }

    @Override // com.swmansion.rnscreens.s
    public void onContentWrapperLayout(boolean z5, int i7, int i10, int i11, int i12) {
        int i13 = i12 - i10;
        BottomSheetBehavior<Screen> sheetBehavior = getSheetBehavior();
        if (mm.j.b(this) && mm.j.a(this) && sheetBehavior != null) {
            Intrinsics.checkNotNullParameter(sheetBehavior, "<this>");
            int i14 = sheetBehavior.f6285l;
            boolean z6 = i14 == 0;
            if (i14 != i13) {
                if (z6) {
                    c9.a.K(sheetBehavior, Integer.valueOf(i13), true, null);
                    requestLayout();
                    return;
                }
                if (!this.sheetDefaultResizeAnimationEnabled) {
                    int iC = c(getTranslationY(), i13);
                    Intrinsics.checkNotNullParameter(sheetBehavior, "<this>");
                    sheetBehavior.f6285l = iC;
                    layout(getLeft(), getBottom() - iC, getRight(), getBottom());
                    getParent().requestLayout();
                    updateScreenSizeFabric(getWidth(), iC, getTop() + ((int) getTranslationY()));
                    return;
                }
                final float translationY = getTranslationY();
                int iC2 = c(translationY, i14);
                final int iC3 = c(translationY, i13);
                float f2 = iC3 - iC2;
                if (f2 == 0.0f) {
                    return;
                }
                if (f2 <= 0.0f) {
                    animate().translationY(translationY - f2).withStartAction(new a1.l(iC3, 3, sheetBehavior)).withEndAction(new Runnable() { // from class: com.swmansion.rnscreens.p
                        @Override // java.lang.Runnable
                        public final void run() {
                            Screen.Companion companion = Screen.Companion;
                            Screen screen = this.f7220d;
                            screen.layout(screen.getLeft(), screen.getBottom() - iC3, screen.getRight(), screen.getBottom());
                            screen.setTranslationY(translationY);
                            screen.getParent().requestLayout();
                            screen.onSheetYTranslationChanged$react_native_screens_release();
                        }
                    }).start();
                } else {
                    setTranslationY(getTranslationY() + f2);
                    animate().translationY(translationY).withStartAction(new ab.a(sheetBehavior, iC3, this, 5)).withEndAction(new n(this, 1)).start();
                }
            }
        }
    }

    public final void onFinalizePropsUpdate$react_native_screens_release() {
        if (this.shouldUpdateSheetCornerRadius) {
            this.shouldUpdateSheetCornerRadius = false;
            onSheetCornerRadiusChange$react_native_screens_release();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        ScreenStackHeaderConfig headerConfig;
        ScreenStackHeaderConfig headerConfig2;
        Window window;
        if (z5 && (this.container instanceof ScreenStack) && !mm.j.b(this)) {
            int i13 = i11 - i7;
            int i14 = i12 - i10;
            if (this.insetsApplied || (headerConfig = getHeaderConfig()) == null || headerConfig.F || (headerConfig2 = getHeaderConfig()) == null || headerConfig2.G) {
                updateScreenSizeFabric(i13, i14, i10);
                return;
            }
            Activity currentActivity = this.reactContext.getCurrentActivity();
            View decorView = (currentActivity == null || (window = currentActivity.getWindow()) == null) ? null : window.getDecorView();
            if (decorView == null) {
                throw new IllegalArgumentException("[RNScreens] DecorView is required for applying inset correction, but was null.");
            }
            Intrinsics.checkNotNullParameter(decorView, "decorView");
            WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
            WindowInsetsCompat windowInsetsCompatA = androidx.core.view.m0.a(decorView);
            int i15 = windowInsetsCompatA == null ? 0 : windowInsetsCompatA.f1605a.f(647).f1557b;
            updateScreenSizeFabric(i13, i14 - i15, i10 + i15);
        }
    }

    public final void onSheetCornerRadiusChange$react_native_screens_release() {
        if (this.stackPresentation != StackPresentation.f7145v || getBackground() == null) {
            return;
        }
        Drawable background = getBackground();
        kh.i iVar = background instanceof kh.i ? (kh.i) background : null;
        if (iVar != null) {
            float fMax = Math.max(PixelUtil.toDIPFromPixel(this.sheetCornerRadius), 0.0f);
            kh.k kVar = new kh.k();
            kh.k kVar2 = new kh.k();
            kh.a aVar = new kh.a(0.0f);
            kh.a aVar2 = new kh.a(0.0f);
            kh.f fVar = new kh.f(0);
            kh.f fVar2 = new kh.f(0);
            kh.f fVar3 = new kh.f(0);
            kh.f fVar4 = new kh.f(0);
            com.facebook.imagepipeline.nativecode.b bVarO = com.facebook.imagepipeline.nativecode.c.o(0);
            kh.a aVar3 = new kh.a(fMax);
            com.facebook.imagepipeline.nativecode.b bVarO2 = com.facebook.imagepipeline.nativecode.c.o(0);
            kh.a aVar4 = new kh.a(fMax);
            kh.m mVar = new kh.m();
            mVar.f14500a = bVarO;
            mVar.f14501b = bVarO2;
            mVar.f14502c = kVar;
            mVar.f14503d = kVar2;
            mVar.f14504e = aVar3;
            mVar.f14505f = aVar4;
            mVar.f14506g = aVar;
            mVar.f14507h = aVar2;
            mVar.f14508i = fVar;
            mVar.j = fVar2;
            mVar.k = fVar3;
            mVar.f14509l = fVar4;
            iVar.setShapeAppearanceModel(mVar);
        }
    }

    public final void onSheetDetentChanged$react_native_screens_release(int i7, boolean z5) {
        int surfaceId = UIManagerHelper.getSurfaceId(this.reactContext);
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher != null) {
            reactEventDispatcher.dispatchEvent(new nm.f(surfaceId, getId(), i7, z5));
        }
        if (z5) {
            onSheetYTranslationChanged$react_native_screens_release();
        }
        ScreenContainer screenContainer = this.container;
        if (!(screenContainer == null ? true : screenContainer instanceof ScreenStack)) {
            throw new IllegalStateException("[RNScreens] Expected native stack screen.");
        }
        ScreenStack screenStack = (ScreenStack) screenContainer;
        if (screenStack != null) {
            screenStack.updateA11yForVisibleScreens$react_native_screens_release();
        }
    }

    public final void onSheetYTranslationChanged$react_native_screens_release() {
        updateScreenSizeFabric(getWidth(), getHeight(), getTop() + ((int) getTranslationY()));
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (mm.j.b(this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void registerLayoutCallbackForWrapper(@NotNull ScreenContentWrapper wrapper) {
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        wrapper.setDelegate$react_native_screens_release(this);
    }

    public final void requestTriggeringPostponedEnterTransition$react_native_screens_release() {
        if (this.sheetShouldOverflowTopInset) {
            return;
        }
        this.shouldTriggerPostponedTransitionAfterLayout = true;
    }

    public final void setActivityState(@NotNull ActivityState activityState) {
        Intrinsics.checkNotNullParameter(activityState, "activityState");
        ActivityState activityState2 = this.activityState;
        if (activityState == activityState2) {
            return;
        }
        if ((this.container instanceof ScreenStack) && activityState2 != null) {
            Intrinsics.checkNotNull(activityState2);
            if (activityState.compareTo(activityState2) < 0) {
                throw new IllegalStateException("[RNScreens] activityState can only progress in NativeStack");
            }
        }
        this.activityState = activityState;
        ScreenContainer screenContainer = this.container;
        if (screenContainer != null) {
            screenContainer.onChildUpdate();
        }
    }

    public final void setBeingRemoved(boolean z5) {
        this.isBeingRemoved = z5;
    }

    public final void setContainer(ScreenContainer screenContainer) {
        this.container = screenContainer;
    }

    public final void setFooter(ScreenFooter screenFooter) {
        BottomSheetBehavior<Screen> sheetBehavior;
        if (screenFooter == null && this.footer != null) {
            BottomSheetBehavior<Screen> behavior = getSheetBehavior();
            if (behavior != null) {
                ScreenFooter screenFooter2 = this.footer;
                Intrinsics.checkNotNull(screenFooter2);
                screenFooter2.getClass();
                Intrinsics.checkNotNullParameter(behavior, "behavior");
                if (screenFooter2.f7154x) {
                    behavior.Y.remove(screenFooter2.f7155y);
                    screenFooter2.f7154x = false;
                }
            }
        } else if (screenFooter != null && (sheetBehavior = getSheetBehavior()) != null) {
            screenFooter.g(sheetBehavior);
        }
        this.footer = screenFooter;
    }

    public final void setFragmentWrapper(ScreenFragmentWrapper screenFragmentWrapper) {
        this.fragmentWrapper = screenFragmentWrapper;
    }

    public final void setGestureEnabled(boolean z5) {
        this.isGestureEnabled = z5;
    }

    public final void setInsetsApplied(boolean z5) {
        this.insetsApplied = z5;
    }

    @Override // android.view.View
    public void setLayerType(int i7, Paint paint) {
    }

    public final void setNativeBackButtonDismissalEnabled(boolean z5) {
        this.nativeBackButtonDismissalEnabled = z5;
    }

    public final void setNavigationBarHidden(Boolean bool) {
        if (bool != null) {
            io.sentry.config.a.j = true;
        }
        this.isNavigationBarHidden = bool;
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            io.sentry.config.a.X(this, screenFragmentWrapper.e());
        }
    }

    public final void setReplaceAnimation(@NotNull ReplaceAnimation replaceAnimation) {
        Intrinsics.checkNotNullParameter(replaceAnimation, "<set-?>");
        this.replaceAnimation = replaceAnimation;
    }

    public final void setScreenId(String str) {
        this.screenId = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void setScreenOrientation(String str) {
        Integer screenOrientation;
        if (str == null) {
            this.screenOrientation = null;
            return;
        }
        int i7 = 1;
        io.sentry.config.a.f12580h = true;
        int iIntValue = -1;
        switch (str.hashCode()) {
            case -1894896954:
                i7 = !str.equals("portrait_down") ? -1 : 9;
                break;
            case 96673:
                i7 = !str.equals("all") ? -1 : 10;
                break;
            case 729267099:
                i7 = !str.equals("portrait") ? -1 : 7;
                break;
            case 1430647483:
                i7 = !str.equals("landscape") ? -1 : 6;
                break;
            case 1651658175:
                if (!str.equals("portrait_up")) {
                    i7 = -1;
                }
                break;
            case 1730732811:
                i7 = !str.equals("landscape_left") ? -1 : 8;
                break;
            case 2118770584:
                i7 = !str.equals("landscape_right") ? -1 : 0;
                break;
            default:
                i7 = -1;
                break;
        }
        this.screenOrientation = Integer.valueOf(i7);
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            Activity activityE = screenFragmentWrapper.e();
            Intrinsics.checkNotNullParameter(this, "screen");
            if (activityE == null) {
                return;
            }
            Screen screenT = io.sentry.config.a.t(this, q.f7228d);
            if (screenT != null && (screenOrientation = screenT.getScreenOrientation()) != null) {
                iIntValue = screenOrientation.intValue();
            }
            activityE.setRequestedOrientation(iIntValue);
        }
    }

    public final void setSheetClosesOnTouchOutside(boolean z5) {
        this.sheetClosesOnTouchOutside = z5;
    }

    public final void setSheetCornerRadius(float f2) {
        if (this.sheetCornerRadius == f2) {
            return;
        }
        this.sheetCornerRadius = f2;
        this.shouldUpdateSheetCornerRadius = true;
    }

    public final void setSheetDefaultResizeAnimationEnabled(boolean z5) {
        this.sheetDefaultResizeAnimationEnabled = z5;
    }

    public final void setSheetDetents(@NotNull SheetDetents sheetDetents) {
        Intrinsics.checkNotNullParameter(sheetDetents, "<set-?>");
        this.sheetDetents = sheetDetents;
    }

    public final void setSheetElevation(float f2) {
        this.sheetElevation = f2;
    }

    public final void setSheetExpandsWhenScrolledToEdge(boolean z5) {
        this.sheetExpandsWhenScrolledToEdge = z5;
    }

    public final void setSheetGrabberVisible(boolean z5) {
        this.isSheetGrabberVisible = z5;
    }

    public final void setSheetInitialDetentIndex(int i7) {
        this.sheetInitialDetentIndex = i7;
    }

    public final void setSheetLargestUndimmedDetentIndex(int i7) {
        this.sheetLargestUndimmedDetentIndex = i7;
    }

    public final void setSheetShouldOverflowTopInset(boolean z5) {
        this.sheetShouldOverflowTopInset = z5;
    }

    public final void setShouldTriggerPostponedTransitionAfterLayout(boolean z5) {
        this.shouldTriggerPostponedTransitionAfterLayout = z5;
    }

    public final void setStackAnimation(@NotNull StackAnimation stackAnimation) {
        Intrinsics.checkNotNullParameter(stackAnimation, "<set-?>");
        this.stackAnimation = stackAnimation;
    }

    public final void setStackPresentation(@NotNull StackPresentation stackPresentation) {
        Intrinsics.checkNotNullParameter(stackPresentation, "<set-?>");
        this.stackPresentation = stackPresentation;
    }

    public final void setStatusBarAnimated(Boolean bool) {
        this.isStatusBarAnimated = bool;
    }

    public final void setStatusBarHidden(Boolean bool) {
        if (bool != null) {
            io.sentry.config.a.f12581i = true;
        }
        this.isStatusBarHidden = bool;
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            io.sentry.config.a.W(this, screenFragmentWrapper.e());
        }
    }

    public final void setStatusBarStyle(String str) {
        if (str != null) {
            io.sentry.config.a.f12581i = true;
        }
        this.statusBarStyle = str;
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            io.sentry.config.a.Y(this, screenFragmentWrapper.e(), screenFragmentWrapper.i());
        }
    }

    public final void setTransitioning(boolean z5) {
        if (this.isTransitioning == z5) {
            return;
        }
        this.isTransitioning = z5;
        boolean zB = b(this);
        if (!zB || getLayerType() == 2) {
            super.setLayerType((!z5 || zB) ? 0 : 2, null);
        }
    }

    public void startRemovalTransition() {
        if (this.isBeingRemoved) {
            return;
        }
        this.isBeingRemoved = true;
        startTransitionRecursive(this);
    }

    public final void startTransitionRecursive(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if ((viewGroup instanceof androidx.swiperefreshlayout.widget.i) && (childAt instanceof ImageView)) {
                    viewGroup.addView(new View(getContext()), i7);
                } else if (childAt != null) {
                    viewGroup.startViewTransition(childAt);
                }
                if (childAt instanceof ScreenStackHeaderConfig) {
                    startTransitionRecursive(((ScreenStackHeaderConfig) childAt).getToolbar());
                }
                if (childAt instanceof ViewGroup) {
                    startTransitionRecursive((ViewGroup) childAt);
                }
            }
        }
    }

    public final void triggerPostponedEnterTransitionIfNeeded$react_native_screens_release() {
        if (this.shouldTriggerPostponedTransitionAfterLayout) {
            this.shouldTriggerPostponedTransitionAfterLayout = false;
            Fragment fragment = getFragment();
            if (fragment != null) {
                fragment.startPostponedEnterTransition();
            }
        }
    }
}
