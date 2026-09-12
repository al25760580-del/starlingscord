package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.messaging.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ComponentActivity.ReportFullyDrawnExecutor, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f716d = SystemClock.uptimeMillis() + ((long) 10000);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f717e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f718i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f719v;

    public a(ComponentActivity componentActivity) {
        this.f719v = componentActivity;
    }

    @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
    public final void Q(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f718i) {
            return;
        }
        this.f718i = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f717e = runnable;
        View decorView = this.f719v.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (!this.f718i) {
            decorView.postOnAnimation(new s(6, this));
        } else if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
    public final void g() {
        ComponentActivity componentActivity = this.f719v;
        componentActivity.getWindow().getDecorView().removeCallbacks(this);
        componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z5;
        Runnable runnable = this.f717e;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f716d) {
                this.f718i = false;
                this.f719v.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f717e = null;
        FullyDrawnReporter fullyDrawnReporter = this.f719v.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f706b) {
            z5 = fullyDrawnReporter.f707c;
        }
        if (z5) {
            this.f718i = false;
            this.f719v.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f719v.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
