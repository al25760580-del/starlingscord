package com.discord.time_zone_fix;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.discord.codegen.NativeTimezoneHermesFixModuleSpec;
import com.discord.logging.Log;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Date;
import java.util.Iterator;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000f\u001a\u00020\u0007H\u0082 J\u0011\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/discord/time_zone_fix/TimezoneHermesFixModule;", "Lcom/discord/codegen/NativeTimezoneHermesFixModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "()V", "mReactContext", "receiver", "Landroid/content/BroadcastReceiver;", "currentTimezoneName", "", "initHybrid", "resetTzHermes", "", "jsRuntimePtr", "", "onTimezoneChanged", "getCurrentTimeZone", "Lcom/facebook/react/bridge/WritableMap;", "getSupportedTimeZones", "Lcom/facebook/react/bridge/WritableArray;", "invalidate", "Companion", "time_zone_fix_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TimezoneHermesFixModule extends NativeTimezoneHermesFixModuleSpec {

    @NotNull
    private String currentTimezoneName;

    @NotNull
    private final HybridData mHybridData;

    @NotNull
    private final ReactApplicationContext mReactContext;
    private BroadcastReceiver receiver;

    static {
        System.loadLibrary("timezone-hermes-fix");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimezoneHermesFixModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.mHybridData = initHybrid();
        this.mReactContext = reactContext;
        String id2 = TimeZone.getDefault().getID();
        Intrinsics.checkNotNullExpressionValue(id2, "getID(...)");
        this.currentTimezoneName = id2;
        this.receiver = new BroadcastReceiver() { // from class: com.discord.time_zone_fix.TimezoneHermesFixModule.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, "android.intent.action.TIMEZONE_CHANGED")) {
                    String id3 = TimeZone.getDefault().getID();
                    if (Intrinsics.areEqual(id3, TimezoneHermesFixModule.this.currentTimezoneName)) {
                        return;
                    }
                    TimezoneHermesFixModule timezoneHermesFixModule = TimezoneHermesFixModule.this;
                    Intrinsics.checkNotNull(id3);
                    timezoneHermesFixModule.currentTimezoneName = id3;
                    TimezoneHermesFixModule.this.onTimezoneChanged();
                }
            }
        };
        reactContext.registerReceiver(this.receiver, new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
    }

    private static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTimezoneChanged() {
        try {
            if (this.mReactContext.getCatalystInstance() == null) {
                Log.e$default(Log.INSTANCE, NativeTimezoneHermesFixModuleSpec.NAME, "CatalystInstance is null", (Throwable) null, 4, (Object) null);
                return;
            }
            if (this.mReactContext.getJSCallInvokerHolder() == null) {
                Log.e$default(Log.INSTANCE, NativeTimezoneHermesFixModuleSpec.NAME, "CallInvokerHolder is null or not of expected type", (Throwable) null, 4, (Object) null);
                return;
            }
            JavaScriptContextHolder javaScriptContextHolder = this.mReactContext.getJavaScriptContextHolder();
            if (javaScriptContextHolder == null) {
                Log.e$default(Log.INSTANCE, NativeTimezoneHermesFixModuleSpec.NAME, "JavaScriptContextHolder is null", (Throwable) null, 4, (Object) null);
                return;
            }
            long context = javaScriptContextHolder.getContext();
            if (context == 0) {
                Log.e$default(Log.INSTANCE, NativeTimezoneHermesFixModuleSpec.NAME, "JSI Runtime pointer is null", (Throwable) null, 4, (Object) null);
            } else {
                resetTzHermes(context);
                emitOnTimezoneChange(getCurrentTimeZone());
            }
        } catch (Exception e10) {
            Log.INSTANCE.e(NativeTimezoneHermesFixModuleSpec.NAME, "Error resetting Hermes timezone cache: " + e10.getMessage(), e10);
        }
    }

    private final native void resetTzHermes(long jsRuntimePtr);

    @Override // com.discord.codegen.NativeTimezoneHermesFixModuleSpec
    @NotNull
    public WritableMap getCurrentTimeZone() {
        TimeZone timeZone = TimeZone.getDefault();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(StackTraceHelper.NAME_KEY, timeZone.getID());
        writableNativeMap.putInt("secondsFromGMT", timeZone.getOffset(new Date().getTime()) / 1000);
        writableNativeMap.putBoolean("isDaylightSavingTime", timeZone.inDaylightTime(new Date()));
        return writableNativeMap;
    }

    @Override // com.discord.codegen.NativeTimezoneHermesFixModuleSpec
    @NotNull
    public WritableArray getSupportedTimeZones() {
        String[] availableIDs = TimeZone.getAvailableIDs();
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        Iterator it = ArrayIteratorKt.iterator(availableIDs);
        while (it.hasNext()) {
            writableNativeArray.pushString((String) it.next());
        }
        return writableNativeArray;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        BroadcastReceiver broadcastReceiver = this.receiver;
        if (broadcastReceiver != null) {
            this.mReactContext.unregisterReceiver(broadcastReceiver);
            this.receiver = null;
        }
        super.invalidate();
    }
}
