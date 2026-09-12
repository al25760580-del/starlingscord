package hh;

import android.graphics.Typeface;
import e4.f;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a1.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f10747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f10748i;

    public b(d dVar, f fVar) {
        this.f10748i = dVar;
        this.f10747h = fVar;
    }

    @Override // a1.b
    public final void g(int i7) {
        this.f10748i.f10764n = true;
        this.f10747h.m0(i7);
    }

    @Override // a1.b
    public final void h(Typeface typeface) {
        d dVar = this.f10748i;
        dVar.f10766p = Typeface.create(typeface, dVar.f10756d);
        dVar.f10764n = true;
        this.f10747h.n0(dVar.f10766p, false);
    }
}
