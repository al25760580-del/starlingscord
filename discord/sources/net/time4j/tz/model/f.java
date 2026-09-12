package net.time4j.tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import net.time4j.s0;
import net.time4j.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends g {
    private static final long serialVersionUID = 3957240859230862745L;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient byte f16753x;

    public f(s0 s0Var, int i7, int i10, l lVar, int i11) {
        super(s0Var, i10, lVar, i11);
        xr.m.c(2000, s0Var.a(), i7);
        this.f16753x = (byte) i7;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(120, this);
    }

    @Override // net.time4j.tz.model.d
    public final int a() {
        return 120;
    }

    @Override // net.time4j.tz.model.g
    public final x0 b(int i7) {
        return x0.z(i7, this.f16754w, this.f16753x, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f16753x == fVar.f16753x && c(fVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16754w * 37) + this.f16753x;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("FixedDayPattern:[month=");
        sb2.append((int) this.f16754w);
        sb2.append(",day-of-month=");
        sb2.append((int) this.f16753x);
        sb2.append(",day-overflow=");
        sb2.append(this.f16749d);
        sb2.append(",time-of-day=");
        sb2.append(this.f16750e);
        sb2.append(",offset-indicator=");
        sb2.append(this.f16751i);
        sb2.append(",dst-offset=");
        return com.discord.chat.presentation.list.a.j(sb2, this.f16752v, ']');
    }
}
