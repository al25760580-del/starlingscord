package com.henninghall.date_picker.pickers;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import gk.i;
import ik.a;
import ik.b;
import ik.c;
import ik.d;
import ik.e;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public class AndroidNative extends i implements e {
    public static final /* synthetic */ int M0 = 0;
    public c G0;
    public int H0;
    public d I0;
    public boolean J0;
    public final Handler K0;
    public boolean L0;

    public AndroidNative(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H0 = 0;
        this.K0 = new Handler();
    }

    @Override // ik.e
    public View getView() {
        return this;
    }

    @Override // gk.i, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K0.removeCallbacksAndMessages(null);
    }

    public final void s() {
        this.K0.postDelayed(new a(this, 1), 500L);
    }

    @Override // ik.e
    public void setDividerColor(String str) {
        super.setDividerTint(Color.parseColor(str));
    }

    @Override // ik.e
    public void setOnValueChangeListenerInScrolling(d dVar) {
        this.I0 = dVar;
    }

    @Override // ik.e
    public void setOnValueChangedListener(c cVar) {
        this.G0 = cVar;
        super.setOnValueChangedListener(new u4.c(this, this));
        super.setOnScrollListener(new ue.i(this));
    }

    @Override // ik.e
    public void setTextAlign(Paint.Align align) {
    }

    @Override // ik.e
    public void setTextColor(String str) {
        int color = Color.parseColor(str);
        if (Build.VERSION.SDK_INT >= 29) {
            super.setTextColor(color);
            return;
        }
        try {
            Field declaredField = getClass().getSuperclass().getDeclaredField("mSelectorWheelPaint");
            declaredField.setAccessible(true);
            ((Paint) declaredField.get(this)).setColor(color);
        } catch (IllegalAccessException e10) {
            Log.w("setSelectedTextColor", e10);
        } catch (IllegalArgumentException e11) {
            Log.w("setSelectedTextColor", e11);
        } catch (NoSuchFieldException e12) {
            Log.w("setSelectedTextColor", e12);
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof EditText) {
                ((EditText) childAt).setTextColor(color);
            }
        }
        invalidate();
    }

    public final void t(int i7) {
        int i10;
        int value = getValue();
        if (i7 == value) {
            return;
        }
        int maxValue = getMaxValue();
        boolean wrapSelectorWheel = getWrapSelectorWheel();
        int i11 = maxValue + 1;
        int i12 = i7 - value;
        int i13 = i12 > 0 ? i12 - i11 : i11 + i12;
        if (!wrapSelectorWheel ? !((i10 = value + i12) <= maxValue && i10 >= 0) : Math.abs(i12) >= Math.abs(i13)) {
            i12 = i13;
        }
        int iAbs = Math.abs(i12);
        this.J0 = true;
        ((ue.i) this.G0).o();
        Handler handler = this.K0;
        handler.postDelayed(new a(this, 0), iAbs * 100);
        int i14 = 0;
        while (i14 < iAbs) {
            handler.postDelayed(new b(this, this, i12 > 0, i14 == iAbs + (-1)), i14 * 100);
            i14++;
        }
    }
}
