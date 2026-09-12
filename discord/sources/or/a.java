package or;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements KSerializer {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract void c(int i7, Object obj);

    public abstract Iterator d(Object obj);

    @Override // kotlinx.serialization.DeserializationStrategy
    public Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return f(decoder);
    }

    public abstract int e(Object obj);

    public final Object f(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Object objA = a();
        int iB = b(objA);
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(getDescriptor());
        if (!compositeDecoderBeginStructure.decodeSequentially()) {
            while (true) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    break;
                }
                h(compositeDecoderBeginStructure, iDecodeElementIndex + iB, objA);
            }
        } else {
            int iDecodeCollectionSize = compositeDecoderBeginStructure.decodeCollectionSize(getDescriptor());
            c(iDecodeCollectionSize, objA);
            g(compositeDecoderBeginStructure, objA, iB, iDecodeCollectionSize);
        }
        compositeDecoderBeginStructure.endStructure(getDescriptor());
        return j(objA);
    }

    public abstract void g(CompositeDecoder compositeDecoder, Object obj, int i7, int i10);

    public abstract void h(CompositeDecoder compositeDecoder, int i7, Object obj);

    public abstract Object i(Object obj);

    public abstract Object j(Object obj);
}
