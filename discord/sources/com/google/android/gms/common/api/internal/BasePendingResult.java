package com.google.android.gms.common.api.internal;

import a.a;
import af.w;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import hs.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import ye.l;
import ye.m;
import ye.n;
import ze.d;
import ze.o;

/* JADX INFO: loaded from: classes3.dex */
@KeepName
public abstract class BasePendingResult<R extends n> extends a {
    static final ThreadLocal zaa = new c(10);

    @NonNull
    protected final d zab;

    @NonNull
    protected final WeakReference zac;
    private n zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private final Object zae = new Object();
    private final CountDownLatch zaf = new CountDownLatch(1);
    private final ArrayList zag = new ArrayList();
    private final AtomicReference zai = new AtomicReference();
    private boolean zaq = false;

    public BasePendingResult(l lVar) {
        this.zab = new d(lVar != null ? ((o) lVar).f23958b.f23306f : Looper.getMainLooper(), 1);
        this.zac = new WeakReference(lVar);
    }

    public abstract n E(Status status);

    public final void addStatusListener(@NonNull m mVar) {
        w.a("Callback cannot be null.", mVar != null);
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    mVar.a(this.zak);
                } else {
                    this.zag.add(mVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a.a
    @NonNull
    @ResultIgnorabilityUnspecified
    public final R await(long j, @NonNull TimeUnit timeUnit) {
        R r5;
        if (j > 0) {
            w.f("await must not be called on the UI thread when time is greater than zero.");
        }
        w.i("Result has already been consumed.", !this.zal);
        try {
            if (!this.zaf.await(j, timeUnit)) {
                forceFailureUnlessReady(Status.E);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f5934x);
        }
        w.i("Result is not ready.", isReady());
        synchronized (this.zae) {
            w.i("Result has already been consumed.", !this.zal);
            w.i("Result is not ready.", isReady());
            r5 = (R) this.zaj;
            this.zaj = null;
            this.zal = true;
        }
        if (this.zai.getAndSet(null) != null) {
            throw new ClassCastException();
        }
        w.g(r5);
        return r5;
    }

    @Deprecated
    public final void forceFailureUnlessReady(@NonNull Status status) {
        synchronized (this.zae) {
            try {
                if (!isReady()) {
                    setResult(E(status));
                    this.zan = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setResult(@NonNull R r5) {
        synchronized (this.zae) {
            try {
                if (this.zan || this.zam) {
                    zal(r5);
                    return;
                }
                isReady();
                w.i("Results have already been set", !isReady());
                w.i("Result has already been consumed", !this.zal);
                this.zaj = r5;
                this.zak = r5.a();
                this.zaf.countDown();
                ArrayList arrayList = this.zag;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((m) arrayList.get(i7)).a(this.zak);
                }
                this.zag.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zak() {
        boolean z5 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z5 = false;
        }
        this.zaq = z5;
    }

    public static void zal(n nVar) {
    }
}
