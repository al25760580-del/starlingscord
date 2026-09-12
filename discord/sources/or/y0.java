package or;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y0 implements Decoder, CompositeDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Serializable f17636c;

    public y0(String name, boolean z5) {
        this.f17634a = 1;
        Intrinsics.checkNotNullParameter(name, "name");
        this.f17636c = name;
        this.f17635b = z5;
    }

    public Integer c(y0 second) {
        Intrinsics.checkNotNullParameter(second, "visibility");
        sn.i iVar = vo.e1.f21805a;
        Intrinsics.checkNotNullParameter(this, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (this == second) {
            return 0;
        }
        sn.i iVar2 = vo.e1.f21805a;
        Integer num = (Integer) iVar2.get(this);
        Integer num2 = (Integer) iVar2.get(second);
        if (num == null || num2 == null || Intrinsics.areEqual(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public String d(String parentName, String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        if (parentName.length() == 0) {
            return childName;
        }
        return parentName + '.' + childName;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean decodeBoolean() {
        return e(v());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public boolean decodeBooleanElement(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return e(t(descriptor, i7));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public byte decodeByte() {
        return f(v());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public byte decodeByteElement(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return f(t(descriptor, i7));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char decodeChar() {
        return g(v());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public char decodeCharElement(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return g(t(descriptor, i7));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeCollectionSize(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return -1;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double decodeDouble() {
        return h(v());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public double decodeDoubleElement(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return h(t(descriptor, i7));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int decodeEnum(SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return i(v(), enumDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float decodeFloat() {
        return j(v());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public float decodeFloatElement(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return j(t(descriptor, i7));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder decodeInline(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return k(v(), descriptor);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public Decoder decodeInlineElement(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return k(t(descriptor, i7), ((o0) descriptor).j(i7));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        return l(v());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeIntElement(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return l(t(descriptor, i7));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public long decodeLong() {
        return m(v());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public long decodeLongElement(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return m(t(descriptor, i7));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        Object objS = CollectionsKt.S((ArrayList) this.f17636c);
        if (objS == null) {
            return false;
        }
        return n(objS);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Void decodeNull() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public Object decodeNullableSerializableElement(SerialDescriptor descriptor, int i7, DeserializationStrategy deserializer, Object obj) {
        Object objDecodeSerializableValue;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        ((ArrayList) this.f17636c).add(t(descriptor, i7));
        if (deserializer.getDescriptor().e() || decodeNotNullMark()) {
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            objDecodeSerializableValue = decodeSerializableValue(deserializer);
        } else {
            objDecodeSerializableValue = null;
        }
        if (!this.f17635b) {
            v();
        }
        this.f17635b = false;
        return objDecodeSerializableValue;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public boolean decodeSequentially() {
        return false;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public Object decodeSerializableElement(SerialDescriptor descriptor, int i7, DeserializationStrategy deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        ((ArrayList) this.f17636c).add(t(descriptor, i7));
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Object objDecodeSerializableValue = decodeSerializableValue(deserializer);
        if (!this.f17635b) {
            v();
        }
        this.f17635b = false;
        return objDecodeSerializableValue;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract Object decodeSerializableValue(DeserializationStrategy deserializationStrategy);

    @Override // kotlinx.serialization.encoding.Decoder
    public short decodeShort() {
        return o(v());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public short decodeShortElement(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return o(t(descriptor, i7));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public String decodeString() {
        return p(v());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public String decodeStringElement(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return p(t(descriptor, i7));
    }

    public abstract boolean e(Object obj);

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    public abstract byte f(Object obj);

    public abstract char g(Object obj);

    public abstract double h(Object obj);

    public abstract int i(Object obj, SerialDescriptor serialDescriptor);

    public abstract float j(Object obj);

    public Decoder k(Object obj, SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        ((ArrayList) this.f17636c).add(obj);
        return this;
    }

    public abstract int l(Object obj);

    public abstract long m(Object obj);

    public boolean n(Object obj) {
        return true;
    }

    public abstract short o(Object obj);

    public String p(Object obj) {
        Object objQ = q(obj);
        Intrinsics.checkNotNull(objQ, "null cannot be cast to non-null type kotlin.String");
        return (String) objQ;
    }

    public Object q(Object obj) {
        throw new kr.g(Reflection.getOrCreateKotlinClass(getClass()) + " can't retrieve untyped values");
    }

    public String r(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return descriptor.h(i7);
    }

    public String s() {
        return (String) this.f17636c;
    }

    public String t(SerialDescriptor serialDescriptor, int i7) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        String nestedName = r(serialDescriptor, i7);
        Intrinsics.checkNotNullParameter(nestedName, "nestedName");
        String str = (String) CollectionsKt.S((ArrayList) this.f17636c);
        if (str == null) {
            str = "";
        }
        return d(str, nestedName);
    }

    public String toString() {
        switch (this.f17634a) {
            case 1:
                return s();
            default:
                return super.toString();
        }
    }

    public Object v() {
        ArrayList arrayList = (ArrayList) this.f17636c;
        Object objRemove = arrayList.remove(kotlin.collections.d0.f(arrayList));
        this.f17635b = true;
        return objRemove;
    }

    public String w() {
        ArrayList arrayList = (ArrayList) this.f17636c;
        return arrayList.isEmpty() ? "$" : CollectionsKt.O(arrayList, ".", "$.", null, null, 60);
    }

    public y0() {
        this.f17634a = 0;
        this.f17636c = new ArrayList();
    }

    public y0 u() {
        return this;
    }
}
