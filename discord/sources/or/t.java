package or;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KSerializer f17604a;

    public t(KSerializer kSerializer) {
        this.f17604a = kSerializer;
    }

    @Override // or.a
    public final void g(CompositeDecoder decoder, Object obj, int i7, int i10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (i10 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            h(decoder, i7 + i11, obj);
        }
    }

    @Override // or.a
    public void h(CompositeDecoder decoder, int i7, Object obj) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        k(i7, obj, decoder.decodeSerializableElement(getDescriptor(), i7, this.f17604a, null));
    }

    public abstract void k(int i7, Object obj, Object obj2);

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iE = e(obj);
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderS = encoder.s(descriptor, iE);
        Iterator itD = d(obj);
        for (int i7 = 0; i7 < iE; i7++) {
            compositeEncoderS.g(getDescriptor(), i7, this.f17604a, itD.next());
        }
        compositeEncoderS.endStructure(descriptor);
    }
}
