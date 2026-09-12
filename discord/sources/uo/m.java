package uo;

import kotlin.jvm.internal.Intrinsics;
import vo.z;
import yo.b0;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends b0 {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(z module, up.c fqName, int i7) {
        super(module, fqName);
        this.E = i7;
        switch (i7) {
            case 1:
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(fqName, "fqName");
                super(module, fqName);
                break;
            default:
                break;
        }
    }

    @Override // vo.e0
    public final /* bridge */ /* synthetic */ eq.o J() {
        switch (this.E) {
            case 0:
                break;
        }
        return eq.n.f8648b;
    }
}
