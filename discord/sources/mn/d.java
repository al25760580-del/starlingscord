package mn;

import android.view.ScaleGestureDetector;
import com.yalantis.ucrop.view.GestureCropImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureCropImageView f15927a;

    public d(GestureCropImageView gestureCropImageView) {
        this.f15927a = gestureCropImageView;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        GestureCropImageView gestureCropImageView = this.f15927a;
        gestureCropImageView.h(scaleFactor, gestureCropImageView.f7302e0, gestureCropImageView.f7303f0);
        return true;
    }
}
