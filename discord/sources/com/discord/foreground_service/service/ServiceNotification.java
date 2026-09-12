package com.discord.foreground_service.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationChannelCompat;
import androidx.core.app.NotificationCompat$Builder;
import androidx.core.app.NotificationManagerCompat;
import com.discord.foreground_service.ForegroundService;
import com.discord.foreground_service.utils.ForegroundServiceUtilsKt;
import com.discord.notifications.actions.intents.GenericAction;
import com.discord.notifications.actions.intents.NotificationAction;
import com.discord.notifications.renderer.NotificationChannels;
import com.discord.notifications.renderer.R;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import x0.n;
import y0.b;
import zs.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u0011*\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u00020\t*\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u001a\u0010\u000bJ\u0011\u0010\u001b\u001a\u00020\t*\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0018\u0010%\u001a\u00020\"*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/discord/foreground_service/service/ServiceNotification;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;", "sortedConfigurations", "", "postNotifications", "(Landroid/content/Context;Ljava/util/List;)V", "serviceNotificationConfiguration", "Landroid/app/Notification;", "buildNotification", "(Landroid/content/Context;Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;)Landroid/app/Notification;", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Icon;", "", "toSmallIconResId", "(Lcom/discord/foreground_service/service/ServiceNotificationConfiguration$Icon;)I", "ensureForegroundNotificationChannelExists", "(Landroid/content/Context;)V", "Landroid/app/Service;", "serviceNotificationConfigurations", "startForegroundCompat", "(Landroid/app/Service;Landroid/content/Context;Ljava/util/List;)V", "updateNotifications", "clearNotifications", "FOREGROUND_NOTIFICATION_ID", "I", "", ServiceNotification.FOREGROUND_NOTIFICATION_TAG, "Ljava/lang/String;", "FOREGROUND_NOTIFICATION_LIMIT", "Landroidx/core/app/NotificationManagerCompat;", "getNotificationManagerCompat", "(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;", "notificationManagerCompat", "foreground_service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nServiceNotification.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceNotification.kt\ncom/discord/foreground_service/service/ServiceNotification\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,194:1\n1056#2:195\n1056#2:196\n1869#2,2:198\n1#3:197\n*S KotlinDebug\n*F\n+ 1 ServiceNotification.kt\ncom/discord/foreground_service/service/ServiceNotification\n*L\n30#1:195\n54#1:196\n124#1:198,2\n*E\n"})
public final class ServiceNotification {
    private static final int FOREGROUND_NOTIFICATION_ID = 8761;
    private static final int FOREGROUND_NOTIFICATION_LIMIT = 5;

    @NotNull
    private static final String FOREGROUND_NOTIFICATION_TAG = "FOREGROUND_NOTIFICATION_TAG";

    @NotNull
    public static final ServiceNotification INSTANCE = new ServiceNotification();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ServiceNotificationConfiguration.Icon.values().length];
            try {
                iArr[ServiceNotificationConfiguration.Icon.DEAFENED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ServiceNotificationConfiguration.Icon.MUTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ServiceNotificationConfiguration.Icon.SPEAKING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ServiceNotificationConfiguration.Icon.IDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ServiceNotificationConfiguration.Icon.DEFAULT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ServiceNotification() {
    }

    private final Notification buildNotification(Context context, ServiceNotificationConfiguration serviceNotificationConfiguration) {
        Context context2;
        PendingIntent pendingIntent$default;
        NotificationCompat$Builder notificationCompat$Builder = new NotificationCompat$Builder(context, NotificationChannels.MEDIA_CONNECTIONS_CHANNEL_ID);
        notificationCompat$Builder.f1487e = NotificationCompat$Builder.e(serviceNotificationConfiguration.getTitle());
        notificationCompat$Builder.f1488f = NotificationCompat$Builder.e(serviceNotificationConfiguration.getContent());
        ServiceNotificationConfiguration.Action contentAction = serviceNotificationConfiguration.getContentAction();
        if (contentAction != null) {
            pendingIntent$default = NotificationAction.DefaultImpls.toPendingIntent$default(new GenericAction(contentAction.getTag(), contentAction.getTaskName(), contentAction.getData()), context, 0, true, 2, null);
            context2 = context;
        } else {
            context2 = context;
            pendingIntent$default = null;
        }
        notificationCompat$Builder.f1490h = pendingIntent$default;
        notificationCompat$Builder.N.icon = toSmallIconResId(serviceNotificationConfiguration.getIcon());
        notificationCompat$Builder.g(2, true);
        notificationCompat$Builder.O = true;
        notificationCompat$Builder.g(8, true);
        Integer color = serviceNotificationConfiguration.getColor();
        if (color != null) {
            notificationCompat$Builder.D = color.intValue();
        }
        for (ServiceNotificationConfiguration.Action action : serviceNotificationConfiguration.getAuxiliaryActions()) {
            notificationCompat$Builder.a(0, NotificationAction.DefaultImpls.toPendingIntent$default(new GenericAction(action.getTag(), action.getTaskName(), action.getData()), context2, 0, false, 2, null), action.getTitle());
        }
        notificationCompat$Builder.C = a.f(new Pair(ForegroundService.EXTRA_PERMISSION_TYPE, Integer.valueOf(serviceNotificationConfiguration.getType().ordinal())));
        Notification notificationC = notificationCompat$Builder.c();
        Intrinsics.checkNotNullExpressionValue(notificationC, "build(...)");
        return notificationC;
    }

    private final void ensureForegroundNotificationChannelExists(Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        NotificationManagerCompat notificationManagerCompat = getNotificationManagerCompat(context);
        if (notificationManagerCompat.c(NotificationChannels.MEDIA_CONNECTIONS_CHANNEL_ID) != null) {
            return;
        }
        n nVar = new n(NotificationChannels.REALTIME_GROUP_ID);
        nVar.f22540b = NotificationChannels.REALTIME_GROUP_DEFAULT_NAME;
        notificationManagerCompat.a(c0.c(nVar));
        NotificationChannelCompat notificationChannelCompat = new NotificationChannelCompat.Builder(NotificationChannels.MEDIA_CONNECTIONS_CHANNEL_ID, 3).f1473a;
        notificationChannelCompat.f1462b = NotificationChannels.MEDIA_CONNECTIONS_DEFAULT_NAME;
        notificationChannelCompat.f1465e = NotificationChannels.REALTIME_GROUP_ID;
        notificationChannelCompat.f1466f = false;
        notificationChannelCompat.k = false;
        notificationChannelCompat.f1469i = false;
        notificationManagerCompat.b(c0.c(notificationChannelCompat));
    }

    private final NotificationManagerCompat getNotificationManagerCompat(Context context) {
        NotificationManagerCompat notificationManagerCompat = new NotificationManagerCompat(context);
        Intrinsics.checkNotNullExpressionValue(notificationManagerCompat, "from(...)");
        return notificationManagerCompat;
    }

    private final void postNotifications(Context context, List<ServiceNotificationConfiguration> sortedConfigurations) {
        boolean z5 = Build.VERSION.SDK_INT < 33 || b.a(context, "android.permission.POST_NOTIFICATIONS") == 0;
        NotificationManagerCompat notificationManagerCompat = getNotificationManagerCompat(context);
        if (z5) {
            notificationManagerCompat.g(null, FOREGROUND_NOTIFICATION_ID, buildNotification(context, (ServiceNotificationConfiguration) CollectionsKt.K(sortedConfigurations)));
        }
        List listF = CollectionsKt.F(1, sortedConfigurations);
        for (int i7 = 0; i7 < 6; i7++) {
            ServiceNotificationConfiguration serviceNotificationConfiguration = (ServiceNotificationConfiguration) CollectionsKt.M(i7, listF);
            if (serviceNotificationConfiguration == null) {
                notificationManagerCompat.f1518b.cancel(FOREGROUND_NOTIFICATION_TAG, i7);
            } else if (z5) {
                notificationManagerCompat.g(FOREGROUND_NOTIFICATION_TAG, i7, buildNotification(context, serviceNotificationConfiguration));
            }
        }
    }

    private final int toSmallIconResId(ServiceNotificationConfiguration.Icon icon) {
        int i7 = icon == null ? -1 : WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
        if (i7 != -1) {
            if (i7 == 1) {
                return R.drawable.ic_notification_headphones_slash_24dp;
            }
            if (i7 == 2) {
                return R.drawable.ic_notification_microphone_slash_24dp;
            }
            if (i7 == 3) {
                return R.drawable.ic_notification_speaking_24dp;
            }
            if (i7 == 4) {
                return R.drawable.ic_notification_microphone_24dp;
            }
            if (i7 != 5) {
                throw new rn.n();
            }
        }
        return R.drawable.ic_notification_24dp;
    }

    public final void clearNotifications(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        for (int i7 = 0; i7 < 6; i7++) {
            getNotificationManagerCompat(context).f1518b.cancel(FOREGROUND_NOTIFICATION_TAG, i7);
        }
    }

    public final void startForegroundCompat(@NotNull Service service, @NotNull Context context, @NotNull List<ServiceNotificationConfiguration> serviceNotificationConfigurations) {
        Intrinsics.checkNotNullParameter(service, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serviceNotificationConfigurations, "serviceNotificationConfigurations");
        ensureForegroundNotificationChannelExists(context);
        List<ServiceNotificationConfiguration> listE0 = CollectionsKt.e0(serviceNotificationConfigurations, new Comparator() { // from class: com.discord.foreground_service.service.ServiceNotification$startForegroundCompat$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t5, T t10) {
                return tn.a.a(((ServiceNotificationConfiguration) t5).getPriority(), ((ServiceNotificationConfiguration) t10).getPriority());
            }
        });
        ForegroundServiceUtilsKt.startForegroundCompat(service, context, FOREGROUND_NOTIFICATION_ID, buildNotification(context, (ServiceNotificationConfiguration) CollectionsKt.K(listE0)));
        postNotifications(context, listE0);
    }

    public final void updateNotifications(@NotNull Context context, @NotNull List<ServiceNotificationConfiguration> serviceNotificationConfigurations) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serviceNotificationConfigurations, "serviceNotificationConfigurations");
        postNotifications(context, CollectionsKt.e0(serviceNotificationConfigurations, new Comparator() { // from class: com.discord.foreground_service.service.ServiceNotification$updateNotifications$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t5, T t10) {
                return tn.a.a(((ServiceNotificationConfiguration) t5).getPriority(), ((ServiceNotificationConfiguration) t10).getPriority());
            }
        }));
    }
}
