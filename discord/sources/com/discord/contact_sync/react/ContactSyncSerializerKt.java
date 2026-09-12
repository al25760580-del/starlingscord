package com.discord.contact_sync.react;

import com.discord.contact_sync.ContactSyncBlobEntry;
import com.discord.contact_sync.ContactSyncPayloadEntry;
import com.discord.contact_sync.ContactSyncProvider;
import com.discord.permissions.NativePermissionManagerModule;
import com.discord.react.utilities.PromiseWrapper;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import n6.e;
import or.d;
import or.h0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import pr.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u001b\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u001c\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\f\u0010\f\u001a\u00020\r*\u00020\u000bH\u0002¨\u0006\u000e"}, d2 = {"serializeHasContactPermissionsResult", "", "Lcom/facebook/react/bridge/ReactContext;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/bridge/Promise;)Lkotlin/Unit;", "serializeSyncContactResult", "callback", "Lcom/facebook/react/bridge/Callback;", "serializeGetImageForContactIdResult", "deviceContactId", "", "mapResultToContactSyncPermission", "", "contact_sync_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContactSyncSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactSyncSerializer.kt\ncom/discord/contact_sync/react/ContactSyncSerializerKt\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n113#2:77\n113#2:82\n1563#3:78\n1634#3,3:79\n*S KotlinDebug\n*F\n+ 1 ContactSyncSerializer.kt\ncom/discord/contact_sync/react/ContactSyncSerializerKt\n*L\n34#1:77\n35#1:82\n36#1:78\n36#1:79,3\n*E\n"})
public final class ContactSyncSerializerKt {
    private static final int mapResultToContactSyncPermission(String str) {
        Locale locale = Locale.ROOT;
        String lowerCase = "AUTHORIZED".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.areEqual(str, lowerCase)) {
            return 1;
        }
        String lowerCase2 = "DENIED".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        Intrinsics.areEqual(str, lowerCase2);
        return 0;
    }

    public static final void serializeGetImageForContactIdResult(@NotNull ReactContext reactContext, @NotNull String deviceContactId, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(reactContext, "<this>");
        Intrinsics.checkNotNullParameter(deviceContactId, "deviceContactId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            callback.invoke(null, ContactSyncProvider.INSTANCE.getImageForContactId(reactContext, deviceContactId));
        } catch (SecurityException unused) {
            callback.invoke(Integer.valueOf(mapResultToContactSyncPermission("DENIED")), null);
        }
    }

    public static final Unit serializeHasContactPermissionsResult(@NotNull ReactContext reactContext, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "<this>");
        Intrinsics.checkNotNullParameter(promise, "promise");
        NativePermissionManagerModule nativePermissionManagerModule = (NativePermissionManagerModule) reactContext.getNativeModule(NativePermissionManagerModule.class);
        if (nativePermissionManagerModule == null) {
            return null;
        }
        nativePermissionManagerModule.hasContactAuthorization(new PromiseWrapper(promise, new e(7), null, 4, null));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object serializeHasContactPermissionsResult$lambda$0(Object obj) {
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            return Integer.valueOf(mapResultToContactSyncPermission(str));
        }
        return null;
    }

    public static final void serializeSyncContactResult(@NotNull ReactContext reactContext, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(reactContext, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Map<String, ContactSyncBlobEntry> contactsMap = ContactSyncProvider.INSTANCE.getContactsMap(reactContext);
            b bVar = Json.f14760d;
            bVar.getClass();
            String strC = bVar.c(new h0(s1.f17602a, ContactSyncBlobEntry.INSTANCE.serializer(), 1), contactsMap);
            Collection<ContactSyncBlobEntry> collectionValues = contactsMap.values();
            ArrayList arrayList = new ArrayList(e0.l(collectionValues, 10));
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                arrayList.add(new ContactSyncPayloadEntry(((ContactSyncBlobEntry) it.next()).getPhone()));
            }
            callback.invoke(null, strC, bVar.c(new d(ContactSyncPayloadEntry.INSTANCE.serializer(), 0), arrayList));
        } catch (SecurityException unused) {
            callback.invoke(Integer.valueOf(mapResultToContactSyncPermission("DENIED")), null, null);
        }
    }
}
