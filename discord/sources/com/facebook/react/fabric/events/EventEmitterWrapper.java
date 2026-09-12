package com.facebook.react.fabric.events;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridClassBase;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.FabricSoLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0082 J#\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\rH\u0082 J#\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\rH\u0082 J(\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ \u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\rJ \u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u0014\u001a\u00020\u0005¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/fabric/events/EventEmitterWrapper;", "Lcom/facebook/jni/HybridClassBase;", "<init>", "()V", "dispatchEvent", "", "eventName", "", "params", "Lcom/facebook/react/bridge/NativeMap;", "category", "", "eventTimestamp", "", "dispatchEventSynchronously", "dispatchUniqueEvent", "dispatch", "Lcom/facebook/react/bridge/WritableMap;", "eventCategory", "dispatchUnique", "destroy", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"MissingNativeLoadLibrary"})
public final class EventEmitterWrapper extends HybridClassBase {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/fabric/events/EventEmitterWrapper$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        FabricSoLoader.staticInit();
    }

    private EventEmitterWrapper() {
    }

    private final native void dispatchEvent(String eventName, NativeMap params, int category, long eventTimestamp);

    private final native void dispatchEventSynchronously(String eventName, NativeMap params, long eventTimestamp);

    private final native void dispatchUniqueEvent(String eventName, NativeMap params, long eventTimestamp);

    public final synchronized void destroy() {
        if (isValid()) {
            resetNative();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void dispatch(@NotNull String eventName, WritableMap params, int eventCategory, long eventTimestamp) {
        try {
            try {
                Intrinsics.checkNotNullParameter(eventName, "eventName");
                if (isValid()) {
                    dispatchEvent(eventName, (NativeMap) params, eventCategory, eventTimestamp);
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void dispatchEventSynchronously(@NotNull String eventName, WritableMap params, long eventTimestamp) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (isValid()) {
            UiThreadUtil.assertOnUiThread();
            dispatchEventSynchronously(eventName, (NativeMap) params, eventTimestamp);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void dispatchUnique(@NotNull String eventName, WritableMap params, long eventTimestamp) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (isValid()) {
            dispatchUniqueEvent(eventName, (NativeMap) params, eventTimestamp);
        }
    }
}
