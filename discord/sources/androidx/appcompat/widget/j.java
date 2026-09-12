package androidx.appcompat.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f1005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f1006e;

    public j(n nVar, h hVar) {
        this.f1006e = nVar;
        this.f1005d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n.h hVar;
        n nVar = this.f1006e;
        n.j jVar = nVar.f1038i;
        if (jVar != null && (hVar = jVar.f16146e) != null) {
            hVar.R(jVar);
        }
        View view = (View) nVar.E;
        if (view != null && view.getWindowToken() != null) {
            h hVar2 = this.f1005d;
            if (hVar2.b()) {
                nVar.Q = hVar2;
            } else if (hVar2.f16206e != null) {
                hVar2.d(0, 0, false, false);
                nVar.Q = hVar2;
            }
        }
        nVar.S = null;
    }
}
