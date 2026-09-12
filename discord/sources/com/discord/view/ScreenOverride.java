package com.discord.view;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.r0;
import androidx.swiperefreshlayout.widget.i;
import c6.a;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.google.firebase.messaging.s;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenStackHeaderConfig;
import io.sentry.Breadcrumb;
import io.sentry.SentryLevel;
import io.sentry.c4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.j0;
import kotlin.collections.x0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/discord/view/ScreenOverride;", "Lcom/swmansion/rnscreens/Screen;", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "surfaceId", "", "getSurfaceId", "()I", "surfaceId$delegate", "Lkotlin/Lazy;", "uiManager", "Lcom/facebook/react/bridge/UIManager;", "getUiManager", "()Lcom/facebook/react/bridge/UIManager;", "uiManager$delegate", "startRemovalTransition", "", "inTransitionViews", "", "Lkotlin/Pair;", "Landroid/view/ViewGroup;", "Landroid/view/View;", "startTransitionRecursive", "parent", "endRemovalTransition", "app_googleRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class ScreenOverride extends Screen {

    @NotNull
    private final List<Pair<ViewGroup, View>> inTransitionViews;

    /* JADX INFO: renamed from: surfaceId$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy surfaceId;

    /* JADX INFO: renamed from: uiManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy uiManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenOverride(@NotNull ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.surfaceId = l.b(new r0(29, reactContext));
        this.uiManager = l.b(new a(24, reactContext, this));
        this.inTransitionViews = new ArrayList();
    }

    private final int getSurfaceId() {
        return ((Number) this.surfaceId.getValue()).intValue();
    }

    private final UIManager getUiManager() {
        return (UIManager) this.uiManager.getValue();
    }

    private final void startTransitionRecursive(ViewGroup parent) {
        if (parent != null) {
            int childCount = parent.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = parent.getChildAt(i7);
                if ((parent instanceof i) && (childAt instanceof ImageView)) {
                    parent.addView(new View(getContext()), i7);
                } else if (childAt != null) {
                    UIManager uiManager = getUiManager();
                    if (uiManager != null) {
                        uiManager.markViewAsInTransition(getSurfaceId(), childAt.getId(), true);
                    }
                    parent.startViewTransition(childAt);
                    this.inTransitionViews.add(new Pair<>(parent, childAt));
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final UIManager uiManager_delegate$lambda$1(ThemedReactContext themedReactContext, ScreenOverride screenOverride) {
        return UIManagerHelper.getUIManager(themedReactContext, screenOverride.getSurfaceId());
    }

    @Override // com.swmansion.rnscreens.Screen
    public void endRemovalTransition() {
        if (!isBeingRemoved()) {
            return;
        }
        setBeingRemoved(false);
        Iterator it = j0.y(this.inTransitionViews).iterator();
        while (true) {
            ListIterator listIterator = ((x0) it).f14671d;
            if (!listIterator.hasPrevious()) {
                this.inTransitionViews.clear();
                Breadcrumb breadcrumb = new Breadcrumb();
                breadcrumb.f12008w = "info";
                breadcrumb.f12007v = "ScreenOverride: endRemovalTransition called (w/ patch)";
                breadcrumb.F = SentryLevel.INFO;
                Intrinsics.checkNotNullExpressionValue(breadcrumb, "info(...)");
                breadcrumb.f12010y = "react.viewmanager";
                c4.a(breadcrumb);
                return;
            }
            Pair pair = (Pair) listIterator.previous();
            ViewGroup viewGroup = (ViewGroup) pair.f14612d;
            View view = (View) pair.f14613e;
            UIManager uiManager = getUiManager();
            if (uiManager != null) {
                uiManager.markViewAsInTransition(getSurfaceId(), view.getId(), false);
            }
            viewGroup.endViewTransition(view);
        }
    }

    @Override // com.swmansion.rnscreens.Screen
    public void startRemovalTransition() {
        if (!UiThreadUtil.isOnUiThread()) {
            UiThreadUtil.runOnUiThread(new s(12, this));
            return;
        }
        if (isBeingRemoved()) {
            return;
        }
        setBeingRemoved(true);
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.f12008w = "info";
        breadcrumb.f12007v = "ScreenOverride: calling startRemovalTransition (w/ patch)";
        breadcrumb.F = SentryLevel.INFO;
        Intrinsics.checkNotNullExpressionValue(breadcrumb, "info(...)");
        breadcrumb.f12010y = "react.viewmanager";
        c4.a(breadcrumb);
        startTransitionRecursive(this);
    }
}
