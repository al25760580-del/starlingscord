package or;

import com.discord.reactevents.ReactEvent;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17505a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f17507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f17508d;

    public b0(Object objectInstance, String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        this.f17506b = objectInstance;
        this.f17507c = kotlin.collections.n0.f14659d;
        this.f17508d = rn.l.a(rn.m.f19486e, new m7.a(3, serialName, this));
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int iDecodeElementIndex;
        int i7 = this.f17505a;
        Object obj = this.f17506b;
        switch (i7) {
            case 0:
                Enum[] enumArr = (Enum[]) obj;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                int iDecodeEnum = decoder.decodeEnum(getDescriptor());
                if (iDecodeEnum >= 0 && iDecodeEnum < enumArr.length) {
                    return enumArr[iDecodeEnum];
                }
                throw new kr.g(iDecodeEnum + " is not among valid " + getDescriptor().d() + " enum values, values size is " + enumArr.length);
            default:
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor descriptor = getDescriptor();
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
                if (!compositeDecoderBeginStructure.decodeSequentially() && (iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(getDescriptor())) != -1) {
                    throw new kr.g(kk.b.h(iDecodeElementIndex, "Unexpected index "));
                }
                Unit unit = Unit.f14616a;
                compositeDecoderBeginStructure.endStructure(descriptor);
                return obj;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        switch (this.f17505a) {
            case 0:
                return (SerialDescriptor) ((rn.u) this.f17508d).getValue();
            default:
                return (SerialDescriptor) this.f17508d.getValue();
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object value) {
        switch (this.f17505a) {
            case 0:
                Enum value2 = (Enum) value;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value2, "value");
                Enum[] enumArr = (Enum[]) this.f17506b;
                int iW = kotlin.collections.y.w(value2, enumArr);
                if (iW != -1) {
                    encoder.t(getDescriptor(), iW);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(value2);
                sb2.append(" is not a valid enum ");
                sb2.append(getDescriptor().d());
                sb2.append(", must be one of ");
                String string = Arrays.toString(enumArr);
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb2.append(string);
                throw new kr.g(sb2.toString());
            default:
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.beginStructure(getDescriptor()).endStructure(getDescriptor());
                return;
        }
    }

    public String toString() {
        switch (this.f17505a) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().d() + '>';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(String serialName, ReactEvent objectInstance, Annotation[] classAnnotations) {
        this(objectInstance, serialName);
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        this.f17507c = kotlin.collections.w.b(classAnnotations);
    }

    public b0(String serialName, Enum[] values) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f17506b = values;
        this.f17508d = rn.l.b(new m7.a(2, this, serialName));
    }
}
