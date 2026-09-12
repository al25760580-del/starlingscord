package gc;

import android.net.Uri;
import com.facebook.imageutils.JfifUtil;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v1 implements g {
    public static final Object O = new Object();
    public static final Object P = new Object();
    public static final MediaItem Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f9906b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f9907c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f9908d0;
    public boolean E;
    public boolean F;
    public boolean G;
    public o0 H;
    public boolean I;
    public long J;
    public long K;
    public int L;
    public int M;
    public long N;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f9910e;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f9912v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f9913w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f9914x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f9915y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9909d = O;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaItem f9911i = Q;

    static {
        p0 p0Var;
        j0 j0Var = new j0();
        m0 m0Var = new m0();
        m0Var.f9775c = ei.w0.f8376y;
        ei.c0 c0Var = ei.e0.f8303e;
        ei.r0 r0Var = ei.r0.f8352w;
        m0Var.f9779g = r0Var;
        List list = Collections.EMPTY_LIST;
        q0 q0Var = q0.f9821i;
        Uri uri = Uri.EMPTY;
        je.b.k(m0Var.f9774b == null || m0Var.f9773a != null);
        if (uri != null) {
            p0Var = new p0(uri, null, m0Var.f9773a != null ? new n0(m0Var) : null, null, list, null, r0Var);
        } else {
            p0Var = null;
        }
        Q = new MediaItem("com.google.android.exoplayer2.Timeline", new l0(j0Var), p0Var, new o0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), MediaMetadata.f5540f0, q0Var);
        int i7 = je.e0.f13788a;
        R = Integer.toString(1, 36);
        S = Integer.toString(2, 36);
        T = Integer.toString(3, 36);
        U = Integer.toString(4, 36);
        V = Integer.toString(5, 36);
        W = Integer.toString(6, 36);
        X = Integer.toString(7, 36);
        Y = Integer.toString(8, 36);
        Z = Integer.toString(9, 36);
        a0 = Integer.toString(10, 36);
        f9906b0 = Integer.toString(11, 36);
        f9907c0 = Integer.toString(12, 36);
        f9908d0 = Integer.toString(13, 36);
    }

    public final boolean a() {
        je.b.k(this.G == (this.H != null));
        return this.H != null;
    }

    public final void b(Object obj, MediaItem mediaItem, Object obj2, long j, long j5, long j7, boolean z5, boolean z6, o0 o0Var, long j10, long j11, int i7, int i10, long j12) {
        this.f9909d = obj;
        this.f9911i = mediaItem != null ? mediaItem : Q;
        if (mediaItem != null) {
            p0 p0Var = mediaItem.f5534e;
        }
        this.f9910e = null;
        this.f9912v = obj2;
        this.f9913w = j;
        this.f9914x = j5;
        this.f9915y = j7;
        this.E = z5;
        this.F = z6;
        this.G = o0Var != null;
        this.H = o0Var;
        this.J = j10;
        this.K = j11;
        this.L = i7;
        this.M = i10;
        this.N = j12;
        this.I = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v1.class.equals(obj.getClass())) {
            v1 v1Var = (v1) obj;
            if (je.e0.a(this.f9909d, v1Var.f9909d) && je.e0.a(this.f9911i, v1Var.f9911i) && je.e0.a(this.f9912v, v1Var.f9912v) && je.e0.a(this.H, v1Var.H) && this.f9913w == v1Var.f9913w && this.f9914x == v1Var.f9914x && this.f9915y == v1Var.f9915y && this.E == v1Var.E && this.F == v1Var.F && this.I == v1Var.I && this.J == v1Var.J && this.K == v1Var.K && this.L == v1Var.L && this.M == v1Var.M && this.N == v1Var.N) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f9911i.hashCode() + ((this.f9909d.hashCode() + JfifUtil.MARKER_EOI) * 31)) * 31;
        Object obj = this.f9912v;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        o0 o0Var = this.H;
        int iHashCode3 = (iHashCode2 + (o0Var != null ? o0Var.hashCode() : 0)) * 31;
        long j = this.f9913w;
        int i7 = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j5 = this.f9914x;
        int i10 = (i7 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j7 = this.f9915y;
        int i11 = (((((((i10 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31;
        long j10 = this.J;
        int i12 = (i11 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.K;
        int i13 = (((((i12 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.L) * 31) + this.M) * 31;
        long j12 = this.N;
        return i13 + ((int) (j12 ^ (j12 >>> 32)));
    }
}
