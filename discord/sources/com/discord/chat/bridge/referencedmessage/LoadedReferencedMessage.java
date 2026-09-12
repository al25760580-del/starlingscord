package com.discord.chat.bridge.referencedmessage;

import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.Message$$serializer;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J%\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\b\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, d2 = {"Lcom/discord/chat/bridge/referencedmessage/LoadedReferencedMessage;", "Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;", "message", "Lcom/discord/chat/bridge/Message;", "systemContent", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "<init>", "(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/structurabletext/StructurableText;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMessage", "()Lcom/discord/chat/bridge/Message;", "getSystemContent", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LoadedReferencedMessage extends ReferencedMessage {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Message message;
    private final StructurableText systemContent;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/referencedmessage/LoadedReferencedMessage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/referencedmessage/LoadedReferencedMessage;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return LoadedReferencedMessage$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoadedReferencedMessage(int i7, Message message, StructurableText structurableText, SerializationConstructorMarker serializationConstructorMarker) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (1 != (i7 & 1)) {
            e1.l(i7, 1, LoadedReferencedMessage$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        super(defaultConstructorMarker);
        this.message = message;
        if ((i7 & 2) == 0) {
            this.systemContent = null;
        } else {
            this.systemContent = structurableText;
        }
    }

    public static /* synthetic */ LoadedReferencedMessage copy$default(LoadedReferencedMessage loadedReferencedMessage, Message message, StructurableText structurableText, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            message = loadedReferencedMessage.message;
        }
        if ((i7 & 2) != 0) {
            structurableText = loadedReferencedMessage.systemContent;
        }
        return loadedReferencedMessage.copy(message, structurableText);
    }

    public static final /* synthetic */ void write$Self$chat_release(LoadedReferencedMessage self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.g(serialDesc, 0, Message$$serializer.INSTANCE, self.message);
        if (!output.u(serialDesc, 1) && self.systemContent == null) {
            return;
        }
        output.r(serialDesc, 1, StructurableTextSerializer.INSTANCE, self.systemContent);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Message getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StructurableText getSystemContent() {
        return this.systemContent;
    }

    @NotNull
    public final LoadedReferencedMessage copy(@NotNull Message message, StructurableText systemContent) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new LoadedReferencedMessage(message, systemContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadedReferencedMessage)) {
            return false;
        }
        LoadedReferencedMessage loadedReferencedMessage = (LoadedReferencedMessage) other;
        return Intrinsics.areEqual(this.message, loadedReferencedMessage.message) && Intrinsics.areEqual(this.systemContent, loadedReferencedMessage.systemContent);
    }

    @NotNull
    public final Message getMessage() {
        return this.message;
    }

    public final StructurableText getSystemContent() {
        return this.systemContent;
    }

    public int hashCode() {
        int iHashCode = this.message.hashCode() * 31;
        StructurableText structurableText = this.systemContent;
        return iHashCode + (structurableText == null ? 0 : structurableText.hashCode());
    }

    @NotNull
    public String toString() {
        return "LoadedReferencedMessage(message=" + this.message + ", systemContent=" + this.systemContent + ")";
    }

    public /* synthetic */ LoadedReferencedMessage(Message message, StructurableText structurableText, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(message, (i7 & 2) != 0 ? null : structurableText);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadedReferencedMessage(@NotNull Message message, StructurableText structurableText) {
        super(null);
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
        this.systemContent = structurableText;
    }
}
