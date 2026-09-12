package or;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j1 extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f17564b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(KSerializer primitiveSerializer) {
        super(primitiveSerializer);
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        this.f17564b = new i1(primitiveSerializer.getDescriptor());
    }

    @Override // or.a
    public final Object a() {
        return (h1) i(l());
    }

    @Override // or.a
    public final int b(Object obj) {
        h1 h1Var = (h1) obj;
        Intrinsics.checkNotNullParameter(h1Var, "<this>");
        return h1Var.d();
    }

    @Override // or.a
    public final void c(int i7, Object obj) {
        h1 h1Var = (h1) obj;
        Intrinsics.checkNotNullParameter(h1Var, "<this>");
        h1Var.b(i7);
    }

    @Override // or.a
    public final Iterator d(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // or.a, kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return f(decoder);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return this.f17564b;
    }

    @Override // or.a
    public final Object j(Object obj) {
        h1 h1Var = (h1) obj;
        Intrinsics.checkNotNullParameter(h1Var, "<this>");
        return h1Var.a();
    }

    @Override // or.t
    public final void k(int i7, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter((h1) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object l();

    public abstract void m(CompositeEncoder compositeEncoder, Object obj, int i7);

    @Override // or.t, kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iE = e(obj);
        i1 i1Var = this.f17564b;
        CompositeEncoder compositeEncoderS = encoder.s(i1Var, iE);
        m(compositeEncoderS, obj, iE);
        compositeEncoderS.endStructure(i1Var);
    }
}
