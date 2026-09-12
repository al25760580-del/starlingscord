package pr;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;
import or.s1;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f18539a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f18540b = p.f18536b;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        m3.m.e(decoder);
        com.facebook.imagepipeline.nativecode.b.z(StringCompanionObject.INSTANCE);
        return new JsonObject((Map) com.facebook.imagepipeline.nativecode.b.b(s1.f17602a, i.f18527a).deserialize(decoder));
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f18540b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        JsonObject value = (JsonObject) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        m3.m.d(encoder);
        com.facebook.imagepipeline.nativecode.b.z(StringCompanionObject.INSTANCE);
        com.facebook.imagepipeline.nativecode.b.b(s1.f17602a, i.f18527a).serialize(encoder, value);
    }
}
