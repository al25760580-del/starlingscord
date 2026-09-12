package com.discord.recycler_view.scroll;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/discord/recycler_view/scroll/RecyclerViewScrollLimiter;", "", "<init>", "()V", "MAX_FLING_VELOCITY", "", "getClampedVelocity", "velocity", "recycler_view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RecyclerViewScrollLimiter {

    @NotNull
    public static final RecyclerViewScrollLimiter INSTANCE = new RecyclerViewScrollLimiter();
    public static final int MAX_FLING_VELOCITY = 12500;

    private RecyclerViewScrollLimiter() {
    }

    public final int getClampedVelocity(int velocity) {
        return velocity < 0 ? Math.max(velocity, -12500) : Math.min(velocity, MAX_FLING_VELOCITY);
    }
}
