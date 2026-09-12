package com.discord.mobile_voice_overlay;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import co.s;
import com.discord.codegen.NativeMobileVoiceOverlayModuleSpec;
import com.discord.logging.Log;
import com.discord.misc.utilities.activity.ActivityUtilities;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import com.discord.mobile_voice_overlay.utils.WindowUtils;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import java.util.function.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import rn.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0012\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayModule;", "Lcom/discord/codegen/NativeMobileVoiceOverlayModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "mobileVoiceOverlay", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;", "getMobileVoiceOverlay", "()Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;", "mobileVoiceOverlay$delegate", "Lkotlin/Lazy;", "enableOverlay", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "hideOverlay", "showOverlay", "assets", "Lcom/facebook/react/bridge/ReadableMap;", "setData", "data", "Companion", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMobileVoiceOverlayModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MobileVoiceOverlayModule.kt\ncom/discord/mobile_voice_overlay/MobileVoiceOverlayModule\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 ThreadUtils.kt\ncom/discord/misc/utilities/threading/ThreadUtilsKt\n+ 4 NativeMapExtensions.kt\ncom/discord/react/utilities/NativeMapExtensionsKt\n+ 5 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,92:1\n29#2:93\n25#3,8:94\n25#3,8:104\n25#3,8:114\n164#4:102\n164#4:112\n147#5:103\n147#5:113\n*S KotlinDebug\n*F\n+ 1 MobileVoiceOverlayModule.kt\ncom/discord/mobile_voice_overlay/MobileVoiceOverlayModule\n*L\n48#1:93\n69#1:94,8\n76#1:104,8\n83#1:114,8\n75#1:102\n82#1:112\n75#1:103\n82#1:113\n*E\n"})
public final class MobileVoiceOverlayModule extends NativeMobileVoiceOverlayModuleSpec {
    public static final int OVERLAY_REQUEST_CODE = 234780;

