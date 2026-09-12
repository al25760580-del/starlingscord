package j0;

import kotlin.jvm.internal.Intrinsics;
import rn.l;
import u.i;
import u.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f13583a = 0;

    static {
        a aVar = a.f13576e;
        Intrinsics.checkNotNull(i.f20890w, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        l.b(aVar);
        new y(a.f13577i);
        ls.d.I(a.f13578v);
        new y(a.f13579w);
        new y(a.f13580x);
        ls.d.I(a.f13581y);
    }

    public static final void a(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
