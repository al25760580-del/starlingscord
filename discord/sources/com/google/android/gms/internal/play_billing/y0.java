package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a1 f6189d;

    @Override // java.lang.Runnable
    public final void run() {
        x0 x0Var;
        i0 i0Var;
        a1 a1Var = this.f6189d;
        if (a1Var == null || (x0Var = a1Var.E) == null) {
            return;
        }
        this.f6189d = null;
        if (x0Var.isDone()) {
            Object obj = a1Var.f6088d;
            if (obj == null) {
                if (x0Var.isDone()) {
                    if (p0.f6087y.E(a1Var, null, a1.h(x0Var))) {
                        a1.j(a1Var);
                        return;
                    }
                    return;
                }
                g0 g0Var = new g0(a1Var, x0Var);
                if (p0.f6087y.E(a1Var, null, g0Var)) {
                    try {
                        x0Var.b(g0Var, t0.f6134d);
                        return;
                    } catch (Throwable th2) {
                        try {
                            i0Var = new i0(th2);
                        } catch (Error | Exception unused) {
                            i0Var = i0.f6019b;
                        }
                        p0.f6087y.E(a1Var, g0Var, i0Var);
                        return;
                    }
                }
                obj = a1Var.f6088d;
            }
            if (obj instanceof f0) {
                x0Var.cancel(((f0) obj).f6004a);
                return;
            }
            return;
        }
        try {
            ScheduledFuture scheduledFuture = a1Var.F;
            a1Var.F = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th3) {
                    if (p0.f6087y.E(a1Var, null, new i0(new z0(str)))) {
                        a1.j(a1Var);
                    }
                    throw th3;
                }
            }
            if (p0.f6087y.E(a1Var, null, new i0(new z0(str + ": " + x0Var.toString())))) {
                a1.j(a1Var);
            }
            x0Var.cancel(true);
        } catch (Throwable th4) {
            x0Var.cancel(true);
            throw th4;
        }
    }
}
