package or;

import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f17583c;

    static {
        Intrinsics.checkNotNullParameter(CharCompanionObject.INSTANCE, "<this>");
        f17583c = new o(p.f17585a);
    }

    @Override // or.a
    public final int e(Object obj) {
        char[] cArr = (char[]) obj;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }

    @Override // or.t, or.a
    public final void h(CompositeDecoder decoder, int i7, Object obj) {
        n builder = (n) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        char cDecodeCharElement = decoder.decodeCharElement(this.f17564b, i7);
        builder.getClass();
        builder.b(builder.d() + 1);
        char[] cArr = builder.f17577a;
        int i10 = builder.f17578b;
        builder.f17578b = i10 + 1;
        cArr[i10] = cDecodeCharElement;
    }

    @Override // or.a
    public final Object i(Object obj) {
        char[] bufferWithData = (char[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        n nVar = new n();
        nVar.f17577a = bufferWithData;
        nVar.f17578b = bufferWithData.length;
        nVar.b(10);
        return nVar;
    }

    @Override // or.j1
    public final Object l() {
        return new char[0];
    }

    @Override // or.j1
    public final void m(CompositeEncoder encoder, Object obj, int i7) {
        char[] content = (char[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            encoder.k(this.f17564b, i10, content[i10]);
        }
    }
}
