package or;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class g2 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g2 f17552a = new g2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k1 f17553b = new k1("kotlin.uuid.Uuid", mr.e.j);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String string;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        String hexString = decoder.decodeString();
        Intrinsics.checkNotNullParameter(hexString, "uuidString");
        int length = hexString.length();
        if (length == 32) {
            Intrinsics.checkNotNullParameter(hexString, "hexString");
            Intrinsics.checkNotNullParameter(hexString, "hexString");
            long jB = kotlin.text.d.b(0, 16, hexString);
            long jB2 = kotlin.text.d.b(16, 32, hexString);
            if (jB != 0 || jB2 != 0) {
                return new zq.a(jB, jB2);
            }
        } else {
            if (length != 36) {
                StringBuilder sb2 = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (hexString.length() <= 64) {
                    string = hexString;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    Intrinsics.checkNotNull(hexString, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = hexString.substring(0, 64);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    sb3.append(strSubstring);
                    sb3.append("...");
                    string = sb3.toString();
                }
                sb2.append(string);
                sb2.append("\" of length ");
                sb2.append(hexString.length());
                throw new IllegalArgumentException(sb2.toString());
            }
            Intrinsics.checkNotNullParameter(hexString, "hexDashString");
            Intrinsics.checkNotNullParameter(hexString, "hexDashString");
            long jB3 = kotlin.text.d.b(0, 8, hexString);
            mf.f.d(8, hexString);
            long jB4 = kotlin.text.d.b(9, 13, hexString);
            mf.f.d(13, hexString);
            long jB5 = kotlin.text.d.b(14, 18, hexString);
            mf.f.d(18, hexString);
            long jB6 = kotlin.text.d.b(19, 23, hexString);
            mf.f.d(23, hexString);
            long j = (jB4 << 16) | (jB3 << 32) | jB5;
            long jB7 = kotlin.text.d.b(24, 36, hexString) | (jB6 << 48);
            if (j != 0 || jB7 != 0) {
                return new zq.a(j, jB7);
            }
        }
        return zq.a.f24079v;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f17553b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        zq.a value = (zq.a) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.D(value.toString());
    }
}
