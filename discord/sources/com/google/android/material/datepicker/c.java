package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.discord.R;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kh.f f6335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kh.f f6336b;

    public c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(com.facebook.imagepipeline.nativecode.b.x(context, m.class.getCanonicalName(), R.attr.materialCalendarStyle).data, kg.a.f14446s);
        kh.f.e(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        kh.f.e(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        kh.f.e(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        kh.f.e(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListT = com.facebook.imagepipeline.nativecode.c.t(context, typedArrayObtainStyledAttributes, 7);
        this.f6335a = kh.f.e(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        kh.f.e(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f6336b = kh.f.e(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(colorStateListT.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
