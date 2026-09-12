package com.discord.telecom;

import a3.e;
import android.content.ComponentName;
import android.os.Build;
import android.os.Bundle;
import android.telecom.DisconnectCause;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.codegen.NativeTelecomModuleSpec;
import com.discord.logging.Log;
import com.discord.reactevents.ReactEvents;
import com.discord.telecom.react.events.TelecomIncomingCallAnsweredEvent;
import com.discord.telecom.react.events.TelecomIncomingCallRejectedEvent;
import com.discord.telecom.service.TelecomConnection;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 52\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0003J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016J \u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\"\u0010 \u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u0010%\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010#\u001a\u00020$H\u0016J*\u0010&\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u0010(\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u0010)\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010*\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u0010+\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010#\u001a\u00020$H\u0016J\u001d\u0010,\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u000bH\u0001¢\u0006\u0002\b.J\u0015\u0010/\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\nH\u0000¢\u0006\u0002\b0J\u0015\u00101\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\nH\u0000¢\u0006\u0002\b2J\u0015\u00103\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\nH\u0000¢\u0006\u0002\b4R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/discord/telecom/TelecomModule;", "Lcom/discord/codegen/NativeTelecomModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "phoneAccountHandle", "Landroid/telecom/PhoneAccountHandle;", "connections", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/discord/telecom/service/TelecomConnection;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "initialize", "", "invalidate", "registerPhoneAccount", "addListener", "eventType", "removeListeners", "count", "", "setCallActive", "callId", "initialMicMuted", "", "setMicMuted", "isMuted", "setScreenShareState", "isEnabled", "isActivated", "startCall", "options", "Lcom/facebook/react/bridge/ReadableMap;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "endCall", "reportIncomingCall", "callerName", "cancelIncomingCall", "setIncomingCallActive", "isAvailable", "registerIncomingCall", "onConnectionCreated", "connection", "onConnectionCreated$telecom_androidRelease", "emitCallAnswered", "emitCallAnswered$telecom_androidRelease", "emitCallRejected", "emitCallRejected$telecom_androidRelease", "onConnectionDisconnected", "onConnectionDisconnected$telecom_androidRelease", "Companion", "telecom_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTelecomModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TelecomModule.kt\ncom/discord/telecom/TelecomModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n1#2:202\n*E\n"})
public final class TelecomModule extends NativeTelecomModuleSpec {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EVENT_INCOMING_CALL_ANSWERED = "telecom-incoming-call-answered";

    @NotNull
    public static final String EVENT_INCOMING_CALL_REJECTED = "telecom-incoming-call-rejected";

    @NotNull
    public static final String EXTRA_CALL_ID = "discord_call_id";

    @NotNull
    private static final String PHONE_ACCOUNT_ID = "discord_voice";

    @NotNull
    private static final String PHONE_ACCOUNT_LABEL = "Discord Voice";

    @NotNull
    private static final String TAG = "TelecomAndroid";

    @NotNull
    private static final String URI_SCHEME = "discord";
    private static volatile Function0<Unit> acceptIncomingCallHandler;
    private static volatile TelecomModule instance;

    @NotNull
    private final ConcurrentHashMap<String, TelecomConnection> connections;
    private PhoneAccountHandle phoneAccountHandle;

    @NotNull
    private final ReactEvents reactEvents;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/discord/telecom/TelecomModule$Companion;", "", "<init>", "()V", "TAG", "", "PHONE_ACCOUNT_ID", "PHONE_ACCOUNT_LABEL", "URI_SCHEME", "EVENT_INCOMING_CALL_ANSWERED", "EVENT_INCOMING_CALL_REJECTED", "EXTRA_CALL_ID", "value", "Lcom/discord/telecom/TelecomModule;", "instance", "getInstance", "()Lcom/discord/telecom/TelecomModule;", "acceptIncomingCallHandler", "Lkotlin/Function0;", "", "getAcceptIncomingCallHandler", "()Lkotlin/jvm/functions/Function0;", "setAcceptIncomingCallHandler", "(Lkotlin/jvm/functions/Function0;)V", "telecom_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function0<Unit> getAcceptIncomingCallHandler() {
            return TelecomModule.acceptIncomingCallHandler;
        }

