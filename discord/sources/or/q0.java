package or;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q0 f17593c;

    static {
        Intrinsics.checkNotNullParameter(LongCompanionObject.INSTANCE, "<this>");
        f17593c = new q0(r0.f17595a);
    }

    @Override // or.a
    public final int e(Object obj) {
        long[] jArr = (long[]) obj;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }

    @Override // or.t, or.a
    public final void h(CompositeDecoder decoder, int i7, Object obj) {
        p0 builder = (p0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        long jDecodeLongElement = decoder.decodeLongElement(this.f17564b, i7);
        builder.getClass();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f17587a;
        int i10 = builder.f17588b;
        builder.f17588b = i10 + 1;
        jArr[i10] = jDecodeLongElement;
    }

    @Override // or.a
    public final Object i(Object obj) {
        long[] bufferWithData = (long[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        p0 p0Var = new p0();
        p0Var.f17587a = bufferWithData;
        p0Var.f17588b = bufferWithData.length;
        p0Var.b(10);
        return p0Var;
    }

    @Override // or.j1
    public final Object l() {
        return new long[0];
    }

    @Override // or.j1
    public final void m(CompositeEncoder encoder, Object obj, int i7) {
        long[] content = (long[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            encoder.C(this.f17564b, i10, content[i10]);
        }
    }
}
