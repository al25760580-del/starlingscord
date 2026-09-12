package com.swmansion.rnscreens;

import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f7176e;

    public /* synthetic */ d(ViewGroup viewGroup, int i7) {
        this.f7175d = i7;
        this.f7176e = viewGroup;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.f7175d) {
            case 0:
                e eVar = (e) this.f7176e;
                eVar.A0 = false;
                eVar.measure(View.MeasureSpec.makeMeasureSpec(eVar.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(eVar.getHeight(), Integer.MIN_VALUE));
                eVar.layout(eVar.getLeft(), eVar.getTop(), eVar.getRight(), eVar.getBottom());
                break;
            default:
                ScreenContainer screenContainer = (ScreenContainer) this.f7176e;
                screenContainer.isLayoutEnqueued = false;
                screenContainer.measure(View.MeasureSpec.makeMeasureSpec(screenContainer.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(screenContainer.getHeight(), 1073741824));
                screenContainer.layout(screenContainer.getLeft(), screenContainer.getTop(), screenContainer.getRight(), screenContainer.getBottom());
                break;
        }
    }
}