        public final TelecomModule getInstance() {
            return TelecomModule.instance;
        }

        public final void setAcceptIncomingCallHandler(Function0<Unit> function0) {
            TelecomModule.acceptIncomingCallHandler = function0;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TelecomModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.connections = new ConcurrentHashMap<>();
        this.reactEvents = new ReactEvents(new Pair(EVENT_INCOMING_CALL_ANSWERED, Reflection.getOrCreateKotlinClass(TelecomIncomingCallAnsweredEvent.class)), new Pair(EVENT_INCOMING_CALL_REJECTED, Reflection.getOrCreateKotlinClass(TelecomIncomingCallRejectedEvent.class)));
    }

    private final void registerPhoneAccount() {
        try {
            Object systemService = getReactApplicationContext().getSystemService("telecom");
            TelecomManager telecomManager = systemService instanceof TelecomManager ? (TelecomManager) systemService : null;
            if (telecomManager == null) {
                return;
            }
            PhoneAccountHandle phoneAccountHandle = new PhoneAccountHandle(new ComponentName(getReactApplicationContext().getPackageName(), "com.discord.telecom.service.TelecomConnectionService"), PHONE_ACCOUNT_ID);
            telecomManager.registerPhoneAccount(PhoneAccount.builder(phoneAccountHandle, PHONE_ACCOUNT_LABEL).setCapabilities(RecyclerView.ItemAnimator.FLAG_MOVED).setSupportedUriSchemes(c0.c(URI_SCHEME)).build());
            this.phoneAccountHandle = phoneAccountHandle;
            Log.i$default(Log.INSTANCE, TAG, "Phone account registered", (Throwable) null, 4, (Object) null);
        } catch (Exception e10) {
            Log.INSTANCE.e(TAG, "Failed to register phone account", e10);
        }
    }

    @Override // com.discord.codegen.NativeTelecomModuleSpec
    public void addListener(@NotNull String eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
    }

    @Override // com.discord.codegen.NativeTelecomModuleSpec
    public void cancelIncomingCall(@NotNull String callId, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(Boolean.FALSE);
    }

