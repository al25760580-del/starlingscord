package com.discord.notifications.react;

import android.content.Context;
import androidx.lifecycle.r0;
import com.discord.cache.Cache;
import com.discord.notifications.client.NotificationClient;
import com.discord.notifications.react.PushNotificationModule;
import com.discord.notifications.react.events.LocalNotificationEvent;
import com.discord.notifications.react.events.NotificationEvent;
import com.discord.notifications.react.events.RegisterEvent;
import com.discord.notifications.renderer.NotificationRenderer;
import com.discord.notifications.service.NotificationService;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.v0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 .2\u00020\u0001:\u0001.B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tH\u0007J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\tH\u0007J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tH\u0007J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u001c\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0007J\b\u0010\u001a\u001a\u00020\u000bH\u0007J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020!H\u0007J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010#\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020!H\u0007J\u0010\u0010$\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020!H\u0007J\u0010\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020!H\u0007J\u0010\u0010(\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010)\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tH\u0007J\u0010\u0010*\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020,H\u0007J\b\u0010-\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/discord/notifications/react/PushNotificationModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "getName", "", "onRegisterNotificationToken", "", "handleDirectReplySuccess", "notificationString", "markNotificationAsDirectReply", "channelId", "registerEventListener", "type", "getInitialNotification", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "setCurrentUser", NotificationRenderer.USERNAME, "userId", "setMultiAccountUsernames", "usernamesJson", "clearAllNotifications", "presentLocalNotification", "details", "Lcom/facebook/react/bridge/ReadableMap;", "getSoundsEnabled", "setSoundsEnabled", ViewProps.ENABLED, "", "getVibrationsEnabled", "setVibrationsEnabled", "getLightsEnabled", "setLightsEnabled", "setNotifyEveryTime", "notifyEveryTime", "shouldNotifyEveryTime", "addListener", "removeListeners", "count", "", "updateAuthState", "Companion", "notification_react_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPushNotificationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushNotificationModule.kt\ncom/discord/notifications/react/PushNotificationModule\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n506#2,7:186\n465#2:193\n415#2:194\n1252#3,4:195\n*S KotlinDebug\n*F\n+ 1 PushNotificationModule.kt\ncom/discord/notifications/react/PushNotificationModule\n*L\n117#1:186,7\n118#1:193\n118#1:194\n118#1:195,4\n*E\n"})
public final class PushNotificationModule extends ReactContextBaseJavaModule {

    @NotNull
    private static final String EVENT_TYPE_NOTIFICATION = "notification";

    @NotNull
    private static final String EVENT_TYPE_NOTIFICATION_LOCAL = "localNotification";

    @NotNull
    private static final String EVENT_TYPE_REGISTER = "register";

    @NotNull
    private final ReactApplicationContext reactContext;

