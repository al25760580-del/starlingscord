package com.horcrux.svg;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class i2 implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ VirtualViewManager f6732d;

    public i2(VirtualViewManager virtualViewManager) {
        this.f6732d = virtualViewManager;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (view instanceof VirtualView) {
            this.f6732d.invalidateSvgView((VirtualView) view);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        if (view instanceof VirtualView) {
            this.f6732d.invalidateSvgView((VirtualView) view);
        }
    }
}
