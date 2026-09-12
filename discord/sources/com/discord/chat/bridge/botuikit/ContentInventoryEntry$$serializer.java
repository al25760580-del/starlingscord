package com.discord.chat.bridge.botuikit;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.dialog.AlertFragment;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kr.j;
import or.e1;
import or.f0;
import or.g1;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/botuikit/ContentInventoryEntry.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/botuikit/ContentInventoryEntry;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/botuikit/ContentInventoryEntry;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/botuikit/ContentInventoryEntry;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class ContentInventoryEntry$$serializer implements f0 {

    @NotNull
    public static final ContentInventoryEntry$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ContentInventoryEntry$$serializer contentInventoryEntry$$serializer = new ContentInventoryEntry$$serializer();
        INSTANCE = contentInventoryEntry$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.botuikit.ContentInventoryEntry", contentInventoryEntry$$serializer, 14);
        g1Var.b("authorId", false);
        g1Var.b("contentId", false);
        g1Var.b("imageUrl", false);
        g1Var.b("imageClickable", true);
        g1Var.b("avatarUrl", false);
        g1Var.b("platformIconUrl", true);
        g1Var.b("platformClickable", true);
        g1Var.b("userActionDescription", false);
        g1Var.b("userClickable", true);
        g1Var.b(AlertFragment.ARG_TITLE, false);
        g1Var.b("titleClickable", true);
        g1Var.b("subtitles", false);
        g1Var.b("gradientColors", false);
        g1Var.b("clickable", true);
        descriptor = g1Var;
    }

    private ContentInventoryEntry$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ContentInventoryEntry.$childSerializers;
        s1 s1Var = s1.f17602a;
        ContentInventoryEntryClickable$$serializer contentInventoryEntryClickable$$serializer = ContentInventoryEntryClickable$$serializer.INSTANCE;
        return new KSerializer[]{UserId$$serializer.INSTANCE, s1Var, s1Var, b.p(contentInventoryEntryClickable$$serializer), s1Var, b.p(s1Var), b.p(contentInventoryEntryClickable$$serializer), s1Var, b.p(contentInventoryEntryClickable$$serializer), s1Var, b.p(contentInventoryEntryClickable$$serializer), lazyArr[11].getValue(), lazyArr[12].getValue(), b.p(contentInventoryEntryClickable$$serializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final ContentInventoryEntry deserialize(@NotNull Decoder decoder) {
        int i7;
        String str;
        String str2;
        String str3;
        ContentInventoryEntryClickable contentInventoryEntryClickable;
        List list;
        List list2;
        ContentInventoryEntryClickable contentInventoryEntryClickable2;
        ContentInventoryEntryClickable contentInventoryEntryClickable3;
        ContentInventoryEntryClickable contentInventoryEntryClickable4;
        ContentInventoryEntryClickable contentInventoryEntryClickable5;
        UserId userId;
        String str4;
        String str5;
        String str6;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ContentInventoryEntry.$childSerializers;
        int i10 = 9;
        UserId userId2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            UserId userId3 = (UserId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, UserId$$serializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            ContentInventoryEntryClickable$$serializer contentInventoryEntryClickable$$serializer = ContentInventoryEntryClickable$$serializer.INSTANCE;
            ContentInventoryEntryClickable contentInventoryEntryClickable6 = (ContentInventoryEntryClickable) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, contentInventoryEntryClickable$$serializer, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, s1.f17602a, null);
            ContentInventoryEntryClickable contentInventoryEntryClickable7 = (ContentInventoryEntryClickable) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, contentInventoryEntryClickable$$serializer, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            ContentInventoryEntryClickable contentInventoryEntryClickable8 = (ContentInventoryEntryClickable) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, contentInventoryEntryClickable$$serializer, null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            ContentInventoryEntryClickable contentInventoryEntryClickable9 = (ContentInventoryEntryClickable) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, contentInventoryEntryClickable$$serializer, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, (DeserializationStrategy) lazyArr[11].getValue(), null);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), null);
            contentInventoryEntryClickable = (ContentInventoryEntryClickable) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, contentInventoryEntryClickable$$serializer, null);
            str = strDecodeStringElement;
            str2 = str7;
            str6 = strDecodeStringElement5;
            str5 = strDecodeStringElement4;
            contentInventoryEntryClickable4 = contentInventoryEntryClickable7;
            contentInventoryEntryClickable2 = contentInventoryEntryClickable8;
            contentInventoryEntryClickable5 = contentInventoryEntryClickable6;
            contentInventoryEntryClickable3 = contentInventoryEntryClickable9;
            str4 = strDecodeStringElement3;
            str3 = strDecodeStringElement2;
            i7 = 16383;
            list2 = list3;
            userId = userId3;
        } else {
            boolean z5 = true;
            int i11 = 0;
            String strDecodeStringElement6 = null;
            String str8 = null;
            String strDecodeStringElement7 = null;
            ContentInventoryEntryClickable contentInventoryEntryClickable10 = null;
            List list4 = null;
            List list5 = null;
            ContentInventoryEntryClickable contentInventoryEntryClickable11 = null;
            ContentInventoryEntryClickable contentInventoryEntryClickable12 = null;
            ContentInventoryEntryClickable contentInventoryEntryClickable13 = null;
            ContentInventoryEntryClickable contentInventoryEntryClickable14 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        break;
                    case 0:
                        userId2 = (UserId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, UserId$$serializer.INSTANCE, userId2);
                        i11 |= 1;
                        i10 = 9;
                        break;
                    case 1:
                        i11 |= 2;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i10 = 9;
                        break;
                    case 2:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i11 |= 4;
                        i10 = 9;
                        break;
                    case 3:
                        contentInventoryEntryClickable14 = (ContentInventoryEntryClickable) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ContentInventoryEntryClickable$$serializer.INSTANCE, contentInventoryEntryClickable14);
                        i11 |= 8;
                        i10 = 9;
                        break;
                    case 4:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i11 |= 16;
                        i10 = 9;
                        break;
                    case 5:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, s1.f17602a, str8);
                        i11 |= 32;
                        i10 = 9;
                        break;
                    case 6:
                        contentInventoryEntryClickable13 = (ContentInventoryEntryClickable) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, ContentInventoryEntryClickable$$serializer.INSTANCE, contentInventoryEntryClickable13);
                        i11 |= 64;
                        i10 = 9;
                        break;
                    case 7:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        i10 = 9;
                        break;
                    case 8:
                        contentInventoryEntryClickable11 = (ContentInventoryEntryClickable) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, ContentInventoryEntryClickable$$serializer.INSTANCE, contentInventoryEntryClickable11);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        i10 = 9;
                        break;
                    case 9:
                        int i12 = i10;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i12);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        i10 = i12;
                        break;
                    case 10:
                        contentInventoryEntryClickable12 = (ContentInventoryEntryClickable) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, ContentInventoryEntryClickable$$serializer.INSTANCE, contentInventoryEntryClickable12);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        i10 = 9;
                        break;
                    case 11:
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, (DeserializationStrategy) lazyArr[11].getValue(), list5);
                        i11 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        i10 = 9;
                        break;
                    case 12:
                        list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), list4);
                        i11 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        i10 = 9;
                        break;
                    case 13:
                        contentInventoryEntryClickable10 = (ContentInventoryEntryClickable) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, ContentInventoryEntryClickable$$serializer.INSTANCE, contentInventoryEntryClickable10);
                        i11 |= 8192;
                        i10 = 9;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            i7 = i11;
            str = strDecodeStringElement6;
            str2 = str8;
            str3 = strDecodeStringElement7;
            contentInventoryEntryClickable = contentInventoryEntryClickable10;
            list = list4;
            list2 = list5;
            contentInventoryEntryClickable2 = contentInventoryEntryClickable11;
            contentInventoryEntryClickable3 = contentInventoryEntryClickable12;
            contentInventoryEntryClickable4 = contentInventoryEntryClickable13;
            contentInventoryEntryClickable5 = contentInventoryEntryClickable14;
            userId = userId2;
            str4 = strDecodeStringElement8;
            str5 = strDecodeStringElement9;
            str6 = strDecodeStringElement10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ContentInventoryEntry(i7, userId, str, str3, contentInventoryEntryClickable5, str4, str2, contentInventoryEntryClickable4, str5, contentInventoryEntryClickable2, str6, contentInventoryEntryClickable3, list2, list, contentInventoryEntryClickable, null, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ContentInventoryEntry value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ContentInventoryEntry.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
