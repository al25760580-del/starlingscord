package qf;

/* JADX INFO: loaded from: classes3.dex */
public enum o implements a {
    /* JADX INFO: Fake field, exist only in values array */
    ED256(-260),
    /* JADX INFO: Fake field, exist only in values array */
    ED512(-261),
    /* JADX INFO: Fake field, exist only in values array */
    ED25519(-8),
    /* JADX INFO: Fake field, exist only in values array */
    ES256(-7),
    /* JADX INFO: Fake field, exist only in values array */
    ECDH_HKDF_256(-25),
    /* JADX INFO: Fake field, exist only in values array */
    ES384(-35),
    /* JADX INFO: Fake field, exist only in values array */
    ES512(-36);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18843d;

    o(int i7) {
        this.f18843d = i7;
    }

    @Override // qf.a
    public final int a() {
        return this.f18843d;
    }
}
