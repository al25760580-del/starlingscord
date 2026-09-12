package com.discord.serialization;

import com.discord.serialization.IntEnum;
import gn.h;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.v0;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m3.m;
import mr.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00028\u0000¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00028\u00002\u0006\u0010 \u001a\u00020!¢\u0006\u0002\u0010\"R\u0015\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u000e\u001a&\u0012\f\u0012\n \u0010*\u0004\u0018\u00018\u00008\u0000 \u0010*\u0012\u0012\u000e\b\u0001\u0012\n \u0010*\u0004\u0018\u00018\u00008\u00000\u000f0\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/discord/serialization/IntEnumSerializer;", "T", "Lcom/discord/serialization/IntEnum;", "Lkotlinx/serialization/KSerializer;", "type", "Lkotlin/reflect/KClass;", "default", "<init>", "(Lkotlin/reflect/KClass;Lcom/discord/serialization/IntEnum;)V", "getDefault", "()Lcom/discord/serialization/IntEnum;", "Lcom/discord/serialization/IntEnum;", "serialName", "", "choices", "", "kotlin.jvm.PlatformType", "[Lcom/discord/serialization/IntEnum;", "choicesNumbers", "", "[Ljava/lang/Integer;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/serialization/IntEnum;)V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/serialization/IntEnum;", "serialization_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntEnumSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntEnumSerializer.kt\ncom/discord/serialization/IntEnumSerializer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n11228#2:65\n11563#2,3:66\n37#3:69\n36#3,3:70\n1#4:73\n*S KotlinDebug\n*F\n+ 1 IntEnumSerializer.kt\ncom/discord/serialization/IntEnumSerializer\n*L\n17#1:65\n17#1:66,3\n17#1:69\n17#1:70,3\n*E\n"})
public class IntEnumSerializer<T extends IntEnum> implements KSerializer {

    @NotNull
    private final T[] choices;

    @NotNull
    private final Integer[] choicesNumbers;
    private final T default;

    @NotNull
    private final SerialDescriptor descriptor;

    @NotNull
    private final String serialName;

    public IntEnumSerializer(@NotNull KClass type, T t5) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.default = t5;
        String simpleName = type.getSimpleName();
        Intrinsics.checkNotNull(simpleName);
        this.serialName = simpleName;
        Object[] enumConstants = h.B(type).getEnumConstants();
        Intrinsics.checkNotNull(enumConstants);
        T[] tArr = (T[]) ((IntEnum[]) enumConstants);
        this.choices = tArr;
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t10 : tArr) {
            arrayList.add(Integer.valueOf(t10.getSerialNumber()));
        }
        Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
        this.choicesNumbers = numArr;
        this.descriptor = m.a(this.serialName, e.f16062g);
        if (numArr.length != this.choices.length) {
            throw new IllegalArgumentException("There must be exactly one serial number for every enum constant.");
        }
        Intrinsics.checkNotNullParameter(numArr, "<this>");
        Intrinsics.checkNotNullParameter(numArr, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(v0.a(numArr.length));
        y.F(numArr, linkedHashSet);
        if (CollectionsKt.i0(linkedHashSet).size() != numArr.length) {
            throw new IllegalArgumentException("There must be no duplicates of serial numbers.");
        }
    }

    public final T getDefault() {
        return this.default;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final T deserialize(@NotNull Decoder decoder) {
        T t5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        int iDecodeInt = decoder.decodeInt();
        int iW = y.w(Integer.valueOf(iDecodeInt), this.choicesNumbers);
        if ((iW == -1 || iW < 0 || iW >= this.choices.length) && (t5 = this.default) != null) {
            return t5;
        }
        if (iW == -1) {
            throw new IllegalStateException((iDecodeInt + " is not a valid serial value of " + this.serialName).toString());
        }
        if (iW >= 0) {
            T[] tArr = this.choices;
            if (iW < tArr.length) {
                T t10 = tArr[iW];
                Intrinsics.checkNotNullExpressionValue(t10, "get(...)");
                return t10;
            }
        }
        throw new IllegalStateException((iW + " is not among valid " + this.serialName + " choices, choices size is " + this.choices.length).toString());
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull T value) {
        T t5;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        int iW = y.w(value, this.choices);
        if (iW == -1 && (t5 = this.default) != null) {
            encoder.v(t5.getSerialNumber());
            return;
        }
        if (iW != -1) {
            encoder.v(this.choicesNumbers[iW].intValue());
            return;
        }
        throw new IllegalStateException((value + " is not a valid enum " + this.serialName + ", choices are " + this.choices).toString());
    }

    public /* synthetic */ IntEnumSerializer(KClass kClass, IntEnum intEnum, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(kClass, (i7 & 2) != 0 ? null : intEnum);
    }
}
