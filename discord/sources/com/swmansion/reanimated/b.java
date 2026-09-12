package com.swmansion.reanimated;

import android.view.ViewTreeObserver;
import com.discord.view.ReactScrollViewOverride;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7110e;

    public /* synthetic */ b(int i7, Object obj) {
        this.f7109d = i7;
        this.f7110e = obj;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        switch (this.f7109d) {
            case 0:
                ((DrawPassDetector) this.f7110e).lambda$new$1();
                break;
            default:
                ((ReactScrollViewOverride) this.f7110e).isDrawing = true;
                break;
        }
    }
}
