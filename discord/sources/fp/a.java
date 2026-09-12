package fp;

import hq.m;
import java.util.Collection;
import java.util.LinkedHashSet;
import mo.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends c0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m f9327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f9328i;
    public final /* synthetic */ boolean j;

    public a(m mVar, LinkedHashSet linkedHashSet, boolean z5) {
        this.f9327h = mVar;
        this.f9328i = linkedHashSet;
        this.j = z5;
    }

    public static /* synthetic */ void S(int i7) {
        Object[] objArr = new Object[3];
        if (i7 == 1) {
            objArr[0] = "fromSuper";
        } else if (i7 == 2) {
            objArr[0] = "fromCurrent";
        } else if (i7 == 3) {
            objArr[0] = "member";
        } else if (i7 != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i7 == 1 || i7 == 2) {
            objArr[2] = "conflict";
        } else if (i7 == 3 || i7 == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // mo.c0
    public final void J(vo.d dVar, Collection collection) {
        if (dVar == null) {
            S(3);
            throw null;
        }
        if (!this.j || dVar.c() == vo.c.f21793e) {
            super.J(dVar, collection);
        }
    }

    @Override // mo.c0
    public final void c(vo.d dVar) {
        if (dVar == null) {
            S(0);
            throw null;
        }
        xp.l.r(dVar, new bp.i(3, this));
        this.f9328i.add(dVar);
    }

    @Override // mo.c0
    public final void h(vo.d dVar, vo.d dVar2) {
        if (dVar2 != null) {
            return;
        }
        S(2);
        throw null;
    }
}
