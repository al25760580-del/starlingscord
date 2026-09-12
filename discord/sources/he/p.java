package he;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f10649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f10652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f10653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f10655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f10656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f10657i;

    static {
        gc.f0.a("goog.exo.datasource");
    }

    public p(Uri uri, long j, int i7, byte[] bArr, Map map, long j5, long j7, String str, int i10) {
        je.b.g(j + j5 >= 0);
        je.b.g(j5 >= 0);
        je.b.g(j7 > 0 || j7 == -1);
        this.f10649a = uri;
        this.f10650b = j;
        this.f10651c = i7;
        this.f10652d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f10653e = Collections.unmodifiableMap(new HashMap(map));
        this.f10654f = j5;
        this.f10655g = j7;
        this.f10656h = str;
        this.f10657i = i10;
    }

    public static String b(int i7) {
        if (i7 == 1) {
            return "GET";
        }
        if (i7 == 2) {
            return "POST";
        }
        if (i7 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public final o a() {
        o oVar = new o();
        oVar.f10640a = this.f10649a;
        oVar.f10641b = this.f10650b;
        oVar.f10642c = this.f10651c;
        oVar.f10643d = this.f10652d;
        oVar.f10644e = this.f10653e;
        oVar.f10645f = this.f10654f;
        oVar.f10646g = this.f10655g;
        oVar.f10647h = this.f10656h;
        oVar.f10648i = this.f10657i;
        return oVar;
    }

    public final p c(long j) {
        long j5 = this.f10655g;
        return d(j, j5 != -1 ? j5 - j : -1L);
    }

    public final p d(long j, long j5) {
        if (j == 0 && this.f10655g == j5) {
            return this;
        }
        return new p(this.f10649a, this.f10650b, this.f10651c, this.f10652d, this.f10653e, this.f10654f + j, j5, this.f10656h, this.f10657i);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        sb2.append(b(this.f10651c));
        sb2.append(" ");
        sb2.append(this.f10649a);
        sb2.append(", ");
        sb2.append(this.f10654f);
        sb2.append(", ");
        sb2.append(this.f10655g);
        sb2.append(", ");
        sb2.append(this.f10656h);
        sb2.append(", ");
        return kk.b.l(sb2, this.f10657i, "]");
    }
}
