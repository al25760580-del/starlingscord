package or;

import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f17521c;

    static {
        Intrinsics.checkNotNullParameter(FloatCompanionObject.INSTANCE, "<this>");
        f17521c = new d0(e0.f17525a);
    }

    @Override // or.a
    public final int e(Object obj) {
        float[] fArr = (float[]) obj;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    @Override // or.t, or.a
    public final void h(CompositeDecoder decoder, int i7, Object obj) {
        c0 builder = (c0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        float fDecodeFloatElement = decoder.decodeFloatElement(this.f17564b, i7);
        builder.getClass();
        builder.b(builder.d() + 1);
        float[] fArr = builder.f17514a;
        int i10 = builder.f17515b;
        builder.f17515b = i10 + 1;
        fArr[i10] = fDecodeFloatElement;
    }

    @Override // or.a
    public final Object i(Object obj) {
        float[] bufferWithData = (float[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        c0 c0Var = new c0();
        c0Var.f17514a = bufferWithData;
        c0Var.f17515b = bufferWithData.length;
        c0Var.b(10);
        return c0Var;
    }

    @Override // or.j1
    public final Object l() {
        return new float[0];
    }

    @Override // or.j1
    public final void m(CompositeEncoder encoder, Object obj, int i7) {
        float[] content = (float[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            encoder.j(this.f17564b, i10, content[i10]);
        }
    }
}
