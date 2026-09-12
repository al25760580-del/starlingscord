package com.discord.notifications.renderer.utils;

import a3.e;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat$Builder;
import androidx.core.app.NotificationCompat$MessagingStyle;
import androidx.core.app.NotificationManagerCompat;
import com.discord.notifications.api.NotificationData;
import com.discord.notifications.renderer.NotificationBehaviors;
import com.discord.primitives.ChannelId;
import com.discord.theme.R;
import com.discord.theme.utils.ColorUtilsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a1;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.m;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import rn.q;
import rn.r;
import x0.c0;
import x0.v0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0012\u001a\u00020\u0013*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0000\u001a&\u0010\u0017\u001a\u00020\u0018*\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u0001H\u0001\u001a\u0014\u0010\u001c\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0015H\u0000\u001a\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u000f*\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0015H\u0000\u001a$\u0010\u001e\u001a\u0012\u0012\f\u0012\n !*\u0004\u0018\u00010 0 \u0018\u00010\u001f*\u00020\u00062\u0006\u0010\"\u001a\u00020\u0015H\u0001\u001a+\u0010#\u001a\u0012\u0012\f\u0012\n !*\u0004\u0018\u00010 0 \u0018\u00010\u001f*\u00020\u00062\u0006\u0010\"\u001a\u00020$H\u0001¢\u0006\u0004\b%\u0010&\u001a(\u0010'\u001a\u00020\u0013*\u00020\u00132\u0006\u0010(\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\t\u001a\u00020\n*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006-"}, d2 = {"NOTIFICATION_LIGHT_PERIOD", "", "messageRegex", "Lkotlin/text/Regex;", "notificationManager", "Landroid/app/NotificationManager;", "Landroid/content/Context;", "getNotificationManager", "(Landroid/content/Context;)Landroid/app/NotificationManager;", "notificationManagerCompat", "Landroidx/core/app/NotificationManagerCompat;", "getNotificationManagerCompat", "(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;", "messagingStyle", "Landroidx/core/app/NotificationCompat$MessagingStyle;", "Landroid/app/Notification;", "getMessagingStyle", "(Landroid/app/Notification;)Landroidx/core/app/NotificationCompat$MessagingStyle;", "getNotificationBuilderOrCreate", "Landroidx/core/app/NotificationCompat$Builder;", "notificationChannelId", "", "notificationExisting", "notify", "", "tag", "notificationBuilder", "additionalFlags", "getActiveNotificationMessageCount", "getActiveNotification", "getActiveReactionNotifications", "", "Landroid/service/notification/StatusBarNotification;", "kotlin.jvm.PlatformType", "channelId", "getCallNotifications", "Lcom/discord/primitives/ChannelId;", "getCallNotifications-mJqaSGE", "(Landroid/content/Context;J)Ljava/util/List;", "setLegacyNotificationBehaviors", "context", "behaviors", "Lcom/discord/notifications/renderer/NotificationBehaviors;", "sound", "Landroid/net/Uri;", "notification_renderer_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNotificationManagerUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationManagerUtils.kt\ncom/discord/notifications/renderer/utils/NotificationManagerUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,121:1\n1#2:122\n1310#3,2:123\n3829#3:125\n4344#3,2:126\n3829#3:128\n4344#3,2:129\n*S KotlinDebug\n*F\n+ 1 NotificationManagerUtils.kt\ncom/discord/notifications/renderer/utils/NotificationManagerUtilsKt\n*L\n58#1:123,2\n66#1:125\n66#1:126,2\n81#1:128\n81#1:129,2\n*E\n"})
public final class NotificationManagerUtilsKt {
    private static final int NOTIFICATION_LIGHT_PERIOD = 1500;

