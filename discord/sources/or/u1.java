package or;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class u1 extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u1 f17615c;

    static {
        Intrinsics.checkNotNullParameter(rn.y.f19500e, "<this>");
        f17615c = new u1(v1.f17619a);
    }

    @Override // or.a
    public final int e(Object obj) {
        byte[] collectionSize = ((rn.z) obj).f19502d;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // or.t, or.a
    public final void h(CompositeDecoder decoder, int i7, Object obj) {
        t1 builder = (t1) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        byte bDecodeByte = decoder.decodeInlineElement(this.f17564b, i7).decodeByte();
        rn.x xVar = rn.y.f19500e;
        builder.getClass();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f17607a;
        int i10 = builder.f17608b;
        builder.f17608b = i10 + 1;
        bArr[i10] = bDecodeByte;
    }

    @Override // or.a
    public final Object i(Object obj) {
        byte[] bufferWithData = ((rn.z) obj).f19502d;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        t1 t1Var = new t1();
        t1Var.f17607a = bufferWithData;
        t1Var.f17608b = bufferWithData.length;
        t1Var.b(10);
        return t1Var;
    }

    @Override // or.j1
    public final Object l() {
        byte[] storage = new byte[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new rn.z(storage);
    }

    @Override // or.j1
    public final void m(CompositeEncoder encoder, Object obj, int i7) {
        byte[] content = ((rn.z) obj).f19502d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            Encoder encoderX = encoder.x(this.f17564b, i10);
            byte b10 = content[i10];
            rn.x xVar = rn.y.f19500e;
            encoderX.h(b10);
        }
    }
}
