package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.imagepipeline.nativecode.c;
import oh.a;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialTextView extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTextView(@NonNull Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (b.v(context2, com.discord.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = kg.a.B;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int iV = -1;
            for (int i7 = 0; i7 < 2 && iV < 0; i7++) {
                iV = c.v(context2, typedArrayObtainStyledAttributes, iArr2[i7], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iV != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, kg.a.A);
                Context context3 = getContext();
                int[] iArr3 = {2, 4};
                int iV2 = -1;
                for (int i10 = 0; i10 < 2 && iV2 < 0; i10++) {
                    iV2 = c.v(context3, typedArrayObtainStyledAttributes3, iArr3[i10], -1);
                }
                typedArrayObtainStyledAttributes3.recycle();
                if (iV2 >= 0) {
                    setLineHeight(iV2);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(@NonNull Context context, int i7) {
        super.setTextAppearance(context, i7);
        if (b.v(context, com.discord.R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i7, kg.a.A);
            Context context2 = getContext();
            int[] iArr = {2, 4};
            int iV = -1;
            for (int i10 = 0; i10 < 2 && iV < 0; i10++) {
                iV = c.v(context2, typedArrayObtainStyledAttributes, iArr[i10], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iV >= 0) {
                setLineHeight(iV);
            }
        }
    }
}
