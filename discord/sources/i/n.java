package i;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.core.view.u0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n extends ls.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11252c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i7, Object obj) {
        super(1);
        this.f11251b = i7;
        this.f11252c = obj;
    }

    @Override // ls.d, androidx.core.view.d1
    public void d() {
        switch (this.f11251b) {
            case 0:
                ((o) this.f11252c).f11253d.S.setVisibility(0);
                break;
        }
    }

    @Override // androidx.core.view.d1
    public final void onAnimationEnd() {
        int i7 = this.f11251b;
        Object obj = this.f11252c;
        switch (i7) {
            case 0:
                androidx.appcompat.app.a aVar = ((o) obj).f11253d;
                aVar.S.setAlpha(1.0f);
                aVar.V.d(null);
                aVar.V = null;
                break;
            default:
                androidx.appcompat.app.a aVar2 = ((q) obj).f11256b;
                aVar2.S.setVisibility(8);
                PopupWindow popupWindow = aVar2.T;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (aVar2.S.getParent() instanceof View) {
                    View view = (View) aVar2.S.getParent();
                    WeakHashMap weakHashMap = u0.f1729a;
                    androidx.core.view.j0.c(view);
                }
                aVar2.S.e();
                aVar2.V.d(null);
                aVar2.V = null;
                ViewGroup viewGroup = aVar2.X;
                WeakHashMap weakHashMap2 = u0.f1729a;
                androidx.core.view.j0.c(viewGroup);
                break;
        }
    }
}
