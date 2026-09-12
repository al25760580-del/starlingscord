package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.TextView;
import com.yalantis.ucrop.UCropActivity;
import java.util.Locale;
import mn.c;
import mn.e;

/* JADX INFO: loaded from: classes3.dex */
public class GestureCropImageView extends c {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ScaleGestureDetector f7299b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ln.c f7300c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public GestureDetector f7301d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f7302e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f7303f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f7304g0;
    public boolean h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f7305i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f7306j0;

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7304g0 = true;
        this.h0 = true;
        this.f7305i0 = true;
        this.f7306j0 = 5;
    }

    public int getDoubleTapScaleSteps() {
        return this.f7306j0;
    }

    public float getDoubleTapTargetScale() {
        return getCurrentScale() * ((float) Math.pow(getMaxScale() / getMinScale(), 1.0f / this.f7306j0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0) {
            f();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f7302e0 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            this.f7303f0 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
        }
        if (this.f7305i0) {
            this.f7301d0.onTouchEvent(motionEvent);
        }
        if (this.h0) {
            this.f7299b0.onTouchEvent(motionEvent);
        }
        if (this.f7304g0) {
            ln.c cVar = this.f7300c0;
            cVar.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                cVar.f15146c = motionEvent.getX();
                cVar.f15147d = motionEvent.getY();
                cVar.f15148e = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
                cVar.f15150g = 0.0f;
                cVar.f15151h = true;
            } else if (actionMasked == 1) {
                cVar.f15148e = -1;
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    cVar.f15144a = motionEvent.getX();
                    cVar.f15145b = motionEvent.getY();
                    cVar.f15149f = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                    cVar.f15150g = 0.0f;
                    cVar.f15151h = true;
                } else if (actionMasked == 6) {
                    cVar.f15149f = -1;
                }
            } else if (cVar.f15148e != -1 && cVar.f15149f != -1 && motionEvent.getPointerCount() > cVar.f15149f) {
                float x5 = motionEvent.getX(cVar.f15148e);
                float y5 = motionEvent.getY(cVar.f15148e);
                float x6 = motionEvent.getX(cVar.f15149f);
                float y8 = motionEvent.getY(cVar.f15149f);
                if (cVar.f15151h) {
                    cVar.f15150g = 0.0f;
                    cVar.f15151h = false;
                } else {
                    float degrees = (((float) Math.toDegrees((float) Math.atan2(y8 - y5, x6 - x5))) % 360.0f) - (((float) Math.toDegrees((float) Math.atan2(cVar.f15145b - cVar.f15147d, cVar.f15144a - cVar.f15146c))) % 360.0f);
                    cVar.f15150g = degrees;
                    if (degrees < -180.0f) {
                        cVar.f15150g = degrees + 360.0f;
                    } else if (degrees > 180.0f) {
                        cVar.f15150g = degrees - 360.0f;
                    }
                }
                GestureCropImageView gestureCropImageView = (GestureCropImageView) cVar.f15152i.f21117d;
                float f2 = cVar.f15150g;
                float f7 = gestureCropImageView.f7302e0;
                float f10 = gestureCropImageView.f7303f0;
                Matrix matrix = gestureCropImageView.f15931v;
                if (f2 != 0.0f) {
                    matrix.postRotate(f2, f7, f10);
                    gestureCropImageView.setImageMatrix(matrix);
                    e eVar = gestureCropImageView.f15934y;
                    if (eVar != null) {
                        float[] fArr = gestureCropImageView.f15930i;
                        matrix.getValues(fArr);
                        double d6 = fArr[1];
                        matrix.getValues(fArr);
                        float f11 = (float) (-(Math.atan2(d6, fArr[0]) * 57.29577951308232d));
                        TextView textView = ((UCropActivity) ((hn.c) eVar).f10954b).S;
                        if (textView != null) {
                            textView.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f11)));
                        }
                    }
                }
                cVar.f15144a = x6;
                cVar.f15145b = y8;
                cVar.f15146c = x5;
                cVar.f15147d = y5;
            }
        }
        if ((motionEvent.getAction() & 255) == 1) {
            setImageToWrapCropBounds(true);
        }
        return true;
    }

    public void setDoubleTapScaleSteps(int i7) {
        this.f7306j0 = i7;
    }

    public void setGestureEnabled(boolean z5) {
        this.f7305i0 = z5;
    }

    public void setRotateEnabled(boolean z5) {
        this.f7304g0 = z5;
    }

    public void setScaleEnabled(boolean z5) {
        this.h0 = z5;
    }
}
