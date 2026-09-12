package com.discord.react_gesture_handler;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.x0;
import ar.s;
import com.discord.misc.utilities.activity.ActivityExtensionsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchListener;
import com.discord.theme.ThemeManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.ReactViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\rH\u0016R&\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;", "Lcom/facebook/react/views/view/ReactViewGroup;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "onAttachedToWindow", "", "getGestureRootView", "Landroid/view/ViewGroup;", "supplementalMotionEventReceivedCallbacks", "", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "dispatchTouchEvent", "event", "Companion", "react_gesture_handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiscordGestureHandlerEnabledRootView extends ReactViewGroup {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final WeakHashMap<View, WeakReference<DiscordGestureHandlerEnabledRootView>> gestureHandlersToRootView;

    @NotNull
    private final Map<Function1<MotionEvent, Unit>, Boolean> supplementalMotionEventReceivedCallbacks;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0002J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u0006H\u0002R\"\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion;", "", "<init>", "()V", "gestureHandlersToRootView", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "Ljava/lang/ref/WeakReference;", "Lcom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView;", "initNestedScrollOnTouchListeners", "", "getNullable", "view", "getNullable$react_gesture_handler_release", "find", "react_gesture_handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDiscordGestureHandlerEnabledRootView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscordGestureHandlerEnabledRootView.kt\ncom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,130:1\n1321#2,2:131\n*S KotlinDebug\n*F\n+ 1 DiscordGestureHandlerEnabledRootView.kt\ncom/discord/react_gesture_handler/DiscordGestureHandlerEnabledRootView$Companion\n*L\n118#1:131,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final DiscordGestureHandlerEnabledRootView find(View view) {
            if (view instanceof DiscordGestureHandlerEnabledRootView) {
                return (DiscordGestureHandlerEnabledRootView) view;
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            Iterator it = new x0((ViewGroup) view).iterator();
            while (it.hasNext()) {
                DiscordGestureHandlerEnabledRootView discordGestureHandlerEnabledRootViewFind = DiscordGestureHandlerEnabledRootView.INSTANCE.find((View) it.next());
                if (discordGestureHandlerEnabledRootViewFind != null) {
                    return discordGestureHandlerEnabledRootViewFind;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void initNestedScrollOnTouchListeners() {
            NestedScrollOnTouchListener.Companion companion = NestedScrollOnTouchListener.INSTANCE;
            companion.setOnAddNativeEventListener(new s(28));
            companion.setOnRemoveNativeEventListener(new s(29));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit initNestedScrollOnTouchListeners$lambda$0(View view, Function1 callback) {
            Map map;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(callback, "callback");
            DiscordGestureHandlerEnabledRootView nullable$react_gesture_handler_release = DiscordGestureHandlerEnabledRootView.INSTANCE.getNullable$react_gesture_handler_release(view);
            if (nullable$react_gesture_handler_release != null && (map = nullable$react_gesture_handler_release.supplementalMotionEventReceivedCallbacks) != null) {
                map.put(callback, Boolean.TRUE);
            }
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit initNestedScrollOnTouchListeners$lambda$1(View view, Function1 callback) {
            Map map;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(callback, "callback");
            DiscordGestureHandlerEnabledRootView nullable$react_gesture_handler_release = DiscordGestureHandlerEnabledRootView.INSTANCE.getNullable$react_gesture_handler_release(view);
            if (nullable$react_gesture_handler_release != null && (map = nullable$react_gesture_handler_release.supplementalMotionEventReceivedCallbacks) != null) {
                map.put(callback, Boolean.FALSE);
            }
            return Unit.f14616a;
        }

        public final DiscordGestureHandlerEnabledRootView getNullable$react_gesture_handler_release(@NotNull View view) {
            View rootView;
            Activity currentActivity;
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
            if (reactContext == null || (currentActivity = reactContext.getCurrentActivity()) == null || (rootView = ActivityExtensionsKt.getRootView(currentActivity)) == null) {
                rootView = view.getRootView();
            }
            WeakReference weakReference = (WeakReference) DiscordGestureHandlerEnabledRootView.gestureHandlersToRootView.get(rootView);
            DiscordGestureHandlerEnabledRootView discordGestureHandlerEnabledRootView = weakReference != null ? (DiscordGestureHandlerEnabledRootView) weakReference.get() : null;
            if (discordGestureHandlerEnabledRootView != null) {
                DiscordGestureHandlerEnabledRootView discordGestureHandlerEnabledRootView2 = discordGestureHandlerEnabledRootView.isAttachedToWindow() ? discordGestureHandlerEnabledRootView : null;
                if (discordGestureHandlerEnabledRootView2 != null) {
                    return discordGestureHandlerEnabledRootView2;
                }
            }
            DiscordGestureHandlerEnabledRootView.gestureHandlersToRootView.remove(discordGestureHandlerEnabledRootView);
            Intrinsics.checkNotNull(rootView);
            DiscordGestureHandlerEnabledRootView discordGestureHandlerEnabledRootViewFind = find(rootView);
            if (discordGestureHandlerEnabledRootViewFind != null) {
                DiscordGestureHandlerEnabledRootView.gestureHandlersToRootView.put(rootView, new WeakReference(discordGestureHandlerEnabledRootViewFind));
            }
            return discordGestureHandlerEnabledRootViewFind;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        gestureHandlersToRootView = new WeakHashMap<>();
        companion.initNestedScrollOnTouchListeners();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscordGestureHandlerEnabledRootView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.supplementalMotionEventReceivedCallbacks = new LinkedHashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Iterator<Map.Entry<Function1<MotionEvent, Unit>, Boolean>> it = this.supplementalMotionEventReceivedCallbacks.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Function1<MotionEvent, Unit>, Boolean> next = it.next();
            Function1<MotionEvent, Unit> key = next.getKey();
            if (next.getValue().booleanValue()) {
                key.invoke(event);
            } else {
                it.remove();
            }
        }
        try {
            return super.dispatchTouchEvent(event);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public final ViewGroup getGestureRootView() {
        View childAt = getChildAt(0);
        if (childAt instanceof ViewGroup) {
            return (ViewGroup) childAt;
        }
        return null;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ThemeManager themeManager = ThemeManager.INSTANCE;
        themeManager.updateSystemUi(this);
        if (Intrinsics.areEqual(INSTANCE.getNullable$react_gesture_handler_release(this), this)) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            themeManager.updateWindowBackground(context, false);
        }
    }
}
