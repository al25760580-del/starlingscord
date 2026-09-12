package com.discord.foreground_service;

import com.discord.foreground_service.react.ForegroudServiceConfigurationParserKt;
import com.discord.foreground_service.service.ServiceNotificationConfiguration;
import com.discord.foreground_service.utils.Log;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\tH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/foreground_service/ForegroundServiceModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "isServiceRunning", "", "callback", "Lcom/facebook/react/bridge/Callback;", "startService", "parameters", "Lcom/facebook/react/bridge/ReadableArray;", "stopService", "foreground_service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ForegroundServiceModule extends ReactContextBaseJavaModule {

    @NotNull
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForegroundServiceModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "ForegroundServiceModule";
    }

    @ReactMethod
    public final void isServiceRunning(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(ForegroundServiceManager.INSTANCE.isRunning$foreground_service_release()));
    }

    @ReactMethod
    public final void startService(@NotNull ReadableArray parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        List<ServiceNotificationConfiguration> list = ForegroudServiceConfigurationParserKt.parseList(ServiceNotificationConfiguration.INSTANCE, parameters);
        Log log = Log.INSTANCE;
        Log.i$foreground_service_release$default(log, g.d(list.size(), "startService: ForegroundService with ", " configurations"), null, 2, null);
        if (list.isEmpty()) {
            Log.i$foreground_service_release$default(log, "Couldn't start ForegroundService, no service configurations provided.", null, 2, null);
        } else {
            ForegroundServiceManager.INSTANCE.onRequestServiceCreateOrUpdate$foreground_service_release(this.reactContext, list);
        }
    }

    @ReactMethod
    public final void stopService() {
        Log.i$foreground_service_release$default(Log.INSTANCE, "stopService: Stopping ForegroundService", null, 2, null);
        ForegroundServiceManager.INSTANCE.onRequestServiceDestroy$foreground_service_release(this.reactContext);
    }
}
