package com.discord.tti_manager;

import android.app.Activity;
import android.os.Build;
import com.discord.codegen.NativeTTIManagerModuleSpec;
import com.discord.logging.Log;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.tti_manager.react.ReactMarkerListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\tH\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\"\u001a\u00020\u0019H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/discord/tti_manager/TTIManagerModule;", "Lcom/discord/codegen/NativeTTIManagerModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "ttiBroadcastReceiver", "Lcom/discord/tti_manager/TTIBroadcastReceiver;", "initialize", "", "invalidate", "getJSBundleTimestamps", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getAppStartType", "getLaunchScenario", "getAppStartedTimestamp", "getAppFirstVisibleTimestamp", "getAllNativeTimestamps", "reportFullyDrawn", "logToDeviceEnabled", "runningTTIAutomation", "", "logToDevice", "message", "", "trackTTILogged", "getAndroidAppStartType", "mainActivityCreationTime", "", "getAndroidAppFirstVisibleTimestamp", "getLegacyAndroidAppStartType", "appStartedTimestamp", "", "getAndroidPAppStartType", "tti_manager_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTTIManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TTIManagerModule.kt\ncom/discord/tti_manager/TTIManagerModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,171:1\n1563#2:172\n1634#2,3:173\n*S KotlinDebug\n*F\n+ 1 TTIManagerModule.kt\ncom/discord/tti_manager/TTIManagerModule\n*L\n74#1:172\n74#1:173,3\n*E\n"})
public final class TTIManagerModule extends NativeTTIManagerModuleSpec {

    @NotNull
    private final ReactApplicationContext reactContext;

