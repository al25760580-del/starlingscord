package com.discord.push_notification_monitor;

import android.content.Context;
import android.content.SharedPreferences;
import com.discord.codegen.NativePushNotificationMonitorModuleSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import pr.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/push_notification_monitor/PushNotificationMonitorModule;", "Lcom/discord/codegen/NativePushNotificationMonitorModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getPushNotificationLogs", "", "userId", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "clearLogs", "Companion", "push_notification_monitor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPushNotificationMonitorModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushNotificationMonitorModule.kt\ncom/discord/push_notification_monitor/PushNotificationMonitorModule\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,29:1\n113#2:30\n*S KotlinDebug\n*F\n+ 1 PushNotificationMonitorModule.kt\ncom/discord/push_notification_monitor/PushNotificationMonitorModule\n*L\n15#1:30\n*E\n"})
public final class PushNotificationMonitorModule extends NativePushNotificationMonitorModuleSpec {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ReactApplicationContext reactContext;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/discord/push_notification_monitor/PushNotificationMonitorModule$Companion;", "", "<init>", "()V", "getPushNotificationLogStorage", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "push_notification_monitor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SharedPreferences getPushNotificationLogStorage(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("push_notification_monitor", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
            return sharedPreferences;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationMonitorModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    @Override // com.discord.codegen.NativePushNotificationMonitorModuleSpec
    public void clearLogs() {
        PushNotificationMonitor.INSTANCE.clearPushLog(this.reactContext);
    }

    @Override // com.discord.codegen.NativePushNotificationMonitorModuleSpec
    public void getPushNotificationLogs(@NotNull String userId, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(promise, "promise");
        b bVar = Json.f14760d;
        PushNotificationLog pushLog = PushNotificationMonitor.INSTANCE.getPushLog(this.reactContext, userId);
        bVar.getClass();
        promise.resolve(bVar.c(PushNotificationLog.INSTANCE.serializer(), pushLog));
    }
}
