package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class AppCompatTextHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m3 f839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m3 f840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m3 f841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m3 f842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m3 f843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m3 f844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m3 f845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f1 f846i;
    public int j = 0;
    public int k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f847l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f848m;

    public AppCompatTextHelper(TextView textView) {
        this.f838a = textView;
        this.f846i = new f1(textView);
    }

    public static m3 c(Context context, w wVar, int i7) {
        ColorStateList colorStateListF;
        synchronized (wVar) {
            colorStateListF = wVar.f1148a.f(context, i7);
        }
        if (colorStateListF == null) {
            return null;
        }
        m3 m3Var = new m3();
        m3Var.f1033b = true;
        m3Var.f1034c = colorStateListF;
        return m3Var;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i7 >= 30) {
            m1.a.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i7 >= 30) {
            m1.a.a(editorInfo, text);
            return;
        }
        int i10 = editorInfo.initialSelStart;
        int i11 = editorInfo.initialSelEnd;
        int i12 = i10 > i11 ? i11 : i10;
        if (i10 <= i11) {
            i10 = i11;
        }
        int length = text.length();
        if (i12 < 0 || i10 > length) {
            m1.b.c(editorInfo, null, 0, 0);
            return;
        }
        int i13 = editorInfo.inputType & 4095;
        if (i13 == 129 || i13 == 225 || i13 == 18) {
            m1.b.c(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            m1.b.c(editorInfo, text, i12, i10);
            return;
        }
        int i14 = i10 - i12;
        int i15 = i14 > 1024 ? 0 : i14;
        int i16 = 2048 - i15;
        int iMin = Math.min(text.length() - i10, i16 - Math.min(i12, (int) (((double) i16) * 0.8d)));
        int iMin2 = Math.min(i12, i16 - iMin);
        int i17 = i12 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i17))) {
            i17++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i10 + iMin) - 1))) {
            iMin--;
        }
        int i18 = iMin2 + i15;
        m1.b.c(editorInfo, i15 != i14 ? TextUtils.concat(text.subSequence(i17, i17 + iMin2), text.subSequence(i10, iMin + i10)) : text.subSequence(i17, i18 + iMin + i17), iMin2, i18);
    }

    public final void a(Drawable drawable, m3 m3Var) {
        if (drawable == null || m3Var == null) {
            return;
        }
        w.e(drawable, m3Var, this.f838a.getDrawableState());
    }

    public final void b() {
        m3 m3Var = this.f839b;
        TextView textView = this.f838a;
        if (m3Var != null || this.f840c != null || this.f841d != null || this.f842e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f839b);
            a(compoundDrawables[1], this.f840c);
            a(compoundDrawables[2], this.f841d);
            a(compoundDrawables[3], this.f842e);
        }
        if (this.f843f == null && this.f844g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f843f);
        a(compoundDrawablesRelative[2], this.f844g);
    }

    public final ColorStateList d() {
        m3 m3Var = this.f845h;
        if (m3Var != null) {
            return (ColorStateList) m3Var.f1034c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        m3 m3Var = this.f845h;
        if (m3Var != null) {
            return (PorterDuff.Mode) m3Var.f1035d;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:228:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:230:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:233:0x03b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:234:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:236:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:238:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:240:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:243:? A[RETURN, SYNTHETIC] */
    public final void f(AttributeSet attributeSet, int i7) {
        boolean z5;
        boolean z6;
        String string;
        String string2;
        int i10;
        float dimensionPixelSize;
        int i11;
        ColorStateList colorStateList;
        int resourceId;
        int i12;
        int resourceId2;
        TextView textView = this.f838a;
        Context context = textView.getContext();
        w wVarA = w.a();
        int[] iArr = h.a.f10260h;
        e4.m mVarE = e4.m.E(context, attributeSet, iArr, i7);
        androidx.core.view.u0.o(textView, textView.getContext(), iArr, attributeSet, (TypedArray) mVarE.f7994i, i7, 0);
        TypedArray typedArray = (TypedArray) mVarE.f7994i;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f839b = c(context, wVarA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f840c = c(context, wVarA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f841d = c(context, wVarA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f842e = c(context, wVarA, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f843f = c(context, wVarA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f844g = c(context, wVarA, typedArray.getResourceId(6, 0));
        }
        mVarE.H();
        boolean z7 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = h.a.f10274x;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            e4.m mVar = new e4.m(context, typedArrayObtainStyledAttributes);
            if (z7 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z5 = false;
                z6 = false;
            } else {
                z6 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z5 = true;
            }
            n(context, mVar);
            int i13 = Build.VERSION.SDK_INT;
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = (i13 < 26 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            mVar.H();
        } else {
            z5 = false;
            z6 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i7, 0);
        e4.m mVar2 = new e4.m(context, typedArrayObtainStyledAttributes2);
        if (!z7 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z6 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z5 = true;
        }
        boolean z10 = z6;
        int i14 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (i14 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i14 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, mVar2);
        mVar2.H();
        if (!z7 && z5) {
            textView.setAllCaps(z10);
        }
        Typeface typeface = this.f847l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            w0.d(textView, string);
        }
        if (string2 != null) {
            v0.b(textView, v0.a(string2));
        }
        f1 f1Var = this.f846i;
        Context context2 = f1Var.j;
        int[] iArr3 = h.a.f10261i;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i7, 0);
        TextView textView2 = f1Var.f950i;
        androidx.core.view.u0.o(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i7, 0);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            f1Var.f942a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i15 = 0; i15 < length; i15++) {
                    iArr4[i15] = typedArrayObtainTypedArray.getDimensionPixelSize(i15, -1);
                }
                f1Var.f947f = f1.b(iArr4);
                f1Var.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!f1Var.j()) {
            f1Var.f942a = 0;
        } else if (f1Var.f942a == 1) {
            if (!f1Var.f948g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i12 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i12 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i12, 112.0f, displayMetrics);
                }
                float f2 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                f1Var.k(dimension2, f2, dimension);
            }
            f1Var.h();
        }
        if (f4.f978c && f1Var.f942a != 0) {
            int[] iArr5 = f1Var.f947f;
            if (iArr5.length > 0) {
                if (w0.a(textView) != -1.0f) {
                    w0.b(textView, Math.round(f1Var.f945d), Math.round(f1Var.f946e), Math.round(f1Var.f944c), 0);
                } else {
                    w0.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId4 != -1 ? wVarA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? wVarA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? wVarA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? wVarA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? wVarA.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? wVarA.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = y0.b.c(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(n1.c(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i10 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                int i16 = typedValuePeekValue.data;
                int i17 = i16 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i16);
                i11 = i17;
                i10 = -1;
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != i10) {
                androidx.core.widget.h.b(dimensionPixelSize2, textView);
            }
            if (dimensionPixelSize3 != i10) {
                androidx.core.widget.h.c(dimensionPixelSize3, textView);
            }
            if (dimensionPixelSize != -1.0f) {
                if (i11 == i10) {
                    androidx.core.widget.h.d((int) dimensionPixelSize, textView);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    a2.a.m(textView, i11, dimensionPixelSize);
                } else {
                    androidx.core.widget.h.d(Math.round(TypedValue.applyDimension(i11, dimensionPixelSize, textView.getResources().getDisplayMetrics())), textView);
                }
            }
        }
        i10 = -1;
        dimensionPixelSize = -1.0f;
        i11 = i10;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i10) {
            androidx.core.widget.h.b(dimensionPixelSize2, textView);
        }
        if (dimensionPixelSize3 != i10) {
            androidx.core.widget.h.c(dimensionPixelSize3, textView);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i11 == i10) {
                androidx.core.widget.h.d((int) dimensionPixelSize, textView);
            } else if (Build.VERSION.SDK_INT >= 34) {
                a2.a.m(textView, i11, dimensionPixelSize);
            } else {
                androidx.core.widget.h.d(Math.round(TypedValue.applyDimension(i11, dimensionPixelSize, textView.getResources().getDisplayMetrics())), textView);
            }
        }
    }

    public final void g(Context context, int i7) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i7, h.a.f10274x);
        e4.m mVar = new e4.m(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f838a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, mVar);
        if (i10 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            w0.d(textView, string);
        }
        mVar.H();
        Typeface typeface = this.f847l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i7, int i10, int i11, int i12) {
        f1 f1Var = this.f846i;
        if (f1Var.j()) {
            DisplayMetrics displayMetrics = f1Var.j.getResources().getDisplayMetrics();
            f1Var.k(TypedValue.applyDimension(i12, i7, displayMetrics), TypedValue.applyDimension(i12, i10, displayMetrics), TypedValue.applyDimension(i12, i11, displayMetrics));
            if (f1Var.h()) {
                f1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i7) {
        f1 f1Var = this.f846i;
        if (f1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i7 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = f1Var.j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArrCopyOf[i10] = Math.round(TypedValue.applyDimension(i7, iArr[i10], displayMetrics));
                    }
                }
                f1Var.f947f = f1.b(iArrCopyOf);
                if (!f1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                f1Var.f948g = false;
            }
            if (f1Var.h()) {
                f1Var.a();
            }
        }
    }

    public final void k(int i7) {
        f1 f1Var = this.f846i;
        if (f1Var.j()) {
            if (i7 == 0) {
                f1Var.f942a = 0;
                f1Var.f945d = -1.0f;
                f1Var.f946e = -1.0f;
                f1Var.f944c = -1.0f;
                f1Var.f947f = new int[0];
                f1Var.f943b = false;
                return;
            }
            if (i7 != 1) {
                throw new IllegalArgumentException(kk.b.h(i7, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = f1Var.j.getResources().getDisplayMetrics();
            f1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (f1Var.h()) {
                f1Var.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.f845h == null) {
            this.f845h = new m3();
        }
        m3 m3Var = this.f845h;
        m3Var.f1034c = colorStateList;
        m3Var.f1033b = colorStateList != null;
        this.f839b = m3Var;
        this.f840c = m3Var;
        this.f841d = m3Var;
        this.f842e = m3Var;
        this.f843f = m3Var;
        this.f844g = m3Var;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.f845h == null) {
            this.f845h = new m3();
        }
        m3 m3Var = this.f845h;
        m3Var.f1035d = mode;
        m3Var.f1032a = mode != null;
        this.f839b = m3Var;
        this.f840c = m3Var;
        this.f841d = m3Var;
        this.f842e = m3Var;
        this.f843f = m3Var;
        this.f844g = m3Var;
    }

    public final void n(Context context, e4.m mVar) {
        String string;
        int i7 = this.j;
        TypedArray typedArray = (TypedArray) mVar.f7994i;
        this.j = typedArray.getInt(2, i7);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int i11 = typedArray.getInt(11, -1);
            this.k = i11;
            if (i11 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f848m = false;
                int i12 = typedArray.getInt(1, 1);
                if (i12 == 1) {
                    this.f847l = Typeface.SANS_SERIF;
                    return;
                } else if (i12 == 2) {
                    this.f847l = Typeface.SERIF;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f847l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f847l = null;
        int i13 = typedArray.hasValue(12) ? 12 : 10;
        int i14 = this.k;
        int i15 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceZ = mVar.z(i13, this.j, new t0(this, i14, i15, new WeakReference(this.f838a)));
                if (typefaceZ != null) {
                    if (i10 < 28 || this.k == -1) {
                        this.f847l = typefaceZ;
                    } else {
                        this.f847l = x0.a(Typeface.create(typefaceZ, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.f848m = this.f847l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f847l != null || (string = typedArray.getString(i13)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.f847l = Typeface.create(string, this.j);
        } else {
            this.f847l = x0.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
