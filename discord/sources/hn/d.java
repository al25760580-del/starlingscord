package hn;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import java.util.Locale;
import mn.e;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UCropActivity f10956e;

    public /* synthetic */ d(UCropActivity uCropActivity, int i7) {
        this.f10955d = i7;
        this.f10956e = uCropActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.f10955d;
        UCropActivity uCropActivity = this.f10956e;
        switch (i7) {
            case 0:
                GestureCropImageView gestureCropImageView = uCropActivity.J;
                AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) ((ViewGroup) view).getChildAt(0);
                if (view.isSelected()) {
                    if (aspectRatioTextView.f7319v != 0.0f) {
                        float f2 = aspectRatioTextView.f7321x;
                        float f7 = aspectRatioTextView.f7322y;
                        aspectRatioTextView.f7321x = f7;
                        aspectRatioTextView.f7322y = f2;
                        aspectRatioTextView.f7319v = f7 / f2;
                    }
                    aspectRatioTextView.e();
                }
                gestureCropImageView.setTargetAspectRatio(aspectRatioTextView.f7319v);
                uCropActivity.J.setImageToWrapCropBounds(true);
                if (!view.isSelected()) {
                    for (ViewGroup viewGroup : uCropActivity.R) {
                        viewGroup.setSelected(viewGroup == view);
                    }
                }
                break;
            case 1:
                GestureCropImageView gestureCropImageView2 = uCropActivity.J;
                float f10 = -gestureCropImageView2.getCurrentAngle();
                RectF rectF = gestureCropImageView2.M;
                float fCenterX = rectF.centerX();
                float fCenterY = rectF.centerY();
                Matrix matrix = gestureCropImageView2.f15931v;
                if (f10 != 0.0f) {
                    matrix.postRotate(f10, fCenterX, fCenterY);
                    gestureCropImageView2.setImageMatrix(matrix);
                    e eVar = gestureCropImageView2.f15934y;
                    if (eVar != null) {
                        float[] fArr = gestureCropImageView2.f15930i;
                        matrix.getValues(fArr);
                        double d6 = fArr[1];
                        matrix.getValues(fArr);
                        float f11 = (float) (-(Math.atan2(d6, fArr[0]) * 57.29577951308232d));
                        TextView textView = ((UCropActivity) ((c) eVar).f10954b).S;
                        if (textView != null) {
                            textView.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f11)));
                        }
                    }
                }
                uCropActivity.J.setImageToWrapCropBounds(true);
                break;
            case 2:
                GestureCropImageView gestureCropImageView3 = uCropActivity.J;
                float f12 = 90;
                RectF rectF2 = gestureCropImageView3.M;
                float fCenterX2 = rectF2.centerX();
                float fCenterY2 = rectF2.centerY();
                Matrix matrix2 = gestureCropImageView3.f15931v;
                if (f12 != 0.0f) {
                    matrix2.postRotate(f12, fCenterX2, fCenterY2);
                    gestureCropImageView3.setImageMatrix(matrix2);
                    e eVar2 = gestureCropImageView3.f15934y;
                    if (eVar2 != null) {
                        float[] fArr2 = gestureCropImageView3.f15930i;
                        matrix2.getValues(fArr2);
                        double d7 = fArr2[1];
                        matrix2.getValues(fArr2);
                        float f13 = (float) (-(Math.atan2(d7, fArr2[0]) * 57.29577951308232d));
                        TextView textView2 = ((UCropActivity) ((c) eVar2).f10954b).S;
                        if (textView2 != null) {
                            textView2.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f13)));
                        }
                    }
                }
                uCropActivity.J.setImageToWrapCropBounds(true);
                break;
            default:
                if (!view.isSelected()) {
                    int id2 = view.getId();
                    Bitmap.CompressFormat compressFormat = UCropActivity.f7277b0;
                    uCropActivity.g(id2);
                }
                break;
        }
    }
}
