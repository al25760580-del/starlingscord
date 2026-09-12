package or;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class x1 extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x1 f17628c;

    static {
        Intrinsics.checkNotNullParameter(rn.b0.f19461e, "<this>");
        f17628c = new x1(y1.f17637a);
    }

    @Override // or.a
    public final int e(Object obj) {
        int[] collectionSize = ((rn.c0) obj).f19467d;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // or.t, or.a
    public final void h(CompositeDecoder decoder, int i7, Object obj) {
        w1 builder = (w1) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        int iDecodeInt = decoder.decodeInlineElement(this.f17564b, i7).decodeInt();
        rn.a0 a0Var = rn.b0.f19461e;
        builder.getClass();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f17624a;
        int i10 = builder.f17625b;
        builder.f17625b = i10 + 1;
        iArr[i10] = iDecodeInt;
    }

    @Override // or.a
    public final Object i(Object obj) {
        int[] bufferWithData = ((rn.c0) obj).f19467d;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        w1 w1Var = new w1();
        w1Var.f17624a = bufferWithData;
        w1Var.f17625b = bufferWithData.length;
        w1Var.b(10);
        return w1Var;
    }

    @Override // or.j1
    public final Object l() {
        int[] storage = new int[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new rn.c0(storage);
    }

    @Override // or.j1
    public final void m(CompositeEncoder encoder, Object obj, int i7) {
        int[] content = ((rn.c0) obj).f19467d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            Encoder encoderX = encoder.x(this.f17564b, i10);
            int i11 = content[i10];
            rn.a0 a0Var = rn.b0.f19461e;
            encoderX.v(i11);
        }
    }
}
