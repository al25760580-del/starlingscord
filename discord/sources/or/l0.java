package or;

import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l0 f17570c;

    static {
        Intrinsics.checkNotNullParameter(IntCompanionObject.INSTANCE, "<this>");
        f17570c = new l0(m0.f17573a);
    }

    @Override // or.a
    public final int e(Object obj) {
        int[] iArr = (int[]) obj;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    @Override // or.t, or.a
    public final void h(CompositeDecoder decoder, int i7, Object obj) {
        k0 builder = (k0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        int iDecodeIntElement = decoder.decodeIntElement(this.f17564b, i7);
        builder.getClass();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f17566a;
        int i10 = builder.f17567b;
        builder.f17567b = i10 + 1;
        iArr[i10] = iDecodeIntElement;
    }

    @Override // or.a
    public final Object i(Object obj) {
        int[] bufferWithData = (int[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        k0 k0Var = new k0();
        k0Var.f17566a = bufferWithData;
        k0Var.f17567b = bufferWithData.length;
        k0Var.b(10);
        return k0Var;
    }

    @Override // or.j1
    public final Object l() {
        return new int[0];
    }

    @Override // or.j1
    public final void m(CompositeEncoder encoder, Object obj, int i7) {
        int[] content = (int[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            encoder.l(i10, content[i10], this.f17564b);
        }
    }
}
