package pp;

/* JADX INFO: loaded from: classes3.dex */
public enum r implements vp.o {
    RETURNS_CONSTANT(0),
    CALLS(1),
    RETURNS_NOT_NULL(2);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18422d;

    r(int i7) {
        this.f18422d = i7;
    }

    @Override // vp.o
    public final int a() {
        return this.f18422d;
    }
}
