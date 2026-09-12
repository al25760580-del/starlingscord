package pr;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f18534a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mr.g f18535b = m3.m.g("kotlinx.serialization.json.JsonNull", mr.i.f16076b, new SerialDescriptor[0], new f6.a(17));

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        m3.m.e(decoder);
        if (decoder.decodeNotNullMark()) {
            Intrinsics.checkNotNullParameter("Expected 'null' literal", "message");
            throw new qr.m("Expected 'null' literal");
        }
        decoder.decodeNull();
        return JsonNull.INSTANCE;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f18535b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        JsonNull value = (JsonNull) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        m3.m.d(encoder);
        encoder.a();
    }
}
