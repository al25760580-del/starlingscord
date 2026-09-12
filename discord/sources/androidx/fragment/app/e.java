package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x1 f2123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f2126d;

    public e(x1 x1Var, ViewGroup viewGroup, View view, f fVar) {
        this.f2123a = x1Var;
        this.f2124b = viewGroup;
        this.f2125c = view;
        this.f2126d = fVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        ViewGroup viewGroup = this.f2124b;
        viewGroup.post(new ac.a(viewGroup, this.f2125c, this.f2126d, 1));
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f2123a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f2123a + " has reached onAnimationStart.");
        }
    }
}
