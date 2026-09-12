package sq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends kotlin.collections.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20495i = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f20496v;

    public b(c cVar) {
        this.f20496v = cVar;
    }

    @Override // kotlin.collections.c
    public final void a() {
        int i7;
        Object[] objArr;
        do {
            i7 = this.f20495i + 1;
            this.f20495i = i7;
            objArr = this.f20496v.f20497d;
            if (i7 >= objArr.length) {
                break;
            }
        } while (objArr[i7] == null);
        if (i7 >= objArr.length) {
            this.f14631d = 2;
            return;
        }
        Object obj = objArr[i7];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
        this.f14632e = obj;
        this.f14631d = 1;
    }
}
