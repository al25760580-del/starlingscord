package vd;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements gc.g {
    public static final c O = new c("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    public static final String P;
    public static final String Q;
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
    public static final String f21633b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f21634c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f21635d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f21636e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f21637f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final a f21638g0;
    public final float E;
    public final int F;
    public final float G;
    public final float H;
    public final boolean I;
    public final int J;
    public final int K;
    public final float L;
    public final int M;
    public final float N;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f21639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Layout.Alignment f21640e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Layout.Alignment f21641i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Bitmap f21642v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f21643w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f21644x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f21645y;

    static {
        int i7 = e0.f13788a;
        P = Integer.toString(0, 36);
        Q = Integer.toString(1, 36);
        R = Integer.toString(2, 36);
        S = Integer.toString(3, 36);
        T = Integer.toString(4, 36);
        U = Integer.toString(5, 36);
        V = Integer.toString(6, 36);
        W = Integer.toString(7, 36);
        X = Integer.toString(8, 36);
        Y = Integer.toString(9, 36);
        Z = Integer.toString(10, 36);
        a0 = Integer.toString(11, 36);
        f21633b0 = Integer.toString(12, 36);
        f21634c0 = Integer.toString(13, 36);
        f21635d0 = Integer.toString(14, 36);
        f21636e0 = Integer.toString(15, 36);
        f21637f0 = Integer.toString(16, 36);
        f21638g0 = new a();
    }

    public c(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f2, int i7, int i10, float f7, int i11, int i12, float f10, float f11, float f12, boolean z5, int i13, int i14, float f13) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            je.b.g(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f21639d = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f21639d = charSequence.toString();
        } else {
            this.f21639d = null;
        }
        this.f21640e = alignment;
        this.f21641i = alignment2;
        this.f21642v = bitmap;
        this.f21643w = f2;
        this.f21644x = i7;
        this.f21645y = i10;
        this.E = f7;
        this.F = i11;
        this.G = f11;
        this.H = f12;
        this.I = z5;
        this.J = i13;
        this.K = i12;
        this.L = f10;
        this.M = i14;
        this.N = f13;
    }

    public final b a() {
        b bVar = new b();
        bVar.f21618a = this.f21639d;
        bVar.f21619b = this.f21642v;
        bVar.f21620c = this.f21640e;
        bVar.f21621d = this.f21641i;
        bVar.f21622e = this.f21643w;
        bVar.f21623f = this.f21644x;
        bVar.f21624g = this.f21645y;
        bVar.f21625h = this.E;
        bVar.f21626i = this.F;
        bVar.j = this.K;
        bVar.k = this.L;
        bVar.f21627l = this.G;
        bVar.f21628m = this.H;
        bVar.f21629n = this.I;
        bVar.f21630o = this.J;
        bVar.f21631p = this.M;
        bVar.f21632q = this.N;
        return bVar;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            Bitmap bitmap2 = cVar.f21642v;
            if (TextUtils.equals(this.f21639d, cVar.f21639d) && this.f21640e == cVar.f21640e && this.f21641i == cVar.f21641i && ((bitmap = this.f21642v) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f21643w == cVar.f21643w && this.f21644x == cVar.f21644x && this.f21645y == cVar.f21645y && this.E == cVar.E && this.F == cVar.F && this.G == cVar.G && this.H == cVar.H && this.I == cVar.I && this.J == cVar.J && this.K == cVar.K && this.L == cVar.L && this.M == cVar.M && this.N == cVar.N) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21639d, this.f21640e, this.f21641i, this.f21642v, Float.valueOf(this.f21643w), Integer.valueOf(this.f21644x), Integer.valueOf(this.f21645y), Float.valueOf(this.E), Integer.valueOf(this.F), Float.valueOf(this.G), Float.valueOf(this.H), Boolean.valueOf(this.I), Integer.valueOf(this.J), Integer.valueOf(this.K), Float.valueOf(this.L), Integer.valueOf(this.M), Float.valueOf(this.N)});
    }
}
