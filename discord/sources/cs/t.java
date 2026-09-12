package cs;

/* JADX INFO: loaded from: classes.dex */
public enum t {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7482d;

    t(String str) {
        this.f7482d = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f7482d;
    }
}
