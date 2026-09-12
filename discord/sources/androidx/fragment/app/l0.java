package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewGroup f2179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f2180e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2181i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2182v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2183w;

    public l0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f2183w = true;
        this.f2179d = viewGroup;
        this.f2180e = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f2183w = true;
        if (this.f2181i) {
            return !this.f2182v;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f2181i = true;
            androidx.core.view.w.a(this.f2179d, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z5 = this.f2181i;
        ViewGroup viewGroup = this.f2179d;
        if (z5 || !this.f2183w) {
            viewGroup.endViewTransition(this.f2180e);
            this.f2182v = true;
        } else {
            this.f2183w = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f2) {
        this.f2183w = true;
        if (this.f2181i) {
            return !this.f2182v;
        }
        if (!super.getTransformation(j, transformation, f2)) {
            this.f2181i = true;
            androidx.core.view.w.a(this.f2179d, this);
        }
        return true;
    }
}
