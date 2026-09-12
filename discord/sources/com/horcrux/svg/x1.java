package com.horcrux.svg;

/* JADX INFO: loaded from: classes3.dex */
public final class x1 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Runnable f6822e;

    public /* synthetic */ x1(int i7, Runnable runnable) {
        this.f6821d = i7;
        this.f6822e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6821d) {
            case 0:
                SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(((y1) this.f6822e).f6825d);
                if (svgViewByTag != null) {
                    svgViewByTag.setToDataUrlTask(new x1(2, this));
                    break;
                }
                break;
            case 1:
                y1 y1Var = (y1) this.f6822e;
                SvgViewModule.toDataURL(y1Var.f6825d, y1Var.f6826e, y1Var.f6827i, y1Var.f6828v + 1);
                break;
            default:
                y1 y1Var2 = (y1) ((x1) this.f6822e).f6822e;
                SvgViewModule.toDataURL(y1Var2.f6825d, y1Var2.f6826e, y1Var2.f6827i, y1Var2.f6828v + 1);
                break;
        }
    }
}
