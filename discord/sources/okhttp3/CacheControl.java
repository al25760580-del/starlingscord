package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CacheControl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f17289n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f17295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f17297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f17298i;
    public final boolean j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f17299l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f17300m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public CacheControl(boolean z5, boolean z6, int i7, int i10, boolean z7, boolean z10, boolean z11, int i11, int i12, boolean z12, boolean z13, boolean z14, String str) {
        this.f17290a = z5;
        this.f17291b = z6;
        this.f17292c = i7;
        this.f17293d = i10;
        this.f17294e = z7;
        this.f17295f = z10;
        this.f17296g = z11;
        this.f17297h = i11;
        this.f17298i = i12;
        this.j = z12;
        this.k = z13;
        this.f17299l = z14;
        this.f17300m = str;
    }

    public final String toString() {
        String str = this.f17300m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f17290a) {
            sb2.append("no-cache, ");
        }
        if (this.f17291b) {
            sb2.append("no-store, ");
        }
        int i7 = this.f17292c;
        if (i7 != -1) {
            sb2.append("max-age=");
            sb2.append(i7);
            sb2.append(", ");
        }
        int i10 = this.f17293d;
        if (i10 != -1) {
            sb2.append("s-maxage=");
            sb2.append(i10);
            sb2.append(", ");
        }
        if (this.f17294e) {
            sb2.append("private, ");
        }
        if (this.f17295f) {
            sb2.append("public, ");
        }
        if (this.f17296g) {
            sb2.append("must-revalidate, ");
        }
        int i11 = this.f17297h;
        if (i11 != -1) {
            sb2.append("max-stale=");
            sb2.append(i11);
            sb2.append(", ");
        }
        int i12 = this.f17298i;
        if (i12 != -1) {
            sb2.append("min-fresh=");
            sb2.append(i12);
            sb2.append(", ");
        }
        if (this.j) {
            sb2.append("only-if-cached, ");
        }
        if (this.k) {
            sb2.append("no-transform, ");
        }
        if (this.f17299l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        this.f17300m = string;
        return string;
    }
}
