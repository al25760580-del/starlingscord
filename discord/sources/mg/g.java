package mg;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends v0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.datastore.preferences.protobuf.g f15784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15785b = 0;

    public g() {
    }

    @Override // v0.b
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i7) {
        t(coordinatorLayout, view, i7);
        if (this.f15784a == null) {
            this.f15784a = new androidx.datastore.preferences.protobuf.g(view);
        }
        androidx.datastore.preferences.protobuf.g gVar = this.f15784a;
        View view2 = (View) gVar.f1863e;
        gVar.f1860b = view2.getTop();
        gVar.f1861c = view2.getLeft();
        this.f15784a.a();
        int i10 = this.f15785b;
        if (i10 == 0) {
            return true;
        }
        androidx.datastore.preferences.protobuf.g gVar2 = this.f15784a;
        if (gVar2.f1862d != i10) {
            gVar2.f1862d = i10;
            gVar2.a();
        }
        this.f15785b = 0;
        return true;
    }

    public final int s() {
        androidx.datastore.preferences.protobuf.g gVar = this.f15784a;
        if (gVar != null) {
            return gVar.f1862d;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, View view, int i7) {
        coordinatorLayout.k(i7, view);
    }

    public g(int i7) {
    }
}
