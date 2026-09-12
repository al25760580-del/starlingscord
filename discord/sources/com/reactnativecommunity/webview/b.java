package com.reactnativecommunity.webview;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f7031e;

    public /* synthetic */ b(ViewGroup viewGroup, int i7) {
        this.f7030d = i7;
        this.f7031e = viewGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        switch (this.f7030d) {
            case 0:
                c cVar = (c) this.f7031e;
                if (view != null) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(cVar.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(cVar.getMeasuredHeight(), 1073741824));
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                break;
            default:
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = ((CoordinatorLayout) this.f7031e).M;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                }
                break;
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        switch (this.f7030d) {
            case 0:
                break;
            default:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f7031e;
                coordinatorLayout.j(2);
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.M;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                }
                break;
        }
    }

    private final void a(View view, View view2) {
    }
}
