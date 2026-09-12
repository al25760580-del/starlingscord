package or;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class e2 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e2 f17530a = new e2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i0 f17531b;

    static {
        Intrinsics.checkNotNullParameter(ShortCompanionObject.INSTANCE, "<this>");
        f17531b = e1.a("kotlin.UShort", r1.f17597a);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new rn.i0(decoder.decodeInline(f17531b).decodeShort());
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f17531b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        short s2 = ((rn.i0) obj).f19475d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.w(f17531b).f(s2);
    }
}
