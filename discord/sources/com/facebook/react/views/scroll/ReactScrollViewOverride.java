package com.facebook.react.views.scroll;

import com.discord.recycler_view.scroll.RecyclerViewScrollLimiter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewOverride;", "", "<init>", "()V", "override", "", "react_fork_overrides_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactScrollViewOverride {

    @NotNull
    public static final ReactScrollViewOverride INSTANCE = new ReactScrollViewOverride();

    private ReactScrollViewOverride() {
    }

    public final void override() {
        ReactScrollView.MAX_FLING_VELOCITY = Integer.valueOf(RecyclerViewScrollLimiter.MAX_FLING_VELOCITY);
    }
}
