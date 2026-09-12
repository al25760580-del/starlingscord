package fh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f9233b;

    public /* synthetic */ n(o oVar, int i7) {
        this.f9232a = i7;
        this.f9233b = oVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f9232a) {
            case 1:
                super.onAnimationEnd(animator);
                o oVar = this.f9233b;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = oVar.f9240y;
                if (arrayList != null && !oVar.E) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).a(oVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f9232a) {
            case 0:
                super.onAnimationStart(animator);
                o oVar = this.f9233b;
                ArrayList arrayList = oVar.f9240y;
                if (arrayList != null && !oVar.E) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).b(oVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
