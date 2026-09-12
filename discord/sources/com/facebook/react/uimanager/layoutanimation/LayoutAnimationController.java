package com.facebook.react.uimanager.layoutanimation;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class LayoutAnimationController {
    public void applyLayoutUpdate(View view, int i7, int i10, int i11, int i12) {
    }

    public void deleteView(View view, LayoutAnimationListener layoutAnimationListener) {
        layoutAnimationListener.onAnimationEnd();
    }

    public boolean hasLayoutAnimation() {
        return false;
    }

    public void onAnimationFinished(LayoutAnimationListener layoutAnimationListener) {
    }

    public void reset() {
    }

    public void setLayoutAnimationDestroyListener(LayoutAnimationListener layoutAnimationListener) {
    }

    public boolean shouldAnimateLayout(View view) {
        return false;
    }
}
