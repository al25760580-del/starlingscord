package net.time4j.tz.model;

import java.io.Serializable;
import net.time4j.s0;
import net.time4j.x0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends d implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient byte f16754w;

    public g(s0 s0Var, int i7, l lVar, int i10) {
        super(i7, lVar, i10);
        this.f16754w = (byte) s0Var.a();
    }

    public abstract x0 b(int i7);

    public final boolean c(g gVar) {
        return this.f16750e.equals(gVar.f16750e) && this.f16749d == gVar.f16749d && this.f16751i == gVar.f16751i && this.f16752v == gVar.f16752v && this.f16754w == gVar.f16754w;
    }
}
