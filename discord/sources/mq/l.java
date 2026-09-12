package mq;

import kotlin.jvm.internal.Intrinsics;
import lq.d1;
import lq.p0;
import lq.z;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xp.l f16034c;

    public l() {
        f kotlinTypeRefiner = f.f16018a;
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        e kotlinTypePreparator = e.f16017a;
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        xp.l lVar = new xp.l(xp.l.f23013d);
        Intrinsics.checkNotNullExpressionValue(lVar, "createWithTypeRefiner(...)");
        this.f16034c = lVar;
    }

    public final boolean a(z a10, z b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        p0 p0VarN = com.facebook.imagepipeline.nativecode.c.n(false, null, 6);
        d1 a11 = a10.w0();
        d1 b11 = b10.w0();
        Intrinsics.checkNotNullParameter(p0VarN, "<this>");
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        return lq.f.g(p0VarN, a11, b11);
    }

    public final boolean b(z subtype, z supertype) {
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(supertype, "supertype");
        p0 state = com.facebook.imagepipeline.nativecode.c.n(true, null, 6);
        d1 subType = subtype.w0();
        d1 superType = supertype.w0();
        Intrinsics.checkNotNullParameter(state, "<this>");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        if (subType == superType) {
            return true;
        }
        state.b(subType, superType);
        return lq.f.e(state, subType, superType);
    }
}
