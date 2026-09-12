package np;

import kotlin.jvm.internal.Intrinsics;
import vo.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements jq.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ap.b f17016d;

    public o(ap.b binaryClass, jq.k abiStability) {
        Intrinsics.checkNotNullParameter(binaryClass, "binaryClass");
        Intrinsics.checkNotNullParameter(abiStability, "abiStability");
        this.f17016d = binaryClass;
    }

    @Override // vo.n0
    public final void a() {
        o0 NO_SOURCE_FILE = o0.f21821e;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
    }

    @Override // jq.l
    public final String d() {
        return s0.g.g(new StringBuilder("Class '"), bp.c.a(this.f17016d.f2856a).a().f21262a.f21265a, '\'');
    }

    public final String toString() {
        return o.class.getSimpleName() + ": " + this.f17016d;
    }
}
