package im;

import android.content.Context;
import android.view.GestureDetector;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fj.c f11982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f11983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f11984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f11987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f11988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f11989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f11990i;
    public long j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f11991l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f11992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f11993n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11994o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final GestureDetector f11995p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f11996q;

    public y(Context context, fj.c cVar) {
        this.f11982a = cVar;
        this.f11991l = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        int i7 = context.getApplicationInfo().targetSdkVersion;
        if (i7 > 18) {
            this.f11985d = true;
            if (this.f11995p == null) {
                this.f11995p = new GestureDetector(context, new x(0, this), null);
            }
        }
        if (i7 > 22) {
            this.f11986e = true;
        }
    }

    public final boolean a() {
        return this.f11994o != 0;
    }
}
