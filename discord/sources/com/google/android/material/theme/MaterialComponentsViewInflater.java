package com.google.android.material.theme;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.r;
import androidx.appcompat.widget.s;
import bh.p;
import com.discord.R;
import com.facebook.imagepipeline.nativecode.c;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import gh.a;
import i.b0;
import nh.t;
import vg.b;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends b0 {
    @Override // i.b0
    public final r a(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    @Override // i.b0
    public final s b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // i.b0
    public final androidx.appcompat.widget.t c(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // i.b0
    public final c0 d(Context context, AttributeSet attributeSet) {
        a aVar = new a(oh.a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray typedArrayF = p.f(context2, attributeSet, kg.a.f14451x, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayF.hasValue(0)) {
            aVar.setButtonTintList(c.t(context2, typedArrayF, 0));
        }
        aVar.f10043x = typedArrayF.getBoolean(1, false);
        typedArrayF.recycle();
        return aVar;
    }

    @Override // i.b0
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
