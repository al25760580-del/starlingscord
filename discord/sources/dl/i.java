package dl;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.otaliastudios.zoom.ZoomEngine;
import kotlin.jvm.internal.Intrinsics;
import n.a0;
import nh.n;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7685e;

    public /* synthetic */ i(int i7, Object obj) {
        this.f7684d = i7;
        this.f7685e = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f7684d) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                view.getViewTreeObserver().addOnGlobalLayoutListener(((ZoomEngine) this.f7685e).f7022d);
                break;
            case 1:
                view.getViewTreeObserver().addOnDrawListener((io.sentry.android.core.internal.util.h) this.f7685e);
                view.removeOnAttachStateChangeListener(this);
                break;
            case 4:
                n nVar = (n) this.f7685e;
                AccessibilityManager accessibilityManager = nVar.Q;
                if (nVar.R != null && accessibilityManager != null && nVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(nVar.R);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        switch (this.f7684d) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                view.getViewTreeObserver().removeOnGlobalLayoutListener(((ZoomEngine) this.f7685e).f7022d);
                break;
            case 1:
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                n.d dVar = (n.d) this.f7685e;
                ViewTreeObserver viewTreeObserver = dVar.U;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        dVar.U = view.getViewTreeObserver();
                    }
                    dVar.U.removeGlobalOnLayoutListener(dVar.F);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                a0 a0Var = (a0) this.f7685e;
                ViewTreeObserver viewTreeObserver2 = a0Var.L;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        a0Var.L = view.getViewTreeObserver();
                    }
                    a0Var.L.removeGlobalOnLayoutListener(a0Var.F);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 4:
                n nVar = (n) this.f7685e;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = nVar.R;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = nVar.Q) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 5:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f7685e;
                og.a aVar = hideBottomViewOnScrollBehavior.f6253h;
                if (aVar != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.f6252g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(aVar);
                    hideBottomViewOnScrollBehavior.f6253h = null;
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f7685e;
                og.a aVar2 = hideViewOnScrollBehavior.f6257c;
                if (aVar2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.f6256b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(aVar2);
                    hideViewOnScrollBehavior.f6257c = null;
                    break;
                }
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }
}
