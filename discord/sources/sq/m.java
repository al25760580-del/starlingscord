package sq;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20522b;

    public /* synthetic */ m(String str, int i7) {
        this.f20521a = i7;
        this.f20522b = str;
    }

    @Override // sq.e
    public final String b(gp.e eVar) {
        switch (this.f20521a) {
            case 0:
                break;
        }
        return zs.a.C(this, eVar);
    }

    @Override // sq.e
    public final String getDescription() {
        switch (this.f20521a) {
            case 0:
                break;
        }
        return this.f20522b;
    }
}
