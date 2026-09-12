package net.time4j;

import java.io.InvalidObjectException;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends a {
    private static final long serialVersionUID = 2055272540517425102L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Class f16621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Enum f16622e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient Enum f16623i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient int f16624v;

    public d0(String str, Class cls, Enum r5, Enum r6, int i7, char c8) {
        super(str);
        this.f16621d = cls;
        this.f16622e = r5;
        this.f16623i = r6;
        this.f16624v = i7;
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
        return this.f16623i;
    }

    @Override // xr.d
    public final Class getType() {
        return this.f16621d;
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
        return this.f16622e;
    }

    @Override // xr.d
    public final boolean w() {
        return false;
    }
}
