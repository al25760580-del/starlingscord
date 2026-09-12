package com.facebook.react.views.drawer;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.b;
import androidx.core.view.u0;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.drawerlayout.widget.d;
import com.facebook.react.R;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.events.NativeGestureUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o8.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\r\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\b\u0011J\r\u0010\u0012\u001a\u00020\u0010H\u0001¢\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0016J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0019J\r\u0010\u001a\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/facebook/react/views/drawer/ReactDrawerLayout;", "Landroidx/drawerlayout/widget/DrawerLayout;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "drawerPosition", "", "drawerWidth", "dragging", "", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onTouchEvent", ReactDrawerLayoutManager.COMMAND_OPEN_DRAWER, "", "openDrawer$ReactAndroid_release", ReactDrawerLayoutManager.COMMAND_CLOSE_DRAWER, "closeDrawer$ReactAndroid_release", "setDrawerPosition", "newDrawerPosition", "setDrawerPosition$ReactAndroid_release", "setDrawerWidth", "drawerWidthInPx", "setDrawerWidth$ReactAndroid_release", "setDrawerProperties", "setDrawerProperties$ReactAndroid_release", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactDrawerLayout extends DrawerLayout {
    public static final int DEFAULT_DRAWER_WIDTH = -1;
    private boolean dragging;
    private int drawerPosition;
    private int drawerWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactDrawerLayout(@NotNull ReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.drawerPosition = 8388611;
        this.drawerWidth = -1;
        u0.p(this, new b() { // from class: com.facebook.react.views.drawer.ReactDrawerLayout.1
            @Override // androidx.core.view.b
            public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(event, "event");
                super.onInitializeAccessibilityEvent(host, event);
                Object tag = host.getTag(R.id.accessibility_role);
                if (tag instanceof ReactAccessibilityDelegate.AccessibilityRole) {
                    event.setClassName(ReactAccessibilityDelegate.AccessibilityRole.INSTANCE.getValue((ReactAccessibilityDelegate.AccessibilityRole) tag));
                }
            }

            @Override // androidx.core.view.b
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                ReactAccessibilityDelegate.AccessibilityRole.Companion companion = ReactAccessibilityDelegate.AccessibilityRole.INSTANCE;
                ReactAccessibilityDelegate.AccessibilityRole accessibilityRoleFromViewTag = companion.fromViewTag(host);
                if (accessibilityRoleFromViewTag != null) {
                    info.o(companion.getValue(accessibilityRoleFromViewTag));
                }
            }
        });
    }

    @SuppressLint({"WrongConstant"})
    public final void closeDrawer$ReactAndroid_release() {
        closeDrawer(this.drawerPosition);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        try {
            if (!super.onInterceptTouchEvent(ev)) {
                return false;
            }
            NativeGestureUtil.notifyNativeGestureStarted(this, ev);
            this.dragging = true;
            return true;
        } catch (IllegalArgumentException e10) {
            a.w(ReactConstants.TAG, "Error intercepting touch event.", e10);
            return false;
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (ev.getActionMasked() == 1 && this.dragging) {
            NativeGestureUtil.notifyNativeGestureEnded(this, ev);
            this.dragging = false;
        }
        super.onTouchEvent(ev);
        return true;
    }

    @SuppressLint({"WrongConstant"})
    public final void openDrawer$ReactAndroid_release() {
        openDrawer(this.drawerPosition);
    }

    public final void setDrawerPosition$ReactAndroid_release(int newDrawerPosition) {
        this.drawerPosition = newDrawerPosition;
        setDrawerProperties$ReactAndroid_release();
    }

    public final void setDrawerProperties$ReactAndroid_release() {
        if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.drawerlayout.widget.DrawerLayout.LayoutParams");
            d dVar = (d) layoutParams;
            dVar.f1981a = this.drawerPosition;
            ((ViewGroup.MarginLayoutParams) dVar).width = this.drawerWidth;
            childAt.setLayoutParams(dVar);
            childAt.setClickable(true);
        }
    }

    public final void setDrawerWidth$ReactAndroid_release(int drawerWidthInPx) {
        this.drawerWidth = drawerWidthInPx;
        setDrawerProperties$ReactAndroid_release();
    }
}
