package com.discord.react_rootview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.discord.crash_reporting.CrashReporting;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m7.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0015H\u0016J\u001c\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R.\u0010\u0011\u001a\u001c\u0012\u0004\u0012\u00020\u0013\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00140\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lcom/discord/react_rootview/ReactRootView;", "Lcom/facebook/react/ReactRootView;", "Lcom/discord/react_rootview/RootViewInterface;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "helper", "Lcom/discord/react_rootview/ReactViewHelper;", "value", "", "Landroid/graphics/Rect;", "exclusionRects", "getExclusionRects", "()Ljava/util/List;", "setExclusionRects", "(Ljava/util/List;)V", "onInterceptTouchEventListeners", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "getOnInterceptTouchEventListeners", "()Ljava/util/WeakHashMap;", "onInterceptTouchEvent", "", "e", "requestChildFocus", "child", "focused", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "react_rootview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactRootView extends com.facebook.react.ReactRootView implements RootViewInterface {

    @NotNull
    private final ReactViewHelper helper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactRootView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.helper = new ReactViewHelper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dispatchDraw$lambda$0(ReactRootView reactRootView, Canvas canvas) {
        super.dispatchDraw(canvas);
        return Unit.f14616a;
    }

    @Override // com.facebook.react.ReactRootView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.helper.handleDispatchDraw(this, new a(5, this, canvas));
    }

    @Override // com.discord.react_rootview.RootViewInterface
    @NotNull
    public List<Rect> getExclusionRects() {
        return this.helper.getExclusionRects();
    }

    @Override // com.discord.react_rootview.RootViewInterface
    @NotNull
    public WeakHashMap<View, Function1<MotionEvent, Unit>> getOnInterceptTouchEventListeners() {
        return this.helper.getOnInterceptTouchEventListeners();
    }

    @Override // com.facebook.react.ReactRootView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        this.helper.handleInterceptTouchEvent(e10);
        return super.onInterceptTouchEvent(e10);
    }

    @Override // com.facebook.react.ReactRootView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View child, View focused) {
        if (child == null || focused == null) {
            CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "ReactRootView.requestChildFocus: null args child=" + (child == null) + " focused=" + (focused == null), null, null, null, false, 30, null);
        }
        if (focused == null) {
            if (child == null) {
                return;
            } else {
                focused = child;
            }
        }
        if (child == null) {
            child = focused;
        }
        super.requestChildFocus(child, focused);
    }

    @Override // com.discord.react_rootview.RootViewInterface
    public void setExclusionRects(@NotNull List<Rect> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.helper.setExclusionRects(value);
    }
}
