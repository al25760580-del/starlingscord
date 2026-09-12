package com.discord.notifications.react;

import com.discord.notifications.client.NotificationClient;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.modules.dialog.AlertFragment;
import kotlin.Metadata;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0007H\u0007J(\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¨\u0006\u0016"}, d2 = {"Lcom/discord/notifications/react/PushNotificationCategoryModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "registerNotificationCategories", "", "localizedCategoryNames", "Lcom/facebook/react/bridge/ReadableMap;", "registerNotificationCategoriesAndGroups", "localizedGroupNames", "setIncomingRingtone", StackTraceHelper.NAME_KEY, "registerNotificationReplyCategories", AlertFragment.ARG_TITLE, "buttonTitle", "inputPlaceholder", "callback", "Lcom/facebook/react/bridge/Callback;", "notification_react_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PushNotificationCategoryModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationCategoryModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "DCDNotificationCategoryUtils";
    }

    @ReactMethod
    public final void registerNotificationCategories(@NotNull ReadableMap localizedCategoryNames) {
        Intrinsics.checkNotNullParameter(localizedCategoryNames, "localizedCategoryNames");
        NotificationClient companion = NotificationClient.INSTANCE.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        companion.initNotificationCategories(reactApplicationContext, NativeMapExtensionsKt.toStringMap(localizedCategoryNames), w0.d());
    }

    @ReactMethod
    public final void registerNotificationCategoriesAndGroups(@NotNull ReadableMap localizedCategoryNames, @NotNull ReadableMap localizedGroupNames) {
        Intrinsics.checkNotNullParameter(localizedCategoryNames, "localizedCategoryNames");
        Intrinsics.checkNotNullParameter(localizedGroupNames, "localizedGroupNames");
        NotificationClient companion = NotificationClient.INSTANCE.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        companion.initNotificationCategories(reactApplicationContext, NativeMapExtensionsKt.toStringMap(localizedCategoryNames), NativeMapExtensionsKt.toStringMap(localizedGroupNames));
    }

    @ReactMethod
    public final void registerNotificationReplyCategories(@NotNull String title, @NotNull String buttonTitle, @NotNull String inputPlaceholder, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(inputPlaceholder, "inputPlaceholder");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @ReactMethod
    public final void setIncomingRingtone(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        NotificationClient companion = NotificationClient.INSTANCE.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        companion.setIncomingRingtone(reactApplicationContext, name);
    }
}
