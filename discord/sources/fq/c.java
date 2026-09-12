package fq;

import lq.z;
import yo.m;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m f9361i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(vo.b bVar, z zVar) {
        super(zVar);
        if (zVar == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.f9361i = (m) bVar;
    }

    @Override // fq.a
    public final String toString() {
        return getType() + ": Ext {" + this.f9361i + "}";
    }
}
