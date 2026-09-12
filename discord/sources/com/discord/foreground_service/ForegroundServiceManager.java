package com.discord.foreground_service;

import a3.e;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import c6.a;
import com.discord.chat.presentation.list.delegate.c;
import com.discord.foreground_service.service.ServiceNotification;
import com.discord.foreground_service.service.ServiceNotificationConfiguration;
import com.discord.foreground_service.utils.Log;
import com.discord.foreground_service.utils.Wakelocks;
import com.discord.lifecycle.ForegroundServiceStartGuard;
import com.discord.misc.utilities.intent.IntentUtilsKt;
import com.discord.notifications.actions.intents.GenericAction;
import com.discord.notifications.actions.intents.NotificationAction;
import com.discord.permissions.NativePermissionManagerModule;
import com.discord.permissions.NativePermissionPromise;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewProps;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.n;
import sn.i;
import y0.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u00017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\r\u0010\u001f\u001a\u00020\u0016H\u0000¢\u0006\u0002\b J#\u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0000¢\u0006\u0002\b&J\u0015\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u0006H\u0000¢\u0006\u0002\b)J\u0015\u0010*\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\"H\u0000¢\u0006\u0002\b+J\r\u0010,\u001a\u00020\u001aH\u0000¢\u0006\u0002\b-J\u0010\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\fH\u0002J\b\u00100\u001a\u00020\u001aH\u0002J\u0010\u00101\u001a\u00020\u001a2\u0006\u0010/\u001a\u000202H\u0002J\b\u00103\u001a\u00020\u001aH\u0002J\u0010\u00104\u001a\u00020\u001a2\u0006\u0010/\u001a\u000205H\u0002J\u0016\u00106\u001a\u00020\b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/discord/foreground_service/ForegroundServiceManager;", "", "<init>", "()V", "serviceRef", "Ljava/lang/ref/WeakReference;", "Landroid/app/Service;", "currentServiceType", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Type;", "serviceWakelocks", "Lcom/discord/foreground_service/utils/Wakelocks;", "currentOperation", "Lcom/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation;", "nextOperation", "telemetryData", "", "", "action", "detail", "operationKind", "configurationType", "guardAllowed", "", "guardReason", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Type;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/util/Map;", "handleIntent", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "isRunning", "isRunning$foreground_service_release", "onRequestServiceCreateOrUpdate", "Lcom/facebook/react/bridge/ReactApplicationContext;", "serviceConfigurations", "", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;", "onRequestServiceCreateOrUpdate$foreground_service_release", "onServiceCreatedOrUpdated", "foregroundService", "onServiceCreatedOrUpdated$foreground_service_release", "onRequestServiceDestroy", "onRequestServiceDestroy$foreground_service_release", "onServiceDestroyed", "onServiceDestroyed$foreground_service_release", "handleQueueOperation", "op", "handleNextOperation", "handleCreateOrUpdateService", "Lcom/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation$CreateOrUpdate;", "onCreateOrUpdateServiceFailed", "handleDestroyService", "Lcom/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation$Destroy;", "getTypeFromServiceConfigurationList", "ForegroundServiceOperation", "foreground_service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nForegroundServiceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForegroundServiceManager.kt\ncom/discord/foreground_service/ForegroundServiceManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NotificationAction.kt\ncom/discord/notifications/actions/intents/NotificationAction$Companion\n+ 4 IntentUtils.kt\ncom/discord/misc/utilities/intent/IntentUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,320:1\n1#2:321\n120#3,2:322\n123#3,2:325\n14#4:324\n1969#5,14:327\n*S KotlinDebug\n*F\n+ 1 ForegroundServiceManager.kt\ncom/discord/foreground_service/ForegroundServiceManager\n*L\n64#1:322,2\n64#1:325,2\n64#1:324\n303#1:327,14\n*E\n"})
public final class ForegroundServiceManager {

    @NotNull
    public static final ForegroundServiceManager INSTANCE = new ForegroundServiceManager();
    private static ForegroundServiceOperation currentOperation;
    private static ServiceNotificationConfiguration.Type currentServiceType;
    private static ForegroundServiceOperation nextOperation;
    private static WeakReference<Service> serviceRef;

