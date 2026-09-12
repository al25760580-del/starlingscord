package hj;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10919b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(Unsafe unsafe, int i7) {
        super(unsafe);
        this.f10919b = i7;
    }

    @Override // hj.b1
    public final boolean c(long j, Object obj) {
        switch (this.f10919b) {
            case 0:
                if (c1.f10815g) {
                    if (c1.h(j, obj) == 0) {
                        return false;
                    }
                } else if (c1.i(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (c1.f10815g) {
                    if (c1.h(j, obj) == 0) {
                        return false;
                    }
                } else if (c1.i(j, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // hj.b1
    public final byte d(long j, Object obj) {
        switch (this.f10919b) {
            case 0:
                return c1.f10815g ? c1.h(j, obj) : c1.i(j, obj);
            default:
                return c1.f10815g ? c1.h(j, obj) : c1.i(j, obj);
        }
    }

    @Override // hj.b1
    public final double e(long j, Object obj) {
        switch (this.f10919b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(h(j, obj));
    }

    @Override // hj.b1
    public final float f(long j, Object obj) {
        switch (this.f10919b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(g(j, obj));
    }

    @Override // hj.b1
    public final void k(Object obj, long j, boolean z5) {
        switch (this.f10919b) {
            case 0:
                if (!c1.f10815g) {
                    c1.l(obj, j, z5 ? (byte) 1 : (byte) 0);
                } else {
                    c1.k(obj, j, z5 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!c1.f10815g) {
                    c1.l(obj, j, z5 ? (byte) 1 : (byte) 0);
                } else {
                    c1.k(obj, j, z5 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // hj.b1
    public final void l(Object obj, long j, double d6) {
        switch (this.f10919b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d6));
                break;
            default:
                o(obj, j, Double.doubleToLongBits(d6));
                break;
        }
    }

    @Override // hj.b1
    public final void m(Object obj, long j, float f2) {
        switch (this.f10919b) {
            case 0:
                n(Float.floatToIntBits(f2), j, obj);
                break;
            default:
                n(Float.floatToIntBits(f2), j, obj);
                break;
        }
    }

    @Override // hj.b1
    public final boolean r() {
        switch (this.f10919b) {
        }
        return false;
    }
}
