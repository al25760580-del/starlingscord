package ie;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11737e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f11738i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f11739v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final File f11740w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f11741x;

    public i(String str, long j, long j5, long j7, File file) {
        this.f11736d = str;
        this.f11737e = j;
        this.f11738i = j5;
        this.f11739v = file != null;
        this.f11740w = file;
        this.f11741x = j7;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(i iVar) {
        String str = iVar.f11736d;
        String str2 = this.f11736d;
        if (!str2.equals(str)) {
            return str2.compareTo(iVar.f11736d);
        }
        long j = this.f11737e - iVar.f11737e;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(this.f11737e);
        sb2.append(", ");
        return a3.e.n(sb2, this.f11738i, "]");
    }
}
