package net.time4j.tz.model;

import net.time4j.b1;
import net.time4j.q0;
import net.time4j.t;
import net.time4j.v;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient long f16749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient b1 f16750e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient l f16751i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient int f16752v;

    public d(int i7, l lVar, int i10) {
        v vVar;
        if (lVar == null) {
            throw new NullPointerException("Missing offset indicator.");
        }
        if (i10 != Integer.MAX_VALUE && (i10 < -64800 || i10 > 64800)) {
            throw new IllegalArgumentException(kk.b.h(i10, "DST out of range: "));
        }
        if (i7 == 86400) {
            this.f16749d = 0L;
            this.f16750e = b1.K;
        } else {
            b1 b1Var = b1.J;
            long j = i7;
            if (j == 0) {
                vVar = b1Var.f16608d < 24 ? new v(0L, b1Var) : vVar;
                this.f16749d = vVar.a();
                this.f16750e = vVar.b();
            } else {
                b1Var.getClass();
            }
            vVar = (v) q0.b(v.class, t.f16712i, b1Var, j);
            this.f16749d = vVar.a();
            this.f16750e = vVar.b();
        }
        this.f16751i = lVar;
        this.f16752v = i10 == Integer.MAX_VALUE ? 0 : i10;
    }

    public abstract int a();
}
