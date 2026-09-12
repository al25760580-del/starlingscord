package kotlin.collections;

import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends h implements RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f14641e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14642i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f14643v;

    public g(h list, int i7, int i10) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f14641e = list;
        this.f14642i = i7;
        d dVar = h.f14644d;
        int iA = list.a();
        dVar.getClass();
        d.d(i7, i10, iA);
        this.f14643v = i10 - i7;
    }

    @Override // kotlin.collections.b
    public final int a() {
        return this.f14643v;
    }

    @Override // kotlin.collections.h, java.util.List
    public final Object get(int i7) {
        h.f14644d.getClass();
        d.b(i7, this.f14643v);
        return this.f14641e.get(this.f14642i + i7);
    }
}
