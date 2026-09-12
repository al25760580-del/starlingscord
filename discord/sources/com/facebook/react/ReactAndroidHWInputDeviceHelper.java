package com.facebook.react;

import android.view.KeyEvent;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ,\u0010\u0010\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/ReactAndroidHWInputDeviceHelper;", "", "<init>", "()V", "lastFocusedViewId", "", "handleKeyEvent", "", "ev", "Landroid/view/KeyEvent;", "context", "Lcom/facebook/react/bridge/ReactContext;", "onFocusChanged", "newFocusedView", "Landroid/view/View;", "clearFocus", "dispatchEvent", "eventType", "", "targetViewId", "eventKeyAction", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactAndroidHWInputDeviceHelper {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Map<Integer, String> KEY_EVENTS_ACTIONS = w0.g(new Pair(23, "select"), new Pair(66, "select"), new Pair(62, "select"), new Pair(126, "play"), new Pair(127, "pause"), new Pair(85, "playPause"), new Pair(89, "rewind"), new Pair(90, "fastForward"), new Pair(86, "stop"), new Pair(87, "next"), new Pair(88, "previous"), new Pair(19, "up"), new Pair(22, ViewProps.RIGHT), new Pair(20, "down"), new Pair(21, ViewProps.LEFT), new Pair(165, "info"), new Pair(82, "menu"), new Pair(166, "channelUp"), new Pair(167, "channelDown"));
    private int lastFocusedViewId = -1;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/facebook/react/ReactAndroidHWInputDeviceHelper$Companion;", "", "<init>", "()V", "KEY_EVENTS_ACTIONS", "", "", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final void dispatchEvent(ReactContext context, String eventType, int targetViewId, int eventKeyAction) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("eventType", eventType);
        writableNativeMap.putInt("eventKeyAction", eventKeyAction);
        if (targetViewId != -1) {
            writableNativeMap.putInt("tag", targetViewId);
        }
        context.emitDeviceEvent("onHWKeyEvent", writableNativeMap);
    }

    public static /* synthetic */ void dispatchEvent$default(ReactAndroidHWInputDeviceHelper reactAndroidHWInputDeviceHelper, ReactContext reactContext, String str, int i7, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        reactAndroidHWInputDeviceHelper.dispatchEvent(reactContext, str, i7, i10);
    }

    public final void clearFocus(@NotNull ReactContext context) {
        ReactAndroidHWInputDeviceHelper reactAndroidHWInputDeviceHelper;
        Intrinsics.checkNotNullParameter(context, "context");
        int i7 = this.lastFocusedViewId;
        if (i7 != -1) {
            reactAndroidHWInputDeviceHelper = this;
            dispatchEvent$default(reactAndroidHWInputDeviceHelper, context, "blur", i7, 0, 8, null);
        } else {
            reactAndroidHWInputDeviceHelper = this;
        }
        reactAndroidHWInputDeviceHelper.lastFocusedViewId = -1;
    }

    public final void handleKeyEvent(@NotNull KeyEvent ev, @NotNull ReactContext context) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        Intrinsics.checkNotNullParameter(context, "context");
        int keyCode = ev.getKeyCode();
        int action = ev.getAction();
        if (action == 1 || action == 0) {
            Map<Integer, String> map = KEY_EVENTS_ACTIONS;
            if (map.containsKey(Integer.valueOf(keyCode))) {
                dispatchEvent(context, map.get(Integer.valueOf(keyCode)), this.lastFocusedViewId, action);
            }
        }
    }

    public final void onFocusChanged(@NotNull View newFocusedView, @NotNull ReactContext context) {
        Intrinsics.checkNotNullParameter(newFocusedView, "newFocusedView");
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.lastFocusedViewId == newFocusedView.getId()) {
            return;
        }
        int i7 = this.lastFocusedViewId;
        if (i7 != -1) {
            dispatchEvent$default(this, context, "blur", i7, 0, 8, null);
        }
        this.lastFocusedViewId = newFocusedView.getId();
        dispatchEvent$default(this, context, "focus", newFocusedView.getId(), 0, 8, null);
    }
}
