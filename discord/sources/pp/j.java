package pp;

/* JADX INFO: loaded from: classes3.dex */
public enum j implements vp.o {
    CLASS(0),
    INTERFACE(1),
    ENUM_CLASS(2),
    /* JADX INFO: Fake field, exist only in values array */
    ENUM_ENTRY(3),
    ANNOTATION_CLASS(4),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT(5),
    COMPANION_OBJECT(6);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18328d;

    j(int i7) {
        this.f18328d = i7;
    }

    @Override // vp.o
    public final int a() {
        return this.f18328d;
    }
}
