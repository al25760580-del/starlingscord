package or;

import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class v1 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v1 f17619a = new v1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i0 f17620b;

    static {
        Intrinsics.checkNotNullParameter(ByteCompanionObject.INSTANCE, "<this>");
        f17620b = e1.a("kotlin.UByte", j.f17561a);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new rn.y(decoder.decodeInline(f17620b).decodeByte());
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f17620b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        byte b10 = ((rn.y) obj).f19501d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.w(f17620b).h(b10);
    }
}
