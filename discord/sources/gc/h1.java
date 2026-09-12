package gc;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class h1 extends IOException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9680e;

    public h1(String str, Throwable th2, boolean z5, int i7) {
        super(str, th2);
        this.f9679d = z5;
        this.f9680e = i7;
    }

    public static h1 a(String str, RuntimeException runtimeException) {
        return new h1(str, runtimeException, true, 1);
    }

    public static h1 b(String str, Exception exc) {
        return new h1(str, exc, true, 4);
    }

    public static h1 c(String str) {
        return new h1(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.getMessage());
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f9679d);
        sb2.append(", dataType=");
        return kk.b.l(sb2, this.f9680e, "}");
    }
}
