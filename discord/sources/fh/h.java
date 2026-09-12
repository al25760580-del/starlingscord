package fh;

import android.animation.ObjectAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends s {
    public static final int[] k = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f9190l = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f9191m = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g f9192n = new g(Float.class, "animationFraction", 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g f9193o = new g(Float.class, "completeEndFraction", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObjectAnimator f9194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObjectAnimator f9195d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f9197f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f9199h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f9200i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9198g = 0;
    public c j = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q2.a f9196e = new q2.a(1);

    public h(k kVar) {
        this.f9197f = kVar;
    }

    @Override // fh.s
    public final void c() {
        ObjectAnimator objectAnimator = this.f9194c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // fh.s
    public final void i() {
        q();
        ObjectAnimator objectAnimator = this.f9194c;
        k kVar = this.f9197f;
        objectAnimator.setDuration((long) (kVar.f9225n * 5400.0f));
        this.f9195d.setDuration((long) (kVar.f9225n * 333.0f));
        this.f9198g = 0;
        ((p) ((ArrayList) this.f9257b).get(0)).f9243c = kVar.f9218e[0];
        this.f9200i = 0.0f;
    }

    @Override // fh.s
    public final void l(c cVar) {
        this.j = cVar;
    }

    @Override // fh.s
    public final void m() {
        ObjectAnimator objectAnimator = this.f9195d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (((t) this.f9256a).isVisible()) {
            this.f9195d.start();
        } else {
            c();
        }
    }

    @Override // fh.s
    public final void o() {
        q();
        this.f9198g = 0;
        ((p) ((ArrayList) this.f9257b).get(0)).f9243c = this.f9197f.f9218e[0];
        this.f9200i = 0.0f;
        this.f9194c.start();
    }

    @Override // fh.s
    public final void p() {
        this.j = null;
    }

    public final void q() {
        ObjectAnimator objectAnimator = this.f9194c;
        k kVar = this.f9197f;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f9192n, 0.0f, 1.0f);
            this.f9194c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (kVar.f9225n * 5400.0f));
            this.f9194c.setInterpolator(null);
            this.f9194c.setRepeatCount(-1);
            this.f9194c.addListener(new f(this, 0));
        }
        if (this.f9195d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f9193o, 0.0f, 1.0f);
            this.f9195d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (kVar.f9225n * 333.0f));
            this.f9195d.setInterpolator(this.f9196e);
            this.f9195d.addListener(new f(this, 1));
        }
    }
}
