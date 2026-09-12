package io.sentry.android.core.internal.util;

import android.view.PixelCopy;
import android.view.View;
import io.sentry.android.replay.screenshot.PixelCopyStrategy;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements PixelCopy.OnPixelCopyFinishedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12312c;

    public /* synthetic */ j(int i7, Object obj, Object obj2) {
        this.f12310a = i7;
        this.f12311b = obj;
        this.f12312c = obj2;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i7) {
        switch (this.f12310a) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f12311b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f12312c;
                atomicBoolean.set(i7 == 0);
                countDownLatch.countDown();
                break;
            default:
                PixelCopyStrategy.capture$lambda$2((PixelCopyStrategy) this.f12311b, (View) this.f12312c, i7);
                break;
        }
    }
}
