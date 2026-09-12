package sm;

import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tm.i f20280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20282c;

    public a(tm.i fragment, int i7, boolean z5) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f20280a = fragment;
        this.f20281b = i7;
        this.f20282c = z5;
    }

    @Override // sm.b
    public final void a(FragmentManager fragmentManager, q8.c executor) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(executor, "executor");
        executor.getClass();
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(this, "op");
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        aVar.f2078p = true;
        Intrinsics.checkNotNullExpressionValue(aVar, "setReorderingAllowed(...)");
        boolean z5 = this.f20282c;
        tm.i iVar = this.f20280a;
        if (z5) {
            String screenKey = iVar.f20847d.getScreenKey();
            if (!aVar.f2072h) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            aVar.f2071g = true;
            aVar.f2073i = screenKey;
        }
        aVar.e(this.f20281b, iVar, null, 1);
        aVar.i(iVar);
        aVar.l(true, true);
    }
}
