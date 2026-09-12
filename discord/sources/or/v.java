package or;

import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f17616c;

    static {
        Intrinsics.checkNotNullParameter(DoubleCompanionObject.INSTANCE, "<this>");
        f17616c = new v(w.f17621a);
    }

    @Override // or.a
    public final int e(Object obj) {
        double[] dArr = (double[]) obj;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }

    @Override // or.t, or.a
    public final void h(CompositeDecoder decoder, int i7, Object obj) {
        u builder = (u) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        double dDecodeDoubleElement = decoder.decodeDoubleElement(this.f17564b, i7);
        builder.getClass();
        builder.b(builder.d() + 1);
        double[] dArr = builder.f17609a;
        int i10 = builder.f17610b;
        builder.f17610b = i10 + 1;
        dArr[i10] = dDecodeDoubleElement;
    }

    @Override // or.a
    public final Object i(Object obj) {
        double[] bufferWithData = (double[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        u uVar = new u();
        uVar.f17609a = bufferWithData;
        uVar.f17610b = bufferWithData.length;
        uVar.b(10);
        return uVar;
    }

    @Override // or.j1
    public final Object l() {
        return new double[0];
    }

    @Override // or.j1
    public final void m(CompositeEncoder encoder, Object obj, int i7) {
        double[] content = (double[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            encoder.A(this.f17564b, i10, content[i10]);
        }
    }
}
