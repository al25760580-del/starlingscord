package kotlinx.serialization;

import c6.a;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.n0;
import kotlin.collections.v0;
import kotlin.collections.w;
import kotlin.collections.w0;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Encoder;
import or.b;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes3.dex */
public final class SealedClassSerializer extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KClass f14755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f14756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f14758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f14759e;

    public SealedClassSerializer(String serialName, KClass baseClass, KClass[] subclasses, KSerializer[] subclassSerializers) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(subclasses, "subclasses");
        Intrinsics.checkNotNullParameter(subclassSerializers, "subclassSerializers");
        this.f14755a = baseClass;
        this.f14756b = n0.f14659d;
        this.f14757c = l.a(m.f19486e, new a(29, serialName, this));
        if (subclasses.length != subclassSerializers.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + baseClass.getSimpleName() + " should be marked @Serializable");
        }
        Map mapL = w0.l(y.K(subclasses, subclassSerializers));
        this.f14758d = mapL;
        Set<Map.Entry> setEntrySet = mapL.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            String strD = ((KSerializer) entry.getValue()).getDescriptor().d();
            Object obj = linkedHashMap.get(strD);
            if (obj == null) {
                linkedHashMap.containsKey(strD);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + this.f14755a + "' have the same serial name '" + strD + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(strD, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(v0.a(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f14759e = linkedHashMap2;
    }

    @Override // or.b
    public final DeserializationStrategy a(CompositeDecoder decoder, String str) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        KSerializer kSerializer = (KSerializer) this.f14759e.get(str);
        return kSerializer != null ? kSerializer : super.a(decoder, str);
    }

    @Override // or.b
    public final KSerializer b(Encoder encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        KSerializer kSerializer = (KSerializer) this.f14758d.get(Reflection.getOrCreateKotlinClass(value.getClass()));
        KSerializer kSerializerB = kSerializer != null ? kSerializer : super.b(encoder, value);
        if (kSerializerB != null) {
            return kSerializerB;
        }
        return null;
    }

    @Override // or.b
    public final KClass c() {
        return this.f14755a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f14757c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SealedClassSerializer(String serialName, KClass baseClass, KClass[] subclasses, KSerializer[] subclassSerializers, Annotation[] classAnnotations) {
        this(serialName, baseClass, subclasses, subclassSerializers);
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(subclasses, "subclasses");
        Intrinsics.checkNotNullParameter(subclassSerializers, "subclassSerializers");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        this.f14756b = w.b(classAnnotations);
    }
}
