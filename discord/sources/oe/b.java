package oe;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Thread {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f17248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17249e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CountDownLatch f17250i = new CountDownLatch(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f17251v = false;

    public b(a aVar, long j) {
        this.f17248d = new WeakReference(aVar);
        this.f17249e = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        a aVar;
        WeakReference weakReference = this.f17248d;
        try {
            if (this.f17250i.await(this.f17249e, TimeUnit.MILLISECONDS) || (aVar = (a) weakReference.get()) == null) {
                return;
            }
            aVar.b();
            this.f17251v = true;
        } catch (InterruptedException unused) {
            a aVar2 = (a) weakReference.get();
            if (aVar2 != null) {
                aVar2.b();
                this.f17251v = true;
            }
        }
    }
}
