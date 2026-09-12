package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Animation {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2774e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f2775i;

    public e(i iVar, int i7, int i10) {
        this.f2775i = iVar;
        this.f2773d = i7;
        this.f2774e = i10;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f2, Transformation transformation) {
        CircularProgressDrawable circularProgressDrawable = this.f2775i.mProgress;
        int i7 = this.f2773d;
        circularProgressDrawable.setAlpha((int) (((this.f2774e - i7) * f2) + i7));
    }
}
