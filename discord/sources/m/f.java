package m;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.w3;
import androidx.core.view.c1;
import androidx.core.view.d1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f15336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d1 f15337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15338e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15335b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w3 f15339f = new w3(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f15334a = new ArrayList();

    public final void a() {
        if (this.f15338e) {
            Iterator it = this.f15334a.iterator();
            while (it.hasNext()) {
                ((c1) it.next()).b();
            }
            this.f15338e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f15338e) {
            return;
        }
        for (c1 c1Var : this.f15334a) {
            long j = this.f15335b;
            if (j >= 0) {
                c1Var.c(j);
            }
            Interpolator interpolator = this.f15336c;
            if (interpolator != null && (view = (View) c1Var.f1642a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f15337d != null) {
                c1Var.d(this.f15339f);
            }
            View view2 = (View) c1Var.f1642a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f15338e = true;
    }
}
