package com.discord.chat.bridge.reaction;

import com.discord.reactions.ReactionView;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.m0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002./BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000eJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010JV\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J%\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b-R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0015\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0016\u0010\u0010¨\u00060"}, d2 = {"Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "Lcom/discord/reactions/ReactionView$ReactionsTheme;", "reactionBackgroundColor", "", "reactionBorderColor", "reactionTextColor", "activeReactionBackgroundColor", "activeReactionBorderColor", "activeReactionTextColor", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getReactionBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getReactionBorderColor", "getReactionTextColor", "getActiveReactionBackgroundColor", "getActiveReactionBorderColor", "getActiveReactionTextColor", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ReactionsTheme implements ReactionView.ReactionsTheme {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final Integer activeReactionBackgroundColor;
    private final Integer activeReactionBorderColor;
    private final Integer activeReactionTextColor;
    private final Integer reactionBackgroundColor;
    private final Integer reactionBorderColor;
    private final Integer reactionTextColor;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/reaction/ReactionsTheme$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ReactionsTheme$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ReactionsTheme() {
        this((Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ReactionsTheme copy$default(ReactionsTheme reactionsTheme, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = reactionsTheme.reactionBackgroundColor;
        }
        if ((i7 & 2) != 0) {
            num2 = reactionsTheme.reactionBorderColor;
        }
        if ((i7 & 4) != 0) {
            num3 = reactionsTheme.reactionTextColor;
        }
        if ((i7 & 8) != 0) {
            num4 = reactionsTheme.activeReactionBackgroundColor;
        }
        if ((i7 & 16) != 0) {
            num5 = reactionsTheme.activeReactionBorderColor;
        }
        if ((i7 & 32) != 0) {
            num6 = reactionsTheme.activeReactionTextColor;
        }
        Integer num7 = num5;
        Integer num8 = num6;
        return reactionsTheme.copy(num, num2, num3, num4, num7, num8);
    }

    public static final /* synthetic */ void write$Self$chat_release(ReactionsTheme self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.u(serialDesc, 0) || self.getReactionBackgroundColor() != null) {
            output.r(serialDesc, 0, m0.f17573a, self.getReactionBackgroundColor());
        }
        if (output.u(serialDesc, 1) || self.getReactionBorderColor() != null) {
            output.r(serialDesc, 1, m0.f17573a, self.getReactionBorderColor());
        }
        if (output.u(serialDesc, 2) || self.getReactionTextColor() != null) {
            output.r(serialDesc, 2, m0.f17573a, self.getReactionTextColor());
        }
        if (output.u(serialDesc, 3) || self.getActiveReactionBackgroundColor() != null) {
            output.r(serialDesc, 3, m0.f17573a, self.getActiveReactionBackgroundColor());
        }
        if (output.u(serialDesc, 4) || self.getActiveReactionBorderColor() != null) {
            output.r(serialDesc, 4, m0.f17573a, self.getActiveReactionBorderColor());
        }
        if (!output.u(serialDesc, 5) && self.getActiveReactionTextColor() == null) {
            return;
        }
        output.r(serialDesc, 5, m0.f17573a, self.getActiveReactionTextColor());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getReactionBackgroundColor() {
        return this.reactionBackgroundColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getReactionBorderColor() {
        return this.reactionBorderColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getReactionTextColor() {
        return this.reactionTextColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getActiveReactionBackgroundColor() {
        return this.activeReactionBackgroundColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getActiveReactionBorderColor() {
        return this.activeReactionBorderColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getActiveReactionTextColor() {
        return this.activeReactionTextColor;
    }

    @NotNull
    public final ReactionsTheme copy(Integer reactionBackgroundColor, Integer reactionBorderColor, Integer reactionTextColor, Integer activeReactionBackgroundColor, Integer activeReactionBorderColor, Integer activeReactionTextColor) {
        return new ReactionsTheme(reactionBackgroundColor, reactionBorderColor, reactionTextColor, activeReactionBackgroundColor, activeReactionBorderColor, activeReactionTextColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReactionsTheme)) {
            return false;
        }
        ReactionsTheme reactionsTheme = (ReactionsTheme) other;
        return Intrinsics.areEqual(this.reactionBackgroundColor, reactionsTheme.reactionBackgroundColor) && Intrinsics.areEqual(this.reactionBorderColor, reactionsTheme.reactionBorderColor) && Intrinsics.areEqual(this.reactionTextColor, reactionsTheme.reactionTextColor) && Intrinsics.areEqual(this.activeReactionBackgroundColor, reactionsTheme.activeReactionBackgroundColor) && Intrinsics.areEqual(this.activeReactionBorderColor, reactionsTheme.activeReactionBorderColor) && Intrinsics.areEqual(this.activeReactionTextColor, reactionsTheme.activeReactionTextColor);
    }

    @Override // com.discord.reactions.ReactionView.ReactionsTheme
    public Integer getActiveReactionBackgroundColor() {
        return this.activeReactionBackgroundColor;
    }

    @Override // com.discord.reactions.ReactionView.ReactionsTheme
    public Integer getActiveReactionBorderColor() {
        return this.activeReactionBorderColor;
    }

    @Override // com.discord.reactions.ReactionView.ReactionsTheme
    public Integer getActiveReactionTextColor() {
        return this.activeReactionTextColor;
    }

    @Override // com.discord.reactions.ReactionView.ReactionsTheme
    public Integer getReactionBackgroundColor() {
        return this.reactionBackgroundColor;
    }

    @Override // com.discord.reactions.ReactionView.ReactionsTheme
    public Integer getReactionBorderColor() {
        return this.reactionBorderColor;
    }

    @Override // com.discord.reactions.ReactionView.ReactionsTheme
    public Integer getReactionTextColor() {
        return this.reactionTextColor;
    }

    public int hashCode() {
        Integer num = this.reactionBackgroundColor;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.reactionBorderColor;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.reactionTextColor;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.activeReactionBackgroundColor;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.activeReactionBorderColor;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.activeReactionTextColor;
        return iHashCode5 + (num6 != null ? num6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.reactionBackgroundColor;
        Integer num2 = this.reactionBorderColor;
        Integer num3 = this.reactionTextColor;
        Integer num4 = this.activeReactionBackgroundColor;
        Integer num5 = this.activeReactionBorderColor;
        Integer num6 = this.activeReactionTextColor;
        StringBuilder sb2 = new StringBuilder("ReactionsTheme(reactionBackgroundColor=");
        sb2.append(num);
        sb2.append(", reactionBorderColor=");
        sb2.append(num2);
        sb2.append(", reactionTextColor=");
        b.s(sb2, num3, ", activeReactionBackgroundColor=", num4, ", activeReactionBorderColor=");
        sb2.append(num5);
        sb2.append(", activeReactionTextColor=");
        sb2.append(num6);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ ReactionsTheme(int i7, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i7 & 1) == 0) {
            this.reactionBackgroundColor = null;
        } else {
            this.reactionBackgroundColor = num;
        }
        if ((i7 & 2) == 0) {
            this.reactionBorderColor = null;
        } else {
            this.reactionBorderColor = num2;
        }
        if ((i7 & 4) == 0) {
            this.reactionTextColor = null;
        } else {
            this.reactionTextColor = num3;
        }
        if ((i7 & 8) == 0) {
            this.activeReactionBackgroundColor = null;
        } else {
            this.activeReactionBackgroundColor = num4;
        }
        if ((i7 & 16) == 0) {
            this.activeReactionBorderColor = null;
        } else {
            this.activeReactionBorderColor = num5;
        }
        if ((i7 & 32) == 0) {
            this.activeReactionTextColor = null;
        } else {
            this.activeReactionTextColor = num6;
        }
    }

    public ReactionsTheme(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.reactionBackgroundColor = num;
        this.reactionBorderColor = num2;
        this.reactionTextColor = num3;
        this.activeReactionBackgroundColor = num4;
        this.activeReactionBorderColor = num5;
        this.activeReactionTextColor = num6;
    }

    public /* synthetic */ ReactionsTheme(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : num, (i7 & 2) != 0 ? null : num2, (i7 & 4) != 0 ? null : num3, (i7 & 8) != 0 ? null : num4, (i7 & 16) != 0 ? null : num5, (i7 & 32) != 0 ? null : num6);
    }
}