    @NotNull
    private static final Regex messageRegex = new Regex("/channels/(\\d+|@me)(?:/)(\\d+)(?:/)(\\d+)");

    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    public static final Notification getActiveNotification(@NotNull Context context, @NotNull String tag) {
        Object objO;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        NotificationManager notificationManager = getNotificationManager(context);
        if (notificationManager == null) {
            return null;
        }
        try {
            q qVar = Result.f14614e;
            objO = notificationManager.getActiveNotifications();
        } catch (Throwable th2) {
            q qVar2 = Result.f14614e;
            objO = ib.a.o(th2);
        }
        if (objO instanceof r) {
            objO = null;
        }
        StatusBarNotification[] statusBarNotificationArr = (StatusBarNotification[]) objO;
        if (statusBarNotificationArr == null) {
            return null;
        }
        for (StatusBarNotification statusBarNotification : statusBarNotificationArr) {
            if (Intrinsics.areEqual(statusBarNotification.getTag(), tag)) {
                if (statusBarNotification != null) {
                    return statusBarNotification.getNotification();
                }
                return null;
            }
        }
        statusBarNotification = null;
        if (statusBarNotification != null) {
            return statusBarNotification.getNotification();
        }
        return null;
    }

    public static final int getActiveNotificationMessageCount(@NotNull Context context, @NotNull String tag) {
        NotificationCompat$MessagingStyle messagingStyle;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Notification activeNotification = getActiveNotification(context, tag);
        if (activeNotification == null || (messagingStyle = getMessagingStyle(activeNotification)) == null || (arrayList = messagingStyle.f1507e) == null) {
            return 0;
        }
        return arrayList.size();
    }

