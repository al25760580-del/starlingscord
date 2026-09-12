package net.time4j.tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import net.time4j.p1;
import net.time4j.s0;
import net.time4j.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends g {
    private static final long serialVersionUID = -7354650946442523175L;
    public final transient boolean E;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient byte f16747x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final transient byte f16748y;

    public c(s0 s0Var, int i7, p1 p1Var, int i10, l lVar, int i11, boolean z5) {
        super(s0Var, i10, lVar, i11);
        xr.m.c(2000, s0Var.a(), i7);
        this.f16747x = (byte) i7;
        this.f16748y = (byte) p1Var.a();
        this.E = z5;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(121, this);
    }

    @Override // net.time4j.tz.model.d
    public final int a() {
        return 121;
    }

    @Override // net.time4j.tz.model.g
    public final x0 b(int i7) {
        byte b10 = this.f16754w;
        byte b11 = this.f16747x;
        int iR = xr.m.r(i7, b10, b11);
        int i10 = 1;
        x0 x0VarZ = x0.z(i7, b10, b11, true);
        byte b12 = this.f16748y;
        if (iR == b12) {
            return x0VarZ;
        }
        int i11 = iR - b12;
        if (this.E) {
            i11 = -i11;
        } else {
            i10 = -1;
        }
        if (i11 < 0) {
            i11 += 7;
        }
        return (x0) x0VarZ.l(i11 * i10, net.time4j.m.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f16747x == cVar.f16747x && this.f16748y == cVar.f16748y && this.E == cVar.E && c(cVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f16754w * 37) + this.f16748y) * 17) + this.f16747x + (this.E ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("DayOfWeekInMonthPattern:[month=");
        sb2.append((int) this.f16754w);
        sb2.append(",dayOfMonth=");
        sb2.append((int) this.f16747x);
        sb2.append(",dayOfWeek=");
        sb2.append(p1.d(this.f16748y));
        sb2.append(",day-overflow=");
        sb2.append(this.f16749d);
        sb2.append(",time-of-day=");
        sb2.append(this.f16750e);
        sb2.append(",offset-indicator=");
        sb2.append(this.f16751i);
        sb2.append(",dst-offset=");
        sb2.append(this.f16752v);
        sb2.append(",after=");
        sb2.append(this.E);
        sb2.append(']');
        return sb2.toString();
    }
}
