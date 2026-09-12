package com.discord.contact_sync;

import android.content.Intent;
import com.discord.contact_sync.react.ContactSyncSerializerKt;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\"\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u0016"}, d2 = {"Lcom/discord/contact_sync/ContactSyncManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "getConstants", "", "", "hasContactsPermissions", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "syncContacts", "blob", "phone", "callback", "Lcom/facebook/react/bridge/Callback;", "getImageForContactId", "deviceContactId", "contact_sync_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContactSyncManagerModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactSyncManagerModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @NotNull
    public Map<String, Object> getConstants() {
        return v0.b(new Pair("isContactSyncSupported", Boolean.valueOf(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.APP_CONTACTS").resolveActivity(getReactApplicationContext().getPackageManager()) != null)));
    }

    @ReactMethod
    public final void getImageForContactId(@NotNull String deviceContactId, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(deviceContactId, "deviceContactId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        ContactSyncSerializerKt.serializeGetImageForContactIdResult(reactApplicationContext, deviceContactId, callback);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "DCDContactSyncManager";
    }

    @ReactMethod
    public final void hasContactsPermissions(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        ContactSyncSerializerKt.serializeHasContactPermissionsResult(reactApplicationContext, promise);
    }

    @ReactMethod
    public final void syncContacts(String blob, @NotNull String phone, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        ContactSyncSerializerKt.serializeSyncContactResult(reactApplicationContext, callback);
    }
}
