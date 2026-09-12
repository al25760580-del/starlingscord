package rk;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f19430e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f19431i;

    public a(long j, long j5) {
        super(new Throwable());
        this.f19430e = j;
        this.f19431i = j5;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        Locale locale = Locale.ENGLISH;
        StringBuilder sbM = kk.b.m(this.f19430e, "Insufficient disk space, estimated file size in bytes ", ", available disk space in bytes ");
        sbM.append(this.f19431i);
        return sbM.toString();
    }
}