    @NotNull
    private final TTIBroadcastReceiver ttiBroadcastReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TTIManagerModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.ttiBroadcastReceiver = new TTIBroadcastReceiver();
    }

    private final long getAndroidAppFirstVisibleTimestamp(long mainActivityCreationTime) {
        long applicationStartedTimestamp = TTIModule.INSTANCE.getApplicationStartedTimestamp();
        if (applicationStartedTimestamp > 0) {
            return Intrinsics.areEqual(getAndroidAppStartType(mainActivityCreationTime), "COLD") ? applicationStartedTimestamp : mainActivityCreationTime;
        }
        throw new IllegalStateException("NativeTTIManagerModule.getAppFirstVisibleTimestamp() called before app start was marked.");
    }

    private final String getAndroidAppStartType(long mainActivityCreationTime) {
        long applicationStartedTimestamp = TTIModule.INSTANCE.getApplicationStartedTimestamp();
        if (applicationStartedTimestamp > 0) {
            return Build.VERSION.SDK_INT < 28 ? getLegacyAndroidAppStartType(applicationStartedTimestamp, mainActivityCreationTime) : getAndroidPAppStartType();
        }
        throw new IllegalStateException("NativeTTIManagerModule.getAppStartType() called before app start was marked.");
    }

    private final String getAndroidPAppStartType() {
        return TTIModule.INSTANCE.getWasInitializeCompleteWhenActivityOpened() ? "WARM" : "COLD";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAppFirstVisibleTimestamp$lambda$2(TTIManagerModule tTIManagerModule, Promise promise, long j) {
        promise.resolve(Double.valueOf(tTIManagerModule.getAndroidAppFirstVisibleTimestamp(j)));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAppStartType$lambda$0(TTIManagerModule tTIManagerModule, Promise promise, long j) {
        promise.resolve(tTIManagerModule.getAndroidAppStartType(j));
        return Unit.f14616a;
    }

    private final String getLegacyAndroidAppStartType(double appStartedTimestamp, long mainActivityCreationTime) {
        return ((double) mainActivityCreationTime) - appStartedTimestamp < 3000.0d ? "COLD" : "WARM";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportFullyDrawn$lambda$4(Activity activity) {
        try {
            activity.reportFullyDrawn();
        } catch (Throwable unused) {
        }
    }

    @Override // com.discord.codegen.NativeTTIManagerModuleSpec
    public void getAllNativeTimestamps(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            ArrayList<TTIMetrics.Timing> timings = TTIMetrics.INSTANCE.getTimings();
            ArrayList arrayList = new ArrayList(e0.l(timings, 10));
            for (TTIMetrics.Timing timing : timings) {
                arrayList.add(NativeMapExtensionsKt.nativeMapOf(new Pair("label", timing.getLabel()), new Pair("timestamp", Long.valueOf(timing.getTimestamp())), new Pair("tag", timing.getTag()), new Pair("autoGenerated", Boolean.valueOf(timing.getAutoGenerated()))));
            }
            promise.resolve(NativeArrayExtensionsKt.toNativeArray$default(arrayList, null, 1, null));
        } catch (Throwable th2) {
            promise.reject(th2);
        }
    }

    @Override // com.discord.codegen.NativeTTIManagerModuleSpec
    public void getAppFirstVisibleTimestamp(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        TTIModule.INSTANCE.resolveMainActivityCreationTime(new a(this, promise, 1));
    }

    @Override // com.discord.codegen.NativeTTIManagerModuleSpec
    public void getAppStartType(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        TTIModule.INSTANCE.resolveMainActivityCreationTime(new a(this, promise, 0));
    }

    @Override // com.discord.codegen.NativeTTIManagerModuleSpec
    public void getAppStartedTimestamp(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        long applicationStartedTimestamp = TTIModule.INSTANCE.getApplicationStartedTimestamp();
        if (applicationStartedTimestamp <= 0) {
            throw new IllegalStateException("NativeTTIManagerModule.getAppStartedTimestamp() called before app start was marked.");
        }
        promise.resolve(Double.valueOf(applicationStartedTimestamp));
    }

    @Override // com.discord.codegen.NativeTTIManagerModuleSpec
    public void getJSBundleTimestamps(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        ReactMarkerListener reactMarkerListener = ReactMarkerListener.INSTANCE;
        promise.resolve(NativeMapExtensionsKt.nativeMapOf(new Pair("JSBundleStartedTimestamp", Double.valueOf(reactMarkerListener.getBundleStartedTimestamp())), new Pair("JSBundleLoadedTimestamp", Double.valueOf(reactMarkerListener.getBundleLoadedTimestamp())), new Pair("JSBundleParsedTimestamp", Double.valueOf(reactMarkerListener.getBundleParsedTimestamp()))));
    }

    @Override // com.discord.codegen.NativeTTIManagerModuleSpec
    public void getLaunchScenario(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(TTIModule.INSTANCE.getLaunchScenario());
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        if (BuildConfig.logTTIMetrics.booleanValue()) {
            TTIBroadcastReceiver.Companion companion = TTIBroadcastReceiver.INSTANCE;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            companion.register(reactApplicationContext, this.ttiBroadcastReceiver);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        try {
            if (BuildConfig.logTTIMetrics.booleanValue()) {
                TTIBroadcastReceiver.Companion companion = TTIBroadcastReceiver.INSTANCE;
                ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
                companion.unregister(reactApplicationContext, this.ttiBroadcastReceiver);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.discord.codegen.NativeTTIManagerModuleSpec
    public void logToDevice(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.i$default(Log.INSTANCE, "ttidata", message, (Throwable) null, 4, (Object) null);
    }

    @Override // com.discord.codegen.NativeTTIManagerModuleSpec
    public void logToDeviceEnabled(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(BuildConfig.logTTIMetrics);
    }

    @Override // com.discord.codegen.NativeTTIManagerModuleSpec
    public void reportFullyDrawn() {
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        try {
            currentActivity.runOnUiThread(new com.discord.share.a(currentActivity, 1));
        } catch (Throwable unused) {
        }
    }

    @Override // com.discord.codegen.NativeTTIManagerModuleSpec
    public boolean runningTTIAutomation() {
        Boolean logTTIMetrics = BuildConfig.logTTIMetrics;
        Intrinsics.checkNotNullExpressionValue(logTTIMetrics, "logTTIMetrics");
        return logTTIMetrics.booleanValue();
    }

    @Override // com.discord.codegen.NativeTTIManagerModuleSpec
    public void trackTTILogged() {
        TTIMetrics.INSTANCE.setLoggedTTI(true);
    }
}
