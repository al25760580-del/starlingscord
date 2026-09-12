package or;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v0 extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KSerializer f17617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KSerializer f17618b;

    public v0(KSerializer kSerializer, KSerializer kSerializer2) {
        this.f17617a = kSerializer;
        this.f17618b = kSerializer2;
    }

    @Override // or.a
    public final void g(CompositeDecoder decoder, Object obj, int i7, int i10) {
        Map builder = (Map) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (i10 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        kotlin.ranges.a aVarG = lo.j.g(2, lo.j.i(0, i10 * 2));
        int i11 = aVarG.f14688d;
        int i12 = aVarG.f14689e;
        int i13 = aVarG.f14690i;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return;
        }
        while (true) {
            k(decoder, i7 + i11, builder, false);
            if (i11 == i12) {
                return;
            } else {
                i11 += i13;
            }
        }
    }

    @Override // or.a
    public final /* bridge */ /* synthetic */ void h(CompositeDecoder compositeDecoder, int i7, Object obj) {
        k(compositeDecoder, i7, (Map) obj, true);
    }

    public final void k(CompositeDecoder decoder, int i7, Map builder, boolean z5) {
        int iDecodeElementIndex;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Object objDecodeSerializableElement = decoder.decodeSerializableElement(getDescriptor(), i7, this.f17617a, null);
        if (z5) {
            iDecodeElementIndex = decoder.decodeElementIndex(getDescriptor());
            if (iDecodeElementIndex != i7 + 1) {
                throw new IllegalArgumentException(a3.e.g(i7, iDecodeElementIndex, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
            }
        } else {
            iDecodeElementIndex = i7 + 1;
        }
        boolean zContainsKey = builder.containsKey(objDecodeSerializableElement);
        KSerializer kSerializer = this.f17618b;
        builder.put(objDecodeSerializableElement, (!zContainsKey || (kSerializer.getDescriptor().c() instanceof mr.f)) ? decoder.decodeSerializableElement(getDescriptor(), iDecodeElementIndex, kSerializer, null) : decoder.decodeSerializableElement(getDescriptor(), iDecodeElementIndex, kSerializer, kotlin.collections.w0.e(builder, objDecodeSerializableElement)));
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iE = e(obj);
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderS = encoder.s(descriptor, iE);
        Iterator itD = d(obj);
        int i7 = 0;
        while (itD.hasNext()) {
            Map.Entry entry = (Map.Entry) itD.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i10 = i7 + 1;
            compositeEncoderS.g(getDescriptor(), i7, this.f17617a, key);
            i7 += 2;
            compositeEncoderS.g(getDescriptor(), i10, this.f17618b, value);
        }
        compositeEncoderS.endStructure(descriptor);
    }
}
