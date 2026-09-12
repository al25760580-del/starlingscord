package com.discord.libdiscore;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/discord/libdiscore/LibDiscoreReactNativeModule;", "Lcom/facebook/react/bridge/BaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "libdiscoreModuleProvider", "Lcom/discord/libdiscore/LibdiscoreModuleProvider;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/discord/libdiscore/LibdiscoreModuleProvider;)V", "jsiPtr", "", "callInvokerHolder", "Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "getName", "", "bridgeJSIFunctions", "", "invalidate", "", "Companion", "discordapp_libdiscore-mobile_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LibDiscoreReactNativeModule extends BaseJavaModule {

    @NotNull
    public static final String NAME = "LibDiscoreModule";
    private CallInvokerHolder callInvokerHolder;
    private long jsiPtr;

    @NotNull
    private final LibdiscoreModuleProvider libdiscoreModuleProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibDiscoreReactNativeModule(@NotNull ReactApplicationContext reactContext, @NotNull LibdiscoreModuleProvider libdiscoreModuleProvider) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(libdiscoreModuleProvider, "libdiscoreModuleProvider");
        this.libdiscoreModuleProvider = libdiscoreModuleProvider;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean bridgeJSIFunctions() {
        try {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            CallInvokerHolder jSCallInvokerHolder = reactApplicationContext.getCatalystInstance().getJSCallInvokerHolder();
            JavaScriptContextHolder javaScriptContextHolder = reactApplicationContext.getJavaScriptContextHolder();
            Intrinsics.checkNotNull(javaScriptContextHolder);
            long context = javaScriptContextHolder.getContext();
            synchronized (this) {
                this.jsiPtr = context;
                this.callInvokerHolder = jSCallInvokerHolder;
                Unit unit = Unit.f14616a;
            }
            this.libdiscoreModuleProvider.get().bridgeJSIFunctions(reactApplicationContext, context, jSCallInvokerHolder);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        long j;
        CallInvokerHolder callInvokerHolder;
        synchronized (this) {
            j = this.jsiPtr;
            callInvokerHolder = this.callInvokerHolder;
            this.jsiPtr = 0L;
            this.callInvokerHolder = null;
            Unit unit = Unit.f14616a;
        }
        if (j != 0 && callInvokerHolder != null) {
            try {
                this.libdiscoreModuleProvider.get().invalidateJSIFunctions(j, callInvokerHolder);
            } catch (Exception unused) {
            }
        }
        super.invalidate();
    }
}
