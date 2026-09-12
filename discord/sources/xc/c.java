package xc;

import gc.h1;
import je.w;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f22749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f22750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f22751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22752h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22753i;

    public c(w wVar, w wVar2, boolean z5) throws h1 {
        this.f22751g = wVar;
        this.f22750f = wVar2;
        this.f22749e = z5;
        wVar2.F(12);
        this.f22745a = wVar2.x();
        wVar.F(12);
        this.f22753i = wVar.x();
        yk.a.c("first_chunk must be 1", wVar.g() == 1);
        this.f22746b = -1;
    }

    public final boolean a() {
        int i7 = this.f22746b + 1;
        this.f22746b = i7;
        if (i7 == this.f22745a) {
            return false;
        }
        boolean z5 = this.f22749e;
        w wVar = this.f22750f;
        this.f22748d = z5 ? wVar.y() : wVar.v();
        if (this.f22746b == this.f22752h) {
            w wVar2 = this.f22751g;
            this.f22747c = wVar2.x();
            wVar2.G(4);
            int i10 = this.f22753i - 1;
            this.f22753i = i10;
            this.f22752h = i10 > 0 ? wVar2.x() - 1 : -1;
        }
        return true;
    }
}
