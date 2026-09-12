package bt;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import com.facebook.react.views.view.ReactViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ReactViewGroup {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bitmap f3395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3396e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Paint f3397i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PorterDuffXfermode f3398v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3399w;

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Bitmap bitmapCreateBitmap;
        Paint paint = this.f3397i;
        super.dispatchDraw(canvas);
        if (this.f3396e) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                childAt.setVisibility(0);
                Bitmap bitmap = this.f3395d;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                if (childAt.getMeasuredWidth() <= 0 || childAt.getMeasuredHeight() <= 0) {
                    bitmapCreateBitmap = null;
                } else {
                    bitmapCreateBitmap = Bitmap.createBitmap(childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    childAt.draw(new Canvas(bitmapCreateBitmap));
                }
                this.f3395d = bitmapCreateBitmap;
                childAt.setVisibility(4);
            }
            this.f3396e = false;
        }
        if (this.f3395d != null) {
            setLayerType(this.f3399w, paint);
            paint.setXfermode(this.f3398v);
            canvas.drawBitmap(this.f3395d, 0.0f, 0.0f, paint);
            paint.setXfermode(null);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3396e = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        View childAt;
        super.onDescendantInvalidated(view, view2);
        if (!this.f3396e && (childAt = getChildAt(0)) != null && childAt.equals(view)) {
            this.f3396e = true;
        }
        invalidate();
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        super.onLayout(z5, i7, i10, i11, i12);
        if (z5) {
            this.f3396e = true;
        }
    }

    public void setRenderingMode(String str) {
        this.f3399w = str.equals("software") ? 1 : 2;
    }
}
