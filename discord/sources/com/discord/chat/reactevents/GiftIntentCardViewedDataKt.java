package com.discord.chat.reactevents;

import com.discord.primitives.MessageId;
import com.discord.primitives.UserId;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"serializeGiftIntentEvent", "Lcom/facebook/react/bridge/WritableMap;", "messageId", "Lcom/discord/primitives/MessageId;", "recipientUserId", "Lcom/discord/primitives/UserId;", "giftIntentType", "", "serializeGiftIntentEvent-gzHKzLY", "(Ljava/lang/String;JI)Lcom/facebook/react/bridge/WritableMap;", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class GiftIntentCardViewedDataKt {
    @NotNull
    /* JADX INFO: renamed from: serializeGiftIntentEvent-gzHKzLY, reason: not valid java name */
    public static final WritableMap m788serializeGiftIntentEventgzHKzLY(@NotNull String messageId, long j, int i7) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        return NativeMapExtensionsKt.nativeMapOf(new Pair("messageId", MessageId.m1163toStringimpl(messageId)), new Pair("recipientUserId", UserId.m1215toStringimpl(j)), new Pair("giftIntentType", Integer.valueOf(i7)));
    }
}
