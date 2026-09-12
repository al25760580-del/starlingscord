package com.discord.react_fork_overrides;

import com.discord.react_fork_overrides.forks.CustomFontFamilyOverride;
import com.discord.react_fork_overrides.forks.CustomLineHeightSpanOverride;
import com.discord.react_fork_overrides.forks.ImageSourceOverride;
import com.facebook.react.views.scroll.ReactScrollViewOverride;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/react_fork_overrides/ReactForkOverrides;", "", "<init>", "()V", "init", "", "react_fork_overrides_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactForkOverrides {

    @NotNull
    public static final ReactForkOverrides INSTANCE = new ReactForkOverrides();

    private ReactForkOverrides() {
    }

    public final void init() {
        CustomLineHeightSpanOverride.INSTANCE.override();
        ImageSourceOverride.INSTANCE.override();
        ReactScrollViewOverride.INSTANCE.override();
        CustomFontFamilyOverride.INSTANCE.override();
    }
}
