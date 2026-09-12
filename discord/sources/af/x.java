package af;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends Exception {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xe.b f495d;

    public x(xe.b bVar) {
        w.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", (bVar.f22910e == 0 || bVar.f22911i == null) ? false : true);
        this.f495d = bVar;
    }
}
