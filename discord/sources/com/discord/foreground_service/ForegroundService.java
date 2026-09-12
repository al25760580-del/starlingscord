package com.discord.foreground_service;

import a1.k;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.discord.crash_reporting.CrashReporting;
import com.discord.foreground_service.service.ServiceNotification;
import com.discord.foreground_service.utils.ForegroundServiceUtilsKt;
import com.discord.foreground_service.utils.Log;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import com.discord.tti_manager.TTIModule;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J!\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/discord/foreground_service/ForegroundService;", "Landroid/app/Service;", "<init>", "()V", "onCreate", "", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", "startId", "onDestroy", "onBind", "", "onTimeout", "fgsType", "captureTimeoutException", "(ILjava/lang/Integer;)V", "Companion", "foreground_service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ForegroundService extends Service {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EXTRA_PERMISSION_TYPE = "permissionType";
    private static final long MINIMUM_SERVICE_LIFETIME = 3000;
    private static long lastServiceStartTime;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0011\u001a\u0012\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\nR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/discord/foreground_service/ForegroundService$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/app/Service;", "service", "", "stopInternal", "(Landroid/content/Context;Landroid/app/Service;)V", "Landroid/content/Intent;", "getServiceIntent", "(Landroid/content/Context;)Landroid/content/Intent;", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onError", ViewProps.START, "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "stop", "", "MINIMUM_SERVICE_LIFETIME", "J", "lastServiceStartTime", "", "EXTRA_PERMISSION_TYPE", "Ljava/lang/String;", "foreground_service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Intent getServiceIntent(Context context) {
            return new Intent(context, (Class<?>) ForegroundService.class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void stop$lambda$0(Context context, Service service) {
            ForegroundService.INSTANCE.stopInternal(context, service);
        }

        private final void stopInternal(Context context, Service service) {
            Log.i$foreground_service_release$default(Log.INSTANCE, "ForegroundService stopForeground called", w0.g(new Pair("service_name", ForegroundService.class.getName()), new Pair("action", "stop_foreground"), new Pair("detail", "remove_notification"), new Pair("fgs_operation", "destroy")), null, 4, null);
            service.stopForeground(1);
            service.stopSelf();
            ServiceNotification.INSTANCE.clearNotifications(context);
        }

        public final void start(@NotNull Context context, @NotNull Function1<? super Exception, Unit> onError) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(onError, "onError");
            try {
                ForegroundServiceUtilsKt.startForegroundServiceCompat(context, getServiceIntent(context));
                ForegroundService.lastServiceStartTime = System.currentTimeMillis();
            } catch (Exception e10) {
                onError.invoke(e10);
            }
        }

        public final void stop(@NotNull Context context, @NotNull Service service) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(service, "service");
            long jCurrentTimeMillis = System.currentTimeMillis() - ForegroundService.lastServiceStartTime;
            if (jCurrentTimeMillis > ForegroundService.MINIMUM_SERVICE_LIFETIME) {
                stopInternal(context, service);
            } else {
                ThreadUtilsKt.getUiHandler().postDelayed(new k(14, context, service), ForegroundService.MINIMUM_SERVICE_LIFETIME - jCurrentTimeMillis);
            }
        }

        private Companion() {
        }
    }

    private final void captureTimeoutException(int startId, Integer fgsType) {
        String foregroundServiceTypeString;
        CrashReporting crashReporting = CrashReporting.INSTANCE;
        if (fgsType == null || (foregroundServiceTypeString = ForegroundServiceUtilsKt.toForegroundServiceTypeString(fgsType.intValue())) == null) {
            foregroundServiceTypeString = "null";
        }
        CrashReporting.captureException$default(crashReporting, new Exception("ForegroundService has timed out. startId: " + startId + ", type: " + foregroundServiceTypeString), false, 2, null);
    }

    public static /* synthetic */ void captureTimeoutException$default(ForegroundService foregroundService, int i7, Integer num, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        foregroundService.captureTimeoutException(i7, num);
    }

    @Override // android.app.Service
    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return (IBinder) onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT < 28) {
            TTIModule.INSTANCE.markServiceInstantiation();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        ForegroundServiceManager.INSTANCE.onServiceDestroyed$foreground_service_release();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i$foreground_service_release$default(Log.INSTANCE, "onStartCommand: intent " + intent + ", flags " + flags + ", startId " + startId, w0.g(new Pair("service_name", ForegroundService.class.getName()), new Pair("action", "on_start_command"), new Pair("detail", "lifecycle_callback"), new Pair("fgs_operation", "create_or_update")), null, 4, null);
        ForegroundServiceManager.INSTANCE.onServiceCreatedOrUpdated$foreground_service_release(this);
        return 1;
    }

    @Override // android.app.Service
    public void onTimeout(int startId) {
        super.onTimeout(startId);
        stopSelf();
        captureTimeoutException$default(this, startId, null, 2, null);
    }

    @Override // android.app.Service
    @NotNull
    public Void onBind(Intent intent) {
        throw new IllegalStateException("bindService is not supported. Use startForegroundServiceCompat");
    }

    public void onTimeout(int startId, int fgsType) {
        super.onTimeout(startId, fgsType);
        stopSelf();
        captureTimeoutException(startId, Integer.valueOf(fgsType));
    }
}
