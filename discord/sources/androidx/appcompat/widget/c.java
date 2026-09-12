package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.Transition;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f917b;

    public /* synthetic */ c(int i7, Object obj) {
        this.f916a = i7;
        this.f917b = obj;
    }

    public void a(Animator animator) {
        animator.removeListener(this);
        gl.a aVar = (gl.a) this.f917b;
        LinkedHashSet linkedHashSet = aVar.f10108o;
        if (linkedHashSet == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        }
        TypeIntrinsics.asMutableCollection(linkedHashSet).remove(animator);
        if (linkedHashSet.isEmpty()) {
            aVar.f10098c.b(0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f916a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f917b;
                actionBarOverlayLayout.T = null;
                actionBarOverlayLayout.G = false;
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animator, "animator");
                a(animator);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f916a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f917b;
                actionBarOverlayLayout.T = null;
                actionBarOverlayLayout.G = false;
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animator, "animator");
                a(animator);
                break;
            case 2:
                ((Transition) this.f917b).n();
                animator.removeListener(this);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(animator, "animation");
                mm.i iVar = (mm.i) this.f917b;
                iVar.f15909v = false;
                iVar.f15906d.onSheetYTranslationChanged$react_native_screens_release();
                break;
            case 4:
                n3.f fVar = (n3.f) this.f917b;
                ArrayList arrayList = new ArrayList(fVar.f16305w);
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((fh.c) arrayList.get(i7)).a(fVar);
                }
                break;
            case 5:
                nh.k kVar = (nh.k) this.f917b;
                kVar.p();
                kVar.f16859r.start();
                break;
            case 6:
                ((HideBottomViewOnScrollBehavior) this.f917b).k = null;
                break;
            default:
                ((HideViewOnScrollBehavior) this.f917b).k = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        switch (this.f916a) {
            case 3:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((mm.i) this.f917b).f15909v = true;
                break;
            case 4:
                n3.f fVar = (n3.f) this.f917b;
                ArrayList arrayList = new ArrayList(fVar.f16305w);
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((fh.c) arrayList.get(i7)).b(fVar);
                }
                break;
            default:
                super.onAnimationStart(animation);
                break;
        }
    }
}
