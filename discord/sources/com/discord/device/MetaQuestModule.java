package com.discord.device;

import com.discord.codegen.NativeMetaQuestModuleSpec;
import com.discord.device.utils.IsMetaQuestKt;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/discord/device/MetaQuestModule;", "Lcom/discord/codegen/NativeMetaQuestModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "isMetaQuest", "", "device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MetaQuestModule extends NativeMetaQuestModuleSpec {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaQuestModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.discord.codegen.NativeMetaQuestModuleSpec
    public boolean isMetaQuest() {
        return IsMetaQuestKt.isMetaQuest();
    }
}
