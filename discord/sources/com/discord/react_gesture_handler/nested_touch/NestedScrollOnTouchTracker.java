package com.discord.react_gesture_handler.nested_touch;

import android.content.Context;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import ar.b0;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 .2\u00020\u0001:\u0001.B_\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u0016\u0010#\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010&\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;", "", "Landroid/content/Context;", "context", "Landroid/view/View$OnClickListener;", "onClickListener", "Landroid/view/View$OnLongClickListener;", "onLongClickListener", "onDoubleClickListener", "Lkotlin/Function1;", "Landroid/view/View;", "", "onTrackingStart", "onTrackingFinish", "<init>", "(Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "view", "cleanUp", "(Landroid/view/View;)V", "cleanupDoubleClickJob", "()V", "Landroid/view/MotionEvent;", "event", "", "isSupplementalEvent", "handleTouch$react_gesture_handler_release", "(Landroid/view/View;Landroid/view/MotionEvent;Z)Z", "handleTouch", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnLongClickListener;", "Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/Job;", "longPressJob", "Lkotlinx/coroutines/Job;", "doubleClickJob", "runningDoubleClickJob", "Z", "activeClick", "consideringDoubleClick", "Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;", "doubleTapOriginTracker", "Lcom/discord/react_gesture_handler/nested_touch/OriginTracker;", "scrollOriginTracker", "Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;", "spanBeingTouched", "Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;", "Companion", "react_gesture_handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNestedScrollOnTouchTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollOnTouchTracker.kt\ncom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker\n+ 2 CastUtils.kt\ncom/discord/misc/utilities/kotlin/CastUtilsKt\n+ 3 TextViewTouchUtils.kt\ncom/discord/misc/utilities/touch/TextViewTouchUtilsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,215:1\n8#2:216\n12#3,27:217\n14151#4,14:244\n*S KotlinDebug\n*F\n+ 1 NestedScrollOnTouchTracker.kt\ncom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker\n*L\n52#1:216\n54#1:217,27\n60#1:244,14\n*E\n"})
public final class NestedScrollOnTouchTracker {
    private static final long DOUBLE_CLICK_MIN_TIME;
    private static final long DOUBLE_CLICK_TIME;
    private boolean activeClick;
    private boolean consideringDoubleClick;
    private Job doubleClickJob;

    @NotNull
    private OriginTracker doubleTapOriginTracker;
    private Job longPressJob;
    private final View.OnClickListener onClickListener;
    private final View.OnClickListener onDoubleClickListener;
    private final View.OnLongClickListener onLongClickListener;
    private final Function1<View, Unit> onTrackingFinish;
    private final Function1<View, Unit> onTrackingStart;
    private boolean runningDoubleClickJob;

    @NotNull
    private final OriginTracker scrollOriginTracker;
    private NestedClickableSpan spanBeingTouched;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final long CLICK_MAX_DOWN_TIME = ViewConfiguration.getTapTimeout();
    private static final long LONG_PRESS_DOWN_TIME = ViewConfiguration.getLongPressTimeout();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker$Companion;", "", "<init>", "()V", "CLICK_MAX_DOWN_TIME", "", "getCLICK_MAX_DOWN_TIME", "()J", "LONG_PRESS_DOWN_TIME", "getLONG_PRESS_DOWN_TIME", "DOUBLE_CLICK_TIME", "getDOUBLE_CLICK_TIME", "DOUBLE_CLICK_MIN_TIME", "getDOUBLE_CLICK_MIN_TIME", "react_gesture_handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getCLICK_MAX_DOWN_TIME() {
            return NestedScrollOnTouchTracker.CLICK_MAX_DOWN_TIME;
        }

        public final long getDOUBLE_CLICK_MIN_TIME() {
            return NestedScrollOnTouchTracker.DOUBLE_CLICK_MIN_TIME;
        }

        public final long getDOUBLE_CLICK_TIME() {
            return NestedScrollOnTouchTracker.DOUBLE_CLICK_TIME;
        }

        public final long getLONG_PRESS_DOWN_TIME() {
            return NestedScrollOnTouchTracker.LONG_PRESS_DOWN_TIME;
        }