    /* JADX INFO: renamed from: mobileVoiceOverlay$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mobileVoiceOverlay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileVoiceOverlayModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.mobileVoiceOverlay = l.b(new d(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit enableOverlay$lambda$3(MobileVoiceOverlayModule mobileVoiceOverlayModule, MobileVoiceOverlayModule$enableOverlay$listener$1 mobileVoiceOverlayModule$enableOverlay$listener$1, Promise promise, Throwable th2) {
        Log.INSTANCE.e("MobileVoiceOverlayModule", "There was an error starting the activity:", th2);
        mobileVoiceOverlayModule.getReactApplicationContext().removeActivityEventListener(mobileVoiceOverlayModule$enableOverlay$listener$1);
        promise.resolve(Boolean.FALSE);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MobileVoiceOverlay getMobileVoiceOverlay() {
        return (MobileVoiceOverlay) this.mobileVoiceOverlay.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MobileVoiceOverlay mobileVoiceOverlay_delegate$lambda$2(MobileVoiceOverlayModule mobileVoiceOverlayModule) {
        ReactApplicationContext reactApplicationContext = mobileVoiceOverlayModule.getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return new MobileVoiceOverlay(reactApplicationContext, new d(mobileVoiceOverlayModule, 1), new s(17, mobileVoiceOverlayModule));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mobileVoiceOverlay_delegate$lambda$2$lambda$0(MobileVoiceOverlayModule mobileVoiceOverlayModule) {
        mobileVoiceOverlayModule.emitOnLayoutTrashed();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mobileVoiceOverlay_delegate$lambda$2$lambda$1(MobileVoiceOverlayModule mobileVoiceOverlayModule, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        mobileVoiceOverlayModule.emitOnChannelQueryUpdate(query);
        return Unit.f14616a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.discord.mobile_voice_overlay.MobileVoiceOverlayModule$enableOverlay$listener$1, com.facebook.react.bridge.ActivityEventListener] */
    @Override // com.discord.codegen.NativeMobileVoiceOverlayModuleSpec
    public void enableOverlay(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        WindowUtils windowUtils = WindowUtils.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        if (windowUtils.canDrawOverlay(reactApplicationContext)) {
            promise.resolve(Boolean.TRUE);
            return;
        }
        final ?? r5 = new ActivityEventListener() { // from class: com.discord.mobile_voice_overlay.MobileVoiceOverlayModule$enableOverlay$listener$1
            @Override // com.facebook.react.bridge.ActivityEventListener
            public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (requestCode == 234780) {
                    this.this$0.getReactApplicationContext().removeActivityEventListener(this);
                    Promise promise2 = promise;
                    WindowUtils windowUtils2 = WindowUtils.INSTANCE;
                    ReactApplicationContext reactApplicationContext2 = this.this$0.getReactApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(reactApplicationContext2, "access$getReactApplicationContext(...)");
                    promise2.resolve(Boolean.valueOf(windowUtils2.canDrawOverlay(reactApplicationContext2)));
                }
            }

            @Override // com.facebook.react.bridge.ActivityEventListener
            public void onNewIntent(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
            }
        };
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + getReactApplicationContext().getPackageName()));
        getReactApplicationContext().addActivityEventListener(r5);
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity != null) {
            ActivityUtilities.INSTANCE.startActivityForResultAsyncWithFuture(currentActivity, intent, OVERLAY_REQUEST_CODE, Bundle.EMPTY).exceptionally(new Function() { // from class: com.discord.mobile_voice_overlay.e
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return MobileVoiceOverlayModule.enableOverlay$lambda$3(this.f4508a, r5, promise, (Throwable) obj);
                }
            });
        } else {
            getReactApplicationContext().removeActivityEventListener(r5);
            promise.resolve(Boolean.FALSE);
        }
    }

    @Override // com.discord.codegen.NativeMobileVoiceOverlayModuleSpec
    public void hideOverlay() {
        if (ThreadUtilsKt.isOnMainThread()) {
            getMobileVoiceOverlay().hideOverlay$mobile_voice_overlay_release();
        } else {
            ThreadUtilsKt.getUiHandler().post(new Runnable() { // from class: com.discord.mobile_voice_overlay.MobileVoiceOverlayModule$hideOverlay$$inlined$postOrRunOnMainThread$1
                @Override // java.lang.Runnable
                public final void run() {
                    this.this$0.getMobileVoiceOverlay().hideOverlay$mobile_voice_overlay_release();
                }
            });
        }
    }

    @Override // com.discord.codegen.NativeMobileVoiceOverlayModuleSpec
    public void setData(ReadableMap data) {
        if (data != null) {
            Json json = NativeMapExtensionsKt.getJson();
            String jsonString = NativeMapExtensionsKt.toJsonString(data);
            json.getClass();
            final MobileVoiceOverlayData mobileVoiceOverlayData = (MobileVoiceOverlayData) json.b(MobileVoiceOverlayData.INSTANCE.serializer(), jsonString);
            if (mobileVoiceOverlayData == null) {
                return;
            }
            if (ThreadUtilsKt.isOnMainThread()) {
                getMobileVoiceOverlay().setData$mobile_voice_overlay_release(mobileVoiceOverlayData);
            } else {
                ThreadUtilsKt.getUiHandler().post(new Runnable() { // from class: com.discord.mobile_voice_overlay.MobileVoiceOverlayModule$setData$$inlined$postOrRunOnMainThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.this$0.getMobileVoiceOverlay().setData$mobile_voice_overlay_release(mobileVoiceOverlayData);
                    }
                });
            }
        }
    }

    @Override // com.discord.codegen.NativeMobileVoiceOverlayModuleSpec
    public void showOverlay(ReadableMap assets) {
        if (assets != null) {
            Json json = NativeMapExtensionsKt.getJson();
            String jsonString = NativeMapExtensionsKt.toJsonString(assets);
            json.getClass();
            final MobileVoiceOverlayAssets mobileVoiceOverlayAssets = (MobileVoiceOverlayAssets) json.b(MobileVoiceOverlayAssets.INSTANCE.serializer(), jsonString);
            if (mobileVoiceOverlayAssets == null) {
                return;
            }
            if (ThreadUtilsKt.isOnMainThread()) {
                getMobileVoiceOverlay().showOverlay$mobile_voice_overlay_release(mobileVoiceOverlayAssets);
            } else {
                ThreadUtilsKt.getUiHandler().post(new Runnable() { // from class: com.discord.mobile_voice_overlay.MobileVoiceOverlayModule$showOverlay$$inlined$postOrRunOnMainThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.this$0.getMobileVoiceOverlay().showOverlay$mobile_voice_overlay_release(mobileVoiceOverlayAssets);
                    }
                });
            }
        }
    }
}
