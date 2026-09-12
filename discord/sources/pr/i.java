package pr;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f18527a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mr.g f18528b = m3.m.g("kotlinx.serialization.json.JsonElement", mr.c.f16056c, new SerialDescriptor[0], new n6.e(5));

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return m3.m.e(decoder).a();
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f18528b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        JsonElement value = (JsonElement) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        m3.m.d(encoder);
        if (value instanceof JsonPrimitive) {
            encoder.y(r.f18541a, value);
        } else if (value instanceof JsonObject) {
            encoder.y(q.f18539a, value);
        } else {
            if (!(value instanceof kotlinx.serialization.json.a)) {
                throw new rn.n();
            }
            encoder.y(d.f18524a, value);
        }
    }
}
