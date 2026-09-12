package net.time4j;

import java.io.InvalidObjectException;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends a {
    private static final long serialVersionUID = -1337148214680014674L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f16625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Integer f16626e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient Integer f16627i;

    public e0(String str, int i7, Integer num, Integer num2, char c8) {
        super(str);
        this.f16625d = i7;
        this.f16626e = num;
        this.f16627i = num2;
    }

    public static e0 m(char c8, int i7, int i10, int i11, String str) {
        return new e0(str, i7, Integer.valueOf(i10), Integer.valueOf(i11), c8);
    }

    private Object readResolve() throws InvalidObjectException {
        Object obj = x0.U.get(name());
        if (obj != null) {
            return obj;
        }
        throw new InvalidObjectException(name());
    }

    @Override // xr.d
    public final Object a() {
        return this.f16627i;
    }

    @Override // xr.d
    public final Class getType() {
        return Integer.class;
    }

    @Override // xr.d
    public final boolean i() {
        return true;
    }

    @Override // xr.a
    public final boolean l() {
        return true;
    }

    @Override // xr.d
    public final Object v() {
        return this.f16626e;
    }

    @Override // xr.d
    public final boolean w() {
        return false;
    }
}
