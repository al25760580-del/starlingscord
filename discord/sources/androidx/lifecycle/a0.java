package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Observer f2326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2327e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2328i = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ LiveData f2329v;

    public a0(LiveData liveData, Observer observer) {
        this.f2329v = liveData;
        this.f2326d = observer;
    }

    public final void a(boolean z5) {
        if (z5 == this.f2327e) {
            return;
        }
        this.f2327e = z5;
        int i7 = z5 ? 1 : -1;
        LiveData liveData = this.f2329v;
        int i10 = liveData.f2311c;
        liveData.f2311c = i7 + i10;
        if (!liveData.f2312d) {
            liveData.f2312d = true;
            while (true) {
                try {
                    int i11 = liveData.f2311c;
                    if (i10 == i11) {
                        break;
                    }
                    boolean z6 = i10 == 0 && i11 > 0;
                    boolean z7 = i10 > 0 && i11 == 0;
                    if (z6) {
                        liveData.e();
                    } else if (z7) {
                        liveData.f();
                    }
                    i10 = i11;
                } catch (Throwable th2) {
                    liveData.f2312d = false;
                    throw th2;
                }
            }
            liveData.f2312d = false;
        }
        if (this.f2327e) {
            liveData.c(this);
        }
    }

    public void b() {
    }

    public boolean d(LifecycleOwner lifecycleOwner) {
        return false;
    }

    public abstract boolean e();
}
