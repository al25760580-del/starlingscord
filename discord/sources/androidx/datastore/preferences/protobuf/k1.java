package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends m1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1882b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(Unsafe unsafe, int i7) {
        super(unsafe);
        this.f1882b = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final boolean c(long j, Object obj) {
        switch (this.f1882b) {
            case 0:
                if (n1.f1915h) {
                    if (n1.g(j, obj) == 0) {
                        return false;
                    }
                } else if (n1.h(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (n1.f1915h) {
                    if (n1.g(j, obj) == 0) {
                        return false;
                    }
                } else if (n1.h(j, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final byte d(long j, Object obj) {
        switch (this.f1882b) {
            case 0:
                return n1.f1915h ? n1.g(j, obj) : n1.h(j, obj);
            default:
                return n1.f1915h ? n1.g(j, obj) : n1.h(j, obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final double e(long j, Object obj) {
        switch (this.f1882b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(h(j, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final float f(long j, Object obj) {
        switch (this.f1882b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(g(j, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void k(Object obj, long j, boolean z5) {
        switch (this.f1882b) {
            case 0:
                if (!n1.f1915h) {
                    n1.l(obj, j, z5 ? (byte) 1 : (byte) 0);
                } else {
                    n1.k(obj, j, z5 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!n1.f1915h) {
                    n1.l(obj, j, z5 ? (byte) 1 : (byte) 0);
                } else {
                    n1.k(obj, j, z5 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void l(Object obj, long j, byte b10) {
        switch (this.f1882b) {
            case 0:
                if (!n1.f1915h) {
                    n1.l(obj, j, b10);
                } else {
                    n1.k(obj, j, b10);
                }
                break;
            default:
                if (!n1.f1915h) {
                    n1.l(obj, j, b10);
                } else {
                    n1.k(obj, j, b10);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void m(Object obj, long j, double d6) {
        switch (this.f1882b) {
            case 0:
                p(obj, j, Double.doubleToLongBits(d6));
                break;
            default:
                p(obj, j, Double.doubleToLongBits(d6));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void n(Object obj, long j, float f2) {
        switch (this.f1882b) {
            case 0:
                o(Float.floatToIntBits(f2), j, obj);
                break;
            default:
                o(Float.floatToIntBits(f2), j, obj);
                break;
        }
    }
}
