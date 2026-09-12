package com.discord.chat.presentation.message.view.botuikit;

import a3.e;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.GameMentionContentNode;
import com.discord.chat.bridge.contentnode.InlineCodeContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.contentnode.SoundmojiContentNode;
import com.discord.user_search_worker.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012*\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00040\n\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\r\u0012:\u0010\u0010\u001a6\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00040\u000f\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u001c\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J,\u0010$\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J4\u0010&\u001a&\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00040\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u001c\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\"J\"\u0010)\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\rHÆ\u0003¢\u0006\u0004\b)\u0010*JD\u0010+\u001a6\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00040\u000fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u001c\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\"J\u001c\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\"J\u001c\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\"J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016HÆ\u0003¢\u0006\u0004\b0\u00101J\u001c\u00102\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b2\u0010\"J\u001c\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b3\u0010\"J\u001c\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b4\u0010\"J\u001c\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b5\u0010\"Jª\u0003\u00106\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022$\b\u0002\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00040\u00072,\b\u0002\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00040\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\r2<\b\u0002\u0010\u0010\u001a6\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010;\u001a\u00020:HÖ\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010?\u001a\u00020>2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b?\u0010@R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010\"R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bC\u0010\"R3\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010D\u001a\u0004\bE\u0010%R;\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00040\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010F\u001a\u0004\bG\u0010'R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bH\u0010\"R)\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bJ\u0010*RK\u0010\u0010\u001a6\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010K\u001a\u0004\bL\u0010,R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bM\u0010\"R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bN\u0010\"R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010A\u001a\u0004\bO\u0010\"R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010P\u001a\u0004\bQ\u00101R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\bR\u0010\"R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010A\u001a\u0004\bS\u0010\"R#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010A\u001a\u0004\bT\u0010\"R#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010A\u001a\u0004\bU\u0010\"¨\u0006V"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/MarkdownTextRenderEventHandlers;", "", "Lkotlin/Function1;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "", "onLinkClicked", "onLinkLongClicked", "Lkotlin/Function3;", "", "onTapChannel", "Lkotlin/Function4;", "onLongPressChannel", "onTapAttachmentLink", "Lkotlin/Function2;", "onLongPressAttachmentLink", "Lkotlin/Function6;", "onTapMention", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onTapCommand", "onLongPressCommand", "Lcom/discord/chat/bridge/contentnode/GameMentionContentNode;", "onTapGameMention", "Lkotlin/Function0;", "onTapSpoiler", "onTapTimestamp", "Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;", "onTapInlineCode", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "onTapEmoji", "Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;", "onTapSoundmoji", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "component1", "()Lkotlin/jvm/functions/Function1;", "component2", "component3", "()Lkotlin/jvm/functions/Function3;", "component4", "()Lkotlin/jvm/functions/Function4;", "component5", "component6", "()Lkotlin/jvm/functions/Function2;", "component7", "()Lkotlin/jvm/functions/Function6;", "component8", "component9", "component10", "component11", "()Lkotlin/jvm/functions/Function0;", "component12", "component13", "component14", "component15", "copy", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/discord/chat/presentation/message/view/botuikit/MarkdownTextRenderEventHandlers;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function1;", "getOnLinkClicked", "getOnLinkLongClicked", "Lkotlin/jvm/functions/Function3;", "getOnTapChannel", "Lkotlin/jvm/functions/Function4;", "getOnLongPressChannel", "getOnTapAttachmentLink", "Lkotlin/jvm/functions/Function2;", "getOnLongPressAttachmentLink", "Lkotlin/jvm/functions/Function6;", "getOnTapMention", "getOnTapCommand", "getOnLongPressCommand", "getOnTapGameMention", "Lkotlin/jvm/functions/Function0;", "getOnTapSpoiler", "getOnTapTimestamp", "getOnTapInlineCode", "getOnTapEmoji", "getOnTapSoundmoji", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MarkdownTextRenderEventHandlers {

    @NotNull
    private final Function1<LinkContentNode, Unit> onLinkClicked;

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
    private final Function1<SoundmojiContentNode, Unit> onTapSoundmoji;

    @NotNull
    private final Function0<Unit> onTapSpoiler;

    @NotNull
    private final Function1<String, Unit> onTapTimestamp;

    /* JADX WARN: Multi-variable type inference failed */
    public MarkdownTextRenderEventHandlers(@NotNull Function1<? super LinkContentNode, Unit> onLinkClicked, @NotNull Function1<? super LinkContentNode, Unit> onLinkLongClicked, @NotNull Function3 onTapChannel, @NotNull Function4 onLongPressChannel, @NotNull Function1<? super String, Unit> onTapAttachmentLink, @NotNull Function2<? super String, ? super String, Unit> onLongPressAttachmentLink, @NotNull Function6 onTapMention, @NotNull Function1<? super CommandMentionContentNode, Unit> onTapCommand, @NotNull Function1<? super CommandMentionContentNode, Unit> onLongPressCommand, @NotNull Function1<? super GameMentionContentNode, Unit> onTapGameMention, @NotNull Function0<Unit> onTapSpoiler, @NotNull Function1<? super String, Unit> onTapTimestamp, @NotNull Function1<? super InlineCodeContentNode, Unit> onTapInlineCode, @NotNull Function1<? super EmojiContentNode, Unit> onTapEmoji, @NotNull Function1<? super SoundmojiContentNode, Unit> onTapSoundmoji) {
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
        Intrinsics.checkNotNullParameter(onTapSoundmoji, "onTapSoundmoji");
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
        this.onTapSoundmoji = onTapSoundmoji;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(GameMentionContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    @NotNull
    public final Function1<LinkContentNode, Unit> component1() {
        return this.onLinkClicked;
    }

    @NotNull
    public final Function1<GameMentionContentNode, Unit> component10() {
        return this.onTapGameMention;
    }

    @NotNull
    public final Function0<Unit> component11() {
        return this.onTapSpoiler;
    }

    @NotNull
    public final Function1<String, Unit> component12() {
        return this.onTapTimestamp;
    }

    @NotNull
    public final Function1<InlineCodeContentNode, Unit> component13() {
        return this.onTapInlineCode;
    }

    @NotNull
    public final Function1<EmojiContentNode, Unit> component14() {
        return this.onTapEmoji;
    }

    @NotNull
    public final Function1<SoundmojiContentNode, Unit> component15() {
        return this.onTapSoundmoji;
    }

    @NotNull
    public final Function1<LinkContentNode, Unit> component2() {
        return this.onLinkLongClicked;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Function3 getOnTapChannel() {
        return this.onTapChannel;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Function4 getOnLongPressChannel() {
        return this.onLongPressChannel;
    }

    @NotNull
    public final Function1<String, Unit> component5() {
        return this.onTapAttachmentLink;
    }

    @NotNull
    public final Function2<String, String, Unit> component6() {
        return this.onLongPressAttachmentLink;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Function6 getOnTapMention() {
        return this.onTapMention;
    }

    @NotNull
    public final Function1<CommandMentionContentNode, Unit> component8() {
        return this.onTapCommand;
    }

    @NotNull
    public final Function1<CommandMentionContentNode, Unit> component9() {
        return this.onLongPressCommand;
    }

    @NotNull
    public final MarkdownTextRenderEventHandlers copy(@NotNull Function1<? super LinkContentNode, Unit> onLinkClicked, @NotNull Function1<? super LinkContentNode, Unit> onLinkLongClicked, @NotNull Function3 onTapChannel, @NotNull Function4 onLongPressChannel, @NotNull Function1<? super String, Unit> onTapAttachmentLink, @NotNull Function2<? super String, ? super String, Unit> onLongPressAttachmentLink, @NotNull Function6 onTapMention, @NotNull Function1<? super CommandMentionContentNode, Unit> onTapCommand, @NotNull Function1<? super CommandMentionContentNode, Unit> onLongPressCommand, @NotNull Function1<? super GameMentionContentNode, Unit> onTapGameMention, @NotNull Function0<Unit> onTapSpoiler, @NotNull Function1<? super String, Unit> onTapTimestamp, @NotNull Function1<? super InlineCodeContentNode, Unit> onTapInlineCode, @NotNull Function1<? super EmojiContentNode, Unit> onTapEmoji, @NotNull Function1<? super SoundmojiContentNode, Unit> onTapSoundmoji) {
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
        Intrinsics.checkNotNullParameter(onTapSoundmoji, "onTapSoundmoji");
        return new MarkdownTextRenderEventHandlers(onLinkClicked, onLinkLongClicked, onTapChannel, onLongPressChannel, onTapAttachmentLink, onLongPressAttachmentLink, onTapMention, onTapCommand, onLongPressCommand, onTapGameMention, onTapSpoiler, onTapTimestamp, onTapInlineCode, onTapEmoji, onTapSoundmoji);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkdownTextRenderEventHandlers)) {
            return false;
        }
        MarkdownTextRenderEventHandlers markdownTextRenderEventHandlers = (MarkdownTextRenderEventHandlers) other;
        return Intrinsics.areEqual(this.onLinkClicked, markdownTextRenderEventHandlers.onLinkClicked) && Intrinsics.areEqual(this.onLinkLongClicked, markdownTextRenderEventHandlers.onLinkLongClicked) && Intrinsics.areEqual(this.onTapChannel, markdownTextRenderEventHandlers.onTapChannel) && Intrinsics.areEqual(this.onLongPressChannel, markdownTextRenderEventHandlers.onLongPressChannel) && Intrinsics.areEqual(this.onTapAttachmentLink, markdownTextRenderEventHandlers.onTapAttachmentLink) && Intrinsics.areEqual(this.onLongPressAttachmentLink, markdownTextRenderEventHandlers.onLongPressAttachmentLink) && Intrinsics.areEqual(this.onTapMention, markdownTextRenderEventHandlers.onTapMention) && Intrinsics.areEqual(this.onTapCommand, markdownTextRenderEventHandlers.onTapCommand) && Intrinsics.areEqual(this.onLongPressCommand, markdownTextRenderEventHandlers.onLongPressCommand) && Intrinsics.areEqual(this.onTapGameMention, markdownTextRenderEventHandlers.onTapGameMention) && Intrinsics.areEqual(this.onTapSpoiler, markdownTextRenderEventHandlers.onTapSpoiler) && Intrinsics.areEqual(this.onTapTimestamp, markdownTextRenderEventHandlers.onTapTimestamp) && Intrinsics.areEqual(this.onTapInlineCode, markdownTextRenderEventHandlers.onTapInlineCode) && Intrinsics.areEqual(this.onTapEmoji, markdownTextRenderEventHandlers.onTapEmoji) && Intrinsics.areEqual(this.onTapSoundmoji, markdownTextRenderEventHandlers.onTapSoundmoji);
    }

    @NotNull
    public final Function1<LinkContentNode, Unit> getOnLinkClicked() {
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
    public final Function1<SoundmojiContentNode, Unit> getOnTapSoundmoji() {
        return this.onTapSoundmoji;
    }

    @NotNull
    public final Function0<Unit> getOnTapSpoiler() {
        return this.onTapSpoiler;
    }

    @NotNull
    public final Function1<String, Unit> getOnTapTimestamp() {
        return this.onTapTimestamp;
    }

    public int hashCode() {
        return this.onTapSoundmoji.hashCode() + e.e(e.e(e.e((this.onTapSpoiler.hashCode() + e.e(e.e(e.e((this.onTapMention.hashCode() + ((this.onLongPressAttachmentLink.hashCode() + e.e((this.onLongPressChannel.hashCode() + ((this.onTapChannel.hashCode() + e.e(this.onLinkClicked.hashCode() * 31, 31, this.onLinkLongClicked)) * 31)) * 31, 31, this.onTapAttachmentLink)) * 31)) * 31, 31, this.onTapCommand), 31, this.onLongPressCommand), 31, this.onTapGameMention)) * 31, 31, this.onTapTimestamp), 31, this.onTapInlineCode), 31, this.onTapEmoji);
    }

    @NotNull
    public String toString() {
        return "MarkdownTextRenderEventHandlers(onLinkClicked=" + this.onLinkClicked + ", onLinkLongClicked=" + this.onLinkLongClicked + ", onTapChannel=" + this.onTapChannel + ", onLongPressChannel=" + this.onLongPressChannel + ", onTapAttachmentLink=" + this.onTapAttachmentLink + ", onLongPressAttachmentLink=" + this.onLongPressAttachmentLink + ", onTapMention=" + this.onTapMention + ", onTapCommand=" + this.onTapCommand + ", onLongPressCommand=" + this.onLongPressCommand + ", onTapGameMention=" + this.onTapGameMention + ", onTapSpoiler=" + this.onTapSpoiler + ", onTapTimestamp=" + this.onTapTimestamp + ", onTapInlineCode=" + this.onTapInlineCode + ", onTapEmoji=" + this.onTapEmoji + ", onTapSoundmoji=" + this.onTapSoundmoji + ")";
    }

    public /* synthetic */ MarkdownTextRenderEventHandlers(Function1 function1, Function1 function2, Function3 function3, Function4 function4, Function1 function5, Function2 function6, Function6 function7, Function1 function8, Function1 function9, Function1 function10, Function0 function0, Function1 function11, Function1 function12, Function1 function13, Function1 function14, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function2, function3, function4, function5, function6, function7, function8, function9, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new a(15) : function10, function0, function11, function12, function13, function14);
    }
}
