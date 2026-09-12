package com.discord.chat.bridge.contentnode;

import com.discord.emoji.RenderableEmoji;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toRenderableEmoji", "Lcom/discord/emoji/RenderableEmoji;", "Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SoundmojiContentNodeKt {
    public static final RenderableEmoji toRenderableEmoji(@NotNull SoundmojiContentNode soundmojiContentNode) {
        Intrinsics.checkNotNullParameter(soundmojiContentNode, "<this>");
        if (soundmojiContentNode.getEmojiId() != null) {
            return RenderableEmoji.INSTANCE.customWithEmojiId(Long.parseLong(soundmojiContentNode.getEmojiId()), false, "");
        }
        if (soundmojiContentNode.getEmojiName() != null) {
            return RenderableEmoji.INSTANCE.unicode(soundmojiContentNode.getEmojiName());
        }
        return null;
    }
}
