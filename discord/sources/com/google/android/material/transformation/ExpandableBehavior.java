package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import v0.b;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class ExpandableBehavior extends b {
    public ExpandableBehavior() {
    }

    @Override // v0.b
    public abstract boolean b(View view, View view2);

    @Override // v0.b
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // v0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i7) {
        if (!view.isLaidOut()) {
            List listD = coordinatorLayout.d(view);
            int size = listD.size();
            for (int i10 = 0; i10 < size; i10++) {
                b(view, (View) listD.get(i10));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
