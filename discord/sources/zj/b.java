package zj;

import ij.h;
import ij.m;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mj.b f24018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f24019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f24020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f24021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f24022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24026i;

    public b(mj.b bVar, m mVar, m mVar2, m mVar3, m mVar4) throws h {
        boolean z5 = mVar == null || mVar2 == null;
        boolean z6 = mVar3 == null || mVar4 == null;
        if (z5 && z6) {
            throw h.f11808i;
        }
        if (z5) {
            mVar = new m(0.0f, mVar3.f11824b);
            mVar2 = new m(0.0f, mVar4.f11824b);
        } else if (z6) {
            int i7 = bVar.f15839d;
            mVar3 = new m(i7 - 1, mVar.f11824b);
            mVar4 = new m(i7 - 1, mVar2.f11824b);
        }
        this.f24018a = bVar;
        this.f24019b = mVar;
        this.f24020c = mVar2;
        this.f24021d = mVar3;
        this.f24022e = mVar4;
        this.f24023f = (int) Math.min(mVar.f11823a, mVar2.f11823a);
        this.f24024g = (int) Math.max(mVar3.f11823a, mVar4.f11823a);
        this.f24025h = (int) Math.min(mVar.f11824b, mVar3.f11824b);
        this.f24026i = (int) Math.max(mVar2.f11824b, mVar4.f11824b);
    }

    public b(b bVar) {
        this.f24018a = bVar.f24018a;
        this.f24019b = bVar.f24019b;
        this.f24020c = bVar.f24020c;
        this.f24021d = bVar.f24021d;
        this.f24022e = bVar.f24022e;
        this.f24023f = bVar.f24023f;
        this.f24024g = bVar.f24024g;
        this.f24025h = bVar.f24025h;
        this.f24026i = bVar.f24026i;
    }
}
