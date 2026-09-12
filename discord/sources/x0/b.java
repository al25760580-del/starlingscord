package x0;

import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b extends SharedElementCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.core.app.SharedElementCallback f22501a;

    public b(androidx.core.app.SharedElementCallback sharedElementCallback) {
        this.f22501a = sharedElementCallback;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b3  */
    @Override // android.app.SharedElementCallback
    public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        Parcelable parcelable;
        Bitmap bitmap;
        androidx.core.app.SharedElementCallback sharedElementCallback = this.f22501a;
        sharedElementCallback.getClass();
        float f2 = 1048576.0f;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (drawable == null || background != null) {
                f2 = 1048576.0f;
                parcelable = null;
            } else {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    parcelable = null;
                    bitmap = null;
                } else {
                    float fMin = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
                    if ((drawable instanceof BitmapDrawable) && fMin == 1.0f) {
                        bitmap = ((BitmapDrawable) drawable).getBitmap();
                        parcelable = null;
                    } else {
                        int i7 = (int) (intrinsicWidth * fMin);
                        int i10 = (int) (intrinsicHeight * fMin);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Rect bounds = drawable.getBounds();
                        int i11 = bounds.left;
                        int i12 = bounds.top;
                        parcelable = null;
                        int i13 = bounds.right;
                        int i14 = bounds.bottom;
                        drawable.setBounds(0, 0, i7, i10);
                        drawable.draw(canvas);
                        drawable.setBounds(i11, i12, i13, i14);
                        bitmap = bitmapCreateBitmap;
                    }
                }
                if (bitmap != null) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("sharedElement:snapshot:bitmap", bitmap);
                    bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                    if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                        float[] fArr = new float[9];
                        imageView.getImageMatrix().getValues(fArr);
                        bundle.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                    }
                    return bundle;
                }
            }
        } else {
            f2 = 1048576.0f;
            parcelable = null;
        }
        int iRound = Math.round(rectF.width());
        int iRound2 = Math.round(rectF.height());
        if (iRound <= 0 || iRound2 <= 0) {
            return parcelable;
        }
        float fMin2 = Math.min(1.0f, f2 / (iRound * iRound2));
        int i15 = (int) (iRound * fMin2);
        int i16 = (int) (iRound2 * fMin2);
        if (sharedElementCallback.f1538a == null) {
            sharedElementCallback.f1538a = new Matrix();
        }
        sharedElementCallback.f1538a.set(matrix);
        sharedElementCallback.f1538a.postTranslate(-rectF.left, -rectF.top);
        sharedElementCallback.f1538a.postScale(fMin2, fMin2);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i15, i16, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        canvas2.concat(sharedElementCallback.f1538a);
        view.draw(canvas2);
        return bitmapCreateBitmap2;
    }

    @Override // android.app.SharedElementCallback
    public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
        this.f22501a.getClass();
        if (!(parcelable instanceof Bundle)) {
            if (!(parcelable instanceof Bitmap)) {
                return null;
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageBitmap((Bitmap) parcelable);
            return imageView;
        }
        Bundle bundle = (Bundle) parcelable;
        Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
        if (bitmap == null) {
            return null;
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageBitmap(bitmap);
        imageView2.setScaleType(ImageView.ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
        if (imageView2.getScaleType() == ImageView.ScaleType.MATRIX) {
            float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
            Matrix matrix = new Matrix();
            matrix.setValues(floatArray);
            imageView2.setImageMatrix(matrix);
        }
        return imageView2;
    }

    @Override // android.app.SharedElementCallback
    public final void onMapSharedElements(List list, Map map) {
        this.f22501a.getClass();
    }

    @Override // android.app.SharedElementCallback
    public final void onRejectSharedElements(List list) {
        this.f22501a.getClass();
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementEnd(List list, List list2, List list3) {
        this.f22501a.getClass();
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementStart(List list, List list2, List list3) {
        this.f22501a.getClass();
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementsArrived(List list, List list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        this.f22501a.getClass();
        onSharedElementsReadyListener.onSharedElementsReady();
    }
}