        private Companion() {
        }
    }

    static {
        long doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout();
        DOUBLE_CLICK_TIME = doubleTapTimeout;
        DOUBLE_CLICK_MIN_TIME = doubleTapTimeout <= 40 ? 1L : 40L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NestedScrollOnTouchTracker(@NotNull Context context, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, View.OnClickListener onClickListener2, Function1<? super View, Unit> function1, Function1<? super View, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.onClickListener = onClickListener;
        this.onLongClickListener = onLongClickListener;
        this.onDoubleClickListener = onClickListener2;
        this.onTrackingStart = function1;
        this.onTrackingFinish = function2;
        this.doubleTapOriginTracker = new OriginTracker(ViewConfiguration.get(context).getScaledDoubleTapSlop());
        this.scrollOriginTracker = new OriginTracker(ViewConfiguration.get(context).getScaledTouchSlop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanUp(View view) {
        this.scrollOriginTracker.cleanUp();
        Job job = this.longPressJob;
        if (job != null) {
            job.f(null);
        }
        view.setPressed(false);
        this.spanBeingTouched = null;
        Function1<View, Unit> function1 = this.onTrackingFinish;
        if (function1 != null) {
            function1.invoke(view);
        }
        cleanupDoubleClickJob();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanupDoubleClickJob() {
        Job job = this.doubleClickJob;
        if (job != null) {
            job.f(null);
        }
        this.runningDoubleClickJob = false;
        this.consideringDoubleClick = false;
        this.doubleTapOriginTracker.cleanUp();
    }

    /* JADX WARN: Code duplicated, block: B:117:0x019e A[RETURN] */
    public final boolean handleTouch$react_gesture_handler_release(@NotNull View view, @NotNull MotionEvent event, boolean isSupplementalEvent) {
        NestedClickableSpan[] nestedClickableSpanArr;
        NestedClickableSpan nestedClickableSpan;
        Object spans;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        if (view.isAttachedToWindow()) {
            TextView textView = (TextView) (!(view instanceof TextView) ? null : view);
            if (textView != null) {
                if (event.getAction() == 0) {
                    CharSequence text = textView.getText();
                    Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
                    if (spannable == null) {
                        spans = new NestedClickableSpan[0];
                    } else {
                        int scrollX = textView.getScrollX() + (((int) event.getX()) - textView.getTotalPaddingLeft());
                        int lineForVertical = textView.getLayout().getLineForVertical(textView.getScrollY() + (((int) event.getY()) - textView.getTotalPaddingTop()));
                        float lineRight = textView.getLayout().getLineRight(lineForVertical);
                        float lineLeft = textView.getLayout().getLineLeft(lineForVertical);
                        float f2 = scrollX;
                        if (f2 > lineRight || (scrollX >= 0 && f2 < lineLeft)) {
                            spans = new NestedClickableSpan[0];
                        } else {
                            int offsetForHorizontal = textView.getLayout().getOffsetForHorizontal(lineForVertical, f2);
                            spans = spannable.getSpans(offsetForHorizontal, offsetForHorizontal, NestedClickableSpan.class);
                            Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
                        }
                    }
                    nestedClickableSpanArr = (NestedClickableSpan[]) spans;
                } else {
                    nestedClickableSpanArr = null;
                }
                if (nestedClickableSpanArr != null && nestedClickableSpanArr.length != 0) {
                    if (nestedClickableSpanArr.length != 0) {
                        nestedClickableSpan = nestedClickableSpanArr[0];
                        Intrinsics.checkNotNullParameter(nestedClickableSpanArr, "<this>");
                        int length = nestedClickableSpanArr.length - 1;
                        if (length != 0) {
                            NestedClickableSpan.TouchPriority touchPriority = nestedClickableSpan.getTouchPriority();
                            if (1 <= length) {
                                int i7 = 1;
                                while (true) {
                                    NestedClickableSpan nestedClickableSpan2 = nestedClickableSpanArr[i7];
                                    NestedClickableSpan.TouchPriority touchPriority2 = nestedClickableSpan2.getTouchPriority();
                                    if (touchPriority.compareTo(touchPriority2) < 0) {
                                        nestedClickableSpan = nestedClickableSpan2;
                                        touchPriority = touchPriority2;
                                    }
                                    if (i7 == length) {
                                        break;
                                    }
                                    i7++;
                                }
                            }
                        }
                    } else {
                        nestedClickableSpan = null;
                    }
                    Intrinsics.checkNotNull(nestedClickableSpan);
                    this.spanBeingTouched = nestedClickableSpan;
                    if (nestedClickableSpan != null) {
                        nestedClickableSpan.enableHighlight(textView);
                    }
                }
            }
            int action = event.getAction();
            if (action == 0) {
                this.scrollOriginTracker.hasOriginMoved(isSupplementalEvent, event);
                if (!isSupplementalEvent) {
                    Function1<View, Unit> function1 = this.onTrackingStart;
                    if (function1 != null) {
                        function1.invoke(view);
                    }
                    this.activeClick = true;
                    Job job = this.longPressJob;
                    if (job != null) {
                        job.f(null);
                    }
                    this.longPressJob = b0.t(CoroutineViewUtilsKt.attachedScope(view, true), null, new NestedScrollOnTouchTracker$handleTouch$2(this, view, null), 3);
                    if (this.onDoubleClickListener != null) {
                        if (this.consideringDoubleClick && !this.doubleTapOriginTracker.hasOriginMoved(false, event)) {
                            this.activeClick = false;
                            this.onDoubleClickListener.onClick(view);
                            cleanUp(view);
                        } else if (!this.runningDoubleClickJob) {
                            this.doubleTapOriginTracker.cleanUp();
                            this.doubleTapOriginTracker.hasOriginMoved(false, event);
                            this.runningDoubleClickJob = true;
                            this.doubleClickJob = b0.t(CoroutineViewUtilsKt.attachedScope(view, true), null, new NestedScrollOnTouchTracker$handleTouch$3(this, view, null), 3);
                        }
                    }
                    if (this.spanBeingTouched != null || this.onLongClickListener != null || this.onDoubleClickListener != null) {
                        return true;
                    }
                }
            } else if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        cleanUp(view);
                        return true;
                    }
                } else if (this.scrollOriginTracker.hasOriginMoved(isSupplementalEvent, event)) {
                    cleanUp(view);
                    this.activeClick = false;
                    return false;
                }
            } else {
                if (this.onDoubleClickListener != null && this.runningDoubleClickJob) {
                    this.activeClick = false;
                    return true;
                }
                if (this.spanBeingTouched == null && this.activeClick && this.onClickListener != null) {
                    view.setPressed(true);
                }
                if (this.activeClick) {
                    this.activeClick = false;
                    NestedClickableSpan nestedClickableSpan3 = this.spanBeingTouched;
                    if (nestedClickableSpan3 != null) {
                        nestedClickableSpan3.onClick(view);
                    } else {
                        View.OnClickListener onClickListener = this.onClickListener;
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                    }
                }
                cleanUp(view);
                if (this.spanBeingTouched != null || this.onClickListener != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public /* synthetic */ NestedScrollOnTouchTracker(Context context, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, View.OnClickListener onClickListener2, Function1 function1, Function1 function2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, onClickListener, onLongClickListener, onClickListener2, (i7 & 16) != 0 ? null : function1, (i7 & 32) != 0 ? null : function2);
    }
}
