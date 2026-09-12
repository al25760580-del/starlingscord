package ti;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements qi.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20813a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20814b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qi.c f20815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f20816d;

    public h(f fVar) {
        this.f20816d = fVar;
    }

    @Override // qi.g
    public final qi.g c(String str) {
        if (this.f20813a) {
            throw new qi.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f20813a = true;
        this.f20816d.d(this.f20815c, str, this.f20814b);
        return this;
    }

    @Override // qi.g
    public final qi.g d(boolean z5) {
        if (this.f20813a) {
            throw new qi.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f20813a = true;
        this.f20816d.c(this.f20815c, z5 ? 1 : 0, this.f20814b);
        return this;
    }
}
