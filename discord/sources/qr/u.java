package qr;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends s {
    public final JsonObject k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f19036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f19037m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f19038n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Json json, JsonObject value) {
        super(json, value, (String) null, 12);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.k = value;
        List listI0 = CollectionsKt.i0(value.f14766d.keySet());
        this.f19036l = listI0;
        this.f19037m = listI0.size() * 2;
        this.f19038n = -1;
    }

    @Override // qr.s
    /* JADX INFO: renamed from: C */
    public final JsonObject z() {
        return this.k;
    }

    @Override // qr.s, kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeElementIndex(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i7 = this.f19038n;
        if (i7 >= this.f19037m - 1) {
            return -1;
        }
        int i10 = i7 + 1;
        this.f19038n = i10;
        return i10;
    }

    @Override // qr.s, qr.a, or.y0, kotlinx.serialization.encoding.CompositeDecoder
    public final void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // qr.s, or.y0
    public final String r(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (String) this.f19036l.get(i7 / 2);
    }

    @Override // qr.s, qr.a
    public final JsonElement x(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return this.f19038n % 2 == 0 ? pr.h.c(tag) : (JsonElement) w0.e(this.k, tag);
    }

    @Override // qr.s, qr.a
    public final JsonElement z() {
        return this.k;
    }
}
