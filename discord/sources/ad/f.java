package ad;

import je.w;
import pc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f348b;

    public /* synthetic */ f(int i7, long j, boolean z5) {
        this.f347a = i7;
        this.f348b = j;
    }

    public static f b(l lVar, w wVar) {
        lVar.C(wVar.f13860a, 0, 8);
        wVar.F(0);
        return new f(wVar.g(), wVar.l(), false);
    }

    public boolean a() {
        int i7 = this.f347a;
        return i7 == 0 || i7 == 1;
    }

    public f(int i7, long j) {
        je.b.g(j >= 0);
        this.f347a = i7;
        this.f348b = j;
    }
}