    @NotNull
    private static final Wakelocks serviceWakelocks;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation;", "", "<init>", "()V", "CreateOrUpdate", "Destroy", "Lcom/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation$CreateOrUpdate;", "Lcom/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation$Destroy;", "foreground_service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ForegroundServiceOperation {

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation$CreateOrUpdate;", "Lcom/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation;", "contextRef", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "serviceConfigurations", "", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;", "<init>", "(Ljava/lang/ref/WeakReference;Ljava/util/List;)V", "getContextRef", "()Ljava/lang/ref/WeakReference;", "getServiceConfigurations", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "foreground_service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CreateOrUpdate extends ForegroundServiceOperation {

            @NotNull
            private final WeakReference<ReactApplicationContext> contextRef;

            @NotNull
            private final List<ServiceNotificationConfiguration> serviceConfigurations;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CreateOrUpdate(@NotNull WeakReference<ReactApplicationContext> contextRef, @NotNull List<ServiceNotificationConfiguration> serviceConfigurations) {
                super(null);
                Intrinsics.checkNotNullParameter(contextRef, "contextRef");
                Intrinsics.checkNotNullParameter(serviceConfigurations, "serviceConfigurations");
                this.contextRef = contextRef;
                this.serviceConfigurations = serviceConfigurations;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ CreateOrUpdate copy$default(CreateOrUpdate createOrUpdate, WeakReference weakReference, List list, int i7, Object obj) {
                if ((i7 & 1) != 0) {
                    weakReference = createOrUpdate.contextRef;
                }
                if ((i7 & 2) != 0) {
                    list = createOrUpdate.serviceConfigurations;
                }
                return createOrUpdate.copy(weakReference, list);
            }

            @NotNull
            public final WeakReference<ReactApplicationContext> component1() {
                return this.contextRef;
            }

            @NotNull
            public final List<ServiceNotificationConfiguration> component2() {
                return this.serviceConfigurations;
            }

            @NotNull
            public final CreateOrUpdate copy(@NotNull WeakReference<ReactApplicationContext> contextRef, @NotNull List<ServiceNotificationConfiguration> serviceConfigurations) {
                Intrinsics.checkNotNullParameter(contextRef, "contextRef");
                Intrinsics.checkNotNullParameter(serviceConfigurations, "serviceConfigurations");
                return new CreateOrUpdate(contextRef, serviceConfigurations);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CreateOrUpdate)) {
                    return false;
                }
                CreateOrUpdate createOrUpdate = (CreateOrUpdate) other;
                return Intrinsics.areEqual(this.contextRef, createOrUpdate.contextRef) && Intrinsics.areEqual(this.serviceConfigurations, createOrUpdate.serviceConfigurations);
            }

            @NotNull
            public final WeakReference<ReactApplicationContext> getContextRef() {
                return this.contextRef;
            }

            @NotNull
            public final List<ServiceNotificationConfiguration> getServiceConfigurations() {
                return this.serviceConfigurations;
            }

