package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Fragment f2288e;

    public /* synthetic */ z(Fragment fragment, int i7) {
        this.f2287d = i7;
        this.f2288e = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2287d) {
            case 0:
                this.f2288e.startPostponedEnterTransition();
                break;
            default:
                this.f2288e.callStartTransitionListener(false);
                break;
        }
    }
}
