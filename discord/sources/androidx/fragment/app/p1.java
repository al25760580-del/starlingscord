package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p1 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r1 f2234e;

    public p1(r1 r1Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f2234e = r1Var;
        this.f2230a = obj;
        this.f2231b = arrayList;
        this.f2232c = obj2;
        this.f2233d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        r1 r1Var = this.f2234e;
        Object obj = this.f2230a;
        if (obj != null) {
            r1Var.A(obj, this.f2231b, null);
        }
        Object obj2 = this.f2232c;
        if (obj2 != null) {
            r1Var.A(obj2, this.f2233d, null);
        }
    }
}
