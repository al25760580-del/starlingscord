package com.discord.chat.bridge.reaction;

import a3.e;
import com.discord.emoji.RenderableEmoji;
import com.discord.reactions.ReactionView;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.g;
import or.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016JF\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\fHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J%\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\b+R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006."}, d2 = {"Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;", "Lcom/discord/reactions/ReactionView$Emoji;", StackTraceHelper.NAME_KEY, "", "src", "displayName", StackTraceHelper.ID_KEY, "animated", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getSrc", "getDisplayName", "getId", "getAnimated", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MessageReactionEmoji implements ReactionView.Emoji {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean animated;

    @NotNull
    private final String displayName;
    private final String id;
    private final String name;

    @NotNull
    private final String src;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/reaction/MessageReactionEmoji$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return MessageReactionEmoji$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MessageReactionEmoji(int i7, String str, String str2, String str3, String str4, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i7 & 6)) {
            e1.l(i7, 6, MessageReactionEmoji$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i7 & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        this.src = str2;
        this.displayName = str3;
        if ((i7 & 8) == 0) {
            this.id = null;
        } else {
            this.id = str4;
        }
        if ((i7 & 16) == 0) {
            this.animated = null;
        } else {
            this.animated = bool;
        }
    }

    public static /* synthetic */ MessageReactionEmoji copy$default(MessageReactionEmoji messageReactionEmoji, String str, String str2, String str3, String str4, Boolean bool, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = messageReactionEmoji.name;
        }
        if ((i7 & 2) != 0) {
            str2 = messageReactionEmoji.src;
        }
        if ((i7 & 4) != 0) {
            str3 = messageReactionEmoji.displayName;
        }
        if ((i7 & 8) != 0) {
            str4 = messageReactionEmoji.id;
        }
        if ((i7 & 16) != 0) {
            bool = messageReactionEmoji.animated;
        }
        Boolean bool2 = bool;
        String str5 = str3;
        return messageReactionEmoji.copy(str, str2, str5, str4, bool2);
    }

    public static final /* synthetic */ void write$Self$chat_release(MessageReactionEmoji self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.u(serialDesc, 0) || self.getName() != null) {
            output.r(serialDesc, 0, s1.f17602a, self.getName());
        }
        output.q(serialDesc, 1, self.getSrc());
        output.q(serialDesc, 2, self.getDisplayName());
        if (output.u(serialDesc, 3) || self.getId() != null) {
            output.r(serialDesc, 3, s1.f17602a, self.getId());
        }
        if (!output.u(serialDesc, 4) && self.getAnimated() == null) {
            return;
        }
        output.r(serialDesc, 4, g.f17537a, self.getAnimated());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSrc() {
        return this.src;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getAnimated() {
        return this.animated;
    }

    @NotNull
    public final MessageReactionEmoji copy(String name, @NotNull String src, @NotNull String displayName, String id2, Boolean animated) {
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        return new MessageReactionEmoji(name, src, displayName, id2, animated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageReactionEmoji)) {
            return false;
        }
        MessageReactionEmoji messageReactionEmoji = (MessageReactionEmoji) other;
        return Intrinsics.areEqual(this.name, messageReactionEmoji.name) && Intrinsics.areEqual(this.src, messageReactionEmoji.src) && Intrinsics.areEqual(this.displayName, messageReactionEmoji.displayName) && Intrinsics.areEqual(this.id, messageReactionEmoji.id) && Intrinsics.areEqual(this.animated, messageReactionEmoji.animated);
    }

    @Override // com.discord.reactions.ReactionView.Emoji
    public Boolean getAnimated() {
        return this.animated;
    }

    @Override // com.discord.reactions.ReactionView.Emoji
    @NotNull
    public String getDisplayName() {
        return this.displayName;
    }

    @Override // com.discord.reactions.ReactionView.Emoji
    public String getEmojiId() {
        return ReactionView.Emoji.DefaultImpls.getEmojiId(this);
    }

    @Override // com.discord.reactions.ReactionView.Emoji
    public String getId() {
        return this.id;
    }

    @Override // com.discord.reactions.ReactionView.Emoji
    public String getName() {
        return this.name;
    }

    @Override // com.discord.reactions.ReactionView.Emoji
    public boolean getShouldAnimate() {
        return ReactionView.Emoji.DefaultImpls.getShouldAnimate(this);
    }

    @Override // com.discord.reactions.ReactionView.Emoji
    @NotNull
    public String getSrc() {
        return this.src;
    }

    public int hashCode() {
        String str = this.name;
        int iD = e.d(e.d((str == null ? 0 : str.hashCode()) * 31, 31, this.src), 31, this.displayName);
        String str2 = this.id;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.animated;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.discord.reactions.ReactionView.Emoji
    @NotNull
    public RenderableEmoji renderable() {
        return ReactionView.Emoji.DefaultImpls.renderable(this);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.src;
        String str3 = this.displayName;
        String str4 = this.id;
        Boolean bool = this.animated;
        StringBuilder sbU = e.u("MessageReactionEmoji(name=", str, ", src=", str2, ", displayName=");
        e.A(sbU, str3, ", id=", str4, ", animated=");
        sbU.append(bool);
        sbU.append(")");
        return sbU.toString();
    }

    public MessageReactionEmoji(String str, @NotNull String src, @NotNull String displayName, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.name = str;
        this.src = src;
        this.displayName = displayName;
        this.id = str2;
        this.animated = bool;
    }

    public /* synthetic */ MessageReactionEmoji(String str, String str2, String str3, String str4, Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, str2, str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? null : bool);
    }
}
