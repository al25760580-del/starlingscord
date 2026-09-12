package or;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: loaded from: classes3.dex */
public final class q1 extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q1 f17594c;

    static {
        Intrinsics.checkNotNullParameter(ShortCompanionObject.INSTANCE, "<this>");
        f17594c = new q1(r1.f17597a);
    }

    @Override // or.a
    public final int e(Object obj) {
        short[] sArr = (short[]) obj;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }

    @Override // or.t, or.a
    public final void h(CompositeDecoder decoder, int i7, Object obj) {
        p1 builder = (p1) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        short sDecodeShortElement = decoder.decodeShortElement(this.f17564b, i7);
        builder.getClass();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f17589a;
        int i10 = builder.f17590b;
        builder.f17590b = i10 + 1;
        sArr[i10] = sDecodeShortElement;
    }

    @Override // or.a
    public final Object i(Object obj) {
        short[] bufferWithData = (short[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        p1 p1Var = new p1();
        p1Var.f17589a = bufferWithData;
        p1Var.f17590b = bufferWithData.length;
        p1Var.b(10);
        return p1Var;
    }

    @Override // or.j1
    public final Object l() {
        return new short[0];
    }

    @Override // or.j1
    public final void m(CompositeEncoder encoder, Object obj, int i7) {
        short[] content = (short[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            encoder.z(this.f17564b, i10, content[i10]);
        }
    }
}
