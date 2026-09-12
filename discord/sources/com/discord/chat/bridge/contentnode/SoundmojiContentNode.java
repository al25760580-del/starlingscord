package com.discord.chat.bridge.contentnode;

import a3.e;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002<=BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fBi\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000e\u0010\u0014J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010\u0018J\u0010\u0010%\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b&\u0010\u0016J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jh\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0013\u0010/\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020\u0011HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001J%\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0001¢\u0006\u0002\b;R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016¨\u0006>"}, d2 = {"Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "soundId", "", "channelId", "Lcom/discord/primitives/ChannelId;", "messageId", "Lcom/discord/primitives/MessageId;", "content", "guildId", "jumboable", "", "emojiId", "emojiName", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSoundId", "()Ljava/lang/String;", "getChannelId-o4g7jtM", "()J", "J", "getMessageId-3Eiw7ao", "Ljava/lang/String;", "getContent", "getGuildId", "getJumboable", "()Z", "getEmojiId", "getEmojiName", "component1", "component2", "component2-o4g7jtM", "component3", "component3-3Eiw7ao", "component4", "component5", "component6", "component7", "component8", "copy", "copy-FdtyiUI", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SoundmojiContentNode extends ContentNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long channelId;
    private final String content;
    private final String emojiId;
    private final String emojiName;
    private final String guildId;
    private final boolean jumboable;

    @NotNull
    private final String messageId;

    @NotNull
    private final String soundId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return SoundmojiContentNode$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SoundmojiContentNode(int i7, String str, ChannelId channelId, String str2, String str3, String str4, boolean z5, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, str, channelId, str2, str3, str4, z5, str5, str6, serializationConstructorMarker);
    }

    /* JADX INFO: renamed from: copy-FdtyiUI$default, reason: not valid java name */
    public static /* synthetic */ SoundmojiContentNode m400copyFdtyiUI$default(SoundmojiContentNode soundmojiContentNode, String str, long j, String str2, String str3, String str4, boolean z5, String str5, String str6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = soundmojiContentNode.soundId;
        }
        if ((i7 & 2) != 0) {
            j = soundmojiContentNode.channelId;
        }
        if ((i7 & 4) != 0) {
            str2 = soundmojiContentNode.messageId;
        }
        if ((i7 & 8) != 0) {
            str3 = soundmojiContentNode.content;
        }
        if ((i7 & 16) != 0) {
            str4 = soundmojiContentNode.guildId;
        }
        if ((i7 & 32) != 0) {
            z5 = soundmojiContentNode.jumboable;
        }
        if ((i7 & 64) != 0) {
            str5 = soundmojiContentNode.emojiId;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            str6 = soundmojiContentNode.emojiName;
        }
        String str7 = str5;
        String str8 = str6;
        return soundmojiContentNode.m403copyFdtyiUI(str, j, str2, str3, str4, z5, str7, str8);
    }

    public static final /* synthetic */ void write$Self$chat_release(SoundmojiContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.soundId);
        output.g(serialDesc, 1, ChannelId$$serializer.INSTANCE, ChannelId.m1130boximpl(self.channelId));
        output.g(serialDesc, 2, MessageId$$serializer.INSTANCE, MessageId.m1156boximpl(self.messageId));
        if (output.u(serialDesc, 3) || self.content != null) {
            output.r(serialDesc, 3, s1.f17602a, self.content);
        }
        if (output.u(serialDesc, 4) || self.guildId != null) {
            output.r(serialDesc, 4, s1.f17602a, self.guildId);
        }
        if (output.u(serialDesc, 5) || self.jumboable) {
            output.p(serialDesc, 5, self.jumboable);
        }
        if (output.u(serialDesc, 6) || self.emojiId != null) {
            output.r(serialDesc, 6, s1.f17602a, self.emojiId);
        }
        if (!output.u(serialDesc, 7) && self.emojiName == null) {
            return;
        }
        output.r(serialDesc, 7, s1.f17602a, self.emojiName);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSoundId() {
        return this.soundId;
    }

    /* JADX INFO: renamed from: component2-o4g7jtM, reason: not valid java name and from getter */
    public final long getChannelId() {
        return this.channelId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3-3Eiw7ao, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGuildId() {
        return this.guildId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getJumboable() {
        return this.jumboable;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEmojiId() {
        return this.emojiId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getEmojiName() {
        return this.emojiName;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-FdtyiUI, reason: not valid java name */
    public final SoundmojiContentNode m403copyFdtyiUI(@NotNull String soundId, long channelId, @NotNull String messageId, String content, String guildId, boolean jumboable, String emojiId, String emojiName) {
        Intrinsics.checkNotNullParameter(soundId, "soundId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        return new SoundmojiContentNode(soundId, channelId, messageId, content, guildId, jumboable, emojiId, emojiName, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SoundmojiContentNode)) {
            return false;
        }
        SoundmojiContentNode soundmojiContentNode = (SoundmojiContentNode) other;
        return Intrinsics.areEqual(this.soundId, soundmojiContentNode.soundId) && ChannelId.m1134equalsimpl0(this.channelId, soundmojiContentNode.channelId) && MessageId.m1160equalsimpl0(this.messageId, soundmojiContentNode.messageId) && Intrinsics.areEqual(this.content, soundmojiContentNode.content) && Intrinsics.areEqual(this.guildId, soundmojiContentNode.guildId) && this.jumboable == soundmojiContentNode.jumboable && Intrinsics.areEqual(this.emojiId, soundmojiContentNode.emojiId) && Intrinsics.areEqual(this.emojiName, soundmojiContentNode.emojiName);
    }

    /* JADX INFO: renamed from: getChannelId-o4g7jtM, reason: not valid java name */
    public final long m404getChannelIdo4g7jtM() {
        return this.channelId;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getEmojiId() {
        return this.emojiId;
    }

    public final String getEmojiName() {
        return this.emojiName;
    }

    public final String getGuildId() {
        return this.guildId;
    }

    public final boolean getJumboable() {
        return this.jumboable;
    }

    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao, reason: not valid java name */
    public final String m405getMessageId3Eiw7ao() {
        return this.messageId;
    }

    @NotNull
    public final String getSoundId() {
        return this.soundId;
    }

    public int hashCode() {
        int iM1161hashCodeimpl = (MessageId.m1161hashCodeimpl(this.messageId) + b.d(this.channelId, this.soundId.hashCode() * 31, 31)) * 31;
        String str = this.content;
        int iHashCode = (iM1161hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.guildId;
        int iG = com.discord.chat.presentation.list.a.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.jumboable);
        String str3 = this.emojiId;
        int iHashCode2 = (iG + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.emojiName;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.soundId;
        String strM1137toStringimpl = ChannelId.m1137toStringimpl(this.channelId);
        String strM1163toStringimpl = MessageId.m1163toStringimpl(this.messageId);
        String str2 = this.content;
        String str3 = this.guildId;
        boolean z5 = this.jumboable;
        String str4 = this.emojiId;
        String str5 = this.emojiName;
        StringBuilder sbU = e.u("SoundmojiContentNode(soundId=", str, ", channelId=", strM1137toStringimpl, ", messageId=");
        e.A(sbU, strM1163toStringimpl, ", content=", str2, ", guildId=");
        sbU.append(str3);
        sbU.append(", jumboable=");
        sbU.append(z5);
        sbU.append(", emojiId=");
        return com.discord.chat.presentation.list.a.l(sbU, str4, ", emojiName=", str5, ")");
    }

    public /* synthetic */ SoundmojiContentNode(String str, long j, String str2, String str3, String str4, boolean z5, String str5, String str6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, str3, str4, z5, str5, str6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private /* synthetic */ SoundmojiContentNode(int i7, String str, ChannelId channelId, String str2, String str3, String str4, boolean z5, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (7 != (i7 & 7)) {
            e1.l(i7, 7, SoundmojiContentNode$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.soundId = str;
        this.channelId = channelId.m1139unboximpl();
        this.messageId = str2;
        if ((i7 & 8) == 0) {
            this.content = null;
        } else {
            this.content = str3;
        }
        if ((i7 & 16) == 0) {
            this.guildId = null;
        } else {
            this.guildId = str4;
        }
        if ((i7 & 32) == 0) {
            this.jumboable = false;
        } else {
            this.jumboable = z5;
        }
        if ((i7 & 64) == 0) {
            this.emojiId = null;
        } else {
            this.emojiId = str5;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.emojiName = null;
        } else {
            this.emojiName = str6;
        }
    }

    public /* synthetic */ SoundmojiContentNode(String str, long j, String str2, String str3, String str4, boolean z5, String str5, String str6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : str4, (i7 & 32) != 0 ? false : z5, (i7 & 64) != 0 ? null : str5, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : str6, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private SoundmojiContentNode(String soundId, long j, String messageId, String str, String str2, boolean z5, String str3, String str4) {
        super(null);
        Intrinsics.checkNotNullParameter(soundId, "soundId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.soundId = soundId;
        this.channelId = j;
        this.messageId = messageId;
        this.content = str;
        this.guildId = str2;
        this.jumboable = z5;
        this.emojiId = str3;
        this.emojiName = str4;
    }
}
