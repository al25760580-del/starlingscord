package eightbitlab.com.blurview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ga.k;

/* JADX INFO: loaded from: classes3.dex */
public class BlurView extends FrameLayout {
    private static final String TAG = "BlurView";
    BlurController blurController;
    private int overlayColor;

    public BlurView(Context context) {
        super(context);
        this.blurController = new k();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, d.f8406a, 0, 0);
        this.overlayColor = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @NonNull
    private BlurAlgorithm getBlurAlgorithm() {
        return Build.VERSION.SDK_INT >= 31 ? new e() : new f(getContext());
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.blurController.n(canvas)) {
            super.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isHardwareAccelerated()) {
            this.blurController.d(true);
        } else {
            Log.e(TAG, "BlurView can't be used in not hardware-accelerated window!");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.blurController.d(false);
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.blurController.m();
    }

    public BlurViewFacade setBlurAutoUpdate(boolean z5) {
        return this.blurController.d(z5);
    }

    public BlurViewFacade setBlurEnabled(boolean z5) {
        return this.blurController.o(z5);
    }

    public BlurViewFacade setBlurRadius(float f2) {
        return this.blurController.p(f2);
    }

    public BlurViewFacade setOverlayColor(int i7) {
        this.overlayColor = i7;
        return this.blurController.k(i7);
    }

    public BlurViewFacade setupWith(@NonNull ViewGroup viewGroup, BlurAlgorithm blurAlgorithm) {
        this.blurController.destroy();
        c cVar = new c(this, viewGroup, this.overlayColor, blurAlgorithm);
        this.blurController = cVar;
        return cVar;
    }

    public BlurViewFacade setupWith(@NonNull ViewGroup viewGroup) {
        return setupWith(viewGroup, getBlurAlgorithm());
    }

    public BlurView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.blurController = new k();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.f8406a, 0, 0);
        this.overlayColor = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
