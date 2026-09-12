package com.discord.view;

import android.view.View;
import com.discord.R;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import io.sentry.Breadcrumb;
import io.sentry.SentryLevel;
import io.sentry.c4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(canOverrideExistingModule = true, name = "RCTView")
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/discord/view/ReactViewManagerOverride;", "Lcom/facebook/react/views/view/ReactViewManager;", "<init>", "()V", "createViewInstance", "Lcom/discord/view/ReactViewGroupOverride;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "addView", "", "parent", "Lcom/facebook/react/views/view/ReactViewGroup;", "child", "Landroid/view/View;", "index", "", "app_googleRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactViewManagerOverride extends ReactViewManager {
    @Override // com.facebook.react.views.view.ReactClippingViewManager, com.facebook.react.uimanager.ViewGroupManager
    public void addView(@NotNull ReactViewGroup parent, @NotNull View child, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child.getParent() != null) {
            Object tag = child.getTag(R.id.view_is_transitioning);
            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            boolean zAreEqual = Intrinsics.areEqual(child.getParent(), parent);
            boolean removeClippedSubviews = parent.getRemoveClippedSubviews();
            Object tag2 = child.getTag(com.facebook.react.R.id.view_clipped);
            Boolean bool2 = tag2 instanceof Boolean ? (Boolean) tag2 : null;
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            String name = child.getClass().getName();
            Breadcrumb breadcrumb = new Breadcrumb();
            breadcrumb.f12008w = "info";
            breadcrumb.f12007v = "ReactViewManagerOverride: Child view already has a parent!";
            breadcrumb.F = SentryLevel.INFO;
            Intrinsics.checkNotNullExpressionValue(breadcrumb, "info(...)");
            breadcrumb.f12010y = "react.viewmanager";
            breadcrumb.c(Boolean.valueOf(zBooleanValue), "isTransitioning");
            breadcrumb.c(Boolean.valueOf(zAreEqual), "wantsToAddToSameParent");
            breadcrumb.c(Boolean.valueOf(removeClippedSubviews), "isParentClipping");
            breadcrumb.c(Boolean.valueOf(zBooleanValue2), "isChildClipped");
            breadcrumb.c(name, "childClassType");
            c4.a(breadcrumb);
        }
        super.addView(parent, child, index);
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public ReactViewGroupOverride createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ReactViewGroupOverride(context);
    }
}
