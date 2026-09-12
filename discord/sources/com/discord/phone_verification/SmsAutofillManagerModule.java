package com.discord.phone_verification;

import com.discord.phone_verification.reactevents.VerificationCodeReceivedEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.runtime.p;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0007J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0007H\u0007J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/phone_verification/SmsAutofillManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "smsAutofillManager", "Lcom/discord/phone_verification/SmsAutofillManager;", "initialize", "", "invalidate", "startSmsRetriever", "addListener", "type", "removeListeners", "count", "", "phone_verification_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SmsAutofillManagerModule extends ReactContextBaseJavaModule {

    @NotNull
    private final ReactEvents reactEvents;

    @NotNull
    private final SmsAutofillManager smsAutofillManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmsAutofillManagerModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactEvents = new ReactEvents(new Pair("verificationCodeReceived", Reflection.getOrCreateKotlinClass(VerificationCodeReceivedEvent.class)));
        this.smsAutofillManager = new SmsAutofillManager(reactContext, new p(3, this, reactContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit smsAutofillManager$lambda$0(SmsAutofillManagerModule smsAutofillManagerModule, ReactApplicationContext reactApplicationContext, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        smsAutofillManagerModule.reactEvents.emitModuleEvent(reactApplicationContext, new VerificationCodeReceivedEvent(it));
        return Unit.f14616a;
    }

    @ReactMethod
    public final void addListener(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "SmsAutofillManager";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.smsAutofillManager.registerReceiver();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.smsAutofillManager.unregisterReceiver();
    }

    @ReactMethod
    public final void removeListeners(int count) {
    }

    @ReactMethod
    public final void startSmsRetriever() {
        this.smsAutofillManager.startSmsRetriever();
    }
}
