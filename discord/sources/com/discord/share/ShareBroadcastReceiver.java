package com.discord.share;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Parcelable;
import com.discord.misc.utilities.intent.PendingIntentUtils;
import com.discord.reactevents.ReactEvents;
import com.discord.share.react.events.ShareBroadcastReceiverAppClicked;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import y0.b;
import y0.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/share/ShareBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactApplicationContext", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "share_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShareBroadcastReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareBroadcastReceiver.kt\ncom/discord/share/ShareBroadcastReceiver\n+ 2 IntentUtils.kt\ncom/discord/misc/utilities/intent/IntentUtilsKt\n*L\n1#1,69:1\n14#2:70\n*S KotlinDebug\n*F\n+ 1 ShareBroadcastReceiver.kt\ncom/discord/share/ShareBroadcastReceiver\n*L\n28#1:70\n*E\n"})
public final class ShareBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String SHARE_SHEET_CLICK = "share_sheet_click";

    @NotNull
    private static final String SHARE_SHEET_LOCATION = "share_sheet_location";

    @NotNull
    private final ReactApplicationContext reactApplicationContext;

    @NotNull
    private final ReactEvents reactEvents;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/discord/share/ShareBroadcastReceiver$Companion;", "", "<init>", "()V", "SHARE_SHEET_LOCATION", "", "SHARE_SHEET_CLICK", "register", "", "context", "Landroid/content/Context;", "receiver", "Lcom/discord/share/ShareBroadcastReceiver;", "unregister", "getPendingIntentSender", "Landroid/content/IntentSender;", "location", "share_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nShareBroadcastReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareBroadcastReceiver.kt\ncom/discord/share/ShareBroadcastReceiver$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IntentSender getPendingIntentSender(@NotNull Context context, String location) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(ShareBroadcastReceiver.SHARE_SHEET_CLICK);
            intent.putExtra(ShareBroadcastReceiver.SHARE_SHEET_LOCATION, location);
            Unit unit = Unit.f14616a;
            IntentSender intentSender = PendingIntent.getBroadcast(context, 0, intent, PendingIntentUtils.immutablePendingIntentFlag$default(PendingIntentUtils.INSTANCE, 0, 1, null)).getIntentSender();
            Intrinsics.checkNotNullExpressionValue(intentSender, "getIntentSender(...)");
            return intentSender;
        }

        public final void register(@NotNull Context context, @NotNull ShareBroadcastReceiver receiver) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            b.f(context, receiver, new IntentFilter(ShareBroadcastReceiver.SHARE_SHEET_CLICK), null, 4);
        }

        public final void unregister(@NotNull Context context, @NotNull ShareBroadcastReceiver receiver) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            try {
                context.unregisterReceiver(receiver);
            } catch (Exception unused) {
            }
        }

        private Companion() {
        }
    }

    public ShareBroadcastReceiver(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactApplicationContext = reactContext;
        this.reactEvents = new ReactEvents(new Pair("share-broadcast-receiver-app-clicked", Reflection.getOrCreateKotlinClass(ShareBroadcastReceiverAppClicked.class)));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ComponentName componentName = intent != null ? (ComponentName) ((Parcelable) d.b(intent, "android.intent.extra.CHOSEN_COMPONENT", ComponentName.class)) : null;
        String stringExtra = intent != null ? intent.getStringExtra(SHARE_SHEET_LOCATION) : null;
        if (componentName != null) {
            ReactEvents reactEvents = this.reactEvents;
            ReactApplicationContext reactApplicationContext = this.reactApplicationContext;
            String packageName = componentName.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            reactEvents.emitModuleEvent(reactApplicationContext, new ShareBroadcastReceiverAppClicked(packageName, stringExtra));
        }
    }
}
