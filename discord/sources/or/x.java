package or;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f17626a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k1 f17627b = new k1("kotlin.time.Duration", mr.e.j);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        yq.a aVar = Duration.f14747e;
        String value = decoder.decodeString();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return new Duration(yq.c.a(value));
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(s0.g.e("Invalid ISO duration string format: '", value, "'."), e10);
        }
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f17627b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long j = ((Duration) obj).f14750d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        yq.a aVar = Duration.f14747e;
        StringBuilder sb2 = new StringBuilder();
        if (j < 0) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jM = j < 0 ? Duration.m(j) : j;
        long jK = Duration.k(jM, yq.d.HOURS);
        int iE = Duration.e(jM);
        int iG = Duration.g(jM);
        int iF = Duration.f(jM);
        if (Duration.h(j)) {
            jK = 9999999999999L;
        }
        boolean z5 = false;
        boolean z6 = jK != 0;
        boolean z7 = (iG == 0 && iF == 0) ? false : true;
        if (iE != 0 || (z7 && z6)) {
            z5 = true;
        }
        if (z6) {
            sb2.append(jK);
            sb2.append('H');
        }
        if (z5) {
            sb2.append(iE);
            sb2.append('M');
        }
        if (z7 || (!z6 && !z5)) {
            Duration.b(sb2, iG, iF, 9, "S", true);
        }
        encoder.D(sb2.toString());
    }
}
