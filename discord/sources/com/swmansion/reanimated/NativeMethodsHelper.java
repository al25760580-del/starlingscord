package com.swmansion.reanimated;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.RootViewUtil;
import com.facebook.react.views.scroll.ReactHorizontalScrollView;
import com.facebook.react.views.scroll.ReactScrollView;
import com.facebook.react.views.swiperefresh.ReactSwipeRefreshLayout;

/* JADX INFO: loaded from: classes3.dex */
public class NativeMethodsHelper {
    private static void computeBoundingBox(View view, int[] iArr) {
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        mapRectFromViewToWindowCoords(view, rectF);
        iArr[0] = Math.round(rectF.left);
        iArr[1] = Math.round(rectF.top);
        iArr[2] = Math.round(rectF.right - rectF.left);
        iArr[3] = Math.round(rectF.bottom - rectF.top);
    }

    private static ReactScrollView findScrollView(ReactSwipeRefreshLayout reactSwipeRefreshLayout) {
        for (int i7 = 0; i7 < reactSwipeRefreshLayout.getChildCount(); i7++) {
            if (reactSwipeRefreshLayout.getChildAt(i7) instanceof ReactScrollView) {
                return (ReactScrollView) reactSwipeRefreshLayout.getChildAt(i7);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$scrollTo$0(View view, int i7, int i10) {
        ((ReactHorizontalScrollView) view).smoothScrollTo(i7, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$scrollTo$1(View view, int i7, int i10) {
        ((ReactScrollView) view).smoothScrollTo(i7, i10);
    }

    private static void mapRectFromViewToWindowCoords(View view, RectF rectF) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
    }

    public static float[] measure(View view) {
        View view2 = (View) RootViewUtil.getRootView(view);
        if (view2 == null || view == null) {
            float[] fArr = new float[6];
            fArr[0] = -1234567.0f;
            return fArr;
        }
        int[] iArr = new int[4];
        computeBoundingBox(view2, iArr);
        int i7 = iArr[0];
        int i10 = iArr[1];
        computeBoundingBox(view, iArr);
        iArr[0] = iArr[0] - i7;
        iArr[1] = iArr[1] - i10;
        float[] fArr2 = new float[6];
        fArr2[0] = PixelUtil.toDIPFromPixel(view.getLeft());
        fArr2[1] = PixelUtil.toDIPFromPixel(view.getTop());
        for (int i11 = 2; i11 < 6; i11++) {
            fArr2[i11] = PixelUtil.toDIPFromPixel(iArr[i11 - 2]);
        }
        return fArr2;
    }

    public static void scrollTo(final View view, double d6, double d7, boolean z5) {
        final int iRound = Math.round(PixelUtil.toPixelFromDIP(d6));
        final int iRound2 = Math.round(PixelUtil.toPixelFromDIP(d7));
        boolean z6 = view instanceof ReactHorizontalScrollView;
        if (!z6) {
            if (view instanceof ReactSwipeRefreshLayout) {
                view = findScrollView((ReactSwipeRefreshLayout) view);
            }
            if (!(view instanceof ReactScrollView)) {
                Log.w("REANIMATED", "NativeMethodsHelper: Unhandled scroll view type - allowed only {ReactScrollView, ReactHorizontalScrollView}");
            }
        }
        if (!z5) {
            view.scrollTo(iRound, iRound2);
        } else if (z6) {
            final int i7 = 0;
            view.post(new Runnable() { // from class: com.swmansion.reanimated.c
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i7) {
                        case 0:
                            NativeMethodsHelper.lambda$scrollTo$0(view, iRound, iRound2);
                            break;
                        default:
                            NativeMethodsHelper.lambda$scrollTo$1(view, iRound, iRound2);
                            break;
                    }
                }
            });
        } else {
            final int i10 = 1;
            view.post(new Runnable() { // from class: com.swmansion.reanimated.c
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            NativeMethodsHelper.lambda$scrollTo$0(view, iRound, iRound2);
                            break;
                        default:
                            NativeMethodsHelper.lambda$scrollTo$1(view, iRound, iRound2);
                            break;
                    }
                }
            });
        }
    }
}
