package le;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f15066i;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final GestureDetector f15068w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PointF f15064d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PointF f15065e = new PointF();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f15067v = 25.0f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile float f15069x = 3.1415927f;

    public l(Context context, j jVar) {
        this.f15066i = jVar;
        this.f15068w = new GestureDetector(context, this);
    }

    @Override // le.c
    public final void a(float f2, float[] fArr) {
        this.f15069x = -f2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f15064d.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f7) {
        float x5 = (motionEvent2.getX() - this.f15064d.x) / this.f15067v;
        float y5 = motionEvent2.getY();
        PointF pointF = this.f15064d;
        float f10 = (y5 - pointF.y) / this.f15067v;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d6 = this.f15069x;
        float fCos = (float) Math.cos(d6);
        float fSin = (float) Math.sin(d6);
        PointF pointF2 = this.f15065e;
        pointF2.x -= (fCos * x5) - (fSin * f10);
        float f11 = (fCos * f10) + (fSin * x5) + pointF2.y;
        pointF2.y = f11;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f11));
        j jVar = this.f15066i;
        PointF pointF3 = this.f15065e;
        synchronized (jVar) {
            float f12 = pointF3.y;
            jVar.f15056y = f12;
            Matrix.setRotateM(jVar.f15054w, 0, -f12, (float) Math.cos(jVar.E), (float) Math.sin(jVar.E), 0.0f);
            Matrix.setRotateM(jVar.f15055x, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f15066i.H.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f15068w.onTouchEvent(motionEvent);
    }
}
