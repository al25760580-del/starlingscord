package com.margelo.nitro;

import android.util.Log;
import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xa.a;
import yk.b;

/* JADX INFO: loaded from: classes3.dex */
@a
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\b\u000e\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/margelo/nitro/NitroModules;", "Lcom/margelo/nitro/NitroModulesSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "", "jsRuntimePointer", "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "callInvokerHolder", "", "install", "(JLcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "mHybridData", "Lcom/facebook/jni/HybridData;", "Companion", "yk/b", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NitroModules extends NitroModulesSpec {

    @NotNull
    public static final b Companion = new b();

    @NotNull
    public static final String NAME = "NitroModules";
    private static ReactApplicationContext applicationContext;

    @NotNull
    private final ReactApplicationContext context;

    @NotNull
    private final HybridData mHybridData;

    static {
        synchronized (yk.a.class) {
            if (yk.a.f23380a) {
                return;
            }
            try {
                Log.i("NitroModules", "Loading NitroModules C++ library...");
                System.loadLibrary("NitroModules");
                Log.i("NitroModules", "Successfully loaded NitroModules C++ library!");
                yk.a.f23380a = true;
            } catch (Throwable th2) {
                Log.e("NitroModules", "Failed to load NitroModules C++ library! Is it properly installed and linked?", th2);
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NitroModules(@NotNull ReactApplicationContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.mHybridData = initHybrid();
        applicationContext = context;
    }

    public static final ReactApplicationContext getApplicationContext() {
        Companion.getClass();
        return applicationContext;
    }

    private final native HybridData initHybrid();

    private final native void install(long jsRuntimePointer, CallInvokerHolderImpl callInvokerHolder);

    public static final void setApplicationContext(ReactApplicationContext reactApplicationContext) {
        Companion.getClass();
        applicationContext = reactApplicationContext;
    }

    @NotNull
    public final ReactApplicationContext getContext() {
        return this.context;
    }

    @Override // com.margelo.nitro.NativeNitroModulesSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "NitroModules";
    }

    @Override // com.margelo.nitro.NativeNitroModulesSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public String install() {
        try {
            JavaScriptContextHolder javaScriptContextHolder = this.context.getJavaScriptContextHolder();
            if (javaScriptContextHolder == null) {
                return "ReactApplicationContext.javaScriptContextHolder is null!";
            }
            CallInvokerHolder jSCallInvokerHolder = this.context.getJSCallInvokerHolder();
            CallInvokerHolderImpl callInvokerHolderImpl = jSCallInvokerHolder instanceof CallInvokerHolderImpl ? (CallInvokerHolderImpl) jSCallInvokerHolder : null;
            if (callInvokerHolderImpl == null) {
                return "ReactApplicationContext.jsCallInvokerHolder is null!";
            }
            install(javaScriptContextHolder.getContext(), callInvokerHolderImpl);
            return null;
        } catch (Throwable th2) {
            Log.e("NitroModules", "Failed to install Nitro!", th2);
            return th2.getMessage();
        }
    }
}
