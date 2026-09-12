package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f4688b = new o(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f4689c = new o(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f4690d = new o(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o f4691e = new o(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o f4692f = new o(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o f4693g = new o(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o f4694h = new o(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o f4695i = new o(7);
    public static final o j = new o(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4696a;

    public /* synthetic */ o(int i7) {
        this.f4696a = i7;
    }

    @Override // com.facebook.drawee.drawable.n
    public final void getTransformImpl(Matrix matrix, Rect rect, int i7, int i10, float f2, float f7, float f10, float f11) {
        float fWidth;
        float fHeight;
        float fMax;
        float fMax2;
        switch (this.f4696a) {
            case 0:
                matrix.setTranslate((int) (((rect.width() - i7) * 0.5f) + rect.left + 0.5f), (int) (((rect.height() - i10) * 0.5f) + rect.top + 0.5f));
                break;
            case 1:
                if (f11 > f10) {
                    fWidth = ((rect.width() - (i7 * f11)) * 0.5f) + rect.left;
                    fHeight = rect.top;
                    f10 = f11;
                } else {
                    fWidth = rect.left;
                    fHeight = ((rect.height() - (i10 * f10)) * 0.5f) + rect.top;
                }
                matrix.setScale(f10, f10);
                matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
                break;
            case 2:
                float fMin = Math.min(Math.min(f10, f11), 1.0f);
                float fWidth2 = ((rect.width() - (i7 * fMin)) * 0.5f) + rect.left;
                float fHeight2 = ((rect.height() - (i10 * fMin)) * 0.5f) + rect.top;
                matrix.setScale(fMin, fMin);
                matrix.postTranslate((int) (fWidth2 + 0.5f), (int) (fHeight2 + 0.5f));
                break;
            case 3:
                float fMin2 = Math.min(f10, f11);
                float f12 = rect.left;
                float fHeight3 = (rect.height() - (i10 * fMin2)) + rect.top;
                matrix.setScale(fMin2, fMin2);
                matrix.postTranslate((int) (f12 + 0.5f), (int) (fHeight3 + 0.5f));
                break;
            case 4:
                float fMin3 = Math.min(f10, f11);
                float fWidth3 = ((rect.width() - (i7 * fMin3)) * 0.5f) + rect.left;
                float fHeight4 = ((rect.height() - (i10 * fMin3)) * 0.5f) + rect.top;
                matrix.setScale(fMin3, fMin3);
                matrix.postTranslate((int) (fWidth3 + 0.5f), (int) (fHeight4 + 0.5f));
                break;
            case 5:
                float fMin4 = Math.min(f10, f11);
                float fWidth4 = (rect.width() - (i7 * fMin4)) + rect.left;
                float fHeight5 = (rect.height() - (i10 * fMin4)) + rect.top;
                matrix.setScale(fMin4, fMin4);
                matrix.postTranslate((int) (fWidth4 + 0.5f), (int) (fHeight5 + 0.5f));
                break;
            case 6:
                float fMin5 = Math.min(f10, f11);
                float f13 = rect.left;
                float f14 = rect.top;
                matrix.setScale(fMin5, fMin5);
                matrix.postTranslate((int) (f13 + 0.5f), (int) (f14 + 0.5f));
                break;
            case 7:
                float f15 = rect.left;
                float f16 = rect.top;
                matrix.setScale(f10, f11);
                matrix.postTranslate((int) (f15 + 0.5f), (int) (f16 + 0.5f));
                break;
            default:
                if (f11 > f10) {
                    float f17 = i7 * f11;
                    fMax = Math.max(Math.min((rect.width() * 0.5f) - (f2 * f17), 0.0f), rect.width() - f17) + rect.left;
                    fMax2 = rect.top;
                    f10 = f11;
                } else {
                    fMax = rect.left;
                    float f18 = i10 * f10;
                    fMax2 = Math.max(Math.min((rect.height() * 0.5f) - (f7 * f18), 0.0f), rect.height() - f18) + rect.top;
                }
                matrix.setScale(f10, f10);
                matrix.postTranslate((int) (fMax + 0.5f), (int) (fMax2 + 0.5f));
                break;
        }
    }

    public final String toString() {
        switch (this.f4696a) {
            case 0:
                return "center";
            case 1:
                return "center_crop";
            case 2:
                return "center_inside";
            case 3:
                return "fit_bottom_start";
            case 4:
                return "fit_center";
            case 5:
                return "fit_end";
            case 6:
                return "fit_start";
            case 7:
                return "fit_xy";
            default:
                return "focus_crop";
        }
    }
}
