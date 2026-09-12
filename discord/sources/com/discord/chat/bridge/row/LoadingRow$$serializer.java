package com.discord.chat.bridge.row;

import com.discord.chat.bridge.ChangeType;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kr.j;
import or.e1;
import or.f0;
import or.g;
import or.g1;
import or.m0;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/row/LoadingRow.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/row/LoadingRow;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/row/LoadingRow;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/row/LoadingRow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class LoadingRow$$serializer implements f0 {

    @NotNull
    public static final LoadingRow$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        LoadingRow$$serializer loadingRow$$serializer = new LoadingRow$$serializer();
        INSTANCE = loadingRow$$serializer;
        g1 g1Var = new g1("4", loadingRow$$serializer, 5);
        g1Var.b("index", false);
        g1Var.b("changeType", false);
        g1Var.b("button", false);
        g1Var.b(ViewProps.COLOR, false);
        g1Var.b("isLoading", false);
        descriptor = g1Var;
    }

    private LoadingRow$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        m0 m0Var = m0.f17573a;
        return new KSerializer[]{m0Var, ChangeType.Serializer.INSTANCE, LoadMoreButton$$serializer.INSTANCE, m0Var, g.f17537a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final LoadingRow deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        int iDecodeIntElement2;
        boolean zDecodeBooleanElement;
        int i7;
        ChangeType changeType;
        LoadMoreButton loadMoreButton;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            ChangeType changeType2 = (ChangeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, ChangeType.Serializer.INSTANCE, null);
            LoadMoreButton loadMoreButton2 = (LoadMoreButton) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, LoadMoreButton$$serializer.INSTANCE, null);
            iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            loadMoreButton = loadMoreButton2;
            changeType = changeType2;
            i7 = 31;
        } else {
            boolean z5 = true;
            iDecodeIntElement = 0;
            boolean zDecodeBooleanElement2 = false;
            int i10 = 0;
            ChangeType changeType3 = null;
            LoadMoreButton loadMoreButton3 = null;
            int iDecodeIntElement3 = 0;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z5 = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                    i10 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    changeType3 = (ChangeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, ChangeType.Serializer.INSTANCE, changeType3);
                    i10 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    loadMoreButton3 = (LoadMoreButton) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, LoadMoreButton$$serializer.INSTANCE, loadMoreButton3);
                    i10 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                    i10 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new j(iDecodeElementIndex);
                    }
                    zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                    i10 |= 16;
                }
            }
            iDecodeIntElement2 = iDecodeIntElement3;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i7 = i10;
            changeType = changeType3;
            loadMoreButton = loadMoreButton3;
        }
        int i11 = iDecodeIntElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LoadingRow(i7, i11, changeType, loadMoreButton, iDecodeIntElement2, zDecodeBooleanElement, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull LoadingRow value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LoadingRow.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
