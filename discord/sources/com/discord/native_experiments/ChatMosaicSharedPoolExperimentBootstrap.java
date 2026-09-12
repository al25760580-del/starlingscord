package com.discord.native_experiments;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/native_experiments/ChatMosaicSharedPoolExperimentBootstrap;", "", "<init>", "()V", "EXPERIMENT_ID", "", "defaultSettings", "Lcom/discord/native_experiments/ChatMosaicSharedPoolExperimentSettings;", "fromTreatmentId", "rawTreatmentId", "", "configure", "", "settings", "native_experiments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChatMosaicSharedPoolExperimentBootstrap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatMosaicSharedPoolExperimentBootstrap.kt\ncom/discord/native_experiments/ChatMosaicSharedPoolExperimentBootstrap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
public final class ChatMosaicSharedPoolExperimentBootstrap {

    @NotNull
    public static final String EXPERIMENT_ID = "2026-02-android-chat-mosaic-shared-pool";

    @NotNull
    public static final ChatMosaicSharedPoolExperimentBootstrap INSTANCE = new ChatMosaicSharedPoolExperimentBootstrap();

    @NotNull
    private static final ChatMosaicSharedPoolExperimentSettings defaultSettings = new ChatMosaicSharedPoolExperimentSettings(0, false);

    private ChatMosaicSharedPoolExperimentBootstrap() {
    }

    public final void configure(@NotNull ChatMosaicSharedPoolExperimentSettings settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        ChatMosaicSharedPoolExperimentConfig.INSTANCE.configureUseSharedPoolForNestedMosaic(settings.getUseSharedPool());
    }

    @NotNull
    public final ChatMosaicSharedPoolExperimentSettings fromTreatmentId(int rawTreatmentId) {
        Integer numValueOf = Integer.valueOf(rawTreatmentId);
        int iIntValue = numValueOf.intValue();
        if (iIntValue < 0 || iIntValue >= 2) {
            numValueOf = null;
        }
        return (numValueOf != null ? numValueOf.intValue() : 0) == 1 ? defaultSettings.copy(1, true) : defaultSettings;
    }
}
