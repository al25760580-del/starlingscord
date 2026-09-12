package com.discord.permissions;

import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import co.s;
import com.discord.chat.presentation.message.i;
import com.discord.crash_reporting.CrashReporting;
import com.discord.device.utils.IsTelecomBarAvailableKt;
import com.discord.lifecycle.AppLifecycle;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.PromiseWrapper;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = "NativePermissionManager")
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001@B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\rJ\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0016\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0017\u0010\rJ\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0018\u0010\rJ\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0019\u0010\rJ\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001a\u0010\rJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001b\u0010\rJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001c\u0010\rJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001d\u0010\rJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001e\u0010\rJ\u0015\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\rJ\u0015\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b \u0010\rJ\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b!\u0010\rJ\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010\rJ+\u0010%\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0#H\u0002¢\u0006\u0004\b%\u0010&J+\u0010(\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0#H\u0002¢\u0006\u0004\b(\u0010&J\u001f\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b*\u0010+J%\u0010.\u001a\u00020\u000b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060,2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010/J9\u00103\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0018\u00102\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b01H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\t2\u0006\u00105\u001a\u00020\u0006H\u0002¢\u0006\u0004\b6\u00107R&\u0010:\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t09088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lcom/discord/permissions/NativePermissionManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "", "requestCameraAuthorization", "(Lcom/facebook/react/bridge/Promise;)V", "requestMicrophoneAuthorization", "hasCameraAuthorization", "requestHeadsetCameraAuthorization", "hasHeadsetCameraAuthorization", "requestAvatarCameraAuthorization", "hasAvatarCameraAuthorization", "hasMicrophoneAuthorization", "hasPhotoAuthorization", "requestPhotoAuthorization", "hasContactAuthorization", "requestContactsAuthorization", "getNotificationAuthorizationStatus", "requestModifyAudioAuthorization", "hasModifyAudioAuthorization", "requestExternalStorageAuthorization", "hasExternalStorageAuthorization", "requestNotificationAuthorization", "requestForegroundServicePermissionVoiceCall", "requestForegroundServicePermissionFileUpload", "requestForegroundServicePermissionScreenShareWithMic", "requestForegroundServicePermissionPreU", "Lkotlin/Function1;", "withForegroundApp", "requireAppInForeground", "(Lcom/facebook/react/bridge/Promise;Lkotlin/jvm/functions/Function1;)V", "block", "requireForegroundOrTelecomBar", "permission", "requestPermissionWithDeduplication", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "", "permissions", "requestMultiplePermissionsWithDeduplication", "(Ljava/util/List;Lcom/facebook/react/bridge/Promise;)V", "key", "Lkotlin/Function2;", "makeRequest", "requestWithDeduplication", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;Lkotlin/jvm/functions/Function2;)V", "permissionKey", "createMultiPromiseResolver", "(Ljava/lang/String;)Lcom/facebook/react/bridge/Promise;", "", "", "pendingPermissionRequests", "Ljava/util/Map;", "Lcom/facebook/react/modules/permissions/PermissionsModule;", "getPermissionsModule", "()Lcom/facebook/react/modules/permissions/PermissionsModule;", "permissionsModule", "Companion", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNativePermissionManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativePermissionManagerModule.kt\ncom/discord/permissions/NativePermissionManagerModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,419:1\n1869#2,2:420\n*S KotlinDebug\n*F\n+ 1 NativePermissionManagerModule.kt\ncom/discord/permissions/NativePermissionManagerModule\n*L\n317#1:420,2\n*E\n"})
public final class NativePermissionManagerModule extends ReactContextBaseJavaModule {

    @NotNull
    private static final String AVATAR_CAMERA = "horizonos.permission.AVATAR_CAMERA";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String HEADSET_CAMERA = "horizonos.permission.HEADSET_CAMERA";

