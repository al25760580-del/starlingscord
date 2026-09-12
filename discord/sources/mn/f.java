package mn;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.y;
import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.UCropView;
import ga.l;
import im.x;
import java.util.Locale;
import ue.i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f extends y {
    public float[] E;
    public float[] F;
    public boolean G;
    public boolean H;
    public int I;
    public String J;
    public String K;
    public jn.c L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f15928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f15929e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f15930i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Matrix f15931v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15932w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f15933x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e f15934y;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f15928d = new float[8];
        this.f15929e = new float[2];
        this.f15930i = new float[9];
        this.f15931v = new Matrix();
        this.G = false;
        this.H = false;
        this.I = 0;
        GestureCropImageView gestureCropImageView = (GestureCropImageView) this;
        gestureCropImageView.setScaleType(ImageView.ScaleType.MATRIX);
        gestureCropImageView.f7301d0 = new GestureDetector(gestureCropImageView.getContext(), new x(1, gestureCropImageView), null, true);
        gestureCropImageView.f7299b0 = new ScaleGestureDetector(gestureCropImageView.getContext(), new d(gestureCropImageView));
        i iVar = new i(gestureCropImageView);
        ln.c cVar = new ln.c();
        cVar.f15152i = iVar;
        cVar.f15148e = -1;
        cVar.f15149f = -1;
        gestureCropImageView.f7300c0 = cVar;
    }

    public final float a(Matrix matrix) {
        float[] fArr = this.f15930i;
        matrix.getValues(fArr);
        double dPow = Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(Math.pow(fArr[3], 2.0d) + dPow);
    }

    public final void d(float f2, float f7) {
        if (f2 == 0.0f && f7 == 0.0f) {
            return;
        }
        Matrix matrix = this.f15931v;
        matrix.postTranslate(f2, f7);
        setImageMatrix(matrix);
    }

    public float getCurrentAngle() {
        Matrix matrix = this.f15931v;
        float[] fArr = this.f15930i;
        matrix.getValues(fArr);
        double d6 = fArr[1];
        matrix.getValues(fArr);
        return (float) (-(Math.atan2(d6, fArr[0]) * 57.29577951308232d));
    }

    public float getCurrentScale() {
        return a(this.f15931v);
    }

    public jn.c getExifInfo() {
        return this.L;
    }

    public String getImageInputPath() {
        return this.J;
    }

    public String getImageOutputPath() {
        return this.K;
    }

    public int getMaxBitmapSize() {
        int iM;
        if (this.I <= 0) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            Point point = new Point();
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getSize(point);
            }
            int i7 = point.x;
            int iSqrt = (int) Math.sqrt(Math.pow(point.y, 2.0d) + Math.pow(i7, 2.0d));
            Canvas canvas = new Canvas();
            int iMin = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
            if (iMin > 0) {
                iSqrt = Math.min(iSqrt, iMin);
            }
            try {
                iM = android.support.v4.media.session.b.m();
            } catch (Exception e10) {
                Log.d("EglUtils", "getMaxTextureSize: ", e10);
                iM = 0;
            }
            if (iM > 0) {
                iSqrt = Math.min(iSqrt, iM);
            }
            kk.b.q(iSqrt, "maxBitmapSize: ", "BitmapLoadUtils");
            this.I = iSqrt;
        }
        return this.I;
    }

    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof ln.a)) {
            return null;
        }
        return ((ln.a) getDrawable()).f15137b;
    }

    @Override // android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        super.onLayout(z5, i7, i10, i11, i12);
        if (z5 || (this.G && !this.H)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.f15932w = width - paddingLeft;
            this.f15933x = height - paddingTop;
            c cVar = (c) this;
            Drawable drawable = cVar.getDrawable();
            if (drawable != null) {
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                Log.d("TransformImageView", String.format("Image size: [%d:%d]", Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)));
                RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
                float f2 = rectF.left;
                float f7 = rectF.top;
                float f10 = rectF.right;
                float f11 = rectF.bottom;
                cVar.E = new float[]{f2, f7, f10, f7, f10, f11, f2, f11};
                cVar.F = new float[]{rectF.centerX(), rectF.centerY()};
                cVar.H = true;
                e eVar = cVar.f15934y;
                if (eVar != null) {
                    UCropActivity uCropActivity = (UCropActivity) ((hn.c) eVar).f10954b;
                    uCropActivity.I.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
                    uCropActivity.U.setClickable(false);
                    uCropActivity.H = false;
                    uCropActivity.supportInvalidateOptionsMenu();
                }
            }
            Drawable drawable2 = cVar.getDrawable();
            if (drawable2 == null) {
                return;
            }
            float intrinsicWidth2 = drawable2.getIntrinsicWidth();
            float intrinsicHeight2 = drawable2.getIntrinsicHeight();
            if (cVar.O == 0.0f) {
                cVar.O = intrinsicWidth2 / intrinsicHeight2;
            }
            int i13 = cVar.f15932w;
            float f12 = i13;
            float f13 = cVar.O;
            int i14 = (int) (f12 / f13);
            int i15 = cVar.f15933x;
            RectF rectF2 = cVar.M;
            if (i14 > i15) {
                float f14 = i15;
                int i16 = (int) (f13 * f14);
                int i17 = (i13 - i16) / 2;
                rectF2.set(i17, 0.0f, i16 + i17, f14);
            } else {
                int i18 = (i15 - i14) / 2;
                rectF2.set(0.0f, i18, f12, i14 + i18);
            }
            cVar.e(intrinsicWidth2, intrinsicHeight2);
            float fWidth = rectF2.width();
            float fHeight = rectF2.height();
            float fMax = Math.max(rectF2.width() / intrinsicWidth2, rectF2.height() / intrinsicHeight2);
            float f15 = ((fWidth - (intrinsicWidth2 * fMax)) / 2.0f) + rectF2.left;
            float f16 = ((fHeight - (intrinsicHeight2 * fMax)) / 2.0f) + rectF2.top;
            Matrix matrix = cVar.f15931v;
            matrix.reset();
            matrix.postScale(fMax, fMax);
            matrix.postTranslate(f15, f16);
            cVar.setImageMatrix(matrix);
            in.a aVar = cVar.Q;
            if (aVar != null) {
                ((UCropView) ((l) aVar).f9547e).f7315e.setTargetAspectRatio(cVar.O);
            }
            e eVar2 = cVar.f15934y;
            if (eVar2 != null) {
                ((hn.c) eVar2).d(cVar.getCurrentScale());
                e eVar3 = cVar.f15934y;
                float currentAngle = cVar.getCurrentAngle();
                TextView textView = ((UCropActivity) ((hn.c) eVar3).f10954b).S;
                if (textView != null) {
                    textView.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(currentAngle)));
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.y, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new ln.a(bitmap));
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        Matrix matrix2 = this.f15931v;
        matrix2.set(matrix);
        matrix2.mapPoints(this.f15928d, this.E);
        matrix2.mapPoints(this.f15929e, this.F);
    }

    public void setMaxBitmapSize(int i7) {
        this.I = i7;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            Log.w("TransformImageView", "Invalid ScaleType. Only ScaleType.MATRIX can be used");
        }
    }

    public void setTransformImageListener(e eVar) {
        this.f15934y = eVar;
    }
}
