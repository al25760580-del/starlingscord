package mg;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends androidx.core.view.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f15766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f15767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout$BaseBehavior f15768c;

    public c(CoordinatorLayout coordinatorLayout, AppBarLayout$BaseBehavior appBarLayout$BaseBehavior, f fVar) {
        this.f15768c = appBarLayout$BaseBehavior;
        this.f15766a = fVar;
        this.f15767b = coordinatorLayout;
    }

    @Override // androidx.core.view.b
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.o(ScrollView.class.getName());
        f fVar = this.f15766a;
        if (fVar.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.f15767b;
        AppBarLayout$BaseBehavior appBarLayout$BaseBehavior = this.f15768c;
        View viewU = AppBarLayout$BaseBehavior.u(appBarLayout$BaseBehavior, coordinatorLayout);
        if (viewU == null) {
            return;
        }
        appBarLayout$BaseBehavior.getClass();
        int childCount = fVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            if (((e) fVar.getChildAt(i7).getLayoutParams()).f15774a != 0) {
                if (appBarLayout$BaseBehavior.x() != (-fVar.getTotalScrollRange())) {
                    accessibilityNodeInfoCompat.b(androidx.core.view.accessibility.a.f1620i);
                    accessibilityNodeInfoCompat.y(true);
                }
                if (appBarLayout$BaseBehavior.x() != 0) {
                    if (!viewU.canScrollVertically(-1)) {
                        accessibilityNodeInfoCompat.b(androidx.core.view.accessibility.a.j);
                        accessibilityNodeInfoCompat.y(true);
                        return;
                    } else {
                        if ((-fVar.getDownNestedPreScrollRange()) != 0) {
                            accessibilityNodeInfoCompat.b(androidx.core.view.accessibility.a.j);
                            accessibilityNodeInfoCompat.y(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // androidx.core.view.b
    public final boolean performAccessibilityAction(View view, int i7, Bundle bundle) {
        f fVar = this.f15766a;
        if (i7 == 4096) {
            fVar.setExpanded(false);
            return true;
        }
        if (i7 != 8192) {
            return super.performAccessibilityAction(view, i7, bundle);
        }
        AppBarLayout$BaseBehavior appBarLayout$BaseBehavior = this.f15768c;
        if (appBarLayout$BaseBehavior.x() != 0) {
            CoordinatorLayout coordinatorLayout = this.f15767b;
            View viewU = AppBarLayout$BaseBehavior.u(appBarLayout$BaseBehavior, coordinatorLayout);
            if (!viewU.canScrollVertically(-1)) {
                fVar.setExpanded(true);
                return true;
            }
            int i10 = -fVar.getDownNestedPreScrollRange();
            if (i10 != 0) {
                appBarLayout$BaseBehavior.y(coordinatorLayout, this.f15766a, viewU, i10, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
