package com.discord.chat.bridge.reaction;

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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u001c\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006&"}, d2 = {"Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;", "Lcom/discord/reactions/ReactionView$ThemedBurstColorPalette;", "light", "Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;", "dark", "<init>", "(Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/reaction/BurstReactionColorPalette;Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getLight$annotations", "()V", "getLight", "()Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;", "getDark$annotations", "getDark", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ThemedBurstReactionColorPalette implements ReactionView.ThemedBurstColorPalette {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final BurstReactionColorPalette dark;

    @NotNull
    private final BurstReactionColorPalette light;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ThemedBurstReactionColorPalette$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ThemedBurstReactionColorPalette(int i7, BurstReactionColorPalette burstReactionColorPalette, BurstReactionColorPalette burstReactionColorPalette2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i7 & 3)) {
            e1.l(i7, 3, ThemedBurstReactionColorPalette$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.light = burstReactionColorPalette;
        this.dark = burstReactionColorPalette2;
    }

    public static /* synthetic */ ThemedBurstReactionColorPalette copy$default(ThemedBurstReactionColorPalette themedBurstReactionColorPalette, BurstReactionColorPalette burstReactionColorPalette, BurstReactionColorPalette burstReactionColorPalette2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            burstReactionColorPalette = themedBurstReactionColorPalette.light;
        }
        if ((i7 & 2) != 0) {
            burstReactionColorPalette2 = themedBurstReactionColorPalette.dark;
        }
        return themedBurstReactionColorPalette.copy(burstReactionColorPalette, burstReactionColorPalette2);
    }

    public static /* synthetic */ void getDark$annotations() {
    }

    public static /* synthetic */ void getLight$annotations() {
    }

    public static final /* synthetic */ void write$Self$chat_release(ThemedBurstReactionColorPalette self, CompositeEncoder output, SerialDescriptor serialDesc) {
        BurstReactionColorPalette$$serializer burstReactionColorPalette$$serializer = BurstReactionColorPalette$$serializer.INSTANCE;
        output.g(serialDesc, 0, burstReactionColorPalette$$serializer, self.getLight());
        output.g(serialDesc, 1, burstReactionColorPalette$$serializer, self.getDark());
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BurstReactionColorPalette getLight() {
        return this.light;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BurstReactionColorPalette getDark() {
        return this.dark;
    }

    @NotNull
    public final ThemedBurstReactionColorPalette copy(@NotNull BurstReactionColorPalette light, @NotNull BurstReactionColorPalette dark) {
        Intrinsics.checkNotNullParameter(light, "light");
        Intrinsics.checkNotNullParameter(dark, "dark");
        return new ThemedBurstReactionColorPalette(light, dark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThemedBurstReactionColorPalette)) {
            return false;
        }
        ThemedBurstReactionColorPalette themedBurstReactionColorPalette = (ThemedBurstReactionColorPalette) other;
        return Intrinsics.areEqual(this.light, themedBurstReactionColorPalette.light) && Intrinsics.areEqual(this.dark, themedBurstReactionColorPalette.dark);
    }

    public int hashCode() {
        return this.dark.hashCode() + (this.light.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ThemedBurstReactionColorPalette(light=" + this.light + ", dark=" + this.dark + ")";
    }

    public ThemedBurstReactionColorPalette(@NotNull BurstReactionColorPalette light, @NotNull BurstReactionColorPalette dark) {
        Intrinsics.checkNotNullParameter(light, "light");
        Intrinsics.checkNotNullParameter(dark, "dark");
        this.light = light;
        this.dark = dark;
    }

    @Override // com.discord.reactions.ReactionView.ThemedBurstColorPalette
    @NotNull
    public BurstReactionColorPalette getDark() {
        return this.dark;
    }

    @Override // com.discord.reactions.ReactionView.ThemedBurstColorPalette
    @NotNull
    public BurstReactionColorPalette getLight() {
        return this.light;
    }
}
