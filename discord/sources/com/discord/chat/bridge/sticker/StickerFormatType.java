package com.discord.chat.bridge.sticker;

import com.facebook.imagepipeline.nativecode.b;
import java.util.NoSuchElementException;
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
@f(with = StickerFormatTypeSerializer.class)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\f\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, d2 = {"Lcom/discord/chat/bridge/sticker/StickerFormatType;", "", "intType", "", "<init>", "(Ljava/lang/String;II)V", "getIntType", "()I", "PNG", "APNG", "LOTTIE", "GIF", "StickerFormatTypeSerializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum StickerFormatType {
    PNG(1),
    APNG(2),
    LOTTIE(3),
    GIF(4);

    private final int intType;
    private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/sticker/StickerFormatType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/sticker/StickerFormatType;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return StickerFormatTypeSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/discord/chat/bridge/sticker/StickerFormatType$StickerFormatTypeSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/sticker/StickerFormatType;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nStickerFormatType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickerFormatType.kt\ncom/discord/chat/bridge/sticker/StickerFormatType$StickerFormatTypeSerializer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,35:1\n1137#2,2:36\n*S KotlinDebug\n*F\n+ 1 StickerFormatType.kt\ncom/discord/chat/bridge/sticker/StickerFormatType$StickerFormatTypeSerializer\n*L\n27#1:36,2\n*E\n"})
    public static final class StickerFormatTypeSerializer implements KSerializer {

        @NotNull
        public static final StickerFormatTypeSerializer INSTANCE = new StickerFormatTypeSerializer();

        private StickerFormatTypeSerializer() {
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        @NotNull
        public SerialDescriptor getDescriptor() {
            return m.a("StickerFormatType", e.f16062g);
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        @NotNull
        public StickerFormatType deserialize(@NotNull Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            int iDecodeInt = decoder.decodeInt();
            for (StickerFormatType stickerFormatType : StickerFormatType.values()) {
                if (stickerFormatType.getIntType() == iDecodeInt) {
                    return stickerFormatType;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        @Override // kotlinx.serialization.KSerializer
        public void serialize(@NotNull Encoder encoder, @NotNull StickerFormatType value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.v(value.getIntType());
        }
    }

    StickerFormatType(int i7) {
        this.intType = i7;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public final int getIntType() {
        return this.intType;
    }
}
