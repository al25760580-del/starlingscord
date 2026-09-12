package com.facebook.react.views.scroll;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.b;
import com.facebook.react.R;
import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewAccessibilityDelegate;", "Landroidx/core/view/b;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/view/accessibility/AccessibilityEvent;", "event", "", "onInitializeAccessibilityEventInternal", "(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "onInitializeAccessibilityNodeInfoInternal", "(Landroid/view/View;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V", "host", "onInitializeAccessibilityEvent", "onInitializeAccessibilityNodeInfo", "", "TAG", "Ljava/lang/String;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactScrollViewAccessibilityDelegate extends b {

    @NotNull
    private final String TAG;

    public ReactScrollViewAccessibilityDelegate() {
        Intrinsics.checkNotNullExpressionValue("ReactScrollViewAccessibilityDelegate", "getSimpleName(...)");
        this.TAG = "ReactScrollViewAccessibilityDelegate";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onInitializeAccessibilityEventInternal(View view, AccessibilityEvent event) {
        Object tag = view.getTag(R.id.accessibility_collection);
        Integer numValueOf = null;
        ReadableMap readableMap = tag instanceof ReadableMap ? (ReadableMap) tag : null;
        if (readableMap == null) {
            return;
        }
        event.setItemCount(readableMap.getInt("itemCount"));
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
        ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup2 == null) {
            return;
        }
        int childCount = viewGroup2.getChildCount();
        Integer numValueOf2 = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt2 = viewGroup2.getChildAt(i7);
            if (!(view instanceof ReactAccessibleScrollView)) {
                return;
            }
            Intrinsics.checkNotNull(childAt2);
            boolean zIsPartiallyScrolledInView = ((ReactAccessibleScrollView) view).isPartiallyScrolledInView(childAt2);
            Object tag2 = childAt2.getTag(R.id.accessibility_collection_item);
            Intrinsics.checkNotNull(tag2, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableMap");
            ReadableMap readableMap2 = (ReadableMap) tag2;
            if (!(childAt2 instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) childAt2).getChildCount();
            if (zIsPartiallyScrolledInView) {
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(readableMap2.getInt("itemIndex"));
                }
                numValueOf2 = Integer.valueOf(readableMap2.getInt("itemIndex"));
            }
            if (numValueOf != null && numValueOf2 != null) {
                event.setFromIndex(numValueOf.intValue());
                event.setToIndex(numValueOf2.intValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onInitializeAccessibilityNodeInfoInternal(View view, AccessibilityNodeInfoCompat info) {
        ReactAccessibilityDelegate.AccessibilityRole accessibilityRoleFromViewTag = ReactAccessibilityDelegate.AccessibilityRole.INSTANCE.fromViewTag(view);
        if (accessibilityRoleFromViewTag != null) {
            ReactAccessibilityDelegate.Companion companion = ReactAccessibilityDelegate.INSTANCE;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            companion.setRole(info, accessibilityRoleFromViewTag, context);
        }
        Object tag = view.getTag(R.id.accessibility_collection);
        ReadableMap readableMap = tag instanceof ReadableMap ? (ReadableMap) tag : null;
        if (readableMap != null) {
            info.f1613a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(readableMap.getInt("rowCount"), readableMap.getInt("columnCount"), readableMap.getBoolean("hierarchical")));
        }
        if (view instanceof ReactAccessibleScrollView) {
            info.y(((ReactAccessibleScrollView) view).getScrollEnabled());
        }
    }

    @Override // androidx.core.view.b
    public void onInitializeAccessibilityEvent(@NotNull View host, @NotNull AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(event, "event");
        super.onInitializeAccessibilityEvent(host, event);
        if (host instanceof ReactAccessibleScrollView) {
            onInitializeAccessibilityEventInternal(host, event);
        } else {
            ReactSoftExceptionLogger.logSoftException(this.TAG, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactAccessibleScrollView, not with class: ".concat(host.getClass().getSimpleName())));
        }
    }

    @Override // androidx.core.view.b
    public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull AccessibilityNodeInfoCompat info) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        if (host instanceof ReactAccessibleScrollView) {
            onInitializeAccessibilityNodeInfoInternal(host, info);
        } else {
            ReactSoftExceptionLogger.logSoftException(this.TAG, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactAccessibleScrollView, not with class: ".concat(host.getClass().getSimpleName())));
        }
    }
}
