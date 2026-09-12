package com.facebook.react.devsupport;

import android.app.Activity;
import androidx.core.view.WindowInsetsControllerCompat;
import com.facebook.react.modules.core.JavaTimerManager;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.swmansion.reanimated.keyboard.WindowsInsetsManager;
import com.swmansion.rnscreens.w;
import com.swmansion.rnscreens.y;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5170e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5171i;

    public /* synthetic */ e(Object obj, boolean z5, int i7) {
        this.f5169d = i7;
        this.f5171i = obj;
        this.f5170e = z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f5169d;
        boolean z5 = this.f5170e;
        Object obj = this.f5171i;
        switch (i7) {
            case 0:
                DebugOverlayController.setFpsDebugViewVisible$lambda$0(z5, (DebugOverlayController) obj);
                break;
            case 1:
                JavaTimerManager.setSendIdleEvents$lambda$7((JavaTimerManager) obj, z5);
                break;
            case 2:
                StatusBarModule.setHidden$lambda$3((Activity) obj, z5);
                break;
            case 3:
                ((WindowsInsetsManager) obj).lambda$updateWindowDecor$0(z5);
                break;
            case 4:
                y yVar = (y) obj;
                if (!z5) {
                    yVar.u(w.f7254e, yVar);
                    yVar.v(0.0f, false);
                } else {
                    yVar.u(w.f7253d, yVar);
                    yVar.v(1.0f, false);
                }
                break;
            case 5:
                WindowInsetsControllerCompat windowInsetsControllerCompat = (WindowInsetsControllerCompat) obj;
                if (!z5) {
                    windowInsetsControllerCompat.e(1);
                } else {
                    windowInsetsControllerCompat.a(1);
                }
                break;
            default:
                gc.w wVar = (gc.w) ((e4.l) obj).f7990i;
                int i10 = e0.f13788a;
                com.google.android.exoplayer2.c cVar = wVar.f9916d;
                if (cVar.a0 != z5) {
                    cVar.a0 = z5;
                    cVar.f5654l.e(23, new gc.t(z5, 1));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e(boolean z5, Object obj, int i7) {
        this.f5169d = i7;
        this.f5170e = z5;
        this.f5171i = obj;
    }
}
