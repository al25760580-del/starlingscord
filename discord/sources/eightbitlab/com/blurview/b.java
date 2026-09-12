package eightbitlab.com.blurview;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8398e;

    public /* synthetic */ b(int i7, Object obj) {
        this.f8397d = i7;
        this.f8398e = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f8397d) {
            case 0:
                ((c) this.f8398e).b();
                break;
            default:
                ((CoordinatorLayout) this.f8398e).j(0);
                break;
        }
        return true;
    }
}
