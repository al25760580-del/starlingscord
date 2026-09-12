package fh;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import com.discord.R;
import com.discord.js_watchdog.JSWatchdogManagerKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends s {
    public static final q2.a k = lg.a.f15072b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f9203l = {0, JSWatchdogManagerKt.FREEZE_CHECK_DELAY_MS, 3000, 4500};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float[] f9204m = {0.1f, 0.87f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g f9205n = new g(Float.class, "animationFraction", 2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g f9206o = new g(Float.class, "completeEndFraction", 3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObjectAnimator f9207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObjectAnimator f9208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f9209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f9210f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f9212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f9213i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9211g = 0;
    public c j = null;

    public j(Context context, k kVar) {
        this.f9210f = kVar;
        this.f9209e = io.sentry.config.a.T(context, R.attr.motionEasingStandardInterpolator, k);
    }

    @Override // fh.s
    public final void c() {
        ObjectAnimator objectAnimator = this.f9207c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // fh.s
    public final void i() {
        q();
        ObjectAnimator objectAnimator = this.f9207c;
        k kVar = this.f9210f;
        objectAnimator.setDuration((long) (kVar.f9225n * 6000.0f));
        this.f9208d.setDuration((long) (kVar.f9225n * 500.0f));
        this.f9211g = 0;
        ((p) ((ArrayList) this.f9257b).get(0)).f9243c = kVar.f9218e[0];
        this.f9213i = 0.0f;
    }

    @Override // fh.s
    public final void l(c cVar) {
        this.j = cVar;
    }

    @Override // fh.s
    public final void m() {
        ObjectAnimator objectAnimator = this.f9208d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (((t) this.f9256a).isVisible()) {
            this.f9208d.start();
        } else {
            c();
        }
    }

    @Override // fh.s
    public final void o() {
        q();
        this.f9211g = 0;
        ((p) ((ArrayList) this.f9257b).get(0)).f9243c = this.f9210f.f9218e[0];
        this.f9213i = 0.0f;
        this.f9207c.start();
    }

    @Override // fh.s
    public final void p() {
        this.j = null;
    }

    public final void q() {
        ObjectAnimator objectAnimator = this.f9207c;
        k kVar = this.f9210f;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f9205n, 0.0f, 1.0f);
            this.f9207c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (kVar.f9225n * 6000.0f));
            this.f9207c.setInterpolator(null);
            this.f9207c.setRepeatCount(-1);
            this.f9207c.addListener(new i(this, 0));
        }
        if (this.f9208d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f9206o, 0.0f, 1.0f);
            this.f9208d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (kVar.f9225n * 500.0f));
            this.f9208d.addListener(new i(this, 1));
        }
    }
}
