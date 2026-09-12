package com.discord.ads;

import a1.k;
import a3.e;
import com.discord.codegen.NativeAdsModuleSpec;
import com.discord.logging.Log;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.gms.ads.identifier.AdvertisingIdClient$Info;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import hi.b;
import hi.m;
import hi.n;
import hi.o;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import oe.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0016R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/discord/ads/AdsModule;", "Lcom/discord/codegen/NativeAdsModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "adExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "currentOperation", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;", "getGoogleAdvertisingId", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getAdvertisingIdInfoAsync", "resolveWithNullId", "cleanupCurrentOperation", "invalidate", "Companion", "ads_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdsModule extends NativeAdsModuleSpec {

    @NotNull
    private static final String TAG = "AdsModule";
    private final ExecutorService adExecutor;

    @NotNull
    private final AtomicReference<ListenableFuture> currentOperation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.adExecutor = Executors.newSingleThreadExecutor();
        this.currentOperation = new AtomicReference<>(null);
    }

    private final void cleanupCurrentOperation() {
        ListenableFuture andSet = this.currentOperation.getAndSet(null);
        if (andSet == null || andSet.isDone()) {
            return;
        }
        Log.i$default(Log.INSTANCE, TAG, "Stopping current google advertising ID operation", (Throwable) null, 4, (Object) null);
        andSet.cancel(true);
    }

    private final ListenableFuture getAdvertisingIdInfoAsync() {
        SettableFuture settableFuture = new SettableFuture();
        this.adExecutor.execute(new k(6, settableFuture, this));
        Intrinsics.checkNotNullExpressionValue(settableFuture, "also(...)");
        return settableFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getAdvertisingIdInfoAsync$lambda$1$lambda$0(SettableFuture settableFuture, AdsModule adsModule) {
        try {
            AdvertisingIdClient$Info advertisingIdClient$InfoA = a.a(adsModule.getReactApplicationContext());
            settableFuture.getClass();
            if (m.f10791x.l(settableFuture, null, advertisingIdClient$InfoA)) {
                m.e(settableFuture);
            }
        } catch (Exception e10) {
            Exception exc = new Exception(e.l("Error getting google advertising ID info: ", e10.getMessage()), e10);
            settableFuture.getClass();
            if (m.f10791x.l(settableFuture, null, new b(exc))) {
                m.e(settableFuture);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resolveWithNullId(Promise promise) {
        promise.resolve(NativeMapExtensionsKt.nativeMapOf(new Pair("googleAdvertisingId", null), new Pair("isLimitAdTrackingEnabled", Boolean.TRUE)));
    }

    @Override // com.discord.codegen.NativeAdsModuleSpec
    public void getGoogleAdvertisingId(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        cleanupCurrentOperation();
        ListenableFuture advertisingIdInfoAsync = getAdvertisingIdInfoAsync();
        this.currentOperation.set(advertisingIdInfoAsync);
        n nVar = new n() { // from class: com.discord.ads.AdsModule.getGoogleAdvertisingId.1
            @Override // hi.n
            public void onFailure(Throwable t5) {
                Intrinsics.checkNotNullParameter(t5, "t");
                AdsModule.this.currentOperation.set(null);
                if (t5 instanceof CancellationException) {
                    Log.i$default(Log.INSTANCE, AdsModule.TAG, "Google advertising ID operation was cancelled", (Throwable) null, 4, (Object) null);
                    AdsModule.this.resolveWithNullId(promise);
                    return;
                }
                Log.INSTANCE.e(AdsModule.TAG, "Error getting google advertising ID: " + t5.getMessage(), t5);
                promise.reject("err", "Failed to get google advertising ID", t5);
            }

            @Override // hi.n
            public void onSuccess(AdvertisingIdClient$Info adInfo) {
                Intrinsics.checkNotNullParameter(adInfo, "adInfo");
                AdsModule.this.currentOperation.set(null);
                String str = adInfo.f5890a;
                boolean z5 = adInfo.f5891b;
                WritableNativeMap writableNativeMapNativeMapOf = NativeMapExtensionsKt.nativeMapOf(new Pair("googleAdvertisingId", z5 ? null : str), new Pair("isLimitAdTrackingEnabled", Boolean.valueOf(z5)));
                if (z5) {
                    Log.i$default(Log.INSTANCE, AdsModule.TAG, "User has limited ad tracking, returning null ID", (Throwable) null, 4, (Object) null);
                } else {
                    Log.i$default(Log.INSTANCE, AdsModule.TAG, "Successfully retrieved google advertising ID", (Throwable) null, 4, (Object) null);
                }
                promise.resolve(writableNativeMapNativeMapOf);
            }
        };
        advertisingIdInfoAsync.a(new o(0, advertisingIdInfoAsync, nVar), this.adExecutor);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        cleanupCurrentOperation();
        this.adExecutor.shutdown();
        super.invalidate();
    }
}
