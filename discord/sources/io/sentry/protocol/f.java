package io.sentry.protocol;

import com.facebook.react.devsupport.StackTraceHelper;
import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements y1 {
    public Float E;
    public Boolean F;
    public Boolean G;
    public e H;
    public Boolean I;
    public Long J;
    public Long K;
    public Long L;
    public Boolean M;
    public Long N;
    public Long O;
    public Long P;
    public Long Q;
    public Integer R;
    public Integer S;
    public Float T;
    public Integer U;
    public Date V;
    public TimeZone W;
    public String X;
    public String Y;
    public String Z;
    public Float a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Integer f12937b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Double f12938c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12939d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public String f12940d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12941e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public String f12942e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ConcurrentHashMap f12943f0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f12944i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f12945v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f12946w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f12947x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String[] f12948y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (com.facebook.imagepipeline.nativecode.c.r(this.f12939d, fVar.f12939d) && com.facebook.imagepipeline.nativecode.c.r(this.f12941e, fVar.f12941e) && com.facebook.imagepipeline.nativecode.c.r(this.f12944i, fVar.f12944i) && com.facebook.imagepipeline.nativecode.c.r(this.f12945v, fVar.f12945v) && com.facebook.imagepipeline.nativecode.c.r(this.f12946w, fVar.f12946w) && com.facebook.imagepipeline.nativecode.c.r(this.f12947x, fVar.f12947x) && Arrays.equals(this.f12948y, fVar.f12948y) && com.facebook.imagepipeline.nativecode.c.r(this.E, fVar.E) && com.facebook.imagepipeline.nativecode.c.r(this.F, fVar.F) && com.facebook.imagepipeline.nativecode.c.r(this.G, fVar.G) && this.H == fVar.H && com.facebook.imagepipeline.nativecode.c.r(this.I, fVar.I) && com.facebook.imagepipeline.nativecode.c.r(this.J, fVar.J) && com.facebook.imagepipeline.nativecode.c.r(this.K, fVar.K) && com.facebook.imagepipeline.nativecode.c.r(this.L, fVar.L) && com.facebook.imagepipeline.nativecode.c.r(this.M, fVar.M) && com.facebook.imagepipeline.nativecode.c.r(this.N, fVar.N) && com.facebook.imagepipeline.nativecode.c.r(this.O, fVar.O) && com.facebook.imagepipeline.nativecode.c.r(this.P, fVar.P) && com.facebook.imagepipeline.nativecode.c.r(this.Q, fVar.Q) && com.facebook.imagepipeline.nativecode.c.r(this.R, fVar.R) && com.facebook.imagepipeline.nativecode.c.r(this.S, fVar.S) && com.facebook.imagepipeline.nativecode.c.r(this.T, fVar.T) && com.facebook.imagepipeline.nativecode.c.r(this.U, fVar.U) && com.facebook.imagepipeline.nativecode.c.r(this.V, fVar.V) && com.facebook.imagepipeline.nativecode.c.r(this.X, fVar.X) && com.facebook.imagepipeline.nativecode.c.r(this.Y, fVar.Y) && com.facebook.imagepipeline.nativecode.c.r(this.Z, fVar.Z) && com.facebook.imagepipeline.nativecode.c.r(this.a0, fVar.a0) && com.facebook.imagepipeline.nativecode.c.r(this.f12937b0, fVar.f12937b0) && com.facebook.imagepipeline.nativecode.c.r(this.f12938c0, fVar.f12938c0) && com.facebook.imagepipeline.nativecode.c.r(this.f12940d0, fVar.f12940d0) && com.facebook.imagepipeline.nativecode.c.r(this.f12942e0, fVar.f12942e0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{this.f12939d, this.f12941e, this.f12944i, this.f12945v, this.f12946w, this.f12947x, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.a0, this.f12937b0, this.f12938c0, this.f12940d0, this.f12942e0}) * 31) + Arrays.hashCode(this.f12948y);
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        if (this.f12939d != null) {
            y2Var.v(StackTraceHelper.NAME_KEY).f(this.f12939d);
        }
        if (this.f12941e != null) {
            y2Var.v("manufacturer").f(this.f12941e);
        }
        if (this.f12944i != null) {
            y2Var.v("brand").f(this.f12944i);
        }
        if (this.f12945v != null) {
            y2Var.v("family").f(this.f12945v);
        }
        if (this.f12946w != null) {
            y2Var.v("model").f(this.f12946w);
        }
        if (this.f12947x != null) {
            y2Var.v("model_id").f(this.f12947x);
        }
        if (this.f12948y != null) {
            y2Var.v("archs").r(iLogger, this.f12948y);
        }
        if (this.E != null) {
            y2Var.v("battery_level").o(this.E);
        }
        if (this.F != null) {
            y2Var.v("charging").t(this.F);
        }
        if (this.G != null) {
            y2Var.v(q.a.ONLINE_EXTRAS_KEY).t(this.G);
        }
        if (this.H != null) {
            y2Var.v("orientation").r(iLogger, this.H);
        }
        if (this.I != null) {
            y2Var.v("simulator").t(this.I);
        }
        if (this.J != null) {
            y2Var.v("memory_size").o(this.J);
        }
        if (this.K != null) {
            y2Var.v("free_memory").o(this.K);
        }
        if (this.L != null) {
            y2Var.v("usable_memory").o(this.L);
        }
        if (this.M != null) {
            y2Var.v("low_memory").t(this.M);
        }
        if (this.N != null) {
            y2Var.v("storage_size").o(this.N);
        }
        if (this.O != null) {
            y2Var.v("free_storage").o(this.O);
        }
        if (this.P != null) {
            y2Var.v("external_storage_size").o(this.P);
        }
        if (this.Q != null) {
            y2Var.v("external_free_storage").o(this.Q);
        }
        if (this.R != null) {
            y2Var.v("screen_width_pixels").o(this.R);
        }
        if (this.S != null) {
            y2Var.v("screen_height_pixels").o(this.S);
        }
        if (this.T != null) {
            y2Var.v("screen_density").o(this.T);
        }
        if (this.U != null) {
            y2Var.v("screen_dpi").o(this.U);
        }
        if (this.V != null) {
            y2Var.v("boot_time").r(iLogger, this.V);
        }
        if (this.W != null) {
            y2Var.v("timezone").r(iLogger, this.W);
        }
        if (this.X != null) {
            y2Var.v(StackTraceHelper.ID_KEY).f(this.X);
        }
        if (this.Z != null) {
            y2Var.v("connection_type").f(this.Z);
        }
        if (this.a0 != null) {
            y2Var.v("battery_temperature").o(this.a0);
        }
        if (this.Y != null) {
            y2Var.v("locale").f(this.Y);
        }
        if (this.f12937b0 != null) {
            y2Var.v("processor_count").o(this.f12937b0);
        }
        if (this.f12938c0 != null) {
            y2Var.v("processor_frequency").o(this.f12938c0);
        }
        if (this.f12940d0 != null) {
            y2Var.v("cpu_description").f(this.f12940d0);
        }
        if (this.f12942e0 != null) {
            y2Var.v("chipset").f(this.f12942e0);
        }
        ConcurrentHashMap concurrentHashMap = this.f12943f0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                y2Var.v(str).r(iLogger, this.f12943f0.get(str));
            }
        }
        y2Var.l();
    }
}