    public final void emitCallAnswered$telecom_androidRelease(@NotNull String callId) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Log.i$default(Log.INSTANCE, TAG, e.l("Emitting telecom-incoming-call-answered: callId=", callId), (Throwable) null, 4, (Object) null);
        Function0<Unit> function0 = acceptIncomingCallHandler;
        if (function0 != null) {
            function0.invoke();
        }
        ReactEvents reactEvents = this.reactEvents;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        reactEvents.emitModuleEvent(reactApplicationContext, new TelecomIncomingCallAnsweredEvent(callId));
    }

    public final void emitCallRejected$telecom_androidRelease(@NotNull String callId) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Log.i$default(Log.INSTANCE, TAG, e.l("Emitting telecom-incoming-call-rejected: callId=", callId), (Throwable) null, 4, (Object) null);
        ReactEvents reactEvents = this.reactEvents;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        reactEvents.emitModuleEvent(reactApplicationContext, new TelecomIncomingCallRejectedEvent(callId));
        this.connections.remove(callId);
    }

    @Override // com.discord.codegen.NativeTelecomModuleSpec
    public void endCall(@NotNull String callId, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(promise, "promise");
        TelecomConnection telecomConnectionRemove = this.connections.remove(callId);
        if (telecomConnectionRemove != null) {
            telecomConnectionRemove.setDisconnected(new DisconnectCause(2));
            telecomConnectionRemove.destroy();
        }
        promise.resolve(Boolean.TRUE);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        instance = this;
        if (Build.VERSION.SDK_INT >= 26) {
            registerPhoneAccount();
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        if (instance == this) {
            instance = null;
        }
    }

    @Override // com.discord.codegen.NativeTelecomModuleSpec
    public void isAvailable(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(Boolean.valueOf(Build.VERSION.SDK_INT >= 26));
    }

    public final void onConnectionCreated$telecom_androidRelease(@NotNull String callId, @NotNull TelecomConnection connection) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.connections.put(callId, connection);
    }

    public final void onConnectionDisconnected$telecom_androidRelease(@NotNull String callId) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Log.i$default(Log.INSTANCE, TAG, e.l("Connection disconnected by framework: callId=", callId), (Throwable) null, 4, (Object) null);
        this.connections.remove(callId);
    }

    @Override // com.discord.codegen.NativeTelecomModuleSpec
    public void registerIncomingCall(@NotNull String callId, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (Build.VERSION.SDK_INT < 26) {
            promise.resolve(Boolean.FALSE);
            return;
        }
        PhoneAccountHandle phoneAccountHandle = this.phoneAccountHandle;
        if (phoneAccountHandle == null) {
            Log.e$default(Log.INSTANCE, TAG, e.l("Phone account not registered, cannot register incoming call: callId=", callId), (Throwable) null, 4, (Object) null);
            promise.resolve(Boolean.FALSE);
            return;
        }
        Object systemService = getReactApplicationContext().getSystemService("telecom");
        TelecomManager telecomManager = systemService instanceof TelecomManager ? (TelecomManager) systemService : null;
        if (telecomManager == null) {
            promise.resolve(Boolean.FALSE);
            return;
        }
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putString(EXTRA_CALL_ID, callId);
        bundle.putBundle("android.telecom.extra.INCOMING_CALL_EXTRAS", bundle2);
        try {
            telecomManager.addNewIncomingCall(phoneAccountHandle, bundle);
            Log.i$default(Log.INSTANCE, TAG, "Registered incoming call with telecom: callId=" + callId, (Throwable) null, 4, (Object) null);
            promise.resolve(Boolean.TRUE);
        } catch (SecurityException e10) {
            Log.INSTANCE.e(TAG, "MANAGE_OWN_CALLS permission missing", e10);
            promise.resolve(Boolean.FALSE);
        } catch (Exception e11) {
            Log.INSTANCE.e(TAG, "Failed to register incoming call: callId=" + callId, e11);
            promise.resolve(Boolean.FALSE);
        }
    }

    @Override // com.discord.codegen.NativeTelecomModuleSpec
    public void removeListeners(double count) {
    }

    @Override // com.discord.codegen.NativeTelecomModuleSpec
    public void reportIncomingCall(@NotNull String callId, @NotNull String callerName, ReadableMap options, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(callerName, "callerName");
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(Boolean.FALSE);
    }

    @Override // com.discord.codegen.NativeTelecomModuleSpec
    public void setCallActive(@NotNull String callId, boolean initialMicMuted) {
        Intrinsics.checkNotNullParameter(callId, "callId");
    }

    @Override // com.discord.codegen.NativeTelecomModuleSpec
    public void setIncomingCallActive(@NotNull String callId, boolean initialMicMuted) {
        Intrinsics.checkNotNullParameter(callId, "callId");
    }

    @Override // com.discord.codegen.NativeTelecomModuleSpec
    public void setMicMuted(@NotNull String callId, boolean isMuted) {
        Intrinsics.checkNotNullParameter(callId, "callId");
    }

    @Override // com.discord.codegen.NativeTelecomModuleSpec
    public void setScreenShareState(@NotNull String callId, boolean isEnabled, boolean isActivated) {
        Intrinsics.checkNotNullParameter(callId, "callId");
    }

    @Override // com.discord.codegen.NativeTelecomModuleSpec
    public void startCall(@NotNull String callId, ReadableMap options, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(Boolean.FALSE);
    }
}
