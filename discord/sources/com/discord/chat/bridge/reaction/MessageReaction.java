package com.discord.chat.bridge.reaction;

import com.discord.chat.presentation.list.a;
import com.discord.reactions.ReactionView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000245B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010&\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001J%\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0001¢\u0006\u0002\b3R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0006\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0016¨\u00066"}, d2 = {"Lcom/discord/chat/bridge/reaction/MessageReaction;", "Lcom/discord/reactions/ReactionView$Reaction;", "count", "", "me", "", "isMeBurst", "emoji", "Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;", "burstCount", "themedBurstColors", "Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;", "<init>", "(IZZLcom/discord/chat/bridge/reaction/MessageReactionEmoji;ILcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;)V", "seen0", "isMe", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIZZLcom/discord/chat/bridge/reaction/MessageReactionEmoji;ILcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCount", "()I", "getMe", "()Z", "isMeBurst$annotations", "()V", "getEmoji", "()Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;", "getBurstCount$annotations", "getBurstCount", "getThemedBurstColors", "()Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MessageReaction implements ReactionView.Reaction {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int burstCount;
    private final int count;

    @NotNull
    private final MessageReactionEmoji emoji;
    private final boolean isMe;
    private final boolean isMeBurst;
    private final boolean me;
    private final ThemedBurstReactionColorPalette themedBurstColors;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/reaction/MessageReaction$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/reaction/MessageReaction;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return MessageReaction$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MessageReaction(int i7, int i10, boolean z5, boolean z6, MessageReactionEmoji messageReactionEmoji, int i11, ThemedBurstReactionColorPalette themedBurstReactionColorPalette, boolean z7, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i7 & 11)) {
            e1.l(i7, 11, MessageReaction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.count = i10;
        this.me = z5;
        if ((i7 & 4) == 0) {
            this.isMeBurst = false;
        } else {
            this.isMeBurst = z6;
        }
        this.emoji = messageReactionEmoji;
        if ((i7 & 16) == 0) {
            this.burstCount = 0;
        } else {
            this.burstCount = i11;
        }
        if ((i7 & 32) == 0) {
            this.themedBurstColors = null;
        } else {
            this.themedBurstColors = themedBurstReactionColorPalette;
        }
        if ((i7 & 64) == 0) {
            this.isMe = z5;
        } else {
            this.isMe = z7;
        }
    }

    public static /* synthetic */ MessageReaction copy$default(MessageReaction messageReaction, int i7, boolean z5, boolean z6, MessageReactionEmoji messageReactionEmoji, int i10, ThemedBurstReactionColorPalette themedBurstReactionColorPalette, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = messageReaction.count;
        }
        if ((i11 & 2) != 0) {
            z5 = messageReaction.me;
        }
        if ((i11 & 4) != 0) {
            z6 = messageReaction.isMeBurst;
        }
        if ((i11 & 8) != 0) {
            messageReactionEmoji = messageReaction.emoji;
        }
        if ((i11 & 16) != 0) {
            i10 = messageReaction.burstCount;
        }
        if ((i11 & 32) != 0) {
            themedBurstReactionColorPalette = messageReaction.themedBurstColors;
        }
        int i12 = i10;
        ThemedBurstReactionColorPalette themedBurstReactionColorPalette2 = themedBurstReactionColorPalette;
        return messageReaction.copy(i7, z5, z6, messageReactionEmoji, i12, themedBurstReactionColorPalette2);
    }

    public static /* synthetic */ void getBurstCount$annotations() {
    }

    public static /* synthetic */ void isMeBurst$annotations() {
    }

    public static final /* synthetic */ void write$Self$chat_release(MessageReaction self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.l(0, self.getCount(), serialDesc);
        output.p(serialDesc, 1, self.me);
        if (output.u(serialDesc, 2) || self.isMeBurst()) {
            output.p(serialDesc, 2, self.isMeBurst());
        }
        output.g(serialDesc, 3, MessageReactionEmoji$$serializer.INSTANCE, self.getEmoji());
        if (output.u(serialDesc, 4) || self.getBurstCount() != 0) {
            output.l(4, self.getBurstCount(), serialDesc);
        }
        if (output.u(serialDesc, 5) || self.getThemedBurstColors() != null) {
            output.r(serialDesc, 5, ThemedBurstReactionColorPalette$$serializer.INSTANCE, self.getThemedBurstColors());
        }
        if (!output.u(serialDesc, 6) && self.getIsMe() == self.me) {
            return;
        }
        output.p(serialDesc, 6, self.getIsMe());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getMe() {
        return this.me;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsMeBurst() {
        return this.isMeBurst;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MessageReactionEmoji getEmoji() {
        return this.emoji;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getBurstCount() {
        return this.burstCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ThemedBurstReactionColorPalette getThemedBurstColors() {
        return this.themedBurstColors;
    }

    @NotNull
    public final MessageReaction copy(int count, boolean me2, boolean isMeBurst, @NotNull MessageReactionEmoji emoji, int burstCount, ThemedBurstReactionColorPalette themedBurstColors) {
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        return new MessageReaction(count, me2, isMeBurst, emoji, burstCount, themedBurstColors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageReaction)) {
            return false;
        }
        MessageReaction messageReaction = (MessageReaction) other;
        return this.count == messageReaction.count && this.me == messageReaction.me && this.isMeBurst == messageReaction.isMeBurst && Intrinsics.areEqual(this.emoji, messageReaction.emoji) && this.burstCount == messageReaction.burstCount && Intrinsics.areEqual(this.themedBurstColors, messageReaction.themedBurstColors);
    }

    @Override // com.discord.reactions.ReactionView.Reaction
    public int getBurstCount() {
        return this.burstCount;
    }

    @Override // com.discord.reactions.ReactionView.Reaction
    public int getCount() {
        return this.count;
    }

    @Override // com.discord.recycler_view.utils.ItemDiffableType
    @NotNull
    public Long getItemId() {
        return ReactionView.Reaction.DefaultImpls.getItemId(this);
    }

    public final boolean getMe() {
        return this.me;
    }

    public int hashCode() {
        int iU = a.u(this.burstCount, (this.emoji.hashCode() + a.g(a.g(Integer.hashCode(this.count) * 31, 31, this.me), 31, this.isMeBurst)) * 31, 31);
        ThemedBurstReactionColorPalette themedBurstReactionColorPalette = this.themedBurstColors;
        return iU + (themedBurstReactionColorPalette == null ? 0 : themedBurstReactionColorPalette.hashCode());
    }

    @Override // com.discord.reactions.ReactionView.Reaction
    public boolean isBurstReaction() {
        return ReactionView.Reaction.DefaultImpls.isBurstReaction(this);
    }

    @Override // com.discord.reactions.ReactionView.Reaction
    /* JADX INFO: renamed from: isMe, reason: from getter */
    public boolean getIsMe() {
        return this.isMe;
    }

    @Override // com.discord.reactions.ReactionView.Reaction
    public boolean isMeBurst() {
        return this.isMeBurst;
    }

    @NotNull
    public String toString() {
        return "MessageReaction(count=" + this.count + ", me=" + this.me + ", isMeBurst=" + this.isMeBurst + ", emoji=" + this.emoji + ", burstCount=" + this.burstCount + ", themedBurstColors=" + this.themedBurstColors + ")";
    }

    public MessageReaction(int i7, boolean z5, boolean z6, @NotNull MessageReactionEmoji emoji, int i10, ThemedBurstReactionColorPalette themedBurstReactionColorPalette) {
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        this.count = i7;
        this.me = z5;
        this.isMeBurst = z6;
        this.emoji = emoji;
        this.burstCount = i10;
        this.themedBurstColors = themedBurstReactionColorPalette;
        this.isMe = z5;
    }

    @Override // com.discord.reactions.ReactionView.Reaction
    @NotNull
    public MessageReactionEmoji getEmoji() {
        return this.emoji;
    }

    @Override // com.discord.reactions.ReactionView.Reaction
    public ThemedBurstReactionColorPalette getThemedBurstColors() {
        return this.themedBurstColors;
    }

    public /* synthetic */ MessageReaction(int i7, boolean z5, boolean z6, MessageReactionEmoji messageReactionEmoji, int i10, ThemedBurstReactionColorPalette themedBurstReactionColorPalette, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, z5, (i11 & 4) != 0 ? false : z6, messageReactionEmoji, (i11 & 16) != 0 ? 0 : i10, (i11 & 32) != 0 ? null : themedBurstReactionColorPalette);
    }
}
