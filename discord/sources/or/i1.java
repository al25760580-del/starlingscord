package or;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 extends o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17560b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(SerialDescriptor primitive) {
        super(primitive);
        Intrinsics.checkNotNullParameter(primitive, "primitive");
        this.f17560b = primitive.d() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return this.f17560b;
    }
}
