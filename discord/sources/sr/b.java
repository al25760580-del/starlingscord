package sr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b0;
import kotlin.text.x;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.modules.SerializersModule;
import kr.g;
import m3.m;
import mr.j;
import or.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f20558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SerializersModule f20559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f20561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f20562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a f20563i;

    public b(a aVar, Map map, SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f20563i = aVar;
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f20558d = map;
        this.f20559e = aVar.f20557a;
        boolean z5 = Intrinsics.areEqual(descriptor.c(), j.f16078c) || Intrinsics.areEqual(descriptor.c(), j.f16079d);
        this.f20561g = z5;
        this.f20562h = z5 ? Integer.MAX_VALUE : descriptor.g();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        b other = new b(this.f20563i, this.f20558d, descriptor);
        Intrinsics.checkNotNullParameter(other, "other");
        ((ArrayList) other.f17636c).addAll((ArrayList) this.f17636c);
        return other;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeElementIndex(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        do {
            int i7 = this.f20560f;
            if (i7 >= this.f20562h) {
                return -1;
            }
            this.f20560f = i7 + 1;
            String strT = t(descriptor, i7);
            Set<String> setKeySet = this.f20558d.keySet();
            if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                for (String str : setKeySet) {
                    if (x.o(str, strT, false) && (str.length() == strT.length() || str.charAt(strT.length()) == '.')) {
                        return this.f20560f - 1;
                    }
                }
            }
        } while (!this.f20561g);
        return -1;
    }

    @Override // or.y0, kotlinx.serialization.encoding.Decoder
    public final Object decodeSerializableValue(DeserializationStrategy deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!(deserializer instanceof or.b)) {
            return deserializer.deserialize(this);
        }
        Intrinsics.checkNotNullParameter("type", "nestedName");
        String str = (String) CollectionsKt.S((ArrayList) this.f17636c);
        if (str == null) {
            str = "";
        }
        Object obj = this.f20558d.get(d(str, "type"));
        return m.y((or.b) deserializer, this, obj != null ? obj.toString() : null).deserialize(this);
    }

    @Override // or.y0
    public final boolean e(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        return Boolean.parseBoolean((String) q(tag));
    }

    @Override // or.y0
    public final byte f(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        return Byte.parseByte((String) q(tag));
    }

    @Override // or.y0
    public final char g(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        return b0.A((CharSequence) q(tag));
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public final SerializersModule getSerializersModule() {
        return this.f20559e;
    }

    @Override // or.y0
    public final double h(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        return Double.parseDouble((String) q(tag));
    }

    @Override // or.y0
    public final int i(Object obj, SerialDescriptor enumDescriptor) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        Object objE = w0.e(this.f20558d, tag);
        if (objE instanceof Integer) {
            return ((Number) objE).intValue();
        }
        if (!(objE instanceof String)) {
            throw new g(s0.g.e("Value of enum entry '", tag, "' is neither an Int nor a String"));
        }
        int iF = enumDescriptor.f((String) objE);
        if (iF != -3) {
            return iF;
        }
        throw new g("Enum '" + enumDescriptor.d() + "' does not contain element with name '" + objE + '\'');
    }

    @Override // or.y0
    public final float j(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        return Float.parseFloat((String) q(tag));
    }

    @Override // or.y0
    public final int l(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        return Integer.parseInt((String) q(tag));
    }

    @Override // or.y0
    public final long m(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        return Long.parseLong((String) q(tag));
    }

    @Override // or.y0
    public final short o(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        return Short.parseShort((String) q(tag));
    }

    @Override // or.y0
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final Object q(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return w0.e(this.f20558d, tag);
    }
}
