package net.time4j.tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import net.time4j.p1;
import net.time4j.s0;
import net.time4j.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends g {
    private static final long serialVersionUID = -946839310332554772L;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient byte f16755x;

    public h(s0 s0Var, p1 p1Var, int i7, l lVar, int i10) {
        super(s0Var, i7, lVar, i10);
        this.f16755x = (byte) p1Var.a();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(122, this);
    }

    @Override // net.time4j.tz.model.d
    public final int a() {
        return 122;
    }

    @Override // net.time4j.tz.model.g
    public final x0 b(int i7) {
        byte b10 = this.f16754w;
        int iT = xr.m.t(i7, b10);
        int iR = xr.m.r(i7, b10, iT) - this.f16755x;
        if (iR < 0) {
            iR += 7;
        }
        return x0.z(i7, b10, iT - iR, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f16755x == hVar.f16755x && c(hVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16754w * 37) + (this.f16755x * 17);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LastDayOfWeekPattern:[month=");
        sb2.append((int) this.f16754w);
        sb2.append(",day-of-week=");
        sb2.append(p1.d(this.f16755x));
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
