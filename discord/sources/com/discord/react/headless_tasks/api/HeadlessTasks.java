package com.discord.react.headless_tasks.api;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.discord.react.headless_tasks.service.HeadlessTasksService;
import com.facebook.react.HeadlessJsTaskService;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;
import ib.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/discord/react/headless_tasks/api/HeadlessTasks;", "", "taskConfig", "Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;", "<init>", "(Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;)V", "getTaskConfig", "()Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "react_headless_tasks_api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class HeadlessTasks {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final Class<?> SERVICE_CLASS;

    @NotNull
    private static final String TASK_ALLOWED_IN_FOREGROUND_KEY = "intent.discord.headless_tasks_aif";

    @NotNull
    private static final String TASK_KEY = "intent.discord.headless_tasks_key";

    @NotNull
    private static final String TASK_NAME_KEY = "intent.discord.headless_tasks_name";

    @NotNull
    private static final String TASK_PARAMS_KEY = "intent.discord.headless_tasks_params";
    private static final long TASK_TIMEOUT_DEFAULT = 5000;

    @NotNull
    private static final String TASK_TIMEOUT_KEY = "intent.discord.headless_tasks_timeout";

    @NotNull
    private final HeadlessJsTaskConfig taskConfig;

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ6\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0002R\u001e\u0010\u0004\u001a\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/discord/react/headless_tasks/api/HeadlessTasks$Companion;", "", "<init>", "()V", "SERVICE_CLASS", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "TASK_KEY", "", "TASK_NAME_KEY", "TASK_TIMEOUT_KEY", "TASK_TIMEOUT_DEFAULT", "", "TASK_ALLOWED_IN_FOREGROUND_KEY", "TASK_PARAMS_KEY", "startHeadlessTask", "", "context", "Landroid/content/Context;", "taskName", "taskTimeout", "taskAllowedInForeground", "", "taskParams", "Landroid/os/Bundle;", "taskInvokingFromBroadcastReceiver", "fromIntent", "Lcom/discord/react/headless_tasks/api/HeadlessTasks;", "intent", "Landroid/content/Intent;", "toIntent", "react_headless_tasks_api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nHeadlessTasks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeadlessTasks.kt\ncom/discord/react/headless_tasks/api/HeadlessTasks$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void startHeadlessTask$default(Companion companion, Context context, String str, long j, boolean z5, Bundle bundle, boolean z6, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                j = 5000;
            }
            long j5 = j;
            if ((i7 & 8) != 0) {
                z5 = true;
            }
            companion.startHeadlessTask(context, str, j5, z5, (i7 & 16) != 0 ? new Bundle() : bundle, (i7 & 32) != 0 ? false : z6);
        }

        private final Intent toIntent(Context context, String taskName, long taskTimeout, boolean taskAllowedInForeground, Bundle taskParams) {
            Intent intent = new Intent(context, (Class<?>) HeadlessTasks.SERVICE_CLASS);
            intent.putExtra(HeadlessTasks.TASK_KEY, true);
            intent.putExtra(HeadlessTasks.TASK_NAME_KEY, taskName);
            intent.putExtra(HeadlessTasks.TASK_TIMEOUT_KEY, taskTimeout);
            intent.putExtra(HeadlessTasks.TASK_ALLOWED_IN_FOREGROUND_KEY, taskAllowedInForeground);
            intent.putExtra(HeadlessTasks.TASK_PARAMS_KEY, taskParams);
            return intent;
        }

        public static /* synthetic */ Intent toIntent$default(Companion companion, Context context, String str, long j, boolean z5, Bundle bundle, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                j = 5000;
            }
            long j5 = j;
            if ((i7 & 8) != 0) {
                z5 = true;
            }
            boolean z6 = z5;
            if ((i7 & 16) != 0) {
                bundle = new Bundle();
            }
            return companion.toIntent(context, str, j5, z6, bundle);
        }

        public final HeadlessTasks fromIntent(Intent intent) {
            WritableMap writableNativeMap;
            if (intent == null || !intent.hasExtra(HeadlessTasks.TASK_KEY) || !intent.hasExtra(HeadlessTasks.TASK_NAME_KEY) || !a.y()) {
                return null;
            }
            String stringExtra = intent.getStringExtra(HeadlessTasks.TASK_NAME_KEY);
            if (stringExtra == null) {
                stringExtra = "";
            }
            String str = stringExtra;
            long longExtra = intent.getLongExtra(HeadlessTasks.TASK_TIMEOUT_KEY, 5000L);
            Bundle bundleExtra = intent.getBundleExtra(HeadlessTasks.TASK_PARAMS_KEY);
            if (bundleExtra == null || (writableNativeMap = Arguments.fromBundle(bundleExtra)) == null) {
                writableNativeMap = new WritableNativeMap();
            }
            return new HeadlessTasks(new HeadlessJsTaskConfig(str, writableNativeMap, longExtra, intent.getBooleanExtra(HeadlessTasks.TASK_ALLOWED_IN_FOREGROUND_KEY, false), null, 16, null));
        }

        public final void startHeadlessTask(@NotNull Context context, @NotNull String taskName, long taskTimeout, boolean taskAllowedInForeground, @NotNull Bundle taskParams, boolean taskInvokingFromBroadcastReceiver) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(taskName, "taskName");
            Intrinsics.checkNotNullParameter(taskParams, "taskParams");
            context.startService(toIntent(context, taskName, taskTimeout, taskAllowedInForeground, taskParams));
            if (taskInvokingFromBroadcastReceiver) {
                HeadlessJsTaskService.INSTANCE.acquireWakeLockNow(context);
            }
        }

        private Companion() {
        }
    }

    static {
        int i7 = HeadlessTasksService.f4553d;
        SERVICE_CLASS = HeadlessTasksService.class;
    }

    public HeadlessTasks(@NotNull HeadlessJsTaskConfig taskConfig) {
        Intrinsics.checkNotNullParameter(taskConfig, "taskConfig");
        this.taskConfig = taskConfig;
    }

    public static /* synthetic */ HeadlessTasks copy$default(HeadlessTasks headlessTasks, HeadlessJsTaskConfig headlessJsTaskConfig, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            headlessJsTaskConfig = headlessTasks.taskConfig;
        }
        return headlessTasks.copy(headlessJsTaskConfig);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HeadlessJsTaskConfig getTaskConfig() {
        return this.taskConfig;
    }

    @NotNull
    public final HeadlessTasks copy(@NotNull HeadlessJsTaskConfig taskConfig) {
        Intrinsics.checkNotNullParameter(taskConfig, "taskConfig");
        return new HeadlessTasks(taskConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HeadlessTasks) && Intrinsics.areEqual(this.taskConfig, ((HeadlessTasks) other).taskConfig);
    }

    @NotNull
    public final HeadlessJsTaskConfig getTaskConfig() {
        return this.taskConfig;
    }

    public int hashCode() {
        return this.taskConfig.hashCode();
    }

    @NotNull
    public String toString() {
        return "HeadlessTasks(taskConfig=" + this.taskConfig + ")";
    }
}
