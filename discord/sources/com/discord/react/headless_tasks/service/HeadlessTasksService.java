package com.discord.react.headless_tasks.service;

import android.content.Intent;
import com.discord.react.headless_tasks.api.HeadlessTasks;
import com.facebook.react.HeadlessJsTaskService;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/discord/react/headless_tasks/service/HeadlessTasksService;", "Lcom/facebook/react/HeadlessJsTaskService;", "<init>", "()V", "getTaskConfig", "Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;", "intent", "Landroid/content/Intent;", "react_headless_tasks_service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HeadlessTasksService extends HeadlessJsTaskService {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f4553d = 0;

    @Override // com.facebook.react.HeadlessJsTaskService
    public HeadlessJsTaskConfig getTaskConfig(Intent intent) {
        HeadlessTasks headlessTasksFromIntent = HeadlessTasks.INSTANCE.fromIntent(intent);
        if (headlessTasksFromIntent != null) {
            return headlessTasksFromIntent.getTaskConfig();
        }
        return null;
    }
}