            public int hashCode() {
                return this.serviceConfigurations.hashCode() + (this.contextRef.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "CreateOrUpdate(contextRef=" + this.contextRef + ", serviceConfigurations=" + this.serviceConfigurations + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation$Destroy;", "Lcom/discord/foreground_service/ForegroundServiceManager$ForegroundServiceOperation;", "contextRef", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Ljava/lang/ref/WeakReference;)V", "getContextRef", "()Ljava/lang/ref/WeakReference;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "foreground_service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Destroy extends ForegroundServiceOperation {

            @NotNull
            private final WeakReference<ReactApplicationContext> contextRef;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Destroy(@NotNull WeakReference<ReactApplicationContext> contextRef) {
                super(null);
                Intrinsics.checkNotNullParameter(contextRef, "contextRef");
                this.contextRef = contextRef;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Destroy copy$default(Destroy destroy, WeakReference weakReference, int i7, Object obj) {
                if ((i7 & 1) != 0) {
                    weakReference = destroy.contextRef;
                }
                return destroy.copy(weakReference);
            }

            @NotNull
            public final WeakReference<ReactApplicationContext> component1() {
                return this.contextRef;
            }

            @NotNull
            public final Destroy copy(@NotNull WeakReference<ReactApplicationContext> contextRef) {
                Intrinsics.checkNotNullParameter(contextRef, "contextRef");
                return new Destroy(contextRef);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Destroy) && Intrinsics.areEqual(this.contextRef, ((Destroy) other).contextRef);
            }

            @NotNull
            public final WeakReference<ReactApplicationContext> getContextRef() {
                return this.contextRef;
            }

            public int hashCode() {
                return this.contextRef.hashCode();
            }

            @NotNull
            public String toString() {
                return "Destroy(contextRef=" + this.contextRef + ")";
            }
        }

        public /* synthetic */ ForegroundServiceOperation(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ForegroundServiceOperation() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ServiceNotificationConfiguration.Type.values().length];
            try {
                iArr[ServiceNotificationConfiguration.Type.FILE_UPLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ServiceNotificationConfiguration.Type.VOICE_CALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ServiceNotificationConfiguration.Type.SCREEN_SHARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("ForegroundServiceManager", "getSimpleName(...)");
        serviceWakelocks = new Wakelocks("ForegroundServiceManager", 0L, 2, null);
    }

    private ForegroundServiceManager() {
    }

    private final ServiceNotificationConfiguration.Type getTypeFromServiceConfigurationList(List<ServiceNotificationConfiguration> serviceConfigurations) {
        Iterator<T> it = serviceConfigurations.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            int iOrdinal = ((ServiceNotificationConfiguration) next).getType().ordinal();
            do {
                Object next2 = it.next();
                int iOrdinal2 = ((ServiceNotificationConfiguration) next2).getType().ordinal();
                if (iOrdinal < iOrdinal2) {
                    next = next2;
                    iOrdinal = iOrdinal2;
                }
            } while (it.hasNext());
        }
        return ((ServiceNotificationConfiguration) next).getType();
    }

    private final void handleCreateOrUpdateService(ForegroundServiceOperation.CreateOrUpdate op2) {
        ReactApplicationContext reactApplicationContext = op2.getContextRef().get();
        if (reactApplicationContext == null) {
            return;
        }
        ServiceNotificationConfiguration.Type typeFromServiceConfigurationList = getTypeFromServiceConfigurationList(op2.getServiceConfigurations());
        ForegroundServiceStartGuard.Result resultEvaluate$default = ForegroundServiceStartGuard.evaluate$default(ForegroundServiceStartGuard.INSTANCE, 0L, 1, null);
        Log log = Log.INSTANCE;
        Log.i$foreground_service_release$default(log, "ForegroundService operation requested", telemetryData(ViewProps.START, "create_or_update", "create_or_update", typeFromServiceConfigurationList, Boolean.valueOf(resultEvaluate$default.getAllowed()), resultEvaluate$default.getReason()), null, 4, null);
        WeakReference<Service> weakReference = serviceRef;
        Service service = weakReference != null ? weakReference.get() : null;
        if (service != null && currentServiceType == typeFromServiceConfigurationList) {
            Log.i$foreground_service_release$default(log, e.l("Service already running, updating with configuration type ", typeFromServiceConfigurationList.name()), telemetryData(ViewProps.START, "service_already_running", "create_or_update", typeFromServiceConfigurationList, Boolean.valueOf(resultEvaluate$default.getAllowed()), resultEvaluate$default.getReason()), null, 4, null);
            ServiceNotification.INSTANCE.updateNotifications(service, op2.getServiceConfigurations());
            handleNextOperation();
            return;
        }
        PromiseImpl promiseImplGenerate = NativePermissionPromise.INSTANCE.generate(new c(typeFromServiceConfigurationList, resultEvaluate$default, reactApplicationContext, 1), new a(14, typeFromServiceConfigurationList, resultEvaluate$default));
        NativeModule nativeModule = reactApplicationContext.getNativeModule((Class<NativeModule>) NativePermissionManagerModule.class);
        Intrinsics.checkNotNull(nativeModule);
        NativePermissionManagerModule nativePermissionManagerModule = (NativePermissionManagerModule) nativeModule;
        int i7 = WhenMappings.$EnumSwitchMapping$0[typeFromServiceConfigurationList.ordinal()];
        if (i7 == 1) {
            nativePermissionManagerModule.requestForegroundServicePermissionFileUpload(promiseImplGenerate);
        } else if (i7 == 2) {
            nativePermissionManagerModule.requestForegroundServicePermissionVoiceCall(promiseImplGenerate);
        } else {
            if (i7 != 3) {
                throw new n();
            }
            nativePermissionManagerModule.requestForegroundServicePermissionScreenShareWithMic(promiseImplGenerate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleCreateOrUpdateService$lambda$6(ServiceNotificationConfiguration.Type type, ForegroundServiceStartGuard.Result result, ReactApplicationContext reactApplicationContext) {
        Log.i$foreground_service_release$default(Log.INSTANCE, e.l("Create or update service with configuration type ", type.name()), INSTANCE.telemetryData(ViewProps.START, "permission_granted", "create_or_update", type, Boolean.valueOf(result.getAllowed()), result.getReason()), null, 4, null);
        ForegroundService.INSTANCE.start(reactApplicationContext, new b7.a(21, type, result));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleCreateOrUpdateService$lambda$6$lambda$5(ServiceNotificationConfiguration.Type type, ForegroundServiceStartGuard.Result result, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log log = Log.INSTANCE;
        ForegroundServiceManager foregroundServiceManager = INSTANCE;
        log.w$foreground_service_release("Unable to start service", foregroundServiceManager.telemetryData(ViewProps.START, "start_failed", "create_or_update", type, Boolean.valueOf(result.getAllowed()), result.getReason()), e10);
        foregroundServiceManager.onCreateOrUpdateServiceFailed();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleCreateOrUpdateService$lambda$7(ServiceNotificationConfiguration.Type type, ForegroundServiceStartGuard.Result result) {
        Log log = Log.INSTANCE;
        ForegroundServiceManager foregroundServiceManager = INSTANCE;
        Log.w$foreground_service_release$default(log, "Couldn't start ForegroundService", foregroundServiceManager.telemetryData(ViewProps.START, "permission_rejected", "create_or_update", type, Boolean.valueOf(result.getAllowed()), result.getReason()), null, 4, null);
        foregroundServiceManager.onCreateOrUpdateServiceFailed();
        return Unit.f14616a;
    }

    private final void handleDestroyService(ForegroundServiceOperation.Destroy op2) {
        ReactApplicationContext reactApplicationContext = op2.getContextRef().get();
        if (reactApplicationContext == null) {
            Log.i$foreground_service_release$default(Log.INSTANCE, "handleDestroyService context is null.", telemetryData$default(this, "destroy_skipped", "context_null", "destroy", null, null, null, 56, null), null, 4, null);
            return;
        }
        WeakReference<Service> weakReference = serviceRef;
        Service service = weakReference != null ? weakReference.get() : null;
        if (service == null) {
            Log.i$foreground_service_release$default(Log.INSTANCE, "handleDestroyService service is null.", telemetryData$default(this, "destroy_skipped", "service_null", "destroy", null, null, null, 56, null), null, 4, null);
            handleNextOperation();
        } else {
            Log.i$foreground_service_release$default(Log.INSTANCE, "ForegroundService stop requested", telemetryData$default(this, "stop", "destroy", "destroy", null, null, null, 56, null), null, 4, null);
            ForegroundService.INSTANCE.stop(reactApplicationContext, service);
        }
    }

    private final void handleNextOperation() {
        ForegroundServiceOperation foregroundServiceOperation = nextOperation;
        currentOperation = foregroundServiceOperation;
        nextOperation = null;
        if (foregroundServiceOperation != null) {
            if (foregroundServiceOperation instanceof ForegroundServiceOperation.CreateOrUpdate) {
                INSTANCE.handleCreateOrUpdateService((ForegroundServiceOperation.CreateOrUpdate) foregroundServiceOperation);
            } else {
                if (!(foregroundServiceOperation instanceof ForegroundServiceOperation.Destroy)) {
                    throw new n();
                }
                INSTANCE.handleDestroyService((ForegroundServiceOperation.Destroy) foregroundServiceOperation);
            }
        }
    }

    private final void handleQueueOperation(ForegroundServiceOperation op2) {
        nextOperation = op2;
        if (currentOperation == null) {
            handleNextOperation();
        }
    }

    private final void onCreateOrUpdateServiceFailed() {
        handleNextOperation();
    }

    private final Map<String, Object> telemetryData(String action, String detail, String operationKind, ServiceNotificationConfiguration.Type configurationType, Boolean guardAllowed, String guardReason) {
        i builder = new i();
        String name = ForegroundService.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        builder.put("service_name", name);
        builder.put("action", action);
        builder.put("detail", detail);
        builder.put("fgs_operation", operationKind);
        if (configurationType != null) {
            builder.put("fgs_configuration_type", configurationType.name());
        }
        if (guardAllowed != null) {
            builder.put("guard_allowed", guardAllowed);
        }
        if (guardReason != null) {
            builder.put("fgs_guard_reason", guardReason);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    public static /* synthetic */ Map telemetryData$default(ForegroundServiceManager foregroundServiceManager, String str, String str2, String str3, ServiceNotificationConfiguration.Type type, Boolean bool, String str4, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            type = null;
        }
        if ((i7 & 16) != 0) {
            bool = null;
        }
        if ((i7 & 32) != 0) {
            str4 = null;
        }
        return foregroundServiceManager.telemetryData(str, str2, str3, type, bool, str4);
    }

    public final void handleIntent(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (NotificationAction.INSTANCE.hasTrustedActivityToken(intent)) {
            GenericAction genericAction = (GenericAction) (IntentUtilsKt.hasExtra(intent, Reflection.getOrCreateKotlinClass(GenericAction.class)) ? (NotificationAction) ((Parcelable) d.b(intent, "action_intent_arg_key", GenericAction.class)) : null);
            if (genericAction != null) {
                genericAction.onNotificationAction(context, false);
            }
        }
    }

    public final synchronized boolean isRunning$foreground_service_release() {
        WeakReference<Service> weakReference;
        weakReference = serviceRef;
        return (weakReference != null ? weakReference.get() : null) != null;
    }

    public final synchronized void onRequestServiceCreateOrUpdate$foreground_service_release(@NotNull ReactApplicationContext context, @NotNull List<ServiceNotificationConfiguration> serviceConfigurations) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serviceConfigurations, "serviceConfigurations");
        handleQueueOperation(new ForegroundServiceOperation.CreateOrUpdate(new WeakReference(context), serviceConfigurations));
    }

    public final synchronized void onRequestServiceDestroy$foreground_service_release(@NotNull ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        handleQueueOperation(new ForegroundServiceOperation.Destroy(new WeakReference(context)));
    }

    public final synchronized void onServiceCreatedOrUpdated$foreground_service_release(@NotNull Service foregroundService) {
        Throwable th2;
        ForegroundServiceOperation.CreateOrUpdate createOrUpdate;
        try {
            try {
                Intrinsics.checkNotNullParameter(foregroundService, "foregroundService");
                ForegroundServiceOperation foregroundServiceOperation = currentOperation;
                if (foregroundServiceOperation instanceof ForegroundServiceOperation.CreateOrUpdate) {
                    try {
                        createOrUpdate = (ForegroundServiceOperation.CreateOrUpdate) foregroundServiceOperation;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } else {
                    createOrUpdate = null;
                }
                if (createOrUpdate == null) {
                    return;
                }
                try {
                    Log.i$foreground_service_release$default(Log.INSTANCE, "On service created or updated.", telemetryData$default(this, "service_created_or_updated", "lifecycle_callback", "create_or_update", null, null, null, 56, null), null, 4, null);
                    serviceRef = new WeakReference<>(foregroundService);
                    currentServiceType = getTypeFromServiceConfigurationList(createOrUpdate.getServiceConfigurations());
                    serviceWakelocks.acquire(foregroundService);
                    ServiceNotification.INSTANCE.startForegroundCompat(foregroundService, foregroundService, createOrUpdate.getServiceConfigurations());
                    handleNextOperation();
                    return;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
        th2 = th;
        throw th2;
    }

    public final synchronized void onServiceDestroyed$foreground_service_release() {
        try {
            try {
                try {
                    Log.i$foreground_service_release$default(Log.INSTANCE, "On service destroyed.", telemetryData$default(this, "service_destroyed", "lifecycle_callback", "destroy", null, null, null, 56, null), null, 4, null);
                    serviceWakelocks.release();
                    serviceRef = null;
                    currentServiceType = null;
                    handleNextOperation();
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
