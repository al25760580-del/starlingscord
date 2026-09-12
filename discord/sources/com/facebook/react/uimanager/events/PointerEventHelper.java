package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001,B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\nH\u0007J \u0010\u0018\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0007J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\nH\u0007J\u001a\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0007J\u0012\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0005H\u0007J\u000e\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'J\u0010\u0010(\u001a\u00020\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005J\u001a\u0010)\u001a\u00020*2\u0006\u0010\u0017\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010+\u001a\u00020\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/facebook/react/uimanager/events/PointerEventHelper;", "", "<init>", "()V", "POINTER_TYPE_TOUCH", "", "POINTER_TYPE_PEN", "POINTER_TYPE_MOUSE", "POINTER_TYPE_UNKNOWN", "X_FLAG_SUPPORTS_HOVER", "", "POINTER_CANCEL", "POINTER_DOWN", "POINTER_ENTER", "POINTER_LEAVE", "POINTER_MOVE", "POINTER_UP", "POINTER_OVER", "POINTER_OUT", "CLICK", "getButtons", "eventName", "pointerType", "buttonState", "getButtonChange", "lastButtonState", "currentButtonState", "getW3CPointerType", "toolType", "isListening", "", "view", "Landroid/view/View;", "event", "Lcom/facebook/react/uimanager/events/PointerEventHelper$EVENT;", "getEventCategory", "pointerEventType", "supportsHover", "motionEvent", "Landroid/view/MotionEvent;", "isExitEvent", "getPressure", "", "isBubblingEvent", "EVENT", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PointerEventHelper {

    @NotNull
    public static final String CLICK = "topClick";

    @NotNull
    public static final PointerEventHelper INSTANCE = new PointerEventHelper();

    @NotNull
    public static final String POINTER_CANCEL = "topPointerCancel";

    @NotNull
    public static final String POINTER_DOWN = "topPointerDown";

    @NotNull
    public static final String POINTER_ENTER = "topPointerEnter";

    @NotNull
    public static final String POINTER_LEAVE = "topPointerLeave";

    @NotNull
    public static final String POINTER_MOVE = "topPointerMove";

    @NotNull
    public static final String POINTER_OUT = "topPointerOut";

    @NotNull
    public static final String POINTER_OVER = "topPointerOver";

    @NotNull
    public static final String POINTER_TYPE_MOUSE = "mouse";

    @NotNull
    public static final String POINTER_TYPE_PEN = "pen";

    @NotNull
    public static final String POINTER_TYPE_TOUCH = "touch";

    @NotNull
    public static final String POINTER_TYPE_UNKNOWN = "";

    @NotNull
    public static final String POINTER_UP = "topPointerUp";
    public static final int X_FLAG_SUPPORTS_HOVER = 16777216;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/uimanager/events/PointerEventHelper$EVENT;", "", "<init>", "(Ljava/lang/String;I)V", "CANCEL", "CANCEL_CAPTURE", "CLICK", "CLICK_CAPTURE", "DOWN", "DOWN_CAPTURE", "ENTER", "ENTER_CAPTURE", "LEAVE", "LEAVE_CAPTURE", "MOVE", "MOVE_CAPTURE", "UP", "UP_CAPTURE", "OUT", "OUT_CAPTURE", "OVER", "OVER_CAPTURE", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum EVENT {
        CANCEL,
        CANCEL_CAPTURE,
        CLICK,
        CLICK_CAPTURE,
        DOWN,
        DOWN_CAPTURE,
        ENTER,
        ENTER_CAPTURE,
        LEAVE,
        LEAVE_CAPTURE,
        MOVE,
        MOVE_CAPTURE,
        UP,
        UP_CAPTURE,
        OUT,
        OUT_CAPTURE,
        OVER,
        OVER_CAPTURE;

        private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.l(values());

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EVENT.values().length];
            try {
                iArr[EVENT.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EVENT.DOWN_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EVENT.UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EVENT.UP_CAPTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EVENT.CANCEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EVENT.CANCEL_CAPTURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EVENT.CLICK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EVENT.CLICK_CAPTURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PointerEventHelper() {
    }

    public static final int getButtonChange(@NotNull String pointerType, int lastButtonState, int currentButtonState) {
        Intrinsics.checkNotNullParameter(pointerType, "pointerType");
        int i7 = 0;
        if (Intrinsics.areEqual(POINTER_TYPE_TOUCH, pointerType)) {
            return 0;
        }
        int i10 = currentButtonState ^ lastButtonState;
        if (i10 == 0) {
            return -1;
        }
        if (i10 != 1) {
            i7 = 2;
            if (i10 != 2) {
                if (i10 == 4) {
                    return 1;
                }
                if (i10 != 8) {
                    return i10 != 16 ? -1 : 4;
                }
                return 3;
            }
        }
        return i7;
    }

    public static final int getButtons(String eventName, @NotNull String pointerType, int buttonState) {
        Intrinsics.checkNotNullParameter(pointerType, "pointerType");
        if (INSTANCE.isExitEvent(eventName)) {
            return 0;
        }
        if (Intrinsics.areEqual(POINTER_TYPE_TOUCH, pointerType)) {
            return 1;
        }
        return buttonState;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0055 A[RETURN] */
    public static final int getEventCategory(String pointerEventType) {
        if (pointerEventType == null) {
            return 2;
        }
        switch (pointerEventType) {
            case "topPointerEnter":
                return 4;
            case "topPointerLeave":
                return 4;
            case "topPointerDown":
                return 3;
            case "topPointerMove":
                return 4;
            case "topPointerOver":
                return 4;
            case "topPointerUp":
                return 3;
            case "topPointerCancel":
                return 3;
            case "topPointerOut":
                return 4;
            default:
                return 2;
        }
    }

    public static final double getPressure(int buttonState, String eventName) {
        return (INSTANCE.isExitEvent(eventName) || buttonState == 0) ? 0.0d : 0.5d;
    }

    @NotNull
    public static final String getW3CPointerType(int toolType) {
        if (toolType == 1) {
            return POINTER_TYPE_TOUCH;
        }
        if (toolType != 2) {
            return toolType != 3 ? "" : POINTER_TYPE_MOUSE;
        }
        return POINTER_TYPE_PEN;
    }

    public static final boolean isBubblingEvent(String eventName) {
        if (eventName == null) {
            return false;
        }
        switch (eventName.hashCode()) {
            case -1304584214:
                return eventName.equals(POINTER_DOWN);
            case -1304316135:
                return eventName.equals(POINTER_MOVE);
            case -1304250340:
                return eventName.equals(POINTER_OVER);
            case -1065042973:
                return eventName.equals(POINTER_UP);
            case 383186882:
                return eventName.equals(POINTER_CANCEL);
            case 1343400710:
                return eventName.equals(POINTER_OUT);
            default:
                return false;
        }
    }

    public static final boolean isListening(View view, @NotNull EVENT event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (view == null) {
            return true;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[event.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                Object tag = view.getTag(R.id.pointer_events);
                Integer num = tag instanceof Integer ? (Integer) tag : null;
                return (num == null || (num.intValue() & (1 << event.ordinal())) == 0) ? false : true;
        }
    }

    public final boolean isExitEvent(String eventName) {
        if (eventName == null) {
            return false;
        }
        int iHashCode = eventName.hashCode();
        if (iHashCode == -1780335505) {
            return eventName.equals(POINTER_LEAVE);
        }
        if (iHashCode != -1065042973) {
            return iHashCode == 1343400710 && eventName.equals(POINTER_OUT);
        }
        return eventName.equals(POINTER_UP);
    }

    public final boolean supportsHover(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if ((motionEvent.getFlags() & X_FLAG_SUPPORTS_HOVER) != 0) {
            return true;
        }
        return motionEvent.isFromSource(8194);
    }
}
