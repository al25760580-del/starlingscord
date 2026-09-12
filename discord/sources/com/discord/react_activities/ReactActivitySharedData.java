package com.discord.react_activities;

import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/discord/react_activities/ReactActivitySharedData;", "", "<init>", "()V", "prepareEverythingForActivity", "Ljava/util/concurrent/CountDownLatch;", "getPrepareEverythingForActivity", "()Ljava/util/concurrent/CountDownLatch;", "react_activity_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactActivitySharedData {

    @NotNull
    public static final ReactActivitySharedData INSTANCE = new ReactActivitySharedData();

    @NotNull
    private static final CountDownLatch prepareEverythingForActivity = new CountDownLatch(1);

    private ReactActivitySharedData() {
    }

    @NotNull
    public final CountDownLatch getPrepareEverythingForActivity() {
        return prepareEverythingForActivity;
    }
}
