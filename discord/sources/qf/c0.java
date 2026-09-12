package qf;

/* JADX INFO: loaded from: classes3.dex */
public enum c0 implements a {
    /* JADX INFO: Fake field, exist only in values array */
    RS256(-257),
    /* JADX INFO: Fake field, exist only in values array */
    RS384(-258),
    /* JADX INFO: Fake field, exist only in values array */
    RS512(-259),
    /* JADX INFO: Fake field, exist only in values array */
    LEGACY_RS1(-262),
    /* JADX INFO: Fake field, exist only in values array */
    PS256(-37),
    /* JADX INFO: Fake field, exist only in values array */
    PS384(-38),
    /* JADX INFO: Fake field, exist only in values array */
    PS512(-39),
    RS1(-65535);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18798d;

    c0(int i7) {
        this.f18798d = i7;
    }

    @Override // qf.a
    public final int a() {
        return this.f18798d;
    }
}
