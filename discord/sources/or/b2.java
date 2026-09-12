package or;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class b2 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b2 f17511a = new b2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i0 f17512b;

    static {
        Intrinsics.checkNotNullParameter(LongCompanionObject.INSTANCE, "<this>");
        f17512b = e1.a("kotlin.ULong", r0.f17595a);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new rn.e0(decoder.decodeInline(f17512b).decodeLong());
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f17512b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long j = ((rn.e0) obj).f19471d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.w(f17512b).B(j);
    }
}
