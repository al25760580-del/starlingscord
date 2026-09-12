package fq;

import kotlin.jvm.internal.Intrinsics;
import lq.z;
import vo.m;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a implements e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9358i = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final up.e f9359v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m f9360w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(vo.b declarationDescriptor, z receiverType, up.e eVar) {
        super(receiverType);
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        Intrinsics.checkNotNullParameter(receiverType, "receiverType");
        this.f9360w = (yo.m) declarationDescriptor;
        this.f9359v = eVar;
    }

    @Override // fq.a
    public final String toString() {
        switch (this.f9358i) {
            case 0:
                return getType() + ": Ctx { " + ((vo.f) this.f9360w) + " }";
            default:
                return "Cxt { " + ((yo.m) this.f9360w) + " }";
        }
    }

    public final up.e z0() {
        switch (this.f9358i) {
            case 0:
                break;
        }
        return this.f9359v;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(vo.f classDescriptor, z receiverType, up.e eVar) {
        super(receiverType);
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Intrinsics.checkNotNullParameter(receiverType, "receiverType");
        this.f9360w = classDescriptor;
        this.f9359v = eVar;
    }
}
