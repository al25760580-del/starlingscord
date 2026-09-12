package com.discord.react_rootview;

import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000fJ\u001c\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR+\u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\r\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/discord/react_rootview/ReactViewHelper;", "", "<init>", "()V", "exclusionRects", "", "Landroid/graphics/Rect;", "getExclusionRects", "()Ljava/util/List;", "setExclusionRects", "(Ljava/util/List;)V", "onInterceptTouchEventListeners", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "getOnInterceptTouchEventListeners", "()Ljava/util/WeakHashMap;", "handleInterceptTouchEvent", "e", "handleDispatchDraw", "view", "superDispatchDraw", "Lkotlin/Function0;", "Companion", "react_rootview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactViewHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactViewHelper.kt\ncom/discord/react_rootview/ReactViewHelper\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,30:1\n216#2,2:31\n*S KotlinDebug\n*F\n+ 1 ReactViewHelper.kt\ncom/discord/react_rootview/ReactViewHelper\n*L\n14#1:31,2\n*E\n"})
public final class ReactViewHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<Rect> EMPTY_EXCLUSION_RECTS = c0.c(new Rect(0, 0, 0, 0));

    @NotNull
    private List<Rect> exclusionRects = EMPTY_EXCLUSION_RECTS;

    @NotNull
    private final WeakHashMap<View, Function1<MotionEvent, Unit>> onInterceptTouchEventListeners = new WeakHashMap<>();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/discord/react_rootview/ReactViewHelper$Companion;", "", "<init>", "()V", "EMPTY_EXCLUSION_RECTS", "", "Landroid/graphics/Rect;", "getEMPTY_EXCLUSION_RECTS", "()Ljava/util/List;", "react_rootview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<Rect> getEMPTY_EXCLUSION_RECTS() {
            return ReactViewHelper.EMPTY_EXCLUSION_RECTS;
        }

        private Companion() {
        }
    }

    @NotNull
    public final List<Rect> getExclusionRects() {
        return this.exclusionRects;
    }

    @NotNull
    public final WeakHashMap<View, Function1<MotionEvent, Unit>> getOnInterceptTouchEventListeners() {
        return this.onInterceptTouchEventListeners;
    }

    public final void handleDispatchDraw(@NotNull View view, @NotNull Function0<Unit> superDispatchDraw) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(superDispatchDraw, "superDispatchDraw");
        superDispatchDraw.invoke();
        if (Build.VERSION.SDK_INT >= 29) {
            view.setSystemGestureExclusionRects(this.exclusionRects);
        }
    }

    public final void handleInterceptTouchEvent(@NotNull MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Iterator<Map.Entry<View, Function1<MotionEvent, Unit>>> it = this.onInterceptTouchEventListeners.entrySet().iterator();
        while (it.hasNext()) {
            Function1<MotionEvent, Unit> value = it.next().getValue();
            if (value != null) {
                value.invoke(e10);
            }
        }
    }

    public final void setExclusionRects(@NotNull List<Rect> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.exclusionRects = list;
    }
}
