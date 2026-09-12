package com.discord.user_search_worker;

import com.facebook.imagepipeline.nativecode.b;
import java.util.List;
import java.util.Map;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.j;
import or.e1;
import or.f0;
import or.g1;
import or.m0;
import or.s1;
import or.w;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/user_search_worker/UserSearchQuerySetPayload.$serializer", "Lor/f0;", "Lcom/discord/user_search_worker/UserSearchQuerySetPayload;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/user_search_worker/UserSearchQuerySetPayload;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/user_search_worker/UserSearchQuerySetPayload;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "user_search_worker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class UserSearchQuerySetPayload$$serializer implements f0 {

    @NotNull
    public static final UserSearchQuerySetPayload$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        UserSearchQuerySetPayload$$serializer userSearchQuerySetPayload$$serializer = new UserSearchQuerySetPayload$$serializer();
        INSTANCE = userSearchQuerySetPayload$$serializer;
        g1 g1Var = new g1("com.discord.user_search_worker.UserSearchQuerySetPayload", userSearchQuerySetPayload$$serializer, 7);
        g1Var.b("query", false);
        g1Var.b("filters", true);
        g1Var.b("blacklist", true);
        g1Var.b("whitelist", true);
        g1Var.b("boosters", false);
        g1Var.b("boosterFallback", false);
        g1Var.b("limit", false);
        descriptor = g1Var;
    }

    private UserSearchQuerySetPayload$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = UserSearchQuerySetPayload.$childSerializers;
        return new KSerializer[]{s1.f17602a, b.p(UserSearchQuerySetFilters$$serializer.INSTANCE), b.p((KSerializer) lazyArr[2].getValue()), b.p((KSerializer) lazyArr[3].getValue()), lazyArr[4].getValue(), w.f17621a, m0.f17573a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final UserSearchQuerySetPayload deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        Map map;
        List list;
        List list2;
        int i7;
        double d6;
        String str;
        UserSearchQuerySetFilters userSearchQuerySetFilters;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = UserSearchQuerySetPayload.$childSerializers;
        int i10 = 6;
        int i11 = 3;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            UserSearchQuerySetFilters userSearchQuerySetFilters2 = (UserSearchQuerySetFilters) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, UserSearchQuerySetFilters$$serializer.INSTANCE, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            Map map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            double dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 5);
            map = map2;
            str = strDecodeStringElement;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            i7 = 127;
            list = list4;
            list2 = list3;
            userSearchQuerySetFilters = userSearchQuerySetFilters2;
            d6 = dDecodeDoubleElement;
        } else {
            double dDecodeDoubleElement2 = 0.0d;
            int i12 = 2;
            boolean z5 = true;
            int iDecodeIntElement2 = 0;
            Map map3 = null;
            List list5 = null;
            String strDecodeStringElement2 = null;
            UserSearchQuerySetFilters userSearchQuerySetFilters3 = null;
            int i13 = 0;
            List list6 = null;
            while (z5) {
                int i14 = i11;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        i11 = 3;
                        i12 = 2;
                        break;
                    case 0:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i13 |= 1;
                        i10 = 6;
                        i11 = 3;
                        i12 = 2;
                        break;
                    case 1:
                        userSearchQuerySetFilters3 = (UserSearchQuerySetFilters) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, UserSearchQuerySetFilters$$serializer.INSTANCE, userSearchQuerySetFilters3);
                        i13 |= 2;
                        i10 = 6;
                        i11 = 3;
                        i12 = 2;
                        break;
                    case 2:
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i12, (DeserializationStrategy) lazyArr[i12].getValue(), list6);
                        i13 |= 4;
                        i10 = 6;
                        i11 = 3;
                        break;
                    case 3:
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i14, (DeserializationStrategy) lazyArr[i14].getValue(), list5);
                        i13 |= 8;
                        i11 = i14;
                        i10 = 6;
                        break;
                    case 4:
                        map3 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), map3);
                        i13 |= 16;
                        i11 = i14;
                        break;
                    case 5:
                        dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 5);
                        i13 |= 32;
                        i11 = i14;
                        break;
                    case 6:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i10);
                        i13 |= 64;
                        i11 = i14;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            iDecodeIntElement = iDecodeIntElement2;
            map = map3;
            list = list5;
            list2 = list6;
            i7 = i13;
            d6 = dDecodeDoubleElement2;
            str = strDecodeStringElement2;
            userSearchQuerySetFilters = userSearchQuerySetFilters3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UserSearchQuerySetPayload(i7, str, userSearchQuerySetFilters, list2, list, map, d6, iDecodeIntElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull UserSearchQuerySetPayload value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UserSearchQuerySetPayload.write$Self$user_search_worker_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
