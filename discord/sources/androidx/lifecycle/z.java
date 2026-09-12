package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class z extends a0 implements t {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LifecycleOwner f2411w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ LiveData f2412x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(LiveData liveData, LifecycleOwner lifecycleOwner, Observer observer) {
        super(liveData, observer);
        this.f2412x = liveData;
        this.f2411w = lifecycleOwner;
    }

    @Override // androidx.lifecycle.a0
    public final void b() {
        this.f2411w.getLifecycle().c(this);
    }

    @Override // androidx.lifecycle.t
    public final void c(LifecycleOwner lifecycleOwner, n nVar) {
        LifecycleOwner lifecycleOwner2 = this.f2411w;
        Lifecycle.State stateB = lifecycleOwner2.getLifecycle().b();
        if (stateB == Lifecycle.State.f2295d) {
            this.f2412x.g(this.f2326d);
            return;
        }
        Lifecycle.State state = null;
        while (state != stateB) {
            a(e());
            state = stateB;
            stateB = lifecycleOwner2.getLifecycle().b();
        }
    }

    @Override // androidx.lifecycle.a0
    public final boolean d(LifecycleOwner lifecycleOwner) {
        return this.f2411w == lifecycleOwner;
    }

    @Override // androidx.lifecycle.a0
    public final boolean e() {
        return this.f2411w.getLifecycle().b().a(Lifecycle.State.f2298v);
    }
}
