package j2;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i6.a f13628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.collections.a f13629c;

    public g(i6.a aVar, kotlin.collections.a aVar2) {
        this.f13628b = aVar;
        this.f13629c = aVar2;
    }

    @Override // j2.h
    public final float a() {
        return ((Number) this.f13628b.invoke()).floatValue();
    }

    @Override // j2.h
    public final void b(float f2) {
        this.f13629c.invoke(Float.valueOf(f2));
    }
}
