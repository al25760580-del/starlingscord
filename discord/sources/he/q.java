package he;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10664d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10661a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10662b = 65536;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10665e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a[] f10666f = new a[100];

    public final synchronized void a(int i7) {
        boolean z5 = i7 < this.f10663c;
        this.f10663c = i7;
        if (z5) {
            b();
        }
    }

    public final synchronized void b() {
        int iMax = Math.max(0, je.e0.f(this.f10663c, this.f10662b) - this.f10664d);
        int i7 = this.f10665e;
        if (iMax >= i7) {
            return;
        }
        Arrays.fill(this.f10666f, iMax, i7, (Object) null);
        this.f10665e = iMax;
    }
}
