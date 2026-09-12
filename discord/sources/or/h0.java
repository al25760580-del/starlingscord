package or;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0 f17557d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(KSerializer kSerializer, KSerializer vSerializer, int i7) {
        super(kSerializer, vSerializer);
        this.f17556c = i7;
        switch (i7) {
            case 1:
                Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
                Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
                super(kSerializer, vSerializer);
                SerialDescriptor keyDesc = kSerializer.getDescriptor();
                SerialDescriptor valueDesc = vSerializer.getDescriptor();
                Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
                Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
                this.f17557d = new g0("kotlin.collections.LinkedHashMap", keyDesc, valueDesc);
                break;
            default:
                Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
                Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
                SerialDescriptor keyDesc2 = kSerializer.getDescriptor();
                SerialDescriptor valueDesc2 = vSerializer.getDescriptor();
                Intrinsics.checkNotNullParameter(keyDesc2, "keyDesc");
                Intrinsics.checkNotNullParameter(valueDesc2, "valueDesc");
                this.f17557d = new g0("kotlin.collections.HashMap", keyDesc2, valueDesc2);
                break;
        }
    }

    @Override // or.a
    public final Object a() {
        switch (this.f17556c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // or.a
    public final int b(Object obj) {
        int size;
        switch (this.f17556c) {
            case 0:
                HashMap map = (HashMap) obj;
                Intrinsics.checkNotNullParameter(map, "<this>");
                size = map.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    @Override // or.a
    public final void c(int i7, Object obj) {
        switch (this.f17556c) {
            case 0:
                Intrinsics.checkNotNullParameter((HashMap) obj, "<this>");
                break;
            default:
                Intrinsics.checkNotNullParameter((LinkedHashMap) obj, "<this>");
                break;
        }
    }

    @Override // or.a
    public final Iterator d(Object obj) {
        switch (this.f17556c) {
            case 0:
                Map map = (Map) obj;
                Intrinsics.checkNotNullParameter(map, "<this>");
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                Intrinsics.checkNotNullParameter(map2, "<this>");
                return map2.entrySet().iterator();
        }
    }

    @Override // or.a
    public final int e(Object obj) {
        switch (this.f17556c) {
            case 0:
                Map map = (Map) obj;
                Intrinsics.checkNotNullParameter(map, "<this>");
                return map.size();
            default:
                Map map2 = (Map) obj;
                Intrinsics.checkNotNullParameter(map2, "<this>");
                return map2.size();
        }
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        switch (this.f17556c) {
            case 0:
                break;
        }
        return this.f17557d;
    }

    @Override // or.a
    public final Object i(Object obj) {
        switch (this.f17556c) {
            case 0:
                Intrinsics.checkNotNullParameter(null, "<this>");
                return new HashMap((Map) null);
            default:
                Intrinsics.checkNotNullParameter(null, "<this>");
                return new LinkedHashMap((Map) null);
        }
    }

    @Override // or.a
    public final Object j(Object obj) {
        switch (this.f17556c) {
            case 0:
                HashMap map = (HashMap) obj;
                Intrinsics.checkNotNullParameter(map, "<this>");
                return map;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
                return linkedHashMap;
        }
    }
}
