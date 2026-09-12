package ke;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements q, DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DisplayManager f14396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public gc.o f14397e;

    public r(DisplayManager displayManager) {
        this.f14396d = displayManager;
    }

    @Override // ke.q
    public final void c(gc.o oVar) {
        this.f14397e = oVar;
        Handler handlerM = e0.m(null);
        DisplayManager displayManager = this.f14396d;
        displayManager.registerDisplayListener(this, handlerM);
        oVar.e(displayManager.getDisplay(0));
    }

    @Override // ke.q
    public final void g() {
        this.f14396d.unregisterDisplayListener(this);
        this.f14397e = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i7) {
        gc.o oVar = this.f14397e;
        if (oVar == null || i7 != 0) {
            return;
        }
        oVar.e(this.f14396d.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i7) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i7) {
    }
}
