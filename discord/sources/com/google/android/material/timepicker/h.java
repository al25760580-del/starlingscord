package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f6495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6496e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kh.i f6497i;

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.g] */
    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        kh.i iVar = new kh.i();
        this.f6497i = iVar;
        kh.j jVar = new kh.j(0.5f);
        kh.l lVarG = iVar.f14483e.f14463a.g();
        lVarG.f14494e = jVar;
        lVarG.f14495f = jVar;
        lVarG.f14496g = jVar;
        lVarG.f14497h = jVar;
        iVar.setShapeAppearanceModel(lVarG.a());
        this.f6497i.q(ColorStateList.valueOf(-1));
        setBackground(this.f6497i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kg.a.F, R.attr.materialClockStyle, 0);
        this.f6496e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f6495d = new Runnable() { // from class: com.google.android.material.timepicker.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f6494d.c();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.f6495d;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    public abstract void c();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        c();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.f6495d;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i7) {
        this.f6497i.q(ColorStateList.valueOf(i7));
    }
}
