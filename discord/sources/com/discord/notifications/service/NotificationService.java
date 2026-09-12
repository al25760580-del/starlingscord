package com.discord.notifications.service;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.discord.notifications.client.NotificationClient;
import com.discord.notifications.service.utils.FCMTokenHelper;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0017¨\u0006\u000e"}, d2 = {"Lcom/discord/notifications/service/NotificationService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "Lcom/discord/notifications/service/INotificationService;", "<init>", "()V", "onCreate", "", "onNewToken", "token", "", "onMessageReceived", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "Companion", "notification_service_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotificationService extends FirebaseMessagingService implements INotificationService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/discord/notifications/service/NotificationService$Companion;", "", "<init>", "()V", "init", "", "context", "Landroid/content/Context;", "notification_service_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void init(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            FCMTokenHelper.INSTANCE.getToken(new NotificationService$Companion$init$1(NotificationClient.INSTANCE.getInstance()));
        }

        private Companion() {
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        INotificationService.INSTANCE.setupTTI();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(@NotNull RemoteMessage remoteMessage) {
        long jLongValue;
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        NotificationClient companion = NotificationClient.INSTANCE.getInstance();
        e eVar = remoteMessage.f6541e;
        Bundle bundle = remoteMessage.f6540d;
        if (eVar == null) {
            e eVar2 = new e(0);
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        eVar2.put(str, str2);
                    }
                }
            }
            remoteMessage.f6541e = eVar2;
        }
        e eVar3 = remoteMessage.f6541e;
        Intrinsics.checkNotNullExpressionValue(eVar3, "getData(...)");
        Object obj2 = bundle.get("google.sent_time");
        if (obj2 instanceof Long) {
            jLongValue = ((Long) obj2).longValue();
        } else if (obj2 instanceof String) {
            try {
                jLongValue = Long.parseLong((String) obj2);
            } catch (NumberFormatException unused) {
                Log.w("FirebaseMessaging", "Invalid sent time: " + obj2);
                jLongValue = 0;
            }
        } else {
            jLongValue = 0;
        }
        companion.onNotificationReceived(this, eVar3, jLongValue);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        NotificationClient.INSTANCE.getInstance().setToken(token);
    }
}
