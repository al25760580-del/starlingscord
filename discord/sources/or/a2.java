package or;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class a2 extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a2 f17504c;

    static {
        Intrinsics.checkNotNullParameter(rn.e0.f19470e, "<this>");
        f17504c = new a2(b2.f17511a);
    }

    @Override // or.a
    public final int e(Object obj) {
        long[] collectionSize = ((rn.f0) obj).f19472d;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // or.t, or.a
    public final void h(CompositeDecoder decoder, int i7, Object obj) {
        z1 builder = (z1) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        long jDecodeLong = decoder.decodeInlineElement(this.f17564b, i7).decodeLong();
        rn.d0 d0Var = rn.e0.f19470e;
        builder.getClass();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f17643a;
        int i10 = builder.f17644b;
        builder.f17644b = i10 + 1;
        jArr[i10] = jDecodeLong;
    }

    @Override // or.a
    public final Object i(Object obj) {
        long[] bufferWithData = ((rn.f0) obj).f19472d;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        z1 z1Var = new z1();
        z1Var.f17643a = bufferWithData;
        z1Var.f17644b = bufferWithData.length;
        z1Var.b(10);
        return z1Var;
    }

    @Override // or.j1
    public final Object l() {
        long[] storage = new long[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new rn.f0(storage);
    }

    @Override // or.j1
    public final void m(CompositeEncoder encoder, Object obj, int i7) {
        long[] content = ((rn.f0) obj).f19472d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            Encoder encoderX = encoder.x(this.f17564b, i10);
            long j = content[i10];
            rn.d0 d0Var = rn.e0.f19470e;
            encoderX.B(j);
        }
    }
}
