package or;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class f2 implements KSerializer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f2 f17535b = new f2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f17536a = new b0(Unit.f14616a, "kotlin.Unit");

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        this.f17536a.deserialize(decoder);
        return Unit.f14616a;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return this.f17536a.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Unit value = (Unit) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f17536a.serialize(encoder, value);
    }
}
