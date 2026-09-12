package com.discord.chat.bridge;

import com.facebook.imagepipeline.nativecode.b;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kr.f;
import m3.m;
import mr.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f(with = Serializer.class)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\f\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, d2 = {"Lcom/discord/chat/bridge/MessageState;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "Sent", "Sending", "SendFailed", "Unknown", "Companion", "Serializer", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum MessageState {
    Sent("SENT"),
    Sending("SENDING"),
    SendFailed("SEND_FAILED"),
    Unknown("UNKNOWN");


    @NotNull
    private final String key;
    private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, d2 = {"Lcom/discord/chat/bridge/MessageState$Companion;", "", "<init>", "()V", "fromValue", "Lcom/discord/chat/bridge/MessageState;", "key", "", "serializer", "Lkotlinx/serialization/KSerializer;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMessageState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageState.kt\ncom/discord/chat/bridge/MessageState$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,35:1\n1310#2,2:36\n*S KotlinDebug\n*F\n+ 1 MessageState.kt\ncom/discord/chat/bridge/MessageState$Companion\n*L\n23#1:36,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0020  */
        /* JADX WARN: Code duplicated, block: B:12:0x0023 A[RETURN] */
        @NotNull
        public final MessageState fromValue(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            for (MessageState messageState : MessageState.values()) {
                if (Intrinsics.areEqual(messageState.getKey(), key)) {
                    if (messageState == null) {
                        return MessageState.Unknown;
                    }
                    return messageState;
                }
            }
            messageState = null;
            if (messageState == null) {
                return MessageState.Unknown;
            }
            return messageState;
        }

        @NotNull
        public final KSerializer serializer() {
            return Serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/discord/chat/bridge/MessageState$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/MessageState;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Serializer implements KSerializer {

        @NotNull
        public static final Serializer INSTANCE = new Serializer();

        private Serializer() {
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        @NotNull
        public SerialDescriptor getDescriptor() {
            return m.a("MessageState", e.j);
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        @NotNull
        public MessageState deserialize(@NotNull Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return MessageState.INSTANCE.fromValue(decoder.decodeString());
        }

        @Override // kotlinx.serialization.KSerializer
        public void serialize(@NotNull Encoder encoder, @NotNull MessageState value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException();
        }
    }

    MessageState(String str) {
        this.key = str;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }
}
