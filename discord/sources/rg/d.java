package rg;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.f1;
import androidx.core.view.g1;
import androidx.core.view.p1;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends g1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f19423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19424e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19425i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int[] f19426v;

    public d(View view) {
        super(0);
        this.f19426v = new int[2];
        this.f19423d = view;
    }

    @Override // androidx.core.view.g1
    public final void onEnd(p1 p1Var) {
        this.f19423d.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.g1
    public final void onPrepare(p1 p1Var) {
        View view = this.f19423d;
        int[] iArr = this.f19426v;
        view.getLocationOnScreen(iArr);
        this.f19424e = iArr[1];
    }

    @Override // androidx.core.view.g1
    public final WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p1 p1Var = (p1) it.next();
            if ((p1Var.f1715a.c() & 8) != 0) {
                this.f19423d.setTranslationY(lg.a.c(this.f19425i, 0, p1Var.f1715a.b()));
                break;
            }
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.g1
    public final f1 onStart(p1 p1Var, f1 f1Var) {
        View view = this.f19423d;
        int[] iArr = this.f19426v;
        view.getLocationOnScreen(iArr);
        int i7 = this.f19424e - iArr[1];
        this.f19425i = i7;
        view.setTranslationY(i7);
        return f1Var;
    }
}
