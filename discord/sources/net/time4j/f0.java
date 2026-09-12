package net.time4j;

import java.io.InvalidObjectException;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends b {
    private static final long serialVersionUID = -1337148214680014674L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f16631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Integer f16632e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient Integer f16633i;

    public f0(String str, int i7, Integer num, Integer num2, char c8) {
        super(str);
        this.f16631d = i7;
        this.f16632e = num;
        this.f16633i = num2;
    }

    public static f0 m(String str, boolean z5) {
        return new f0(str, z5 ? 2 : 1, 1, Integer.valueOf(z5 ? 24 : 12), z5 ? 'k' : 'h');
    }

    public static f0 n(char c8, int i7, int i10, String str) {
        return new f0(str, i7, 0, Integer.valueOf(i10), c8);
    }

    private Object readResolve() throws InvalidObjectException {
        Object obj = b1.h0.get(name());
        if (obj != null) {
            return obj;
        }
        throw new InvalidObjectException(name());
    }

    @Override // xr.d
    public final Object a() {
        return this.f16633i;
    }

    @Override // xr.d
    public final Class getType() {
        return Integer.class;
    }

    @Override // xr.d
    public final boolean i() {
        return false;
    }

    @Override // xr.a
    public final boolean l() {
        return true;
    }

    @Override // xr.d
    public final Object v() {
        return this.f16632e;
    }

    @Override // xr.d
    public final boolean w() {
        return true;
    }
}
