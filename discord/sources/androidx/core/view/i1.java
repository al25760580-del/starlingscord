package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class i1 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1675d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1676e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1677i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f1678v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1679w;

    public i1(ue.i iVar, n.c cVar, n.l lVar, n.j jVar) {
        this.f1679w = iVar;
        this.f1676e = cVar;
        this.f1677i = lVar;
        this.f1678v = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1675d) {
            case 0:
                k1.h((View) this.f1676e, (p1) this.f1677i, (f1) this.f1678v);
                ((ValueAnimator) this.f1679w).start();
                break;
            default:
                n.d dVar = (n.d) ((ue.i) this.f1679w).f21117d;
                n.l lVar = (n.l) this.f1677i;
                n.c cVar = (n.c) this.f1676e;
                if (cVar != null) {
                    dVar.W = true;
                    cVar.f16119b.c(false);
                    dVar.W = false;
                }
                if (lVar.isEnabled() && lVar.hasSubMenu()) {
                    ((n.j) this.f1678v).q(lVar, null, 4);
                    break;
                }
                break;
        }
    }

    public i1(View view, p1 p1Var, f1 f1Var, ValueAnimator valueAnimator) {
        this.f1676e = view;
        this.f1677i = p1Var;
        this.f1678v = f1Var;
        this.f1679w = valueAnimator;
    }
}
