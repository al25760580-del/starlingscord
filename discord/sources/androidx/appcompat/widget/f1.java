package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f940l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f941m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f942a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f943b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f944c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f945d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f946e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f947f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f948g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f950i;
    public final Context j;
    public final c1 k;

    public f1(TextView textView) {
        this.f950i = textView;
        this.j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.k = new d1();
        } else {
            this.k = new c1();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i7 : iArr) {
                if (i7 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i7)) < 0) {
                    arrayList.add(Integer.valueOf(i7));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i10 = 0; i10 < size; i10++) {
                    iArr2[i10] = ((Integer) arrayList.get(i10)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f941m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static Object e(String str, Object obj, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f943b) {
                if (this.f950i.getMeasuredHeight() <= 0 || this.f950i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.k.b(this.f950i) ? 1048576 : (this.f950i.getMeasuredWidth() - this.f950i.getTotalPaddingLeft()) - this.f950i.getTotalPaddingRight();
                int height = (this.f950i.getHeight() - this.f950i.getCompoundPaddingBottom()) - this.f950i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f940l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f950i.getTextSize()) {
                            g(fC, 0);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            this.f943b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f947f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i7 = length - 1;
        int i10 = 0;
        int i11 = 1;
        while (i11 <= i7) {
            int i12 = (i11 + i7) / 2;
            int i13 = this.f947f[i12];
            TextView textView = this.f950i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f949h;
            if (textPaint == null) {
                this.f949h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f949h.set(textView.getPaint());
            this.f949h.setTextSize(i13);
            StaticLayout staticLayoutA = b1.a(charSequence, (Layout.Alignment) e("getLayoutAlignment", textView, Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.f950i, this.f949h, this.k);
            if ((maxLines == -1 || (staticLayoutA.getLineCount() <= maxLines && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == charSequence.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i14 = i12 + 1;
                i10 = i11;
                i11 = i14;
            } else {
                i10 = i12 - 1;
                i7 = i10;
            }
        }
        return this.f947f[i10];
    }

    public final boolean f() {
        return j() && this.f942a != 0;
    }

    public final void g(float f2, int i7) {
        Context context = this.j;
        float fApplyDimension = TypedValue.applyDimension(i7, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f950i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f943b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, null);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f942a == 1) {
            if (!this.f948g || this.f947f.length == 0) {
                int iFloor = ((int) Math.floor((this.f946e - this.f945d) / this.f944c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i7 = 0; i7 < iFloor; i7++) {
                    iArr[i7] = Math.round((i7 * this.f944c) + this.f945d);
                }
                this.f947f = b(iArr);
            }
            this.f943b = true;
        } else {
            this.f943b = false;
        }
        return this.f943b;
    }

    public final boolean i() {
        int[] iArr = this.f947f;
        int length = iArr.length;
        boolean z5 = length > 0;
        this.f948g = z5;
        if (z5) {
            this.f942a = 1;
            this.f945d = iArr[0];
            this.f946e = iArr[length - 1];
            this.f944c = -1.0f;
        }
        return z5;
    }

    public final boolean j() {
        return !(this.f950i instanceof AppCompatEditText);
    }

    public final void k(float f2, float f7, float f10) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f7 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f7 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f10 + "px) is less or equal to (0px)");
        }
        this.f942a = 1;
        this.f945d = f2;
        this.f946e = f7;
        this.f944c = f10;
        this.f948g = false;
    }
}
