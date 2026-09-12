package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Animation {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f2779e;

    public /* synthetic */ g(i iVar, int i7) {
        this.f2778d = i7;
        this.f2779e = iVar;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f2, Transformation transformation) {
        switch (this.f2778d) {
            case 0:
                i iVar = this.f2779e;
                float f7 = iVar.mStartingScale;
                iVar.setAnimationProgress(((-f7) * f2) + f7);
                iVar.moveToStart(f2);
                break;
            case 1:
                this.f2779e.setAnimationProgress(f2);
                break;
            default:
                this.f2779e.setAnimationProgress(1.0f - f2);
                break;
        }
    }
}