    @NotNull
    private final ReactEvents reactEvents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.reactEvents = new ReactEvents(new Pair(EVENT_TYPE_REGISTER, Reflection.getOrCreateKotlinClass(RegisterEvent.class)), new Pair(EVENT_TYPE_NOTIFICATION, Reflection.getOrCreateKotlinClass(NotificationEvent.class)), new Pair(EVENT_TYPE_NOTIFICATION_LOCAL, Reflection.getOrCreateKotlinClass(LocalNotificationEvent.class)));
        Context applicationContext = reactContext.getApplicationContext();
        NotificationService.Companion companion = NotificationService.INSTANCE;
        Intrinsics.checkNotNull(applicationContext);
        companion.init(applicationContext);
        NotificationClient.INSTANCE.getInstance().setShouldDisplayNotification(new r0(28, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(PushNotificationModule pushNotificationModule) {
        return pushNotificationModule.reactContext.getLifecycleState() != LifecycleState.RESUMED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerEventListener$lambda$2(PushNotificationModule pushNotificationModule, String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        pushNotificationModule.reactEvents.emitModuleEvent(pushNotificationModule.reactContext, new RegisterEvent(token));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerEventListener$lambda$3(PushNotificationModule pushNotificationModule, Map notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        pushNotificationModule.reactEvents.emitModuleEvent(pushNotificationModule.reactContext, new NotificationEvent(notification));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerEventListener$lambda$4(PushNotificationModule pushNotificationModule, Map notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        pushNotificationModule.reactEvents.emitModuleEvent(pushNotificationModule.reactContext, new LocalNotificationEvent(notification));
        return Unit.f14616a;
    }

    private final void updateAuthState() {
        boolean z5 = Cache.getToken$default(Cache.INSTANCE.get(), false, 1, null) != null;
        NotificationClient companion = NotificationClient.INSTANCE.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        companion.setIsAuthed(reactApplicationContext, z5);
    }

    @ReactMethod
    public final void addListener(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @ReactMethod
    public final void clearAllNotifications() {
        NotificationClient companion = NotificationClient.INSTANCE.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        companion.clearAllNotifications(reactApplicationContext);
    }

    @ReactMethod
    public final void getInitialNotification(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        Map<String, String> pendingNotification = NotificationClient.INSTANCE.getInstance().getPendingNotification();
        promise.resolve(pendingNotification != null ? NativeMapExtensionsKt.toNativeMap(pendingNotification) : null);
    }

    @ReactMethod
    public final void getLightsEnabled(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        NotificationClient companion = NotificationClient.INSTANCE.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        promise.resolve(Boolean.valueOf(companion.isLightsEnabled(reactApplicationContext)));
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "PushNotificationAndroid";
    }

    @ReactMethod
    public final void getSoundsEnabled(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        NotificationClient companion = NotificationClient.INSTANCE.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        promise.resolve(Boolean.valueOf(companion.isSoundsEnabled(reactApplicationContext)));
    }

    @ReactMethod
    public final void getVibrationsEnabled(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        NotificationClient companion = NotificationClient.INSTANCE.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        promise.resolve(Boolean.valueOf(companion.isVibrationsEnabled(reactApplicationContext)));
    }

    @ReactMethod
    public final void handleDirectReplySuccess(@NotNull String notificationString) {
        Intrinsics.checkNotNullParameter(notificationString, "notificationString");
        NotificationClient companion = NotificationClient.INSTANCE.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        companion.onDirectReplySuccess(reactApplicationContext, notificationString);
    }

    @ReactMethod
    public final void markNotificationAsDirectReply(@NotNull String channelId) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Long lA0 = StringsKt.a0(channelId);
        if (lA0 != null) {
            long jLongValue = lA0.longValue();
            NotificationClient companion = NotificationClient.INSTANCE.getInstance();
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            companion.markNotificationAsDirectReply(reactApplicationContext, jLongValue);
        }
    }

    @ReactMethod
    public final void onRegisterNotificationToken() {
        updateAuthState();
    }

    @ReactMethod
    public final void presentLocalNotification(@NotNull ReadableMap details) {
        Intrinsics.checkNotNullParameter(details, "details");
        HashMap<String, Object> hashMap = details.toHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(v0.a(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Object value = entry2.getValue();
            Intrinsics.checkNotNull(value);
            linkedHashMap2.put(key, value);
        }
        NotificationClient.INSTANCE.getInstance().showLocalNotification(this.reactContext, linkedHashMap2);
    }

    @ReactMethod
    public final void registerEventListener(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        int iHashCode = type.hashCode();
        if (iHashCode != -690213213) {
            if (iHashCode != -145165322) {
                if (iHashCode == 595233003 && type.equals(EVENT_TYPE_NOTIFICATION)) {
                    final int i7 = 1;
                    NotificationClient.INSTANCE.getInstance().setNotificationListener(new Function1(this) { // from class: g7.a

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ PushNotificationModule f9498e;

                        {
                            this.f9498e = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i7) {
                                case 0:
                                    return PushNotificationModule.registerEventListener$lambda$2(this.f9498e, (String) obj);
                                case 1:
                                    return PushNotificationModule.registerEventListener$lambda$3(this.f9498e, (Map) obj);
                                default:
                                    return PushNotificationModule.registerEventListener$lambda$4(this.f9498e, (Map) obj);
                            }
                        }
                    });
                    return;
                }
            } else if (type.equals(EVENT_TYPE_NOTIFICATION_LOCAL)) {
                final int i10 = 2;
                NotificationClient.INSTANCE.getInstance().setLocalNotificationListener(new Function1(this) { // from class: g7.a

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ PushNotificationModule f9498e;

                    {
                        this.f9498e = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i10) {
                            case 0:
                                return PushNotificationModule.registerEventListener$lambda$2(this.f9498e, (String) obj);
                            case 1:
                                return PushNotificationModule.registerEventListener$lambda$3(this.f9498e, (Map) obj);
                            default:
                                return PushNotificationModule.registerEventListener$lambda$4(this.f9498e, (Map) obj);
                        }
                    }
                });
                return;
            }
        } else if (type.equals(EVENT_TYPE_REGISTER)) {
            final int i11 = 0;
            NotificationClient.INSTANCE.getInstance().setTokenListener(new Function1(this) { // from class: g7.a

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ PushNotificationModule f9498e;

                {
                    this.f9498e = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i11) {
                        case 0:
                            return PushNotificationModule.registerEventListener$lambda$2(this.f9498e, (String) obj);
                        case 1:
                            return PushNotificationModule.registerEventListener$lambda$3(this.f9498e, (Map) obj);
                        default:
                            return PushNotificationModule.registerEventListener$lambda$4(this.f9498e, (Map) obj);
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("Unknown event type: ".concat(type));
    }

    @ReactMethod
    public final void removeListeners(int count) {
    }

    @ReactMethod
    public final void setCurrentUser(String username, String userId) {
        NotificationClient companion = NotificationClient.INSTANCE.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        companion.setCurrentUser(reactApplicationContext, username, userId);
    }

    @ReactMethod
    public final void setLightsEnabled(boolean enabled) {
        NotificationClient companion = NotificationClient.INSTANCE.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        companion.setLightsEnabled(reactApplicationContext, enabled);
    }

    @ReactMethod
    public final void setMultiAccountUsernames(String usernamesJson) {
        NotificationClient companion = NotificationClient.INSTANCE.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        companion.setMultiAccountUsernames(reactApplicationContext, usernamesJson);
    }

    @ReactMethod
    public final void setNotifyEveryTime(boolean notifyEveryTime) {
        NotificationClient companion = NotificationClient.INSTANCE.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        companion.setNotifyEveryTime(reactApplicationContext, notifyEveryTime);
    }

    @ReactMethod
    public final void setSoundsEnabled(boolean enabled) {
        NotificationClient companion = NotificationClient.INSTANCE.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        companion.setSoundsEnabled(reactApplicationContext, enabled);
    }

    @ReactMethod
    public final void setVibrationsEnabled(boolean enabled) {
        NotificationClient companion = NotificationClient.INSTANCE.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        companion.setVibrationsEnabled(reactApplicationContext, enabled);
    }

    @ReactMethod
    public final void shouldNotifyEveryTime(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        NotificationClient companion = NotificationClient.INSTANCE.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        promise.resolve(Boolean.valueOf(companion.shouldNotifyEveryTime(reactApplicationContext)));
    }
}
