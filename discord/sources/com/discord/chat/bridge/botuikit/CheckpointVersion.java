package com.discord.chat.bridge.botuikit;

import com.facebook.imagepipeline.nativecode.b;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/discord/chat/bridge/botuikit/CheckpointVersion;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "V2025", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum CheckpointVersion {
    V2025(0);

    private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());
    private final int value;

    CheckpointVersion(int i7) {
        this.value = i7;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
