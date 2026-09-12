package or;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class d2 extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d2 f17522c;

    static {
        Intrinsics.checkNotNullParameter(rn.i0.f19474e, "<this>");
        f17522c = new d2(e2.f17530a);
    }

    @Override // or.a
    public final int e(Object obj) {
        short[] collectionSize = ((rn.j0) obj).f19476d;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // or.t, or.a
    public final void h(CompositeDecoder decoder, int i7, Object obj) {
        c2 builder = (c2) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        short sDecodeShort = decoder.decodeInlineElement(this.f17564b, i7).decodeShort();
        rn.h0 h0Var = rn.i0.f19474e;
        builder.getClass();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f17517a;
        int i10 = builder.f17518b;
        builder.f17518b = i10 + 1;
        sArr[i10] = sDecodeShort;
    }

    @Override // or.a
    public final Object i(Object obj) {
        short[] bufferWithData = ((rn.j0) obj).f19476d;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        c2 c2Var = new c2();
        c2Var.f17517a = bufferWithData;
        c2Var.f17518b = bufferWithData.length;
        c2Var.b(10);
        return c2Var;
    }

    @Override // or.j1
    public final Object l() {
        short[] storage = new short[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new rn.j0(storage);
    }

    @Override // or.j1
    public final void m(CompositeEncoder encoder, Object obj, int i7) {
        short[] content = ((rn.j0) obj).f19476d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            Encoder encoderX = encoder.x(this.f17564b, i10);
            short s2 = content[i10];
            rn.h0 h0Var = rn.i0.f19474e;
            encoderX.f(s2);
        }
    }
}
