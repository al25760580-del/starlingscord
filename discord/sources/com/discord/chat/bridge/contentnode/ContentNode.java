package com.discord.chat.bridge.contentnode;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kr.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f(with = ContentNodeSerializer.class)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0018\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/discord/chat/bridge/contentnode/ContentNode;", "", "<init>", "()V", "Companion", "Lcom/discord/chat/bridge/contentnode/BlockQuoteContentNode;", "Lcom/discord/chat/bridge/contentnode/BulletListContentNode;", "Lcom/discord/chat/bridge/contentnode/ChannelNameContentNode;", "Lcom/discord/chat/bridge/contentnode/CodeBlockContentNode;", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "Lcom/discord/chat/bridge/contentnode/EmphasisContentNode;", "Lcom/discord/chat/bridge/contentnode/ErrorContentNode;", "Lcom/discord/chat/bridge/contentnode/GuildNameContentNode;", "Lcom/discord/chat/bridge/contentnode/HeadingContentNode;", "Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;", "Lcom/discord/chat/bridge/contentnode/LHeadingContentNode;", "Lcom/discord/chat/bridge/contentnode/LineBreakContentNode;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "Lcom/discord/chat/bridge/contentnode/MentionContentNode;", "Lcom/discord/chat/bridge/contentnode/NewLineContentNode;", "Lcom/discord/chat/bridge/contentnode/ParagraphContentNode;", "Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;", "Lcom/discord/chat/bridge/contentnode/SpoilerContentNode;", "Lcom/discord/chat/bridge/contentnode/StrikethroughContentNode;", "Lcom/discord/chat/bridge/contentnode/StrongContentNode;", "Lcom/discord/chat/bridge/contentnode/SubtextContentNode;", "Lcom/discord/chat/bridge/contentnode/TextContentNode;", "Lcom/discord/chat/bridge/contentnode/TimestampContentNode;", "Lcom/discord/chat/bridge/contentnode/UnderlineContentNode;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ContentNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/ContentNode$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ContentNodeSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ContentNode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ContentNode() {
    }
}
