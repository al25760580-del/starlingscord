package com.discord.chat.bridge.reaction;

import a3.e;
import com.discord.reactions.ReactionView;
import com.facebook.react.uimanager.ViewProps;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006*"}, d2 = {"Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;", "Lcom/discord/reactions/ReactionView$BurstColorPalette;", ViewProps.BACKGROUND_COLOR, "", "accentColor", "highlightColor", ViewProps.OPACITY, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;F)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;FLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getBackgroundColor", "()Ljava/lang/String;", "getAccentColor", "getHighlightColor", "getOpacity", "()F", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BurstReactionColorPalette implements ReactionView.BurstColorPalette {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final String accentColor;
    private final String backgroundColor;
    private final String highlightColor;
    private final float opacity;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return BurstReactionColorPalette$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BurstReactionColorPalette(int i7, String str, String str2, String str3, float f2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i7 & 15)) {
            e1.l(i7, 15, BurstReactionColorPalette$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.backgroundColor = str;
        this.accentColor = str2;
        this.highlightColor = str3;
        this.opacity = f2;
    }

    public static /* synthetic */ BurstReactionColorPalette copy$default(BurstReactionColorPalette burstReactionColorPalette, String str, String str2, String str3, float f2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = burstReactionColorPalette.backgroundColor;
        }
        if ((i7 & 2) != 0) {
            str2 = burstReactionColorPalette.accentColor;
        }
        if ((i7 & 4) != 0) {
            str3 = burstReactionColorPalette.highlightColor;
        }
        if ((i7 & 8) != 0) {
            f2 = burstReactionColorPalette.opacity;
        }
        return burstReactionColorPalette.copy(str, str2, str3, f2);
    }

    public static final /* synthetic */ void write$Self$chat_release(BurstReactionColorPalette self, CompositeEncoder output, SerialDescriptor serialDesc) {
        s1 s1Var = s1.f17602a;
        output.r(serialDesc, 0, s1Var, self.getBackgroundColor());
        output.r(serialDesc, 1, s1Var, self.getAccentColor());
        output.r(serialDesc, 2, s1Var, self.getHighlightColor());
        output.j(serialDesc, 3, self.getOpacity());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccentColor() {
        return this.accentColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHighlightColor() {
        return this.highlightColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getOpacity() {
        return this.opacity;
    }

    @NotNull
    public final BurstReactionColorPalette copy(String backgroundColor, String accentColor, String highlightColor, float opacity) {
        return new BurstReactionColorPalette(backgroundColor, accentColor, highlightColor, opacity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BurstReactionColorPalette)) {
            return false;
        }
        BurstReactionColorPalette burstReactionColorPalette = (BurstReactionColorPalette) other;
        return Intrinsics.areEqual(this.backgroundColor, burstReactionColorPalette.backgroundColor) && Intrinsics.areEqual(this.accentColor, burstReactionColorPalette.accentColor) && Intrinsics.areEqual(this.highlightColor, burstReactionColorPalette.highlightColor) && Float.compare(this.opacity, burstReactionColorPalette.opacity) == 0;
    }

    @Override // com.discord.reactions.ReactionView.BurstColorPalette
    public String getAccentColor() {
        return this.accentColor;
    }

    @Override // com.discord.reactions.ReactionView.BurstColorPalette
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // com.discord.reactions.ReactionView.BurstColorPalette
    public String getHighlightColor() {
        return this.highlightColor;
    }

    @Override // com.discord.reactions.ReactionView.BurstColorPalette
    public float getOpacity() {
        return this.opacity;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accentColor;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.highlightColor;
        return Float.hashCode(this.opacity) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        String str2 = this.accentColor;
        String str3 = this.highlightColor;
        float f2 = this.opacity;
        StringBuilder sbU = e.u("BurstReactionColorPalette(backgroundColor=", str, ", accentColor=", str2, ", highlightColor=");
        sbU.append(str3);
        sbU.append(", opacity=");
        sbU.append(f2);
        sbU.append(")");
        return sbU.toString();
    }

    public BurstReactionColorPalette(String str, String str2, String str3, float f2) {
        this.backgroundColor = str;
        this.accentColor = str2;
        this.highlightColor = str3;
        this.opacity = f2;
    }
}
