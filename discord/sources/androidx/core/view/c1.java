package androidx.core.view;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f1642a;

    public c1(View view) {
        this.f1642a = new WeakReference(view);
    }

    public final void a(float f2) {
        View view = (View) this.f1642a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
    }

    public final void b() {
        View view = (View) this.f1642a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.f1642a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(d1 d1Var) {
        View view = (View) this.f1642a.get();
        if (view != null) {
            if (d1Var != null) {
                view.animate().setListener(new b1(d1Var, view, 0));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f2) {
        View view = (View) this.f1642a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
    }
}
