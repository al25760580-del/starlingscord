package com.discord.chat.presentation.message.viewholder;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.GameMentionContentNode;
import com.discord.chat.bridge.contentnode.InlineCodeContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.contentnode.SoundmojiContentNode;
import com.discord.chat.presentation.message.messagepart.MessageContentAccessory;
import com.discord.primitives.MessageId;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B«\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\t\u0012\"\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00070\u000b\u0012*\u0010\u000f\u001a&\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00070\u000e\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\t\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0004\u0012:\u0010\u0013\u001a6\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00070\u0012\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\"\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u001c\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003¢\u0006\u0004\b)\u0010*J,\u0010+\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00070\u000bHÆ\u0003¢\u0006\u0004\b+\u0010,J4\u0010-\u001a&\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00070\u000eHÆ\u0003¢\u0006\u0004\b-\u0010.J\u001c\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003¢\u0006\u0004\b/\u0010*J\"\u00100\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b0\u0010(JD\u00101\u001a6\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00070\u0012HÆ\u0003¢\u0006\u0004\b1\u00102J\u001c\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003¢\u0006\u0004\b3\u0010*J\u001c\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003¢\u0006\u0004\b4\u0010*J\u001c\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003¢\u0006\u0004\b5\u0010*J\u001c\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003¢\u0006\u0004\b6\u0010*J\u001c\u00107\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003¢\u0006\u0004\b7\u0010*J\u001c\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003¢\u0006\u0004\b8\u0010*J\u001c\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003¢\u0006\u0004\b9\u0010*J\u001c\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003¢\u0006\u0004\b:\u0010*J\u001c\u0010;\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003¢\u0006\u0004\b;\u0010*JÖ\u0003\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\t2$\b\u0002\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00070\u000b2,\b\u0002\u0010\u000f\u001a&\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00070\u000e2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\t2\u001a\b\u0002\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u00042<\b\u0002\u0010\u0013\u001a6\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00070\u00122\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\t2\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\t2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\t2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00070\t2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\t2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00070\t2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00070\t2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\t2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00070\tHÆ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010A\u001a\u00020@HÖ\u0001¢\u0006\u0004\bA\u0010BJ\u001a\u0010E\u001a\u00020D2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bE\u0010FR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010G\u001a\u0004\bH\u0010&R)\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010I\u001a\u0004\bJ\u0010(R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\n\u0010K\u001a\u0004\bL\u0010*R3\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00070\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010M\u001a\u0004\bN\u0010,R;\u0010\u000f\u001a&\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00070\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010O\u001a\u0004\bP\u0010.R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010K\u001a\u0004\bQ\u0010*R)\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010I\u001a\u0004\bR\u0010(RK\u0010\u0013\u001a6\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00070\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010S\u001a\u0004\bT\u00102R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010K\u001a\u0004\bU\u0010*R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010K\u001a\u0004\bV\u0010*R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010K\u001a\u0004\bW\u0010*R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010K\u001a\u0004\bX\u0010*R#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010K\u001a\u0004\bY\u0010*R#\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010K\u001a\u0004\bZ\u0010*R#\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010K\u001a\u0004\b[\u0010*R#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b \u0010K\u001a\u0004\b\\\u0010*R#\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\"\u0010K\u001a\u0004\b]\u0010*¨\u0006^"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/MessageContentBindData;", "", "Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;", "messageContentItem", "Lkotlin/Function2;", "Lcom/discord/primitives/MessageId;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "", "onLinkClicked", "Lkotlin/Function1;", "onLinkLongClicked", "Lkotlin/Function3;", "", "onTapChannel", "Lkotlin/Function4;", "onLongPressChannel", "onTapAttachmentLink", "onLongPressAttachmentLink", "Lkotlin/Function6;", "onTapMention", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onTapCommand", "onLongPressCommand", "Lcom/discord/chat/bridge/contentnode/GameMentionContentNode;", "onTapGameMention", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "onTapSpoiler", "onTapTimestamp", "Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;", "onTapInlineCode", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "onTapEmoji", "onTapSeeMore", "Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;", "onTapSoundmoji", "<init>", "(Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "component1", "()Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;", "component2", "()Lkotlin/jvm/functions/Function2;", "component3", "()Lkotlin/jvm/functions/Function1;", "component4", "()Lkotlin/jvm/functions/Function3;", "component5", "()Lkotlin/jvm/functions/Function4;", "component6", "component7", "component8", "()Lkotlin/jvm/functions/Function6;", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/discord/chat/presentation/message/viewholder/MessageContentBindData;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;", "getMessageContentItem", "Lkotlin/jvm/functions/Function2;", "getOnLinkClicked", "Lkotlin/jvm/functions/Function1;", "getOnLinkLongClicked", "Lkotlin/jvm/functions/Function3;", "getOnTapChannel", "Lkotlin/jvm/functions/Function4;", "getOnLongPressChannel", "getOnTapAttachmentLink", "getOnLongPressAttachmentLink", "Lkotlin/jvm/functions/Function6;", "getOnTapMention", "getOnTapCommand", "getOnLongPressCommand", "getOnTapGameMention", "getOnTapSpoiler", "getOnTapTimestamp", "getOnTapInlineCode", "getOnTapEmoji", "getOnTapSeeMore", "getOnTapSoundmoji", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MessageContentBindData {

    @NotNull
    private final MessageContentAccessory messageContentItem;

    @NotNull
    private final Function2<MessageId, LinkContentNode, Unit> onLinkClicked;

    @NotNull
    private final Function1<LinkContentNode, Unit> onLinkLongClicked;

    @NotNull
    private final Function2<String, String, Unit> onLongPressAttachmentLink;

    @NotNull
    private final Function4 onLongPressChannel;

    @NotNull
    private final Function1<CommandMentionContentNode, Unit> onLongPressCommand;

    @NotNull
    private final Function1<String, Unit> onTapAttachmentLink;

    @NotNull
    private final Function3 onTapChannel;

    @NotNull
    private final Function1<CommandMentionContentNode, Unit> onTapCommand;

    @NotNull
    private final Function1<EmojiContentNode, Unit> onTapEmoji;

    @NotNull
    private final Function1<GameMentionContentNode, Unit> onTapGameMention;

    @NotNull
    private final Function1<InlineCodeContentNode, Unit> onTapInlineCode;

    @NotNull
    private final Function6 onTapMention;

    @NotNull
    private final Function1<MessageId, Unit> onTapSeeMore;

    @NotNull
    private final Function1<SoundmojiContentNode, Unit> onTapSoundmoji;

    @NotNull
    private final Function1<MessagePartViewHolder, Unit> onTapSpoiler;

    @NotNull
    private final Function1<String, Unit> onTapTimestamp;

    /* JADX WARN: Multi-variable type inference failed */
    public MessageContentBindData(@NotNull MessageContentAccessory messageContentItem, @NotNull Function2<? super MessageId, ? super LinkContentNode, Unit> onLinkClicked, @NotNull Function1<? super LinkContentNode, Unit> onLinkLongClicked, @NotNull Function3 onTapChannel, @NotNull Function4 onLongPressChannel, @NotNull Function1<? super String, Unit> onTapAttachmentLink, @NotNull Function2<? super String, ? super String, Unit> onLongPressAttachmentLink, @NotNull Function6 onTapMention, @NotNull Function1<? super CommandMentionContentNode, Unit> onTapCommand, @NotNull Function1<? super CommandMentionContentNode, Unit> onLongPressCommand, @NotNull Function1<? super GameMentionContentNode, Unit> onTapGameMention, @NotNull Function1<? super MessagePartViewHolder, Unit> onTapSpoiler, @NotNull Function1<? super String, Unit> onTapTimestamp, @NotNull Function1<? super InlineCodeContentNode, Unit> onTapInlineCode, @NotNull Function1<? super EmojiContentNode, Unit> onTapEmoji, @NotNull Function1<? super MessageId, Unit> onTapSeeMore, @NotNull Function1<? super SoundmojiContentNode, Unit> onTapSoundmoji) {
        Intrinsics.checkNotNullParameter(messageContentItem, "messageContentItem");
        Intrinsics.checkNotNullParameter(onLinkClicked, "onLinkClicked");
        Intrinsics.checkNotNullParameter(onLinkLongClicked, "onLinkLongClicked");
        Intrinsics.checkNotNullParameter(onTapChannel, "onTapChannel");
        Intrinsics.checkNotNullParameter(onLongPressChannel, "onLongPressChannel");
        Intrinsics.checkNotNullParameter(onTapAttachmentLink, "onTapAttachmentLink");
        Intrinsics.checkNotNullParameter(onLongPressAttachmentLink, "onLongPressAttachmentLink");
        Intrinsics.checkNotNullParameter(onTapMention, "onTapMention");
        Intrinsics.checkNotNullParameter(onTapCommand, "onTapCommand");
        Intrinsics.checkNotNullParameter(onLongPressCommand, "onLongPressCommand");
        Intrinsics.checkNotNullParameter(onTapGameMention, "onTapGameMention");
        Intrinsics.checkNotNullParameter(onTapSpoiler, "onTapSpoiler");
        Intrinsics.checkNotNullParameter(onTapTimestamp, "onTapTimestamp");
        Intrinsics.checkNotNullParameter(onTapInlineCode, "onTapInlineCode");
        Intrinsics.checkNotNullParameter(onTapEmoji, "onTapEmoji");
        Intrinsics.checkNotNullParameter(onTapSeeMore, "onTapSeeMore");
        Intrinsics.checkNotNullParameter(onTapSoundmoji, "onTapSoundmoji");
        this.messageContentItem = messageContentItem;
        this.onLinkClicked = onLinkClicked;
        this.onLinkLongClicked = onLinkLongClicked;
        this.onTapChannel = onTapChannel;
        this.onLongPressChannel = onLongPressChannel;
        this.onTapAttachmentLink = onTapAttachmentLink;
        this.onLongPressAttachmentLink = onLongPressAttachmentLink;
        this.onTapMention = onTapMention;
        this.onTapCommand = onTapCommand;
        this.onLongPressCommand = onLongPressCommand;
        this.onTapGameMention = onTapGameMention;
        this.onTapSpoiler = onTapSpoiler;
        this.onTapTimestamp = onTapTimestamp;
        this.onTapInlineCode = onTapInlineCode;
        this.onTapEmoji = onTapEmoji;
        this.onTapSeeMore = onTapSeeMore;
        this.onTapSoundmoji = onTapSoundmoji;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageContentBindData copy$default(MessageContentBindData messageContentBindData, MessageContentAccessory messageContentAccessory, Function2 function2, Function1 function1, Function3 function3, Function4 function4, Function1 function5, Function2 function6, Function6 function7, Function1 function8, Function1 function9, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, int i7, Object obj) {
        Function1 function17;
        Function1 function18;
        MessageContentAccessory messageContentAccessory2 = (i7 & 1) != 0 ? messageContentBindData.messageContentItem : messageContentAccessory;
        Function2 function19 = (i7 & 2) != 0 ? messageContentBindData.onLinkClicked : function2;
        Function1 function20 = (i7 & 4) != 0 ? messageContentBindData.onLinkLongClicked : function1;
        Function3 function21 = (i7 & 8) != 0 ? messageContentBindData.onTapChannel : function3;
        Function4 function22 = (i7 & 16) != 0 ? messageContentBindData.onLongPressChannel : function4;
        Function1 function23 = (i7 & 32) != 0 ? messageContentBindData.onTapAttachmentLink : function5;
        Function2 function24 = (i7 & 64) != 0 ? messageContentBindData.onLongPressAttachmentLink : function6;
        Function6 function25 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? messageContentBindData.onTapMention : function7;
        Function1 function26 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? messageContentBindData.onTapCommand : function8;
        Function1 function27 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? messageContentBindData.onLongPressCommand : function9;
        Function1 function28 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? messageContentBindData.onTapGameMention : function10;
        Function1 function29 = (i7 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? messageContentBindData.onTapSpoiler : function11;
        Function1 function30 = (i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? messageContentBindData.onTapTimestamp : function12;
        Function1 function31 = (i7 & 8192) != 0 ? messageContentBindData.onTapInlineCode : function13;
        MessageContentAccessory messageContentAccessory3 = messageContentAccessory2;
        Function1 function32 = (i7 & 16384) != 0 ? messageContentBindData.onTapEmoji : function14;
        Function1 function33 = (i7 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? messageContentBindData.onTapSeeMore : function15;
        if ((i7 & 65536) != 0) {
            function18 = function33;
            function17 = messageContentBindData.onTapSoundmoji;
        } else {
            function17 = function16;
            function18 = function33;
        }
        return messageContentBindData.copy(messageContentAccessory3, function19, function20, function21, function22, function23, function24, function25, function26, function27, function28, function29, function30, function31, function32, function18, function17);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MessageContentAccessory getMessageContentItem() {
        return this.messageContentItem;
    }

    @NotNull
    public final Function1<CommandMentionContentNode, Unit> component10() {
        return this.onLongPressCommand;
    }

    @NotNull
    public final Function1<GameMentionContentNode, Unit> component11() {
        return this.onTapGameMention;
    }

    @NotNull
    public final Function1<MessagePartViewHolder, Unit> component12() {
        return this.onTapSpoiler;
    }

    @NotNull
    public final Function1<String, Unit> component13() {
        return this.onTapTimestamp;
    }

    @NotNull
    public final Function1<InlineCodeContentNode, Unit> component14() {
        return this.onTapInlineCode;
    }

    @NotNull
    public final Function1<EmojiContentNode, Unit> component15() {
        return this.onTapEmoji;
    }

    @NotNull
    public final Function1<MessageId, Unit> component16() {
        return this.onTapSeeMore;
    }

    @NotNull
    public final Function1<SoundmojiContentNode, Unit> component17() {
        return this.onTapSoundmoji;
    }

    @NotNull
    public final Function2<MessageId, LinkContentNode, Unit> component2() {
        return this.onLinkClicked;
    }

    @NotNull
    public final Function1<LinkContentNode, Unit> component3() {
        return this.onLinkLongClicked;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Function3 getOnTapChannel() {
        return this.onTapChannel;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Function4 getOnLongPressChannel() {
        return this.onLongPressChannel;
    }

    @NotNull
    public final Function1<String, Unit> component6() {
        return this.onTapAttachmentLink;
    }

    @NotNull
    public final Function2<String, String, Unit> component7() {
        return this.onLongPressAttachmentLink;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Function6 getOnTapMention() {
        return this.onTapMention;
    }

    @NotNull
    public final Function1<CommandMentionContentNode, Unit> component9() {
        return this.onTapCommand;
    }

    @NotNull
    public final MessageContentBindData copy(@NotNull MessageContentAccessory messageContentItem, @NotNull Function2<? super MessageId, ? super LinkContentNode, Unit> onLinkClicked, @NotNull Function1<? super LinkContentNode, Unit> onLinkLongClicked, @NotNull Function3 onTapChannel, @NotNull Function4 onLongPressChannel, @NotNull Function1<? super String, Unit> onTapAttachmentLink, @NotNull Function2<? super String, ? super String, Unit> onLongPressAttachmentLink, @NotNull Function6 onTapMention, @NotNull Function1<? super CommandMentionContentNode, Unit> onTapCommand, @NotNull Function1<? super CommandMentionContentNode, Unit> onLongPressCommand, @NotNull Function1<? super GameMentionContentNode, Unit> onTapGameMention, @NotNull Function1<? super MessagePartViewHolder, Unit> onTapSpoiler, @NotNull Function1<? super String, Unit> onTapTimestamp, @NotNull Function1<? super InlineCodeContentNode, Unit> onTapInlineCode, @NotNull Function1<? super EmojiContentNode, Unit> onTapEmoji, @NotNull Function1<? super MessageId, Unit> onTapSeeMore, @NotNull Function1<? super SoundmojiContentNode, Unit> onTapSoundmoji) {
        Intrinsics.checkNotNullParameter(messageContentItem, "messageContentItem");
        Intrinsics.checkNotNullParameter(onLinkClicked, "onLinkClicked");
        Intrinsics.checkNotNullParameter(onLinkLongClicked, "onLinkLongClicked");
        Intrinsics.checkNotNullParameter(onTapChannel, "onTapChannel");
        Intrinsics.checkNotNullParameter(onLongPressChannel, "onLongPressChannel");
        Intrinsics.checkNotNullParameter(onTapAttachmentLink, "onTapAttachmentLink");
        Intrinsics.checkNotNullParameter(onLongPressAttachmentLink, "onLongPressAttachmentLink");
        Intrinsics.checkNotNullParameter(onTapMention, "onTapMention");
        Intrinsics.checkNotNullParameter(onTapCommand, "onTapCommand");
        Intrinsics.checkNotNullParameter(onLongPressCommand, "onLongPressCommand");
        Intrinsics.checkNotNullParameter(onTapGameMention, "onTapGameMention");
        Intrinsics.checkNotNullParameter(onTapSpoiler, "onTapSpoiler");
        Intrinsics.checkNotNullParameter(onTapTimestamp, "onTapTimestamp");
        Intrinsics.checkNotNullParameter(onTapInlineCode, "onTapInlineCode");
        Intrinsics.checkNotNullParameter(onTapEmoji, "onTapEmoji");
        Intrinsics.checkNotNullParameter(onTapSeeMore, "onTapSeeMore");
        Intrinsics.checkNotNullParameter(onTapSoundmoji, "onTapSoundmoji");
        return new MessageContentBindData(messageContentItem, onLinkClicked, onLinkLongClicked, onTapChannel, onLongPressChannel, onTapAttachmentLink, onLongPressAttachmentLink, onTapMention, onTapCommand, onLongPressCommand, onTapGameMention, onTapSpoiler, onTapTimestamp, onTapInlineCode, onTapEmoji, onTapSeeMore, onTapSoundmoji);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageContentBindData)) {
            return false;
        }
        MessageContentBindData messageContentBindData = (MessageContentBindData) other;
        return Intrinsics.areEqual(this.messageContentItem, messageContentBindData.messageContentItem) && Intrinsics.areEqual(this.onLinkClicked, messageContentBindData.onLinkClicked) && Intrinsics.areEqual(this.onLinkLongClicked, messageContentBindData.onLinkLongClicked) && Intrinsics.areEqual(this.onTapChannel, messageContentBindData.onTapChannel) && Intrinsics.areEqual(this.onLongPressChannel, messageContentBindData.onLongPressChannel) && Intrinsics.areEqual(this.onTapAttachmentLink, messageContentBindData.onTapAttachmentLink) && Intrinsics.areEqual(this.onLongPressAttachmentLink, messageContentBindData.onLongPressAttachmentLink) && Intrinsics.areEqual(this.onTapMention, messageContentBindData.onTapMention) && Intrinsics.areEqual(this.onTapCommand, messageContentBindData.onTapCommand) && Intrinsics.areEqual(this.onLongPressCommand, messageContentBindData.onLongPressCommand) && Intrinsics.areEqual(this.onTapGameMention, messageContentBindData.onTapGameMention) && Intrinsics.areEqual(this.onTapSpoiler, messageContentBindData.onTapSpoiler) && Intrinsics.areEqual(this.onTapTimestamp, messageContentBindData.onTapTimestamp) && Intrinsics.areEqual(this.onTapInlineCode, messageContentBindData.onTapInlineCode) && Intrinsics.areEqual(this.onTapEmoji, messageContentBindData.onTapEmoji) && Intrinsics.areEqual(this.onTapSeeMore, messageContentBindData.onTapSeeMore) && Intrinsics.areEqual(this.onTapSoundmoji, messageContentBindData.onTapSoundmoji);
    }

    @NotNull
    public final MessageContentAccessory getMessageContentItem() {
        return this.messageContentItem;
    }

    @NotNull
    public final Function2<MessageId, LinkContentNode, Unit> getOnLinkClicked() {
        return this.onLinkClicked;
    }

    @NotNull
    public final Function1<LinkContentNode, Unit> getOnLinkLongClicked() {
        return this.onLinkLongClicked;
    }

    @NotNull
    public final Function2<String, String, Unit> getOnLongPressAttachmentLink() {
        return this.onLongPressAttachmentLink;
    }

    @NotNull
    public final Function4 getOnLongPressChannel() {
        return this.onLongPressChannel;
    }

    @NotNull
    public final Function1<CommandMentionContentNode, Unit> getOnLongPressCommand() {
        return this.onLongPressCommand;
    }

    @NotNull
    public final Function1<String, Unit> getOnTapAttachmentLink() {
        return this.onTapAttachmentLink;
    }

    @NotNull
    public final Function3 getOnTapChannel() {
        return this.onTapChannel;
    }

    @NotNull
    public final Function1<CommandMentionContentNode, Unit> getOnTapCommand() {
        return this.onTapCommand;
    }

    @NotNull
    public final Function1<EmojiContentNode, Unit> getOnTapEmoji() {
        return this.onTapEmoji;
    }

    @NotNull
    public final Function1<GameMentionContentNode, Unit> getOnTapGameMention() {
        return this.onTapGameMention;
    }

    @NotNull
    public final Function1<InlineCodeContentNode, Unit> getOnTapInlineCode() {
        return this.onTapInlineCode;
    }

    @NotNull
    public final Function6 getOnTapMention() {
        return this.onTapMention;
    }

    @NotNull
    public final Function1<MessageId, Unit> getOnTapSeeMore() {
        return this.onTapSeeMore;
    }

    @NotNull
    public final Function1<SoundmojiContentNode, Unit> getOnTapSoundmoji() {
        return this.onTapSoundmoji;
    }

    @NotNull
    public final Function1<MessagePartViewHolder, Unit> getOnTapSpoiler() {
        return this.onTapSpoiler;
    }

    @NotNull
    public final Function1<String, Unit> getOnTapTimestamp() {
        return this.onTapTimestamp;
    }

    public int hashCode() {
        return this.onTapSoundmoji.hashCode() + a3.e.e(a3.e.e(a3.e.e(a3.e.e(a3.e.e(a3.e.e(a3.e.e(a3.e.e((this.onTapMention.hashCode() + ((this.onLongPressAttachmentLink.hashCode() + a3.e.e((this.onLongPressChannel.hashCode() + ((this.onTapChannel.hashCode() + a3.e.e((this.onLinkClicked.hashCode() + (this.messageContentItem.hashCode() * 31)) * 31, 31, this.onLinkLongClicked)) * 31)) * 31, 31, this.onTapAttachmentLink)) * 31)) * 31, 31, this.onTapCommand), 31, this.onLongPressCommand), 31, this.onTapGameMention), 31, this.onTapSpoiler), 31, this.onTapTimestamp), 31, this.onTapInlineCode), 31, this.onTapEmoji), 31, this.onTapSeeMore);
    }

    @NotNull
    public String toString() {
        return "MessageContentBindData(messageContentItem=" + this.messageContentItem + ", onLinkClicked=" + this.onLinkClicked + ", onLinkLongClicked=" + this.onLinkLongClicked + ", onTapChannel=" + this.onTapChannel + ", onLongPressChannel=" + this.onLongPressChannel + ", onTapAttachmentLink=" + this.onTapAttachmentLink + ", onLongPressAttachmentLink=" + this.onLongPressAttachmentLink + ", onTapMention=" + this.onTapMention + ", onTapCommand=" + this.onTapCommand + ", onLongPressCommand=" + this.onLongPressCommand + ", onTapGameMention=" + this.onTapGameMention + ", onTapSpoiler=" + this.onTapSpoiler + ", onTapTimestamp=" + this.onTapTimestamp + ", onTapInlineCode=" + this.onTapInlineCode + ", onTapEmoji=" + this.onTapEmoji + ", onTapSeeMore=" + this.onTapSeeMore + ", onTapSoundmoji=" + this.onTapSoundmoji + ")";
    }
}
