package qr;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kotlinx.serialization.json.a f19033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f19034h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19035i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Json json, kotlinx.serialization.json.a value) {
        super(json, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f19033g = value;
        this.f19034h = value.f14768d.size();
        this.f19035i = -1;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeElementIndex(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i7 = this.f19035i;
        if (i7 >= this.f19034h - 1) {
            return -1;
        }
        int i10 = i7 + 1;
        this.f19035i = i10;
        return i10;
    }

    @Override // or.y0
    public final String r(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(i7);
    }

    @Override // qr.a
    public final JsonElement x(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (JsonElement) this.f19033g.f14768d.get(Integer.parseInt(tag));
    }

    @Override // qr.a
    public final JsonElement z() {
        return this.f19033g;
    }
}
