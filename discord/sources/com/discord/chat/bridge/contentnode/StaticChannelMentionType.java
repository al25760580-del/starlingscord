package com.discord.chat.bridge.contentnode;

import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.devsupport.StackTraceHelper;
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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000e\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/bridge/contentnode/StaticChannelMentionType;", "", StackTraceHelper.ID_KEY, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "Home", "Guide", "Customize", "Browse", "LinkedRoles", "Unknown", "Companion", "Serializer", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum StaticChannelMentionType {
    Home("home"),
    Guide("guide"),
    Customize("customize"),
    Browse("browse"),
    LinkedRoles("linked-roles"),
    Unknown("");


    @NotNull
    private final String id;
    private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, d2 = {"Lcom/discord/chat/bridge/contentnode/StaticChannelMentionType$Companion;", "", "<init>", "()V", "fromValue", "Lcom/discord/chat/bridge/contentnode/StaticChannelMentionType;", StackTraceHelper.ID_KEY, "", "serializer", "Lkotlinx/serialization/KSerializer;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nStaticChannelMentionContentNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticChannelMentionContentNode.kt\ncom/discord/chat/bridge/contentnode/StaticChannelMentionType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,51:1\n1310#2,2:52\n*S KotlinDebug\n*F\n+ 1 StaticChannelMentionContentNode.kt\ncom/discord/chat/bridge/contentnode/StaticChannelMentionType$Companion\n*L\n37#1:52,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0020  */
        /* JADX WARN: Code duplicated, block: B:12:0x0023 A[RETURN] */
        @NotNull
        public final StaticChannelMentionType fromValue(@NotNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            for (StaticChannelMentionType staticChannelMentionType : StaticChannelMentionType.values()) {
                if (Intrinsics.areEqual(staticChannelMentionType.getId(), id2)) {
                    if (staticChannelMentionType == null) {
                        return StaticChannelMentionType.Unknown;
                    }
                    return staticChannelMentionType;
                }
            }
            staticChannelMentionType = null;
            if (staticChannelMentionType == null) {
                return StaticChannelMentionType.Unknown;
            }
            return staticChannelMentionType;
        }

        @NotNull
        public final KSerializer serializer() {
            return Serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/discord/chat/bridge/contentnode/StaticChannelMentionType$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/StaticChannelMentionType;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Serializer implements KSerializer {

        @NotNull
        public static final Serializer INSTANCE = new Serializer();

        private Serializer() {
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        @NotNull
        public SerialDescriptor getDescriptor() {
            return m.a("StaticChannelMentionType", e.j);
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        @NotNull
        public StaticChannelMentionType deserialize(@NotNull Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return StaticChannelMentionType.INSTANCE.fromValue(decoder.decodeString());
        }

        @Override // kotlinx.serialization.KSerializer
        public void serialize(@NotNull Encoder encoder, @NotNull StaticChannelMentionType value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.D(value.getId());
        }
    }

    StaticChannelMentionType(String str) {
        this.id = str;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }
}
