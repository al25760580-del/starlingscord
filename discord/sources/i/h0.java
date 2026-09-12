package i;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.core.view.u0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends ls.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f11217c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(j0 j0Var, int i7) {
        super(1);
        this.f11216b = i7;
        this.f11217c = j0Var;
    }

    @Override // androidx.core.view.d1
    public final void onAnimationEnd() {
        View view;
        int i7 = this.f11216b;
        j0 j0Var = this.f11217c;
        switch (i7) {
            case 0:
                if (j0Var.f11239o && (view = j0Var.f11233g) != null) {
                    view.setTranslationY(0.0f);
                    j0Var.f11230d.setTranslationY(0.0f);
                }
                j0Var.f11230d.setVisibility(8);
                j0Var.f11230d.setTransitioning(false);
                j0Var.f11243s = null;
                q qVar = j0Var.k;
                if (qVar != null) {
                    qVar.a(j0Var.j);
                    j0Var.j = null;
                    j0Var.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = j0Var.f11229c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = u0.f1729a;
                    androidx.core.view.j0.c(actionBarOverlayLayout);
                }
                break;
            default:
                j0Var.f11243s = null;
                j0Var.f11230d.requestLayout();
                break;
        }
    }
}
