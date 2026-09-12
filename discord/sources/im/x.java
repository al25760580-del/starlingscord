package im;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.yalantis.ucrop.view.GestureCropImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11981e;

    public /* synthetic */ x(int i7, Object obj) {
        this.f11980d = i7;
        this.f11981e = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.f11980d) {
            case 0:
                y yVar = (y) this.f11981e;
                yVar.f11992m = motionEvent.getX();
                yVar.f11993n = motionEvent.getY();
                yVar.f11994o = 1;
                return true;
            default:
                GestureCropImageView gestureCropImageView = (GestureCropImageView) this.f11981e;
                float doubleTapTargetScale = gestureCropImageView.getDoubleTapTargetScale();
                float x5 = motionEvent.getX();
                float y5 = motionEvent.getY();
                if (doubleTapTargetScale > gestureCropImageView.getMaxScale()) {
                    doubleTapTargetScale = gestureCropImageView.getMaxScale();
                }
                float currentScale = gestureCropImageView.getCurrentScale();
                mn.b bVar = new mn.b(gestureCropImageView, currentScale, doubleTapTargetScale - currentScale, x5, y5);
                gestureCropImageView.S = bVar;
                gestureCropImageView.post(bVar);
                return super.onDoubleTap(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f7) {
        switch (this.f11980d) {
            case 1:
                ((GestureCropImageView) this.f11981e).d(-f2, -f7);
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f2, f7);
        }
    }
}
