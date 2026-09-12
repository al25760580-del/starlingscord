package androidx.drawerlayout.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.u0;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c extends androidx.core.view.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f1979a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f1980b;

    public c(DrawerLayout drawerLayout) {
        this.f1980b = drawerLayout;
    }

    @Override // androidx.core.view.b
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        CharSequence drawerTitle;
        if (accessibilityEvent.getEventType() != 32) {
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        List<CharSequence> text = accessibilityEvent.getText();
        DrawerLayout drawerLayout = this.f1980b;
        View viewFindVisibleDrawer = drawerLayout.findVisibleDrawer();
        if (viewFindVisibleDrawer == null || (drawerTitle = drawerLayout.getDrawerTitle(drawerLayout.getDrawerViewAbsoluteGravity(viewFindVisibleDrawer))) == null) {
            return true;
        }
        text.add(drawerTitle);
        return true;
    }

    @Override // androidx.core.view.b
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override // androidx.core.view.b
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (DrawerLayout.CAN_HIDE_DESCENDANTS) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        } else {
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f1613a;
            AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfoCompat.f1613a;
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            super.onInitializeAccessibilityNodeInfo(view, new AccessibilityNodeInfoCompat(accessibilityNodeInfoObtain));
            accessibilityNodeInfoCompat.f1614b = -1;
            accessibilityNodeInfo2.setSource(view);
            WeakHashMap weakHashMap = u0.f1729a;
            Object parentForAccessibility = view.getParentForAccessibility();
            if (parentForAccessibility instanceof View) {
                accessibilityNodeInfo2.setParent((View) parentForAccessibility);
            }
            Rect rect = this.f1979a;
            accessibilityNodeInfoObtain.getBoundsInScreen(rect);
            accessibilityNodeInfo2.setBoundsInScreen(rect);
            accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
            accessibilityNodeInfo2.setPackageName(accessibilityNodeInfoObtain.getPackageName());
            accessibilityNodeInfoCompat.o(accessibilityNodeInfoObtain.getClassName());
            accessibilityNodeInfoCompat.s(accessibilityNodeInfoObtain.getContentDescription());
            accessibilityNodeInfo2.setEnabled(accessibilityNodeInfoObtain.isEnabled());
            accessibilityNodeInfo2.setFocused(accessibilityNodeInfoObtain.isFocused());
            accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfoObtain.isAccessibilityFocused());
            accessibilityNodeInfo2.setSelected(accessibilityNodeInfoObtain.isSelected());
            accessibilityNodeInfoCompat.a(accessibilityNodeInfoObtain.getActions());
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (DrawerLayout.includeChildForAccessibility(childAt)) {
                    accessibilityNodeInfo2.addChild(childAt);
                }
            }
        }
        accessibilityNodeInfoCompat.o("androidx.drawerlayout.widget.DrawerLayout");
        AccessibilityNodeInfo accessibilityNodeInfo3 = accessibilityNodeInfoCompat.f1613a;
        accessibilityNodeInfo3.setFocusable(false);
        accessibilityNodeInfo3.setFocused(false);
        accessibilityNodeInfo3.removeAction((AccessibilityNodeInfo.AccessibilityAction) androidx.core.view.accessibility.a.f1616e.f1627a);
        accessibilityNodeInfo3.removeAction((AccessibilityNodeInfo.AccessibilityAction) androidx.core.view.accessibility.a.f1617f.f1627a);
    }

    @Override // androidx.core.view.b
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (DrawerLayout.CAN_HIDE_DESCENDANTS || DrawerLayout.includeChildForAccessibility(view)) {
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return false;
    }
}
