package hn;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.widget.TextView;
import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.GestureCropImageView;
import java.util.Locale;
import mn.e;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements e, nn.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f10952c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10954b;

    public /* synthetic */ c() {
        this.f10953a = 4;
    }

    @Override // nn.a
    public void a() {
        switch (this.f10953a) {
            case 1:
                ((UCropActivity) this.f10954b).J.setImageToWrapCropBounds(true);
                break;
            default:
                ((UCropActivity) this.f10954b).J.setImageToWrapCropBounds(true);
                break;
        }
    }

    @Override // nn.a
    public void b(float f2) {
        switch (this.f10953a) {
            case 1:
                GestureCropImageView gestureCropImageView = ((UCropActivity) this.f10954b).J;
                float f7 = f2 / 42.0f;
                RectF rectF = gestureCropImageView.M;
                float fCenterX = rectF.centerX();
                float fCenterY = rectF.centerY();
                Matrix matrix = gestureCropImageView.f15931v;
                if (f7 != 0.0f) {
                    matrix.postRotate(f7, fCenterX, fCenterY);
                    gestureCropImageView.setImageMatrix(matrix);
                    e eVar = gestureCropImageView.f15934y;
                    if (eVar != null) {
                        float[] fArr = gestureCropImageView.f15930i;
                        matrix.getValues(fArr);
                        double d6 = fArr[1];
                        matrix.getValues(fArr);
                        float f10 = (float) (-(Math.atan2(d6, fArr[0]) * 57.29577951308232d));
                        TextView textView = ((UCropActivity) ((c) eVar).f10954b).S;
                        if (textView != null) {
                            textView.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f10)));
                        }
                    }
                }
                break;
            default:
                UCropActivity uCropActivity = (UCropActivity) this.f10954b;
                if (f2 <= 0.0f) {
                    GestureCropImageView gestureCropImageView2 = uCropActivity.J;
                    float maxScale = (((uCropActivity.J.getMaxScale() - uCropActivity.J.getMinScale()) / 15000.0f) * f2) + gestureCropImageView2.getCurrentScale();
                    RectF rectF2 = gestureCropImageView2.M;
                    float fCenterX2 = rectF2.centerX();
                    float fCenterY2 = rectF2.centerY();
                    if (maxScale >= gestureCropImageView2.getMinScale()) {
                        gestureCropImageView2.h(maxScale / gestureCropImageView2.getCurrentScale(), fCenterX2, fCenterY2);
                    }
                } else {
                    GestureCropImageView gestureCropImageView3 = uCropActivity.J;
                    float maxScale2 = (((uCropActivity.J.getMaxScale() - uCropActivity.J.getMinScale()) / 15000.0f) * f2) + gestureCropImageView3.getCurrentScale();
                    RectF rectF3 = gestureCropImageView3.M;
                    gestureCropImageView3.i(maxScale2, rectF3.centerX(), rectF3.centerY());
                }
                break;
        }
    }

    @Override // nn.a
    public void c() {
        switch (this.f10953a) {
            case 1:
                ((UCropActivity) this.f10954b).J.f();
                break;
            default:
                ((UCropActivity) this.f10954b).J.f();
                break;
        }
    }

    public void d(float f2) {
        TextView textView = ((UCropActivity) this.f10954b).T;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf((int) (f2 * 100.0f))));
        }
    }

    public /* synthetic */ c(UCropActivity uCropActivity, int i7) {
        this.f10953a = i7;
        this.f10954b = uCropActivity;
    }
}
