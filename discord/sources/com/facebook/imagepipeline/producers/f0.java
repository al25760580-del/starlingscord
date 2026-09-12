package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.imagepipeline.image.EncodedImage;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h0 f4982e;

    public /* synthetic */ f0(h0 h0Var, int i7) {
        this.f4981d = i7;
        this.f4982e = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EncodedImage encodedImage;
        int i7;
        switch (this.f4981d) {
            case 0:
                h0 h0Var = this.f4982e;
                long jUptimeMillis = SystemClock.uptimeMillis();
                synchronized (h0Var) {
                    encodedImage = h0Var.f4993e;
                    i7 = h0Var.f4994f;
                    h0Var.f4993e = null;
                    h0Var.f4994f = 0;
                    h0Var.f4995g = 3;
                    h0Var.f4997i = jUptimeMillis;
                    break;
                }
                try {
                    if (h0.d(encodedImage, i7)) {
                        h0Var.f4990b.a(encodedImage, i7);
                        break;
                    }
                    return;
                } finally {
                    EncodedImage.closeSafely(encodedImage);
                    h0Var.b();
                }
            default:
                h0 h0Var2 = this.f4982e;
                h0Var2.f4989a.execute(h0Var2.f4991c);
                return;
        }
    }
}
