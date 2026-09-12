package hh;

import android.graphics.Typeface;
import e4.f;
import ga.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Typeface f10744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f10745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10746d;

    public a(l lVar, Typeface typeface) {
        this.f10744b = typeface;
        this.f10745c = lVar;
    }

    @Override // e4.f
    public final void m0(int i7) {
        if (this.f10746d) {
            return;
        }
        bh.c cVar = (bh.c) this.f10745c.f9547e;
        if (cVar.l(this.f10744b)) {
            cVar.j(false);
        }
    }

    @Override // e4.f
    public final void n0(Typeface typeface, boolean z5) {
        if (this.f10746d) {
            return;
        }
        bh.c cVar = (bh.c) this.f10745c.f9547e;
        if (cVar.l(typeface)) {
            cVar.j(false);
        }
    }
}
