package or;

import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f17532c;

    static {
        Intrinsics.checkNotNullParameter(BooleanCompanionObject.INSTANCE, "<this>");
        f17532c = new f(g.f17537a);
    }

    @Override // or.a
    public final int e(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    @Override // or.t, or.a
    public final void h(CompositeDecoder decoder, int i7, Object obj) {
        e builder = (e) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean zDecodeBooleanElement = decoder.decodeBooleanElement(this.f17564b, i7);
        builder.getClass();
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.f17523a;
        int i10 = builder.f17524b;
        builder.f17524b = i10 + 1;
        zArr[i10] = zDecodeBooleanElement;
    }

    @Override // or.a
    public final Object i(Object obj) {
        boolean[] bufferWithData = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        e eVar = new e();
        eVar.f17523a = bufferWithData;
        eVar.f17524b = bufferWithData.length;
        eVar.b(10);
        return eVar;
    }

    @Override // or.j1
    public final Object l() {
        return new boolean[0];
    }

    @Override // or.j1
    public final void m(CompositeEncoder encoder, Object obj, int i7) {
        boolean[] content = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            encoder.p(this.f17564b, i10, content[i10]);
        }
    }
}
