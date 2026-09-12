package pp;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 extends vp.j {
    public s0 E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public s0 K;
    public int L;
    public s0 M;
    public int N;
    public int O;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18423v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f18424w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f18425x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18426y;

    public static r0 h() {
        r0 r0Var = new r0();
        r0Var.f18424w = Collections.EMPTY_LIST;
        s0 s0Var = s0.Q;
        r0Var.E = s0Var;
        r0Var.K = s0Var;
        r0Var.M = s0Var;
        return r0Var;
    }

    @Override // vp.i
    public final vp.a c() {
        s0 s0VarG = g();
        if (s0VarG.b()) {
            return s0VarG;
        }
        throw new androidx.datastore.preferences.protobuf.d1();
    }

    public final Object clone() {
        r0 r0VarH = h();
        r0VarH.j(g());
        return r0VarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // vp.i
    public final vp.i d(vp.e eVar, vp.g gVar) throws Throwable {
        s0 s0Var = null;
        try {
            try {
                s0.R.getClass();
                j(new s0(eVar, gVar));
                return this;
            } catch (vp.q e10) {
                s0 s0Var2 = (s0) e10.f21916d;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    s0Var = s0Var2;
                    if (s0Var != null) {
                        j(s0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (s0Var != null) {
                j(s0Var);
            }
            throw th;
        }
    }

    @Override // vp.i
    public final /* bridge */ /* synthetic */ vp.i e(vp.n nVar) {
        j((s0) nVar);
        return this;
    }

    public final s0 g() {
        s0 s0Var = new s0(this);
        int i7 = this.f18423v;
        if ((i7 & 1) == 1) {
            this.f18424w = Collections.unmodifiableList(this.f18424w);
            this.f18423v &= -2;
        }
        s0Var.f18434v = this.f18424w;
        int i10 = (i7 & 2) != 2 ? 0 : 1;
        s0Var.f18435w = this.f18425x;
        if ((i7 & 4) == 4) {
            i10 |= 2;
        }
        s0Var.f18436x = this.f18426y;
        if ((i7 & 8) == 8) {
            i10 |= 4;
        }
        s0Var.f18437y = this.E;
        if ((i7 & 16) == 16) {
            i10 |= 8;
        }
        s0Var.E = this.F;
        if ((i7 & 32) == 32) {
            i10 |= 16;
        }
        s0Var.F = this.G;
        if ((i7 & 64) == 64) {
            i10 |= 32;
        }
        s0Var.G = this.H;
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            i10 |= 64;
        }
        s0Var.H = this.I;
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        s0Var.I = this.J;
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        }
        s0Var.J = this.K;
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
            i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        }
        s0Var.K = this.L;
        if ((i7 & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048) {
            i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        s0Var.L = this.M;
        if ((i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
            i10 |= RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        s0Var.M = this.N;
        if ((i7 & 8192) == 8192) {
            i10 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        }
        s0Var.N = this.O;
        s0Var.f18433i = i10;
        return s0Var;
    }

    public final r0 j(s0 s0Var) {
        s0 s0Var2;
        s0 s0Var3;
        s0 s0Var4;
        s0 s0Var5 = s0.Q;
        if (s0Var == s0Var5) {
            return this;
        }
        if (!s0Var.f18434v.isEmpty()) {
            if (this.f18424w.isEmpty()) {
                this.f18424w = s0Var.f18434v;
                this.f18423v &= -2;
            } else {
                if ((this.f18423v & 1) != 1) {
                    this.f18424w = new ArrayList(this.f18424w);
                    this.f18423v |= 1;
                }
                this.f18424w.addAll(s0Var.f18434v);
            }
        }
        int i7 = s0Var.f18433i;
        if ((i7 & 1) == 1) {
            boolean z5 = s0Var.f18435w;
            this.f18423v |= 2;
            this.f18425x = z5;
        }
        if ((i7 & 2) == 2) {
            int i10 = s0Var.f18436x;
            this.f18423v |= 4;
            this.f18426y = i10;
        }
        if ((i7 & 4) == 4) {
            s0 s0Var6 = s0Var.f18437y;
            if ((this.f18423v & 8) != 8 || (s0Var4 = this.E) == s0Var5) {
                this.E = s0Var6;
            } else {
                r0 r0VarQ = s0.q(s0Var4);
                r0VarQ.j(s0Var6);
                this.E = r0VarQ.g();
            }
            this.f18423v |= 8;
        }
        int i11 = s0Var.f18433i;
        if ((i11 & 8) == 8) {
            int i12 = s0Var.E;
            this.f18423v |= 16;
            this.F = i12;
        }
        if ((i11 & 16) == 16) {
            int i13 = s0Var.F;
            this.f18423v |= 32;
            this.G = i13;
        }
        if ((i11 & 32) == 32) {
            int i14 = s0Var.G;
            this.f18423v |= 64;
            this.H = i14;
        }
        if ((i11 & 64) == 64) {
            int i15 = s0Var.H;
            this.f18423v |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            this.I = i15;
        }
        if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            int i16 = s0Var.I;
            this.f18423v |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            this.J = i16;
        }
        if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            s0 s0Var7 = s0Var.J;
            if ((this.f18423v & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 512 || (s0Var3 = this.K) == s0Var5) {
                this.K = s0Var7;
            } else {
                r0 r0VarQ2 = s0.q(s0Var3);
                r0VarQ2.j(s0Var7);
                this.K = r0VarQ2.g();
            }
            this.f18423v |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        }
        int i17 = s0Var.f18433i;
        if ((i17 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            int i18 = s0Var.K;
            this.f18423v |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
            this.L = i18;
        }
        if ((i17 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
            s0 s0Var8 = s0Var.L;
            if ((this.f18423v & RecyclerView.ItemAnimator.FLAG_MOVED) != 2048 || (s0Var2 = this.M) == s0Var5) {
                this.M = s0Var8;
            } else {
                r0 r0VarQ3 = s0.q(s0Var2);
                r0VarQ3.j(s0Var8);
                this.M = r0VarQ3.g();
            }
            this.f18423v |= RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        int i19 = s0Var.f18433i;
        if ((i19 & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048) {
            int i20 = s0Var.M;
            this.f18423v |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
            this.N = i20;
        }
        if ((i19 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
            int i21 = s0Var.N;
            this.f18423v |= 8192;
            this.O = i21;
        }
        f(s0Var);
        this.f21889d = this.f21889d.b(s0Var.f18432e);
        return this;
    }
}
