package je;

import a5.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i0 f13804b = new i0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13806d;

    public l(Object obj) {
        this.f13803a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return this.f13803a.equals(((l) obj).f13803a);
    }

    public final int hashCode() {
        return this.f13803a.hashCode();
    }
}
