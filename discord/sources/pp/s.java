package pp;

/* JADX INFO: loaded from: classes3.dex */
public enum s implements vp.o {
    AT_MOST_ONCE(0),
    EXACTLY_ONCE(1),
    AT_LEAST_ONCE(2);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18431d;

    s(int i7) {
        this.f18431d = i7;
    }

    @Override // vp.o
    public final int a() {
        return this.f18431d;
    }
}
