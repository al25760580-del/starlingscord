package eq;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import mo.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends c0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f8633i;

    public g(ArrayList arrayList, h hVar) {
        this.f8632h = arrayList;
        this.f8633i = hVar;
    }

    @Override // mo.c0
    public final void c(vo.d fakeOverride) {
        Intrinsics.checkNotNullParameter(fakeOverride, "fakeOverride");
        xp.l.r(fakeOverride, null);
        this.f8632h.add(fakeOverride);
    }

    @Override // mo.c0
    public final void h(vo.d fromSuper, vo.d fromCurrent) {
        Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
        Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
        throw new IllegalStateException(("Conflict in scope of " + this.f8633i.f8635b + ": " + fromSuper + " vs " + fromCurrent).toString());
    }
}
