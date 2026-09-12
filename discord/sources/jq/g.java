package jq;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import mo.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends c0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractCollection f14026i;

    public /* synthetic */ g(AbstractCollection abstractCollection, int i7) {
        this.f14025h = i7;
        this.f14026i = abstractCollection;
    }

    public static /* synthetic */ void S(int i7) {
        Object[] objArr = new Object[3];
        if (i7 == 1) {
            objArr[0] = "fromSuper";
        } else if (i7 != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i7 == 1 || i7 == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // mo.c0
    public final void c(vo.d fakeOverride) {
        switch (this.f14025h) {
            case 0:
                Intrinsics.checkNotNullParameter(fakeOverride, "fakeOverride");
                xp.l.r(fakeOverride, null);
                ((ArrayList) this.f14026i).add(fakeOverride);
                return;
            default:
                if (fakeOverride == null) {
                    S(0);
                    throw null;
                }
                xp.l.r(fakeOverride, null);
                ((LinkedHashSet) this.f14026i).add(fakeOverride);
                return;
        }
    }

    @Override // mo.c0
    public final void h(vo.d fromSuper, vo.d fromCurrent) {
        switch (this.f14025h) {
            case 0:
                Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
                Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
                if (fromCurrent instanceof yo.s) {
                    ((yo.s) fromCurrent).I0(vo.q.f21837a, fromSuper);
                    return;
                }
                return;
            default:
                if (fromCurrent != null) {
                    return;
                }
                S(2);
                throw null;
        }
    }
}
