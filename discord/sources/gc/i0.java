package gc;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f9693e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final gb.a f9694i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f9695d;

    static {
        int i7 = je.e0.f13788a;
        f9693e = Integer.toString(0, 36);
        f9694i = new gb.a(11);
    }

    public i0(fj.c cVar) {
        this.f9695d = (Uri) cVar.f9267e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0) || !this.f9695d.equals(((i0) obj).f9695d)) {
            return false;
        }
        int i7 = je.e0.f13788a;
        return true;
    }

    public final int hashCode() {
        return this.f9695d.hashCode() * 31;
    }
}
