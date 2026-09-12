package com.facebook.react.bridge;

import android.content.Context;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.interop.InteropModuleRegistry;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.FrameworkAPI;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import java.util.Collection;
import java.util.Objects;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
@Deprecated(since = "This class is part of Legacy Architecture and will be removed in a future release")
public class BridgeReactContext extends ReactApplicationContext {
    private static final String EARLY_JS_ACCESS_EXCEPTION_MESSAGE = "Tried to access a JS module before the React instance was fully set up. Calls to ReactContext#getJSModule should only happen once initialize() has been called on your native module.";
    private static final String EARLY_NATIVE_MODULE_EXCEPTION_MESSAGE = "Trying to call native module before CatalystInstance has been set!";
    private static final String LATE_JS_ACCESS_EXCEPTION_MESSAGE = "Tried to access a JS module after the React instance was destroyed.";
    private static final String LATE_NATIVE_MODULE_EXCEPTION_MESSAGE = "Trying to call native module after CatalystInstance has been destroyed!";
    private static final String TAG = "BridgeReactContext";
    private CatalystInstance mCatalystInstance;
    private volatile boolean mDestroyed;

    @a
    public interface RCTDeviceEventEmitter extends JavaScriptModule {
        void emit(@NonNull String str, Object obj);
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture(TAG, LegacyArchitectureLogLevel.ERROR);
    }

    public BridgeReactContext(Context context) {
        super(context);
        this.mDestroyed = false;
    }

    private void raiseCatalystInstanceMissingException() {
        throw new IllegalStateException(this.mDestroyed ? LATE_NATIVE_MODULE_EXCEPTION_MESSAGE : EARLY_NATIVE_MODULE_EXCEPTION_MESSAGE);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void destroy() {
        UiThreadUtil.assertOnUiThread();
        this.mDestroyed = true;
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            catalystInstance.destroy();
        }
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CatalystInstance getCatalystInstance() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        io.sentry.config.a.f(catalystInstance);
        return catalystInstance;
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Deprecated
    public UIManager getFabricUIManager() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        Objects.requireNonNull(catalystInstance);
        return catalystInstance.getFabricUIManager();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CallInvokerHolder getJSCallInvokerHolder() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            return catalystInstance.getJSCallInvokerHolder();
        }
        return null;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        T t5;
        if (this.mCatalystInstance != null) {
            InteropModuleRegistry interopModuleRegistry = this.mInteropModuleRegistry;
            return (interopModuleRegistry == null || (t5 = (T) interopModuleRegistry.getInteropModule(cls)) == null) ? (T) this.mCatalystInstance.getJSModule(cls) : t5;
        }
        if (this.mDestroyed) {
            throw new IllegalStateException(LATE_JS_ACCESS_EXCEPTION_MESSAGE);
        }
        throw new IllegalStateException(EARLY_JS_ACCESS_EXCEPTION_MESSAGE);
    }

    @Override // com.facebook.react.bridge.ReactContext
    @FrameworkAPI
    @UnstableReactNativeAPI
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            return catalystInstance.getJavaScriptContextHolder();
        }
        return null;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        if (this.mCatalystInstance == null) {
            raiseCatalystInstanceMissingException();
        }
        io.sentry.config.a.f(this.mCatalystInstance);
        return (T) this.mCatalystInstance.getNativeModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public Collection<NativeModule> getNativeModules() {
        if (this.mCatalystInstance == null) {
            raiseCatalystInstanceMissingException();
        }
        io.sentry.config.a.f(this.mCatalystInstance);
        return this.mCatalystInstance.getNativeModules();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public String getSourceURL() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance == null) {
            return null;
        }
        return catalystInstance.getSourceURL();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void handleException(Exception exc) {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        boolean z5 = catalystInstance != null;
        boolean z6 = (catalystInstance == null || catalystInstance.isDestroyed()) ? false : true;
        boolean z7 = getJSExceptionHandler() != null;
        if (z6 && z7) {
            getJSExceptionHandler().handleException(exc);
            return;
        }
        o8.a.h(ReactConstants.TAG, "Unable to handle Exception - catalystInstanceVariableExists: " + z5 + " - isCatalystInstanceAlive: " + z6 + " - hasExceptionHandler: " + z7, exc);
        throw new IllegalStateException(exc);
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Deprecated
    public boolean hasActiveCatalystInstance() {
        return hasActiveReactInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveReactInstance() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        return (catalystInstance == null || catalystInstance.isDestroyed()) ? false : true;
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Deprecated
    public boolean hasCatalystInstance() {
        return this.mCatalystInstance != null;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        if (this.mCatalystInstance == null) {
            raiseCatalystInstanceMissingException();
        }
        io.sentry.config.a.f(this.mCatalystInstance);
        return this.mCatalystInstance.hasNativeModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasReactInstance() {
        return this.mCatalystInstance != null;
    }

    public void initializeWithInstance(CatalystInstance catalystInstance) {
        if (catalystInstance == null) {
            throw new IllegalArgumentException("CatalystInstance cannot be null.");
        }
        if (this.mCatalystInstance != null) {
            throw new IllegalStateException("ReactContext has been already initialized");
        }
        if (this.mDestroyed) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot initialize ReactContext after it has been destroyed."));
        }
        this.mCatalystInstance = catalystInstance;
        initializeMessageQueueThreads(catalystInstance.getReactQueueConfiguration());
        initializeInteropModules();
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Deprecated
    public boolean isBridgeless() {
        return false;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void registerSegment(int i7, String str, Callback callback) {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        io.sentry.config.a.f(catalystInstance);
        catalystInstance.registerSegment(i7, str);
        io.sentry.config.a.f(callback);
        callback.invoke(new Object[0]);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public NativeModule getNativeModule(String str) {
        if (this.mCatalystInstance == null) {
            raiseCatalystInstanceMissingException();
        }
        io.sentry.config.a.f(this.mCatalystInstance);
        return this.mCatalystInstance.getNativeModule(str);
    }
}
