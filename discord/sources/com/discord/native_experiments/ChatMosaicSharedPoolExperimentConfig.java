package com.discord.native_experiments;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discord/native_experiments/ChatMosaicSharedPoolExperimentConfig;", "", "<init>", "()V", "useSharedPoolForNestedMosaic", "", "configureUseSharedPoolForNestedMosaic", "", ViewProps.ENABLED, "native_experiments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChatMosaicSharedPoolExperimentConfig {

    @NotNull
    public static final ChatMosaicSharedPoolExperimentConfig INSTANCE = new ChatMosaicSharedPoolExperimentConfig();
    private static volatile boolean useSharedPoolForNestedMosaic;

    private ChatMosaicSharedPoolExperimentConfig() {
    }

    public final void configureUseSharedPoolForNestedMosaic(boolean enabled) {
        useSharedPoolForNestedMosaic = enabled;
    }

    public final boolean useSharedPoolForNestedMosaic() {
        return useSharedPoolForNestedMosaic;
    }
}
