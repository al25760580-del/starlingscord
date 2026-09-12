package com.discord.chat.bridge.postpreviewembed;

import a3.e;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.spoiler.SpoilerableData;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import com.discord.chat.presentation.list.a;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.dialog.AlertFragment;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.g;
import or.s1;
import org.jetbrains.annotations.NotNull;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 m2\u00020\u0001:\u0002lmBÕ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001d\u0010\u001eBó\u0001\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010 \u001a\u0004\u0018\u00010\n\u0012\b\u0010!\u001a\u0004\u0018\u00010\n\u0012\b\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\u0004\b\u001d\u0010$J\u0010\u0010D\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bE\u0010&J\u0010\u0010F\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bG\u0010&J\u0010\u0010H\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bI\u0010*J\u0010\u0010J\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bK\u0010&J\t\u0010L\u001a\u00020\nHÆ\u0003J\t\u0010M\u001a\u00020\nHÆ\u0003J\t\u0010N\u001a\u00020\rHÆ\u0003J\t\u0010O\u001a\u00020\u000fHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010W\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010;J\t\u0010X\u001a\u00020\u0018HÆ\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010;J\u0010\u0010Z\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010;J\u0010\u0010[\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010;Jî\u0001\u0010\\\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b]\u0010^J\u0013\u0010_\u001a\u00020\u00182\b\u0010`\u001a\u0004\u0018\u00010aHÖ\u0003J\t\u0010b\u001a\u00020\rHÖ\u0001J\t\u0010c\u001a\u00020\nHÖ\u0001J%\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\u00002\u0006\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020jH\u0001¢\u0006\u0002\bkR\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010'\u001a\u0004\b(\u0010&R\u0013\u0010\u0005\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0013\u0010\u0007\u001a\u00020\b¢\u0006\n\n\u0002\u0010'\u001a\u0004\b,\u0010&R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b3\u0010*R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b5\u0010*R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b6\u0010*R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b7\u0010*R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b8\u0010*R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b9\u0010*R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010<\u001a\u0004\b:\u0010;R\u0011\u0010\u0019\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010<\u001a\u0004\b?\u0010;R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010<\u001a\u0004\b@\u0010;R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010<\u001a\u0004\bA\u0010;R\u0016\u0010 \u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010*R\u0016\u0010!\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010*¨\u0006n"}, d2 = {"Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "Lcom/discord/chat/bridge/spoiler/SpoilerableData;", "parentChannelId", "Lcom/discord/primitives/ChannelId;", "threadId", "messageId", "Lcom/discord/primitives/MessageId;", "guildId", "Lcom/discord/primitives/GuildId;", AlertFragment.ARG_TITLE, "", "ctaText", "ctaButtonColor", "", "footer", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "subtitle", "coverImage", "blurredCoverImage", "coverImageOverlayText", "backgroundImage", "spoiler", "obscure", "obscureAwaitingScan", "", "shouldSpoiler", "obscureHideControls", "obscureIsOpaque", "verifyAge", "<init>", "(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "spoilerOrNull", "obscureOrNull", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/ChannelId;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;ILcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getParentChannelId-o4g7jtM", "()J", "J", "getThreadId-o4g7jtM", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getGuildId-fYKD8eg", "getTitle", "getCtaText", "getCtaButtonColor", "()I", "getFooter", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getSubtitle", "getCoverImage", "getBlurredCoverImage", "getCoverImageOverlayText", "getBackgroundImage", "getSpoiler", "getObscure", "getObscureAwaitingScan", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShouldSpoiler", "()Z", "getObscureHideControls", "getObscureIsOpaque", "getVerifyAge", "getSpoilerOrNull", "getObscureOrNull", "component1", "component1-o4g7jtM", "component2", "component2-o4g7jtM", "component3", "component3-3Eiw7ao", "component4", "component4-fYKD8eg", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "copy-15l5paM", "(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPostPreviewEmbed.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostPreviewEmbed.kt\ncom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
public final /* data */ class PostPreviewEmbed implements SpoilerableData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final String backgroundImage;
    private final String blurredCoverImage;
    private final String coverImage;
    private final String coverImageOverlayText;
    private final int ctaButtonColor;

    @NotNull
    private final String ctaText;

    @NotNull
    private final StructurableText footer;
    private final long guildId;

    @NotNull
    private final String messageId;
    private final String obscure;
    private final Boolean obscureAwaitingScan;
    private final Boolean obscureHideControls;
    private final Boolean obscureIsOpaque;
    private final String obscureOrNull;
    private final long parentChannelId;
    private final boolean shouldSpoiler;
    private final String spoiler;
    private final String spoilerOrNull;
    private final String subtitle;
    private final long threadId;

    @NotNull
    private final String title;
    private final Boolean verifyAge;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return PostPreviewEmbed$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PostPreviewEmbed(int i7, ChannelId channelId, ChannelId channelId2, String str, GuildId guildId, String str2, String str3, int i10, StructurableText structurableText, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, boolean z5, Boolean bool2, Boolean bool3, Boolean bool4, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, channelId, channelId2, str, guildId, str2, str3, i10, structurableText, str4, str5, str6, str7, str8, str9, str10, bool, z5, bool2, bool3, bool4, str11, str12, serializationConstructorMarker);
    }

    /* JADX INFO: renamed from: copy-15l5paM$default, reason: not valid java name */
    public static /* synthetic */ PostPreviewEmbed m426copy15l5paM$default(PostPreviewEmbed postPreviewEmbed, long j, long j5, String str, long j7, String str2, String str3, int i7, StructurableText structurableText, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, boolean z5, Boolean bool2, Boolean bool3, Boolean bool4, int i10, Object obj) {
        Boolean bool5;
        Boolean bool6;
        long j10 = (i10 & 1) != 0 ? postPreviewEmbed.parentChannelId : j;
        long j11 = (i10 & 2) != 0 ? postPreviewEmbed.threadId : j5;
        String str11 = (i10 & 4) != 0 ? postPreviewEmbed.messageId : str;
        long j12 = (i10 & 8) != 0 ? postPreviewEmbed.guildId : j7;
        String str12 = (i10 & 16) != 0 ? postPreviewEmbed.title : str2;
        String str13 = (i10 & 32) != 0 ? postPreviewEmbed.ctaText : str3;
        int i11 = (i10 & 64) != 0 ? postPreviewEmbed.ctaButtonColor : i7;
        StructurableText structurableText2 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? postPreviewEmbed.footer : structurableText;
        String str14 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? postPreviewEmbed.subtitle : str4;
        String str15 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? postPreviewEmbed.coverImage : str5;
        String str16 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? postPreviewEmbed.blurredCoverImage : str6;
        long j13 = j10;
        String str17 = (i10 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? postPreviewEmbed.coverImageOverlayText : str7;
        String str18 = (i10 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? postPreviewEmbed.backgroundImage : str8;
        String str19 = str17;
        String str20 = (i10 & 8192) != 0 ? postPreviewEmbed.spoiler : str9;
        String str21 = (i10 & 16384) != 0 ? postPreviewEmbed.obscure : str10;
        Boolean bool7 = (i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? postPreviewEmbed.obscureAwaitingScan : bool;
        boolean z6 = (i10 & 65536) != 0 ? postPreviewEmbed.shouldSpoiler : z5;
        Boolean bool8 = (i10 & 131072) != 0 ? postPreviewEmbed.obscureHideControls : bool2;
        Boolean bool9 = (i10 & 262144) != 0 ? postPreviewEmbed.obscureIsOpaque : bool3;
        if ((i10 & 524288) != 0) {
            bool6 = bool9;
            bool5 = postPreviewEmbed.verifyAge;
        } else {
            bool5 = bool4;
            bool6 = bool9;
        }
        return postPreviewEmbed.m431copy15l5paM(j13, j11, str11, j12, str12, str13, i11, structurableText2, str14, str15, str16, str19, str18, str20, str21, bool7, z6, bool8, bool6, bool5);
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0156  */
    public static final /* synthetic */ void write$Self$chat_release(PostPreviewEmbed self, CompositeEncoder output, SerialDescriptor serialDesc) {
        ChannelId$$serializer channelId$$serializer = ChannelId$$serializer.INSTANCE;
        output.g(serialDesc, 0, channelId$$serializer, ChannelId.m1130boximpl(self.parentChannelId));
        output.g(serialDesc, 1, channelId$$serializer, ChannelId.m1130boximpl(self.threadId));
        output.g(serialDesc, 2, MessageId$$serializer.INSTANCE, MessageId.m1156boximpl(self.messageId));
        output.g(serialDesc, 3, GuildId$$serializer.INSTANCE, GuildId.m1143boximpl(self.guildId));
        output.q(serialDesc, 4, self.title);
        output.q(serialDesc, 5, self.ctaText);
        output.l(6, self.ctaButtonColor, serialDesc);
        output.g(serialDesc, 7, StructurableTextSerializer.INSTANCE, self.footer);
        if (output.u(serialDesc, 8) || self.subtitle != null) {
            output.r(serialDesc, 8, s1.f17602a, self.subtitle);
        }
        if (output.u(serialDesc, 9) || self.coverImage != null) {
            output.r(serialDesc, 9, s1.f17602a, self.coverImage);
        }
        if (output.u(serialDesc, 10) || self.blurredCoverImage != null) {
            output.r(serialDesc, 10, s1.f17602a, self.blurredCoverImage);
        }
        if (output.u(serialDesc, 11) || self.coverImageOverlayText != null) {
            output.r(serialDesc, 11, s1.f17602a, self.coverImageOverlayText);
        }
        if (output.u(serialDesc, 12) || self.backgroundImage != null) {
            output.r(serialDesc, 12, s1.f17602a, self.backgroundImage);
        }
        if (output.u(serialDesc, 13) || self.spoiler != null) {
            output.r(serialDesc, 13, s1.f17602a, self.spoiler);
        }
        if (output.u(serialDesc, 14) || self.obscure != null) {
            output.r(serialDesc, 14, s1.f17602a, self.obscure);
        }
        if (output.u(serialDesc, 15) || self.obscureAwaitingScan != null) {
            output.r(serialDesc, 15, g.f17537a, self.obscureAwaitingScan);
        }
        if (output.u(serialDesc, 16) || self.shouldSpoiler) {
            output.p(serialDesc, 16, self.shouldSpoiler);
        }
        if (output.u(serialDesc, 17) || self.obscureHideControls != null) {
            output.r(serialDesc, 17, g.f17537a, self.obscureHideControls);
        }
        if (output.u(serialDesc, 18) || self.obscureIsOpaque != null) {
            output.r(serialDesc, 18, g.f17537a, self.obscureIsOpaque);
        }
        if (output.u(serialDesc, 19) || self.verifyAge != null) {
            output.r(serialDesc, 19, g.f17537a, self.verifyAge);
        }
        String str = null;
        if (output.u(serialDesc, 20)) {
            output.r(serialDesc, 20, s1.f17602a, self.getSpoilerOrNull());
        } else {
            String spoilerOrNull = self.getSpoilerOrNull();
            String str2 = self.spoiler;
            if (str2 == null || StringsKt.K(str2)) {
                str2 = null;
            }
            if (!Intrinsics.areEqual(spoilerOrNull, str2)) {
                output.r(serialDesc, 20, s1.f17602a, self.getSpoilerOrNull());
            }
        }
        if (!output.u(serialDesc, 21)) {
            String obscureOrNull = self.getObscureOrNull();
            String str3 = self.obscure;
            if (str3 != null && !StringsKt.K(str3)) {
                str = str3;
            }
            if (Intrinsics.areEqual(obscureOrNull, str)) {
                return;
            }
        }
        output.r(serialDesc, 21, s1.f17602a, self.getObscureOrNull());
    }

    /* JADX INFO: renamed from: component1-o4g7jtM, reason: not valid java name and from getter */
    public final long getParentChannelId() {
        return this.parentChannelId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCoverImage() {
        return this.coverImage;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBlurredCoverImage() {
        return this.blurredCoverImage;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCoverImageOverlayText() {
        return this.coverImageOverlayText;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getSpoiler() {
        return this.spoiler;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getObscure() {
        return this.obscure;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getObscureAwaitingScan() {
        return this.obscureAwaitingScan;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getShouldSpoiler() {
        return this.shouldSpoiler;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getObscureHideControls() {
        return this.obscureHideControls;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Boolean getObscureIsOpaque() {
        return this.obscureIsOpaque;
    }

    /* JADX INFO: renamed from: component2-o4g7jtM, reason: not valid java name and from getter */
    public final long getThreadId() {
        return this.threadId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Boolean getVerifyAge() {
        return this.verifyAge;
    }

    @NotNull
    /* JADX INFO: renamed from: component3-3Eiw7ao, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component4-fYKD8eg, reason: not valid java name and from getter */
    public final long getGuildId() {
        return this.guildId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getCtaButtonColor() {
        return this.ctaButtonColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final StructurableText getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-15l5paM, reason: not valid java name */
    public final PostPreviewEmbed m431copy15l5paM(long parentChannelId, long threadId, @NotNull String messageId, long guildId, @NotNull String title, @NotNull String ctaText, int ctaButtonColor, @NotNull StructurableText footer, String subtitle, String coverImage, String blurredCoverImage, String coverImageOverlayText, String backgroundImage, String spoiler, String obscure, Boolean obscureAwaitingScan, boolean shouldSpoiler, Boolean obscureHideControls, Boolean obscureIsOpaque, Boolean verifyAge) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        Intrinsics.checkNotNullParameter(footer, "footer");
        return new PostPreviewEmbed(parentChannelId, threadId, messageId, guildId, title, ctaText, ctaButtonColor, footer, subtitle, coverImage, blurredCoverImage, coverImageOverlayText, backgroundImage, spoiler, obscure, obscureAwaitingScan, shouldSpoiler, obscureHideControls, obscureIsOpaque, verifyAge, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostPreviewEmbed)) {
            return false;
        }
        PostPreviewEmbed postPreviewEmbed = (PostPreviewEmbed) other;
        return ChannelId.m1134equalsimpl0(this.parentChannelId, postPreviewEmbed.parentChannelId) && ChannelId.m1134equalsimpl0(this.threadId, postPreviewEmbed.threadId) && MessageId.m1160equalsimpl0(this.messageId, postPreviewEmbed.messageId) && GuildId.m1147equalsimpl0(this.guildId, postPreviewEmbed.guildId) && Intrinsics.areEqual(this.title, postPreviewEmbed.title) && Intrinsics.areEqual(this.ctaText, postPreviewEmbed.ctaText) && this.ctaButtonColor == postPreviewEmbed.ctaButtonColor && Intrinsics.areEqual(this.footer, postPreviewEmbed.footer) && Intrinsics.areEqual(this.subtitle, postPreviewEmbed.subtitle) && Intrinsics.areEqual(this.coverImage, postPreviewEmbed.coverImage) && Intrinsics.areEqual(this.blurredCoverImage, postPreviewEmbed.blurredCoverImage) && Intrinsics.areEqual(this.coverImageOverlayText, postPreviewEmbed.coverImageOverlayText) && Intrinsics.areEqual(this.backgroundImage, postPreviewEmbed.backgroundImage) && Intrinsics.areEqual(this.spoiler, postPreviewEmbed.spoiler) && Intrinsics.areEqual(this.obscure, postPreviewEmbed.obscure) && Intrinsics.areEqual(this.obscureAwaitingScan, postPreviewEmbed.obscureAwaitingScan) && this.shouldSpoiler == postPreviewEmbed.shouldSpoiler && Intrinsics.areEqual(this.obscureHideControls, postPreviewEmbed.obscureHideControls) && Intrinsics.areEqual(this.obscureIsOpaque, postPreviewEmbed.obscureIsOpaque) && Intrinsics.areEqual(this.verifyAge, postPreviewEmbed.verifyAge);
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final String getBlurredCoverImage() {
        return this.blurredCoverImage;
    }

    public final String getCoverImage() {
        return this.coverImage;
    }

    public final String getCoverImageOverlayText() {
        return this.coverImageOverlayText;
    }

    public final int getCtaButtonColor() {
        return this.ctaButtonColor;
    }

    @NotNull
    public final String getCtaText() {
        return this.ctaText;
    }

    @NotNull
    public final StructurableText getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: getGuildId-fYKD8eg, reason: not valid java name */
    public final long m432getGuildIdfYKD8eg() {
        return this.guildId;
    }

    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao, reason: not valid java name */
    public final String m433getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final String getObscure() {
        return this.obscure;
    }

    public final Boolean getObscureAwaitingScan() {
        return this.obscureAwaitingScan;
    }

    public final Boolean getObscureHideControls() {
        return this.obscureHideControls;
    }

    public final Boolean getObscureIsOpaque() {
        return this.obscureIsOpaque;
    }

    @Override // com.discord.chat.bridge.spoiler.SpoilerableData
    public String getObscureOrNull() {
        return this.obscureOrNull;
    }

    /* JADX INFO: renamed from: getParentChannelId-o4g7jtM, reason: not valid java name */
    public final long m434getParentChannelIdo4g7jtM() {
        return this.parentChannelId;
    }

    public final boolean getShouldSpoiler() {
        return this.shouldSpoiler;
    }

    public final String getSpoiler() {
        return this.spoiler;
    }

    @Override // com.discord.chat.bridge.spoiler.SpoilerableData
    public String getSpoilerOrNull() {
        return this.spoilerOrNull;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: getThreadId-o4g7jtM, reason: not valid java name */
    public final long m435getThreadIdo4g7jtM() {
        return this.threadId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final Boolean getVerifyAge() {
        return this.verifyAge;
    }

    public int hashCode() {
        int iHashCode = (this.footer.hashCode() + a.u(this.ctaButtonColor, e.d(e.d((GuildId.m1148hashCodeimpl(this.guildId) + ((MessageId.m1161hashCodeimpl(this.messageId) + b.d(this.threadId, ChannelId.m1135hashCodeimpl(this.parentChannelId) * 31, 31)) * 31)) * 31, 31, this.title), 31, this.ctaText), 31)) * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.coverImage;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.blurredCoverImage;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.coverImageOverlayText;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.backgroundImage;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.spoiler;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.obscure;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.obscureAwaitingScan;
        int iG = a.g((iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.shouldSpoiler);
        Boolean bool2 = this.obscureHideControls;
        int iHashCode9 = (iG + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.obscureIsOpaque;
        int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.verifyAge;
        return iHashCode10 + (bool4 != null ? bool4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String strM1137toStringimpl = ChannelId.m1137toStringimpl(this.parentChannelId);
        String strM1137toStringimpl2 = ChannelId.m1137toStringimpl(this.threadId);
        String strM1163toStringimpl = MessageId.m1163toStringimpl(this.messageId);
        String strM1150toStringimpl = GuildId.m1150toStringimpl(this.guildId);
        String str = this.title;
        String str2 = this.ctaText;
        int i7 = this.ctaButtonColor;
        StructurableText structurableText = this.footer;
        String str3 = this.subtitle;
        String str4 = this.coverImage;
        String str5 = this.blurredCoverImage;
        String str6 = this.coverImageOverlayText;
        String str7 = this.backgroundImage;
        String str8 = this.spoiler;
        String str9 = this.obscure;
        Boolean bool = this.obscureAwaitingScan;
        boolean z5 = this.shouldSpoiler;
        Boolean bool2 = this.obscureHideControls;
        Boolean bool3 = this.obscureIsOpaque;
        Boolean bool4 = this.verifyAge;
        StringBuilder sbU = e.u("PostPreviewEmbed(parentChannelId=", strM1137toStringimpl, ", threadId=", strM1137toStringimpl2, ", messageId=");
        e.A(sbU, strM1163toStringimpl, ", guildId=", strM1150toStringimpl, ", title=");
        e.A(sbU, str, ", ctaText=", str2, ", ctaButtonColor=");
        sbU.append(i7);
        sbU.append(", footer=");
        sbU.append(structurableText);
        sbU.append(", subtitle=");
        e.A(sbU, str3, ", coverImage=", str4, ", blurredCoverImage=");
        e.A(sbU, str5, ", coverImageOverlayText=", str6, ", backgroundImage=");
        e.A(sbU, str7, ", spoiler=", str8, ", obscure=");
        sbU.append(str9);
        sbU.append(", obscureAwaitingScan=");
        sbU.append(bool);
        sbU.append(", shouldSpoiler=");
        sbU.append(z5);
        sbU.append(", obscureHideControls=");
        sbU.append(bool2);
        sbU.append(", obscureIsOpaque=");
        sbU.append(bool3);
        sbU.append(", verifyAge=");
        sbU.append(bool4);
        sbU.append(")");
        return sbU.toString();
    }

    public /* synthetic */ PostPreviewEmbed(long j, long j5, String str, long j7, String str2, String str3, int i7, StructurableText structurableText, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, boolean z5, Boolean bool2, Boolean bool3, Boolean bool4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j5, str, j7, str2, str3, i7, structurableText, str4, str5, str6, str7, str8, str9, str10, bool, z5, bool2, bool3, bool4);
    }

    private /* synthetic */ PostPreviewEmbed(int i7, ChannelId channelId, ChannelId channelId2, String str, GuildId guildId, String str2, String str3, int i10, StructurableText structurableText, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, boolean z5, Boolean bool2, Boolean bool3, Boolean bool4, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        String str13;
        String str14 = null;
        if (255 != (i7 & 255)) {
            e1.l(i7, 255, PostPreviewEmbed$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.parentChannelId = channelId.m1139unboximpl();
        this.threadId = channelId2.m1139unboximpl();
        this.messageId = str;
        this.guildId = guildId.m1152unboximpl();
        this.title = str2;
        this.ctaText = str3;
        this.ctaButtonColor = i10;
        this.footer = structurableText;
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str4;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.coverImage = null;
        } else {
            this.coverImage = str5;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
            this.blurredCoverImage = null;
        } else {
            this.blurredCoverImage = str6;
        }
        if ((i7 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.coverImageOverlayText = null;
        } else {
            this.coverImageOverlayText = str7;
        }
        if ((i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.backgroundImage = null;
        } else {
            this.backgroundImage = str8;
        }
        if ((i7 & 8192) == 0) {
            this.spoiler = null;
        } else {
            this.spoiler = str9;
        }
        if ((i7 & 16384) == 0) {
            this.obscure = null;
        } else {
            this.obscure = str10;
        }
        if ((32768 & i7) == 0) {
            this.obscureAwaitingScan = null;
        } else {
            this.obscureAwaitingScan = bool;
        }
        this.shouldSpoiler = (65536 & i7) == 0 ? false : z5;
        if ((131072 & i7) == 0) {
            this.obscureHideControls = null;
        } else {
            this.obscureHideControls = bool2;
        }
        if ((262144 & i7) == 0) {
            this.obscureIsOpaque = null;
        } else {
            this.obscureIsOpaque = bool3;
        }
        if ((524288 & i7) == 0) {
            this.verifyAge = null;
        } else {
            this.verifyAge = bool4;
        }
        if ((1048576 & i7) == 0) {
            str13 = this.spoiler;
            if (str13 == null || StringsKt.K(str13)) {
                str13 = null;
            }
        } else {
            str13 = str11;
        }
        this.spoilerOrNull = str13;
        if ((i7 & 2097152) != 0) {
            this.obscureOrNull = str12;
            return;
        }
        String str15 = this.obscure;
        if (str15 != null && !StringsKt.K(str15)) {
            str14 = str15;
        }
        this.obscureOrNull = str14;
    }

    private PostPreviewEmbed(long j, long j5, String messageId, long j7, String title, String ctaText, int i7, StructurableText footer, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, boolean z5, Boolean bool2, Boolean bool3, Boolean bool4) {
        String str8 = str6;
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.parentChannelId = j;
        this.threadId = j5;
        this.messageId = messageId;
        this.guildId = j7;
        this.title = title;
        this.ctaText = ctaText;
        this.ctaButtonColor = i7;
        this.footer = footer;
        this.subtitle = str;
        this.coverImage = str2;
        this.blurredCoverImage = str3;
        this.coverImageOverlayText = str4;
        this.backgroundImage = str5;
        this.spoiler = str8;
        this.obscure = str7;
        this.obscureAwaitingScan = bool;
        this.shouldSpoiler = z5;
        this.obscureHideControls = bool2;
        this.obscureIsOpaque = bool3;
        this.verifyAge = bool4;
        String str9 = null;
        this.spoilerOrNull = (str8 == null || StringsKt.K(str8)) ? null : str8;
        if (str7 != null && !StringsKt.K(str7)) {
            str9 = str7;
        }
        this.obscureOrNull = str9;
    }

    public /* synthetic */ PostPreviewEmbed(long j, long j5, String str, long j7, String str2, String str3, int i7, StructurableText structurableText, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, boolean z5, Boolean bool2, Boolean bool3, Boolean bool4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j5, str, j7, str2, str3, i7, structurableText, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str4, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : str5, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : str6, (i10 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : str7, (i10 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str8, (i10 & 8192) != 0 ? null : str9, (i10 & 16384) != 0 ? null : str10, (32768 & i10) != 0 ? null : bool, (65536 & i10) != 0 ? false : z5, (131072 & i10) != 0 ? null : bool2, (262144 & i10) != 0 ? null : bool3, (i10 & 524288) != 0 ? null : bool4, null);
    }
}
