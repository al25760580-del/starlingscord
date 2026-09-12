package net.time4j;

import java.io.InvalidObjectException;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j0 f16647i = new j0(Long.MIN_VALUE, LongCompanionObject.MAX_VALUE, "DAY_OVERFLOW");
    private static final long serialVersionUID = 5930990958663061693L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Long f16648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Long f16649e;

    public j0(long j, long j5, String str) {
        super(str);
        this.f16648d = Long.valueOf(j);
        this.f16649e = Long.valueOf(j5);
    }

    private Object readResolve() throws InvalidObjectException {
        Object obj = b1.h0.get(name());
        if (obj != null) {
            return obj;
        }
        if (name().equals("DAY_OVERFLOW")) {
            return f16647i;
        }
        throw new InvalidObjectException(name());
    }

    @Override // xr.d
    public final Object a() {
        return this.f16649e;
    }

    @Override // xr.d
    public final Class getType() {
        return Long.class;
    }

    @Override // xr.d
    public final boolean i() {
        return false;
    }

    @Override // xr.d
    public final Object v() {
        return this.f16648d;
    }

    @Override // xr.d
    public final boolean w() {
        return true;
    }
}
