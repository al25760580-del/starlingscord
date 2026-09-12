package com.discord.chat.bridge.interaction;

import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006&"}, d2 = {"Lcom/discord/chat/bridge/interaction/InteractionStatus;", "", "state", "Lcom/discord/chat/bridge/interaction/InteractionStatusViewState;", "text", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "<init>", "(Lcom/discord/chat/bridge/interaction/InteractionStatusViewState;Lcom/discord/chat/bridge/structurabletext/StructurableText;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/interaction/InteractionStatusViewState;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getState", "()Lcom/discord/chat/bridge/interaction/InteractionStatusViewState;", "getText", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "isLoading", "", "isFailed", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class InteractionStatus {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final InteractionStatusViewState state;

    @NotNull
    private final StructurableText text;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/interaction/InteractionStatus$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/interaction/InteractionStatus;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return InteractionStatus$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InteractionStatus(int i7, InteractionStatusViewState interactionStatusViewState, StructurableText structurableText, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i7 & 3)) {
            e1.l(i7, 3, InteractionStatus$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.state = interactionStatusViewState;
        this.text = structurableText;
    }

    public static /* synthetic */ InteractionStatus copy$default(InteractionStatus interactionStatus, InteractionStatusViewState interactionStatusViewState, StructurableText structurableText, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            interactionStatusViewState = interactionStatus.state;
        }
        if ((i7 & 2) != 0) {
            structurableText = interactionStatus.text;
        }
        return interactionStatus.copy(interactionStatusViewState, structurableText);
    }

    public static final /* synthetic */ void write$Self$chat_release(InteractionStatus self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.g(serialDesc, 0, InteractionStatusViewState.Serializer.INSTANCE, self.state);
        output.g(serialDesc, 1, StructurableTextSerializer.INSTANCE, self.text);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final InteractionStatusViewState getState() {
        return this.state;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StructurableText getText() {
        return this.text;
    }

    @NotNull
    public final InteractionStatus copy(@NotNull InteractionStatusViewState state, @NotNull StructurableText text) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(text, "text");
        return new InteractionStatus(state, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InteractionStatus)) {
            return false;
        }
        InteractionStatus interactionStatus = (InteractionStatus) other;
        return this.state == interactionStatus.state && Intrinsics.areEqual(this.text, interactionStatus.text);
    }

    @NotNull
    public final InteractionStatusViewState getState() {
        return this.state;
    }

    @NotNull
    public final StructurableText getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.state.hashCode() * 31);
    }

    public final boolean isFailed() {
        return this.state == InteractionStatusViewState.FAILED;
    }

    public final boolean isLoading() {
        return this.state == InteractionStatusViewState.LOADING;
    }

    @NotNull
    public String toString() {
        return "InteractionStatus(state=" + this.state + ", text=" + this.text + ")";
    }

    public InteractionStatus(@NotNull InteractionStatusViewState state, @NotNull StructurableText text) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(text, "text");
        this.state = state;
        this.text = text;
    }
}
