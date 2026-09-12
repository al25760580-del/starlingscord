package com.discord.device;

import android.os.Build;
import android.os.PowerManager;
import com.discord.codegen.NativeDeviceThermalStateModuleSpec;
import com.discord.device.DeviceThermalStateModule;
import com.discord.device.react_events.DeviceThermalStateChangedEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discord/device/DeviceThermalStateModule;", "Lcom/discord/codegen/NativeDeviceThermalStateModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "initialize", "", "addListener", "type", "", "removeListeners", "count", "", "getThermalState", "()Ljava/lang/Double;", "device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceThermalStateModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceThermalStateModule.kt\ncom/discord/device/DeviceThermalStateModule\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,50:1\n31#2:51\n31#2:52\n*S KotlinDebug\n*F\n+ 1 DeviceThermalStateModule.kt\ncom/discord/device/DeviceThermalStateModule\n*L\n23#1:51\n43#1:52\n*E\n"})
public final class DeviceThermalStateModule extends NativeDeviceThermalStateModuleSpec {

    @NotNull
    private final ReactEvents reactEvents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceThermalStateModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactEvents = new ReactEvents(new Pair("DeviceThermalStateDidChange", Reflection.getOrCreateKotlinClass(DeviceThermalStateChangedEvent.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$0(DeviceThermalStateModule deviceThermalStateModule, int i7) {
        ReactEvents reactEvents = deviceThermalStateModule.reactEvents;
        ReactApplicationContext reactApplicationContext = deviceThermalStateModule.getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        reactEvents.emitModuleEvent(reactApplicationContext, new DeviceThermalStateChangedEvent(i7));
    }

    @Override // com.discord.codegen.NativeDeviceThermalStateModuleSpec
    public void addListener(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Override // com.discord.codegen.NativeDeviceThermalStateModuleSpec
    public Double getThermalState() {
        if (Build.VERSION.SDK_INT >= 29) {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            PowerManager powerManager = (PowerManager) reactApplicationContext.getSystemService(PowerManager.class);
            if (powerManager != null) {
                return Double.valueOf(powerManager.getCurrentThermalStatus());
            }
        }
        return null;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        if (Build.VERSION.SDK_INT >= 29) {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            PowerManager powerManager = (PowerManager) reactApplicationContext.getSystemService(PowerManager.class);
            if (powerManager != null) {
                powerManager.addThermalStatusListener(new PowerManager.OnThermalStatusChangedListener() { // from class: s6.a
                    @Override // android.os.PowerManager.OnThermalStatusChangedListener
                    public final void onThermalStatusChanged(int i7) {
                        DeviceThermalStateModule.initialize$lambda$0(this.f19794a, i7);
                    }
                });
            }
        }
    }

    @Override // com.discord.codegen.NativeDeviceThermalStateModuleSpec
    public void removeListeners(double count) {
    }
}
