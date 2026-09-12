package kotlinx.serialization.encoding;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import or.i1;

/* JADX INFO: loaded from: classes3.dex */
public interface CompositeEncoder {
    void A(SerialDescriptor serialDescriptor, int i7, double d6);

    void C(SerialDescriptor serialDescriptor, int i7, long j);

    void d(i1 i1Var, int i7, byte b10);

    void endStructure(SerialDescriptor serialDescriptor);

    void g(SerialDescriptor serialDescriptor, int i7, KSerializer kSerializer, Object obj);

    void j(SerialDescriptor serialDescriptor, int i7, float f2);

    void k(i1 i1Var, int i7, char c8);

    void l(int i7, int i10, SerialDescriptor serialDescriptor);

    void p(SerialDescriptor serialDescriptor, int i7, boolean z5);

    void q(SerialDescriptor serialDescriptor, int i7, String str);

    void r(SerialDescriptor serialDescriptor, int i7, KSerializer kSerializer, Object obj);

    boolean u(SerialDescriptor serialDescriptor, int i7);

    Encoder x(i1 i1Var, int i7);

    void z(i1 i1Var, int i7, short s2);
}
