package i;

import android.view.View;
import androidx.core.view.u0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class p extends ls.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.a f11254b;

    public p(androidx.appcompat.app.a aVar) {
        super(1);
        this.f11254b = aVar;
    }

    @Override // ls.d, androidx.core.view.d1
    public final void d() {
        androidx.appcompat.app.a aVar = this.f11254b;
        aVar.S.setVisibility(0);
        if (aVar.S.getParent() instanceof View) {
            View view = (View) aVar.S.getParent();
            WeakHashMap weakHashMap = u0.f1729a;
            androidx.core.view.j0.c(view);
        }
    }

    @Override // androidx.core.view.d1
    public final void onAnimationEnd() {
        androidx.appcompat.app.a aVar = this.f11254b;
        aVar.S.setAlpha(1.0f);
        aVar.V.d(null);
        aVar.V = null;
    }
}
