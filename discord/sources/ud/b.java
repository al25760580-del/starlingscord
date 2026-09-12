package ud;

import com.google.android.exoplayer2.Format;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f21051i;
    public final Format[] j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f21052l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f21053m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f21054n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long[] f21055o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f21056p;

    public b(String str, String str2, int i7, String str3, long j, String str4, int i10, int i11, int i12, int i13, String str5, Format[] formatArr, List list, long[] jArr, long j5) {
        this.f21052l = str;
        this.f21053m = str2;
        this.f21043a = i7;
        this.f21044b = str3;
        this.f21045c = j;
        this.f21046d = str4;
        this.f21047e = i10;
        this.f21048f = i11;
        this.f21049g = i12;
        this.f21050h = i13;
        this.f21051i = str5;
        this.j = formatArr;
        this.f21054n = list;
        this.f21055o = jArr;
        this.f21056p = j5;
        this.k = list.size();
    }

    public final b a(Format[] formatArr) {
        return new b(this.f21052l, this.f21053m, this.f21043a, this.f21044b, this.f21045c, this.f21046d, this.f21047e, this.f21048f, this.f21049g, this.f21050h, this.f21051i, formatArr, this.f21054n, this.f21055o, this.f21056p);
    }

    public final long b(int i7) {
        if (i7 == this.k - 1) {
            return this.f21056p;
        }
        long[] jArr = this.f21055o;
        return jArr[i7 + 1] - jArr[i7];
    }
}
