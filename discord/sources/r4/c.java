package r4;

import java.util.List;
import o4.o;

/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f19199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f19200e;

    public c(b bVar, b bVar2) {
        this.f19199d = bVar;
        this.f19200e = bVar2;
    }

    @Override // r4.e
    public final o4.e l0() {
        return new o(this.f19199d.l0(), this.f19200e.l0());
    }

    @Override // r4.e
    public final List q0() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // r4.e
    public final boolean t0() {
        return this.f19199d.t0() && this.f19200e.t0();
    }
}
