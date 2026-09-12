package com.discord.react_gesture_handler.nested_touch;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.u0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u0017R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;", "Landroid/view/View$OnTouchListener;", "view", "Landroid/view/View;", "viewManagesAccessibility", "", "<init>", "(Landroid/view/View;Z)V", "viewTouchTracker", "Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;", "onSupplementalMotionEventReceived", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "onTouch", "event", "Companion", "react_gesture_handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NestedScrollOnTouchListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static Function2<? super View, ? super Function1<? super MotionEvent, Unit>, Unit> onAddNativeEventListener;
    private static Function2<? super View, ? super Function1<? super MotionEvent, Unit>, Unit> onRemoveNativeEventListener;

    @NotNull
    private Function1<? super MotionEvent, Unit> onSupplementalMotionEventReceived;

    @NotNull
    private final NestedScrollOnTouchTracker viewTouchTracker;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003RB\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eRB\u0010\u000f\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$Companion;", "", "<init>", "()V", "Lkotlin/Function2;", "Landroid/view/View;", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "onAddNativeEventListener", "Lkotlin/jvm/functions/Function2;", "getOnAddNativeEventListener", "()Lkotlin/jvm/functions/Function2;", "setOnAddNativeEventListener", "(Lkotlin/jvm/functions/Function2;)V", "onRemoveNativeEventListener", "getOnRemoveNativeEventListener", "setOnRemoveNativeEventListener", "react_gesture_handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function2<View, Function1<? super MotionEvent, Unit>, Unit> getOnAddNativeEventListener() {
            return NestedScrollOnTouchListener.onAddNativeEventListener;
        }

        public final Function2<View, Function1<? super MotionEvent, Unit>, Unit> getOnRemoveNativeEventListener() {
            return NestedScrollOnTouchListener.onRemoveNativeEventListener;
        }

        public final void setOnAddNativeEventListener(Function2<? super View, ? super Function1<? super MotionEvent, Unit>, Unit> function2) {
            NestedScrollOnTouchListener.onAddNativeEventListener = function2;
        }

        public final void setOnRemoveNativeEventListener(Function2<? super View, ? super Function1<? super MotionEvent, Unit>, Unit> function2) {
            NestedScrollOnTouchListener.onRemoveNativeEventListener = function2;
        }

        private Companion() {
        }
    }

    public NestedScrollOnTouchListener(@NotNull final View view, boolean z5) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!z5) {
            u0.p(view, new androidx.core.view.b() { // from class: com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchListener.1
                @Override // androidx.core.view.b
                public boolean performAccessibilityAction(View host, int action, Bundle args) {
                    View.OnLongClickListener nestedLongClickListener;
                    Intrinsics.checkNotNullParameter(host, "host");
                    if (action == 16) {
                        View.OnClickListener nestedClickListener = NestedScrollOnTouchUtilsKt.getNestedClickListener(view);
                        if (nestedClickListener != null) {
                            nestedClickListener.onClick(view);
                        }
                    } else if (action == 32 && (nestedLongClickListener = NestedScrollOnTouchUtilsKt.getNestedLongClickListener(view)) != null) {
                        nestedLongClickListener.onLongClick(view);
                    }
                    return super.performAccessibilityAction(host, action, args);
                }
            });
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View.OnClickListener nestedClickListener = NestedScrollOnTouchUtilsKt.getNestedClickListener(view);
        View.OnLongClickListener nestedLongClickListener = NestedScrollOnTouchUtilsKt.getNestedLongClickListener(view);
        View.OnClickListener nestedDoubleClickListener = NestedScrollOnTouchUtilsKt.getNestedDoubleClickListener(view);
        final int i7 = 0;
        Function1 function1 = new Function1(this) { // from class: com.discord.react_gesture_handler.nested_touch.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ NestedScrollOnTouchListener f4555e;

            {
                this.f4555e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        return NestedScrollOnTouchListener.viewTouchTracker$lambda$0(this.f4555e, (View) obj);
                    default:
                        return NestedScrollOnTouchListener.viewTouchTracker$lambda$1(this.f4555e, (View) obj);
                }
            }
        };
        final int i10 = 1;
        this.viewTouchTracker = new NestedScrollOnTouchTracker(context, nestedClickListener, nestedLongClickListener, nestedDoubleClickListener, function1, new Function1(this) { // from class: com.discord.react_gesture_handler.nested_touch.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ NestedScrollOnTouchListener f4555e;

            {
                this.f4555e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        return NestedScrollOnTouchListener.viewTouchTracker$lambda$0(this.f4555e, (View) obj);
                    default:
                        return NestedScrollOnTouchListener.viewTouchTracker$lambda$1(this.f4555e, (View) obj);
                }
            }
        });
        this.onSupplementalMotionEventReceived = new b7.a(29, this, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSupplementalMotionEventReceived$lambda$2(NestedScrollOnTouchListener nestedScrollOnTouchListener, View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        nestedScrollOnTouchListener.viewTouchTracker.handleTouch$react_gesture_handler_release(view, event, true);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit viewTouchTracker$lambda$0(NestedScrollOnTouchListener nestedScrollOnTouchListener, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Function2<? super View, ? super Function1<? super MotionEvent, Unit>, Unit> function2 = onAddNativeEventListener;
        if (function2 != null) {
            function2.invoke(view, nestedScrollOnTouchListener.onSupplementalMotionEventReceived);
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit viewTouchTracker$lambda$1(NestedScrollOnTouchListener nestedScrollOnTouchListener, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Function2<? super View, ? super Function1<? super MotionEvent, Unit>, Unit> function2 = onRemoveNativeEventListener;
        if (function2 != null) {
            function2.invoke(view, nestedScrollOnTouchListener.onSupplementalMotionEventReceived);
        }
        return Unit.f14616a;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(@NotNull View view, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        return this.viewTouchTracker.handleTouch$react_gesture_handler_release(view, event, false);
    }
}
