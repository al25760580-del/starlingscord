package com.discord.notifications.actions.intents;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.core.app.NotificationManagerCompat;
import com.discord.misc.utilities.intent.IntentUtilsKt;
import com.discord.misc.utilities.intent.PendingIntentUtils;
import com.discord.notifications.actions.NotificationActions;
import com.discord.react_activities.ReactActivity;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import y0.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/discord/notifications/actions/intents/NotificationAction;", "Landroid/os/Parcelable;", "tag", "", "getTag", "()Ljava/lang/String;", "pendingIntentRequestCode", "", "getPendingIntentRequestCode", "()I", "onNotificationAction", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "onNotificationActionComplete", "toPendingIntent", "Landroid/app/PendingIntent;", "flags", "launchActivity", "", "createIntent", "Companion", "notification_actions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface NotificationAction extends Parcelable {

    @NotNull
    public static final String ACTIVITY_ACTION = "android.intent.action.VIEW";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String EXTRA_CONTENT_ACTION_TAG = "com.discord.notifications.actions.intents.ContentAction.tag";

    @NotNull
    public static final String EXTRA_CONTENT_ACTION_TYPE = "com.discord.notifications.actions.intents.ContentAction.type";

    @NotNull
    public static final String INTENT_ARG_KEY = "action_intent_arg_key";

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\n\u001a\u00020\u000b*\u00020\fJ \u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\n\b\u0000\u0010\u0016\u0018\u0001*\u00020\u0017*\u00020\fH\u0086\b¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/discord/notifications/actions/intents/NotificationAction$Companion;", "", "<init>", "()V", "INTENT_ARG_KEY", "", "EXTRA_CONTENT_ACTION_TAG", "EXTRA_CONTENT_ACTION_TYPE", "EXTRA_ACTIVITY_TOKEN", "activityToken", "hasTrustedActivityToken", "", "Landroid/content/Intent;", "activityClass", "Ljava/lang/Class;", "getActivityClass", "()Ljava/lang/Class;", "ACTIVITY_ACTION", "broadcastClass", "Lcom/discord/notifications/actions/NotificationActions;", "BROADCAST_ACTION", "toAction", "T", "Lcom/discord/notifications/actions/intents/NotificationAction;", "(Landroid/content/Intent;)Lcom/discord/notifications/actions/intents/NotificationAction;", "notification_actions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nNotificationAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationAction.kt\ncom/discord/notifications/actions/intents/NotificationAction$Companion\n+ 2 IntentUtils.kt\ncom/discord/misc/utilities/intent/IntentUtilsKt\n*L\n1#1,127:1\n14#2:128\n*S KotlinDebug\n*F\n+ 1 NotificationAction.kt\ncom/discord/notifications/actions/intents/NotificationAction$Companion\n*L\n121#1:128\n*E\n"})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String ACTIVITY_ACTION = "android.intent.action.VIEW";

        @NotNull
        private static final String BROADCAST_ACTION = "com.discord.intent.action.NOTIFICATION_ACTION";

        @NotNull
        private static final String EXTRA_ACTIVITY_TOKEN = "com.discord.notifications.actions.intents.NotificationAction.activity_token";

        @NotNull
        public static final String EXTRA_CONTENT_ACTION_TAG = "com.discord.notifications.actions.intents.ContentAction.tag";

        @NotNull
        public static final String EXTRA_CONTENT_ACTION_TYPE = "com.discord.notifications.actions.intents.ContentAction.type";

        @NotNull
        public static final String INTENT_ARG_KEY = "action_intent_arg_key";

        @NotNull
        private static final Class<?> activityClass;

        @NotNull
        private static final String activityToken;

        @NotNull
        private static final Class<NotificationActions> broadcastClass;

        static {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            activityToken = string;
            activityClass = ReactActivity.INSTANCE.getMainActivity();
            broadcastClass = NotificationActions.class;
        }

        private Companion() {
        }

        @NotNull
        public final Class<?> getActivityClass() {
            return activityClass;
        }

        public final boolean hasTrustedActivityToken(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "<this>");
            return Intrinsics.areEqual(intent.getStringExtra(EXTRA_ACTIVITY_TOKEN), activityToken);
        }

        public final /* synthetic */ <T extends NotificationAction> T toAction(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "<this>");
            Intrinsics.reifiedOperationMarker(4, "T");
            if (!IntentUtilsKt.hasExtra(intent, Reflection.getOrCreateKotlinClass(NotificationAction.class))) {
                return null;
            }
            Intrinsics.reifiedOperationMarker(4, "T");
            return (T) ((Parcelable) d.b(intent, "action_intent_arg_key", Parcelable.class));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static Intent createIntent(NotificationAction notificationAction, Context context, boolean z5) {
            Intent intentPutIntentParcelable = IntentUtilsKt.putIntentParcelable(IntentUtilsKt.putExtra(new Intent(z5 ? "android.intent.action.VIEW" : "com.discord.intent.action.NOTIFICATION_ACTION", null, context, z5 ? NotificationAction.INSTANCE.getActivityClass() : Companion.broadcastClass), Reflection.getOrCreateKotlinClass(notificationAction.getClass())), "action_intent_arg_key", notificationAction);
            if (z5) {
                intentPutIntentParcelable.putExtra("com.discord.notifications.actions.intents.NotificationAction.activity_token", Companion.activityToken);
            }
            if (notificationAction instanceof ContentAction) {
                ContentAction contentAction = (ContentAction) notificationAction;
                intentPutIntentParcelable.putExtra("com.discord.notifications.actions.intents.ContentAction.tag", contentAction.getTag());
                intentPutIntentParcelable.putExtra("com.discord.notifications.actions.intents.ContentAction.type", contentAction.getData().get("type"));
            }
            return intentPutIntentParcelable;
        }

        public static int getPendingIntentRequestCode(@NotNull NotificationAction notificationAction) {
            return Math.abs((notificationAction.getTag() + Reflection.getOrCreateKotlinClass(notificationAction.getClass())).hashCode());
        }

        public static void onNotificationAction(@NotNull NotificationAction notificationAction, @NotNull Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
        }

        public static void onNotificationActionComplete(@NotNull NotificationAction notificationAction, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            NotificationManagerCompat notificationManagerCompat = new NotificationManagerCompat(context);
            notificationManagerCompat.f1518b.cancel(notificationAction.getTag(), 0);
        }

        @NotNull
        public static PendingIntent toPendingIntent(@NotNull NotificationAction notificationAction, @NotNull Context context, int i7, boolean z5) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intentCreateIntent = createIntent(notificationAction, context, z5);
            PendingIntent activity = z5 ? PendingIntent.getActivity(context, notificationAction.getPendingIntentRequestCode(), intentCreateIntent, i7) : PendingIntent.getBroadcast(context, notificationAction.getPendingIntentRequestCode(), intentCreateIntent, i7);
            Intrinsics.checkNotNullExpressionValue(activity, "let(...)");
            return activity;
        }

        public static /* synthetic */ PendingIntent toPendingIntent$default(NotificationAction notificationAction, Context context, int i7, boolean z5, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toPendingIntent");
            }
            if ((i10 & 2) != 0) {
                i7 = PendingIntentUtils.immutablePendingIntentFlag$default(PendingIntentUtils.INSTANCE, 0, 1, null);
            }
            if ((i10 & 4) != 0) {
                z5 = false;
            }
            return notificationAction.toPendingIntent(context, i7, z5);
        }
    }

    int getPendingIntentRequestCode();

    @NotNull
    String getTag();

    void onNotificationAction(@NotNull Context context, @NotNull Intent intent);

    void onNotificationActionComplete(@NotNull Context context);

    @NotNull
    PendingIntent toPendingIntent(@NotNull Context context, int flags, boolean launchActivity);
}
