package qr;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.f1;
import kotlin.collections.p0;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import or.e1;

/* JADX INFO: loaded from: classes3.dex */
public class s extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final JsonObject f19030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SerialDescriptor f19031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19032i;
    public boolean j;

    public /* synthetic */ s(Json json, JsonObject jsonObject, String str, int i7) {
        this(json, jsonObject, (i7 & 4) != 0 ? null : str, (SerialDescriptor) null);
    }

    @Override // qr.a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public JsonObject z() {
        return this.f19030g;
    }

    @Override // qr.a, kotlinx.serialization.encoding.Decoder
    public final CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        SerialDescriptor serialDescriptor = this.f19031h;
        if (descriptor != serialDescriptor) {
            return super.beginStructure(descriptor);
        }
        JsonElement jsonElementY = y();
        String strD = serialDescriptor.d();
        if (jsonElementY instanceof JsonObject) {
            return new s(this.f18992d, (JsonObject) jsonElementY, this.f18993e, serialDescriptor);
        }
        throw p.d(-1, jsonElementY.toString(), "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementY.getClass()).getSimpleName() + " as the serialized body of " + strD + " at element: " + w());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        while (this.f19032i < descriptor.g()) {
            int i7 = this.f19032i;
            this.f19032i = i7 + 1;
            String strT = t(descriptor, i7);
            int i10 = this.f19032i - 1;
            this.j = false;
            if (!z().containsKey(strT)) {
                boolean z5 = (this.f18992d.f14761a.f1138e || descriptor.k(i10) || !descriptor.j(i10).e()) ? false : true;
                this.j = z5;
                if (z5) {
                }
            }
            this.f18994f.getClass();
            return i10;
        }
        return -1;
    }

    @Override // qr.a, or.y0, kotlinx.serialization.encoding.Decoder
    public final boolean decodeNotNullMark() {
        return !this.j && super.decodeNotNullMark();
    }

    @Override // qr.a, or.y0, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        Set setD;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        androidx.appcompat.widget.v vVar = this.f18994f;
        if (vVar.f1137d || (descriptor.c() instanceof mr.d)) {
            return;
        }
        Json json = this.f18992d;
        p.p(descriptor, json);
        if (vVar.f1139f) {
            Intrinsics.checkNotNullParameter(descriptor, "<this>");
            Set setB = e1.b(descriptor);
            Intrinsics.checkNotNullParameter(json, "<this>");
            Map map = (Map) json.f14763c.m(descriptor, p.f19027a);
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = p0.f14661d;
            }
            setD = f1.d(setB, setKeySet);
        } else {
            Intrinsics.checkNotNullParameter(descriptor, "<this>");
            setD = e1.b(descriptor);
        }
        for (String key : z().f14766d.keySet()) {
            if (!setD.contains(key) && !Intrinsics.areEqual(key, this.f18993e)) {
                String input = z().toString();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(input, "input");
                StringBuilder sbN = com.discord.chat.presentation.list.a.n("Encountered an unknown key '", key, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                sbN.append((Object) p.o(-1, input));
                throw p.e(-1, sbN.toString());
            }
        }
    }

    @Override // or.y0
    public String r(SerialDescriptor descriptor, int i7) {
        Object next;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Json json = this.f18992d;
        p.p(descriptor, json);
        String strH = descriptor.h(i7);
        if (this.f18994f.f1139f && !z().f14766d.keySet().contains(strH)) {
            Intrinsics.checkNotNullParameter(json, "<this>");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(json, "<this>");
            ph.c cVar = json.f14763c;
            m7.a defaultValue = new m7.a(4, descriptor, json);
            cVar.getClass();
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            q key = p.f19027a;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            Object value = cVar.m(descriptor, key);
            if (value == null) {
                value = defaultValue.invoke();
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cVar.f18031d;
                Object concurrentHashMap2 = concurrentHashMap.get(descriptor);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(descriptor, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(key, value);
            }
            Map map = (Map) value;
            Iterator it = z().f14766d.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer num = (Integer) map.get((String) next);
                if (num != null && num.intValue() == i7) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
        }
        return strH;
    }

    @Override // qr.a
    public JsonElement x(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (JsonElement) w0.e(z(), tag);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Json json, JsonObject value, String str, SerialDescriptor serialDescriptor) {
        super(json, str);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f19030g = value;
        this.f19031h = serialDescriptor;
    }
}
