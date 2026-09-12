package sp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import vp.n;
import vp.q;
import vp.u;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends vp.i implements u {
    public List E;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20458e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20459i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f20460v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f20461w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h f20462x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f20463y;

    public static g g() {
        g gVar = new g();
        gVar.f20459i = 1;
        gVar.f20461w = "";
        gVar.f20462x = h.NONE;
        List list = Collections.EMPTY_LIST;
        gVar.f20463y = list;
        gVar.E = list;
        return gVar;
    }

    @Override // vp.i
    public final vp.a c() {
        i iVarF = f();
        iVarF.b();
        return iVarF;
    }

    public final Object clone() {
        g gVarG = g();
        gVarG.h(f());
        return gVarG;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // vp.i
    public final vp.i d(vp.e eVar, vp.g gVar) throws Throwable {
        i iVar = null;
        try {
            try {
                i.K.getClass();
                h(new i(eVar));
                return this;
            } catch (q e10) {
                i iVar2 = (i) e10.f21916d;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    iVar = iVar2;
                    if (iVar != null) {
                        h(iVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (iVar != null) {
                h(iVar);
            }
            throw th;
        }
    }

    @Override // vp.i
    public final /* bridge */ /* synthetic */ vp.i e(n nVar) {
        h((i) nVar);
        return this;
    }

    public final i f() {
        i iVar = new i(this);
        int i7 = this.f20458e;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        iVar.f20471i = this.f20459i;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        iVar.f20472v = this.f20460v;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        iVar.f20473w = this.f20461w;
        if ((i7 & 8) == 8) {
            i10 |= 8;
        }
        iVar.f20474x = this.f20462x;
        if ((i7 & 16) == 16) {
            this.f20463y = Collections.unmodifiableList(this.f20463y);
            this.f20458e &= -17;
        }
        iVar.f20475y = this.f20463y;
        if ((this.f20458e & 32) == 32) {
            this.E = Collections.unmodifiableList(this.E);
            this.f20458e &= -33;
        }
        iVar.F = this.E;
        iVar.f20470e = i10;
        return iVar;
    }

    public final void h(i iVar) {
        if (iVar == i.J) {
            return;
        }
        int i7 = iVar.f20470e;
        if ((i7 & 1) == 1) {
            int i10 = iVar.f20471i;
            this.f20458e = 1 | this.f20458e;
            this.f20459i = i10;
        }
        if ((i7 & 2) == 2) {
            int i11 = iVar.f20472v;
            this.f20458e = 2 | this.f20458e;
            this.f20460v = i11;
        }
        if ((i7 & 4) == 4) {
            this.f20458e |= 4;
            this.f20461w = iVar.f20473w;
        }
        if ((i7 & 8) == 8) {
            h hVar = iVar.f20474x;
            hVar.getClass();
            this.f20458e = 8 | this.f20458e;
            this.f20462x = hVar;
        }
        if (!iVar.f20475y.isEmpty()) {
            if (this.f20463y.isEmpty()) {
                this.f20463y = iVar.f20475y;
                this.f20458e &= -17;
            } else {
                if ((this.f20458e & 16) != 16) {
                    this.f20463y = new ArrayList(this.f20463y);
                    this.f20458e |= 16;
                }
                this.f20463y.addAll(iVar.f20475y);
            }
        }
        if (!iVar.F.isEmpty()) {
            if (this.E.isEmpty()) {
                this.E = iVar.F;
                this.f20458e &= -33;
            } else {
                if ((this.f20458e & 32) != 32) {
                    this.E = new ArrayList(this.E);
                    this.f20458e |= 32;
                }
                this.E.addAll(iVar.F);
            }
        }
        this.f21889d = this.f21889d.b(iVar.f20469d);
    }
}
