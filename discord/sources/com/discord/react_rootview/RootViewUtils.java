package com.discord.react_rootview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactDelegate;
import com.facebook.react.bridge.ReactContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J$\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u0010J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/react_rootview/RootViewUtils;", "", "<init>", "()V", "EMPTY_EXCLUSION_RECTS", "", "Landroid/graphics/Rect;", "setSystemGestureExclusionRects", "", "context", "Lcom/facebook/react/bridge/ReactContext;", "exclusionRects", "setOnInterceptTouchEvent", "view", "Landroid/view/View;", "callback", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "getRootView", "Lcom/discord/react_rootview/RootViewInterface;", "react_rootview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRootViewUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootViewUtils.kt\ncom/discord/react_rootview/RootViewUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
public final class RootViewUtils {

    @NotNull
    public static final RootViewUtils INSTANCE = new RootViewUtils();

    @NotNull
    private static final List<Rect> EMPTY_EXCLUSION_RECTS = c0.c(new Rect(0, 0, 0, 0));

    private RootViewUtils() {
    }

    public final RootViewInterface getRootView(@NotNull ReactContext context) {
        ReactDelegate reactDelegate;
        ViewParent reactRootView;
        Intrinsics.checkNotNullParameter(context, "context");
        Activity currentActivity = context.getCurrentActivity();
        ReactActivity reactActivity = currentActivity instanceof ReactActivity ? (ReactActivity) currentActivity : null;
        if (reactActivity != null && (reactDelegate = reactActivity.getReactDelegate()) != null && (reactRootView = reactDelegate.getReactRootView()) != null) {
            RootViewInterface rootViewInterface = reactRootView instanceof RootViewInterface ? (RootViewInterface) reactRootView : null;
            if (rootViewInterface != null) {
                return rootViewInterface;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setOnInterceptTouchEvent(@NotNull View view, Function1<? super MotionEvent, Unit> callback) {
        Intrinsics.checkNotNullParameter(view, "view");
        RootViewInterface rootView = getRootView(view);
        if (rootView != null) {
            rootView.getOnInterceptTouchEventListeners().put(view, callback);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setSystemGestureExclusionRects(@NotNull ReactContext context, @NotNull List<Rect> exclusionRects) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exclusionRects, "exclusionRects");
        if (exclusionRects.isEmpty()) {
            exclusionRects = EMPTY_EXCLUSION_RECTS;
        }
        RootViewInterface rootView = getRootView(context);
        if (rootView != 0) {
            rootView.setExclusionRects(exclusionRects);
            ((View) rootView).invalidate();
        }
    }

    private final RootViewInterface getRootView(View view) {
        Context context = view.getContext();
        ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
        if (reactContext != null) {
            return INSTANCE.getRootView(reactContext);
        }
        return null;
    }
}
