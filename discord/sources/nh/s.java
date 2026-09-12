package nh;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends ArrayAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f16903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f16904e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f16905i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Context context, int i7, String[] strArr) {
        super(context, i7, strArr);
        this.f16905i = tVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        t tVar = this.f16905i;
        ColorStateList colorStateList2 = tVar.I;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f16904e = colorStateList;
        if (tVar.H != 0 && tVar.I != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{b1.c.c(tVar.I.getColorForState(iArr3, 0), tVar.H), b1.c.c(tVar.I.getColorForState(iArr2, 0), tVar.H), tVar.H});
        }
        this.f16903d = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i7, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            t tVar = this.f16905i;
            Drawable rippleDrawable = null;
            if (tVar.getText().toString().contentEquals(textView.getText()) && tVar.H != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(tVar.H);
                if (this.f16904e != null) {
                    colorDrawable.setTintList(this.f16903d);
                    rippleDrawable = new RippleDrawable(this.f16904e, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
