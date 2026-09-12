package com.facebook.react.modules.core;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import androidx.profileinstaller.ProfileInstallerInitializer;
import i.j;
import java.util.Random;
import jm.c;
import vm.e;
import y2.d;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5254e;

    public /* synthetic */ b(int i7, Object obj) {
        this.f5253d = i7;
        this.f5254e = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.f5253d) {
            case 0:
                ReactChoreographer.frameCallback$lambda$1((ReactChoreographer) this.f5254e, j);
                break;
            case 1:
                ((Runnable) this.f5254e).run();
                break;
            case 2:
                c cVar = (c) this.f5254e;
                cVar.f13932f0 = null;
                cVar.h0 = false;
                cVar.k();
                break;
            case 3:
                e eVar = (e) this.f5254e;
                eVar.H = false;
                eVar.measure(View.MeasureSpec.makeMeasureSpec(eVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(eVar.getHeight(), 1073741824));
                eVar.layout(eVar.getLeft(), eVar.getTop(), eVar.getRight(), eVar.getBottom());
                break;
            default:
                (Build.VERSION.SDK_INT >= 28 ? d.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new j((Context) this.f5254e, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
        }
    }

    public /* synthetic */ b(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f5253d = 4;
        this.f5254e = context;
    }
}
