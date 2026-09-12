package pp;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends vp.i implements vp.u {
    public int E;
    public int F;
    public h G;
    public List H;
    public int I;
    public int J;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18223e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f18224i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f18225v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f18226w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public double f18227x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18228y;

    public static c g() {
        c cVar = new c();
        cVar.f18224i = d.BYTE;
        cVar.G = h.f18301y;
        cVar.H = Collections.EMPTY_LIST;
        return cVar;
    }

    @Override // vp.i
    public final vp.a c() {
        e eVarF = f();
        if (eVarF.b()) {
            return eVarF;
        }
        throw new androidx.datastore.preferences.protobuf.d1();
    }

    public final Object clone() {
        c cVarG = g();
        cVarG.h(f());
        return cVarG;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // vp.i
    public final vp.i d(vp.e eVar, vp.g gVar) throws Throwable {
        e eVar2 = null;
        try {
            try {
                e.N.getClass();
                h(new e(eVar, gVar));
                return this;
            } catch (vp.q e10) {
                e eVar3 = (e) e10.f21916d;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    eVar2 = eVar3;
                    if (eVar2 != null) {
                        h(eVar2);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (eVar2 != null) {
                h(eVar2);
            }
            throw th;
        }
    }

    @Override // vp.i
    public final /* bridge */ /* synthetic */ vp.i e(vp.n nVar) {
        h((e) nVar);
        return this;
    }

    public final e f() {
        e eVar = new e(this);
        int i7 = this.f18223e;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        eVar.f18254i = this.f18224i;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        eVar.f18255v = this.f18225v;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        eVar.f18256w = this.f18226w;
        if ((i7 & 8) == 8) {
            i10 |= 8;
        }
        eVar.f18257x = this.f18227x;
        if ((i7 & 16) == 16) {
            i10 |= 16;
        }
        eVar.f18258y = this.f18228y;
        if ((i7 & 32) == 32) {
            i10 |= 32;
        }
        eVar.E = this.E;
        if ((i7 & 64) == 64) {
            i10 |= 64;
        }
        eVar.F = this.F;
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        eVar.G = this.G;
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            this.H = Collections.unmodifiableList(this.H);
            this.f18223e &= -257;
        }
        eVar.H = this.H;
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        }
        eVar.I = this.I;
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
            i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        }
        eVar.J = this.J;
        eVar.f18253e = i10;
        return eVar;
    }

    public final void h(e eVar) {
        h hVar;
        if (eVar == e.M) {
            return;
        }
        if ((eVar.f18253e & 1) == 1) {
            d dVar = eVar.f18254i;
            dVar.getClass();
            this.f18223e = 1 | this.f18223e;
            this.f18224i = dVar;
        }
        int i7 = eVar.f18253e;
        if ((i7 & 2) == 2) {
            long j = eVar.f18255v;
            this.f18223e |= 2;
            this.f18225v = j;
        }
        if ((i7 & 4) == 4) {
            float f2 = eVar.f18256w;
            this.f18223e = 4 | this.f18223e;
            this.f18226w = f2;
        }
        if ((i7 & 8) == 8) {
            double d6 = eVar.f18257x;
            this.f18223e |= 8;
            this.f18227x = d6;
        }
        if ((i7 & 16) == 16) {
            int i10 = eVar.f18258y;
            this.f18223e = 16 | this.f18223e;
            this.f18228y = i10;
        }
        if ((i7 & 32) == 32) {
            int i11 = eVar.E;
            this.f18223e = 32 | this.f18223e;
            this.E = i11;
        }
        if ((i7 & 64) == 64) {
            int i12 = eVar.F;
            this.f18223e = 64 | this.f18223e;
            this.F = i12;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            h hVar2 = eVar.G;
            if ((this.f18223e & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 128 || (hVar = this.G) == h.f18301y) {
                this.G = hVar2;
            } else {
                g gVar = new g(0);
                gVar.f18291v = Collections.EMPTY_LIST;
                gVar.j(hVar);
                gVar.j(hVar2);
                this.G = gVar.f();
            }
            this.f18223e |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (!eVar.H.isEmpty()) {
            if (this.H.isEmpty()) {
                this.H = eVar.H;
                this.f18223e &= -257;
            } else {
                if ((this.f18223e & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 256) {
                    this.H = new ArrayList(this.H);
                    this.f18223e |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                }
                this.H.addAll(eVar.H);
            }
        }
        int i13 = eVar.f18253e;
        if ((i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            int i14 = eVar.I;
            this.f18223e |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            this.I = i14;
        }
        if ((i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            int i15 = eVar.J;
            this.f18223e |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
            this.J = i15;
        }
        this.f21889d = this.f21889d.b(eVar.f18252d);
    }
}