    @NotNull
    private final Map<String, List<Promise>> pendingPermissionRequests;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discord/permissions/NativePermissionManagerModule$Companion;", "", "<init>", "()V", "AVATAR_CAMERA", "", "HEADSET_CAMERA", "transformHasAuthorizationResult", "Lcom/discord/react/utilities/PromiseWrapper;", "Lcom/facebook/react/bridge/Promise;", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final PromiseWrapper transformHasAuthorizationResult(Promise promise) {
            return new PromiseWrapper(promise, new NativePermissionManagerModule$Companion$transformHasAuthorizationResult$1(NativePermissionStatus.INSTANCE), null, 4, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.discord.permissions.NativePermissionManagerModule$createMultiPromiseResolver$1, reason: invalid class name */
    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0005H\u0002J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J&\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J$\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J$\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016J0\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u0011"}, d2 = {"com/discord/permissions/NativePermissionManagerModule$createMultiPromiseResolver$1", "Lcom/facebook/react/bridge/Promise;", "executeOnAllPending", "", "action", "Lkotlin/Function1;", "resolve", "value", "", "reject", "code", "", "message", "throwable", "", "userInfo", "Lcom/facebook/react/bridge/WritableMap;", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nNativePermissionManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativePermissionManagerModule.kt\ncom/discord/permissions/NativePermissionManagerModule$createMultiPromiseResolver$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,419:1\n1869#2,2:420\n*S KotlinDebug\n*F\n+ 1 NativePermissionManagerModule.kt\ncom/discord/permissions/NativePermissionManagerModule$createMultiPromiseResolver$1\n*L\n332#1:420,2\n*E\n"})
    public static final class AnonymousClass1 implements Promise {
        final /* synthetic */ String $permissionKey;

        public AnonymousClass1(String str) {
            this.$permissionKey = str;
        }

        private final void executeOnAllPending(Function1<? super Promise, Unit> action) {
            Map map = NativePermissionManagerModule.this.pendingPermissionRequests;
            NativePermissionManagerModule nativePermissionManagerModule = NativePermissionManagerModule.this;
            String str = this.$permissionKey;
            synchronized (map) {
                List<Promise> list = (List) nativePermissionManagerModule.pendingPermissionRequests.remove(str);
                if (list == null) {
                    return;
                }
                for (Promise promise : list) {
                    try {
                        action.invoke(promise);
                    } catch (Exception e10) {
                        promise.reject("PROMISE_RESOLUTION_ERROR", "Failed to resolve promise: " + e10.getMessage(), e10);
                    }
                }
                Unit unit = Unit.f14616a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit reject$lambda$10(String str, String str2, WritableMap writableMap, Promise it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.reject(str, str2, writableMap);
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit reject$lambda$11(String str, Promise it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.reject(str);
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit reject$lambda$12(String str, String str2, Throwable th2, WritableMap writableMap, Promise it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.reject(str, str2, th2, writableMap);
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit reject$lambda$3(String str, String str2, Promise it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.reject(str, str2);
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit reject$lambda$4(String str, Throwable th2, Promise it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.reject(str, th2);
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit reject$lambda$5(String str, String str2, Throwable th2, Promise it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.reject(str, str2, th2);
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit reject$lambda$6(Throwable th2, Promise it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.reject(th2);
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit reject$lambda$7(Throwable th2, WritableMap writableMap, Promise it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.reject(th2, writableMap);
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit reject$lambda$8(String str, WritableMap writableMap, Promise it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.reject(str, writableMap);
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit reject$lambda$9(String str, Throwable th2, WritableMap writableMap, Promise it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.reject(str, th2, writableMap);
            return Unit.f14616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit resolve$lambda$2(Object obj, Promise it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.resolve(obj);
            return Unit.f14616a;
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(String code, String message) {
            executeOnAllPending(new b7.a(26, code, message));
        }

        @Override // com.facebook.react.bridge.Promise
        public void resolve(Object value) {
            executeOnAllPending(new s(20, value));
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(String code, Throwable throwable) {
            executeOnAllPending(new b7.a(27, code, throwable));
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(String code, String message, Throwable throwable) {
            executeOnAllPending(new com.discord.age_assurance.a(code, message, throwable, 10));
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            executeOnAllPending(new s(19, throwable));
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(Throwable throwable, WritableMap userInfo) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            Intrinsics.checkNotNullParameter(userInfo, "userInfo");
            executeOnAllPending(new b7.a(25, throwable, userInfo));
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(String code, WritableMap userInfo) {
            Intrinsics.checkNotNullParameter(userInfo, "userInfo");
            executeOnAllPending(new b7.a(28, code, userInfo));
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(String code, Throwable throwable, WritableMap userInfo) {
            Intrinsics.checkNotNullParameter(userInfo, "userInfo");
            executeOnAllPending(new com.discord.age_assurance.a(code, throwable, userInfo, 11));
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(String code, String message, WritableMap userInfo) {
            Intrinsics.checkNotNullParameter(userInfo, "userInfo");
            executeOnAllPending(new com.discord.age_assurance.a(code, message, userInfo, 9));
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            executeOnAllPending(new com.discord.chat.bridge.spoiler.a(message, 6));
        }

        @Override // com.facebook.react.bridge.Promise
        public void reject(String code, String message, Throwable throwable, WritableMap userInfo) {
            executeOnAllPending(new com.discord.media.engine.video.a(code, message, throwable, userInfo));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativePermissionManagerModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.pendingPermissionRequests = new LinkedHashMap();
    }

    private final Promise createMultiPromiseResolver(String permissionKey) {
        return new AnonymousClass1(permissionKey);
    }

    private final PermissionsModule getPermissionsModule() {
        NativeModule nativeModule = getReactApplicationContext().getNativeModule((Class<NativeModule>) PermissionsModule.class);
        Intrinsics.checkNotNull(nativeModule);
        return (PermissionsModule) nativeModule;
    }

    private final void requestForegroundServicePermissionPreU(Promise promise) {
        String lowerCase = "AUTHORIZED".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        promise.resolve(lowerCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestForegroundServicePermissionScreenShareWithMic$lambda$4(NativePermissionManagerModule nativePermissionManagerModule, Promise promise, Promise it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList arrayList = new ArrayList();
        if (y0.b.a(nativePermissionManagerModule.getReactApplicationContext(), "android.permission.RECORD_AUDIO") != 0) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (y0.b.a(nativePermissionManagerModule.getReactApplicationContext(), "android.permission.FOREGROUND_SERVICE_MICROPHONE") != 0) {
            arrayList.add("android.permission.FOREGROUND_SERVICE_MICROPHONE");
        }
        if (y0.b.a(nativePermissionManagerModule.getReactApplicationContext(), "android.permission.FOREGROUND_SERVICE_MEDIA_PROJECTION") != 0) {
            arrayList.add("android.permission.FOREGROUND_SERVICE_MEDIA_PROJECTION");
        }
        if (arrayList.isEmpty()) {
            String lowerCase = "AUTHORIZED".toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            promise.resolve(lowerCase);
        } else {
            nativePermissionManagerModule.requestMultiplePermissionsWithDeduplication(arrayList, promise);
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestForegroundServicePermissionVoiceCall$lambda$3(NativePermissionManagerModule nativePermissionManagerModule, Promise promise, Promise it) {
        Intrinsics.checkNotNullParameter(it, "it");
        nativePermissionManagerModule.requestMicrophoneAuthorization(NativePermissionPromise.INSTANCE.generate(new c6.a(15, nativePermissionManagerModule, promise), new com.discord.appreview.a(promise, 1)));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestForegroundServicePermissionVoiceCall$lambda$3$lambda$1(NativePermissionManagerModule nativePermissionManagerModule, Promise promise) {
        nativePermissionManagerModule.requireForegroundOrTelecomBar(promise, new a(nativePermissionManagerModule, promise, 2));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestForegroundServicePermissionVoiceCall$lambda$3$lambda$1$lambda$0(NativePermissionManagerModule nativePermissionManagerModule, Promise promise, Promise it) {
        Intrinsics.checkNotNullParameter(it, "it");
        nativePermissionManagerModule.requestPermissionWithDeduplication("android.permission.FOREGROUND_SERVICE_MICROPHONE", promise);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestForegroundServicePermissionVoiceCall$lambda$3$lambda$2(Promise promise) {
        CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "requestForegroundServicePermissionVoiceCall: Permission Rejected", null, null, null, false, 30, null);
        String lowerCase = "DENIED".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        promise.resolve(lowerCase);
        return Unit.f14616a;
    }

    private final void requestMultiplePermissionsWithDeduplication(List<String> permissions, Promise promise) {
        requestWithDeduplication(CollectionsKt.O(CollectionsKt.d0(permissions), ",", null, null, null, 62), promise, new i(4, this, permissions));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestMultiplePermissionsWithDeduplication$lambda$6(NativePermissionManagerModule nativePermissionManagerModule, List list, String str, Promise wrappedPromise) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(wrappedPromise, "wrappedPromise");
        nativePermissionManagerModule.getPermissionsModule().requestMultiplePermissions(NativeArrayExtensionsKt.toNativeArray$default(list, null, 1, null), wrappedPromise);
        return Unit.f14616a;
    }

    private final void requestPermissionWithDeduplication(String permission, Promise promise) {
        requestWithDeduplication(permission, promise, new com.discord.chat.input.views.a(5, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermissionWithDeduplication$lambda$5(NativePermissionManagerModule nativePermissionManagerModule, String key, Promise wrappedPromise) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(wrappedPromise, "wrappedPromise");
        nativePermissionManagerModule.getPermissionsModule().requestPermission(key, wrappedPromise);
        return Unit.f14616a;
    }

    private final void requestWithDeduplication(String key, Promise promise, Function2<? super String, ? super Promise, Unit> makeRequest) {
        synchronized (this.pendingPermissionRequests) {
            List<Promise> list = this.pendingPermissionRequests.get(key);
            if (list != null) {
                list.add(promise);
                return;
            }
            this.pendingPermissionRequests.put(key, d0.i(promise));
            try {
                makeRequest.invoke(key, new PromiseWrapper(createMultiPromiseResolver(key), new NativePermissionManagerModule$requestWithDeduplication$1$wrapperPromise$1(NativePermissionStatus.INSTANCE), null, 4, null));
                Unit unit = Unit.f14616a;
            } catch (Exception e10) {
                List<Promise> listRemove = this.pendingPermissionRequests.remove(key);
                if (listRemove == null) {
                    throw e10;
                }
                Iterator<T> it = listRemove.iterator();
                while (it.hasNext()) {
                    ((Promise) it.next()).reject("PERMISSION_REQUEST_ERROR", "Failed to request permission: " + e10.getMessage(), e10);
                }
                throw e10;
            }
        }
    }

    private final void requireAppInForeground(Promise promise, Function1<? super Promise, Unit> withForegroundApp) {
        if (AppLifecycle.INSTANCE.isForegrounded()) {
            withForegroundApp.invoke(promise);
            return;
        }
        String lowerCase = "DENIED".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        promise.resolve(lowerCase);
    }

    private final void requireForegroundOrTelecomBar(Promise promise, Function1<? super Promise, Unit> block) {
        if ((IsTelecomBarAvailableKt.isTelecomBarAvailable() && y0.b.a(getReactApplicationContext(), "android.permission.RECORD_AUDIO") == 0) || AppLifecycle.INSTANCE.isForegrounded()) {
            block.invoke(promise);
            return;
        }
        String lowerCase = "DENIED".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        promise.resolve(lowerCase);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "NativePermissionManager";
    }

    @ReactMethod
    public final void getNotificationAuthorizationStatus(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (new NotificationManagerCompat(getReactApplicationContext()).f1518b.areNotificationsEnabled()) {
            promise.resolve(2);
        } else {
            promise.resolve(1);
        }
    }

    @ReactMethod
    public final void hasAvatarCameraAuthorization(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        getPermissionsModule().checkPermission(AVATAR_CAMERA, INSTANCE.transformHasAuthorizationResult(promise));
    }

    @ReactMethod
    public final void hasCameraAuthorization(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        getPermissionsModule().checkPermission("android.permission.CAMERA", INSTANCE.transformHasAuthorizationResult(promise));
    }

    @ReactMethod
    public final void hasContactAuthorization(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        getPermissionsModule().checkPermission("android.permission.READ_CONTACTS", INSTANCE.transformHasAuthorizationResult(promise));
    }

    @ReactMethod
    public final void hasExternalStorageAuthorization(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        getPermissionsModule().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", INSTANCE.transformHasAuthorizationResult(promise));
    }

    @ReactMethod
    public final void hasHeadsetCameraAuthorization(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        getPermissionsModule().checkPermission(HEADSET_CAMERA, INSTANCE.transformHasAuthorizationResult(promise));
    }

    @ReactMethod
    public final void hasMicrophoneAuthorization(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        getPermissionsModule().checkPermission("android.permission.RECORD_AUDIO", INSTANCE.transformHasAuthorizationResult(promise));
    }

    @ReactMethod
    public final void hasModifyAudioAuthorization(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        getPermissionsModule().checkPermission("android.permission.MODIFY_AUDIO_SETTINGS", INSTANCE.transformHasAuthorizationResult(promise));
    }

    @ReactMethod
    public final void hasPhotoAuthorization(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (Build.VERSION.SDK_INT >= 33) {
            getPermissionsModule().checkPermission("android.permission.READ_MEDIA_IMAGES", INSTANCE.transformHasAuthorizationResult(promise));
        } else {
            getPermissionsModule().checkPermission("android.permission.READ_EXTERNAL_STORAGE", INSTANCE.transformHasAuthorizationResult(promise));
        }
    }

    @ReactMethod
    public final void requestAvatarCameraAuthorization(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        requestPermissionWithDeduplication(AVATAR_CAMERA, promise);
    }

    @ReactMethod
    public final void requestCameraAuthorization(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        requestPermissionWithDeduplication("android.permission.CAMERA", promise);
    }

    @ReactMethod
    public final void requestContactsAuthorization(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        requestPermissionWithDeduplication("android.permission.READ_CONTACTS", promise);
    }

    @ReactMethod
    public final void requestExternalStorageAuthorization(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        requestPermissionWithDeduplication("android.permission.WRITE_EXTERNAL_STORAGE", promise);
    }

    public final void requestForegroundServicePermissionFileUpload(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (Build.VERSION.SDK_INT >= 34) {
            requestPermissionWithDeduplication("android.permission.FOREGROUND_SERVICE_DATA_SYNC", promise);
        } else {
            requestForegroundServicePermissionPreU(promise);
        }
    }

    public final void requestForegroundServicePermissionScreenShareWithMic(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (Build.VERSION.SDK_INT >= 34) {
            requireAppInForeground(promise, new a(this, promise, 0));
        } else {
            requestForegroundServicePermissionVoiceCall(promise);
        }
    }

    public final void requestForegroundServicePermissionVoiceCall(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (Build.VERSION.SDK_INT >= 34) {
            requireForegroundOrTelecomBar(promise, new a(this, promise, 1));
        } else {
            requestForegroundServicePermissionPreU(promise);
        }
    }

    @ReactMethod
    public final void requestHeadsetCameraAuthorization(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        requestPermissionWithDeduplication(HEADSET_CAMERA, promise);
    }

    @ReactMethod
    public final void requestMicrophoneAuthorization(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        requestPermissionWithDeduplication("android.permission.RECORD_AUDIO", promise);
    }

    @ReactMethod
    public final void requestModifyAudioAuthorization(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        requestPermissionWithDeduplication("android.permission.MODIFY_AUDIO_SETTINGS", promise);
    }

    @ReactMethod
    public final void requestNotificationAuthorization(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (Build.VERSION.SDK_INT >= 33) {
            requestPermissionWithDeduplication("android.permission.POST_NOTIFICATIONS", promise);
            return;
        }
        String lowerCase = "AUTHORIZED".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        promise.resolve(lowerCase);
    }

    @ReactMethod
    public final void requestPhotoAuthorization(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            requestMultiplePermissionsWithDeduplication(d0.g("android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"), promise);
        } else if (i7 >= 33) {
            requestMultiplePermissionsWithDeduplication(d0.g("android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"), promise);
        } else {
            requestPermissionWithDeduplication("android.permission.READ_EXTERNAL_STORAGE", promise);
        }
    }
}
