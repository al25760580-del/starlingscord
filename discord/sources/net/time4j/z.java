package net.time4j;

import java.io.InvalidObjectException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends xr.a {
    private static final long serialVersionUID = -4837430960549551204L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient BigDecimal f16798d;

    public z(String str, BigDecimal bigDecimal) {
        super(str);
        this.f16798d = bigDecimal;
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
        return this.f16798d;
    }

    @Override // xr.d
    public final Class getType() {
        return BigDecimal.class;
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
        return BigDecimal.ZERO;
    }

    @Override // xr.d
    public final boolean w() {
        return true;
    }
}
