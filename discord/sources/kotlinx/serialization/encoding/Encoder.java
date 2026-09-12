package kotlinx.serialization.encoding;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;

/* JADX INFO: loaded from: classes3.dex */
public interface Encoder {
    void B(long j);

    void D(String str);

    void a();

    CompositeEncoder beginStructure(SerialDescriptor serialDescriptor);

    void e(double d6);

    void f(short s2);

    SerializersModule getSerializersModule();

    void h(byte b10);

    void i(boolean z5);

    void m(float f2);

    void n(char c8);

    void o();

    CompositeEncoder s(SerialDescriptor serialDescriptor, int i7);

    void t(SerialDescriptor serialDescriptor, int i7);

    void v(int i7);

    Encoder w(SerialDescriptor serialDescriptor);

    void y(KSerializer kSerializer, Object obj);
}
