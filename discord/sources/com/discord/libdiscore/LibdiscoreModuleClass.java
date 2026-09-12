package com.discord.libdiscore;

import android.content.Context;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\r"}, d2 = {"Lcom/discord/libdiscore/LibdiscoreModuleClass;", "", "<init>", "()V", "jniInitLibDiscore", "", "cacheBasePath", "", "init", "Lcom/discord/libdiscore/LibdiscoreModuleClass$LibdiscoreModule;", "context", "Landroid/content/Context;", "LibdiscoreModule", "discordapp_libdiscore-mobile_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class LibdiscoreModuleClass {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0082 J\u0019\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0082 J\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082 J\t\u0010\u0011\u001a\u00020\u0005H\u0082 J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0005J\u001e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0015\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\u0016"}, d2 = {"Lcom/discord/libdiscore/LibdiscoreModuleClass$LibdiscoreModule;", "", "<init>", "()V", "jniBridgeJSIFunctions", "", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "jsiPtr", "", "callInvokerHolder", "Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "jniInvalidateJSIFunctions", "jniGetConfigTreatmentId", "", "experimentName", "", "jniInstallSentryReporter", "getConfigTreatmentId", "installSentryReporter", "bridgeJSIFunctions", "invalidateJSIFunctions", "discordapp_libdiscore-mobile_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LibdiscoreModule {
        private final native void jniBridgeJSIFunctions(ReactApplicationContext context, long jsiPtr, CallInvokerHolder callInvokerHolder);

        private final native int jniGetConfigTreatmentId(String experimentName);

        private final native void jniInstallSentryReporter();

        private final native void jniInvalidateJSIFunctions(long jsiPtr, CallInvokerHolder callInvokerHolder);

        public final void bridgeJSIFunctions(@NotNull ReactApplicationContext context, long jsiPtr, @NotNull CallInvokerHolder callInvokerHolder) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callInvokerHolder, "callInvokerHolder");
            jniBridgeJSIFunctions(context, jsiPtr, callInvokerHolder);
        }

        public final int getConfigTreatmentId(@NotNull String experimentName) {
            Intrinsics.checkNotNullParameter(experimentName, "experimentName");
            return jniGetConfigTreatmentId(experimentName);
        }

        public final void installSentryReporter() {
            jniInstallSentryReporter();
        }

        public final void invalidateJSIFunctions(long jsiPtr, @NotNull CallInvokerHolder callInvokerHolder) {
            Intrinsics.checkNotNullParameter(callInvokerHolder, "callInvokerHolder");
            jniInvalidateJSIFunctions(jsiPtr, callInvokerHolder);
        }
    }

    private final native void jniInitLibDiscore(String cacheBasePath);

    @NotNull
    public final LibdiscoreModule init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        System.loadLibrary("libdiscore-rn-jsi-module");
        File file = new File(context.getCacheDir(), "libdiscore");
        if (!file.exists()) {
            file.mkdirs();
        }
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        jniInitLibDiscore(absolutePath);
        return new LibdiscoreModule();
    }
}
