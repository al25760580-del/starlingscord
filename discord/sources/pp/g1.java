package pp;

/* JADX INFO: loaded from: classes3.dex */
public enum g1 implements vp.o {
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE(1),
    /* JADX INFO: Fake field, exist only in values array */
    PROTECTED(2),
    /* JADX INFO: Fake field, exist only in values array */
    PUBLIC(3),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE_TO_THIS(4),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL(5);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18300d;

    g1(int i7) {
        this.f18300d = i7;
    }

    @Override // vp.o
    public final int a() {
        return this.f18300d;
    }
}
