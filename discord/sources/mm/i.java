package mm;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.inputmethod.InputMethodManager;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.f2;
import androidx.core.view.l0;
import androidx.core.view.m0;
import androidx.core.view.r1;
import androidx.core.view.t1;
import androidx.core.view.u0;
import androidx.core.view.u1;
import androidx.core.view.v1;
import androidx.core.view.w1;
import androidx.core.view.x1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.t;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ThemedReactContext;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenContainer;
import com.swmansion.rnscreens.ScreenContentWrapper;
import com.swmansion.rnscreens.ScreenFooter;
import com.swmansion.rnscreens.bottomsheet.SheetDetents;
import com.swmansion.rnscreens.e0;
import com.swmansion.rnscreens.k;
import com.swmansion.rnscreens.l;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import rn.n;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements t, androidx.core.view.t {
    public final f E;
    public final f F;
    public View G;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Screen f15906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15907e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ib.a f15908i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f15909v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15910w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f15911x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f15912y;

    public i(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f15906d = screen;
        this.f15908i = k.f7211b;
        this.f15912y = screen.getSheetInitialDetentIndex();
        screen.getSheetDetents().e(screen.getSheetInitialDetentIndex());
        f fVar = new f(1, this);
        this.E = fVar;
        this.F = new f(0, this);
        screen.getFragment();
        Fragment fragment = screen.getFragment();
        Intrinsics.checkNotNull(fragment);
        fragment.getLifecycle().a(this);
        BottomSheetBehavior<Screen> sheetBehavior = screen.getSheetBehavior();
        if (sheetBehavior == null) {
            throw new IllegalStateException("[RNScreens] Sheet delegate accepts screen with initialized sheet behaviour only.");
        }
        sheetBehavior.s(fVar);
    }

    public static void d(i iVar, BottomSheetBehavior behavior, ib.a keyboardState, int i7) {
        int iC;
        int iC2;
        if ((i7 & 2) != 0) {
            keyboardState = k.f7211b;
        }
        int i10 = iVar.f15912y;
        f fVar = iVar.F;
        Screen screen = iVar.f15906d;
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(keyboardState, "keyboardState");
        Integer numG = iVar.g();
        if (numG == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration");
        }
        if (!behavior.I) {
            behavior.I = true;
            behavior.K();
        }
        behavior.K = true;
        behavior.s(iVar.E);
        ScreenFooter footer = screen.getFooter();
        if (footer != null) {
            footer.g(behavior);
        }
        if (keyboardState instanceof k) {
            int size = screen.getSheetDetents().f7172a.size();
            if (size == 1) {
                if (j.a(screen)) {
                    screen.getSheetDetents().getClass();
                    iC2 = SheetDetents.d(screen);
                } else {
                    iC2 = screen.getSheetDetents().c(numG.intValue());
                }
                c9.a.K(behavior, Integer.valueOf(iC2), true, Boolean.valueOf(screen.getSheetShouldOverflowTopInset()));
                return;
            }
            if (size == 2) {
                c9.a.N(behavior, Integer.valueOf(screen.getSheetDetents().e(i10)), Integer.valueOf(screen.getSheetDetents().b(0, numG.intValue())), Integer.valueOf(screen.getSheetDetents().c(numG.intValue())), Boolean.valueOf(screen.getSheetShouldOverflowTopInset()));
                return;
            }
            if (size != 3) {
                throw new IllegalStateException(s0.g.d(screen.getSheetDetents().f7172a.size(), "[RNScreens] Invalid detent count ", ". Expected at most 3."));
            }
            int iE = screen.getSheetDetents().e(i10);
            int iB = screen.getSheetDetents().b(0, numG.intValue());
            List list = screen.getSheetDetents().f7172a;
            if (list.size() < 3) {
                throw new IllegalStateException("[RNScreens] At least 3 detents required for halfExpandedRatio.");
            }
            c9.a.L(behavior, Integer.valueOf(iE), Integer.valueOf(iB), Integer.valueOf(screen.getSheetDetents().c(numG.intValue())), Float.valueOf((float) (((Number) list.get(1)).doubleValue() / ((Number) list.get(2)).doubleValue())), Integer.valueOf(screen.getSheetDetents().a(numG.intValue(), iVar.f15910w, screen.getSheetShouldOverflowTopInset())), Boolean.valueOf(screen.getSheetShouldOverflowTopInset()));
            return;
        }
        if (keyboardState instanceof l) {
            boolean z5 = ((l) keyboardState).f7214b != 0;
            int size2 = screen.getSheetDetents().f7172a.size();
            if (size2 == 1) {
                behavior.s(fVar);
                return;
            }
            if (size2 == 2) {
                if (z5) {
                    c9.a.O(behavior, null, null, null, 14);
                } else {
                    c9.a.O(behavior, null, null, null, 15);
                }
                behavior.s(fVar);
                return;
            }
            if (size2 != 3) {
                throw new IllegalStateException(s0.g.d(screen.getSheetDetents().f7172a.size(), "[RNScreens] Invalid detent count ", ". Expected at most 3."));
            }
            if (z5) {
                c9.a.M(behavior, null, null, null, null, null, 62);
            } else {
                c9.a.M(behavior, null, null, null, null, null, 63);
            }
            behavior.s(fVar);
            return;
        }
        if (!(keyboardState instanceof com.swmansion.rnscreens.j)) {
            throw new n();
        }
        behavior.Y.remove(fVar);
        int size3 = screen.getSheetDetents().f7172a.size();
        if (size3 == 1) {
            if (j.a(screen)) {
                screen.getSheetDetents().getClass();
                iC = SheetDetents.d(screen);
            } else {
                iC = screen.getSheetDetents().c(numG.intValue());
            }
            c9.a.K(behavior, Integer.valueOf(iC), false, Boolean.valueOf(screen.getSheetShouldOverflowTopInset()));
            return;
        }
        if (size3 == 2) {
            c9.a.O(behavior, Integer.valueOf(screen.getSheetDetents().b(0, numG.intValue())), Integer.valueOf(screen.getSheetDetents().c(numG.intValue())), Boolean.valueOf(screen.getSheetShouldOverflowTopInset()), 1);
            return;
        }
        if (size3 != 3) {
            throw new IllegalStateException(s0.g.d(screen.getSheetDetents().f7172a.size(), "[RNScreens] Invalid detent count ", ". Expected at most 3."));
        }
        int iB2 = screen.getSheetDetents().b(0, numG.intValue());
        List list2 = screen.getSheetDetents().f7172a;
        if (list2.size() < 3) {
            throw new IllegalStateException("[RNScreens] At least 3 detents required for halfExpandedRatio.");
        }
        c9.a.M(behavior, Integer.valueOf(iB2), Integer.valueOf(screen.getSheetDetents().c(numG.intValue())), Float.valueOf((float) (((Number) list2.get(1)).doubleValue() / ((Number) list2.get(2)).doubleValue())), Integer.valueOf(screen.getSheetDetents().a(numG.intValue(), iVar.f15910w, screen.getSheetShouldOverflowTopInset())), Boolean.valueOf(screen.getSheetShouldOverflowTopInset()), 1);
    }

    @Override // androidx.core.view.t
    public final WindowInsetsCompat a(View v6, WindowInsetsCompat insets) {
        x1 t1Var;
        Intrinsics.checkNotNullParameter(v6, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        f2 f2Var = insets.f1605a;
        boolean zP = f2Var.p(8);
        Insets insetsF = f2Var.f(8);
        Intrinsics.checkNotNullExpressionValue(insetsF, "getInsets(...)");
        Insets insetsF2 = f2Var.f(519);
        Intrinsics.checkNotNullExpressionValue(insetsF2, "getInsets(...)");
        Insets insetsF3 = f2Var.f(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        Intrinsics.checkNotNullExpressionValue(insetsF3, "getInsets(...)");
        this.f15910w = Math.max(insetsF2.f1557b, insetsF3.f1557b);
        Screen screen = this.f15906d;
        if (zP) {
            this.f15907e = true;
            this.f15908i = new l(insetsF.f1559d);
            BottomSheetBehavior<Screen> sheetBehavior = screen.getSheetBehavior();
            if (sheetBehavior != null) {
                d(this, sheetBehavior, this.f15908i, 4);
            }
        } else {
            BottomSheetBehavior<Screen> sheetBehavior2 = screen.getSheetBehavior();
            k kVar = k.f7211b;
            if (sheetBehavior2 != null) {
                if (this.f15907e) {
                    d(this, sheetBehavior2, com.swmansion.rnscreens.j.f7204b, 4);
                } else if (!Intrinsics.areEqual(this.f15908i, kVar)) {
                    d(this, sheetBehavior2, kVar, 4);
                }
            }
            this.f15908i = kVar;
            this.f15907e = false;
        }
        int i7 = zP ? 0 : insetsF2.f1559d;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            t1Var = new w1(insets);
        } else if (i10 >= 31) {
            t1Var = new v1(insets);
        } else if (i10 >= 30) {
            t1Var = new u1(insets);
        } else {
            t1Var = i10 >= 29 ? new t1(insets) : new r1(insets);
        }
        t1Var.c(519, Insets.b(insetsF2.f1556a, insetsF2.f1557b, insetsF2.f1558c, i7));
        WindowInsetsCompat windowInsetsCompatB = t1Var.b();
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatB, "build(...)");
        return windowInsetsCompatB;
    }

    public final void b(AnimatorSet animatorSet, boolean z5, e0 e0Var) {
        Screen screen = this.f15906d;
        Intrinsics.checkNotNullParameter(screen, "screen");
        u4.c cVar = new u4.c();
        cVar.f20946d = screen;
        animatorSet.addListener(new nm.c(e0Var, cVar, z5 ? nm.a.f16961d : nm.a.f16962e));
        animatorSet.addListener(new androidx.appcompat.widget.c(3, this));
    }

    @Override // androidx.lifecycle.t
    public final void c(LifecycleOwner source, androidx.lifecycle.n event) {
        View currentFocus;
        View decorView;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i7 = h.f15905a[event.ordinal()];
        Screen screen = this.f15906d;
        if (i7 == 1) {
            Activity currentActivity = screen.getReactContext().getCurrentActivity();
            if (currentActivity == null || (currentFocus = currentActivity.getCurrentFocus()) == null) {
                return;
            }
            Window window = currentActivity.getWindow();
            if (window != null && (decorView = window.getDecorView()) != null) {
                Intrinsics.checkNotNullParameter(decorView, "decorView");
                WeakHashMap weakHashMap = u0.f1729a;
                WindowInsetsCompat windowInsetsCompatA = m0.a(decorView);
                if (Intrinsics.areEqual(windowInsetsCompatA != null ? Boolean.valueOf(windowInsetsCompatA.f1605a.p(8)) : null, Boolean.TRUE)) {
                    this.G = currentFocus;
                }
            }
            screen.requestFocus();
            InputMethodManager inputMethodManagerE = e();
            if (inputMethodManagerE != null) {
                inputMethodManagerE.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                return;
            }
            return;
        }
        if (i7 == 2) {
            com.swmansion.rnscreens.i iVar = com.swmansion.rnscreens.i.f7197d;
            Activity currentActivity2 = screen.getReactContext().getCurrentActivity();
            if (currentActivity2 == null) {
                throw new IllegalStateException("[RNScreens] Attempt to access activity on detached context");
            }
            View view = currentActivity2.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(view, "getDecorView(...)");
            Intrinsics.checkNotNullParameter(view, "view");
            if (!com.swmansion.rnscreens.i.f7200v || com.swmansion.rnscreens.i.f7199i.get() == null) {
                WeakHashMap weakHashMap2 = u0.f1729a;
                l0.m(view, iVar);
                com.swmansion.rnscreens.i.f7199i = new WeakReference(view);
                com.swmansion.rnscreens.i.f7200v = true;
                return;
            }
            return;
        }
        if (i7 == 3) {
            com.swmansion.rnscreens.i iVar2 = com.swmansion.rnscreens.i.f7197d;
            Intrinsics.checkNotNullParameter(this, "listener");
            com.swmansion.rnscreens.i.f7198e.add(this);
        } else if (i7 == 4) {
            com.swmansion.rnscreens.i iVar3 = com.swmansion.rnscreens.i.f7197d;
            Intrinsics.checkNotNullParameter(this, "listener");
            com.swmansion.rnscreens.i.f7198e.remove(this);
        } else {
            if (i7 != 5) {
                return;
            }
            View view2 = this.G;
            if (view2 != null) {
                view2.requestFocus();
                InputMethodManager inputMethodManagerE2 = e();
                if (inputMethodManagerE2 != null) {
                    inputMethodManagerE2.showSoftInput(view2, 0);
                }
            }
            this.G = null;
        }
    }

    public final InputMethodManager e() {
        Object systemService = this.f15906d.getReactContext().getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            return (InputMethodManager) systemService;
        }
        return null;
    }

    public final Integer f() {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        DisplayMetrics displayMetrics;
        Screen screen = this.f15906d;
        ScreenContainer container = screen.getContainer();
        if (container != null) {
            return Integer.valueOf(container.getHeight());
        }
        ThemedReactContext reactContext = screen.getReactContext();
        Resources resources = reactContext.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            return Integer.valueOf(displayMetrics.heightPixels);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Object systemService = reactContext.getSystemService("window");
            WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
            if (windowManager != null && (currentWindowMetrics = windowManager.getCurrentWindowMetrics()) != null && (bounds = currentWindowMetrics.getBounds()) != null) {
                return Integer.valueOf(bounds.height());
            }
        }
        return null;
    }

    public final Integer g() {
        if (this.f15906d.getSheetShouldOverflowTopInset()) {
            return f();
        }
        Integer numF = f();
        if (numF != null) {
            return Integer.valueOf(numF.intValue() - this.f15910w);
        }
        return null;
    }

    public final void h(float f2) {
        int iMin;
        int i7 = this.f15911x;
        Integer numG = g();
        if (numG == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration");
        }
        Screen screen = this.f15906d;
        if (j.a(screen)) {
            ScreenContentWrapper contentWrapper = screen.getContentWrapper();
            iMin = Math.min(Math.max(numG.intValue() - (contentWrapper != null ? contentWrapper.getHeight() : 0), 0), i7);
        } else {
            iMin = Math.min(numG.intValue() - ((int) (lo.j.b(((Number) CollectionsKt.Q(screen.getSheetDetents().f7172a)).doubleValue(), 0.0d, 1.0d) * ((double) numG.intValue()))), i7);
        }
        screen.setTranslationY(f2 - iMin);
    }
}
