package zc;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import io.sentry.w5;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements pc.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f23906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public sc.b f23907i;
    public pc.m j;
    public boolean k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je.b0 f23899a = new je.b0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final je.w f23901c = new je.w(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f23900b = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f23902d = new w(0);

    /* JADX WARN: Code duplicated, block: B:110:0x022f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // pc.k
    public final int d(pc.l lVar, pc.n nVar) throws EOFException, InterruptedIOException {
        long j;
        ?? r5;
        h jVar;
        long j5;
        je.b.l(this.j);
        long j7 = ((pc.h) lVar).f17894i;
        long j10 = -9223372036854775807L;
        w wVar = this.f23902d;
        if (j7 != -1) {
            j = 0;
            if (!wVar.f23886d) {
                je.b0 b0Var = wVar.f23884b;
                je.w wVar2 = wVar.f23885c;
                if (!wVar.f23888f) {
                    pc.h hVar = (pc.h) lVar;
                    long j11 = hVar.f17894i;
                    int iMin = (int) Math.min(20000L, j11);
                    long j12 = j11 - ((long) iMin);
                    if (hVar.f17895v != j12) {
                        nVar.f17905a = j12;
                        return 1;
                    }
                    wVar2.C(iMin);
                    hVar.f17897x = 0;
                    hVar.g(wVar2.f13860a, 0, iMin, false);
                    int i7 = wVar2.f13861b;
                    for (int i10 = wVar2.f13862c - 4; i10 >= i7; i10--) {
                        if (w.b(wVar2.f13860a, i10) == 442) {
                            wVar2.F(i10 + 4);
                            long jC = w.c(wVar2);
                            if (jC != -9223372036854775807L) {
                                j10 = jC;
                                break;
                            }
                        }
                    }
                    wVar.f23890h = j10;
                    wVar.f23888f = true;
                    return 0;
                }
                if (wVar.f23890h == -9223372036854775807L) {
                    wVar.a(lVar);
                    return 0;
                }
                if (wVar.f23887e) {
                    long j13 = wVar.f23889g;
                    if (j13 == -9223372036854775807L) {
                        wVar.a(lVar);
                        return 0;
                    }
                    long jB = b0Var.b(wVar.f23890h) - b0Var.b(j13);
                    wVar.f23891i = jB;
                    if (jB < 0) {
                        je.b.N("PsDurationReader", "Invalid duration: " + wVar.f23891i + ". Using TIME_UNSET instead.");
                        wVar.f23891i = -9223372036854775807L;
                    }
                    wVar.a(lVar);
                    return 0;
                }
                pc.h hVar2 = (pc.h) lVar;
                int iMin2 = (int) Math.min(20000L, hVar2.f17894i);
                long j14 = 0;
                if (hVar2.f17895v != j14) {
                    nVar.f17905a = j14;
                    return 1;
                }
                wVar2.C(iMin2);
                hVar2.f17897x = 0;
                hVar2.g(wVar2.f13860a, 0, iMin2, false);
                int i11 = wVar2.f13862c;
                for (int i12 = wVar2.f13861b; i12 < i11 - 3; i12++) {
                    if (w.b(wVar2.f13860a, i12) == 442) {
                        wVar2.F(i12 + 4);
                        long jC2 = w.c(wVar2);
                        if (jC2 != -9223372036854775807L) {
                            j5 = jC2;
                            wVar.f23889g = j5;
                            wVar.f23887e = true;
                            return 0;
                        }
                    }
                }
                j5 = -9223372036854775807L;
                wVar.f23889g = j5;
                wVar.f23887e = true;
                return 0;
            }
        } else {
            j = 0;
        }
        if (this.k) {
            r5 = 0;
        } else {
            this.k = true;
            long j15 = wVar.f23891i;
            if (j15 != -9223372036854775807L) {
                r5 = 0;
                sc.b bVar = new sc.b(new i8.b(14), new e4.c(wVar.f23884b), j15, j15 + 1, 0L, j7, 188L, 1000);
                this.f23907i = bVar;
                this.j.c((pc.a) bVar.f17883c);
            } else {
                r5 = 0;
                this.j.c(new pc.o(j15));
            }
        }
        sc.b bVar2 = this.f23907i;
        if (bVar2 != null && ((pc.b) bVar2.f17885e) != null) {
            return bVar2.v(lVar, nVar);
        }
        pc.h hVar3 = (pc.h) lVar;
        hVar3.f17897x = r5;
        long jM = j7 != -1 ? j7 - hVar3.m() : -1L;
        if (jM != -1 && jM < 4) {
            return -1;
        }
        je.w wVar3 = this.f23901c;
        if (!hVar3.g(wVar3.f13860a, r5, 4, true)) {
            return -1;
        }
        wVar3.F(r5);
        int iG = wVar3.g();
        if (iG == 441) {
            return -1;
        }
        if (iG == 442) {
            hVar3.g(wVar3.f13860a, r5, 10, r5);
            wVar3.F(9);
            hVar3.u((wVar3.u() & 7) + 14);
            return r5;
        }
        if (iG == 443) {
            hVar3.g(wVar3.f13860a, r5, 2, r5);
            wVar3.F(r5);
            hVar3.u(wVar3.z() + 6);
            return r5;
        }
        if (((iG & (-256)) >> 8) != 1) {
            hVar3.u(1);
            return r5;
        }
        int i13 = iG & 255;
        SparseArray sparseArray = this.f23900b;
        x xVar = (x) sparseArray.get(i13);
        if (!this.f23903e) {
            if (xVar == null) {
                h hVar4 = null;
                if (i13 == 189) {
                    jVar = new b(null, 0);
                    this.f23904f = true;
                    this.f23906h = hVar3.f17895v;
                } else if ((iG & 224) == 192) {
                    jVar = new t(null);
                    this.f23904f = true;
                    this.f23906h = hVar3.f17895v;
                } else if ((iG & 240) == 224) {
                    jVar = new j(null);
                    this.f23905g = true;
                    this.f23906h = hVar3.f17895v;
                } else if (hVar4 != null) {
                    hVar4.e(this.j, new d0(i13, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER));
                    xVar = new x(hVar4, this.f23899a);
                    sparseArray.put(i13, xVar);
                }
                hVar4 = jVar;
                if (hVar4 != null) {
                    hVar4.e(this.j, new d0(i13, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER));
                    xVar = new x(hVar4, this.f23899a);
                    sparseArray.put(i13, xVar);
                }
            }
            if (hVar3.f17895v > ((this.f23904f && this.f23905g) ? this.f23906h + 8192 : w5.MAX_EVENT_SIZE_BYTES)) {
                this.f23903e = true;
                this.j.q();
            }
        }
        hVar3.g(wVar3.f13860a, r5, 2, r5);
        wVar3.F(r5);
        int iZ = wVar3.z() + 6;
        if (xVar == null) {
            hVar3.u(iZ);
            return r5;
        }
        wVar3.C(iZ);
        hVar3.a(wVar3.f13860a, r5, iZ, r5);
        wVar3.F(6);
        h hVar5 = xVar.f23892a;
        je.v vVar = xVar.f23894c;
        wVar3.e(vVar.f13853b, r5, 3);
        vVar.p(r5);
        vVar.s(8);
        xVar.f23895d = vVar.h();
        xVar.f23896e = vVar.h();
        vVar.s(6);
        wVar3.e(vVar.f13853b, r5, vVar.i(8));
        vVar.p(r5);
        je.b0 b0Var2 = xVar.f23893b;
        xVar.f23898g = 0L;
        if (xVar.f23895d) {
            vVar.s(4);
            long jI = ((long) vVar.i(3)) << 30;
            vVar.s(1);
            long jI2 = jI | ((long) (vVar.i(15) << 15));
            vVar.s(1);
            long jI3 = jI2 | ((long) vVar.i(15));
            vVar.s(1);
            if (!xVar.f23897f && xVar.f23896e) {
                vVar.s(4);
                long jI4 = ((long) vVar.i(3)) << 30;
                vVar.s(1);
                long jI5 = jI4 | ((long) (vVar.i(15) << 15));
                vVar.s(1);
                long jI6 = ((long) vVar.i(15)) | jI5;
                vVar.s(1);
                b0Var2.b(jI6);
                xVar.f23897f = true;
            }
            xVar.f23898g = b0Var2.b(jI3);
        }
        hVar5.f(4, xVar.f23898g);
        hVar5.c(wVar3);
        hVar5.d();
        wVar3.E(wVar3.f13860a.length);
        return r5;
    }

    @Override // pc.k
    public final void e(pc.m mVar) {
        this.j = mVar;
    }

    @Override // pc.k
    public final boolean f(pc.l lVar) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        pc.h hVar = (pc.h) lVar;
        hVar.g(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            hVar.b(bArr[13] & 7, false);
            hVar.g(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // pc.k
    public final void g(long j, long j5) {
        long j7;
        SparseArray sparseArray = this.f23900b;
        je.b0 b0Var = this.f23899a;
        synchronized (b0Var) {
            j7 = b0Var.f13768b;
        }
        boolean z5 = j7 == -9223372036854775807L;
        if (!z5) {
            long jC = b0Var.c();
            z5 = (jC == -9223372036854775807L || jC == 0 || jC == j5) ? false : true;
        }
        if (z5) {
            b0Var.e(j5);
        }
        sc.b bVar = this.f23907i;
        if (bVar != null) {
            bVar.C(j5);
        }
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            x xVar = (x) sparseArray.valueAt(i7);
            xVar.f23897f = false;
            xVar.f23892a.a();
        }
    }

    @Override // pc.k
    public final void release() {
    }
}
