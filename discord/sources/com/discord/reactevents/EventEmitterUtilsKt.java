package com.discord.reactevents;

import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0014\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b*\u00020\u0002H\u0002¨\u0006\n"}, d2 = {"emitReactNativeEvent", "", "Landroid/content/Context;", "eventName", "", "serializedEvent", "Lcom/facebook/react/bridge/WritableMap;", "getEventEmitter", "Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;", "kotlin.jvm.PlatformType", "react_events_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class EventEmitterUtilsKt {
    public static final void emitReactNativeEvent(@NotNull Context context, @NotNull String eventName, @NotNull WritableMap serializedEvent) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(serializedEvent, "serializedEvent");
        getEventEmitter(context).emit(eventName, serializedEvent);
    }

    private static final DeviceEventManagerModule.RCTDeviceEventEmitter getEventEmitter(Context context) {
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) ((ReactContext) context).getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }
}
