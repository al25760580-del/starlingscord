package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a1 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f2091c;

    public a1(FragmentManager fragmentManager, String str, int i7) {
        this.f2091c = fragmentManager;
        this.f2089a = str;
        this.f2090b = i7;
    }

    @Override // androidx.fragment.app.z0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        FragmentManager fragmentManager = this.f2091c;
        Fragment fragment = fragmentManager.f2064z;
        if (fragment != null && this.f2090b < 0 && this.f2089a == null && fragment.getChildFragmentManager().U(-1, 0)) {
            return false;
        }
        return fragmentManager.V(arrayList, arrayList2, this.f2089a, this.f2090b, 1);
    }
}
