package androidx.swiperefreshlayout.widget;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f2752a = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f2753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f2754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f2755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f2759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f2760i;
    public int j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f2761l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f2762m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2763n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Path f2764o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f2765p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f2766q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2767r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2768s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2769t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2770u;

    public c() {
        Paint paint = new Paint();
        this.f2753b = paint;
        Paint paint2 = new Paint();
        this.f2754c = paint2;
        Paint paint3 = new Paint();
        this.f2755d = paint3;
        this.f2756e = 0.0f;
        this.f2757f = 0.0f;
        this.f2758g = 0.0f;
        this.f2759h = 5.0f;
        this.f2765p = 1.0f;
        this.f2769t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i7) {
        this.j = i7;
        this.f2770u = this.f2760i[i7];
    }
}
