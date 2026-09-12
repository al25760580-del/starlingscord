package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements g1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fragment f2256d;

    public u0(Fragment fragment) {
        this.f2256d = fragment;
    }

    @Override // androidx.fragment.app.g1
    public final void a(Fragment fragment) {
        this.f2256d.onAttachFragment(fragment);
    }
}
