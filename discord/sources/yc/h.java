package yc;

import je.w;
import pc.m;
import pc.x;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f23261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f23262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f23263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f23264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f23265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f23266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23268i;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f23269l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f23270m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jj.a f23260a = new jj.a();
    public e4.e j = new e4.e((char) 0, 26);

    public void a(long j) {
        this.f23266g = j;
    }

    public abstract long b(w wVar);

    public abstract boolean c(w wVar, long j, e4.e eVar);

    public void d(boolean z5) {
        if (z5) {
            this.j = new e4.e((char) 0, 26);
            this.f23265f = 0L;
            this.f23267h = 0;
        } else {
            this.f23267h = 1;
        }
        this.f23264e = -1L;
        this.f23266g = 0L;
    }
}
