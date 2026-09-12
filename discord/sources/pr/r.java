package pr;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f18541a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mr.g f18542b = m3.m.g("kotlinx.serialization.json.JsonPrimitive", mr.e.j, new SerialDescriptor[0], new f6.a(17));

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonElement jsonElementA = m3.m.e(decoder).a();
        if (jsonElementA instanceof JsonPrimitive) {
            return (JsonPrimitive) jsonElementA;
        }
        throw qr.p.d(-1, jsonElementA.toString(), "Unexpected JSON element, expected JsonPrimitive, had " + Reflection.getOrCreateKotlinClass(jsonElementA.getClass()));
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f18542b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        JsonPrimitive value = (JsonPrimitive) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        m3.m.d(encoder);
        if (value instanceof JsonNull) {
            encoder.y(o.f18534a, JsonNull.INSTANCE);
        } else {
            encoder.y(m.f18532a, (l) value);
        }
    }
}
