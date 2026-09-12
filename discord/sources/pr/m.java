package pr;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.c0;
import kotlin.text.w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import or.b2;
import or.k1;
import rn.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f18532a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k1 f18533b = m3.m.a("kotlinx.serialization.json.JsonLiteral", mr.e.j);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonElement jsonElementA = m3.m.e(decoder).a();
        if (jsonElementA instanceof l) {
            return (l) jsonElementA;
        }
        throw qr.p.d(-1, jsonElementA.toString(), "Unexpected JSON element, expected JsonLiteral, had " + Reflection.getOrCreateKotlinClass(jsonElementA.getClass()));
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f18533b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Double dValueOf;
        l value = (l) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        m3.m.d(encoder);
        boolean z5 = value.f18530d;
        String str = value.f18531e;
        if (z5) {
            encoder.D(str);
            return;
        }
        Long lA0 = StringsKt.a0(str);
        if (lA0 != null) {
            encoder.B(lA0.longValue());
            return;
        }
        e0 e0VarF = c0.f(str);
        if (e0VarF != null) {
            long j = e0VarF.f19471d;
            Intrinsics.checkNotNullParameter(e0.f19470e, "<this>");
            encoder.w(b2.f17512b).B(j);
            return;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Boolean bool = null;
        try {
            dValueOf = w.d(str) ? Double.valueOf(Double.parseDouble(str)) : null;
        } catch (NumberFormatException unused) {
        }
        if (dValueOf != null) {
            encoder.e(dValueOf.doubleValue());
            return;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.areEqual(str, "true")) {
            bool = Boolean.TRUE;
        } else if (Intrinsics.areEqual(str, "false")) {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            encoder.i(bool.booleanValue());
        } else {
            encoder.D(str);
        }
    }
}
