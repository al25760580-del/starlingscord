package com.discord.tti_manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Base64;
import com.discord.jank_stats.JankRecordStore;
import com.discord.react.headless_tasks.api.HeadlessTasks;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import y0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/discord/tti_manager/TTIBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "tti_manager_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TTIBroadcastReceiver extends BroadcastReceiver {

    @NotNull
    private static final String ACTION_TYPE_SETUP_TEST = "setup-test";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String RUN_TTI_TEST_ACTION = "com.discord.intent.action.RUN_TTI_TEST_ACTION";

    @NotNull
    private static final String TTI_TEST_ACTION_DATA = "tti_test_action_data";

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0016\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/discord/tti_manager/TTIBroadcastReceiver$Companion;", "", "<init>", "()V", "TTI_TEST_ACTION_DATA", "", "ACTION_TYPE_SETUP_TEST", "RUN_TTI_TEST_ACTION", "parseAndPersistYieldDuration", "", "actionData", "register", "context", "Landroid/content/Context;", "receiver", "Lcom/discord/tti_manager/TTIBroadcastReceiver;", "unregister", "tti_manager_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTTIBroadcastReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TTIBroadcastReceiver.kt\ncom/discord/tti_manager/TTIBroadcastReceiver$Companion\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,79:1\n147#2:80\n*S KotlinDebug\n*F\n+ 1 TTIBroadcastReceiver.kt\ncom/discord/tti_manager/TTIBroadcastReceiver$Companion\n*L\n53#1:80\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void parseAndPersistYieldDuration(String actionData) {
            try {
                Json json = TTIBroadcastReceiverKt.json;
                byte[] bArrDecode = Base64.decode(actionData, 0);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String str = new String(bArrDecode, Charsets.UTF_8);
                json.getClass();
                TTIActionData tTIActionData = (TTIActionData) json.b(TTIActionData.INSTANCE.serializer(), str);
                if (Intrinsics.areEqual(tTIActionData.getType(), TTIBroadcastReceiver.ACTION_TYPE_SETUP_TEST)) {
                    TTISharedPreferences.INSTANCE.setYieldDurationMs(tTIActionData.getYieldDurationMs());
                }
            } catch (Exception unused) {
            }
        }

        public final void register(@NotNull Context context, @NotNull TTIBroadcastReceiver receiver) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            b.f(context, receiver, new IntentFilter(TTIBroadcastReceiver.RUN_TTI_TEST_ACTION), null, 2);
        }

        public final void unregister(@NotNull Context context, @NotNull TTIBroadcastReceiver receiver) {
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

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent != null ? intent.getStringExtra(TTI_TEST_ACTION_DATA) : null;
        if (stringExtra == null || context == null) {
            return;
        }
        INSTANCE.parseAndPersistYieldDuration(stringExtra);
        HeadlessTasks.Companion companion = HeadlessTasks.INSTANCE;
        Bundle bundle = new Bundle();
        bundle.putString("actionData", stringExtra);
        HeadlessTasks.Companion.startHeadlessTask$default(companion, context, "TTITestAction", JankRecordStore.FLUSH_INTERVAL_MS, false, bundle, true, 8, null);
    }
}
