package or;

import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class y1 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y1 f17637a = new y1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i0 f17638b;

    static {
        Intrinsics.checkNotNullParameter(IntCompanionObject.INSTANCE, "<this>");
        f17638b = e1.a("kotlin.UInt", m0.f17573a);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new rn.b0(decoder.decodeInline(f17638b).decodeInt());
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f17638b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int i7 = ((rn.b0) obj).f19462d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.w(f17638b).v(i7);
    }
}
