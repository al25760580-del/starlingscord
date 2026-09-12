package or;

import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f17558c;

    static {
        Intrinsics.checkNotNullParameter(ByteCompanionObject.INSTANCE, "<this>");
        f17558c = new i(j.f17561a);
    }

    @Override // or.a
    public final int e(Object obj) {
        byte[] bArr = (byte[]) obj;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    @Override // or.t, or.a
    public final void h(CompositeDecoder decoder, int i7, Object obj) {
        h builder = (h) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        byte bDecodeByteElement = decoder.decodeByteElement(this.f17564b, i7);
        builder.getClass();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f17554a;
        int i10 = builder.f17555b;
        builder.f17555b = i10 + 1;
        bArr[i10] = bDecodeByteElement;
    }

    @Override // or.a
    public final Object i(Object obj) {
        byte[] bufferWithData = (byte[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        h hVar = new h();
        hVar.f17554a = bufferWithData;
        hVar.f17555b = bufferWithData.length;
        hVar.b(10);
        return hVar;
    }

    @Override // or.j1
    public final Object l() {
        return new byte[0];
    }

    @Override // or.j1
    public final void m(CompositeEncoder encoder, Object obj, int i7) {
        byte[] content = (byte[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i7; i10++) {
            encoder.d(this.f17564b, i10, content[i10]);
        }
    }
}
