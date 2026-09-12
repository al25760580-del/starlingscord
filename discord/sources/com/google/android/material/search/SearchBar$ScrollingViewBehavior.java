package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import mg.f;

/* JADX INFO: loaded from: classes3.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout$ScrollingViewBehavior {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6415g;

    public SearchBar$ScrollingViewBehavior() {
        this.f6415g = false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior, v0.b
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        super.d(coordinatorLayout, view, view2);
        if (!this.f6415g && (view2 instanceof f)) {
            this.f6415g = true;
            f fVar = (f) view2;
            fVar.setBackgroundColor(0);
            fVar.setTargetElevation(0.0f);
        }
        return false;
    }

    public SearchBar$ScrollingViewBehavior(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6415g = false;
    }
}