    public static final List<StatusBarNotification> getActiveReactionNotifications(@NotNull Context context, @NotNull String channelId) {
        Object objO;
        List listA;
        Collection collectionA;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        NotificationManager notificationManager = getNotificationManager(context);
        if (notificationManager == null) {
            return null;
        }
        try {
            q qVar = Result.f14614e;
            objO = notificationManager.getActiveNotifications();
        } catch (Throwable th2) {
            q qVar2 = Result.f14614e;
            objO = ib.a.o(th2);
        }
        if (objO instanceof r) {
            objO = null;
        }
        StatusBarNotification[] statusBarNotificationArr = (StatusBarNotification[]) objO;
        if (statusBarNotificationArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : statusBarNotificationArr) {
            if (statusBarNotification.getTag() != null) {
                Regex regex = messageRegex;
                String tag = statusBarNotification.getTag();
                Intrinsics.checkNotNullExpressionValue(tag, "getTag(...)");
                m mVarB = regex.b(tag);
                int iA = (mVarB == null || (collectionA = mVarB.a()) == null) ? 0 : ((b) collectionA).a();
                String tag2 = statusBarNotification.getTag();
                Intrinsics.checkNotNullExpressionValue(tag2, "getTag(...)");
                if (x.o(tag2, NotificationData.TYPE_GENERIC_PUSH_NOTIFICATION_SENT, false) && iA == 4) {
                    if (Intrinsics.areEqual((mVarB == null || (listA = mVarB.a()) == null) ? null : (String) ((a1) listA).get(2), channelId)) {
                        arrayList.add(statusBarNotification);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: getCallNotifications-mJqaSGE, reason: not valid java name */
    public static final List<StatusBarNotification> m1116getCallNotificationsmJqaSGE(@NotNull Context getCallNotifications, long j) {
        Object objO;
        boolean zO;
        Intrinsics.checkNotNullParameter(getCallNotifications, "$this$getCallNotifications");
        NotificationManager notificationManager = getNotificationManager(getCallNotifications);
        ArrayList arrayList = null;
        if (notificationManager != null) {
            try {
                q qVar = Result.f14614e;
                objO = notificationManager.getActiveNotifications();
            } catch (Throwable th2) {
                q qVar2 = Result.f14614e;
                objO = ib.a.o(th2);
            }
            if (objO instanceof r) {
                objO = null;
            }
            StatusBarNotification[] statusBarNotificationArr = (StatusBarNotification[]) objO;
            if (statusBarNotificationArr != null) {
                arrayList = new ArrayList();
                for (StatusBarNotification statusBarNotification : statusBarNotificationArr) {
                    if (statusBarNotification.getTag() == null) {
                        zO = false;
                    } else {
                        String strL = e.l(NotificationData.TYPE_CALL_RING, ChannelId.m1137toStringimpl(j));
                        String tag = statusBarNotification.getTag();
                        Intrinsics.checkNotNullExpressionValue(tag, "getTag(...)");
                        zO = x.o(tag, strL, false);
                    }
                    if (zO) {
                        arrayList.add(statusBarNotification);
                    }
                }
            }
        }
        return arrayList;
    }

    public static final NotificationCompat$MessagingStyle getMessagingStyle(@NotNull Notification notification) {
        Intrinsics.checkNotNullParameter(notification, "<this>");
        v0 v0VarD = v0.d(notification);
        if (v0VarD instanceof NotificationCompat$MessagingStyle) {
            return (NotificationCompat$MessagingStyle) v0VarD;
        }
        return null;
    }

    @NotNull
    public static final NotificationCompat$Builder getNotificationBuilderOrCreate(@NotNull Context context, @NotNull String notificationChannelId, Notification notification) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(notificationChannelId, "notificationChannelId");
        return notification != null ? new NotificationCompat$Builder(context, notification) : new NotificationCompat$Builder(context, notificationChannelId);
    }

    public static final NotificationManager getNotificationManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (NotificationManager) context.getSystemService("notification");
    }

    @NotNull
    public static final NotificationManagerCompat getNotificationManagerCompat(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        NotificationManagerCompat notificationManagerCompat = new NotificationManagerCompat(context);
        Intrinsics.checkNotNullExpressionValue(notificationManagerCompat, "from(...)");
        return notificationManagerCompat;
    }

    public static final void notify(@NotNull NotificationManagerCompat notificationManagerCompat, @NotNull String tag, @NotNull NotificationCompat$Builder notificationBuilder, int i7) {
        Intrinsics.checkNotNullParameter(notificationManagerCompat, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Notification notificationC = notificationBuilder.c();
        Intrinsics.checkNotNullExpressionValue(notificationC, "build(...)");
        notificationC.flags = i7 | notificationC.flags;
        notificationManagerCompat.g(tag, 0, notificationC);
    }

    public static /* synthetic */ void notify$default(NotificationManagerCompat notificationManagerCompat, String str, NotificationCompat$Builder notificationCompat$Builder, int i7, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            i7 = 0;
        }
        notify(notificationManagerCompat, str, notificationCompat$Builder, i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.core.app.NotificationCompat$Builder, java.lang.Object] */
    @NotNull
    public static final NotificationCompat$Builder setLegacyNotificationBehaviors(@NotNull NotificationCompat$Builder notificationCompat$Builder, @NotNull Context context, NotificationBehaviors notificationBehaviors, Uri uri) {
        ?? r5;
        Intrinsics.checkNotNullParameter(notificationCompat$Builder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (notificationBehaviors == null) {
            return notificationCompat$Builder;
        }
        boolean soundsEnabled = notificationBehaviors.getSoundsEnabled();
        if (notificationBehaviors.getVibrationsEnabled()) {
            r5 = soundsEnabled;
            r5 = (soundsEnabled ? 1 : 0) | 2;
        }
        r5 = soundsEnabled;
        if (notificationBehaviors.getLightsEnabled()) {
            notificationCompat$Builder.i(ColorUtilsKt.getColorCompat(context, R.color.brand_500), 1500, 1500);
        }
        if (!notificationBehaviors.getSoundsEnabled() || uri == null) {
            notificationCompat$Builder.f(r5);
            Intrinsics.checkNotNull(notificationCompat$Builder);
            return notificationCompat$Builder;
        }
        Notification notification = notificationCompat$Builder.N;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = c0.a(c0.e(c0.c(c0.b(), 4), 5));
        notificationCompat$Builder.f(r5 & (-2));
        Intrinsics.checkNotNull(notificationCompat$Builder);
        return notificationCompat$Builder;
    }
}
