package gc;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q0 f9821i = new q0(new io.sentry.internal.debugmeta.c(7, false));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f9822v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f9823w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f9824x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final gb.a f9825y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f9826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9827e;

    static {
        int i7 = je.e0.f13788a;
        f9822v = Integer.toString(0, 36);
        f9823w = Integer.toString(1, 36);
        f9824x = Integer.toString(2, 36);
        f9825y = new gb.a(16);
    }

    public q0(io.sentry.internal.debugmeta.c cVar) {
        this.f9826d = (Uri) cVar.f12759e;
        this.f9827e = (String) cVar.f12760i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return je.e0.a(this.f9826d, q0Var.f9826d) && je.e0.a(this.f9827e, q0Var.f9827e);
    }

    public final int hashCode() {
        Uri uri = this.f9826d;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f9827e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
