package pr;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f18524a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f18525b = c.f18521b;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        m3.m.e(decoder);
        return new kotlinx.serialization.json.a((List) com.facebook.imagepipeline.nativecode.b.a(i.f18527a).deserialize(decoder));
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f18525b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.json.a value = (kotlinx.serialization.json.a) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        m3.m.d(encoder);
        com.facebook.imagepipeline.nativecode.b.a(i.f18527a).serialize(encoder, value);
    }
}
