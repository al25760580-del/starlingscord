package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.discord.R;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends g2 implements q0 {
    public CharSequence Z;
    public l0 a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Rect f1056b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f1057c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final /* synthetic */ r0 f1058d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r0 r0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.f1058d0 = r0Var;
        this.f1056b0 = new Rect();
        this.L = r0Var;
        this.V = true;
        this.W.setFocusable(true);
        this.M = new m0(0, this);
    }

    @Override // androidx.appcompat.widget.q0
    public final CharSequence d() {
        return this.Z;
    }

    @Override // androidx.appcompat.widget.q0
    public final void f(CharSequence charSequence) {
        this.Z = charSequence;
    }

    @Override // androidx.appcompat.widget.q0
    public final void j(int i7) {
        this.f1057c0 = i7;
    }

    @Override // androidx.appcompat.widget.q0
    public final void k(int i7, int i10) {
        ViewTreeObserver viewTreeObserver;
        a0 a0Var = this.W;
        boolean zIsShowing = a0Var.isShowing();
        q();
        a0Var.setInputMethodMode(2);
        show();
        t1 t1Var = this.f990i;
        t1Var.setChoiceMode(1);
        t1Var.setTextDirection(i7);
        t1Var.setTextAlignment(i10);
        r0 r0Var = this.f1058d0;
        int selectedItemPosition = r0Var.getSelectedItemPosition();
        t1 t1Var2 = this.f990i;
        if (a0Var.isShowing() && t1Var2 != null) {
            t1Var2.setListSelectionHidden(false);
            t1Var2.setSelection(selectedItemPosition);
            if (t1Var2.getChoiceMode() != 0) {
                t1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = r0Var.getViewTreeObserver()) == null) {
            return;
        }
        i0 i0Var = new i0(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(i0Var);
        a0Var.setOnDismissListener(new n0(this, i0Var));
    }

    @Override // androidx.appcompat.widget.g2, androidx.appcompat.widget.q0
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.a0 = (l0) listAdapter;
    }

    public final void q() {
        int i7;
        r0 r0Var = this.f1058d0;
        Rect rect = r0Var.E;
        a0 a0Var = this.W;
        Drawable background = a0Var.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z5 = f4.f976a;
            i7 = r0Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i7 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = r0Var.getPaddingLeft();
        int paddingRight = r0Var.getPaddingRight();
        int width = r0Var.getWidth();
        int i10 = r0Var.f1092y;
        if (i10 == -2) {
            int iA = r0Var.a(this.a0, a0Var.getBackground());
            int i11 = (r0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i11) {
                iA = i11;
            }
            p(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i10 == -1) {
            p((width - paddingLeft) - paddingRight);
        } else {
            p(i10);
        }
        boolean z6 = f4.f976a;
        this.f993x = r0Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f992w) - this.f1057c0) + i7 : paddingLeft + this.f1057c0 + i7;
    }
}
